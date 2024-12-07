package com.klef.JFSD_HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowPrintStacktrace;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     try {
        System.out.println( "Hello Student" );
        
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tnx = s.beginTransaction();
        
        Student sd1 = new Student();
        sd1.setsid(6);
        sd1.setsname("Geethika");
        sd1.setsgender("Female");
        sd1.setsdepartment("CSE");
        sd1.setsprogram("B.TECH");
        sd1.setsdateOfBirth("08/06/2005");
        sd1.setscontactNumber("1234567890");
        sd1.setsgraduationStatus("3rd year");
        sd1.setscgpa(8.9);
        sd1.setsnumberOfBacklogs(0);
        
       
        
        System.out.println("Data inserted");
        
		s.save(sd1);
        
        tnx.commit();
        
      
        
    }catch(Exception e) {
     e.printStackTrace();
    }
 }
}
