package util;

public class Time {
    public static float timeStarted = System.nanoTime(); // static vars are initialized at application start

    public static float getTime(){ return (float)((System.nanoTime() - timeStarted) * 1E-9);}

}
