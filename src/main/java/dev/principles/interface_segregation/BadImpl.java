package dev.principles.interface_segregation;

interface Worker1 {
    void work();
    void eat();
}

class HumanWorker1 implements Worker1 {
    public void work() {
        // Travaille
    }

    public void eat() {
        // Mange
    }
}

class RobotWorker1 implements Worker1 {
    public void work() {
        // Travaille
    }

    public void eat() {
        // Rien à faire, un robot n'a pas besoin de manger
    }
}

