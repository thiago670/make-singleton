public final class MyObject {

    private static MyObject currentObject = null;

    private MyObject() {
    }

    public static MyObject get() {
        if (currentObject == null) {
            return currentObject = new MyObject();
        } else {
            return currentObject;
        }
    }

}
