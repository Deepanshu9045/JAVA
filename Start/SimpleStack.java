import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class SimpleStack<T> {
    private List<T> stack;

    public SimpleStack() {
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = stack.size() - 1;
        T item = stack.get(lastIndex);
        stack.remove(lastIndex);
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        SimpleStack<Integer> stack = new SimpleStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack elements:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\nStack size: " + stack.size());
    }
}
