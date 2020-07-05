package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowExceptionSample {
    public void sleepThread() throws InterruptedException {
        Thread.sleep(5);
    }
    public void sleepThreadAndReadFile() throws InterruptedException, FileNotFoundException {
        Thread.sleep(5);
        new FileReader("aaa.abc");
    }
    public void sleepThreadAndReadFileCommon() throws Exception {
        Thread.sleep(5);
        new FileReader("aaa.abc");
    }
    public void sleepThreadEx1() throws InterruptedException {
        Thread.sleep(5);
    }
    public void readFileEx2() throws FileNotFoundException {
        new FileReader("aaa.abc");
    }
    public void sleepAndRead() throws Exception {
        sleepThreadEx1();
        readFileEx2();
    }
}
