/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (40 marks)
    Use java to implement a data structure named LinkedList, and implement several methods of the LinkedList.

 */

class Node {
    int data; // 'data' stores the value of a node.
    Node next; // 'next' refers/points to the next node

    // the construction method of class Node.
    Node(int d) {
        data = d;
        next = null;
    }
}

class Q2_LinkedList {
    Node head;

    // Insert 'new_data' at the beginning of the LinkedList
    // (5 marks)
    public void insertAtBeginning(int new_data) {
        /* place your code here */
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    // Insert 'new_data' at the end of the LinkedList
    // (5 marks)
    public void insertAtEnd(int new_data) {
        /* place your code here */
        Node newNode = new Node(new_data);
        // If head is empty
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            // Loop to end of the linked list
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Insert 'new_data' after a node referred to as 'prev_node'
    // (10 marks)
    public void insertAfter(Node prev_node, int new_data) {
        /* place your code here */
        // prev_node cannot be null
        if (prev_node != null && head != null) {
            Node newNode = new Node(new_data);
            newNode.next = prev_node.next;
            prev_node.next = newNode;
        }
    }

    // Delete a node located in 'position' of the Linked List. The first element of the LinkedList has a position=0.
    // (10 marks)
    void deleteNode(int position) {
        /* place your code here */
        if (head != null) {
            Node current = head;
            // Delete head
            if (position == 0) {
                head = current.next;
            }
            else {
                // Find node before
                for (int i=0; current.next != null && i<position-1; i++) {
                    current = current.next;
                }
                // Check if valid position
                if (current.next != null) {
                    current.next = current.next.next;
                }
            }
        }
    }

    // Search for a node containing the value of 'key' in the LinkedList.
    // If there is a node in the LinkedList whose value is equal to 'key', then return 'true'.
    // If there is no node in the LinkedList whose value is equal to 'key', then return 'false'.
    // (15 marks)
    boolean search(Node head, int key) {
        /* place your code here */
        boolean found = false;
        if (head != null) {
            Node current = head;
            // Loop until node is found or end of list
            while (current.data != key && current.next != null) {
                current = current.next;
            }
            // Check if key was found
            if (current.data == key) {
                found = true;
            }
        }
        return found;
    }

    // Sort the nodes in the LinkedList in ascending orders of their values.
    // Requirement: please use bubble sort.
    // Example: for a LinkedList: head->3->5->1->4->2, the sorted LinkedList should be head->1->2->3->4->5.
    // (15 marks)
    void sortLinkedList(Node head) {
        /* place your code here */
        // Initialize variables
        boolean done = false;
        int temp;
        Node current;
        Node next;

        // Loop while not sorted
        while (!done) {
            done = true;
            current = head;
            // Loop through every node
            while (current != null && current.next != null) {
                next = current.next;
                // Check if "neighbouring" values are incorrectly placed
                if (current.data > next.data) {
                    // Switch positions if so
                    temp = current.data;
                    current.data = next.data;
                    next.data = temp;
                    done = false;
                }
                current = current.next;
            }
        }
    }

    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        /* TA may test different functions of the LinkedList here */
        /* The following is just an example of how to do the test. */

        Q2_LinkedList llist = new Q2_LinkedList();

        llist.insertAtEnd(1);
        llist.insertAtBeginning(2);
        llist.insertAtBeginning(3);
        llist.insertAtEnd(4);
        llist.insertAfter(llist.head, 5);

        System.out.println("Linked list: ");
        llist.printList();

        System.out.println("\nAfter deleting an element: ");
        llist.deleteNode(3);
        llist.printList();

        System.out.println();
        int item_to_find = 3;
        if (llist.search(llist.head, item_to_find))
            System.out.println(item_to_find + " is found");
        else
            System.out.println(item_to_find + " is not found");

        llist.sortLinkedList(llist.head);
        System.out.println("\nSorted List: ");
        llist.printList();
    }
}