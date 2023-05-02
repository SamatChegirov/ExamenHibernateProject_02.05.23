package org.example.configuration;

import jakarta.persistence.EntityManager;
import org.example.entity.Courses;
import org.example.entity.Students;
import org.hibernate.cfg.Configuration;

import static org.hibernate.cfg.AvailableSettings.*;

public class HibernateConfig {
    public static EntityManager getEntityManager() {
        Configuration configuration = new Configuration();
        configuration.setProperty(DRIVER, "org.postgresql.Driver");
        configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/postgres");
        configuration.setProperty(USER, "postgres");
        configuration.setProperty(PASS, "3478");
        configuration.setProperty(HBM2DDL_AUTO, "update");
        configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        configuration.setProperty(SHOW_SQL, "true");


        configuration.addAnnotatedClass(Courses.class);
        configuration.addAnnotatedClass(Students.class);


        return configuration.buildSessionFactory().createEntityManager();





    }
}
