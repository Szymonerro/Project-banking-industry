package org.example.linkedLists;
public class AccountNumbersManager {

    private Node<Long> head;
    private Node<Long> tail;
    private int size;

    public AccountNumbersManager() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Long data) {
        Node<Long> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }

        tail = newNode;
        size++;
    }

    public Long get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<Long> current = head;
        int i = 0;

        while (i < index) {
            current = current.getNext();
            i++;
        }

        return current.getData();
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
        } else if (index == size - 1) {
            Node<Long> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            tail = current;
            current.setNext(null);
        } else {
            Node<Long> previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }
            Node<Long> current = previous.getNext();
            previous.setNext(current.getNext());
        }
        size--;
    }

    public void showElements() {
        Node<Long> current = head;

        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public int size() {
        return size;
    }

    private static class Node<T> {

        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            next = null;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
