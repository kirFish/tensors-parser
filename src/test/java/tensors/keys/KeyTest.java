package tensors.keys;

import org.junit.Before;
import org.junit.Test;
import tensors.keys.examples.FirstKey;
import tensors.keys.examples.SecondKey;
import tensors.keys.examples.ThirdKey;

import static org.junit.Assert.*;

public class KeyTest {

    Key[] threeEmptyKeys;
    Key[] twoEmptyKeys;
    Key[] oneEmptyKey;
    Key[] expectedKeyArray;
    int[]  keyIndexes;
    Key firstKey;
    Key secondKey;
    Key thirdKey;


    @Before
    public void setup(){

        firstKey = new FirstKey("");
        secondKey = new SecondKey("");
        thirdKey = new ThirdKey("");

        keyIndexes = new int[]{1};
        oneEmptyKey = new Key[]{new FirstKey()};
        twoEmptyKeys  = new Key[]{new FirstKey(), new SecondKey()};
        threeEmptyKeys = new Key[]{new FirstKey(), new SecondKey(), new ThirdKey()};


    }


    @Test
    public void createKeys() {



        Key[] createdKeys = Key.createKeys(1);
        assert createdKeys != null;
        assertEquals(firstKey.value , createdKeys[0].value);

        createdKeys = Key.createKeys(2);
        assert createdKeys != null;
        assertEquals(firstKey.value , createdKeys[0].value);
        assertEquals(secondKey.value, createdKeys[1].value);

        createdKeys = Key.createKeys(3);
        assert createdKeys != null;
        assertEquals(firstKey.value , createdKeys[0].value);
        assertEquals(secondKey.value, createdKeys[1].value);
        assertEquals(thirdKey.value, createdKeys[2].value);

        createdKeys = Key.createKeys(1123);
        assert createdKeys == null;

        createdKeys = Key.createKeys(-2);
        assert createdKeys == null;

    }


    @Test
    public void setKeys() {

        Key[] expectedKeyArray;
        Key[] resultingKeys;

        keyIndexes = new int[]{1};
        expectedKeyArray  = new Key[]{new FirstKey("1")};
        resultingKeys = Key.setKeys(keyIndexes, oneEmptyKey);
        assertEquals(expectedKeyArray[0].value, resultingKeys[0].value);

        keyIndexes= new int[]{1,2};
        expectedKeyArray  = new Key[]{new FirstKey("1"),new SecondKey("2")};
        resultingKeys = Key.setKeys(keyIndexes, twoEmptyKeys);
        assertEquals(expectedKeyArray[0].value, resultingKeys[0].value);
        assertEquals(expectedKeyArray[1].value, resultingKeys[1].value);

        keyIndexes= new int[]{1,1,1};
        expectedKeyArray  = new Key[]{new FirstKey("1"), new SecondKey("1"), new ThirdKey("1")};
        resultingKeys = Key.setKeys(keyIndexes, threeEmptyKeys);
        assertEquals(expectedKeyArray[0].value, resultingKeys[0].value);
        assertEquals(expectedKeyArray[1].value, resultingKeys[1].value);
        assertEquals(expectedKeyArray[2].value, resultingKeys[2].value);
    }


    /*
    @Test
    public void createOneKey() {

        Key[] createdKeys = Key.createKeys(1);
        assert createdKeys != null;
        assertEquals(firstKey.value , createdKeys[0].value);
        assertEquals(threeEmptyKeys.length, createdKeys.length);
    }


    @Test
    public void createTwoKeys(){

        Key[] createdKeys = Key.createKeys(2);
        assert createdKeys != null;
        assertEquals(firstKey.value , createdKeys[0].value);
        assertEquals(secondKey.value, createdKeys[1].value);

    }


    @Test
    public void createThreeKeys(){

        Key[] createdKeys = Key.createKeys(3);
        assert createdKeys != null;
        assertEquals(firstKey.value , createdKeys[0].value);
        assertEquals(secondKey.value, createdKeys[1].value);
        assertEquals(thirdKey.value, createdKeys[2].value);

    }
    */


/*
    @Test
    public void setOneKey() {
        keyIndexes = new int[]{1};
        Key[] expectedKeyArray  = new Key[]{new FirstKey("1")};
        assertEquals(expectedKeyArray[0].value, Key.setKeys(new int[]{1}, oneEmptyKey)[0].value);
    }


    @Test
    public void setTwoKeys() {

        keyIndexes= new int[]{1,2};
        expectedKeyArray  = new Key[]{new FirstKey("1"),new SecondKey("2")};
        assertEquals(expectedKeyArray[0].value, Key.setKeys(keyIndexes, twoEmptyKeys)[0].value);
        assertEquals(expectedKeyArray[1].value, Key.setKeys(keyIndexes, twoEmptyKeys)[1].value);
    }


    @Test
    public void setThreeKeys() {
        keyIndexes= new int[]{1,1,1};
        expectedKeyArray  = new Key[]{new FirstKey("1"), new SecondKey("1"), new ThirdKey("1")};
        assertEquals(expectedKeyArray[0].value, Key.setKeys(keyIndexes, threeEmptyKeys)[0].value);
        assertEquals(expectedKeyArray[1].value, Key.setKeys(keyIndexes, threeEmptyKeys)[1].value);
        assertEquals(expectedKeyArray[2].value, Key.setKeys(keyIndexes, threeEmptyKeys)[2].value);
    }*/

}