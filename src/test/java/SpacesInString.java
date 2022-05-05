import org.junit.Assert;
import org.junit.Test;

public class SpacesInString {

    @Test
    public void spaceAtStart() {
        Account account = new Account(" qweasd sss");
        Assert.assertFalse("В начале строки не должно быть пробела", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void spaceAtEnd(){
        Account account = new Account("qweasd sss ");
        Assert.assertFalse("В конце строки не должно быть пробела", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void moreOneSpaceInMiddle(){
        Account account = new Account("qweasd  sss");
        Assert.assertFalse("Внутри строки не может быть более одного пробела", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void oneSpaceInMeddle(){
        Account account = new Account("123 456");
        Assert.assertTrue("Метод должен вернуть true, допускается не более одного пробела в строке", account.checkNameToEmboss(account.getName()));
    }

}
