public class Student extends Person{

    public Student(String Name, int id){
        issueLimit = 5;
        fine = 0;
        this.Name = Name;
        this.id = id;
    }

}
