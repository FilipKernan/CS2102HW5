import org.junit.Assert;
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
    WeatherMonitor weatherMonitor = new WeatherMonitor();

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




        report1 = new DailyWeatherReport(new GregorianCalendar(2018, 0,12), readings1);
        report2 = new DailyWeatherReport(new GregorianCalendar(2018, 0,17), readings2);
        report3 = new DailyWeatherReport(new GregorianCalendar(2018, 5,17), readings3);
        report4 = new DailyWeatherReport(new GregorianCalendar(2018, 5,16), readings4);
        report5 = new DailyWeatherReport(new GregorianCalendar(2018, 11,18), readings5);
        report6 = new DailyWeatherReport(new GregorianCalendar(2018, 11,17), readings6);

        weatherMonitor.addDailyReport(report1).addDailyReport(report2).addDailyReport(report3).addDailyReport(report4);
        weatherMonitor.addDailyReport(report5).addDailyReport(report6);

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




    @Test
    public void avgTempForMonth1(){
        assertEquals(weatherMonitor.averageTempForMonth(0), 54.16, 0.5 );

    }
    @Test
    public void avgTempForMonth6(){
        assertEquals(weatherMonitor.averageTempForMonth(5), 53.33, 0.5 );
    }
    @Test
    public void avgTempForMonth12(){
        assertEquals(weatherMonitor.averageTempForMonth(11), 67, 0.5 );
    }
    @Test
    public void avgTempForMonth7(){
        assertTrue(weatherMonitor.averageTempForMonth(7) == -1);
    }



    @Test
    public void rainfallForMonth1(){
        assertEquals(weatherMonitor.totalRailfallForMonth(0), 188, 0.5 );

    }
    @Test
    public void rainfallForMonth6(){
        assertEquals(weatherMonitor.totalRailfallForMonth(5), 163, 0.5 );
    }
    @Test
    public void rainfallForMonth12(){
        assertEquals(weatherMonitor.totalRailfallForMonth(11), 43, 0.5 );
    }
    @Test
    public void rainfallForMonth7(){
        assertTrue(weatherMonitor.totalRailfallForMonth(7) == 0);
    }

}