package study.chodev.pureu.example.week2;

public class HouseDog extends Dog {
    public void sleep() {
        System.out.println(this.name+" zzz in house");
    } 

    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    } 

    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();     // sleep() 메소드 호출
        houseDog.sleep(3);   // sleep(int hour) 메소드 호출
    }
}

