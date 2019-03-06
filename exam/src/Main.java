import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Person{
    String Name, address;
    int phone;
    LocalDate dob;

    public Person() {}

    public Person(String name, String address, int phone, LocalDate dob) {
        Name = name;
        this.address = address;
        this.phone = phone;
        this.dob = dob;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}

class Employee extends Person{
    int EmpId, workPhone;
    double Salary;

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public int getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(int workPhone) {
        this.workPhone = workPhone;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}

class Student extends Person{
    String regno, Branch;
    double cgpa;

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

class Faculty extends Employee{
    String dept;
    public void display(){
        System.out.println("Name : " + getName() + "\tEmpID : " + getEmpId() + "\tDept : " + dept + "\tSalary : " + getSalary());
    }
}

class Staff extends Employee{
    String dept;
    public void display(){
        System.out.println("Name : " + getName() + "\tEmpID : " + getEmpId() + "\tDept : " + dept + "\tSalary : " + getSalary());
    }
}

class FullTimeStudents extends Student{
    int sem;
    public void display(){
        System.out.println("Name : " + getName() + "\tRegno : " + getRegno() + "\tBranch : " + getBranch() + "\tCGPA : " + getCgpa());
    }
}

class PartTimeStudents extends Student{
    int sem;
    public void display(){
        System.out.println("Name : " + getName() + "\tRegno : " + getRegno() + "\tBranch : " + getBranch() + "\tCGPA : " + getCgpa());
    }
}



class PersonTest{
    public class ageComp implements Comparator<Employee>{
        public int compare(Employee s1, Employee s2){
            return (s1.dob.compareTo(s2.dob));
        }
    }
    public class cgpaasc implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            if(s1.cgpa - s2.cgpa > 0)
                return 1;
            return 0;
        }
    }
    public class cgpadsc implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            if(s1.cgpa - s2.cgpa > 0)
                return 0;
            return 1;
        }
    }
    void test(){
        ArrayList<PartTimeStudents> partTimeStudents = new ArrayList<>();
        ArrayList<FullTimeStudents> fullTimeStudents = new ArrayList<>();
        ArrayList<Staff> staff = new ArrayList<>();
        ArrayList<Faculty> faculties = new ArrayList<>();
        int n = 0;
        while(n != 5){
            System.out.print("1. PartTimeStudent\t2. FullTimeStudent\t3. Faculty\t4. Staff\t5. End\nEnter Choice : ");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
            switch(n){
                case 1: System.out.println("Enter Name, Address, PhoneNo, DOB(yyyy-mm-dd), Regno, Branch, CGPA and semester : ");
                    PartTimeStudents pt = new PartTimeStudents();
                    pt.setName(input.next());
                    pt.setAddress(input.next());
                    pt.setPhone(input.nextInt());
                    pt.setDob(LocalDate.parse(input.next()));
                    pt.setRegno(input.next());
                    pt.setBranch(input.next());
                    pt.setCgpa(input.nextDouble());
                    pt.sem = input.nextInt();
                    partTimeStudents.add(pt);
                    break;
                case 2: System.out.println("Enter Name, Address, PhoneNo, DOB(yyyy-mm-dd), Regno, Branch, CGPA and semester : ");
                    FullTimeStudents ft = new FullTimeStudents();
                    ft.setName(input.next());
                    ft.setAddress(input.next());
                    ft.setPhone(input.nextInt());
                    ft.setDob(LocalDate.parse(input.next()));
                    ft.setRegno(input.next());
                    ft.setBranch(input.next());
                    ft.setCgpa(input.nextDouble());
                    ft.sem = input.nextInt();
                    fullTimeStudents.add(ft);
                    break;
                case 3: System.out.println("Enter Name, Address, PhoneNo, DOB(yyyy-mm-dd), EmpId, WorkPhone, Salary and Dept : ");
                    Faculty f = new Faculty();
                    f.setName(input.next());
                    f.setAddress(input.next());
                    f.setPhone(input.nextInt());
                    f.setDob(LocalDate.parse(input.next()));
                    f.setEmpId(input.nextInt());
                    f.setWorkPhone(input.nextInt());
                    f.setSalary(input.nextDouble());
                    f.dept = input.next();
                    faculties.add(f);
                    break;
                case 4: System.out.println("Enter Name, Address, PhoneNo, DOB(yyyy-mm-dd), EmpId, WorkPhone, Salary and Dept : ");
                    Staff s = new Staff();
                    s.setName(input.next());
                    s.setAddress(input.next());
                    s.setPhone(input.nextInt());
                    s.setDob(LocalDate.parse(input.next()));
                    s.setEmpId(input.nextInt());
                    s.setWorkPhone(input.nextInt());
                    s.setSalary(input.nextDouble());
                    s.dept = input.next();
                    staff.add(s);
                    break;
                default : n = 5;
            }
        }

        System.out.println("Sorted full time Students : ");
        Collections.sort(fullTimeStudents, new cgpadsc());
        for(int i = 0; i < fullTimeStudents.size(); i++){
            fullTimeStudents.get(i).display();
        }
        System.out.println("Sorted part time Students : ");
        Collections.sort(partTimeStudents, new cgpadsc());
        for(int i = 0; i < partTimeStudents.size(); i++){
            partTimeStudents.get(i).display();
        }
        System.out.println("Sorted Staff : ");
        Collections.sort(staff, new ageComp());
        for(int i = 0; i < staff.size(); i++){
            staff.get(i).display();
        }
        System.out.println("Sorted Faculty : ");
        Collections.sort(faculties, new ageComp());
        for(int i = 0; i < faculties.size(); i++){
            faculties.get(i).display();
        }
        double ft_avg = 0, pt_avg = 0;
        for(int i = 0; i < fullTimeStudents.size(); i++){
            ft_avg += fullTimeStudents.get(i).cgpa;
        }
        for(int i = 0; i < partTimeStudents.size(); i++){
            pt_avg += partTimeStudents.get(i).cgpa;
        }
        if(partTimeStudents.size() != 0)
            pt_avg /= partTimeStudents.size();
        if(fullTimeStudents.size() != 0)
            ft_avg /= fullTimeStudents.size();
        System.out.println("Part time avg = " + pt_avg + "\nFull time avg = " + ft_avg);
        if(pt_avg > ft_avg){
            System.out.println("Part time students gpa avg is greater!!");
        }
        else if (pt_avg < ft_avg){
            System.out.println("Full time students gpa avg is greater!!");
        }
        else{
            System.out.println("Avg GPA is same");
        }

        System.out.println("Students with gpa more than avg : ");
        System.out.println("Full time Students : ");
        Collections.sort(fullTimeStudents, new cgpaasc());
        for(int i = 0; i < fullTimeStudents.size(); i++){
            if(fullTimeStudents.get(i).cgpa >= ft_avg)
                fullTimeStudents.get(i).display();
        }
        System.out.println("Part time Students : ");
        Collections.sort(partTimeStudents, new cgpaasc());
        for(int i = 0; i < partTimeStudents.size(); i++){
            if(partTimeStudents.get(i).cgpa >= pt_avg)
                partTimeStudents.get(i).display();
        }
        for(int i = 0; i < faculties.size(); i++){
            if(ChronoUnit.DAYS.between(faculties.get(i).dob, LocalDate.now()) < 40 * 365){
                faculties.get(i).setSalary(faculties.get(i).getSalary() * 1.10);
            }
            else
                faculties.get(i).setSalary(faculties.get(i).getSalary() * 1.15);
        }

        System.out.println("Faculty after Salary change : ");

        for(int i = 0; i < faculties.size(); i++){
            faculties.get(i).display();
        }
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        PersonTest p = new PersonTest();
        p.test();
    }
}


//chidut89@