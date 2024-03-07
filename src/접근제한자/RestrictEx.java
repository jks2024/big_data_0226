package 접근제한자;

import 재귀호출.Parent;

// 접근제한자 : 객체지향의 주요 특성 중에 하나, 주로 내부 필드 값에 대한 접근 여부를 제한 할 때 사용
// Private : 동일 클래스 내부에서만 접근 가능
// default : 접근 제한자를 붙이지 않으면 default, 동일한 패키지 내에서 접근 허용
// protected : 동일한 패키지 내부이거나, 다른 패키지에 있더라도 상속 관계가 있으면 접근 가능
// public : 접근 제한을 하지 않음
public class RestrictEx {
    public static void main(String[] args) {
        Child child = new Child("개발자");
        System.out.println(child.getMoney());
        System.out.println(child.getName());
        System.out.println(child.getAddr());
        child.setJobs("놀기");
        System.out.println(child.getJobs());
    }
}
class Child extends Parent {
    String jobs;

    public Child(String jobs) {
        this.jobs = jobs;
    }

    public String getJobs() {
        return jobs;
    }
    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
    public String getAddr() {
        return addr;
    }
}