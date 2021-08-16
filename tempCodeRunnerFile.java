//Stack is [LAST IN FIRST OUT]


public class LearnStack
{
    public static void main(String[] args)
    {
        //Declaration of stack
        Stack<String> animals = new Stack<>();

        //push(element) adds element at the top of the stack
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);
    }
}