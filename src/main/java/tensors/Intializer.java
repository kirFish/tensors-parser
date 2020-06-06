package Tensors;

import Tensors.Keys.examples.FirstKey;
import Tensors.Keys.Key;
import Tensors.Keys.examples.SecondKey;
import Tensors.Keys.examples.ThirdKey;
import org.tensorics.core.lang.Tensorics;
import org.tensorics.core.tensor.Tensor;
import org.tensorics.core.tensor.TensorBuilder;

import static org.tensorics.core.lang.Tensorics.at;

public class Intializer {

    //this describes the tensors default dimensions for keys:
    //for example Tensor<Double> (FirstKey,SecondKey) 100x100
    //if you want to create the 100/100 matrix which is also a 2 dim tensor
    final private int TENSOR_DIMENSION_FOR_EACH_KEY = 100;

    //the loop which assigns the values to the values
    private TensorBuilder<Double> mainInitLoop(Key[] keys, boolean ifNegativeTensor, TensorBuilder<Double> builder){


        for (int i = 0; i < TENSOR_DIMENSION_FOR_EACH_KEY; i++) {

            Double value = (double) i;


            builder.put(at(key),value);
        }

        return builder;
    }

    /**
     * indexes say the exact place in object
     * for example the position for the
     * 1 = FirstKey
     * 14 = SecondKey
     * 10 = ThirdKey
     *
     * value
     * */
    private Key[] getKey(int value, int[] indexes, Key[] keys) {

        String[] indexesString = indexes;

        //First key exists always so i initialize it
        FirstKey firstKey = new FirstKey(String.valueOf(indexes[0]));


        switch (keys.length){
            case 1:
                return new Key[]{firstKey};
            case 2:
                SecondKey secondKEy = new SecondKey(String.valueOf())

        }
    }


    //the method which creates the builder for the number of Keys:
    //Tensorics.builder(FirstKey.class); for 1 dim
    //Tensorics.builder(FirstKey.class, SecondKey.class); for two dim and so on
    private TensorBuilder<Double> getBuilder(Key[] keys) {
        switch (keys.length){
            case 1:
                return Tensorics.builder(FirstKey.class);
            case 2:
                return Tensorics.builder(FirstKey.class,SecondKey.class);
            case 3:
                return Tensorics.builder(FirstKey.class,SecondKey.class,ThirdKey.class);
            default:
                //if it returns null than it's 0 dimensional -> Scalar
                //if more than 3 than i have trouble
                return null;
        }

    }


    /**
     @param ifNegativeTensor:
     If it's true method will create tensor with all the values < 0
     @return Tensor<Double> with <PrimaryKey,SecondaryKey>
     */
    public Tensor<Double> initTensor(boolean ifNegativeTensor, FirstKey key){

        TensorBuilder<Double> builder = Tensorics.builder(FirstKey.class);

        mainInitLoop();

        return builder.build();
    }

}
