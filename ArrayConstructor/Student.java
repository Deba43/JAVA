package ArrayConstructor;

class A {
    int i, j;

    A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) {
        A a = new A(10, 20);
        A b;
        b = a;
        a = new A(30, 40);
        System.out.println(a.i + " " + a.j);

    }

}
