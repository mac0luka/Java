import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
       double result = Discriminant(6,5,1);
       String[] arrayStrings = {"abba","lcd","temp1","turing","b00","asdaa"};
       String smallest = FindSmallestElement(arrayStrings);
       System.out.println(smallest);
       System.out.println(result);

       Fraction fraction = new Fraction(7,8);
       Fraction fraction2 = new Fraction(2,5);
       Fraction fraction3 = fraction.Addition(fraction2);
       Fraction fraction4 = fraction.Simplify(fraction3);
       Fraction fraction5 = fraction.Subtraction(fraction2);
       Fraction fraction6 = fraction.Division(fraction2);
       Fraction fraction7 = fraction.Multiplication(fraction2);

       System.out.println("Simplified Fraction : " + fraction4.GetNumerator() + "/" + fraction4.GetDenominator());
        System.out.println("Fraction Addition : " + fraction3.GetNumerator() + "/" + fraction3.GetDenominator());
        System.out.println("Fraction Subtraction : " + fraction5.GetNumerator() + "/" + fraction5.GetDenominator());
        System.out.println("Fraction Division : " + fraction6.GetNumerator() + "/" + fraction6.GetDenominator());
       System.out.println("Fraction Multiplicaition : " + fraction7.GetNumerator() + "/" + fraction7.GetDenominator());
    }

    public static double Discriminant(double b, double a, double c)
    {
        double value = b*b - 4*(a*c);

        if(value>=0)
        {
            return Math.sqrt(value);
        }
        else
        {
            throw new IllegalArgumentException("function doesnt have a Discriminant with provided coefficients");
        }
    }

    public static String FindSmallestElement(String[] arrayOfString)
    {
        if(arrayOfString.length==0)
        {
            throw new ArrayIndexOutOfBoundsException("array legth must be bigger than 0");
        }
        String tempSmallest = arrayOfString[0];

        for(int i=0; i < arrayOfString.length;i++)
        {
            if(tempSmallest.length() > arrayOfString[i].length())
            {
                tempSmallest = arrayOfString[i];
            }
        }

        return  tempSmallest;
    }
}