package org.uv;

//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
/**
 *
 * @author citla
 */
public class HibernateUtil {
    //    private static Session session;
//    private static SessionFactory sessionFactory;
//    
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
//    
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
