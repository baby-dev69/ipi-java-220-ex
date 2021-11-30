package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class Cadre extends Employe{

    private Double coefficient = 1.0;

    public Cadre(){

    }

    public Cadre(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Boolean tempsPartiel, String sexe, Double coefficient){
            super(nom, prenom, matricule, dateEmbauche, salaire, tempsPartiel, sexe);
            this.coefficient = coefficient;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cadre cadre = (Cadre) o;
        return Objects.equals(coefficient, cadre.coefficient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coefficient);
    }



    @Override
    public String toString() {

        return "Cadre{" +
                super.toString() +
                "coefficient=" + coefficient +
                '}';
    }

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public Double getPrimeAnnuelle(){
        Double primeBase;
        LocalDate dateJour = LocalDate.now();
        Double year = (double) dateJour.getYear();
        primeBase = year / 2;
        double prime = primeBase * coefficient;
        return prime;
    }

    @Override
    public Integer getNbConges() {

        int coeff = (int) Math.round(coefficient);
        return super.getNbConges() + coeff;
        
    }
}
