public class Primer2 {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");


        } catch (RuntimeException e) { // исключение перехвачено
            System.out.println("2 "+ e); // исключение обработано
        }
        System.out.println("3");
    }}
