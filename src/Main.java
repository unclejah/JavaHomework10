public class Main {
    public static void main(String[] args) {

        Author kreig = new Author("Крейг","Уоллс");
        Author shild = new Author("Гербет","Шилд");

        Book jav = new Book("Полное руководство", shild, 2011);
        Book spring = new Book("Spring в действии", kreig, 2005);

        System.out.println(spring.toString());
        System.out.println(jav.toString());

        System.out.println(spring.hashCode());
        System.out.println(shild.hashCode());

        System.out.println(spring.equals(jav));

    }
}