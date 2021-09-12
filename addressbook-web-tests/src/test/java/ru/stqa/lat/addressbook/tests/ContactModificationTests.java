package ru.stqa.lat.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.lat.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test(enabled = false)
  public void testContactModification () {
    app.contact().editContact();
    app.contact().fillContactForm(new ContactData("Ivan", "Ivanovich", "Ivanov", "TestCase", "Test title", "Tieto", "Saint-Petersburg", "+7(900)543-12-09", "drugoytest@mail.ru", null), false);
    app.contact().submitContactModification();
    app.goTo().returnToHomePage();
  }



}