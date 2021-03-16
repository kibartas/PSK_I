package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.mybatis.model.Library;
import lt.vu.mybatis.dao.LibraryMapper;
import lt.vu.mybatis.dao.TeamMapper;
import lt.vu.mybatis.model.Team;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class LibrariesMyBatis {
    @Inject
    private LibraryMapper libraryMapper;

    @Getter
    private List<Library> allLibraries;

    @Getter @Setter
    private Library libraryToCreate = new Library();

    @PostConstruct
    public void init() {
        this.loadAllLibraries();
    }

    private void loadAllLibraries() {
        this.allLibraries = libraryMapper.selectAll();
    }

    @Transactional
    public void createLibrary() {
        libraryMapper.insert(libraryToCreate);
    }
}
