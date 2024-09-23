public class Array {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                System.out.println(intArray[i]);
            }
        }
    }
}