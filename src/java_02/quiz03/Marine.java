package java_02.quiz03;

public class Marine {
    int x = 0, y = 0; // Marine의 위치좌표(x,y)
    int hp = 60; // 현재 체력
    static int weapon = 6; // 공격력
    static int armor = 0; // 방어력
    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x; // this.x는 인스턴스 변수, x는 지역변수
        this.y = y; // this.y는 인스턴스 변수, y는 지역변수
    }
    /*
    static이 붙어야 하는것은 weapon과 armor이다. 모든 객체의 공격력과 방어력이 같으려면
    정적 변수를 사용해야 한다.
     */
}
