package java_01;

public class quiz07 {
    public static void main(String[] args) {
        int[] array = {90, 87, 50, 65, 20};
        System.out.println("주어진 배열의 최솟값: " + min(array));

    }
    static int min(int[] array) {
        int result = array[0]; // 임시 값
        for(int arr : array) {
            if(result > arr) {
                result = arr;
            }
        }
        return result;
    }
}
