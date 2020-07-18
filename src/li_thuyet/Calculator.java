package li_thuyet;

public class Calculator {
    public int add(int num1, int num2) {
        if(num1/2 + num2/2 >= Integer.MAX_VALUE/2)
            throw new RuntimeException(" out of range ");
        if(num1/2 + num2/2 <= Integer.MIN_VALUE/2)
            throw new RuntimeException(" out of range ");
        return num1 + num2;
    }
}
