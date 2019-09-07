package naXa777.traincomposition;

import java.util.Deque;
import java.util.LinkedList;

public class TrainComposition2 {
    private final Deque<Integer> deque = new LinkedList<>();

    public void attachWagonFromLeft(int wagonId) {
        deque.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        deque.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
        final Integer wagon = deque.pollFirst();
        return wagon == null? 0 : wagon;
    }

    public int detachWagonFromRight() {
        final Integer wagon = deque.pollLast();
        return wagon == null? 0 : wagon;
    }

    public static void main(String[] args) {
        final TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}
