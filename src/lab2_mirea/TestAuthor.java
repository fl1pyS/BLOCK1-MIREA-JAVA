package lab2_mirea;

public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Maxim", "maksim@gmail.com", 'M');
        System.out.print(author);

        author.setEmail("max@gmail.com");

        System.out.println("Имя: " + author.getName());
        System.out.println("Почта: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());
    }
}
