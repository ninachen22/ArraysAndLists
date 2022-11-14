import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loadIntArrayFromFile() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        ArrayList<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        assertEquals(expected, actual);
    }

    @Test
    void loadIntegerArrayListFromFile() {
        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> actual = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    void loaddoubleArrayFromFile() {
//        Double[] expected = {1.0, 2.0, 3.0};
//        Double[] actual = {1.0, 2.0, 3.0};
        ArrayList<Double> expected = new ArrayList<>();
        ArrayList<Double> actual = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    void loadDoubleArrayListFromFile() {
        ArrayList<Double> expected = new ArrayList<>();
        ArrayList<Double> actual = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    void loadStringArrayFromFile() {
//        String[] expected = {"Hello", "World"};
//        String[] actual = {"Hello", "World"};
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    void loadStringArrayListFromFile() {
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();
        assertEquals(expected, actual);
    }
}