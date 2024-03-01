public class Main {
    public static void main(String[] args) {

        int cost = 13676; // стоимость билета
        int difference = 20; // кол-во рублей до единицы миль

        int miles = (cost / difference); // кол-во миль

        System.out.println("Количество начисленных миль за купленный билет:" + miles);

    }
}