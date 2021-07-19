package ru.stqa.lat.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SqureTests {

  @Test
  public void testArea(){
    Square s = new Square(5);
    s.area();
    Assert.assertEquals(s.area(),25.0);
  }
}
