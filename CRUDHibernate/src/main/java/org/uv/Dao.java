package org.uv;

//import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author citla
 */
public class Dao {
    static Session session;
    static SessionFactory sessionFactory;
 
//    public final static Logger logger = Logger.getLogger(Dao.class);
 
//    private static SessionFactory buildSessionFactory() {
//        
//        Configuration configObj = new Configuration();
//        configObj.configure("Hibernate.cfg.xml");
// 
//        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 
//
//        sessionFactory = configObj.buildSessionFactory(serviceRegistryObj);
//        return sessionFactory;
//    }
    
    public static void createRecord(){
//        int con = 0;
//        Empleados empleado = null;
//        try{
//            session = buildSessionFactory().openSession();
//            session.beginTransaction();
//            for (int i = 101; i < 105; i++) {
//                con = con + 1;
//                empleado = new Empleados();
//                empleado.setClave(4);
//                empleado.setNombre("Paola");
//                empleado.setDireccion("Cordoba");
//                empleado.setTelefono("123");
//                
//                session.save(empleado);
//            }
//            session.getTransaction().commit();
////            logger.info(con);
//        }catch(Exception e){
//            if (null != session.getTransaction()) {
////                logger.info("Rollback");
//                session.getTransaction().rollback();
//            }
//            e.printStackTrace();
//        }finally{
//            if(session != null) {
//                session.close();
//            }
//        }
    }
    

//    public static void createRecord(){
//        Empleados empleado = null;
//        try{
//            session = buildSessionFactory().openSession();
//            session.beginTransaction();
//            
//            empleado = new Empleados();
//            
//            session.save(empleado);
//
//            session.getTransaction().commit();
//        }catch(Exception sqlException){
//            if (null != session.getTransaction()) {
//                session.getTransaction().rollback();
//            }
//        }finally{
//            if(session != null) {
//                session.close();
//            }
//        }  
//    }
//    
//    public static void updateRecord(){
//    }
}
