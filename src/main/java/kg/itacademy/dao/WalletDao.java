package kg.itacademy.dao;

import kg.itacademy.model.Wallet;

import java.time.LocalDateTime;
import java.util.*;

public class WalletDao {

    private static final Map<Integer, Wallet> WalletMap = new HashMap<>();

    static {
        initWals();
    }

    private static void initWals() {

        Wallet c1 = new Wallet(1, "Наличные деньги", UserDao.getUser(1), true, LocalDateTime.now());
        Wallet c2 = new Wallet(2, "Кредитная карта", UserDao.getUser(1), true, LocalDateTime.now());
        Wallet c3 = new Wallet(3, "Мобильный кошелек", UserDao.getUser(1), true, LocalDateTime.now());

        WalletMap.put(c1.getId(), c1);
        WalletMap.put(c2.getId(), c2);
        WalletMap.put(c3.getId(), c3);


    }

    public static Wallet getWal(Integer walId) {
        return WalletMap.get(walId);
    }

    public static Wallet addWal(Wallet wal) {
        if (wal.getIdUser() == null) {
            wal.setIdUser(null);
        }
        WalletMap.put(wal.getId(), wal);
        return wal;
    }

    public static Wallet updateWallet(Wallet Wallet) {
        WalletMap.put(Wallet.getId(), Wallet);
        return Wallet;
    }

    public static void deleteWallet(Integer catId) {
        WalletMap.remove(catId);
    }

    public static List<Wallet> getAllWal() {
        Collection<Wallet> c = WalletMap.values();
        List<Wallet> list = new ArrayList<>();
        list.addAll(c);
        return list;
    }

}
