package GOJ.inheritance;

public class Parent {
//    public Parent() {
//        System.out.println("부모 클래스 생성자");
//    }

    public Parent(String name) {
        System.out.println("부모 클래스 생성자" + name);
    }

    public void printName() {
        System.out.println("Parent printName()");
    }
}
