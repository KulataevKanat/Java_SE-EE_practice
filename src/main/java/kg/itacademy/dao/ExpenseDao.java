package kg.itacademy.dao;

import kg.itacademy.model.Expense;

import java.math.BigDecimal;
import java.util.*;

public class ExpenseDao {
    private static final Map<Integer, Expense> ExpenseMap =
            new HashMap<Integer, Expense>();

    static {
        initCats();
    }

    private static void initCats() {

        Expense c1 =
                new Expense(1,CategoriesDao.getCategories(1), BigDecimal.TEN, "Проезд", UserDao.getUser(1),
                        WalletDao.getWal(1), true,LessonDao.getLesson(1));

        ExpenseMap.put(c1.getId(), c1);
    }

    public static Expense getExpense(Integer expenceId) {
        return ExpenseMap.get(expenceId);
    }

    public static Expense addCat(Expense expense) {
        if(expense.getUser() == null){
            expense.setUser(null);
        }
        ExpenseMap.put(expense.getId(), expense);
        return expense;
    }

    public static Expense updateExpense(Expense expense) {
        ExpenseMap.put(expense.getId(), expense);
        return expense;
    }

    public static void deleteExpense(Integer expenceId) {
        ExpenseMap.remove(expenceId);
    }

    public static List<Expense> getAllExpenses() {
        Collection<Expense> c = ExpenseMap.values();
        List<Expense> list = new ArrayList<Expense>();
        list.addAll(c);
        return list;
    }

}
