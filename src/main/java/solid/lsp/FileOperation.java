package solid.lsp;

public interface FileOperation {
    byte[] read();

    void write(byte[] data);
}
