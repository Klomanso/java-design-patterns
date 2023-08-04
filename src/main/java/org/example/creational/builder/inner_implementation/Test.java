package org.example.creational.builder.inner_implementation;

public class Test {

  // required
  private final String first;
  private final String second;

  // optional
  private final String third;
  private final String fourth;
  private final String fifth;

  private Test(TestBuilder builder) {
    this.first = builder.first;
    this.second = builder.second;
    this.third = builder.third;
    this.fourth = builder.fourth;
    this.fifth = builder.fifth;
  }

  public static TestBuilder builder() {
    return new TestBuilder();
  }

  @Override
  public String toString() {
    return "Test{"
        + "first='"
        + first
        + '\''
        + ", second='"
        + second
        + '\''
        + ", third='"
        + third
        + '\''
        + ", fourth='"
        + fourth
        + '\''
        + ", fifth='"
        + fifth
        + '\''
        + '}';
  }

  public String getFirst() {
    return first;
  }

  public String getSecond() {
    return second;
  }

  public String getThird() {
    return third;
  }

  public String getFourth() {
    return fourth;
  }

  public String getFifth() {
    return fifth;
  }

  public static class TestBuilder {
    private String first;
    private String second;

    private String third = "3";
    private String fourth = "4";
    private String fifth = "5";

    private TestBuilder() {}

    public TestBuilder withThird(String third) {
      this.third = third;
      return this;
    }

    public TestBuilder withFourth(String fourth) {
      this.fourth = fourth;
      return this;
    }

    public TestBuilder withFifth(String fifth) {
      this.fifth = fifth;
      return this;
    }

    public Test build() {
      return new Test(this);
    }
  }
}
