public class MarksModule {
private int math, science, english;
public MarksModule(int math, int science, int english) {
this.math = math;
this.science = science;
this.english = english;
}
public int totalMarks() {
return math + science + english;
}
public double averageMarks() {

return totalMarks() / 3.0;
}
public void displayMarks() {
System.out.println("Marks → Math:" + math + ", Science:" + science +
", English:" + english);
}
}