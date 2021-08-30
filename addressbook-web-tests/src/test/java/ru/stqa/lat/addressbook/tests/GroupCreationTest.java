package ru.stqa.lat.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.lat.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}