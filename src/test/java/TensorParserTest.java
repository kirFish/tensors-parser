import org.junit.Before;
import org.junit.Test;
import org.tensorics.core.lang.Tensorics;
import org.tensorics.core.tensor.Tensor;
import org.tensorics.core.tensor.TensorBuilder;

import static org.tensorics.core.lang.Tensorics.at;

public class TensorParserTest {


    //variables for testing methods, declared globally
    //That's because i need them in all the testing methods
    private Tensor<Double> firstTensor;
    private Tensor<Double> secondTensor;





    //What do i do in setup is initializing the tensors for the future usage
    @Before
    public void setup(){

        //Builder is used to create tensor objects
        // This builder creates a tensor with <String,String> keys
        //But the value is double
        TensorBuilder<Double> builder = Tensorics.builder(String.class,String.class);
        TensorBuilder<Double> builder2 = Tensorics.builder(String.class,String.class);

        //I'm creating a <String,String> int tensor
        //it's gonna be 2 dimensional
        // firstPositionLabel is a String and is i always
        // secondPositionLabel is a String and is j always


        for (int i = 0; i < 100; i++) {

            String firstPositionLabel= String.valueOf(i);

            for (int j = 0; j < 100; j++) {

                String secondPositionLabel= String.valueOf(i);
                builder.put(at(firstPositionLabel, secondPositionLabel), (double) j);
            }
        }
        firstTensor = builder.build();

        for (int i = 0; i < 100; i++) {

            String firstPositionLabel= String.valueOf(i);

            for (int j = 0; j < 100; j++) {

                String secondPositionLabel= String.valueOf(i);
                builder2.put(at(firstPositionLabel, secondPositionLabel), (double) (j * -1));
            }
        }
        secondTensor= builder2.build();
        System.out.println("Creation successful)");
    }

    @Test
    public void extractSubTensor() {

    }

    @Test
    public void mathematicalStructures() {

    }

    @Test
    public void unaryOperations() {

    }

    @Test
    public void basicStatistics() {

    }

    @Test
    public void binaryOperations() {
    }

    @Test
    public void reshapingTensor() {

    }

    @Test
    public void broadcasting() {

    }

    @Test
    public void innerProduct() {

    }
}