package stackAndQueueQuestions;

public class ThreeInOneMain {
    public static void main(String[] args) {
        ThreeInOne stack = new ThreeInOne(3);
        stack.push(0, 1);
        stack.push(0, 2);
        stack.push(1, 56);
        stack.push(1, 78);
        int result = stack.pop(0);
        System.out.println(result);
        int peek = stack.peek(0);
        System.out.println(peek);
    }
}
