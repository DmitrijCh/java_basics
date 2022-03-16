import java.util.*;

public class PhoneBook {
    private TreeMap<String, List<String>> phoneBook = new TreeMap<>();
    final static String REGEX_NAME = "^([a-zA-Zа-яА-я]+)$";
    final static String REGEX_PHONE = "^(79[0-9]{9})$";

    public boolean checkRegexContacts(String phone, String name) {
        return name.matches(REGEX_NAME) && phone.matches(REGEX_PHONE);
    }

    public boolean checkContainsName(String phone, String name) {
        return (checkRegexContacts(phone, name)) && ((phoneBook.containsKey(name)) && (!phoneBook.containsValue(phone)));
    }

    public boolean checkContainsPhone(String phone, String name) {
        return (checkRegexContacts(phone, name)) && ((!phoneBook.containsKey(name)) && (phoneBook.containsValue(phone)));
    }

    public boolean checkContainsNamePhone(String phone, String name) {
        return (checkRegexContacts(phone, name)) && ((!phoneBook.containsKey(name)) && (!phoneBook.containsValue(phone)));
    }

    public boolean checkInputName(String input) {
        return input.matches(REGEX_NAME);
    }

    public boolean checkInputPhone(String input) {
        return input.matches(REGEX_PHONE);
    }

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (checkContainsName(phone, name) || checkContainsNamePhone(phone, name)) {
            phoneBook.put(name, Collections.singletonList(phone));
            System.out.println("Контакт сохранен");
        } else if (checkContainsPhone(phone, name)) {
            for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
                if (Objects.equals(phone, entry.getValue())) {
                    phoneBook.put(name, phoneBook.remove(entry.getKey()));
                }
            }
        }
    }

    public String getNameByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        String output = "";
        if (phoneBook.containsValue(phone)) {
            Collection<String> collection = phoneBook.keySet();
            for (String key : collection) {
                Object obj = phoneBook.get(key);
                if (((Object) phone).equals(obj)) {
                    output = key + " - " + obj.toString();
                }
            }
        }
        return output;
    }

    public Set<String> getPhonesByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        if (phoneBook.containsKey(name)) {
            Set<String> output = new TreeSet<>();
            output.add(name + " - " + phoneBook.get(name));
            return output;
        } else {
            return new TreeSet<>();
        }
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        if (!phoneBook.isEmpty()) {
            Set<String> output = new TreeSet<>();
            Set<String> keys = phoneBook.keySet();
            for (String key : keys) {
                String getKeys = String.join(",", phoneBook.get(key));
                output.add(key + " - " + getKeys);
            }
            return output;
        } else {
            return new TreeSet<>();
        }
    }

    public void printAllContacts(Set<String> data) {
        if (data.size() > 0) {
            for (String key : data) {
                System.out.println(key);
            }
        } else {
            System.out.println("В телефонной книге нет данных");
        }
    }

    public void printContactsByPhone(String phone) {
        if (getNameByPhone(phone).length() > 0) {
            System.out.println(getNameByPhone(phone));
        } else {
            System.out.println("В телефонной книге нет данных");
        }
    }
}