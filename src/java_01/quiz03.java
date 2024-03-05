package java_01;

public class quiz03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if(i % 2 == 0) { // 2의 배수이면 더해준다.
                // 2 4 6 8 10 12 14 16 18 20
                sum += i;
            }
        }
        System.out.println(sum);
        // sum = 110.
    }
}
