import sun.java2d.loops.GeneralRenderer;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport {
    GregorianCalendar date;
    LinkedList<Double> temperatures;
    LinkedList<Double> rainfall;

    public DailyWeatherReport(GregorianCalendar theDate, LinkedList<Double> theReadings) {
        this.date = theDate;
        LinkedList<Double> tempReadings = new LinkedList<>();
        LinkedList<Double> rainReadings = new LinkedList<>();
        for(int i = 0; i < theReadings.size(); i++) {
            tempReadings.add(theReadings.get(i).degrees);
            rainReadings.add(theReadings.get(i).deltaRainFall);
        }
        this.temperatures = tempReadings;
        this.rainfall = rainReadings;
    }

}
