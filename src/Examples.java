import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class Examples {

    LinkedList<Reading> readings1 = new LinkedList<>();
    LinkedList<Reading> readings2 = new LinkedList<>();
    LinkedList<Reading> readings3 = new LinkedList<>();
    LinkedList<Reading> readings4 = new LinkedList<>();
    LinkedList<Reading> readings5 = new LinkedList<>();
    LinkedList<Reading> readings6 = new LinkedList<>();
    IWeatherReport report1 = new DailyWeatherReport();
    IWeatherReport report2 = new DailyWeatherReport();
    IWeatherReport report3 = new DailyWeatherReport();
    IWeatherReport report4 = new DailyWeatherReport();
    IWeatherReport report5 = new DailyWeatherReport();
    IWeatherReport report6 = new DailyWeatherReport();

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
        readings5.add(new Reading(new Time(8, 40), 63, 13));
        readings5.add(new Reading(new Time(9, 10), 56, 8));
        readings5.add(new Reading(new Time(9, 40), 49, 22));
        readings6.add(new Reading(new Time(11, 40), 72, 0));
        readings6.add(new Reading(new Time(12,10), 79, 0));
        readings6.add(new Reading(new Time(12,40), 83, 0));




        report1 = new DailyWeatherReport(new GregorianCalendar(2018, 1,12), readings1);
        report2 = new DailyWeatherReport(new GregorianCalendar(2018, 1,17), readings2);
        report3 = new DailyWeatherReport(new GregorianCalendar(2018, 6,17), readings3);
        report4 = new DailyWeatherReport(new GregorianCalendar(2018, 6,16), readings4);
        report5 = new DailyWeatherReport(new GregorianCalendar(2018, 12,18), readings5);
        report6 = new DailyWeatherReport(new GregorianCalendar(2018, 12,17), readings6);
    }
    @Test
    public void testAvgTemp1() {
        assertEquals(report1.getAvgTemp(), 155.0/3.0, 0.001);
    }
    @Test
    public void testAvgTemp2() {
        assertEquals(report2.getAvgTemp(), 170.0/3.0, 0.001);
    }
    @Test
    public void testTotalRain1() {
        assertEquals(report3.getTotalRain(), 25 + 52 + 56, 0.001);
    }
    @Test
    public void testTotalRain2() {
        assertEquals(report4.getTotalRain(), 5 + 15 + 10, 0.001);
    }

}