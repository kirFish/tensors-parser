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


    //TODO: not yet implemented
    Tensor<Double> addTensors(Tensor<Double> tensor1, Tensor<Double> tensor2);


    //TODO: not yet implemented
    Tensor<Double> subtractTensors(Tensor<Double> tensor1, Tensor<Double> tensor2);


    //TODO: not yet implemented
    Tensor<Double> multiplyTensors(Tensor<Double> tensor1, Tensor<Double> tensor2);


    //TODO: not yet implemented
    Tensor<Double> divideTensors(Tensor<Double> tensor1, Tensor<Double> tensor2);


    //TODO: describe this method
    //TODO: divide this method into some more
    Tensor<Double> unaryOperations();


    //TODO: describe this method
    //TODO: divide this method into some more
    Tensor<Double> basicStatistics(Tensor<Double> tensor1);


    //TODO: describe this method
    //TODO: divide this method into some more
    Tensor<Double> binaryOperations();


    //TODO: describe this method
    Tensor<Double> reshapeTensor();


    //TODO: describe this method
    Tensor<Double> broadcast();


    //TODO: describe this method
    Tensor<Double> innerProduct(Tensor<Double> tensor1, Tensor<Double> tensor2);


}
