package org.example.structural.proxy;

// Proxy class.
public class ImageProxy implements Image {

  private final String name;

  private BitmapImage image;

  private Point2D location;

  public ImageProxy(String name) {
    this.name = name;
  }

  @Override
  public Point2D getLocation() {
    if (image != null) {
      return image.getLocation();
    }
    return location;
  }

  @Override
  public void setLocation(Point2D point2d) {
    if (image != null) {
      image.setLocation(point2d);
    } else {
      location = point2d;
    }
  }

  @Override
  public void render() {
    if (image == null) {
      image = new BitmapImage(name);
      if (location != null) {
        image.setLocation(location);
      }
    }
    image.render();
  }
}
