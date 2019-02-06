public class Employee {
    public String mName;
    public String mDesignation;
    public float mSalary;

    public Employee(String name, String designation, float salary){
        mName = name;
        mDesignation = designation;
        mSalary = salary;
        System.out.println("Name: " + getName() +
                " Designation: " + getDesignation() +
                " Salary: " + getSalary() + "\n");
    }

    public String getName() {
        return mName;
    }

    public String getDesignation() {
        return mDesignation;
    }

    public float getSalary() {
        return mSalary;
    }
}
