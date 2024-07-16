/*
Модификатор доступа:
private — доступ в текущем классе;
default — доступ внутри пакета и класса;
protected — доступ внутри класса, пакета и внутри иерархии классов ;
public — доступ всем.

Контсруктор — специальный метод, вызываемый при создании объекта и обеспечивающий инициализацию нового объекта.
    This:
    - как ссылка на текущий объект;
    - для вызова конструктора из другого конструктора */

public Person(String name) {
    this.name = name;
    }

public Person(){
    this("Ivan")
    }

/*    supper:
        - как ссылка на родительский класс;
        - для вызова конструктора родительского класса; */
//transient - переменная не участвует в серриализации
public class Doctor extends Person {
    private transient String degree;
}

public Doctor(String degree, String name) {
    super(name);
    this.degree = degree;
}


public static void main(String[] s) //— точка входа в программу
/*
Ключевое слово final
Применяется с :
    - классом — запрещает наследование
    - методом — запрещает overriding
    - атрибутом — запрещает изменение

final атрибут может инициализироваться в конструкторе класса
final атрибут объектного типа может изменять свое состояние */