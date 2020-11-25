public class Trainer
{
    private Pokemon[] deck;
    private String name;
    private int pokeballCount = 10;
    private int money = 1000;

    public Trainer()
    {
        deck = new Pokemon[6];
        name = "Ash";
    }


    //TODO: Catch Function, So that trainers can catch wild pokemon.
    public void Catch(Pokemon p)
    {
        for(int i=0; i < deck.length; i++)
        {
            if(deck[i] == null)
            {
                deck[i] = p;
                break;
            }

        }

    }


    public void DisplayDeck()
    {
        for (int i = 0; i < deck.length; i++)
        {

            if(deck[i] != null)
            {
                System.out.println("==============");
                deck[i].Details();
            }
        }
    }


}
