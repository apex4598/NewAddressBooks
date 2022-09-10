package com.bridgelabz;

public interface MultipleAddressBook {
    public void addAddressBook(String BookName, String FirstName, String LastName, String Address, String City,
                               int Zip, String State, long PhoneNumber, String Email);
    public void getContact();
    boolean equals(String firstName);
    public void editContact();
    public void deleteEntry();
    public boolean makechoice();
}
