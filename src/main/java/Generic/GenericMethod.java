package Generic;

public class GenericMethod {
    public static <T> void printArr(T[] arr) {
        for (T elements : arr) {
            System.out.printf("%s ", elements);
        }
        System.out.println();
    }

    public static <T> T returnLastValue(T[] arr, boolean isLast) {

        return isLast ? arr[arr.length - 1] :arr[0];
    }


    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'П', 'Р', 'И', 'В', 'Е', 'Т'};
        System.out.println("integerArray :");
        printArr(intArray);
        System.out.println("doubleArray :");
        printArr(doubleArray);
        System.out.println("charArray :");
        printArr(charArray);

        System.out.println(returnLastValue(intArray, true));
        System.out.println(returnLastValue(doubleArray, false));
        System.out.println(returnLastValue(charArray, false));
    }
}
