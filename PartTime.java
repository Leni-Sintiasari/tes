package Tugas1;

public class PartTime {
    private int hoursworked;

    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public PartTime() {
        super();
        hoursworked = 0;
    }

    public PartTime(String subject, int hoursworked) {
        super();
        this.hoursworked = hoursworked;
    }

    public int setSalary() {
        int salary = hoursworked * 10000;
        return salary;
    }

    public void print() {
        System.out.println("jam kerja: " + hoursworked);
        System.out.println("Salary: " + setSalary());
    }
}
