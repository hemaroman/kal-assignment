public class Main {
    public static void main(String[] args) {

LinkedList3 nums = new LinkedList3();


    nums.addElement(10);
    nums.addElement(7);
    nums.addElement(25);
    nums.addFirstElement(24);
    nums.addElement(100);

    nums.printElements();

    nums.toArray();

    nums.reverse();

    nums.contains(50);


    }
}