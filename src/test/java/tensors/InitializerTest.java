package tensors;

import org.junit.Before;
import org.junit.Test;
import org.tensorics.core.tensor.Tensor;

import static org.junit.Assert.assertEquals;

public class InitializerTest {

    Tensor<Double> tensor;

    @Before
    public void createTensor(){


    }

    @Test
    public void initTensorTest() {

        Initializer init = new Initializer();

        assertEquals(tensor, init.initTensor(false,0));
        assertEquals(tensor, init.initTensor(false,1));
        assertEquals(tensor, init.initTensor(false,2));
        assertEquals(tensor, init.initTensor(false,3));

        assertEquals(tensor, init.initTensor(true,0));
        assertEquals(tensor, init.initTensor(true,1));
        assertEquals(tensor, init.initTensor(true,2));
        assertEquals(tensor, init.initTensor(true,3));
    }
}