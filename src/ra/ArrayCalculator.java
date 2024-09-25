package ra;

public class ArrayCalculator {
        public static int sumOfArray(int[] arr){
            int sum = 0;
            for(int num : arr){
                sum += num;
            }
            return sum;
        }
        public static double sumOfArray(double[] arr){
            int sum = 0;
            for(double num : arr){
                sum += num;
            }
            return sum;
    }
    public static void main(String[] args) {
           int [] array = {1,2,3,4,5,6};
           double [] arrayDouble = {1.1, 2.2, 3.3, 4.4, 5.5};
            int sum = sumOfArray(array);
            System.out.println(sum);
        double doubleSum = sumOfArray(arrayDouble);
        System.out.println("Tổng của mảng số thực: " + doubleSum);    }
}
