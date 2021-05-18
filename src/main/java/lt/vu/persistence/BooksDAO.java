package lt.vu.persistence;

import lt.vu.entities.Book;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@ApplicationScoped
public class BooksDAO {
        @Inject
        private EntityManager em;

        public Book findOne(int id) {
                return em.find(Book.class, id);
        }

        public int getBookCount() {
                return em.createNamedQuery("Book.getCount", Book.class).getFirstResult();
        }

        public List<Book> findAll() {
                return em.createNamedQuery("Book.findAll", Book.class)
                        .getResultList();
        }
}
