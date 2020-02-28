package troubles;

import runners.Runner;

public class Barrier extends Trouble {
    int heihgt;

    public Barrier(int x) {
        this.heihgt = x;
    } // При создании объекта ему передается значение высоты


    @Override
    public void trial(Runner runner) { //вызывается объект типа Runner, а через него - метод прыжка
        runner.jump(this.heihgt);

    }
}