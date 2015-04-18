package Main;

/**
 * Created by Artur on 17.04.2015.
 */
/*
Stack
LIFO - Last input - first output
Методы:
push(int element); кладет элемент на самый верх стека
pop(); извлекает первый элемент сверху и убирает его из стека
Task:
Создать класс Stack
    Поле: для хранения данных - коллекция с данными
    Методы:
    push
    pop
    size
 */
    /*
    если модификатор не стоит, то по умолчанию public
    public - к полям и методам есть доступ извне
    private - к полям и методам нельзя обратиться извне
    protect
     */
public class main {
    public static void main(String[] args) {
        Stack<String> Stack1 = new Stack<String>();
        Stack1.push("111");
        Stack1.push("2222");
        Stack1.push("3333");
        System.out.println(Stack1.size());
        System.out.println(Stack1.pop());
        System.out.println(Stack1.pop());
        System.out.println(Stack1.pop());
        Rectangle r = new Rectangle(14,4);
        r.print();
        System.out.println(r.getSquare());
        Triangle t = new Triangle(14,4,8);
        t.print();
        System.out.println(t.getSquare());
        Cycle c = new Cycle(14);
        c.print();
        System.out.println(c.getSquare());
    }
}
