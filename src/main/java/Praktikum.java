public class Praktikum {

    public static void main(String[] args) {
        String testingName = "first  Namesss";
        Account account = new Account(testingName);
        System.out.println(account.checkNameToEmboss(account.getName()));
    }

}