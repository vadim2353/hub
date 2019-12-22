package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Robot3 implements IRobot {

    private SamsungHead head;
    private ToshibaHand hand;
    private ToshibaLeg leg;

    public Robot3(SamsungHead head, ToshibaHand hand, ToshibaLeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot3() {

    }

    public SamsungHead getHead() {
        return head;
    }

    public void setHead(SamsungHead head) {
        this.head = head;
    }

    public ToshibaHand getHand() {
        return hand;
    }

    public void setHand(ToshibaHand hand) {
        this.hand = hand;
    }

    public ToshibaLeg getLeg() {
        return leg;
    }

    public void setLeg(ToshibaLeg leg) {
        this.leg = leg;
    }
    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }
}
