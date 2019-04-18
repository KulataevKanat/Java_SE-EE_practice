package kg.itacademy.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lesson")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lesson {
    private int id;
    private String topic;
    private int durInMinuts;
    private int studNum;
    private String startTime;
    private boolean isExam;

    public Lesson(int id, String topic, int durInMinuts, int studNum, String startTime, boolean isExam) {
        this.id = id;
        this.topic = topic;
        this.durInMinuts = durInMinuts;
        this.studNum = studNum;
        this.startTime = startTime;
        this.isExam = isExam;
    }

    public Lesson() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getDurInMinuts() {
        return durInMinuts;
    }

    public void setDurInMinuts(int durInMinuts) {
        this.durInMinuts = durInMinuts;
    }

    public int getStudNum() {
        return studNum;
    }

    public void setStudNum(int studNum) {
        this.studNum = studNum;
    }

    public String getStartTime() {
        return getStartTime();
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public boolean isExam() {
        return isExam;
    }

    public void setExam(boolean exam) {
        isExam = exam;
    }
}
