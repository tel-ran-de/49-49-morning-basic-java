package lessons.lesson9;

public class ProductDemo {
    public static void main(String[] args) {

        /*
        Разработать класс - продукт,
у которого должны быть следующие характеристики:

Свойства:
- Наименование (String name)
- Стандартная цена (double regularPrice)
- Скидка в процентах (double discount)

Методы:
1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".

Класс с объявлением продукта должен называться "Product".
Класс с демонстрацией работы должен называться "ProductDemo".
         */


        Product productMilk = new Product("Milk");
        productMilk.standartPrice = 1.5;
        productMilk.discount = 0.1;

        double actualPriceCalculate = productMilk.actualPriceCalculate();
        productMilk.printInformaqtion(actualPriceCalculate);


        System.out.println("--------------------------");

        Product productBread = new Product("Bread");
        productBread.standartPrice = 0.25;
        productBread.discount = 0.15;

        productBread.printInformaqtion(productBread.actualPriceCalculate());





    }
}
