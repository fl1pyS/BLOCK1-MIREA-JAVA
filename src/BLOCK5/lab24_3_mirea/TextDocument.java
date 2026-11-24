package BLOCK5.lab24_3_mirea;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextDocument implements IDocument {
    private String text;
    public TextDocument(String text) {
        this.text = text;
    }
    public String getText() { return text; }
    public void save(Path path, String text) throws IOException {
        Files.writeString(path, text);
        this.text = text;
    }
}