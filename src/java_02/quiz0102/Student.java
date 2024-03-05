package java_02.quiz0102;

public class Student {
    String name = "김철수"; //학생 이름
    int ban = 1; //반
    int no = 10; //번호
    int kor = 90; //국어점수
    int eng = 70; //영어점수
    int math = 85; //수학점수

    public int getTotal() {
        int sum = this.kor + this.eng + this.math;
        return sum;
    }

    public double getAverage() {
        double avg = (double) getTotal() / 3;
        return avg;
    }

    @Override
    public String toString() {
        return "이름: " + this.name + ", 반: " + this.ban + ", 번호: " + this.no;
    }
}
