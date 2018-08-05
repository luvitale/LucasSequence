package com.udemy.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PellTests {

  LucasSequence app;

  @Before
  public void setUp() throws Exception {
    app = new LucasSequence();
  }

  @Test
  public void test() {
    Assert.assertEquals(12, app.pell(4));
    Assert.assertEquals(985, app.pell(9));
  }

}
