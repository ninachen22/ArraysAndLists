import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        //Given
        double[] doubArr = new double[]{2.0, 4, 5.5};
        int expected = 3;
        //When
        int actual = AverageDoubleArrays.count(doubArr);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void sum() {
        //Given
        double[] doubArr = new double[]{2.0, 4, 5.5};
        double expected = 11.5;
        //When
        double actual = AverageDoubleArrays.sum(doubArr);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        //Given
        double[] doubArr = new double[]{2.0, 4, 5.5};
        double expected = 3.8333333333333335;
        //When
        double actual = AverageDoubleArrays.average(doubArr);
        //Then
        assertEquals(expected, actual);
    }
}