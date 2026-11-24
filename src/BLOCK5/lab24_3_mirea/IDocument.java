package BLOCK5.lab24_3_mirea;
import java.io.IOException;
import java.nio.file.Path;

public interface IDocument {
    String getText();
    void save(Path path, String text) throws IOException;
}
