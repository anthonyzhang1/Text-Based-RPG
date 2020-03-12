package entities;

public class NPC extends Entity {
    private int XP;

    public NPC(String name, int maxHP, int strength, int XP) {
        super(name, maxHP, strength);
        this.XP = XP;
    }

    public int getXP() { return XP; }
}