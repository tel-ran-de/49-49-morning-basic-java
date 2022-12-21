package lessons.lesson9;

public class Product {
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

    String product;
    double standartPrice;
    double discount;

    public Product(String product) {
        this.product = product;
    }

    public double actualPriceCalculate(){
        double priceWithDiscount = standartPrice* (1 - discount);

        return priceWithDiscount;
    }

    public void printInformaqtion(double priceWithDiscount){
        System.out.println(" Product name - " + product);
        System.out.println("Standart price - " + standartPrice);
        System.out.println("Discount - " + discount);
        System.out.println("Price with discount - " + priceWithDiscount);
        System.out.println("--------------------------");
    }
}
