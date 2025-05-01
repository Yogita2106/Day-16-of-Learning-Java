package list;

import java.util.ArrayList;
import java.util.List;

public class ModifyArrayList {
    public static void main(String[] args) {
        List<String> fruits= new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Initial list of Fruits:-");
        System.out.println(fruits);
        System.out.println("Removing Banana:");
        fruits.remove("Banana");
        System.out.println(fruits);
        System.out.println("Updating 1st element to Cherry");
        fruits.set(0,"Cherry");
        System.out.println(fruits);
        System.out.println("Final list of Fruits:");
        System.out.println(fruits);


    }
}
