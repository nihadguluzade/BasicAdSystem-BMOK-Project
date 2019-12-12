import java.util.Calendar;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Is used to clone object, useful while reporting.
     */
    public Date(Date otherDate) {
        this.day = otherDate.day;
        this.month = otherDate.month;
        this.year = otherDate.year;
    }

    public Date sumMonths(int duration) {
        int newMonth = month + duration;
        if (newMonth > 12) {
            year++;
            newMonth -= 12;
        }
        return new Date(day, newMonth, year);
    }

    /**
     * Get today's date from Calendar class
     * @return new today's date.
     */
    public static Date getToday() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        return new Date(day, month+1, year);
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }

    public boolean equals(Date date) {
        return date.getDay() == day && date.getMonth() == month && date.getYear() == year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }
}
