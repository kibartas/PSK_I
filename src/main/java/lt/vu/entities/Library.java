package lt.vu.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "LIBRARY")
@NamedQueries({
        @NamedQuery(name = "Library.findAll", query = "select t from Library as t"),
        @NamedQuery(name = "Library.findByAddress", query = "select t from Library as t where t.address like :address")
})
@Getter @Setter
public class Library implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ADDRESS")
    private String address;

    @ManyToMany(mappedBy = "libraries")
    private Set<User> users;

    public Library(){}
}
