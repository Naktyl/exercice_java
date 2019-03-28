import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    private String[] initialArray = new String[] {"A", "B", "C"};
    private ArrayUtils arrayUtils = new ArrayUtils();

    @Test
    void removeElementAtIndice_WithNullArray_ShouldReturnNull() {
        assertNull(arrayUtils.removeElementAtIndice(null, 1));
    }

    @Test
    void removeElementAtIndice_WithNegativeIndice_ShouldReturnNull() {
        assertNull(arrayUtils.removeElementAtIndice(initialArray, -1));
    }

    @Test
    void removeElementAtIndice_WithIndiceBiggerThanArray_ShouldReturnNull() {
        assertNull(arrayUtils.removeElementAtIndice(initialArray, 4));
    }

    @Test
    void removeElementAtIndice_ShouldReturnNewArrayWithoutElementAtIndice() {
        assertTrue(Arrays.equals(new String[]{"A", "C"}, arrayUtils.removeElementAtIndice(initialArray, 2)));
    }
}
