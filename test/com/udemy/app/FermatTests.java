package com.udemy.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FermatTests {

  LucasSequence app;

  @Before
  public void setUp() throws Exception {
    app = new LucasSequence();
  }

  @Test
  public void test() {
    Assert.assertEquals(17, app.fermat(2));
    Assert.assertEquals(65537, app.fermat(4));
  }

}
