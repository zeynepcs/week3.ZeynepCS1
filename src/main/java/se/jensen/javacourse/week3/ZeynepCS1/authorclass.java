package se.jensen.javacourse.week3.ZeynepCS1;

public class authorclass {

    private int age;
    private String firstname;
    private String lastname;


    public authorclass(int age, String firstname, String lastname)
    {

        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public int getage()
    {
        return age;
    }

    public String getfirstname()
    {
        return firstname;
    }

    public String getlastname()
    {
        return lastname;
    }


    public void setAgetage()
    {
        this.age=age;
    }

    public void setFirstname()
    {
        this.firstname=firstname;
    }

    public void setLastname()
    {
        this.lastname=lastname;
    }
}
