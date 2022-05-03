import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean checkNameToEmboss(String name) {
        //Метод удалит пробелы в начале и конце строки, а также удалит лишние пробелы внутри строки, оставив только один пробел
        name = StringUtils.normalizeSpace(name);
        name = name.toUpperCase();
        //Дальше проверка на длину символов и содержание пробела внутри строки
        if (name.contains(" ") && name.length() >= 3 && name.length() <= 19) {
            return true;
        } else {
            return false;
        }
    }
}

