/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author PaulSalvagniac
 */
public class TitreBoursierData {
    
    private String mnemonique;
    private String nom;
    private String coursTitre;
    private String variation; 


    public TitreBoursierData(String mnemonique, String nom, String coursTitre, String variation) {
        this.mnemonique = mnemonique;
        this.nom = nom;
        this.coursTitre = coursTitre;
        this.variation = variation;
    }

    public String getMnemonique() {
        return mnemonique;
    }

    public void setMnemonique(String mnemonique) {
        this.mnemonique = mnemonique;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCoursTitre() {
        return coursTitre;
    }

    public void setCoursTitre(String coursTitre) {
        this.coursTitre = coursTitre;
    }

    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }
    
    
}
