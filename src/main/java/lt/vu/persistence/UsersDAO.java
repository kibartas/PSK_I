package lt.vu.persistence;

import lt.vu.UserFixer.UserFixer;
import lt.vu.UserFixer.UserNameFixer;
import lt.vu.entities.User;

import javax.decorator.Delegate;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class UsersDAO {

    @Inject
    private EntityManager em;

    @Inject
    UserNameFixer userNameFixer;

    public void flush() { em.flush(); }

    public void persist(User user) {
        userNameFixer.fixUserName(user);
        this.em.persist(user);
    }

    public User findOne(Integer id){
        return em.find(User.class, id);
    }

    @Transactional
    public User update(User user){
        userNameFixer.fixUserName(user);
        return em.merge(user);
    }

    @Transactional
    public void delete(User user) {
        em.createNativeQuery("DELETE FROM USER_LIBRARIES WHERE USERS_ID=" + user.getId()).executeUpdate();
        em.createNativeQuery("DELETE FROM USER WHERE ID=" + user.getId()).executeUpdate();
    }
}
