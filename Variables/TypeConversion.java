public class TypeConversion {
    public static void main(String[] args) {
        int a = 5;
        long b = a;
        // no issues in printing
        System.out.println(b);
        // error cause java doesn't allow wastage of memory. If allowed the allocated space for long will be wasted
        long x = 25;
        int y = x;

        // destination data type must be greater than source type

        // order

        // byte -> short -> int -> float -> long -> double
    }
}
