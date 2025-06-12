public class Date {
    private int year;
    private int month;
    private int day;

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int day , int month , int year){
        this.month= month;
        this.year = year;
        this.day = day;
    }

    public void printDate(){
        System.out.println("date is - "+year+"-"+month+"-"+day);
    }
}
