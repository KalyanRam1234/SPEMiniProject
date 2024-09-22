import org.junit.*;
import com.calculator.Calculator;

public class CalculatorTest {
    
    @Test
    public void testSquareRoot1(){
        double test=Calculator.getSquareRoot(3);
        double result=1.73205080;
        Assert.assertEquals(test, result, 1e-6);
    }

    @Test
    public void testSquareRoot2(){
        double test=Calculator.getSquareRoot(0);
        double result=0;
        Assert.assertEquals(test, result, 1e-6);
    }

    @Test
    public void testSquareRoot3(){
        double test=Calculator.getSquareRoot(-5);
        double result=-1;
        Assert.assertEquals(test, result, 1e-6);
    }

    @Test
    public void testFactorial1(){
        int test=Calculator.getFactorial(4);
        int result=24;
        Assert.assertEquals(test, result);
    }

    @Test
    public void testFactorial2(){
        int test=Calculator.getFactorial(0);
        int result=1;
        Assert.assertEquals(test, result);
    }

    @Test
    public void testFactorial3(){
        int test=Calculator.getFactorial(-2);
        int result=-1;
        Assert.assertEquals(test, result);
    }

    @Test
    public void testNaturalLog1(){
        double test=Calculator.getNaturalLogarithm(5);
        double result=1.60943791;
        Assert.assertEquals(test, result,1e-6);
    }

    @Test
    public void testNaturalLog2(){
        double test=Calculator.getNaturalLogarithm(-1);
        double result=Double.MAX_VALUE;
        Assert.assertEquals(test, result,1e-6);
    }

    @Test
    public void testPowerFunction1(){
        double test=Calculator.getPower(3, 4);
        double result=81;
        Assert.assertEquals(test, result,1e-6);
    }

    @Test
    public void testPowerFunction2(){
        double test=Calculator.getPower(2, -1);
        double result=0.5;
        Assert.assertEquals(test, result,1e-6);
    }
}
