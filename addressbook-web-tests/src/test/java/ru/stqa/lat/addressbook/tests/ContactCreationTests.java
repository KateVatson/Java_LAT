package ru.stqa.lat.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.lat.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test(enabled = false)
  public void testContactCreationTests() {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Test", "Testovich", "Testov", "TestCase", "Test title", "Tieto", "Saint-Petersburg", "+7(999)543-12-09", "test@mail.ru","test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();
  }

}