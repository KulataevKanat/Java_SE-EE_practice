package kg.itacademy.service;

import java.util.HashMap;
import java.util.Map;

public class CalcService {
    static Map<String, Double> calcMap = new HashMap<>();

    static {
        initEmps();
    }

    private static void initEmps() {
    }

    public static Map<String, Double> getCalcMap() {

        return calcMap;
    }
}
