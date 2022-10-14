public class Fraction
{
    private int _numerator;
    private  int _denominator;

    public int GetNumerator()
    {
        return _numerator;
    }

    public int GetDenominator()
    {
        return _denominator;
    }

    public Fraction(int numerator,int denominator)
    {
        _numerator = numerator;
        _denominator = denominator;
    }

    public Fraction Addition(Fraction fractionToAdd)
    {
        int newDenominator = _denominator* fractionToAdd.GetDenominator();
        int newNumerator = _numerator* fractionToAdd.GetDenominator() + _denominator* fractionToAdd.GetNumerator();

        return new Fraction(newNumerator,newDenominator);
    }

    public Fraction Subtraction(Fraction fractionToSubtract)
    {
        int newDenominator = _denominator* fractionToSubtract.GetDenominator();
        int newNumerator = _numerator* fractionToSubtract.GetDenominator() - _denominator* fractionToSubtract.GetNumerator();

        return new Fraction(newNumerator,newDenominator);
    }

    public Fraction Multiplication(Fraction fractionToMult)
    {
        int newDenominator = _denominator* fractionToMult.GetDenominator();
        int newNumerator = _numerator* fractionToMult.GetNumerator();

        return new Fraction(newNumerator,newDenominator);
    }

    public Fraction Division(Fraction fractionToDivide)
    {
        int newDenominator = _denominator* fractionToDivide.GetNumerator();
        int newNumerator = _numerator* fractionToDivide.GetDenominator();

        return new Fraction(newNumerator,newDenominator);
    }

    public Fraction Simplify(Fraction fractionToSimplify)
    {
        int Gcd = FindGCD(fractionToSimplify.GetDenominator(),fractionToSimplify.GetNumerator());
        int newDenominator = fractionToSimplify.GetDenominator()/Gcd;
        int newNumerator = fractionToSimplify.GetNumerator()/Gcd;

        return new Fraction(newNumerator,newDenominator);
    }

    public int FindGCD(int firstNumber,int secondNumber)
    {
        int tempGcd=1;
        int biggestNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
        for(int i =1; i <= biggestNumber;i++)
        {
            if(firstNumber%i==0 && secondNumber%i==0) {
                tempGcd = i;
            }
        }

        return  tempGcd;
    }

}
