package ru.stqa.lat.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test(enabled = false)
  public void testContactDeletion (){
    app.contact().selectContact();
    app.contact().deleteSelectedContacts();
    app.contact().isAlertAccept();
    app.goTo().GoToHome();
  }

}