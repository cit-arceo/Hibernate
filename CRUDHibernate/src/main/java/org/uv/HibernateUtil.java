package org.uv;

import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
/**
 *
 * @author citla
 */
public final class HibernateUtil {
    
     private static SessionFactory sessionFactory;

    static {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        sessionFactory = cfg.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }

    public static void add(Object entity) {
        Session s = null;
        Transaction tx = null;
        try {
            s = HibernateUtil.getSession();
            tx = s.beginTransaction();
            s.save(entity);
            tx.commit();
        } finally {
            if (s != null)
                s.close();
        }
    }

    public static void Update(Object entity) {
        Session s = null;
        Transaction tx = null;
        try {
            s = HibernateUtil.getSession();
            tx = s.beginTransaction();
            s.update(entity);
            tx.commit();
        } finally {
            if (s != null)
                s.close();
        }
    }

    public static void delete(Object entity) {
        Session s = null;
        Transaction tx = null;
        try {
            s = HibernateUtil.getSession();
            tx = s.beginTransaction();
            s.delete(entity);
            tx.commit();
        } finally {
            if (s != null)
                s.close();
        }
    }

    public static Object get(Serializable id) {
        Session s = null;

        try {
            s = HibernateUtil.getSession();

            Object obj = s.get(Empleados.class, id);
            return obj;

        } finally {
            if (s != null)
                s.close();
        }
    }

    
//    private static Session session;
//    private static SessionFactory sessionFactory;
//        // metodo para crear el objeto de SessionFactory
//    private static SessionFactory buildSessionFactory() {
//        //Instancia de configuracion y pasar el archivo configuracion
//        Configuration configObj = new Configuration();
//        configObj.configure("hibernate.cfg.xml");
//        //servicios y registros 
//        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();
//        //creacion de una instancia hibernate SessionFactory
//        sessionFactory = configObj.buildSessionFactory(serviceRegistryObj);
//        return sessionFactory;
//    }
//	public static void main(String []args){
//		System.out.println(getSession());
//	}
//    public static SessionFactory getSessionFactory()  
//    {  
//        if (sessionFactory == null) sessionFactory = buildSessionFactory();  
//        return sessionFactory;  
//    }  
//    public static void shutdown()  
//    {  
//        //cerrar la conexion 
//        sessionFactory.close();  
//    }  
}
