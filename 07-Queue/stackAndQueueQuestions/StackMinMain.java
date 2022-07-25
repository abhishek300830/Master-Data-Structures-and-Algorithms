package stackAndQueueQuestions;

public class StackMinMain {
    public static void main(String[] args) {
        StackMin stack = new StackMin();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(5);
        System.out.println(stack.minimum());
        stack.pop();
        System.out.println(stack.minimum());
    }
}
