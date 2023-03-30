package Foundation.Activities.Assessment1.Weekly2;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        modify(numbers);
        System.out.println(numbers[0]+" "+numbers[1]);
    }
    public static void modify(int[] arr)
    {
        arr = new int[]{10, 20, 30, 40, 50};
    }
}
//1 2
//call by value
