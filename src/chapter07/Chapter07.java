package chapter07;

/**
 * <h1>객체지향 프로그래밍 II</h1>
 */
public class Chapter07 {

	/**
	 * <h5>1. 상속(inheritance)</h5><br>
	 * <h6>1.1 상속의 정의와 장점</h6><br>
	 * 상속이란, 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다. 상속을 통해서 클래스를 작성하면 보다 적은 양의 코드로 새로운 클래스를 작성할 수 있고<br>
	 * 코드를 공통적으로 관리할 수 있기 때문에 코드의 추가 및 변경이 매우 용이하다.<br>
	 * 이러한 특징은 코드의 재사용성을 높이고 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여한다.<br>
	 * 자바에서 상속을 구현하는 방법은 아주 간단하다. 새로 작성하고자 하는 클래스의 이름뒤에 상속받고자 하는 클래스의 이름을 키워드 'extends'와 함께 써 주기만 하면 된다.<br>
	 * 상속해주는 클래스는 '조상 클래스'라 하고 상속 받는 클래스를 '자손 클래스'라 한다.<br>
	 * <b>조상 클래스 - </b>부모(parent) 클래스, 상위(super) 클래스, 기반(base) 클래스<br>
	 * <b>자손 클래스 - </b>자식(child) 클래스, 하위(sub) 클래스, 파생된(derived) 클래스<br>
	 * 조상 클래스가 변경되면 자손 클래스는 자동적으로 영향을 받게 되지만, 자손 클래스가 변경되는 것은 조상 클래스에 아무런 영향을 주지 못한다.<br>
	 * 자손 클래스는 조상 클래스의 모든 멤버를 상속 받으므로 항상 조상 클래스보다 같거나 많은 멤버를 갖는다. 즉, 상속에 상속을 거듭할수록 상속받는 클래스의 멤버 개수는 점점 늘어나게 된다.<br>
	 * <b>- 생성자와 초기화 블럭은 상속되지 않는다. 멤버만 상속된다.</b><br>
	 * <b>- 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.</b><br>
	 * <small>※접근 제어자(access modifier)가 private 또는 default인 멤버들은 상속되지 않는다기보다 상속은 받지만 자손 클래스로부터의 접근이 제한되는 것이다.</small><br>
	 * 클래스간의 관계에서 형제 관계와 같은 것은 없다. 부모와 자식의 관계(상속관계)만이 존재할 뿐이다.
	 */
	class Memo01 {

	}

	/**
	 * Child클래스는 GrandChild클래스의 직접 조상이고, Parent클래스는 GrandChild클래스의 간접 조상이 된다.<br>
	 * 그래서 GrandChild클래스는 Parent클래스의 간접적인 상속관계에 있다고 볼 수 있다.
	 * <table border="1">
	 *     <th>
	 *         <td>클래스</td>
	 *         <td>클래스의 멤버</td>
	 *     </th>
	 *     <tr>
	 *         <td>Parent</td>
	 *         <td>age</td>
	 *     </tr>
	 *     <tr>
	 *         <td>Child</td>
	 *         <td>age</td>
	 *     </tr>
	 *     <tr>
	 *         <td>Child2</td>
	 *         <td>age</td>
	 *     </tr>
	 *     <tr>
	 *         <td>GrandChild</td>
	 *         <td>age</td>
	 *     </tr>
	 * </table><br>
	 * 자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버도 함께 생성되기 때문에 따로 조상 클래스의 인스턴스를 생성하지 않고도 조상 클래스의 멤버들을 사용할 수 있다.<br>
	 * <b>자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버와 자손 클래스의 멤버가 합쳐진 하나의 인스턴스로 생성된다.</b>
	 */
	class Parent {
		int age;
	}

	class Child extends Parent {
	}

	class Chile2 extends Parent {
	}

	class GrandChild extends Child {
	}

	/**
	 * <h5>1.2 클래스간의 관계 - 포함관계</h5><br>
	 * 상속이외에도 클래스를 재사용하는 또 다른 방법이 있는데, 그것은 클래스간에 '포함(Composite)'관계를 맺어 주는 것이다.<br>
	 * 클래스 간의 포함관계를 맺어 주는 것은 한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언하는 것을 뜻한다.
	 */
	class Memo02 {

	}

	class Circle {
		int x; // 원점의 x좌표
		int y; // 원점의 y좌표
		int r; // 반지름(radius)
	}

	/**
	 * <code>
	 *     class Circle {<br>
	 *         Point c = new Point(); // 원점<br>
	 *         int r;<br>
	 *     }
	 * </code>
	 */
	class Point {
		int x;
		int y;
	}

	/**
	 * <h5>1.3 클래스간의 관계 결정하기</h5><br>
	 * <code>
	 *     class Circle {<br>
	 *         Point c = new Point();<br>
	 *         int r;<br>
	 *     }
	 * </code>
	 * <br>
	 * <code>
	 *     class Circle <b>extends Point</b>q{<br>
	 *         <br>
	 *     }
	 * </code>
	 * <br>
	 * 원(Circle)은 점(Point)<b>이다.</b> - Circle <b>is a</b> Point(상속)<br>
	 * 원(Circle)은 점(Point)을 <b>가지고 있다.</b> - Circle <b>has a</b> Point(포함)<br>
	 * 클래스를 가지고 문장을 만들었을 때 '~은 ~이다.'라는 문장이 성립한다면, 서로 상속관계를 맺어주고,<br>
	 * '~은 ~을 가지고 있다.`는 문장이 성립한다면 포함관계를 맺어 주면 된다.<br>
	 * <b>상속관계</b> '~은 ~이다(is-a)'<br>
	 * <b>포함관계</b> '~은 ~을 가지고 있다.(has-a)'<br>
	 */
	class Memo03 {

	}

	/**
	 * <h5>1.4 단일 상속(single inheritance)</h5>
	 */
	class Memo04 {

	}

}
