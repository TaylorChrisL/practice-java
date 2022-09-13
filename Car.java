public class Car {
  String color;
  String type;

  Car(String c, String t) {
    color = c;
    type = t;
  }

  void start() {
    System.out.println("Get Started!");
  }

  void printDescription() {
    System.out.println("This is a " + color + " " + type);
  }
}
