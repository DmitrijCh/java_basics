import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class EmailList {
    private TreeSet<String> treeSet = new TreeSet<>();

    public static boolean checkRightEmail(String email) {
        return email.matches("^([a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]+)$");
    }

    public void add(String email) {
        // TODO: валидный формат email добавляется
        if (checkRightEmail(email)) {
            treeSet.add(email.toLowerCase());
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        return new ArrayList<>(treeSet);
    }

    public void printSortedEmails() {
        if (getSortedEmails().size() == 0) {
            System.out.println("Cписок email пуст");
        } else {
            for (String treeElem : getSortedEmails()) {
                System.out.println(treeElem);
            }
        }
    }
}





















