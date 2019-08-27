package ReusingClasses.Number15;

class University{
    private String university;
    protected void set(String nameOfuniversity){university=nameOfuniversity;}
    public University(String university){
        this.university=university;
    }
    public String toString(){
        return " and I'm student of the "+university;
    }
}

public class Student extends University {
    public String name;
    public Student(String name, String university){
        super(university);
        this.name=name;
    }
    public String toString(){
        return " My name is "+name+super.toString();
    }
     public void change(String name, String university){
        set(university);
        this.name=name;
     }

    public static void main(String[] args) {
        Student student=new Student("Olya", "BSUIR");
        System.out.println(student);
        student.change("Dasha","BSU");
        System.out.println(student);
    }
}
