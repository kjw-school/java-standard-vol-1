package chapter02;

/**
 * <h1>5. 형변환</h1>
 */
public class Chapter02_5 {

	/**
	 * <h5>5.1 형변환(캐스팅, casting)이란?</h5><br>
	 * 변수나 리터럴의 타입을 다른 타입으로 변환하는 것을 '형변환(casting)'이라고 한다.<br>
	 * <b>형변환 이란, 변수 또는 상수의 타입을 다른 타입으로 변환하는 것</b>
	 */
	class Memo1 {

	}

	/**
	 * <h5>5.2 형변환 방법</h5><br>
	 * 형변환 방법은 형변환하고자 하는 변수나 리터럴의 앞에 변환하고자 하는 타입을 괄호와 함께 붙여주기만 하면 된다.<br>
	 * <b>(타입)피연산자</b><br>
	 * 여기에 사용되는 괄호()는 '캐스트 연산자' 또는 '형변환 연산자'라고 하며, 형변환을 '캐스팅(casting)'이라고도 한다.<br>
	 * <code>
	 *     double d = 85.4;<br>
	 *     int score = (int)d; // double타입의 변수 d를 int타입으로 형변환
	 * </code>
	 * <br>
	 * <b>피연산자인 변수 d의 값은 형변환 후에도 아무런 변화가 없다.</b><br>
	 * 기본형(primitive type)에서 boolean을 제외한 나머지 타입들은 서로 형변환이 가능하다. 그리고 기본형과 참조형간의 형변환은 불가능하다.
	 */
	class Memo2 {
	}

	/**
	 * <h5>5.3 정수형간의 형변환</h5><br>
	 * 큰 타입에서 작은 타입으로의 변환, int타입(4 byte)의 값을 byte타입(1 byte)으로 변환하는 경우 경우에 따라 '값 손실(loss of data)'이 발생할 수 있다.<br>
	 * <table border="1">
	 *     <thead>
	 *         <td>변환</td>
	 *         <td>2진수</td>
	 *         <td>10진수</td>
	 *         <td>값손실</td>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>int -> byte</td>
	 *             <td>
	 *                 00000000 00000000 00000000 00001010<br>
	 *                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 00001010
	 *             </td>
	 *             <td>
	 *                 10<br>
	 *                 10
	 *             </td>
	 *             <td>없음</td>
	 *         </tr>
	 *         <tr>
	 *             <td>int -> byte</td>
	 *             <td>
	 *                 00000000 00000000 00000001 00101100<br>
	 *                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 00101100
	 *             </td>
	 *             <td>
	 *                 300<br>
	 *                 44
	 *             </td>
	 *             <td>있음</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * 반대로 작은 타입에서 큰 타입으로의 변환, 예를 들어서 byte타입(1 byte)의 값을 int타입(4 byte)으로 변환하는 경우는 저장공간의 부족으로 잘려나가는 일이 없으므로 값 손실이 발생하지 않는다.<br>
	 * 나머지 빈공간은 0 또는 1로 채워진다.<br>
	 * 원래의 값을 채우고 남은 빈공간은 0으로 채우는 게 보통이지만, 변환하려는 값이 음수인 경우에는 빈 공간을 1로 채운다.
	 */
	class Memo3 {
	}

	/**
	 * <h5>5.4 실수형 간의 형변환</h5><br>
	 */
	class Memo4 {

	}

}
