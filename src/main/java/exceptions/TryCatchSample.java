package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchSample {

    public void sleepthread(long millis) {
        try { //alt+enter
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("blad w sleepThread"); // wlasny opis
            e.printStackTrace(); //samo opisuje blad
        }
    }

    public void sleepAndReadFile(long millis, String filename) {
        try {
            Thread.sleep(millis);
            new FileReader(filename);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void sleepAndReadFileMultiCatch(long millis, String filename) {
        try {
            Thread.sleep(millis);
            new FileReader(filename);
        }
        // od javy 1.8
        catch (InterruptedException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void sleepAndReadFileCatchHierarchy(long millis, String filename) {
        try {
            Thread.sleep(millis);
            new FileReader(filename);
        } catch (InterruptedException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("more generic exception coight");
        }
    }
}

