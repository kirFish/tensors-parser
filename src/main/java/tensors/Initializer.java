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


    //main method for initialization of tensor
    /**
     If it's true method will create tensor with all the values < 0
     @return Tensor<Double> with <PrimaryKey,SecondaryKey>
     */
//    public Tensor<Double> initTensor()
//    {
//
//        //special case because we can't create a tensor with zero keys
//        //technically it is tensor but in fact it's just a scalar
//        //so one empty key is created
//        if(dimensionsNumber == 0) {
//
//            FirstKey firstKey = new FirstKey();
//            builder.put(at(firstKey), (double)1);
//
//        }else{
//            switch(keys.length){
//                case 1:
//                    initOneDimensional();
//                    break;
//                case 2:
//                    initTwoDimensions();
//                    break;
//                case 3:
//                    initThreeDimension();
//                    break;
//            }
//
//        }
//
//
//        //this line is just for better understanding
//        //the builder.build could easily be the return value
//        Tensor<Double> tensor = builder.build();
//        return tensor;
//    }


    //algorithm for the one dimension
    //(array)
//    private void initOneDimensional() {
//        Key[] whoToInit = new Key[]{new FirstKey()};
//        int[][] numberOfLineToInit = new int[][]{{0},{0}};
//        initTensorLine(numberOfLineToInit);
//    }


    //algorithm for the two dimensions
    //(matrix)
//    private void initTwoDimensions() {
//        Key[] whoToInit = new Key[]{new FirstKey()};
//
//        for (int i = 0; i <Constants.TENSOR_LENGTH_FOR_EACH_KEY; i++) {
//            initTensorLine();
//        }
//    }


//    //algorithm for three dimensions
//    //(array of matrix) or cube
//    private void initThreeDimension() {
//        Key[] whoToInit = new Key[]{new FirstKey()};
//
//        for (int i = 0; i < Constants.TENSOR_LENGTH_FOR_EACH_KEY; i++) {
//
//            for (int j = 0; j <Constants.TENSOR_LENGTH_FOR_EACH_KEY; j++) {
//
//            }
//        }
//    }


    /**
     * * @param index
     * */
    // it initializes the line in tensor with corresponding number
    private void initTensorLine(int[][] numberOfLineToInit, byte whichToInit){




        for (int i = 0; i < Constants.TENSOR_LENGTH_FOR_EACH_KEY; i++) {
            double value = i;

            Key[] position  = Key.setKeys(new int[]{i}, keys);

            switch(dimensionsNumber){
                case 1:
                    builder.put(at(position[0]), value);
                    break;
                case 2:
                    builder.put(at(position[0], position[1]), value);
                    break;
                case 3:
                    builder.put(at(position[0], position[1], position[2]), value);
                    break;
            }
         }

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