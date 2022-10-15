import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StepTracker {
    private int stepTarget = 10000;
    MonthData daysClass = new MonthData();
    Map<Integer, MonthData> monthToData = new HashMap<>();

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    public void changeStepTarget(int value) {
        this.stepTarget = value;
    }

    public void setStepsPerDay(int month, int day, int value) {
        daysClass.stepsPerDays.put(day, value);
        monthToData.put(month, daysClass);
    }

    public void printDays(int month) {

        for (Map.Entry<Integer, MonthData> item : monthToData.entrySet()) {
            if (item.getKey() == month){
                System.out.println("Месяц " + item.getKey() + " Значение: " + item.getValue());


            }

        }
    }


    class MonthData {
        Map<Integer, Integer> stepsPerDays = new HashMap<>();

        public MonthData() {
            for (int i = 0; i < 30; i++) {
                stepsPerDays.put(i, 0);
            }
        }

        @Override
        public String toString() {
            return stepsPerDays.toString();
        }
    }
}
