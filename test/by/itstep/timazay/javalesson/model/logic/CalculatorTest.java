package by.itstep.timazay.javalesson.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        //arrange
        int a = 10;
        int b = 20;
        int expected = 30;

        //act
        int actual = Calculator.sum(a, b);

        //assert
        if (expected != actual){
            Assert.fail();
        }
    }
    public void testSub(){
        int a = 2;
        int b = 1;
        int expected = 2;

        //act
        int actual = Calculator.sub(a, b);

        //assert
        if (expected != actual){
            Assert.fail();
        }
    }

    public void testMul(){
        int a = 2;
        int b = 2;
        int expected = 4;

        //act
        int actual = Calculator.mul(a, b);

        //assert
        if (expected != actual){
            Assert.fail();
        }
    }

    public void testDiv(){
        int a = 10;
        int b = 20;
        int expected = 0;

        //act
        int actual = Calculator.div(a, b);

        //assert
        if (expected != actual){
            Assert.fail();
        }
    }

    public void testDivByZero(){
        int a = 10;
        int b = 20;

        //act

        try {
            int actual = Calculator.div(a, b);
            Assert.fail();
        }catch (ArithmeticException exception){
            //sss
        }


  //     //assert
  //     if (expected != actual){
  //         Assert.fail();
  //     }
    }
}
