public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("hi", 2, 12.4);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("bye", 1, 8.2);
        cat2.introduce();
        cat2.printCatInfo();
    }
}