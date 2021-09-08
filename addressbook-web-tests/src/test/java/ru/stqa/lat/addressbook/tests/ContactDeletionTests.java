package ru.stqa.lat.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test(enabled = false)
  public void testContactDeletion (){
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().isAlertAccept();
    app.goTo().GoToHome();
  }

}