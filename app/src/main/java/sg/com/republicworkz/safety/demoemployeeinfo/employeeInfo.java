package sg.com.republicworkz.safety.demoemployeeinfo;

public class employeeInfo {
    private String name;
    private String title;
    private double salary;

    public employeeInfo(String name, String title, double salary){
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public String toString(){
        String str = "$"+getSalary();
        return str;
    }
}
