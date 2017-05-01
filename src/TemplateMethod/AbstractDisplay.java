package TemplateMethod;

/**
 * Created by hadoop on 17-2-13.
 * 抽象类
 */
public abstract class AbstractDisplay {

    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
