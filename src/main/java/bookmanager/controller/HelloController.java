package bookmanager.controller;

import bookmanager.model.BooksEntity;
import bookmanager.model.HibernateSessionFactory;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping (method = RequestMethod.GET)
    public String main() {

        System.out.println("Begin Hibernate");

        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {

            session.beginTransaction();

            BooksEntity newBook = new BooksEntity();
            newBook.setAuthor("Bulgakov");

            session.save(newBook);
            session.getTransaction().commit();
        }

        HibernateSessionFactory.shutdownSessionFactory();

        System.out.println("End Hibernate");



        return "index";
    }
}
