package org.example;
import java.util.ArrayList;
public class TriangleNumberCalculator
{
    public int value(int num)
    {
        if(num <= 0)  // num should be >= 1.  There is no such triangular number.
        {
            return 0;
        }
        if(num == 1)
        {
            return 1;
        }
        return num + value(num - 1);
    }

    public int add(int n1, int n2)
    {
        int val1 = value(n1);
        int val2 = value(n2);
        return val1 + val2;
    }
    public int subtract(int n1, int n2)
    {
        int val1 = value(n1);
        int val2 = value(n2);
        return val1 - val2;
    }
    public int multiply(int n1, int n2)
    {
        int val1 = value(n1);
        int val2 = value(n2);
        return val1 * val2;
    }
    public double divide(int n1, int n2) throws ArithmeticException {
        int val1 = value(n1);
        int val2 = value(n2);
        if(val2 == 0)
        {
            throw new ArithmeticException("Can not divide by zero.");
        }
        return (double)val1 / val2;
    }

    // could have done with a loop but tried recursively.
    public ArrayList<Integer> sequence(int n)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        return sequenceHelper(n, list);
    }
    private ArrayList<Integer> sequenceHelper(int n, ArrayList<Integer> list)
    {
        if(n == 0)
        {
            return list;
        }
        int val = value(n);
        list.add(0, val);
        return sequenceHelper(n - 1, list);
    }
}
