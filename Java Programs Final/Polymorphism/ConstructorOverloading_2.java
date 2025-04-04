class MagicalPotion {
    private String potionName;
    private String color;
    private int potencyLevel; 
    private boolean isExplosive;

    public MagicalPotion() {
        this.potionName = "Mystery Potion";
        this.color = "Clear";
        this.potencyLevel = 1;
        this.isExplosive = false;
        System.out.println("Default potion created: " + this.potionName);
    }

    public MagicalPotion(String potionName, String color) {
        this.potionName = potionName;
        this.color = color;
        this.potencyLevel = 1;
        this.isExplosive = false;
        System.out.println("Potion created: " + this.potionName + " (" + this.color + ")");
    }

    public MagicalPotion(String potionName, String color, int potencyLevel) {
        this.potionName = potionName;
        this.color = color;
        this.potencyLevel = potencyLevel;
        this.isExplosive = false;
        System.out.println("Potion created: " + this.potionName + " (" + this.color + "), Potency: " + this.potencyLevel);
    }

    public MagicalPotion(String potionName, String color, int potencyLevel, boolean isExplosive) {
        this.potionName = potionName;
        this.color = color;
        this.potencyLevel = potencyLevel;
        this.isExplosive = isExplosive;
        System.out.println("Potion created: " + this.potionName + " (" + this.color + "), Potency: " + this.potencyLevel + ", Explosive: " + this.isExplosive);
    }

    public void displayPotionDetails() {
        System.out.println("\nPotion Details:");
        System.out.println("Name: " + potionName);
        System.out.println("Color: " + color);
        System.out.println("Potency Level: " + potencyLevel);
        System.out.println("Explosive: " + (isExplosive ? "Yes" : "No"));
    }

    public void usePotion() {
        if (isExplosive) {
            System.out.println(potionName + " exploded! ");
        } else {
            System.out.println("You used " + potionName + ". It has a potency level of " + potencyLevel + ".");
        }
    }
}

public class ConstructorOverloading_2{
    public static void main(String[] args) {
        MagicalPotion potion1 = new MagicalPotion();
        MagicalPotion potion2 = new MagicalPotion("Invisibility Potion", "Purple");
        MagicalPotion potion3 = new MagicalPotion("Strength Elixir", "Red", 8);
        MagicalPotion potion4 = new MagicalPotion("Chaos Brew", "Green", 10, true);

        potion1.displayPotionDetails();
        potion2.displayPotionDetails();
        potion3.displayPotionDetails();
        potion4.displayPotionDetails();

        potion1.usePotion();
        potion2.usePotion();
        potion3.usePotion();
        potion4.usePotion(); 
    }
}
