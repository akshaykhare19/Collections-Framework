import java.util.Objects;

public class Student
{
    String name;
    int rollNo;

    public Student(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    //toString() to convert objects into string
    @Override
    public String toString()
    {
        return "Student{" +
                "name=" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    //checks if two objects of class are same
    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if((o == null) || (getClass() != o.getClass())) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    //returns unique hashCode
    @Override
    public int hashCode()
    {
        return Objects.hash(rollNo);
    }

}
