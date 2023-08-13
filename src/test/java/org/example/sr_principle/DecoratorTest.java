package org.example.sr_principle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.structural.decorator.my_example.*;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

  @Test
  public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
    ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
    assertEquals(tree1.decorate(), "Christmas tree with Garland ");
    ChristmasTree tree2 = new Garland(new BubbleLights(new ChristmasTreeImpl()));
    assertEquals(tree2.decorate(), "Christmas tree with BubbleLights  with Garland ");
  }
}
