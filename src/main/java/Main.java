import Controllers.*;
import Entities.Equipo;
import Menu.Menus;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("futinfo");
            EntityManager entityManager = factory.createEntityManager();

            entityManager.getTransaction().begin();

            Equipo equipo = new Equipo();
            equipo.setNombre("FC Barcelona");
            equipo.setLiga("Liga Santander(ESP)");
            equipo.setIdEquipo(2);

            entityManager.persist(equipo);

            entityManager.getTransaction().commit();

            entityManager.close();
            factory.close();
        }
    }

