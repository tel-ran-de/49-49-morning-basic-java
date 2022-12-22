package lessons.lesson10;

 class Circle {

    /*
    Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".
     */

     double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return  Math.pow(radius,2)*Math.PI;
    }
}
