import org.junit.Assert;
import org.junit.Test;

public class StringLengthTest {

    @Test
    public void nameLengthIs2Symbols(){
        Account account = new Account("ss");
        Assert.assertFalse("В строке не может быть менее трёх символов", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void nameLengthIs10Symbols(){
        Account account = new Account("qweas zxcq");
        Assert.assertTrue("В строке может быть от 3 до 19 символов, метод должен вернуть true", account.checkNameToEmboss(account.getName()));
    }

    @Test
    public void nameLengthIs25Symbols(){
        Account account = new Account("qweasdzxc qweasdzxcqeeeee");
        Assert.assertFalse("В строке не может быть более 19 символов", account.checkNameToEmboss(account.getName()));
    }

}
