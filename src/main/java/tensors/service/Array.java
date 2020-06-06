package tensors.service;

public class Array {

    public static String[] castIntToString(int[] indexes) {
        String[] indexesString = new String[indexes.length];

        for (int i = 0; i < indexes.length; i++) {
            indexesString[i] = String.valueOf(indexes[i]);
        }

        return indexesString;
    }
}
