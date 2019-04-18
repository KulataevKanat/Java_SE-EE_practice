package kg.itacademy.service;

import kg.itacademy.dao.CategoriesDao;
import kg.itacademy.dao.UserDao;
import kg.itacademy.model.Categories;
import kg.itacademy.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/categories")
public class CategoryService {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Categories> getCategories_JSON() {
        System.out.println("We are here");
        List<Categories> listOfCategories = CategoriesDao.getAllCategories();
        return listOfCategories;
    }

    @GET
    @Path("/{categoriesId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Categories getCategories(@PathParam("categoriesId") Integer categoriesId,
                                    @HeaderParam("user-key") String userAgent,
                                    @HeaderParam("password-key") String pwdAgent) {

        if (UserDao.auth(userAgent,pwdAgent)){
            return null;
        }

        System.out.println(userAgent);
      //  System.out.println(pwdAgent);

        return CategoriesDao.getCategories(categoriesId);
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Categories addCategories(Categories categories) {
        return CategoriesDao.addCategories(categories);
    }

    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Categories updateCategories(Categories categories) {
        return CategoriesDao.updateCategories(categories);
    }

    @DELETE
    @Path("/{categoriesId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteCategories(@PathParam("categoriesId") Integer categoriesId) {
        CategoriesDao.deleteCategories(categoriesId);
    }

}
