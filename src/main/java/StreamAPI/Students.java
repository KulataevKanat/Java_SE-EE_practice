package StreamAPI;

public class Students {
    int id;
    String fio;
    int mark;

    public Students(int id, String fio, int mark) {
        this.id = id;
        this.fio = fio;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
