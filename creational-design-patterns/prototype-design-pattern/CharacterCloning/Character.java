public class Character implements Cloning{
    private String name;
    private int health;
    private int attackPower;
    private int defensePower;
    private String specialAbility;

    public Character(String name, int health, int attackPower, int defensePower, String specialAbility){
        this.name=name;
        this.health=health;
        this.attackPower=attackPower;
        this.defensePower=defensePower;
        this.specialAbility=specialAbility;
    }

    public void setName(String name){
        this.name=name;
    }

    public Character(Character character){
        this.name=character.name;
        this.health=character.health;
        this.attackPower=character.attackPower;
        this.defensePower=character.defensePower;
        this.specialAbility=character.specialAbility;
    }

    @Override
    public Character clone(){
        return new Character(this);
    }

    @Override
    public String toString(){
        return "Character {" +
            "name="+name +
            ",health="+health+
            ",attackPower="+attackPower+
            ",defensePower="+defensePower+
            ",specialAbility="+specialAbility+
        "}";
    }

}
