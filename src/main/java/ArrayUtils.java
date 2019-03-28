public class ArrayUtils {

    /**
     * Removes an element from an array
     *
     * @param array  The initial array
     * @param indice The index of the element to remove (starting at 1)
     * @return A new array without the specified element, or null if the arguments are invalid
     */
    public String[] removeElementAtIndice(String[] array, int indice) {
        // Check that the arguments are valid
        if (array == null || indice < 1 || array.length < indice) {
            return null;
        }
        // Create a new array that has one less element than the initial array
        String[] newArray = new String[array.length - 1];

        // Copy the elements that are before the element to remove
        System.arraycopy(array, 0, newArray, 0, indice - 1);
        // Copy the elements that are after the element to remove
        System.arraycopy(array, indice, newArray, indice - 1, array.length - indice);

        return newArray;
    }
}
