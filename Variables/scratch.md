### Type Promotion in Expressions

Java automatically promotes byte, short, or char operand to int when evaluating an expression

```java
public class main(){
    public static void main(String[] args) {
        byte a = 5;
        short b = 2;
        char c = 'z';
        byte d = a + b + c;
        System.out.println(d);
    }
}
```

If one operand is long, float or double the whole expression is promoted to long, float or double respectively.

```java
public class main(){
    public static void main(String[] args) {
        int a = 5;
        float b = 2.5f;
        double c = 30;
        int d = a + b + c;
        System.out.println(d);
    }
}
```

Both will represent a lossy conversion error in the terminal.

Java will automatically convert a expression according to the given operands, for example;

```java
public class main(){
    public static void main(String[] args) {
        byte a = 5;
        a = a * 2;
    }
}
```

The above code will give the following error to the terminal

```txt
7: error: incompatible types: possible lossy conversion from int to byte
        a = a * 2;
```

The reason being, when java gets a lossy expression it directly converts to int. If the given operands were high operands it may also convert into double, float, or long respectively.

```java
public class main(){
    public static void main(String[] args) {
        byte a = 5;
        a = (byte)(a * 2);
    }
}
```

This is a great example of type promotion in java.