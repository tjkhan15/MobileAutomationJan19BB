package articles;

import common.MobileAPI;
import home.MainPage;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ArticleTest extends MobileAPI {

    @Test
    public void testArticles(){
        MainPage mainPage = initElements(ad, MainPage.class);
        mainPage.goToArticles();
    }

}
