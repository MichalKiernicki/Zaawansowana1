package solid.lsp.fixed;

public class ReadOnlyFile implements FileReadable{
    @Override
    public byte[] read() {
        return new byte[0];
    }
}
