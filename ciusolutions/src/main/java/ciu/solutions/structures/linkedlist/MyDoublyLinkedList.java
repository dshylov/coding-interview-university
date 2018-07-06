package ciu.solutions.structures.linkedlist;

public class MyDoublyLinkedList<T> {

    public MyDoublyLinkedList() {
    }

    class Node {

        private T prev;
        private T value;
        private T next;

        public Node(T prev, T value, T next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

        boolean hasNext() {
            return next != null;
        }

        boolean hasPrev() {
            return prev != null;
        }

        public T getValue() {
            return value;
        }

    }




    public MyDoublyLinkedList add() {
//        this.add
        return this;
    }

}
