import java.util.Arrays;

public class Exercice {

    public static void main(String[] args) {
        String[] array1 = new String[]{"A", "B", "C"};
        String[] array2 = new String[]{"A", "B", "C"};
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.println(Arrays.toString(arrayUtils.removeElementAtIndice(array1, -1)));
        System.out.println(Arrays.toString(arrayUtils.removeElementAtIndice(array2, 4)));
        System.out.println(Arrays.toString(arrayUtils.removeElementAtIndice(array1, 1)));
        System.out.println(Arrays.toString(arrayUtils.removeElementAtIndice(array2, 2)));
    }

}
