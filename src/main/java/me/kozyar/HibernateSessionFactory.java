package me.kozyar;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import java.util.function.Consumer;

public class HibernateSessionFactory {
    private SessionFactory sessionFactory;

    public HibernateSessionFactory() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(City.class);
        configuration.addAnnotatedClass(Employee.class);
        this.sessionFactory = configuration.buildSessionFactory();
    }


}
