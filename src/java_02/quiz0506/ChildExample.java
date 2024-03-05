package java_02.quiz0506;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
 /*
 parent.field2 = "data2"; //(불가능)
 parent.method3(); //(불가능)
 */

/*
    Parent parent = new Child()로 자식 객체로 자동형변환되었다.
    parent.method1()은 오버라이딩 되지 않았으므로 Parent-method1()그대로 나온다.
    parent.method2()의 경우 오버라이딩됬으므로 Child-method2()가 나온다.

 */
        ((Child) parent).field2 = "data2"; // 강제 형변환
        ((Child) parent).method3(); // 강제 형변환



    }
}
