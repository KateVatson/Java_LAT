package ru.stqa.lat.addressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.lat.addressbook.model.GroupData;
import ru.stqa.lat.addressbook.model.Groups;

import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class GroupModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().groupPage();
    if (app.group().all().size() == 0) {
      app.group().create(new GroupData().withName("test1"));
    }
  }

    @Test
    public void testGroupModification () {
      Groups before = app.group().all();
      GroupData modifiedGroup = before.iterator().next();
      GroupData group = new GroupData().
              withId(modifiedGroup.getId()).withName("test1").withHeader("test").withFooter("test3");
      app.group().modify(group);
      Groups after = app.group().all();
      Assert.assertEquals(after.size(), before.size());

      assertThat(after, equalTo(before.without(modifiedGroup).withAdded(group)));
    }
  }
