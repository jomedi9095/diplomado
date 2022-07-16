package edu.umanizales.test;

import edu.umanizales.practicaclase.entidades.carroCompras;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.Test;

import static org.junit.Assert.*;

public class testJPA {

    @Test
    public void testCreacionBD(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("compras");
        EntityManager em = emf.createEntityManager();
        assertNotNull(em);
        em.close();
    }
}
