package tensors.keys;

import tensors.keys.examples.FirstKey;
import tensors.keys.examples.SecondKey;
import tensors.keys.examples.ThirdKey;
import tensors.service.Array;

public class Key {

    public String value;

    // this is done for creating the keys for future without the value of the key
    // because at the time called we don't need value yet
    public Key(){
        this.value = "";
    }


    public Key(String value) {
        this.value = value;
    }


    //if there are not 1 2 or 3 dimensions than it's not available to create enough keys
    //in particular case of 0 dimensions then there're no keys at all(formally)
    // this method is just not called
    public static Key[] createKeys(int dimensions){

        FirstKey firstKey = new FirstKey();
        SecondKey secondKey = new SecondKey();
        ThirdKey thirdKey = new ThirdKey();

        switch(dimensions){
            case 1:
                return new Key[]{firstKey};
            case 2:
                return new Key[]{firstKey,secondKey};
            case 3:
                return new Key[]{firstKey,secondKey,thirdKey};
            default:
                return null;
        }
    }


    /**
     * indexes tell the exact place in tensor:
     * (FirstKey : 1, SecondKey : 1, ThirdKey : 12)
     * and then the object will be placed at (1,1,12)
     *
     * keys are the array who tell how many keys are in tensor
     *
     * */
    public static Key[] setKeys(int[] indexes, Key[] keys) {

        String[] indexesString = Array.castIntToString(indexes);
        /*
        First key exists always so i initialize it
        the other two will be initialized if you want 2 or 3 keys in tensor
         */
        FirstKey firstKey = new FirstKey(indexesString[0]);
        SecondKey secondKey;
        ThirdKey thirdKey;


        //It returns as many initialized keys as needed(1<keys<3)
        //but at least one key and no more than 3
        switch (keys.length){
            case 2:
                secondKey = new SecondKey(indexesString[1]);
                return new Key[]{firstKey,secondKey};
            case 3:
                secondKey = new SecondKey(indexesString[1]);
                thirdKey = new ThirdKey(indexesString[2]);
                return new Key[]{firstKey,secondKey,thirdKey};
            default:
                return new Key[]{firstKey};
        }
    }
}
