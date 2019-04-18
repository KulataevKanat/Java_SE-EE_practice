package kg.itacademy.service;

import kg.itacademy.dao.UserDao;
import kg.itacademy.model.User;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/users")
public class UserService {

    // URI:
    // contextPath/servletPath/users
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<User> getUsers_JSON() {
        System.out.println("We are here");
        List<User> listOfUsers = UserDao.getAllUser();
        return listOfUsers;
    }

    // URI:
    // contextPath/servletPath/users/{userId}
    @GET
    @Path("/{userId}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public User getUser(@PathParam("userId") Integer UserId) {

        return UserDao.getUser(UserId);
    }

    // URI:
    // contextPath/servletPath/users
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public User addUser(User user) {

        return UserDao.addUser(user);
    }

    // URI:
    // contextPath/servletPath/users
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public User updateUser(User user) {

        return UserDao.updateUser(user);
    }

    @DELETE
    @Path("/{userId}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteUser(@PathParam("userId") Integer userId)
    {
        UserDao.deleteUser(userId);
    }

}