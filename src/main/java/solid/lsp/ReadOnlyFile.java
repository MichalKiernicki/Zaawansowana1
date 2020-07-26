package solid.lsp;

public class ReadOnlyFile implements FileOperation {
    @Override
    public byte[] read() {
        return new byte[0];
    }

    //to jest bez sensu bo głównym przebiegiem programu nie powinno być rzucanie wyjątku(no chyba że metoda własnioe do tego ma służyć)
    @Override
    public void write(byte[] data) {
        throw new UnsupportedOperationException();
    }
}
