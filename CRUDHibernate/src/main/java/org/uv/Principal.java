package org.uv;

//import org.apache.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author citla
 */
public class Principal {
    
    public static void main(String args[]) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        Empleados empleado = new Empleados();
        empleado.setClave(5);
        empleado.setNombre("Moka");
        empleado.setDireccion("Omealca");
        empleado.setTelefono("456");
        
        session.save(empleado);
        
        System.out.println("Se conecto...");
        
        session.getTransaction().commit();
        session.close();
    }
}
