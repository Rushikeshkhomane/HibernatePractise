package com.Test;

import com.pojo.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class EmployeeTest
{
    public static void main( String[] args )
    {

        // type 1
        //StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        //MetadataSources sources = new MetadataSources(registry);
        //Metadata metadata = sources.getMetadataBuilder().build();
        //SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        // type 2
        Configuration cfg= new Configuration();
        cfg.configure();
        SessionFactory sf= cfg.buildSessionFactory();
        Session session = sf.openSession();

        //Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();
        Employee employee1=new Employee(102,"Navnath Jadhav","Karhati","nj@gmail.com","Quality Management"
                ,"Sr.Automation Test Engineer",55000,"9763578363");

        session.save(employee1);
        t.commit();





    }
}
