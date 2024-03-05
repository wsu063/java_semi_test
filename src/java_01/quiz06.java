package java_01;

public class quiz06 {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};
        System.out.println("주어진 배열의 총합: " + sum(scores));
        System.out.println("주어진 배열의 평균: " + avg(scores));
    }

    static int sum(int[] scores) { // 주어진 배열의 총합을 구하는 함수
        int result = 0;
        for (int score : scores) {
            result += score;
        }
        return result;
    }

    static double avg(int[] scores) { // 주어진 배열의 평균을 구하는 함수
        double result = 0;
        result = (double) sum(scores) / (double) scores.length;
        return result;
    }
}
