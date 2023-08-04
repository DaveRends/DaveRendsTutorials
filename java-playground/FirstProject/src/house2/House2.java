package house2;
// write your answer here
public class House2
{
    private String material;
    private int age;
    
    public House2 (String aMaterial, int anAge)
    {
        material = aMaterial;
        age = anAge;
    }
    
    public String getMaterial()
    {
        return material;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setMaterial(String aMaterial)
    {
        material = aMaterial;
    }
    
    public void setAge(int anAge)
    {
        age = anAge;
    }
    
    public String about()
    {
        String description = "A " + material + " house of " + " age " + age;
        return description;
    }
    
    public boolean equals(House2 aHouse)
    {
        if (this.getAge() == aHouse.getAge() && this.getMaterial().equals(aHouse.getMaterial()))
        {
            return true;
        }
        else
        {return false;}
    }
}