package com.bridgelabz;

public class AddressbookMain {
    public static void main (String[] args)
    {
        AddressBookImplement obj = new AddressBookImplement();
       // AddressbookImplement bookBuilder=new AddressbookImplement();
      //  bookBuilder.makechoice();
        obj.makechoice();
        boolean condition = true;
        while(condition)
        {
           // boolean condition=bookBuilder.makechoice();
              condition = obj.makechoice();
            if (condition == false)
                break;
        }
    }
}
