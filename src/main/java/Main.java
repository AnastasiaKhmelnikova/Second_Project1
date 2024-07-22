public class Main {
    public static void main(String[] args) {

        int priceTicket = 10000; //переменная для хранения стоимости билета
        int quantityRubForOwnMili = 20; //переменная для хранения количества рублей для одной бонусной мили
        int quantityMili = (priceTicket / quantityRubForOwnMili); // формула для расчёта кол-ва миль за билет
        System.out.println("Итого вы получите: " + quantityMili + " миль"); //вывод на экран
    }
}

//кол-во миль(int) = цена за билет(int)/20(int)
