import java.util.Stack;

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

        //peek() returns the topmost element of the stack         
        System.out.println("Top Element: " + animals.peek());

        //pop() removes the topmost element from the stack
        animals.pop();
        System.out.println("Stack: " + animals);
        System.out.println("Top Element: " + animals.peek());
    }
}