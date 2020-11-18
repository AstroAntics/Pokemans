//Name
public class Pokemon {

    //Member Data
    private String name;
    private int hp = 100;
    private int att;
    private int powerLevel = 0;

    public enum Types {Fire, Water, Grass, Normal};

    Types type;

    //Constructors
    Pokemon() {

        type = Types.Normal;
        name = "Rattata";
        hp = 25;
        att = 10;
        powerLevel = 1;

    }


    //TODO: Constructor for me to make any pokemon I want

    //Functions Actions Methods

    public void Details()
    {
        System.out.println(name+" is a pokemon with "+hp+" hit points");
    }


    //TODO: Fight function that takes a rival pokemon as a parameter, and they fight until one is passed out


}
