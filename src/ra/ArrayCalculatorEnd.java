package ra;

public class ArrayCalculatorEnd {
    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static double maxOfArray(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static double minOfArray(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arrMax = {1,2,3,4,5,6,7};
        int [] arrMin = {1,2,3,4,5,6,7};
        int maxInt = maxOfArray(arrMax);
        System.out.println("Giá trị lớn nhất trong mảng số nguyên: " + maxInt);
        double  maxDouble = maxOfArray(arrMax);
        System.out.println("Giá trị lớn nhất trong mảng số thực: " + maxDouble);
        double  minDouble = minOfArray(arrMax);
        System.out.println("Giá trị nhỏ nhất trong mảng số nguyên: " + minDouble);
        double  minDouble2 = minOfArray(arrMax);
        System.out.println("Giá trị nhỏ nhất trong mảng số thực : " + minDouble2);
    }
}
