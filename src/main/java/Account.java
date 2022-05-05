public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean checkNameToEmboss(String name) {

        char[] nameArray = name.trim().toCharArray();
        String trimName = name.trim();
        int indexOfFirstMiddleSpace = trimName.indexOf(" ", 0);
        Character spaceChar = ' ';
        boolean isSpaceAfterSpace = spaceChar.equals(nameArray[indexOfFirstMiddleSpace + 1]);

        if (name.contains(" ") && name.length() >= 3 && name.length() <= 19 && !name.startsWith(" ") && !name.endsWith(" ") && !isSpaceAfterSpace) {
            return true;
        } else {
            return false;
        }
    }
}

