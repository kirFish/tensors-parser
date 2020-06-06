package tensors;

import org.tensorics.core.tensor.Tensor;

/**
 * This is just what describes tensor
 *
 * In that particular task!
 * When we have input from the form on the site
 *
 * But this entity is the parsed version
 * That is ready thing to work with the library
 *
 * */
public class TensorEntity {


     //the value of "n" letter which affects the number of original keys to be done
     public String dimension;


     //this is just a tensor because it can contain as many as needed
     public Tensor inputTensors;


     //the list in that constructor must be a List<Token> in future for the project needs
     public TensorEntity(String dimension, String[] operationArray, org.tensorics.core.tensor.Tensor<Double> inputTensors) {
          this.dimension = dimension;
          this.inputTensors = inputTensors;
     }
}
