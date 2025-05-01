package list;

import java.util.LinkedList;

public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.addFirst("Mango");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.addLast("Orange");
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println(fruits);
    }
}
