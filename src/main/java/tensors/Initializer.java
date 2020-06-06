package tensors;

import tensors.keys.examples.FirstKey;
import tensors.keys.Key;
import tensors.keys.examples.SecondKey;
import tensors.keys.examples.ThirdKey;
import org.tensorics.core.lang.Tensorics;
import org.tensorics.core.tensor.Tensor;
import org.tensorics.core.tensor.TensorBuilder;


public class Initializer implements InitializerImplementation{

    /**
     * @Keys are the array of keys of the tensors
     * @builder is the object who is responsible for
     * */
    private Key[] keys;
    private TensorBuilder<Double> builder;

    /**
     * @dimensionNumber
     * means how many keys tensors
     *
     * @ifNegativeTensor
     * means whether value gonna be '1' or '-1'
     * true => -1
     * false => 1
     *
     * @inputTensor
     * tells if there's a tensor need
     * */
    public byte dimensionNumber;
    public boolean ifNegativeTensor;
//    Tensor<Double> inputTensor;



    //main method for creation of tensor
    /**
     If it's true method will create tensor with all the values < 0
     @return Tensor<Double> with <PrimaryKey,SecondaryKey>
     */
    public Tensor<Double> initTensor(){

        Key[] keys = Key.createKeys();
        TensorBuilder<Double> builder = setBuilder(keys);

        mainLoop();

        return builder.build();
    }


    /**
     *
     * */
    //the loop which assigns the values to the tensor cells
    private TensorBuilder<Double> mainLoop(){

        return builder;
    }


    // it initializes the dimension with corresponding number
    private TensorBuilder<Double> initDimensionNumber(){

        return builder;
    }


    /**
     * "keys" is the array who tells how many keys there are in tensor
     * */
    private TensorBuilder<Double> setBuilder() {
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


}