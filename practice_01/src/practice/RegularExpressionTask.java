package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTask {
	/*
	public static void main(String[] args) {
		List list = new ArrayList<String>();
		
		String str = "홍길동 010-1111-2222^고길동 011-222-2222^도우너 016-2513-4574^또치 010-7777-0114^둘리 " + 
				"010-7777-7777";
		String regex = "[[01(?:0|1|[6-9])[-]([0-9] {3}|[0-9] {4})[-][0-9]{4}]]*";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			if(!"".equals(m.group())) list.add(m.group());
		}
		System.out.println(list.toString());
	}
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한글로만 이름을 입력하세요 :");
		while(sc.hasNext()) {
			String name = sc.next();
			if("0".equals(name)) {
				System.out.println("종료합니다.");
				return;
			}
			Pattern pattern = Pattern.compile("^[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]*$");
			Matcher matcher = pattern.matcher(name);
			if(matcher.find()) {
				System.out.println("모두 한글입니다.");
			}else {
				System.out.println("한글로만 입력하세요.");
			}
			System.out.print("한글로만 이름을 입력하세요 :");
		}
	}
}


