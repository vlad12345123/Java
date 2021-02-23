public class Runner {
    public static void main(String [] args) {
        Book[] books = {
                new Book(1, "Король и Лев", "Безымянный", false, 200),
                new Book(2, "ЯП С++", "Бьерн Страуструп", true, 300),
                new Book(3, "Война и Мир", "Лев Толстой", true, 300),
                new Book(4, "Принципы работы адронного колайдера", "Кирилл Глазко", true, 500),
                new Book(5, "Исповедь таксиста", "Арсений Остапенко", false, 300),
                new Book(6, "Атлас расправил плечи", "Айд Рэнд", true, 300),
                new Book(7, "Человек перед вопросом о смысле", "Виктор Франкл", false, 500),
                new Book(8, "Шрек", "...", true, 300),
                new Book(),
                null
        };

        for (int i = 0; i < books.length; ++i){
            for(int j = 3-1; j >= 0; j--) {
                if (books[i] != null) {
                    System.out.println(books[i].Show());
                }
            }
        }

        double totalPrice = 0;
        int counterIllustration = 0;

        for (Book book : books) {
            if (book != null) {
                totalPrice += book.getPrice();
                if (book.getIllustration())
                    ++counterIllustration;
            }
        }

        System.out.println("Total Price: " + totalPrice);
        System.out.println("Illustration count: " + counterIllustration);
    }
}
