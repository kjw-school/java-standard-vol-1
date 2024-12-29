package chapter05;

import java.util.Arrays;

/**
 * <h1>Chapter05. 배열 array</h1>
 */
public class Chapter05 {

    /**
     * <p>
     * <h5>1. 배열(array)</h5><br>
     * 1.1 배열(array)이란?<br>
     * 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것을 '배열(array)'이라고 한다.<br>
     * <b>"배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것"</b><br>
     * 중요한 것은 '같은 타입'이어야 한다는 것이며, 서로 다른 타입의 변수들로 구성된 배열은 만들 수 없다.<br>
     * int[] score = new int[5]; // 5개의 int 값을 저장할 수 있는 배열을 생성한다.<br>
     * 값을 저장할 수 있는 공간은 score[0]부터 score[4]까지 모두 5개이며, 변수 score는 배열을 다루는데 필요한 참조변수일 뿐 값을 저장하<br>
     * 기 위한 공간은 아니다. 변수와 달리 배열은 각 저장공간이 연속적으로 배치되어 있다.
     * </p>
     */
    static class Memo01 {}

    /**
     * <p>
     * <h5>1.2 배열의 선언과 생성</h5><br>
     * 배열을 선언하는 방법은 간단하다. 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 대괄호[]를 붙이면 된다. 대괄호[]는<br>
     * 타입 뒤에 붙여도 되고 변수이름 뒤에 붙여도 된다.<br>
     * 선언방법 | 선언 예
     * <blockquote>
     * 타입[] 변수이름; | int[] score, String[] name;<br>
     * 타입 변수이름[]; | int score[], String name[];
     * </blockquote>
     * 배열의 생성<br>
     * 배열을 선언한 다음에는 배열을 생성해야한다. 배열을 선언하는 것은 단지 생성된 배열을 다루기 위한 참조변수를 위한 공간이 만들어질 뿐이고,<br>
     * 배열을 생성해야만 비로소 값을 저장할 수 있는 공간이 만들어지는 것이다. 배열을 생성하기 위해서느 연산자 'new'와 함께 배열의 타입과 길이<br>
     * 를 지정해 주어야 한다.<br>
     * 타입[] 변수이름; // 배열을 선언(배열을 다루기 위한 참조변수 선언)<br>
     * 변수이름 = new 타입[길이]; // 배열을 생성(실제 저장공간을 생성)
     * </p>
     */
    static class Memo02 {}


    /**
     * <p>
     * <h5>1.3 배열의 길이와 인덱스</h5><br>
     * 생성된 배열의 각 저장공간을 '배열의 요소(element)'라고 하며, '배열이름[인덱스]'의 형식으로 배열의 요소에 접근한다. <b>인덱스(index)<br>
     * 는 배열의 요소마다 붙여진 일련번호로</b> 각 요소를 구별하는데 사용된다. 다만 인덱스는 1이 아닌 0부터 시작한다.<br>
     * <b>"인덱스(index)의 범위는 0부터 '배열길이-1'까지."</b><br>
     * 배열에 값을 저장하고 읽어오는 방법은 변수와 같다. 변수이름 대신 '배열이름[인덱스]'를 사용한다는 점만 다르다.<br>
     * 배열의 또다른 장점은 index로 상수 대신 변수나 수식도 사용할 수 있다는 것이다.<br>
     * 배열을 다룰 때 한가지 주의할 점은 index의 범위를 벗어난 값을 index로 사용하지 않아야 한다는 것이다.<br>
     * 컴파일러는 이러한 실수를 걸러주지 못한다. 변수의 값은 실행 시에 대입되므로 컴파일러는 이 값의 범위를 확인할 수 없다.<br>
     * 유효하지 않은 값을 index로 사용하면, 무사히 컴파일 마쳤더라도 실행 시에 에러(ArrayIndexOutOfBoundsException)가 발생한다.
     * </p>
     */
    static class ArrayEx1 {
        public static void main(String[] args) {
            int[] score = new int[5];
            int k = 1;

            score[0] = 50;
            score[1] = 60;
            score[k+1] = 70; // score[2] = 70
            score[3] = 80;
            score[4] = 90;

            int tmp = score[k+2] + score[4]; // int tmp = score[3] + score[4]

            for(int i = 0; i < score.length; i++) {
                System.out.printf("score[%d]:%d%n", i, score[i]);
            }

            System.out.printf("tmp:%d%n", tmp);
            System.out.printf("score[%d]:%d%n", 7, score[7]); // index의 범위를 벗어난 값

        }
    }

    /**
     * <p>
     *     <h5>배열의 길이</h5><br>
     *     배열의 길이는 배열의 요소의 개수, 즉 값을 저장할 수 있는 공간의 개수다.<br>
     *     당연하게도 배열의 길이는 양의 정수이어야 하며 최대값은 int타입의 최대값, 약 20억이다.<br>
     *     길이가 0인 배열도 생성이 가능하다.<br>
     *     <b>배열의 길이는 int범위의 양의 정수(0도 포함)이어야 한다.</b>
     * </p>
     */
    static class Memo03 {}

    /**
     * <p>
     *     <h5>배열이름.length</h5><br>
     *     자바에서는 JVM이 모든 배열의 길이를 별도로 관리하며, '배열이름.length'를 통해서 배열의 길이에 대한 정보를 얻을 수 있다.<br>
     *     배열은 한번 생성하면 길이를 변경할 수 없기 때문에, 이미 생성된 배열의 길이는 변하지 않는다. 따라서 '배열이름.length'는 상수다.
     * </p>
     */
    static class Memo04 {}

