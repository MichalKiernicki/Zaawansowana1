package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryFinallySample {
    public void readFile(String filename) throws IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            return;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        } finally {
            reader.close();
        }
    }

    public void readFileWriteResources(String filename) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) { // do takiego zapisu nie trzeba dopisywać reader.close() na końcu

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }
}