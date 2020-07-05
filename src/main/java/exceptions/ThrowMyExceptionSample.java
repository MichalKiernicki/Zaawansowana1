package exceptions;

public class ThrowMyExceptionSample {

    private void myExceptionCatcher() {
        int a = 1;
        String b = "AAA";
        if (a==1) {
            b = "CCC";
        }
        throw new MyExceptions("AAA, blad!");
    }

    private void myExceptionPasser() {
        myExceptionCatcher();
    }

    public static void main(String[] args) {
        ThrowMyExceptionSample sample = new ThrowMyExceptionSample();
        sample.myExceptionPasser();

    }
}
