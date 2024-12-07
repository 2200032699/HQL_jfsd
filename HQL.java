package com.klef.JFSD_HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class HQL {

  private static final Class<Student> Student = null;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
     Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         
         SessionFactory sf = cfg.buildSessionFactory();
         Session s = sf.openSession();
         Transaction tnx = s.beginTransaction();
         
 //to display all records
         
        CriteriaBuilder cb = s.getCriteriaBuilder();
         CriteriaQuery<Student> cq=cb.createQuery(Student);
         Root<Student> root= cq.from(Student.class);
          
  //    cq.select(root);
      
   /*to display 3 to 5 records*/   
         
     //    cq.select(root).where(cb.between(root.<Integer>get("sid"), 3, 5)); 
         //2nd parameter from which record we want fetch //3rd para -upto which record 
      
     
    //  cq.select(root).where(cb.gt(root.get("cgpa"),7));
       
    cq.orderBy(cb.asc(root.get("sname")));
  
         
      
      Query q =s.createQuery(cq);
      List<Student> list = q.list();
      for(Student s1 : list) {
        System.out.println(s1);
        
      }
      
 
         
         tnx.commit();
         }

}























//to display students records with all columns

//Query q = s.createNamedQuery("from Student_data"); //here student_data is persistent class name 
//  
//  List<Student_data> li = q.list() ;
//  System.out.println(li);
//  
//  for(Student_data s1 : li) {
//    System.out.println(s1); 
//  }
  
  // Display all records
  
/*    Query q = s.createQuery("select id,student_name,CGPA  from Student_data s");
 List<Object[]> li = q.list();
  for(Object[] s1 : li) {
         System.out.println(s1[0] +":"+ s1[1] +":" +s1[2]); 
  }
  
  //3.names
Query q = s.createQuery("select sname from Student_data where cgpa > 7 ");
  
 List<Object[]> li = q.list();
  
        System.out.println(li); */
         
          
//4. HQL query to delete a Student whose Student ID is 30101 using input parameter (?) as well as named parameter (:)
  
//   Query q=s.createQuery("delete from Student_details where sid=:tempid");  
//   q.setParameter("tempid",5);        
//   int status=q.executeUpdate();  
//  
////5. HQL query to update few details of a student whose Student ID is 30102 using input parameter (?) as well as named parameter (:)  
//
//     Query q=s.createQuery("update Student_details set sname=:n where sid=:i");  
//     q.setParameter("n","Tulasi Sajja");  
//     q.setParameter("i",1);        
//     int status =q.executeUpdate();  
//     System.out.println(status);
//
////6. HQL query to perform aggregate functions like count (*), sum(), avg(), min(), max() functions on CGPA column.
//
//     Query q = s.createQuery("select max(cgpa) from Student_details");
//     List<Integer> list=q.list();  
//     System.out.println(list.get(0));
