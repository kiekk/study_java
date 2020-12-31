package dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	날짜 관련 크래스
 	Date와 Calender
 	
 	1) Date : jdk 1.0버전 (구버전)
 		java.util.Date --- O
 		java.sql.Data  --- X
 		new Date()	-> 생성자 이용
 		간단하게 날짜를 가져올 수 있습니다. toString()이 오버라이딩 되어 있습니다.
 		Date 메서드들은 deprecate 되어 있는 메서드들이 많습니다. -> replace 대체하기를 Calender로 권장합니다.
 		
 	2) Calender : jdk 1.1버전 (신버전)
 		Calender.getInstance(); -> 싱글턴 이용
 		세부적인 날짜 요소를 가지고 있습니다. 
 */
public class DateEx {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);	//간단하게 날짜를 출력할 수 있습니다.
		
		//날짜형식을 지정해 주는 클래스를 이용해 봅니다.
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strToday = sdf.format(today);	//format한 데이터를 저장
		System.out.println(strToday);
		
		strToday = sdf.format(new Date());	//오늘 날짜를 간단하게 가져와서 바로 문자열로 parse합니다.(파싱합니다.)
		System.out.println(strToday);
		
		sdf.applyPattern("yyyy년도 MM월 dd일 a HH시 mm분 ss초");
		strToday = sdf.format(new Date());
		System.out.println(strToday);
		
		System.out.println(sdf.format(new Date()));
		

	}

}
