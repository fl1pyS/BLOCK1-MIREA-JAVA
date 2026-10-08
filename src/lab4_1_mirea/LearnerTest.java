package lab4_1_mirea;

public class LearnerTest {
    public static void main(String[] args) {
        Learner[] learners = {
                new Schoolboy("Иван", 9),
                new Student("Анна", 2),
                new Schoolboy("Мария", 11),
                new Student("Пётр", 1)
        };

        System.out.println("Студенты:");
        for (Learner learner : learners) {
            if (learner instanceof Student) {
                System.out.println(learner);
            }
        }

        System.out.println("\nШкольники:");
        for (Learner learner : learners) {
            if (learner instanceof Schoolboy) {
                System.out.println(learner);
            }
        }
    }
}