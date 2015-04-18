package Main;

/**
 * Created by Artur on 17.04.2015.
 */
/*
Stack
LIFO - Last input - first output
������:
push(int element); ������ ������� �� ����� ���� �����
pop(); ��������� ������ ������� ������ � ������� ��� �� �����
Task:
������� ����� Stack
    ����: ��� �������� ������ - ��������� � �������
    ������:
    push
    pop
    size
 */
    /*
    ���� ����������� �� �����, �� �� ��������� public
    public - � ����� � ������� ���� ������ �����
    private - � ����� � ������� ������ ���������� �����
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
