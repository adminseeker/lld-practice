public class Application {
    public static void main(String[] args) {
        DepartmentComposite headDepartment = new DepartmentComposite("Head");
        DepartmentComposite mathDepartment = new DepartmentComposite("Math");
        DepartmentComposite physicsDepartment = new DepartmentComposite("Physics");
        DepartmentComposite chemistryDepartment = new DepartmentComposite("Chemistry");

        Employee employee1 = new Employee("Aravind", 1000);
        Employee employee2 = new Employee("Zeus", 2000);
        Employee employee3 = new Employee("Poseidon", 3000);
        Employee employee4 = new Employee("Hades", 500);
        Employee employee5 = new Employee("Ares", 100.50);

        headDepartment.addEntity(mathDepartment);
        headDepartment.addEntity(physicsDepartment);
        headDepartment.addEntity(chemistryDepartment);
        headDepartment.addEntity(employee1);

        mathDepartment.addEntity(employee2);
        mathDepartment.addEntity(employee3);

        physicsDepartment.addEntity(employee4);
        chemistryDepartment.addEntity(employee5);

        headDepartment.showDetails();
        System.out.println("Total Salary:" + headDepartment.getTotalSalary());

        mathDepartment.showDetails();
        System.out.println("Total Salary:" + mathDepartment.getTotalSalary());
    }
}
