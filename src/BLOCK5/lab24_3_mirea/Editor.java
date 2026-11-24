package BLOCK5.lab24_3_mirea;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.*;

public class Editor extends JFrame {
    private final ICreateDocument factory;
    private final JTextArea text = new JTextArea(18, 55);
    private final JFileChooser chooser = new JFileChooser();
    private IDocument document;
    private Path path;

    public Editor(ICreateDocument factory) {
        this.factory = factory;
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        add(new JScrollPane(text));

        JMenu file = new JMenu("File");
        addItem(file, "New", this::newDocument);
        addItem(file, "Open", this::openDocument);
        addItem(file, "Save", () -> saveDocument());
        addItem(file, "Exit", this::exitEditor);

        JMenuBar bar = new JMenuBar();
        bar.add(file);
        setJMenuBar(bar);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exitEditor();
            }
        });




        showDocument(factory.createNew(), null);
        pack();
        setLocationRelativeTo(null);
    }
    private void addItem(JMenu menu, String name, Runnable action) {
        JMenuItem item = new JMenuItem(name);
        item.addActionListener(e -> action.run());
        menu.add(item);
    }
    private void showDocument(IDocument next, Path nextPath) {
        document = next;
        path = nextPath;
        text.setText(document.getText());
        updateTitle();
    }
    private void updateTitle() {
        setTitle(path == null ? "Новый документ" : path.getFileName().toString());
    }
    private void newDocument() {
        if (confirmChanges()) showDocument(factory.createNew(), null);
    }
    private void openDocument() {
        if (chooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) return;
        Path selected = chooser.getSelectedFile().toPath();
        if (!confirmChanges()) return;
        try {
            showDocument(factory.createOpen(selected), selected);
        } catch (IOException e) {
            showError("Не удалось открыть файл.", e);
        }
    }
    private boolean saveDocument() {
        Path target = path;
        if (target == null) {
            if (chooser.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) return false;
            target = chooser.getSelectedFile().toPath();

            if (Files.exists(target)) {
                int answer = JOptionPane.showConfirmDialog(this, "Заменить существующий файл?",
                        "Сохранение", JOptionPane.YES_NO_OPTION);
                if (answer != JOptionPane.YES_OPTION) return false;
            }
        }
        try {
            document.save(target, text.getText());
            path = target;
            updateTitle();
            return true;
        } catch (IOException e) {
            showError("Не удалось сохранить файл.", e);
            return false;
        }
    }
    private boolean confirmChanges() {
        if (text.getText().equals(document.getText())) return true;
        int answer = JOptionPane.showConfirmDialog(this, "Сохранить изменения?",
                "Редактор", JOptionPane.YES_NO_CANCEL_OPTION);

        if (answer == JOptionPane.YES_OPTION) return saveDocument();
        return answer == JOptionPane.NO_OPTION;
    }
    private void exitEditor() {
        if (confirmChanges()) dispose();
    }
    private void showError(String message, IOException e) {
        JOptionPane.showMessageDialog(this, message + "\n" + e.getMessage(),
                "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
}