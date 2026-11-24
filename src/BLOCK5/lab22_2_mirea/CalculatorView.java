package BLOCK5.lab22_2_mirea;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JPanel {
    private static final Color INK = new Color(0x18263B);
    private static final Color BLUE = new Color(0x175BC7);
    private static final Color SLATE = new Color(0x455874);
    private static final Color RED = new Color(0xA62632);

    private final JTextField input = new JTextField(24);
    private final JTextArea result = new JTextArea("Результат появится здесь", 2, 1);
    private final JButton calculate = new JButton("=");

    public CalculatorView() {
        setLayout(new BorderLayout(0, 12));
        setBackground(new Color(0xF3F6FB));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Калькулятор ОПН");
        title.setFont(title.getFont().deriveFont(Font.BOLD, 23f));
        title.setForeground(INK);

        JLabel hint = new JLabel("Пример: 4 5 -     Числа разделяй пробелами");
        hint.setForeground(SLATE);

        input.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        input.setForeground(INK);
        input.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(0xA6B7CF)),
                BorderFactory.createEmptyBorder(8, 10, 8, 10)));

        result.setEditable(false);
        result.setLineWrap(true);
        result.setWrapStyleWord(true);
        result.setFont(result.getFont().deriveFont(Font.BOLD, 15f));
        result.setForeground(SLATE);
        result.setBackground(new Color(0xE5EDF9));
        result.setBorder(BorderFactory.createEmptyBorder(8, 10, 8, 10));

        JPanel display = new JPanel();
        display.setLayout(new BoxLayout(display, BoxLayout.Y_AXIS));
        display.setOpaque(false);

        for (JComponent component : new JComponent[]{title, hint, input, result}) {
            component.setAlignmentX(LEFT_ALIGNMENT);
            if (display.getComponentCount() > 0) {
                display.add(Box.createVerticalStrut(6));
            }
            display.add(component);
        }

        JPanel keys = new JPanel(new GridLayout(4, 4, 8, 8));
        keys.setOpaque(false);

        String[] labels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "+", "="
        };

        for (String label : labels) {
            JButton button;

            if (label.equals("=")) {
                button = calculate;
                styleButton(button, BLUE, Color.WHITE, 44);
            } else {
                button = new JButton(label);
                Color background = Color.WHITE;

                if ("+-*/".contains(label)) {
                    background = new Color(0xDCE9FC);
                }

                styleButton(button, background, INK, 44);
                button.addActionListener(e -> pressKey(label));
            }

            keys.add(button);
        }

        JPanel tools = new JPanel(new GridLayout(1, 3, 8, 0));
        tools.setOpaque(false);

        for (String label : new String[]{"Очистить", "Стереть", "Пробел"}) {
            JButton button = new JButton(label);
            styleButton(button, Color.WHITE, INK, 36);
            button.addActionListener(e -> pressKey(label));
            tools.add(button);
        }

        JPanel keypad = new JPanel(new BorderLayout(0, 8));
        keypad.setOpaque(false);
        keypad.add(tools, BorderLayout.NORTH);
        keypad.add(keys, BorderLayout.CENTER);

        add(display, BorderLayout.NORTH);
        add(keypad, BorderLayout.CENTER);
    }

    private void styleButton(JButton button, Color background, Color foreground, int height) {
        button.setFont(button.getFont().deriveFont(Font.BOLD, 16f));
        button.setPreferredSize(new Dimension(85, height));
        button.setBorder(BorderFactory.createLineBorder(new Color(0xC4D2E5)));
        button.setBackground(background);
        button.setForeground(foreground);
        button.setOpaque(true);
    }

    private void pressKey(String key) {
        String text = input.getText();

        switch (key) {
            case "Очистить":
                input.setText("");
                result.setForeground(SLATE);
                result.setText("Результат появится здесь");
                break;
            case "Стереть":
                if (!text.isEmpty()) {
                    input.setText(text.substring(0, text.length() - 1));
                }
                break;
            case "Пробел":
                if (!text.isEmpty() && !text.endsWith(" ")) {
                    input.setText(text + " ");
                }
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                String expression = text.stripTrailing();
                if (!expression.isEmpty()) {
                    expression += " ";
                }
                input.setText(expression + key + " ");
                break;
            default:
                input.setText(text + key);
        }

        input.setCaretPosition(input.getDocument().getLength());
        input.requestFocusInWindow();
    }

    public void onCalculate(ActionListener listener) {
        calculate.addActionListener(listener);
        input.addActionListener(listener);
    }

    public String getExpression() {
        return input.getText();
    }

    public void showResult(String message) {
        result.setForeground(INK);
        result.setText(message);
        result.setCaretPosition(0);
    }

    public void showError(String message) {
        result.setForeground(RED);
        result.setText(message);
        result.setCaretPosition(0);
    }
}