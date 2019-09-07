package NguyenQuangNinh;

import java.util.Deque;
import java.util.LinkedList;

public class TrainComposition {

    private Deque<Integer> deque = new LinkedList<>();

    public void attachWagonFromLeft(int wagonId) {
        deque.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        deque.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
        return deque.removeFirst();
    }

    public int detachWagonFromRight() {
        return deque.removeLast();
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        tree.attachWagonFromRight(14);
        System.out.println(tree.detachWagonFromRight()); // 7
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}