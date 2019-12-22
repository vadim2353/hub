package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.legs.SonyLeg;

public class Robot1 implements IRobot {
    private SamsungHead head;
    private SamsungHand hand;
    private SonyLeg leg;

    public Robot1(SamsungHead head, SamsungHand hand, SonyLeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot1() {

    }

    public SamsungHead getHead() {
        return head;
    }

    public void setHead(SamsungHead head) {
        this.head = head;
    }

    public SamsungHand getHand() {
        return hand;
    }

    public void setHand(SamsungHand hand) {
        this.hand = hand;
    }

    public SonyLeg getLeg() {
        return leg;
    }

    public void setLeg(SonyLeg leg) {
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
