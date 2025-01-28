class Hello2 {

    int x = 7;

    Hello2() {
        System.out.println(x);
    }
}

class World extends Hello {

    World(int a, int b) {

        super();
        System.out.println("World constructor called, a + b = " + (a + b));
    }

    public static void main(String[] args) {
        World w = new World(4, 5);
    }
}
