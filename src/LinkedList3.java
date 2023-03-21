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
        var temp = first.nextNode;
        first.nextNode = null;
        first.value = temp.value;
        first.nextNode = temp.nextNode;
        this.size--;

    }

    void removeLastElement() {
        size--;
        var temp = last.value;

        last.value = temp;
        last.nextNode = null;
    }

    void printElements() {
        var current = first;
        if (size != 0) {
            while (current.nextNode != null) {
                System.out.println(current.value);
                current = current.nextNode;
            }
            System.out.println(last.value);
        } else {
            System.out.println("Please Add Elements");
        }
    }

    void toArray() {
        //change the linked list to an array
        int[] listToArray = new int[this.size];
        int index = 0;
        var check = first;
        while (check.nextNode != null) {
            listToArray[index] = check.value;
            listToArray[this.size - 1] = last.value;
            check = check.nextNode;
            index++;
        }
        System.out.println(Arrays.toString(listToArray));
    }

    boolean isEmpty() {
        //check if the linked list is empty and return boolean value
        if (this.size == 0) {
            System.out.println("Empty");
            return true;
        } else {
            System.out.println("Not Empty");
            return false;
        }
    }

    boolean contains(int value) {
        //check if the linked list contains the value and return boolean value if there are elements
        var checkNod = first;
        String checklist = "";
        while (checkNod != null) {
            if (value == checkNod.value) {
                System.out.println(value + " Exists in the linked list");
                return true;
            }
            checkNod = checkNod.nextNode;
        }
        return false;
    }


        void reverse() {
            //reverse the linked list
            var reverse = first;
            int reverseArray[] = new int[size];
            int index = size-1;

            while (reverse.nextNode != null) {
                reverseArray[0] = last.value;
                reverseArray[index] = reverse.value;

                reverse = reverse.nextNode;
                index--;
            }
            System.out.println(Arrays.toString(reverseArray));
            }
        }

