package runners;

public interface Runner { // Нужны методы для прыжка, бега и проверки состояния


    void run(int distance);

    void jump(int height);

    boolean isRunning();
}