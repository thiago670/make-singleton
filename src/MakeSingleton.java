public class MakeSingleton {

    public static void main(String[] args) {

        MyObject myObject1 = MyObject.get(); //get new instance
        MyObject myObject2 = MyObject.get(); // get 'new' instance, is returned the already made instance instead.

        if (!(myObject1.equals(myObject2))) {
            throw new AssertionError("The objects 1 and 2 are different!");
        }
    }
}
