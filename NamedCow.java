class NamedCow extends Cow
{
	private String myName;     
    public NamedCow(String type, String sound, String name)     {         
        myType = type;         
        mySound = sound;
        myName = name;   
    }     
    public NamedCow()     {         
        myType = "Cow";         
        mySound = "Moo"; 
        myName = "Elise";   
    }      
    public String getName(){return myName;}    
}
