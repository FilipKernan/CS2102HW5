import org.junit.Before;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class Examples {

    LinkedList<Reading> readings1 = new LinkedList<>();
    LinkedList<Reading> readings2 = new LinkedList<>();
    LinkedList<Reading> readings3 = new LinkedList<>();
    LinkedList<Reading> readings4 = new LinkedList<>();
    IWeatherReport report1 = new DailyWeatherReport();
    IWeatherReport report2 = new DailyWeatherReport();
    IWeatherReport report3 = new DailyWeatherReport();
    IWeatherReport report4 = new DailyWeatherReport();

    @Before
    public void constructExamples(){
        readings1.add(new Reading(new Time( 5, 10), 50, 5));
        readings1.add(new Reading(new Time( 5, 30), 50, 5));
        readings1.add(new Reading(new Time( 5, 20), 55, 57));
        readings2.add(new Reading(new Time( 6, 10), 60, 15));
        readings2.add(new Reading(new Time( 6, 40), 60, 51));
        readings2.add(new Reading(new Time( 7, 10), 50, 55));
        readings3.add(new Reading(new Time( 7, 30), 60, 25));
        readings3.add(new Reading(new Time( 7, 50), 50, 52));
        readings3.add(new Reading(new Time( 5, 10), 53, 56));
        readings4.add(new Reading(new Time( 5, 10), 50, 5));
        readings4.add(new Reading(new Time( 5, 10), 55, 15));
        readings4.add(new Reading(new Time( 5, 10), 52, 10));





    }


}