package by.teachmeskills.robot.heads;

public class ToshibaHead implements IHead {

    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speek() {
        System.out.print("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
