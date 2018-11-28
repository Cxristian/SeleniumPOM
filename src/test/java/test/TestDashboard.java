package test;

import framework.pages.GoogleLandingPage;
import org.testng.annotations.Test;

public class TestDashboard extends TestBase{
    @Test
    public void testGoogleLandingPage() {
        GoogleLandingPage googleLandingPage = new GoogleLandingPage();

        googleLandingPage
                .goTo()
                .setTextOnSearchTextField("Naruto")
                .clickOnSearchWithGoogleButton()
        .toolBar
            .clickOnImagesMenuItem();
    }
}
