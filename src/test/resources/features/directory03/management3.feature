@management3
Feature: Management
  Scenario: TC01
    Given Kullanici "url" adresine gider
    Then Kullanici Login ikonunu tiklar
    And Kullanici username kutusununa "username" girer
    And Kullanici password kutusuna "password" girer
    And Kullanici Login butonunu tiklar
    And Kullanici Menu butonunu tiklar
    And Kullanici meet management linkini tiklar
    Then Kullanici student tiklar
    And Kullanici student secer