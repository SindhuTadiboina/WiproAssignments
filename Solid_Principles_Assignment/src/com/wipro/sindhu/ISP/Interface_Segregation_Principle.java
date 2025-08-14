package com.wipro.sindhu.ISP;

public class Interface_Segregation_Principle {
    public static void main(String[] args) {
        Workable human = new HumanWorker();
        human.work();

        Eatable lunchTime = new HumanWorker();
        lunchTime.eat();

        Workable robot = new RobotWorker();
        robot.work();
    }
}

// Interface: work behavior
interface Workable {
    void work();
}

// Interface: eat behavior (segregated)
interface Eatable {
    void eat();
}

// HumanWorker implements both Workable and Eatable
class HumanWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating lunch");
    }
}

// RobotWorker only implements Workable (does not eat)
class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot working");
    }
}
