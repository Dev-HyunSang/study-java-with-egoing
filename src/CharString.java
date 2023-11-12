// 2023.11.12 - 생활코딩 Java - 문자열
public class CharString {
    public static void main(String[] args) {
        System.out.println('생'); // 문자 ''
        System.out.println("생활코딩"); // 문자열 ""
        // System.out.println('생활코딩'); // 오류 발생 문자열을 사용하는 경우 ""
        System.out.println("생"); // ""는 하나의 문자에서도 사용할 수 있음.
        // System.out.println("egoing said "Welcome programming world""); // 오류 발생
        System.out.println("생활" + "코딩"); // 문자의 연산
        System.out.println("egoing said \"Welcome programming world\""); // \를 사용하면 문자열을 시작하는지 알 수 있음.
        System.out.println("egoing said\n \"Welcome \n programming world\"");
    }
}
/* Result
생
생활코딩
생
egoing said "Welcome programming world"
egoing said
 "Welcome programming world"
*/