/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.TitreBoursierData;
import java.util.HashMap;
import javax.ejb.Singleton;

/**
 *
 * @author PaulSalvagniac
 */
@Singleton
public class TitreBoursierBD implements TitreBoursierBDLocal {

   private HashMap<String,TitreBoursierData> bourse;
   
   public TitreBoursierBD() {
       this.bourse=new HashMap();
   }
   
   public void add(TitreBoursierData data) {
       this.bourse.put(data.getMnemonique(), data);
   }
   
      public TitreBoursierData get(String mnemo) {
       return this.bourse.get(mnemo);
   }
 
   public String[] getListe() {
       String[] retour = new String[1];
       return this.bourse.keySet().toArray(retour);
       
   }
      
}
