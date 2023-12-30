package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] +
                    " 성적:" + studentGrades[i]);
        }
    }

    /*
     * ClassStart1의 문제인 잦은 코드 변경
     * ClassStart2에서는 배열을 통해 코드 변경을 최소화 한다.
     * (같은 타입의 값들을 묶어줌, 배열에 값만 넣으면 알아서 출력됨)
     *
     * 배열의 한계
     * 한 학생의 데이터가 각각 3개의 배열로 나누어져 있어
     * 학생 2의 데이터를 변경할 때 각 배열마다 학생 2의 인덱스로 정확하게 접근해야한다.
     *
     * 즉, 이름 나이 성적을 각각 따로 관리하는 것 보다
     * 학생이라는 하나의 개념으로 묶어서 관리하는 것이 효율적이다.
     * */
}
