/*

public class TestMain {
    public static void main(String[] args) {
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

    }
}*/
