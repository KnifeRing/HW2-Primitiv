public class Main {
    public static void main(String[] args) {

        int x = 13676; // стоимость билета
        int y = 20; // кол-во рублей до единицы миль

        int z = (x / y); // кол-во миль

        System.out.println("Количество начисленных миль за купленный билет:" + z);

    }
}