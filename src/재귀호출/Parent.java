package 재귀호출;

public class Parent {
    // default 제한자 : 같은 패키지 내에서 접근 가능
    public String name;
    // protected : 같은 패키지와 상속 관계에서 접근 가능
    protected String money;
    public String addr;
    public Parent() {
        name = "Parent Name";
        money = "20억";
        addr =  "서울시 강남구 역삼동";
    }
}
