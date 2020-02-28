package runners;

public class Human implements Runner {

    private int maxDistance;
    private int maxJumpHeight;
    private String name;
    private boolean isRunning;

    public Human(String name, int maxDistance, int maxJumpHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJumpHeight = maxJumpHeight;
        isRunning = true;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run(int distance) {
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
    public void jump(int height) {
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