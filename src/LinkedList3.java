import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class LinkedList3 {
    Node first;
    Node last;
    int size = 0;

    private class Node {
        int value;
        Node nextNode;

        Node(int value) {

            this.value = value;
            this.nextNode = null;
        }
    }

    void addElement(int value) {

        Node node = new Node(value);
        if (first == null)
            first = last = node;
        else {
            last.nextNode = node;
            last = node;
        }
        this.size++;
    }

    void addFirstElement(int value) {
        Node node = new Node(value);
        node.nextNode = first;
        first = node;
        this.size++;
    }

    void addLastElement(int value) {
        Node node = new Node(value);
        last.nextNode = node;
        last = node;
        this.size++;
    }

    void removeFirstElement() {
        Node temp = first.nextNode;

//        first.value = temp.value;
        first = temp;
        this.size--;
    }
    void removeLastElement() {
        // check if the list is empty
        if (first == null) {
            System.out.println("List is empty");
        }
        else {
            if (first != last) {
                Node temp = first;
                while (temp.nextNode != last) {
                    temp = temp.nextNode;
                }
                last = temp;
                last.nextNode = null;
            } else {
                first = last = null;
            }
        }
        size--;
    }
    void printElements() {
        Node current = first;
        if (size != 0) {
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.nextNode;
            }
        } else {
            System.out.println("Please Add Elements");
        }
    }
    void toArray() {
        //change the linked list to an array
        int[] listToArray = new int[size];
        int index = 0;
        Node check = first;
        while (check != null) {
            listToArray[index] = check.value;
            check = check.nextNode;
            index++;
        }
        System.out.println(Arrays.toString(listToArray));
    }

    boolean isEmpty() {
        //check if the linked list is empty and return boolean value
        if (size == 0) {
            System.out.println("Empty");
            return true;
        }
        System.out.println("Not Empty");
        return false;
    }
    boolean contains(int value) {
        //check if the linked list contains the value and return boolean value if there are elements
        Node checkNod = first;
        while (checkNod != null) {
            if (value == checkNod.value) {
                return true;
            }
            checkNod = checkNod.nextNode;
        }
        return false;
    }
    void reverse() {
        //reverse the linked list
      var temp = first;
      while (temp != last.nextNode){
          first = temp.nextNode;
          temp = temp.nextNode;
          System.out.println(first);
      }

    }
}