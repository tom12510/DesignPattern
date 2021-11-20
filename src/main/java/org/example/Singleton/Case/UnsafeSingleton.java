package org.example.Singleton.Case;

public class UnsafeSingleton {
    private static UnsafeSingleton singleton = null;

    private UnsafeSingleton() {

    }

    public static UnsafeSingleton getSingleton() {
        if (singleton == null) {
            singleton = new UnsafeSingleton();
        }
        return singleton;
    }


}
