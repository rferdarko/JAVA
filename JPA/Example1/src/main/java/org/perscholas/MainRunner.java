package org.perscholas;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainRunner {
    public static void main ( String[] args ) {

    }

    EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "Jpa" );
    


}
