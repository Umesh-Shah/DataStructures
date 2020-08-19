package Arrays;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(2);
        numbers.print();
        System.out.println(numbers.indexOf(200));
        System.out.println(numbers.max());
        numbers.reverse();
        numbers.print();
        numbers.insertAt(50, 2);
        System.out.println("New number array is");
        numbers.print();
    }
}
