package interfaces;

public class Programer implements OOPCoding {
    @Override
    public void codeOOP(String lanuage) {
        System.out.println("Advanced coding in " + lanuage);
    }

    @Override
    public void code(String language) {
        System.out.println("Simple coding in " + language);
    }
}
