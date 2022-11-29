class TooYoungEx extends RuntimeException
{
    TooYoungEx(String msg)
    {
        super(msg);
    }
}
class TooOldEx extends RuntimeException
{
    TooOldEx(String msg)
    {
        super(msg);
    }
}
class Test
{
    public static void main(String[] args) 
    {
        int age = 15;
        if(age>60)
        {
            throw new TooOldEx("No need to get Married");    
        }
        else if(age<18)
        {
            throw new TooYoungEx("Have Some Patience Bruh..");
        }
        else
        {
            System.out.println("Thanks For Registration");
        }
    }
}