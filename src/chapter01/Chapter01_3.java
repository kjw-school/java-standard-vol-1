package chapter01;

/**
 * 3. 자바로 프로그램작성하기
 */
public class Chapter01_3 {

    /**
     * 3.1 Hello.java
     */
    public static void main(String[] args) {
        System.out.println("Hello, world."); // 화면에 글자를 출력한다.
    }

    /**
     *                 javac.exe                   java.exe
     * Hello.java 작성 ㅡㅡㅡㅡㅡㅡ> Hello.class 생성 ㅡㅡㅡㅡㅡㅡ> "Hello, world." 출력
     *                 컴파일                       실행
     * 자바에서 모든 코드는 반드시 클래스 안에 존재해야 하며, 서로 관련된 코드들을 그룹으
     * 로 나누어 별도의 클래스를 구성하게 된다. 그리고 이 클래스들이 모여 하나의 Java 애플
     * 리케이션을 이룬다.
     * 'public static void main(String[] args)' 는 main메서드의 선언부인데, 프
     * 로그램을 실행할 때 'java.exe'에 의해 호출될 수 있도록 미리 약속된 부분이므로 항상 똑
     * 같이 적어주어야 한다.
     * class 클래스이름 {
     *     public static void main(String[] args) { // main메서드의 선언부
     *         // 실행될 문장등을 적는다.
     *     }
     * }
     * Java 애플리케이션은 main메서드의 호출로 시작해서 main메서드의 첫 문장부터 마지막 문장까지 수행을 마치면 종료된다.
     * 모든 클래스가 main메서드를 가지고 있어야 하는 것은 아니지만, 하나의 Java 애플리
     * 케이션에는 main메서드를 포함한 클래스가 반드시 하나는 있어야 한다. main메서드는
     * Java애플리케이션의 시작점이므로 main메서드 없이는 Java 애플리케이션은 실행될 수
     * 없기 때문이다.
     * 하나의 소스파일에 하나의 클래스만을 정의하는 것이 보통이지만, 하나의 소스파일에
     * 둘 이상의 클래스를 정의하는 것도 가능하다. 이 때 주의해야할 점은 '소스파일의 이름은
     * public class의 이름과 일치해야 한다.'는 것이다.
     * 소스파일(*.java)과 달리 클래스파일(*.class)은 클래스마다 하나씩 만들어진다.
     */

    /**
     * 자바프로그램의 실행과정
     * 1. 프로그램의 실행에 필요한 클래스(*.class)를 로드한다.
     * 2. 클래스파일을 검사한다.(파일형식, 악성코드 체크)
     * 3. 지정된 클래스(Hello)에서 main(String[] args)를 호출한다.
     */

}
