//Student class implements Comparable of type Student
public class Student implements Comparable<Student>
{
    //Implementing compareTo() bcz of Comparable
    @Override
    public int compareTo(Student that) {
        //if this object is greater, then function return positive value
        //if that object is greater, then function return negative value
        return this.rollNo - that.rollNo;

        //one method to sort on the basis of name is to return this.name.compareTo(that.name)

    }

    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }
    
    
}
