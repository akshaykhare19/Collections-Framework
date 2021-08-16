import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Application to sort a custom class Student on the basis of their roll number

public class App {
    public static void main(String[] args) 
    {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Akshay", 2));
        list.add(new Student("Ankur", 1));
        list.add(new Student("Ravi", 4));
        list.add(new Student("Ram", 3));

        System.out.println("Original:");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("Sort based on Roll no.:");
        System.out.println(list);


        //another method to sort students on basis of their names
        Collections.sort(list, new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }  
        });

        System.out.println("Sort based on name:");
        System.out.println(list);
    }
}
