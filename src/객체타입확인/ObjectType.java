package 객체타입확인;
// 객체 타입을 확인하는 instanceof
public class ObjectType {
    public static void main(String[] args) {
       Child child = new Child("dhdhdh");
    }
}

class Parent {
    String name;
    Parent(String name) {
    }
}

class Child extends  Parent {
    Child(String name) {
        super("djdjdj");
        this.name = name;
    }
}
