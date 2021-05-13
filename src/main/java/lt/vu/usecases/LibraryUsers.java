package lt.vu.usecases;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Library;
import lt.vu.entities.User;
import lt.vu.interceptors.LoggedInvocation;
import lt.vu.persistence.LibrariesDAO;
import lt.vu.persistence.UsersDAO;

@Model
public class LibraryUsers implements Serializable {

    @Inject
    private LibrariesDAO librariesDAO;

    @Inject
    private UsersDAO usersDAO;

    @Getter @Setter
    private Library library;

    @Getter @Setter
    private User userToCreate = new User();


    @PostConstruct
    public void init() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer libraryId = Integer.parseInt(requestParameters.get("libraryId"));
        this.library = librariesDAO.findOne(libraryId);
    }

    @Transactional
    @LoggedInvocation
    public void createUser() {
        HashSet<Library> libraries = new HashSet<Library>();
        libraries.add(library);
        userToCreate.setLibraries(libraries);
        usersDAO.persist(userToCreate);
    }

    @Transactional
    public void deleteUser(int id) {
        User user = usersDAO.findOne(id);
        usersDAO.delete(user);
    }
}
