package troubles;

import runners.Runner;

public class RunDistance extends Trouble {
    int distance;

    public RunDistance(int x) {
        this.distance = x;
    } // объекту передается длина дистанции


    @Override
    public void trial(Runner runner) { // в метод передается объект типа Runner, через него вызывается метод бега
        runner.run(this.distance);

    }
}