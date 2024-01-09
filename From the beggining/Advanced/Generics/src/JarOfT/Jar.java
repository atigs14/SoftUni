package JarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {
    private Deque<T> content;

    public Jar() {
        this.content = new ArrayDeque<>();
    }

    public void add(T entry) {
        content.push(entry);
    }

    public T remove() {
        return content.pop();
    }
}
