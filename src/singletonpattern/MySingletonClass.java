package singletonpattern;

public class MySingletonClass {

    // create private constructor
    private MySingletonClass(){};

    // create static instance variable
    private static MySingletonClass INSTANCE;

    // create public static method to get the instance
    public MySingletonClass getINSTANCE() {

        if (INSTANCE == null) {
            synchronized (MySingletonClass.class){
                if(INSTANCE == null){
                    INSTANCE = new MySingletonClass();
                }
            }
        }
        return INSTANCE;
    }
}
