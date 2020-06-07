package tensors;

import org.tensorics.core.tensor.Tensor;


/**
 * This interface contains all the methods,
 * which are needed in work with tensors
 *
 * Actually most of them are method described on
 * "Tensor Operations" page of tensorics doc
 */
public interface TensorFunctions {


    //TODO: describe this method
    Tensor<Double> extractSubTensor();


    //TODO: divide this method into some more
    //TODO: describe this method
    Tensor<Double> mathematicalStructures();


    //TODO: not yet implemented
    Tensor<Double> addTensors();


    //TODO: not yet implemented
    Tensor<Double> subtractTensors();


    //TODO: not yet implemented
    Tensor<Double> multiplierTensors();


    //TODO: not yet implemented
    Tensor<Double> divideTensors();


    //TODO: describe this method
    //TODO: divide this method into some more
    Tensor<Double> unaryOperations();


    //TODO: describe this method
    //TODO: divide this method into some more
    Tensor<Double> basicStatistics();


    //TODO: describe this method
    //TODO: divide this method into some more
    Tensor<Double> binaryOperations();


    //TODO: describe this method
    Tensor<Double> reshapeTensor();


    //TODO: describe this method
    Tensor<Double> broadcast();


    //TODO: describe this method
    Tensor<Double> innerProduct();


}
