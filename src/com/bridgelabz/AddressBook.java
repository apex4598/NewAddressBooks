package com.bridgelabz;

public class AddressBook {
    public String firstname, lastname;
    public String address, city, state;
    public int zip;
    public long phoneNumber;
    public String email;
    public String Address;
    public String FirstName;
    public String City;
    public String Email;
    public long PhoneNumber;
    public String State;
    public int Zip;

    public AddressBook(String firstname, String lastname, String address, String city, String state, int zip, String s, long phoneNumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
