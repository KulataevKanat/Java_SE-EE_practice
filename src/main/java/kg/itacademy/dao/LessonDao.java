package kg.itacademy.dao;

import kg.itacademy.model.Lesson;

import java.util.*;

public class LessonDao {
    private static Map<Integer, Lesson> lessonHashMap = new HashMap<>();

    static {
        initEmps();
    }

    private static void initEmps() {
        Lesson lesson1 = new Lesson(1, "JavaLesson", 120, 11, "19:00", true);

        lessonHashMap.put(lesson1.getId(), lesson1);

    }

    public static Lesson getLesson(Integer lessonId) {
        return lessonHashMap.get(lessonId);
    }

//    public static Lesson getCalcMap(CalcService calcMap) {
//        return lessonHashMap.get(calcMap);
//    }


}
