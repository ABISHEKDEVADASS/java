class Dad {
    int money = 2000;
}

class Son extends Dad {
}

public class Inheritance {
    public static void main(String[] args) {
        Son object1 = new Son();
        System.out.println(object1.money);
    }
}
