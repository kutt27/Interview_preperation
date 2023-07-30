### Unary Operators

There are two operators in the unary operator (i) increment, (ii) decrement. 

```java
public class Unary{
    public static void main(){
        int a = 10;
        int b = 5;
        // increment operation
        a++; // value of 'a' increases by one
        //decrement operation
        b--; // value of b decreases 
    }
}
```

With being there are two more classification based on position of operand and operator.

1. Pre Increment
2. Post Increment


See an example;

```java
public class Unary{
    public static void main(){
        int a = 10;
        int b = 5;
        // pre increment operation
        ++a;
        // post increment operation
        b++;

        b = ++a;
        System.out.println(a); // value will be 12
        b = a++;
        System.out.println(a); // value will be also 12 but not 13
    }
}
```

The same rule given in the example, can be used for decrement operation.