package tensors;

import org.tensorics.core.tensor.Tensor;

public interface InitializerImplementation {

    Tensor<Double> initTensor(byte dimension);
}
