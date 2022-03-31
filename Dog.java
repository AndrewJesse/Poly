
public class Dog extends Animal
{
    private int breed;
    public void eat() 
    {
        System.out.println("Chomp Chomp");
    }
    
    public int getBreed()
    {
        return breed;
    }

    public void setBreed(int breed)
    {
        this.breed = breed;
    }
}
