package kg.itacademy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@XmlRootElement(name = "wallet")
@XmlAccessorType(XmlAccessType.FIELD)
public class Wallet {
    private int id;
    private String name;
    private User idUser;
    private boolean isActive;
    private LocalDateTime dateCreated;

    public Wallet(int id, String name, User idUser, boolean isActive,LocalDateTime dateCreated) {
        this.id = id;
        this.name = name;
        this.idUser = idUser;
        this.isActive = isActive;
        this.dateCreated = dateCreated;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
