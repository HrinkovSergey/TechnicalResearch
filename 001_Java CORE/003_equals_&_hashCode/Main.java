import java.util.ArrayList;
import java.util.List;

/*
       При переопределении метода equals разработчик должен придерживаться основных правил, определенных в спецификации
языка Java.
        - рефлексивность для любого заданного значенияx, выражение x.equals(x) должно возвращать true. Имеется в виду
такого, что x != null
        - симметричность для любых заданных значений x и y, x.equals(y) должно возвращать true только в том случае,
когда y.equals(x) возвращает true.
        - транзитивность для любых заданных значений x, y и z, если x.equals(y) возвращает true и y.equals(z) 
возвращает true, x.equals(z) должно вернуть значение true.
        - согласованность для любых заданных значений x и y повторный вызов x.equals(y) будет возвращать значение
предыдущего вызова этого метода при условии, что поля, используемые для сравнения этих двух объектов, не изменялись
между вызовами.
        - сравнение null для любого заданного значения x вызов x.equals(null) должен возвращать false. */

/*
    Хеш-функция функция свёртки — функция, осуществляющая преобразование массива входных данных произвольной длины в
(выходную) битовую строку установленной длины, выполняемое определённым алгоритмом(Детерминированный алгоритм).
Преобразование, производимое хеш-функцией, называется хешированием. Исходные данные называются входным массивом,
«ключом» или «сообщением». Результат преобразования (выходные данные) называется «хешем», «хеш-кодом», «хеш-суммой».

Контракт hashCode
    Для реализации хэш-функции в спецификации языка определены следующие правила:
        - вызов метода hashCode один и более раз над одним и тем же объектом должен возвращать одно и то же хэш-значение,
при условии что поля объекта, участвующие в вычислении значения, не изменялись.
        - вызов метода hashCode над двумя объектами должен всегда возвращать одно и то же число, если эти объекты равны
(вызов метода equals для этих объектов возвращает true).
        - вызов метода hashCode над двумя неравными между собой объектами должен возвращать разные хэш-значения. Хотя
это требование и не является обязательным, следует учитывать, что его выполнение положительно повлияет на
производительность работы хэш-таблиц.
*/


public class Main {
    public static void main(String[] args) {
        String name = "test";
        int age = 28;
        Object objectOne = new Object();
        Object objectTwo = new Object();
        getObjectInfo(objectOne, objectTwo);

        ObjectWithoutOverriding objectWithoutOverridingOne = new ObjectWithoutOverriding();
        ObjectWithoutOverriding objectWithoutOverridingTwo = new ObjectWithoutOverriding();
        objectWithoutOverridingOne.setName(name);
        objectWithoutOverridingOne.setAge(age);
        objectWithoutOverridingTwo.setName(name);
        objectWithoutOverridingTwo.setAge(age);
        getObjectInfo(objectWithoutOverridingOne, objectWithoutOverridingTwo);

        ObjectWithOverriding objectWithOverridingOne = new ObjectWithOverriding();
        ObjectWithOverriding objectWithOverridingTwo = new ObjectWithOverriding();
        objectWithOverridingOne.setName(name);
        objectWithOverridingOne.setAge(age);
        objectWithOverridingTwo.setName(name);
        objectWithOverridingTwo.setAge(age);
        getObjectInfo(objectWithOverridingOne, objectWithOverridingTwo);
    }

    private static <T> void getObjectInfo(T objectOne, T objectTwo){
        System.out.println("---------------" + objectOne.getClass().getSimpleName() + " one---------------");
        System.out.println("Hashcode: " + objectOne.hashCode());
        System.out.println("String: " + objectOne);
        System.out.println("---------------" + objectTwo.getClass().getSimpleName() + " two---------------");
        System.out.println("Hashcode: " + objectTwo.hashCode());
        System.out.println("String: " + objectTwo);
        System.out.println("-----------------");
        System.out.println("Equals: " + (objectOne.equals(objectTwo)));
    }
}