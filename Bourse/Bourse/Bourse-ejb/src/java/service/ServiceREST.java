/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.TitreBoursierBDLocal;
import entities.TitreBoursierData;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author PaulSalvagniac
 */
@Stateless
public class ServiceREST implements ServiceRESTLocal {

    @EJB
    private TitreBoursierBDLocal titreBoursierBD;

    public TitreBoursierData get(String mnemo) {
        return this.titreBoursierBD.get(mnemo);
    };
    
    public String[] getListe() {
       return this.titreBoursierBD.getListe();
    };
}
