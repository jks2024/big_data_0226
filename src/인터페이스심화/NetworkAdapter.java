package 인터페이스심화;

public interface NetworkAdapter {
    void connect(); // public abstract
}

class WiFi implements NetworkAdapter {
    String company;
    WiFi(String com) {
        company = com;
    }

    @Override
    public void connect() {
        System.out.println(company + "WiFI에 연결 되었습니다.");
    }
}

class FiveG implements NetworkAdapter {
    String company;
    FiveG(String com) {
        company = com;
    }

    @Override
    public void connect() {
        System.out.println(company + "5G에 연결 되었습니다.");
    }
}

class LTE implements NetworkAdapter {
    String company;
    LTE(String com) {
        company = com;
    }

    @Override
    public void connect() {
        System.out.println(company + "LTE에 연결 되었습니다.");
    }
}
