public class Main
{
    public static void main(String[] args)
    {

        Pokemon p1 = new Pokemon();
        Trainer red = new Trainer();

        Pokemon p2 = new Pokemon("Charzard",Pokemon.Types.Fire,100, 150, 25);

       // p2.Details();


        red.Catch(p2);

        red.Catch(p1);

        red.DisplayDeck();

       // p1.Details();
    }
}
