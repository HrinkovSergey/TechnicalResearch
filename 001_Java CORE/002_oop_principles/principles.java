
/*    ООП - парадигма программирования, основанная на модели окружающего мира, в которой основными концепциями являются
 понятия объектов и классов.
      В ООП все, что окружает нас является объектами, а эти объекты описываются классами
    Объект – описывает какую-либо сущность и является экземпляром класса.
    Класс – тип объектов, описывает их свойства и поведение.

    Разработка программ в ООП – это процесс написания классов, создание из них объектов и формирование логики приложения
с помощью их взаимодействия.

    Класс – это общий тип группы объектов, который описывает их свойства и поведение. Создавая класс мы определяем
основные параметры будущих экземпляров этого класса.
    2. Принципы ООП:
    - Абстракция – выделяем только те детали, которых нам достаточно для предоставления объекта; */
public abstract class Employee {
    private String name;
    private String address;
    private int number;
}

public class Developer extends Employee {
    private String rank;
}

/*  - Инкапсуляция – принцип черного ящика, скрываем реализацию; */
class MyClass {
    private String a = "test a";
    private String b = "test b";

    private String getA() {
        return a;
    }

    private String getB() {
        return b;
    }

    private void setA(final String a) {
        this.a = a;
    }

    private void setB(final String b) {
        this.b = b;
    }

}
/*  - Наследование  – процесс, посредством которого один объект может приобретать свойства другого */
public class Person {

    private String name;

    public String getName(){ return name; }

    public Person(String name){

        this.name=name;
    }

    public void display(){

        System.out.println("Name: " + name);
    }
}
public class Worker extends Person {

    private final String company;

    public Worker(String name, String company) {

        super(name);
        this.company = company;
    }

    public void work() {
        System.out.printf("%s works in %s \n", getName(), company);
    }
}

/*  - Полиморфизм – свойство системы использовать объекты с одинаковым интерфейсом без информации о типе и внутренней
структуре объекта. */
public class Dancer {

    public void dance() {
        System.out.println(toString() + "Я танцую как все.");
    }
}

public class ElectricBoogieDancer extends Dancer {
// переопределение метода базового класса
    @Override
    public void dance() {
        System.out.println( toString() + "Я танцую электрик буги!");
    }
}

public class BreakDankDancer extends Dancer{
// переопределение метода базового класса
    @Override
    public void dance(){
        System.out.println(toString() + "Я танцую брейк-данс!");
    }
}

    public static void main(String[] s) {

}

/*    3. Связанность модулей (coupling) – часто называемую зацеплением, характеризует степень независимости модулей(классов).
При проектировании систем необходимо стремиться, чтобы модули имели минимальную зависимость друг от друга, т.е. были
минимально “сцеплены” между собой(отсюда и термин “сцепление или связанность”). Это требование вытекает из одного из
основных принципов системного подхода, требующего минимизации информационных потоков между подсистемами.
    Связанность (cohesion) характеризует целостность, “плотность” модуля (класса), т.е. насколько модуль является простым с точки
зрения его использованиия. В идеале модуль должен выполнять одну единственную функцию и иметь минимальное число
“ручек управления”. Примером модуля имеющего максимальную связанность является модуль проверки орфографии. Если
связанность является характеристикой системы, то связанность характеризует отдельно взятый модуль.
 */