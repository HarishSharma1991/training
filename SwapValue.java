package swapvalue;

public class SwapValue {
    private int a=10;
    private int b=8;

    public static void main(String[] args) {
        SwapValue swapValue = new SwapValue();
        swapValue.swap();
    }

    public void swap() {
        System.out.println("value of a before swap" + a);
        System.out.println("value of b before swap" + b);


        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("value of a after swap" + a);
        System.out.println("value of b after swap" + b);
    }
}
