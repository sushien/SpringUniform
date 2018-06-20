package com.uniform.impl;
import com.uniform.model.*;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class Main {  
public static void main(String[] args) {  
      
    //creating configuration object  
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating seession factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    UniformData e1=new UniformData();  
    e1.setId(11);  
    e1.setSchool_Name("oxford");  
    e1.setStudent_Name("jaiswal");  
    e1.setUniform_Id(12);
      
    session.persist(e1);//persisting the object  
      
    t.commit();//transaction is committed  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}  
