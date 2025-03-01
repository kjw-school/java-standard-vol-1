package chapter02;

/**
 * 3.6 음수의 2진표현 - 2의 보수법
 */
public class Chapter02_3_6 {

    /**
     * 4비트의 2진수로 부호있는 정수, 즉 양수와 음수를 모두 표현하려면 어떻게 해야할까? 4비트 2진수의 절반인 8개는 0으로 시작하고, 나머지 절
     * 반은 1로 시작하니까, 1로 시작하는 2진수를 음수표현에 사용하자. 이렇게 하면, '왼쪽의 첫 번째 비트(MSB)'가 0이 면 양수, 1이면 음수이
     * 므로 첫 번째 비트만으로 값의 부호를 알 수 있게 된다.
     * ※ 2진수의 제일 왼쪽의 1 bit를 MSB(most significant bit)라고 한다.
     * # | 2진수 | 부호있는 10진수
     * 1 | 0000 | 0
     * 2 | 0001 | 1
     * 3 | 0010 | 2
     * 4 | 0011 | 3
     * 5 | 0100 | 4
     * 6 | 0101 | 5
     * 7 | 0110 | 6
     * 8 | 0111 | 7 <- 최대값
     * 9 | 1000 | -8 <- 최소값
     * 10 | 1001 | -7
     * 11 | 1010 | -6
     * 12 | 1011 | -5
     * 13 | 1100 | -4
     * 14 | 1101 | -3
     * 15 | 1110 | -2
     * 16 | 1111 | -1
     * 위와 같이'2의 보수법'에 의해 음수를 배치하면, 절대값이 같은 양수와 음수를 더 했을 때 2진수로도 0을 결과로 얻으므로 부호를 신경쓰지
     * 않고 덧셈할 수 있게 된다.
     */

    /**
     * 2의 보수법
     * 어떤 수의 'n의 보수'는 더했을 때 n이 되는 수를 말한다.
     * 2진수로 '10'은 자리올림이 발생하고 0이 되는 수를 뜻한다. '2의 보수 관계'에 있는 두 2진수를 더하면 '(자리올림이 발생하고)0이 된다.'
     * 2의 보수 = 1의 보수 + 1, '1의 보수'는 0을 1로, 1을 0으로만 바꾸면 된다.
     * 음수의 2진 표현을 구하는 방법
     * (1) 음수의 절대값을 2진수로 변환한다.
     * : -5의 절대값인 5를 2진수로 변환한다. 10진수 5를 2진수로 변환하면 '0101'이다.
     * (2) (1)에서 구한 2진수의 1을 0으로 0은 1로 바꾼다.(1의 보수 구하기)
     * : '0101'이 '1010'이 된다.
     * (3) (2)의 결과에 1을 더한다.(2의 보수 구하기, 1의 보수 +1)
     *: '1010'에 1을 더하면 '1011'이 되고, 이것이 -5의 2진 표현이다.
     */

}
