package BLOCK5.lab24_3_mirea;
import java.io.IOException;
import java.nio.file.Path;

public interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen(Path path) throws IOException;
}