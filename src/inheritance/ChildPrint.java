package inheritance;

public class ChildPrint extends Parent{
    public ChildPrint() {
        System.out.println("자식 클래스 생성자");
    }

    public void printAge() {
        System.out.println("printAge() - 18 month");
    }
}
