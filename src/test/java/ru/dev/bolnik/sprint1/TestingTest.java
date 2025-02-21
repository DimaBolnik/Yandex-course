import org.junit.jupiter.api.Test;
import ru.dev.bolnik.sprint1.Testing;

import static org.junit.jupiter.api.Assertions.*;

public class TestingTest {
    @Test
    public void testFindMax_EqualValues() {
        byte result = Testing.findMax((byte) 5, (byte) 5);
        assertEquals((byte) 5, result);
    }

    @Test
    public void testFindMax_FirstLarger() {
        byte result = Testing.findMax((byte) 10, (byte) 5);
        assertEquals((byte) 10, result);
    }

    @Test
    public void testFindMax_SecondLarger() {
        byte result = Testing.findMax((byte) 5, (byte) 10);
        assertEquals((byte) 10, result);
    }

    @Test
    public void testFindMax_MinValues() {
        byte result = Testing.findMax(Byte.MIN_VALUE, (byte) -1);
        assertEquals((byte) -1, result);
    }

    @Test
    public void testFindMax_MaxValues() {
        byte result = Testing.findMax(Byte.MAX_VALUE, (byte) 100);
        assertEquals(Byte.MAX_VALUE, result);
    }

    @Test
    public void testFindNumber_Found() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = Testing.findNumber(arr, 3);
        assertEquals(2, result);
    }

    @Test
    public void testFindNumber_NotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = Testing.findNumber(arr, 6);
        assertEquals(-1, result);
    }

    @Test
    public void testFindNumber_FirstElement() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = Testing.findNumber(arr, 1);
        assertEquals(0, result);
    }

    @Test
    public void testFindNumber_LastElement() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = Testing.findNumber(arr, 5);
        assertEquals(4, result);
    }

    @Test
    public void testFindNumber_SingleElementFound() {
        int[] arr = {5};
        int result = Testing.findNumber(arr, 5);
        assertEquals(0, result);
    }

    @Test
    public void testFindNumber_SingleElementNotFound() {
        int[] arr = {5};
        int result = Testing.findNumber(arr, 3);
        assertEquals(-1, result);
    }

    @Test
    public void testFindNumber_EmptyArray() {
        int[] arr = {};
        int result = Testing.findNumber(arr, 5);
        assertEquals(-1, result);
    }

    @Test
    public void testFindNumber_NullArray() {
        assertThrows(NullPointerException.class, () -> Testing.findNumber(null, 5));
    }
}