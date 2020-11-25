//Name
public class Pokemon {

    //Member Data
    private String name;
    private int hp = 100;
    private int maxHp = 100;
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
        maxHp=25;

    }


    //TODO: Constructor for me to make any pokemon I want
    Pokemon(String _name, Types _type, int _hp, int _att, int _powerLevel)
    {
        name = _name;
        type = _type;
        hp = _hp;
        maxHp = _hp;
        att= _att;
        powerLevel = _powerLevel;
    }

    //Functions Actions Methods

    public void Details()
    {
        System.out.println(name+", Health: "+hp+"/"+maxHp);
        System.out.println("Attack Power: "+att);

        switch(type)
        {
            case Fire:
                System.out.println("Type: Fire");
                break;
            case Water:
                System.out.println("Type: Water");
                break;
            case Grass:
                System.out.println("Type: Grass");
                break;
            case Normal:
                System.out.println("Type: Normal");
                break;
            default:
                System.out.println("Type: ?????");
        }
    }


    //TODO: Fight function that takes a rival pokemon as a parameter, and they fight until one is passed out
    public Fight(Pokemon p)
    {
        System.out.println(p + "blocks the way!");
        GenerateActionMenu();
    }
    
    //Generates action menu, hence the name. Multiple choices depending on the circumstance.
    public void GenerateActionMenu()
    {
        System.out.println("Will you fight, flee, heal, or plead?");
    }


}
