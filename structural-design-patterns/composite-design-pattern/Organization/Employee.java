public class Employee implements Entity{
    private String name;
    private double salary;
    
    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent+"Employee: "+name +",Salary: "+salary);
    }

    @Override
    public double getTotalSalary() {
        return salary;
    }
}
