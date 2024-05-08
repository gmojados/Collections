package Lab;

import java.util.*;

public class Phonebook {

    private Map<String, List<String>> phoneRecord;

    public Phonebook() {
        this(new HashMap<>());
    }

    public Phonebook(Map<String, List<String>> phoneRecord) {
        this.phoneRecord = phoneRecord;
    }

    public void add(String name, String phoneNumber) {
        List<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        phoneRecord.put(name, numbers);
    }

    public void addAll(String name, List<String> phoneNumbers) {
        //put the record in the map by key and values
        List<String> numbersInPhonebook = phoneRecord.getOrDefault(name, new ArrayList<>());
        numbersInPhonebook.addAll(phoneNumbers);
        phoneRecord.put(name,numbersInPhonebook);
    }

    public void remove(String name) {
        phoneRecord.remove(name);
    }

    public boolean hasEntry(String name) {
        if (phoneRecord.containsKey(name)) {
            System.out.println(name + " Does exist in phonebook " + true);
            return true;
        } else {
            System.out.println(name + " Does not exist in Phonebook " + false);
            return false;
        }
    }
    public List<String> lookUp (String name) {
        List<String> numbers = phoneRecord.get(name);
        System.out.println(name + " Number(s): " + numbers);
        return numbers;
    }
    public String reverseLookUp (String phoneNumber){
        for (Map.Entry<String, List<String>> entry : phoneRecord.entrySet()) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            if (phoneNumbers.contains(phoneNumber)) {
                System.out.println("Number is matched to: " + name);
                return name;
            }
        }
        return null;
    }

    public List<String> getAllContactNames () {
        Iterator<Map.Entry<String, List<String>>> iteratorObject = phoneRecord.entrySet().iterator();
        while (iteratorObject.hasNext()) {
            Map.Entry<String, List<String>> entry = iteratorObject.next();
            System.out.println(entry.getKey());

        } return null;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "phoneRecord=" + phoneRecord +
                '}';
    }
}
