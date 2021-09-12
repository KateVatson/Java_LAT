package ru.stqa.lat.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.lat.addressbook.model.ContactData;

public class ContactPhoneTests  extends  TestBase {

  @Test (enabled = false)
  public void testContactPhones() {
    app.goTo().GoToHome();
    ContactData contact = app.contact().all().iterator().next();
  }

}
