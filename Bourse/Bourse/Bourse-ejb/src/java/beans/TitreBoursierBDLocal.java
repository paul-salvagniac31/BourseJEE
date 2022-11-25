/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.TitreBoursierData;
import javax.ejb.Local;

/**
 *
 * @author PaulSalvagniac
 */
@Local
public interface TitreBoursierBDLocal {
       public void add(TitreBoursierData data);
       public TitreBoursierData get(String mnemo);
       public String[] getListe();
       
}
