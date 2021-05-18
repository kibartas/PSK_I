package lt.vu.persistence;

import lt.vu.entities.Library;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class LibrariesDAO {

    @Inject
    private EntityManager em;

    public List<Library> loadAll() {
        return em.createNamedQuery("Library.findAll", Library.class).getResultList();
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void persist(Library library){
        this.em.persist(library);
    }

    public Library findOne(Integer id) {
        return em.find(Library.class, id);
    }

    public List<Library> findByAddress(String address) {
        return em.createNamedQuery("Library.findByAddress", Library.class)
                .setParameter("address", '%' + address + '%')
                .getResultList();
    }
}
