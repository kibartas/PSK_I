package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Library;
import lt.vu.persistence.LibrariesDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class Libraries {

    @Inject
    private LibrariesDAO librariesDAO;

    @Getter
    @Setter
    private Library libraryToCreate = new Library();

    @Getter
    private List<Library> queriedLibraries;

    @Getter
    @Setter
    private String queriedAddress;

    @Getter
    private List<Library> allLibraries;

    @PostConstruct
    public void init(){
        loadAllLibraries();
    }

    @Transactional
    public String createLibrary() {
        this.librariesDAO.persist(libraryToCreate);
        return "index?faces-redirect=true";
    }

    private void loadAllLibraries(){
        this.allLibraries = librariesDAO.loadAll();
    }

    public void findLibrary() {
        this.queriedLibraries = this.librariesDAO.findByAddress(queriedAddress);
    }
}
