package tensors;

import tensors.keys.examples.FirstKey;
import tensors.keys.Key;
import tensors.keys.examples.SecondKey;
import tensors.keys.examples.ThirdKey;
import org.tensorics.core.lang.Tensorics;
import org.tensorics.core.tensor.Tensor;
import org.tensorics.core.tensor.TensorBuilder;
import tensors.service.Constants;

import static org.tensorics.core.lang.Tensorics.at;


public class Initializer {

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
    public byte dimensionsNumber;
    public boolean ifNegativeTensor;

    //Constructor of the initializer says which thing are vital for creating a tensor
    public Initializer(byte dimensionsNumber, boolean ifNegativeTensor){
        this.dimensionsNumber = dimensionsNumber;
        this.ifNegativeTensor = ifNegativeTensor;
    }

    /**
     * @Keys are the array of keys of the tensor
     * @builder is the object who is responsible for
     * */
    private final Key[] keys = Key.createKeys(dimensionsNumber);
    private final TensorBuilder<Double> builder = setBuilder();


    //main method for creation of tensor
    /**
     If it's true method will create tensor with all the values < 0
     @return Tensor<Double> with <PrimaryKey,SecondaryKey>
     */
    public Tensor<Double> initTensor()
    {

        switch(dimensionsNumber){

            //technically this is not the tensor because
            case 0:
                FirstKey firstKey = new FirstKey("nothing");
                builder.put(at(firstKey), (double)1);
            case 1:

            case 2:
                initTwoDimensions();
            case 3:



        }

        return builder.build();
    }

    private void initTwoDimensions() {

    }


    /**
     *
     * */
    //the loop which assigns the values to the tensor cells
    private void mainLoop(byte currentKeyNumber){

    }


    // it initializes the line in tensor with corresponding number
    private void initTensorLine(){


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