package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.legs.SonyLeg;

public class Robot2 implements IRobot {

    private SonyHead head;
    private SamsungHand hand;
    private SonyLeg leg;

    public Robot2(SonyHead head, SamsungHand hand, SonyLeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot2() {

    }

    public SonyHead getHead() {
        return head;
    }

    public void setHead(SonyHead head) {
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
