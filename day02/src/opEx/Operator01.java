package opEx;
/*
 	자바<<c언어>> 연산자			<<c언어만 존재하는 연산자 >>
 	최우선 연산자	: () [] .   << -> >>
 	단항 연산자		: +, -, ++, --, ~, !, () 	<<* & sizeof() >>
 	산술 연산자		: * / % + -
 	쉬프트 연산자	: >>>, <<, >>
 				>>>	: 우쉬프트일 때, 좌측에 생기는 빈칸을 0으로 채웁니다.
 				>>	: 우쉬프트일 때, 좌측에 공백이 생기면, sign bit를 복사해서 채웁니다.
 						12 >> 2	 	12 ->  0000 1100
 									>> 2칸
 									 	   0__0 0011
 									 	   빈자리는 sign bit(0)를 그대로 채웁니다.
 									 	   0000 0011
 						-12 >> 3	-12 ->	1111 0100
 									>> 3칸
 											1___ 1111
 											빈자리는 sign bit(1)를 그대로 채웁니다.
 											1111 1111
 									>>>3칸
 											1___ 1111
 											1000 1111
 	관계 연산자		: <	>	>=	<=	==	!=
  논리 연산자		: | & || && 
 	삼항 연산자		: 	? :
 	대입 연산자		:	순수 대입 a = b;
 						복합 대입 a += 10;
 */
public class Operator01 {

	public static void main(String[] args) {


	}

}
