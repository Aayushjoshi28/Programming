/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-05T10:52:46+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Use_of_this_in_student.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-05T11:00:45+05:30
 */
//The following program shows the use of this() to avoid the name-space collision.

class Student{
  int rollno;
  String name, course;
  float fee;
  Student(int rollno,String name,String course) {
      this.rollno = rollno;
      this.name = name;
      this.course = course;
  }

  Student(int rollno, String name,String course,float fee) {
    this(rollno,name,course);
    this.fee = fee;
  }

  void display() {
    System.out.println(rollno+" "+name+" "+course+" "+fee);
  }
}

class Use_of_this_in_student {
  public static void main(String args[]) {
    Student s1 = new Student(111,"Aayush","Java");
    Student s2 = new Student(112,"Sourav","Mech",6000f);

    s1.display();
    s2.display();
  }
}
