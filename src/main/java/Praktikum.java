public class Praktikum {

    public static void main(String[] args) {
        String testingName = "   firstName         lastName         ";
        Account account = new Account(testingName);
        System.out.println(account.checkNameToEmboss(account.getName()));
    }

}