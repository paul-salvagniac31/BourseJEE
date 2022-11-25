/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.TitreBoursierData;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author PaulSalvagniac
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "FILEOperationTitre")
    ,
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class TitreBoursierMDB implements MessageListener {

    @EJB
    private TitreBoursierBDLocal titreBoursierBD;
    

    public TitreBoursierMDB() {
    }
    
    public void onMessage(Message message) {
        if (message instanceof TextMessage) {
            TextMessage text = (TextMessage) message;
            try {
                this.titreBoursierBD.add(new TitreBoursierData("AAPL", "Apple Inc.", "2.0", "+10%"));
                System.out.println("Received: " + text.getText());
            } catch (JMSException exception) {
                System.err.println("Failed to get message text: " + exception);
            }
        }
    }
    
}
