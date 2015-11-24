class Chick implements Animal 
{     
    public String myType;
    private String mySound;
    private String mySound2;      
    public Chick(String type, String sound, String sound2)     {         
        myType = type;         
        mySound = sound;
        mySound2 = sound2;   
    }     
    public Chick()     {         
        myType = "chick";         
        mySound = getSound(); 
        mySound2 = getSound();  
    } 

    public String getSound()
    {
    	if(Math.random() > 0.5)
    	{
    		return mySound;
    	}
    	else 
    	{
    		return mySound2;
    	}

    }     
    public String getType(){return myType;} //your code here
}
