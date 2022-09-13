public class MyDate {
  int day;
  int month;
  int year;

  MyDate(){}

  MyDate(int d, int m, int y) {
    day = d;
    month = m;
    year = y;
  }

  public void setDate(int m, int d, int y) {
    day = d;
    month = m;
    year = y;
  }

  public String toString() {
    return month + "/" + day + "/" + year;
  }
  
}
