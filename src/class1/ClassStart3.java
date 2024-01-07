package class1;

public class ClassStart3 {
    /*
     * 객체사용 - . (dot) 사용
     * 객체가 가진 멤버 변수에 접근하기 위해서는 먼저 객체에 접근해야한다.
     * 변수(student1)에 들어있는 참조값(x001)을 읽어서 메모리에 존재하는 객체에 접근
     * 그후 . (dot)을 사용해 멤버 변수들에 접근한다.
     * student1.name -> x001.name -> "학생1"
     * */
    public static void main(String[] args) {
        Student student1; //Student 타입을 받을 수 있는 변수 선언.
        /* new Student()로 객체 생성후 참조값 보관.
        * 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값을 반환한다.
        * */
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade );
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade );



    }
}
