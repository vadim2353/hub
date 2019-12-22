package by.teachmeskills.robot;

public class Run {
    public static void main(String[] args) {
        Robot1 robot1 = new Robot1();
        Robot2 robot2 = new Robot2();
        Robot3 robot3 = new Robot3();
        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.print("Robot1 самый дорогой");
        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.print("Robot2 самый дорогой");
        } else if (robot3.getPrice() > robot1.getPrice() && robot3.getPrice() > robot2.getPrice()){
            System.out.print("Robot3 самый дорогой");
        }

        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}
