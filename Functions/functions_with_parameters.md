## Functions with Parameters in Java

In Java, functions can accept parameters, which are values that you can pass to the function to perform specific tasks. Parameters allow functions to be more versatile and adaptable. In this tutorial, you'll learn how to create functions with parameters in Java.

## Defining a Function with Parameters

To create a function with parameters, you need to declare the parameter types and names within the parentheses when defining the function. Here's the syntax:

```java
returnType functionName(parameterType parameterName) {
    // Code using the parameter
    // ...
    return returnValue; // Optional
}
```

- `returnType`: The data type of the value the function will return. Use `void` if the function doesn't return anything.
- `functionName`: The name of the function.
- `parameterType`: The data type of the parameter.
- `parameterName`: The name of the parameter.

## Example: Calculating the Area of a Rectangle

Let's create a function that calculates the area of a rectangle using its length and width as parameters.

```java
public class RectangleArea {
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static void main(String[] args) {
        double length = 5.0;
        double width = 3.0;

        double area = calculateArea(length, width);
        System.out.println("Area of the rectangle: " + area);
    }
}
```

In this example:

- We define a function `calculateArea` that takes two `double` parameters, `length` and `width`, and returns a `double` value.
- Inside the function, we calculate the area of the rectangle using the provided parameters and return the result.
- In the `main` method, we call the `calculateArea` function with the `length` and `width` values and print the calculated area.

## Multiple Parameters

Functions can have multiple parameters of different types. You simply list the parameter types and names within the parentheses, separated by commas.

```java
public class MultipleParameters {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("Sum: " + result);
    }
}
```

In this example, the `add` function takes two `int` parameters, `num1` and `num2`, and returns their sum.

## Conclusion

Functions with parameters allow you to create reusable and adaptable code. By passing values to functions, you can perform specific tasks using different input data. Understanding how to define and use functions with parameters is essential for building flexible Java programs.