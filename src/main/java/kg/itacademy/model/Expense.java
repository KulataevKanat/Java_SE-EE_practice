package kg.itacademy.model;

import kg.itacademy.service.CalcService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@XmlRootElement(name = "expense")
@XmlAccessorType(XmlAccessType.FIELD)
public class Expense {
    //    private CalcService calcMap;
    private int id;
    private Categories categories;
    private BigDecimal amount;
    private String description;
    private User user;
    private Wallet wallet;
    private boolean isExpense;
    private LocalDateTime dateCreated;
    private Lesson lesson;

    public Expense(int id, Categories categories, BigDecimal amount, String description, User user, Wallet wallet, boolean isExpense, Lesson lesson) {
        this.id = id;
        this.categories = categories;
        this.amount = amount;
        this.description = description;
        this.user = user;
        this.wallet = wallet;
        this.isExpense = isExpense;
        this.lesson = lesson;
    }

    public boolean isExpense() {
        return isExpense;
    }

    public void setExpense(boolean expense) {
        isExpense = expense;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //    public CalcService getCalcMap() {
//        return calcMap;
//    }
//
//    public void setCalcMap(CalcService calcMap) {
//        this.calcMap = calcMap;
//    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
}
