package kg.itacademy.service;

import kg.itacademy.dao.ExpenseDao;
import kg.itacademy.dao.UserDao;
import kg.itacademy.model.Expense;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


@Path("/expenses")
public class ExpenseService {

    List<Expense> caRet = new ArrayList<>();

    @GET
    @Produces({MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML})
    public List<Expense> getExpenses(@HeaderParam("user-key") String userAgent,
                                     @HeaderParam("password-key") String pwdAgent) {
        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }

        return getExpenceByUser(userAgent, pwdAgent);
    }

    @GET
    @Path("/{expenceId}")
    @Produces({MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML})
    public Expense getCat(@PathParam("expenceId") Integer expenseId,
                          @HeaderParam("user-key") String userAgent,
                          @HeaderParam("password-key") String pwdAgent) {

        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }

        return ExpenseDao.getExpense(expenseId);
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML})
    public Expense addCat(Expense Expense,
                          @HeaderParam("user-key") String userAgent,
                          @HeaderParam("password-key") String pwdAgent) {
        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }
        return ExpenseDao.addCat(Expense);
    }

    @PUT
    @Produces({ MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML })
    public Expense updateCat(Expense Expense,
                             @HeaderParam("user-key") String userAgent,
                             @HeaderParam("password-key") String pwdAgent) {
        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }
        return ExpenseDao.updateExpense(Expense);
    }

    @DELETE
    @Path("/{expenceId}")
    @Produces({ MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML })
    public void deleteCat(@PathParam("expenceId") Integer expenceId,
                          @HeaderParam("user-key") String userAgent,
                          @HeaderParam("password-key") String pwdAgent) {

        if(UserDao.auth(userAgent, pwdAgent)){
            return ;
        }
        ExpenseDao.deleteExpense(expenceId);
    }

    /*@GET
    @Path("/cat/{expenceId}")
    @Produces({MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML})*/
    public List<Expense> getExpenceByUser(
            @HeaderParam("user-key") String userAgent,
            @HeaderParam("password-key") String pwdAgent) {

        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }

        List<Expense> expenseList = ExpenseDao.getAllExpenses();
        for(Expense c : expenseList){
            if(c.getUser().getLogin().equals(userAgent)) {
                //c.setUser(null);
                caRet.add(c);
            }
        }

        System.out.println(userAgent);
        return caRet;
    }

}
