package ArrayConstructor;

/**
 * abc
 */
class abc {
    static void get1() {
        System.out.println("krfr");
    }

}

class b extends abc {
    static void get1() {
        System.out.println("kr");

    }

}

class vs {
    public static void main(String[] args) {
        abc a = new b();
        a.get1();

    }

}