package org.uv;

//import org.apache.log4j.Logger;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author citla
 */
public class Principal {
    
    public static void main(String args[]) {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();       
//        Empleados empleado = new Empleados(6,"Ana","Orizaba","456");
//        empleado.setClave(6);
//        empleado.setNombre("Ema");
//        empleado.setDireccion("Orizaba");
//        empleado.setTelefono("456");
//        session.save(empleado);
//        session.update(empleado);
//        Empleados empleado =(Empleados)session.get(empleado.class, 1);
//        System.out.println("Se guardo...");
//        session.getTransaction().commit();
//        session.close();
        Empleados empleado = new Empleados();
        empleado.setClave(7);
        empleado.setNombre("Daniel");
        empleado.setDireccion("Orizaba");
        empleado.setTelefono("456");
        
        HibernateUtil.add(empleado);
        System.out.println("end");
//        System.out.println(HibernateUtil.get(1).toString());
    }
}
