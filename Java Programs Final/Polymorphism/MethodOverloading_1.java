class Wizard {
    private String name;

    public Wizard(String name) {
        this.name = name;
        System.out.println("Wizard " + name + " is ready to cast spells!");
    }

    public void castSpell() {
        System.out.println(name + " casts a basic spell: *Poof*! A puff of smoke appears.");
    }

    public void castSpell(String target) {
        System.out.println(name + " casts a spell on " + target + ": *Zap*! " + target + " turns into a frog.");
    }

    public void castSpell(String target, int intensity) {
        System.out.println(name + " casts a level " + intensity + " spell on " + target + ": *Boom*! " + target + " is now glowing.");
    }

    public void castSpell(String target, int intensity, String duration) {
        System.out.println(name + " casts a level " + intensity + " spell on " + target + " for " + duration + ": *Whoosh*! " + target + " is now floating.");
    }
}

public class  MethodOverloading_1{
    public static void main(String[] args) {
        Wizard kanthan = new Wizard("Kanthan");

        kanthan.castSpell(); 
        kanthan.castSpell("Prem"); 
        kanthan.castSpell("Sanjay", 5); 
        kanthan.castSpell("Rohith", 10, "5 minutes"); 
    }
}
