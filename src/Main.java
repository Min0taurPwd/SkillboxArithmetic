public class Main {
    public static void main(String[] args) {
        Arithmetic ar1 = new Arithmetic(10, 20);
        Arithmetic ar2 = new Arithmetic(50, 5);

        System.out.println(ar1.sum() + " " + ar1.comp() + " " + ar1.min() + " " + ar1.max());
        System.out.println(ar2.sum() + " " + ar2.comp() + " " + ar2.min() + " " + ar2.max());
    }
}
