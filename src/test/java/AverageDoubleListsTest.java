import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    @Test
    void count() {
        //Given
        ArrayList<Double> doubArr = new ArrayList<>();
        doubArr.add(0, 1.0);
        doubArr.add(0, 2.0);
        doubArr.add(0, 3.0);
        int expected = 3;
        //When
        int actual = AverageDoubleLists.count(doubArr);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void sum() {
        //Given
        ArrayList<Double> doubArr = new ArrayList<>();
        doubArr.add(0, 1.0);
        doubArr.add(0, 2.0);
        doubArr.add(0, 3.0);
        double expected = 6.0;
        //When
        double actual = AverageDoubleLists.sum(doubArr);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        //Given
        ArrayList<Double> doubArr = new ArrayList<>();
        doubArr.add(0, 1.0);
        doubArr.add(0, 2.0);
        doubArr.add(0, 3.0);
        double expected = 2.0;
        //When
        double actual = AverageDoubleLists.average(doubArr);
        //Then
        assertEquals(expected, actual);
    }
}