/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;
    private String filename;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer(String file)
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader(file);

    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Return the number of accesses recorded in the log
     * file.
     */
    public int numberOfAccesses()
    {
        int total = 0;
        for (int hour = 0; hour < hourCounts.length; hour++) {
            total += hourCounts[hour];
        }
        return total;
    }

    /**
     * Find the busiest period of 2 hours, returning the first hour of the period
     */
    public int busiestPeriod()
    {
        if (numberOfAccesses() == 0) {
            System.out.println("There were no visits at all");
            return 0;
        }

        int visits = 0;
        int previous = 0;
        int highestcomb = 0;
        int combined = 0;
        int firstbusiesthour = 0;
        for (int hour = 0; hour < hourCounts.length; hour++) {
            visits = hourCounts[hour];
            combined = visits + previous;
            previous = visits;

            if (combined > highestcomb) {
                highestcomb = combined;
                firstbusiesthour = hour - 1;
            }
        }
        return firstbusiesthour;
    }

    /**     
     * Busiest hour is returned (if
     */
    public int busiestHour()
    {
        if (numberOfAccesses() == 0) {
            System.out.println("There were no visits at all");
            return 0;
        }

        int visits = 0;
        int tempbusiest = 0;
        int busiesthour = 0;
        for (int hour = 0; hour < hourCounts.length; hour++) {
            visits = hourCounts[hour];
            if (visits > tempbusiest) {
                tempbusiest = visits;
                busiesthour = hour;
            }
        }
        return busiesthour;
    }

    /**     
     * Quietest hour is returned
     */
    public int quietestHour()
    {
        if (numberOfAccesses() == 0) {
            System.out.println("There were no visits at all");
            return 0;
        }

        int visits = 0;
        int quietesthour = 0;
        int tempquietest = 0;
        for (int hour = 0; hour < hourCounts.length; hour++) {
            visits = hourCounts[hour];

            if (hour == 0) { //put the first hour visits in tempquietest
                tempquietest = visits;
            }

            if (visits < tempquietest) {
                tempquietest = visits;
                quietesthour = hour;
            }
        }
        return quietesthour;
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");

        int hour = 0;
        while (hour < hourCounts.length) {
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
        }
    }

    /**
     * Print all the values in the marks array that are
     * greater than mean.
     * @param marks An array of mark values.
     * @param mean The mean (average) mark.
     */
    public void printGreater(double[] marks, double mean)
    {
        for(int index = 0; index <= marks.length; index++) {
            if(marks[index] > mean) {
                System.out.println(marks[index]);
            }
        }
    }

    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}
