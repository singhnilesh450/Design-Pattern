package Singleton;
/*Lazy initialization method to implement the singleton pattern creates the instance in the
global access method. Here is the sample code for creating the singleton class with this approach:*/
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
/* The preceding implementation works fine in the case of the single-threaded environment,
 but when it comes to multi-threaded systems, it can cause issues if multiple threads are inside
 the if condition at the same time. It will destroy the singleton pattern and both threads will get
 different instances of the singleton class. In the next section, we will see different ways to create
  a thread-safe singleton class.*/