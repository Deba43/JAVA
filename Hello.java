class Hello {
    Hello() {
        System.out.println("This is a non parameterized constructor");
    }

    Hello(int a) {
        this();
        System.out.println("The value of a is " + a);

    }

    Hello(int i, int j)// Constructor Overloading
    {
        this(5);
        System.out.println(i + j);
    }

    public static void main(String[] args) {
        new Hello(7, 8);
    }
}
