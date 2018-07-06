package examples;

import java.util.LinkedList;

public class ReverseLinkedList {

    private static <T>LinkedList<T> reverseLinkedList(LinkedList<T> list){
        LinkedList<T> reversedList = new LinkedList<>();

        for(T element: list) {
            reversedList.addFirst(element);
        }

        return reversedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>() {{
            add(1); add(2); add(3); add(4);
            add(5); add(6); add(7); add(8);
            add(9); add(10); add(11); add(12);
        }};

        LinkedList<Integer> result = reverseLinkedList(linkedList);

        System.out.println(result);


    }
}
