package com.blz.day_10_assignment;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.editContact();
        addressBook.deleteContact();
        addressBook.checkDuplicateContact();
        addressBook.searchByCityOrState();
        addressBook.NoOfContactPersons();
    }
}
