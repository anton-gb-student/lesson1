import runners.*;
import troubles.*;

public class Main {
    public static void main(String[] args) {
        Runner[] runners = new Runner[6]; // Массив бегунов
        runners[0] = new Human ("Вася", 1000, 2);
        runners[1] = new Human ("Петя", 3000, 3);
        runners[2] = new Robot (500, 2);
        runners[3] = new Robot (300, 1);
        runners[4] = new Cat ("Барсик", 100, 4);
        runners[5] = new Cat ("Мурзик", 150, 5);

        Trouble[] troubles = new Trouble[5]; // Массив препятствий
        troubles[0] = new RunDistance(100);
        troubles[1] = new Barrier(2);
        troubles[2] = new RunDistance(300);
        troubles[3] = new Barrier(4);
        troubles[4] = new RunDistance(500);

        for (Trouble trouble : troubles) { //Непосредственно бег с препятствиями
            for (Runner runner : runners) {
                if (runner.isRunning()) {
                    trouble.trial(runner);
                }
            }
        }

    }
}