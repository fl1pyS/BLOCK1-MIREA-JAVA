package BLOCK5.lab24_2_mirea;
import java.util.Objects;

public class Client {
    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = Objects.requireNonNull(chair, "Нужно передать стул.");
    }

    public void sit() {
        if (chair == null) {
            throw new IllegalStateException("Сначала выберите стул.");
        }
        System.out.println("Клиент сел на " + chair.getName() + ".");
    }

    public void sit(Chair chair) {
        setChair(chair);
        sit();
    }
}
