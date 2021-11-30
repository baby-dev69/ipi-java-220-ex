package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Entreprise.primeAnnuelleBase());
        //Employe employe = new Employe();
       // Employe employe1 = new Employe("Doe", "John", "T12345", LocalDate.now(), 2500.0);
        try {
         //   employe1.augmenterSalaire(0.0);
        } catch (Exception e) {
            //
        }
       // System.out.println(employe1);


        Cadre unCadre = new Cadre("Kylian","Mbappe","123456",LocalDate.now(),1500.0, true,"masculin",12.0);

        //Test de la méthode toString
        System.out.println(unCadre.toString());

        System.out.println("-----------------------");

        //Test de la méthode getPrimeAnnuelle : (2021 / 2) * coefficient = !12126.0!
        System.out.println(unCadre.getPrimeAnnuelle());

        System.out.println("-----------------------");

        //Test de la méthode  getNbConges : Nb congés + coefficient = 25 + 12 = !37!
        System.out.println(unCadre.getNbConges());



    }
}
