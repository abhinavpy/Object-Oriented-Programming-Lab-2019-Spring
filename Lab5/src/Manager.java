public class Manager extends Employee {

    private String mDepartment;

    Manager(String name, String designation, float salary, String department){
        super(name, designation, salary);
        mDepartment = department;
        System.out.println("Department: "+ getDepartment() + "\n");
    }

    public String getDepartment() {
        return mDepartment;
    }
}