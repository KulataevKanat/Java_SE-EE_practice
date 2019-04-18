package kg.itacademy.dao;

import kg.itacademy.model.Categories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoriesDao {
    private static final Map<Integer, Categories> categoriesMap = new HashMap<>();


    static {
        initEmps();
    }

    private static void initEmps() {
        Categories categories1 = new Categories(1, "Расходы на питание", UserDao.getUser(1), true);

        Categories categories2 = new Categories(2, "Транспорт", UserDao.getUser(2), true);

        Categories categories3 = new Categories(3, "Развлечения", UserDao.getUser(3), true);


        categoriesMap.put(categories1.getId(), categories1);
        categoriesMap.put(categories2.getId(), categories2);
        categoriesMap.put(categories3.getId(), categories3);
    }

    public static Categories getCategories(Integer categoriesId) {
        return categoriesMap.get(categoriesId);
    }

    public static Categories addCategories(Categories categories) {
        if (categories.getUser() == null){
            categories.setUser(null);
        }

        categoriesMap.put(categories.getId(), categories);
        return categories;
    }

    public static Categories updateCategories(Categories categories) {
        categoriesMap.put(categories.getId(), categories);
        return categories;
    }

    public static void deleteCategories(Integer categoriesId) {
        categoriesMap.remove(categoriesId);
    }

    public static List<Categories> getAllCategories() {
        Collection<Categories> c = categoriesMap.values();
        List<Categories> list = new ArrayList<Categories>();
        list.addAll(c);
        return list;
    }

}