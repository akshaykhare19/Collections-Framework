import java.util.HashSet;
import java.util.Set;

public class App 
{

    //Here Student Akash is not added into the studentSet,
    //bcz rollNo of Akash matches Akshay and Set does not allow duplication
    public static void main(String[] args)
    {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Akshay", 1));
        studentSet.add(new Student("Ankur", 2));
        studentSet.add(new Student("Ravi", 3));
        studentSet.add(new Student("Akash", 1));

        System.out.println(studentSet);
    }
}
