import javax.swing.*;
import java.util.Arrays;

public class LinkedListGenerics <T> {
    Node first;
    Node last;
    int size = 0;
    private class  Node <T>{
        T element;
        Node nextNode;
        Node(T element){
            this.element = element;
            this.nextNode = null;
        }
    }

    void addElement(T element){
        Node node = new Node(element);

        if (first == null){
            first = last = node;
        }
        else {
            last.nextNode = node;
            last = node;
            size++;
        }

    }

    void addFirstElement(T element){
        Node node = new Node(element);
        node.nextNode = first;
        first = node;
        size++;
    }

    void addLastElement(T element){
        Node node = new Node(element);
        last.nextNode = node;
        last = node;
        size++;
    }

    void removeFirst (){
        var temp = first.nextNode;
        first = temp;
        size--;
    }

    void removeLast (){
        var temp = first;
        while (temp.nextNode != last){
            temp = temp.nextNode;
        }
        last = temp;
        last.nextNode = null;
        size--;
    }

    void printElement () {
        Node current = first;
        if (first == null) {
            System.out.println("please add a minimum of one element");
        } else {
            while (current != null) {
                System.out.print(current.element + " ");
                current = current.nextNode;
            }
        }
    }

    void toArray() {
        T[] listToArray = (T[])new Object[size+1];
        int index = 0;
        var check = first;
        while (check != last.nextNode) {
            listToArray[index] = (T) check.element;
            check = check.nextNode;
            index++;
        }
        System.out.println(Arrays.toString(listToArray));
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    boolean contains(T checkElement) {
      var checkNod = first;
        while (checkNod != null) {
            if (checkElement == checkNod.element) {
                return true;
            }
            checkNod = checkNod.nextNode;
        }
        return false;
    }

    void reverse() {
        //reverse the linked list
//        var temp = first;
//        if (temp!=null) {
//            while (temp != null) {
//                first = temp.nextNode;
//                System.out.println(first);
            }
        }