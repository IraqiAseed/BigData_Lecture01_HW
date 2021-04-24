package task1;

import java.util.Arrays;

public class BasicArrayCastingDoubleToInt {

    private int size;
    private double[] doubleArr;
    private int[] intArr ;

    BasicArrayCastingDoubleToInt(double[] arr)
    {
        size = arr.length;
        doubleArr = new double[size];
        doubleArr = Arrays.copyOf(arr, arr.length);
        intArr = new int[size];
        castingAndFillIntArray();


    }

    private void castingAndFillIntArray()
    {
        for(int i = 0 ; i < size ; i++)
        {
            intArr[i] = (int)doubleArr[i];
        }
    }



    @Override
    public String toString() {
        return "BasicArrayCastingDoubleToInt{" +
                "doubleArr=" + Arrays.toString(doubleArr) +
                ", intArr=" + Arrays.toString(intArr) +
                '}';
    }

    public static void main(String[] args) {

        double[] dArray = {1.4,2.3,3.8,4.6};
        BasicArrayCastingDoubleToInt castDoubleArrayToIntArray = new BasicArrayCastingDoubleToInt(dArray);
        System.out.println(castDoubleArrayToIntArray.toString());


    }


}
