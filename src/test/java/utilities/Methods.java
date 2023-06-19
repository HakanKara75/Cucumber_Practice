package utilities;

import pages.manage.Kisi_Ekleme_Guncelleme_Modulu;

public class Methods {
    Kisi_Ekleme_Guncelleme_Modulu login = new Kisi_Ekleme_Guncelleme_Modulu();
    public void loginMethod(String username, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("manageUrl"));
        login.login.click();

        switch (username){
            case "deanName":
                login.username.sendKeys(ConfigReader.getProperty("deanName"));
                break;
            case "deanUsername":
                login.username.sendKeys(ConfigReader.getProperty("deanUsername"));
                break;
            case "viceDeanUsername":
                login.username.sendKeys(ConfigReader.getProperty("viceDeanUsername"));
                break;
            case "teacherUsername":
                login.username.sendKeys(ConfigReader.getProperty("teacherUsername"));
                break;
            case "studentUsername":
                login.username.sendKeys(ConfigReader.getProperty("studentUsername"));
                break;
            default:
                break;

        }

        login.loginPasword.sendKeys(ConfigReader.getProperty(password));

        login.UyeGirisKismiLoginButton.click();

    }


}
