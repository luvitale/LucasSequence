package com.udemy.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JacobsthalTests {

  LucasSequence app;

  @Before
  public void setUp() throws Exception {
    app = new LucasSequence();
  }

  @Test
  public void test() {
    Assert.assertEquals(11, app.jacobsthal(5));
    Assert.assertEquals(2731, app.jacobsthal(13));
  }

}
