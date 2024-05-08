package Lab;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Jon","302-587-9990");
        phonebook.add("Mark","609-455-1432");
        phonebook.add("Luke", "484-790-4934");

        System.out.println(phonebook);

        phonebook.remove("Jon");
        System.out.println(phonebook);
        ArrayList<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("917-579-3421");
        phoneNumbers.add("302-528-6720");

        phonebook.addAll("Bella", phoneNumbers);
        System.out.println(phonebook);

        phonebook.hasEntry("Benny");

        phonebook.lookUp("Bella");
        phonebook.reverseLookUp("609-455-1432");
        phonebook.getAllContactNames();



    }
}
