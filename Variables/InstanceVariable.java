package Variables;

public class InstanceVariable {
    int a;

    InstanceVariable() {
        this.a = 8;
    }

    public static void main(String[] args) {
        InstanceVariable b = new InstanceVariable();
        System.out.println("Instance Variable is " + b.a);
    }

}
