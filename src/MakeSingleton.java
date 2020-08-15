public class MakeSingleton {

    public static void main(String[] args) {

        MyObject myObject1 = MyObject.get();
        myObject1.setMyPropertie("Hello world!");

        MyObject myObject2 = MyObject.get();

        assert (myObject1.equals(myObject2));
        assert (myObject2.getMyPropertie().equals("Hello World!"));

    }
}
