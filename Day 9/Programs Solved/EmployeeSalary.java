abstract class Employee{
    String name;
    Employee(String name){
        this.name = name;
    }
    abstract void salary();
}
class FulltimeEmployee extends Employee{
    double monthlySalary;
    FulltimeEmployee(String name, double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }
    void salary(){
        System.out.println(name + " Full-Time Salary: " + monthlySalary);
    }
}
class ParttimeEmployee extends Employee{
    double salaryPerHour;
    int hoursWorked;
    ParttimeEmployee(String name, double salaryPerHour, int hoursWorked){
        super(name);
        this.salaryPerHour = salaryPerHour;
        this.hoursWorked = hoursWorked;
    }
    void salary() {
        double salary = hoursWorked * salaryPerHour;
        System.out.println(name + " Part-Time Salary: " + salary);
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        Employee e1 = new FulltimeEmployee("Jak", 50000);
        Employee e2 = new ParttimeEmployee("Syria", 5, 200);

        e1.salary();
        e2.salary();
    }
}