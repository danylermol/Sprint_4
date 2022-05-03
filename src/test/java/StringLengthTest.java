import org.junit.Assert;
import org.junit.Test;

public class StringLengthTest {

    //Прошёлся по КЭ и ГЗ

    @Test
    public void stringLengthIs1Symbol() {
        //Всего 44 символов в строке, после работы метода должен быть 1 символ
        Account account = new Account("                        a                   ");
        Assert.assertFalse("В строке не может быть менее трёх символов", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void stringLengthIs2Symbols() {
        //Всего 45 символов в строке, после работы метода должно быть 2 символа
        Account account = new Account("                        ab                   ");
        Assert.assertFalse("В строке не может быть менее трёх символов", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void stringLengthIs3Symbols() {
        //Всего 70 символов в строке, после работы метода должно быть 3 символа
        Account account = new Account("                        a                         b                   ");
        Assert.assertTrue("Метод должен вернуть true, в строке может быть не менее трёх символов и не более девятнадцати символов", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void stringLengthIs4Symbols() {
        //Всего 71 символ в строке, после работы метода должно быть 4 символа
        Account account = new Account("                        ab                         w                   ");
        Assert.assertTrue("Метод должен вернуть true, в строке может быть не менее трёх символов и не более девятнадцати символов", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void stringLengthIs8Symbols() {
        //Всего 75 символов в строке, после работы метода должно быть 8 символа
        Account account = new Account("                        abw                         wqwe                   ");
        Assert.assertTrue("Метод должен вернуть true, в строке может быть не менее трёх символов и не более девятнадцати символов", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void stringLengthIs18Symbols() {
        //Всего 85 символов в строке, после работы метода должно быть 18 символов
        Account account = new Account("                        abdsfdeewqw                         wqaqwe                   ");
        Assert.assertTrue("Метод должен вернуть true, в строке может быть не менее трёх символов и не более девятнадцати символов", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void stringLengthIs19Symbols() {
        //Всего 86 символов в строке, после работы метода должно быть 19 символов
        Account account = new Account("                        abdsfdeewqw                         wqxaqwe                   ");
        Assert.assertTrue("Метод должен вернуть true, в строке может быть не менее трёх символов и не более девятнадцати символов", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void stringLengthIs20Symbols() {
        //Всего 87 символов в строке, после работы метода должно быть 20 символов
        Account account = new Account("                        abdsfdaeewqw                         wqaqswe                   ");
        Assert.assertFalse("Метод должен вернуть false, в строке может быть не менее трёх символов и не более девятнадцати символов", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void stringLengthIs30Symbols() {
        Account account = new Account("                        abdsfdaeewqw                         wqssssssssssaqswe                   ");
        Assert.assertFalse("Метод должен вернуть false, в строке может быть не менее трёх символов и не более девятнадцати символов", account.checkNameToEmboss(account.getName()));
    }

}
