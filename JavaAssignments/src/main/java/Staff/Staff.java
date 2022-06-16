package Staff;

public class Staff {
    public static Object getNameOfStaff;
    // contents of the class set to private so only the Staff class can access them
    private String nameOfStaff;  // private variable nameOfStaff
    private int hourlyRate = 30;  // private variable hourlyRate, final can't be changed
    private int hoursWorked; // private variable hoursWorked

    public Staff(String nameOfStaff, int hourlyRate, int hoursWorked) {
        this.nameOfStaff = nameOfStaff;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void printMessage() { // method to print a message, global access, no return value
        System.out.println("Calculating Pay");  // message to print
    }
    public int calculatePay() {   // Method to calculate pay
        printMessage(); // calls method to print message
        int staffPay; // int variable for staff pay
        staffPay = hoursWorked * hourlyRate; // multiplies hours worked * hourly rate

        if (hoursWorked > 0)  // if hours worked is greater than zero
            return staffPay;  // return the staff pay
        else                  // otherwise
            return -1;        // return -1

    }

    public String getNameOfStaff() {
        return nameOfStaff;
    }

    public void setNameOfStaff(String nameOfStaff) {
        this.nameOfStaff = nameOfStaff;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
