package lt.vu.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "BOOK")
@NamedQueries({
    @NamedQuery(name = "Book.getCount", query = "select count(ALL id) from Book"),
        @NamedQuery(name = "Book.findAll", query = "select t from Book as t")
})
@Getter @Setter
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="TITLE")
    private String title;

    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID")
    private Author author;

    @ManyToMany
    @JoinTable(name="BOOK_LIBRARIES")
    private Set<Library> libraries;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "PAGE_COUNT")
    private Integer pageCount;
}
