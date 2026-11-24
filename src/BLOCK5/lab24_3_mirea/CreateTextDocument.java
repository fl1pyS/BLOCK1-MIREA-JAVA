package BLOCK5.lab24_3_mirea;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class CreateTextDocument implements ICreateDocument {
    public IDocument createNew() {
        return new TextDocument("");
    }

    public IDocument createOpen(Path path) throws IOException {
        return new TextDocument(Files.readString(path));
    }
}
