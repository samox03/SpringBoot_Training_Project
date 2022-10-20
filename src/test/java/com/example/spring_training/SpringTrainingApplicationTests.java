package com.example.spring_training;
// entry point for all assertThat methods and utility methods (e.g. entry)
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringTrainingApplicationTests {

    //example Testing
    Calculator underTest = new Calculator();
    @Test
    void itShouldAddTwoNumbers() {
        //given
        int numberOne = 20;
        int numberTwo = 30;

        //when
       int result = underTest.add(numberOne, numberTwo);

       //then
        //needs to have AssertJ implemented
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    //example testing
    class Calculator {
        int add(int a, int b) {
            return a +b;
        }
    }

}
