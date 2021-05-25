package lt.vu.restAPI;

import lt.vu.entities.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserController {
    @Inject
    private EntityManager em;

    @Path("/{userId}")
    @GET
    public User find(@PathParam("userId") Integer id) {
        return em.find(User.class, id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public User create(User user) {
        em.persist(user);
        return user;
    }

    @Path("/{userId}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(User user, @PathParam("userId") Integer id) {
        User _user = em.find(User.class, id);
        if (_user == null) {
            throw new IllegalArgumentException("user id " + id + " not found");
        }
        _user.setName(user.getName());
        _user.setSurname(user.getSurname());
        _user.setAddress(user.getAddress());
        _user.setDateOfBirth(user.getDateOfBirth());
        em.merge(_user);
        return Response.ok(_user).build();
    }


}
