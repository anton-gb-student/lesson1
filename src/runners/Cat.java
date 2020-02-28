package runners;

public class Cat implements Runner {

    private int maxDistance;
    private int maxJumpHeight;
    private String name;
    private boolean isRunning;

    public Cat(String name, int maxDistance, int maxJumpHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJumpHeight = maxJumpHeight;
        isRunning = true;
    }

    @Override
    public boolean isRunning() {
        return this.isRunning;
    } //Возвращает состояние. Если false - ушел с дистанции

    @Override
    public void run(int distance) { // Выводит на консоль сообщение об успехе или неуспехе попытки пробежать дистанцию
        if (distance <= 0) {
            System.out.println(name + " не понимает, что вы от него хотите...");
        } else if (distance <= maxDistance) {
            System.out.println(name + " пробежал дистанцию " + distance + " метров.");
        } else {
            System.out.println(name + " не может пробежать столько.");
            System.out.println(name + " выбывает из гонки.");
            this.isRunning = false;
        }

    }

    @Override
    public void jump(int height) { // Выводит на консоль сообщение об успешном или неудачном прыжке
        if (height <= 0) {
            System.out.println(name + " не понимает, что вы от него хотите...");
        } else if (height <= maxJumpHeight) {
            System.out.println(name + " перепрыгнул препятствие высотой " + height + " метров.");
        } else {
            System.out.println(name + " не может прыгнуть так высоко.");
            System.out.println(name + " выбывает из гонки.");
            this.isRunning = false;
        }
    }


}