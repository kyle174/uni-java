/* Assignment 10 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (50 marks in total)
    Use mutils.BinarySearchTree as a basic structure to implement a TreeMap for <String, Integer>.
    You cannot use JCF provided map.
 */

import mutils.*;
import java.util.ArrayList;

public class Q1_TreeMapByBST {

    // use m_bst as the basic data structure for the treemap of <String, Integer>
    BinarySearchTree m_bst = new BinarySearchTree();

    // Question 1.1 (5 marks): implement method size().
    // Returns the number of elements in this map (its cardinality).
    // You can ONLY modify the body of this method including the return statement.
    public int size() {
        return getSize(m_bst.root);
    }

    // Recursively get the size of the tree
    public int getSize(Node root) {
        if (root == null) {
            return 0;
        }
        else {
            // Add 1 for the root + size of left and right subtrees
            return (1+getSize(root.left)+getSize(root.right));
        }
    }

    // Question 1.2 (5 marks): implement method isEmpty().
    // Returns true if this map contains no elements, otherwise return false.
    // You can ONLY modify the body of this method including the return statement.
    public boolean isEmpty() {
        return (m_bst.root == null);
    }

    // Question 1.3 (15 marks) implement method get().
    // If key is contained in the map, return the value of the key.
    // If key is not contained in the map, return -1.
    // You can ONLY modify the body of this method including the return statement.
    public int get(String key) {
        Node current = m_bst.root;
        while (current != null) {
            // Found key
            if (current.data.equals(key)) {
                return current.freq;
            }
            // Current data larger than key, check left subtree
            else if (current.data.compareTo(key) > 0) {
                current = current.left;
            }
            // Current data smaller than key, check right subtree
            else {
                current = current.right;
            }
        }
        return -1;
    }

    // Question 1.4 (15 marks) implement method put().
    // If the key is already contained in the map, overwrite the old value and return -1;
    // If the key is not contained in the map, add a new <key,value> entry to the map and return 1;
    // You can ONLY modify the body of this method including the return statement.
    public int put(String key, int value) {
        // NOTE: I changed the return type to int in order to return -1 or 1 as stated above
        Node current = m_bst.root;
        while (current != null) {
            // Found key
            if (current.data.equals(key)) {
                current.freq = value;
                return -1;
            }
            // Current data larger than key, check left subtree
            else if (current.data.compareTo(key) > 0) {
                current = current.left;
            }
            // Current data smaller than key, check right subtree
            else {
                current = current.right;
            }
        }
        Node newNode = new Node(key, value);
        m_bst.insert(newNode);
        return 1;
    }

    // Get the list of keys in order
    public ArrayList<String> getInOrder(Node root, ArrayList<String> keys) {
        // Traverse tree in order and add keys
        if (root != null) {
            getInOrder(root.left, keys);
            keys.add(root.data);
            getInOrder(root.right, keys);
        }
        return keys;
    }

    // Question 1.5 (10 marks) implement method getKeysInAlphabeticalOrder().
    // return the keys of this map as an ArrayList<String> in Alphabetical order.
    // You can ONLY modify the body of this method including the return statement.
    public ArrayList<String> getKeysInAlphabeticalOrder(){
        ArrayList<String> keys = new ArrayList<>();
        keys = getInOrder(m_bst.root, keys);
        return keys;
    }

    // Get the list of keys in order of frequency
    public ArrayList<String> getKeysInFrequencyOrder(){
        // Get list of keys
        ArrayList<String> keys = getKeysInAlphabeticalOrder();
        // Bubble sort based on their frequency
        String temp;
        boolean done = false;
        // Loop while not sorted
        while (!done) {
            done = true;
            // Loop through list of keys
            for (int i=0; i<keys.size()-1; i++) {
                // Check if incorrectly placed
                if (get(keys.get(i)) < get(keys.get(i+1))) {
                    // Switch positions if so
                    temp = keys.get(i);
                    keys.set(i, keys.get(i+1));
                    keys.set(i+1, temp);
                    done = false;
                }
            }
        }
        return keys;
    }
}