    /**
     * <p>
     *     <h5>배열의 길이 변경하기</h5><br>
     *     <b>배열의 길이를 변경하는 방법:</b><br>
     *     1. 더큰 배열을 새로 생성한다.<br>
     *     2. 기존 배열의 내용을 새로운 배열에 복사한다.
     * </p>
     */
    static class Memo05{}

    /**
     * <p>
     *     <h5>1.4 배열의 초기화</h5>
     *     배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값으로 초기화 되므로 원하는 값을 저장하려면 아래와 같이 각 요소마다 지정해줘야 한다.<br>
     *     int[] score = new int[5]; // 길이가 5인 int형 배열을 생성한다.<br>
     *     score[0] = 50;<br>
     *     score[1] = 60;<br>
     *     score[2] = 70;<br>
     *     score[3] = 80;<br>
     *     score[4] = 90;<br>
     *     참조변수의 기본 값은 null이지만, 배열을 가리키는 참조변수는 null대신 길이가 0인 배열로 초기화하기도 한다.
     * </p>
     */
    static class Memo06{}

    /**
     * <p>
     *     <h5>배열의 출력</h5><br>
     *     'Arrays.toString(배열이름)'메서드를 사용하면 간단하게 출력할 수 있다.<br>
     *     만일 배열을 바로 출력하면 어떻게 될까? 배열은 참조변수니까 변수에 저장된 값, 즉<b>'배열의 주소'</b>가 출력될 것으로 생각했다면 지금까지 잘 이해하고 있는 것이다.<br>
     *     예상과는 달리 <b>'타입@주소'의 형식으로 출력된다.</b> '[I'는 1차원 int배열이라는 의미이고, '@'뒤에 나오는 16진수는 배열의 주소이다.
     * </p>
     */
    static class Memo07{}

    static class ArraysEx2 {
        public static void main(String[] args) {
            int[] iArr1 = new int[10];
            int[] iArr2 = new int[10];
//            int [] iArr3 = new int[]{100, 95, 80, 70, 60};
            int[] iArr3 = {100, 95, 80, 70, 60};
            char[] chArr = {'a','b','c','d'};
            
            for(int i  = 0; i < iArr1.length; i++) {
                iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
            }
            
            for(int i = 0; i < iArr2.length; i++) {
                iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장
            }

            //배열에 저장된 값들을 출력한다.
            for(int i = 0; i < iArr1.length; i++) {
                System.out.print(iArr1[i]+",");
            }

            System.out.println();
            System.out.println(Arrays.toString(iArr2));
            System.out.println(Arrays.toString(iArr3));
            System.out.println(Arrays.toString(chArr));
            System.out.println(iArr3);
            System.out.println(chArr);

        }
    }

    /**
     * <p>
     *     <h5>1.5 배열의 복사</h5><br>
     *     배열은 한번 생성하면 그 길이를 변경할 수 없기 때문에 더 많은 저장공간이 필요하다면 보다 큰 배열을 새로 만들고 이전 배열로 부터 내용을 복사해야한다.
     * </p>
     */
    static class Memo08{}

    static class ArrayEx3 {
        public static void main(String[] args) {
            int[] arr = new int[5];

            //배열 arr에 1~5를 저장한다.
            for(int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }

            System.out.println("[변경전]");
            System.out.println("arr.length:"+arr.length);
            for(int i = 0; i < arr.length; i++) {
                System.out.println("arr["+i+"]:"+arr[i]);
            }

            int[] tmp = new int[arr.length*2];

            //배열 arr에 저장된 값들을 배열 tmp에 복사한다.
            for(int i = 0; i < arr.length; i++) {
                tmp[i] = arr[i];
            }

            arr = tmp; // tmp에 저장된 값을 arr에 저장한다.

            System.out.println("[변경후]");
            System.out.println("arr.length:"+arr.length);
            for(int i = 0; i < arr.length; i++) {
                System.out.println("arr["+i+"]:"+arr[i]);
            }


        }
    }

    /**
     *  <p>
     *      <h5>System.arraycopy()를 이용한 배열의 복사</h5><br>
     *      for문 대신 System클래스의 arraycopy()를 사용하면 보다 간단하고 빠르게 배열을 복사할 수 있다.<br>
     *      arraycopy()는 지정된 범위의 값들을 한 번에 통째로 복사한다.<br>
     *      <b>배열의 복사는 for문보다 System.arraycopy()를 사용하는 것이 효율적이다.</b><br>
     *      System.arraycopy(num, 0, newNum, 0, num.length);<br>
     *      num[0]에서 newNum[0]으로 num.length개의 데이터를 복사
     *  </p>
     */
    static class Memo09{}

    static class ArrayEx4 {
        public static void main(String[] args) {
            char[] abc = { 'A','B','C','D' };
            char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
            System.out.println(abc);
            System.out.println(num);

            // 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
            char[] result = new char[abc.length+ num.length];
            System.arraycopy(abc, 0, result, 0, abc.length);
            System.arraycopy(num, 0, result, abc.length, num.length);
            System.out.println(result);

            // 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
            System.arraycopy(abc, 0, num, 0, abc.length);
            System.out.println(num);

            // number의 인덱스6 위치에 3개를 복사
            System.arraycopy(abc, 0, num, 6, 3);
            System.out.println(num);
        }
    }

}
