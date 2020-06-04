package Tensors;

import Keys.FirstKey;
import Keys.SecondKey;
import Keys.ThirdKey;
import org.tensorics.core.lang.Tensorics;
import org.tensorics.core.tensor.Tensor;
import org.tensorics.core.tensor.TensorBuilder;

import static org.tensorics.core.lang.Tensorics.at;

public class Intializer {

    /**
     @param ifNegativeTensor:
     If it's true method will create tensor with all the values < 0
     @return Tensor<Double> with <PrimaryKey,SecondaryKey>
     */
    public Tensor<Double> initOneDimTensor(boolean ifNegativeTensor){

        TensorBuilder<Double> builder = Tensorics.builder(FirstKey.class);

        for (int i = 0; i < 100; i++) {

            FirstKey firstKey = new FirstKey(String.valueOf(i));

            for (int j = 0; j < 100; j++) {

                SecondKey secondaryKey = new SecondKey(String.valueOf(j));

                if(ifNegativeTensor){
                    builder.put(at(firstKey, secondaryKey), (double) (-1*j));
                }else{
                    builder.put(at(firstKey, secondaryKey), (double) j);
                }
            }
        }
        return builder.build();
    }

    /**
     @param ifNegativeTensor:
     If it's true method will create tensor with all the values < 0
     @return Tensor<Double> with <PrimaryKey,SecondaryKey>
     */
    public Tensor<Double> initTwoDimTensor(boolean ifNegativeTensor){

        // Builder is used to create tensor objects
        // This builder creates a tensor with <PrimaryKey,SecondaryKEy> keys
        // under the hood they are just a string
        // The value of each tensor box is double
        TensorBuilder<Double> builder = Tensorics.builder(FirstKey.class, SecondKey.class);

        //I set value of each box like second loop index
        //this value is available at {i,j}
        for (int i = 0; i < 100; i++) {

            FirstKey firstKey = new FirstKey(String.valueOf(i));

            for (int j = 0; j < 100; j++) {

                SecondKey secondaryKey = new SecondKey(String.valueOf(j));

                if(ifNegativeTensor){
                    builder.put(at(firstKey, secondaryKey), (double) (-1*j));
                }else{
                    builder.put(at(firstKey, secondaryKey), (double) j);
                }
            }
        }

        return builder.build();
    }

    /**
     @param ifNegativeTensor:
     If it's true method will create tensor with all the values < 0
     @return Tensor<Double> with <FirstKey,SecondKey,ThirdKey>
     */
    public Tensor<Double> initThreeDimTensor(boolean ifNegativeTensor){

        // Builder is used to create tensor objects
        // This builder creates a tensor with <PrimaryKey,SecondaryKEy> keys
        // under the hood they are just a string
        // The value of each tensor box is double
        TensorBuilder<Double> builder = Tensorics.builder(FirstKey.class, SecondKey.class, ThirdKey.class);


        return builder.build();

    }

}
