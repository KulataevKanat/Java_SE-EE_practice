package kg.itacademy.service;

import kg.itacademy.dao.WalletDao;
import kg.itacademy.dao.UserDao;
import kg.itacademy.model.Wallet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


@Path("/wallets")
public class WalletService {

    protected List<Wallet> caRet = new ArrayList<>();

    @GET
    @Produces({MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML})
    public List<Wallet> getCats_JSON(@HeaderParam("user-key") String userAgent,
                                     @HeaderParam("password-key") String pwdAgent) {
        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }

        return getWalByUser(userAgent, pwdAgent);
    }

    @GET
    @Path("/{WalletId}")
    @Produces({MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML})
    public Wallet getWal(@PathParam("WalletId") Integer WalletId,
                         @HeaderParam("user-key") String userAgent,
                         @HeaderParam("password-key") String pwdAgent) {

        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }

        return WalletDao.getWal(WalletId);
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML})
    public Wallet addCat(Wallet Wallet,
                         @HeaderParam("user-key") String userAgent,
                         @HeaderParam("password-key") String pwdAgent) {
        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }
        return WalletDao.addWal(Wallet);
    }

    @PUT
    @Produces({ MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML })
    public Wallet updateCat(Wallet Wallet,
                            @HeaderParam("user-key") String userAgent,
                            @HeaderParam("password-key") String pwdAgent) {
        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }
        return WalletDao.updateWallet(Wallet);
    }

    @DELETE
    @Path("/{WalletId}")
    @Produces({ MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML })
    public void deleteCat(@PathParam("WalletId") Integer WalletId,
                          @HeaderParam("user-key") String userAgent,
                          @HeaderParam("password-key") String pwdAgent) {

        if(UserDao.auth(userAgent, pwdAgent)){
            return ;
        }
        WalletDao.deleteWallet(WalletId);
    }

    public List<Wallet> getWalByUser(
            @HeaderParam("user-key") String userAgent,
            @HeaderParam("password-key") String pwdAgent) {

        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }

        List<Wallet> WalletList = WalletDao.getAllWal();
        for(Wallet c : WalletList){
            if(c.getIdUser().getLogin().equals(userAgent)) {
                //c.setUser(null);
                caRet.add(c);
            }
        }

        System.out.println(userAgent);
        return caRet;
    }

}
