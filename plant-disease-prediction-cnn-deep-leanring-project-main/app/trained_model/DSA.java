class CircularSinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail; // Points to itself
        } else {
            newNode.next = tail.next; // Insert at the beginning
            tail.next = newNode;
        }
    }

    public void display() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = tail.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != tail.next);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Circular Linked List:");
        list.display();
    }
}