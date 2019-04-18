package kg.itacademy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "resp")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({Categories.class,
        User.class,
        Wallet.class, Expense.class})
public class Response {
    private String status;
    private String message;
    private Object json;

    public Response() {
    }

    public Response(String status, String message, Object json) {
        this.status = status;
        this.message = message;
        this.json = json;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getJson() {
        return json;
    }

    public void setJson(Object json) {
        this.json = json;
    }
}