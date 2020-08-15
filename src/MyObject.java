public class MyObject {

    private Object myPropertie;
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

    public Object getMyPropertie() {
        return myPropertie;
    }

    public void setMyPropertie(Object myPropertie) {
        this.myPropertie = myPropertie;
    }
}
