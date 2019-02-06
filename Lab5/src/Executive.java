public class Executive extends Manager {

    Executive(String name, String designation, float salary, String department) {
        super(name, designation, salary, department);
        printExecutive();
    }

    public void printExecutive() {
        System.out.println("Executive\n");
    }
}
