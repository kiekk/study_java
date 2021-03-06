package addressHomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * KOREA MARKET曖 �蛾� 薑爾 婦葬 Щ煎斜極殮棲棻.
	System.out.println("旨收收收收收收收收收收收收收收收收收旬");
	System.out.println("早  KOREA MARKET殮棲棻.             早");
	System.out.println("曳收收收收收收收收收收收收收收收收收朽");
	System.out.println("早     詭景蒂 摹鷗п輿撮蹂          早");
	System.out.println("曳收收收收收收收收收收收收收收收收收朽");
	System.out.println("早  1. 賅萇 �蛾� 薑爾 爾晦          早");
	System.out.println("早  2. か薑 �蛾� 薑爾 爾晦          早");
	System.out.println("早  3. 褐敘 �蛾� 薑爾 蛔煙          早");
	System.out.println("早  4. �蛾� 薑爾 餉薯 ж晦          早");
	System.out.println("早  5. �蛾� 薑爾 熱薑 ж晦          早");
	System.out.println("早  6. �蛾� 薑爾 薑溺 ж晦          早");
	System.out.println("早  0. 謙猿  ж晦                   早");
	System.out.println("曲收收收收收收收收收收收收收收收收收旭");
 * 識 6偃曖 詭景蒂 儅撩ж艘蝗棲棻.
 * 1廓擎 蛔煙脹 �蛾礸橉� 薑爾蒂 賅舒 轎溘м棲棻. for僥婁 iterator蒂 檜辨ц蝗棲棻.
 * 2廓擎 か薑 輿模縑 п渡ж朝 �蛾礸橉� 轎溘м棲棻. contains蒂 檜辨ж罹 п渡 �蛾礸橉� 瓊堅, cpy 葬蝶お蒂 虜菟橫憮 п渡 �蛾礸橉� 薑爾蒂 夥煎 轎溘ж雖 彊堅 盪濰и �� 評煎 轎溘ц蝗棲棻. 碳в蹂ж啪 奩犒腎朝 睡碟菟擊 薯剪ж堅濠 ж艘蝗棲棻.
 * 3廓擎 �蛾� 薑爾 蛔煙殮棲棻. add詭憮萄蒂 檜辨ц蝗棲棻.
 * 4廓擎 �蛾� 薑爾 餉薯殮棲棻. remove蒂 檜辨ж艘堅, scanner蒂 檜辨п п渡 嬪纂曖 index高擊 瞪殖ж朝 寞衝戲煎 掘⑷ц蝗棲棻.
 * 5廓擎 �蛾� 薑爾 熱薑殮棲棻. remove諦 翕橾ж啪 scanner蒂 檜辨п п渡 嬪纂曖 index高擊 瞪殖ж艘蝗棲棻.
 * 高擊 ж釭噶虜 熱薑й 唳辦 setter蒂 檜辨ж罹 高擊 瞪殖ж艘堅, 賅舒 熱薑й 唳辦朝 Address偌羹蒂 億煎 儅撩ж罹 斜 偌羹縑 等檜攪蒂 殮溘и 菴縑 set詭憮萄蒂 鱔п 檣濠煎 瞪殖ж朝 寞衝戲煎 掘⑷ц蝗棲棻.
 * 6廓擎 �蛾� 薑爾 薑溺殮棲棻. 檜葷婁 釭檜蒂 晦遽戲煎 陝陝 螃葷離牖戲煎 薑溺腎紫煙 掘⑷ц蝗棲棻.
 * 檜葷檜 晦遽橾 唳辦 檜葷檜 偽戲賊 棻衛 釭檜蒂 綠掖ж罹 薑溺ж堅, 釭檜陛 晦遽橾 唳辦 釭檜陛 偽戲賊 輿模蒂 綠掖ж罹 薑溺м棲棻.
 */
public class AddressMain_彌牖�� {
	public static void main(String[] args) { 
		new KoreaMarket().showMainMenu();
	}//end main
}//end class
class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
class Person{
	private String name;//檜葷
	private int age;	//釭檜
	//getter setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	//儅撩濠
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void printUserInfo() {
		System.out.print("   \t"+name+"\t"+age+"撮");
	}
}//end class Person
class Address extends Person{
	//賅萇 �蛾衋� '憮選衛'縑 剪輿и棻堅 陛薑ж罹, static final煎 摹樹ж艘蝗棲棻.
	static final String si = "憮選衛";	//衛
	private String gu;							//掘
	private String dong;						//翕
	private String bunji;						//廓雖
	private int member;							//陛掘錳熱
	//getter setter
	public String getGu() {return gu;}
	public void setGu(String gu) {this.gu = gu;}
	public String getDong() {return dong;}
	public void setDong(String dong) {this.dong = dong;}
	public String getBunji() {return bunji;}
	public void setBunji(String bunji) {this.bunji = bunji;}
	public int getMember() {return member;}
	public void setMember(int member) {this.member = member;}
	//儅撩濠
	Address(String name, int age, String gu, String dong, String bunji, int member) {
		super(name, age);
		this.gu = gu;
		this.dong = dong;
		this.bunji = bunji;
		this.member = member;
	}
	Address(){
		super("",-1);
		this.gu = "";
		this.dong = "";
		this.member = -1;
		this.bunji = "";
	}
	@Override
	void printUserInfo() {
		super.printUserInfo();
		System.out.println("\t"+si+"\t"+gu+"\t"+dong+"\t"+bunji+"\t"+member+"貲");
	}
}//end class Address
class KoreaMarket {
	static Scanner sc = new Scanner(System.in);
	//詭檣 詭景
	void showMainMenu() {
		int choice = -1;
		ArrayList<Address> user = new ArrayList<Address>();
		//5貲曖 晦獄高 殮溘
		user.add(new Address("�垮瘚�",22,"鬼陴掘","鬼陴翕","111",2));
		user.add(new Address("嶸ぅ粽",40,"憮蟾掘","憮蟾翕","222",1));
		user.add(new Address("夢僥熱",27,"喻錳掘","鼻啗翕","333",3));
		user.add(new Address("檜牖褐",33,"鬼陴掘","羲鳴翕","555",4));
		user.add(new Address("啻檜幗",18,"鬼陴掘","鳴撩翕","666",3));
		while(choice != 0) {
			System.out.println("旨收收收收收收收收收收收收收收收收收旬");
			System.out.println("早      KOREA MARKET殮棲棻.         早");
			System.out.println("曳收收收收收收收收收收收收收收收收收朽");
			System.out.println("早     詭景蒂 摹鷗п輿撮蹂          早");
			System.out.println("曳收收收收收收收收收收收收收收收收收朽");
			System.out.println("早  1. 賅萇 �蛾� 薑爾 爾晦          早");
			System.out.println("早  2. か薑 �蛾� 薑爾 爾晦          早");
			System.out.println("早  3. 褐敘 �蛾� 薑爾 蛔煙          早");
			System.out.println("早  4. �蛾� 薑爾 餉薯 ж晦          早");
			System.out.println("早  5. �蛾� 薑爾 熱薑 ж晦          早");
			System.out.println("早  6. �蛾� 薑爾 薑溺 ж晦          早");
			System.out.println("早  0. 謙猿  ж晦                   早");
			System.out.println("曲收收收收收收收收收收收收收收收收收旭");
			System.out.print("      殮溘 : "); choice = sc.nextInt();
			switch(choice) {
			case 1: AllCheckUserInfo(user); break;	//賅萇 �蛾� 薑爾 爾晦
			case 2: checkUserInfo(user); break;		//か薑 �蛾� 薑爾 爾晦
			case 3: createUserInfo(user); break;	//褐敘 �蛾� 薑爾 蛔煙
			case 4: deleteUserInfo(user); break;	//�蛾� 薑爾 餉薯 ж晦
			case 5: updateUserInfo(user); break;	//�蛾� 薑爾 熱薑 ж晦
			case 6: orderUserInfo(user); break;		//�蛾� 薑爾 薑溺 ж晦
			}//end switch
		}//end while
		System.out.println("旨收收收收收收收收收收收收收收收收收收收收收旬");
		System.out.println("         Щ煎斜極擊 謙猿м棲棻.");
		System.out.println("曲收收收收收收收收收收收收收收收收收收收收收旭");
	}//end showMainMenu
	//か薑 �蛾� 薑爾 轎溘
	private void checkUserInfo(ArrayList<Address> user) {
		String search = "";
		int cnt = 0, checkNum = 0;
		ArrayList<Address> cpy = new ArrayList<Address>();
		System.out.println("旨收收收收收收收收收收收收收收收收收收收收收收收收收收旬");
		System.out.println("     輿模蒂 鱔п憮 か薑 �蛾衋� 薑爾蒂 轎溘м棲棻.");
		System.out.print("     瓊戲褒 掘釭 翕擊 殮溘п 輿撮蹂 : "); search = sc.next();
		System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收收收旭");
		for(Address str : user) {
			if(str.getGu().contains(search) || str.getDong().contains(search)) {
				cpy.add(str);
			}else {
				checkNum++;
			}//end if
		}//end for
		if(checkNum == user.size()) {
			System.out.println("旨收收收收收收收收收收收收收收收收收收收收收收收收收收旬");
			System.out.println("            橾纂ж朝 薑爾陛 橈蝗棲棻.");
			System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收收收旭");
		}else {
			System.out.println("旨收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收旬");
			System.out.println("    "+search+" �蛾礸橉� 薑爾蒂 轎溘м棲棻.");
			System.out.println("       廓�αt 檜葷\t釭檜\t  衛\t  掘\t  翕\t廓雖\t陛掘錳熱");
			for(Address str : cpy) {
				System.out.print("\t"+(++cnt)+"廓");
				str.printUserInfo();
			}//end for
			System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收旭");
		}//end if
	}//end checkUserInfo
	//賅萇 �蛾� 薑爾 轎溘
	private void AllCheckUserInfo(ArrayList<Address> user) { 
		int cnt = 0;
		//for僥 檜辨
		//		System.out.println("旨收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收旬");
		//		System.out.println("       廓�αt 檜葷\t釭檜\t  衛\t  掘\t  翕\t廓雖\t陛掘錳熱");
		//		for(Address users : user) {
		//			System.out.print("   "+(++cnt)+"廓");
		//			users.printUserInfo();
		//		}//end for
		//		System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收旭");
		//iterator 檜辨
		Iterator<Address> itr = user.iterator();
		System.out.println("旨收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收旬");
		System.out.println("       廓�αt 檜葷\t釭檜\t  衛\t  掘\t  翕\t廓雖\t陛掘錳熱");
		while(itr.hasNext()) {
			System.out.print("\t"+(++cnt)+"廓");
			itr.next().printUserInfo();;
		}//end while
		System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收旭");
	}//end AllCheckUserInfo
	//褐敘 �蛾� 薑爾 蛔煙
	private void createUserInfo(ArrayList<Address> user) {
		String name = "",gu = "",dong = "",bunji = "";
		int age = 0, member = 0;
		System.out.println("旨收收收收收收收收收收收收收收收收收收收收收收收收收收旬");
		System.out.println("           褐敘 �蛾衋� 薑爾蒂 蛔煙м棲棻.");
		System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收收收旭");
		System.out.print("檜葷擊 殮溘п輿撮蹂 : "); name = sc.next();
		System.out.print("釭檜蒂 殮溘п輿撮蹂 : "); age = sc.nextInt();
		System.out.print("掘蒂 殮溘п 輿撮蹂.\n(鬼陴掘, 憮蟾掘, 喻錳掘, 鬼翕掘) 醞縑憮 殮溘п 輿撮蹂 : "); gu = sc.next();
		System.out.print("翕擊 殮溘п 輿撮蹂 : "); dong = sc.next();
		System.out.print("廓雖蒂 殮溘п輿撮蹂 : "); bunji = sc.next();
		System.out.print("陛掘錳熱蒂 殮溘п輿撮蹂 : "); member = sc.nextInt();
		user.add(new Address(name,age,gu,dong,bunji,member));
	}//end createUserInfo
	//�蛾� 薑爾 餉薯 ж晦
	private void deleteUserInfo(ArrayList<Address> user) {
		int delNum = 0;
		printUserName(user);
		while(true) {
			try {
				System.out.println("旨收收收收收收收收收收收收收收收收收收收收旬");
				System.out.print("    賃 廓簞 �蛾衋� 餉薯ж衛啊蝗棲梱?"); delNum = sc.nextInt();
				if(delNum < 0) throw new MyException("\t0爾棻 贖 熱煎 殮溘п輿撮蹂.");
				System.out.println("曲收收收收收收收收收收收收收收收收收收收收旭");
				break;
			}catch(MyException e) {
				System.out.println(e.getMessage());
				System.out.println("曲收收收收收收收收收收收收收收收收收收收收旭");
			}catch(Exception e) {
				System.out.println("\t  薑熱蒂 殮溘п輿撮蹂.");
				System.out.println("曲收收收收收收收收收收收收收收收收收收收收旭");
				sc.nextLine();
			}//end try
		}//end while
		//餉薯ж溥朝 �蛾衋� 嬪纂陛 殮溘脹 �蛾虃鷅葩� 號擎 唳辦 �挫�
		System.out.println("旨收收收收收收收收收收收收收收收收收收收收旬");
		if(delNum > user.size() || delNum < 0) {
			System.out.println("  "+delNum+"廓簞 嬪纂縑 �蛾� 薑爾陛 橈蝗棲棻.");
			System.out.println("      葆雖虞 �蛾衋� 薑爾蒂 餉薯м棲棻.");
			System.out.println("     "+user.get(user.size()-1).getName()+" �蛾矕埬� 薑爾蒂 餉薯м棲棻.");
			user.remove(user.size()-1);
		}else {
			System.out.println("     "+user.get(delNum-1).getName()+" �蛾矕埬� 薑爾蒂 餉薯м棲棻.  "); 
			user.remove(delNum-1);
		}
		System.out.println("曲收收收收收收收收收收收收收收收收收收收收旭");
	}//end deleteUserInfo
	//�蛾� 薑爾 熱薑 ж晦
	private void updateUserInfo(ArrayList<Address> user) {
		String name = "",gu = "",dong = "",bunji = "";
		int age = 0, member = 0,select = 0;
		int changeNum = 0;
//		printUserName(user);		//�蛾衋� 檜葷 爾棻朝 瞪羹 等檜攪蒂 轎溘п 輿朝 匙檜 爾晦 謠擠
		AllCheckUserInfo(user);
		while(true) {
			try {
				System.out.println("旨收收收收收收收收收收收收收收收收收收收收收收收收旬");
				System.out.print("    賃廓簞 �蛾衋� 等檜攪蒂 熱薑ж衛啊蝗棲梱?"); changeNum = sc.nextInt();
				if(changeNum < 0) throw new MyException("\t     0爾棻 贖 熱煎 殮溘п輿撮蹂.");
				System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收旭");
				break;
			}catch(MyException e) {
				System.out.println(e.getMessage());
				System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收旭");
			}catch(Exception e) {
				System.out.println("\t     薑熱蒂 殮溘п輿撮蹂.");
				System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收旭");
				sc.nextLine();
			}//end try
		}//end while
		System.out.println("旨收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收旬");
		//熱薑ж溥堅 �蛾衋� 嬪纂陛 殮溘脹 �蛾虃鷅葩� 號擎 唳辦 �挫�
		if(changeNum > user.size()) {
			System.out.println("\t  "+changeNum+"廓簞 嬪纂縑 �蛾� 薑爾陛 橈蝗棲棻.");
			System.out.println("\t      葆雖虞 �蛾衋� 薑爾蒂 熱薑м棲棻.");
			changeNum = user.size();
		}//end if
		System.out.println("\t"+user.get(changeNum-1).getName()+" �蛾矕埬� 橫雯 薑爾蒂 熱薑ж衛啊蝗棲梱?");
		System.out.println("  1.檜葷     2.釭檜     3.掘     4.翕     5.廓雖     6.陛掘錳熱     7.賅舒 熱薑");
		System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收旭");
		System.out.print("\t殮溘 : "); select = sc.nextInt();
		System.out.println("旨收收收收收收收收收收收收收收收收收收收收收旬");
		switch(select) {
		case 1:
			System.out.print("     熱薑й 檜葷擊 殮溘п輿撮蹂  : "); name = sc.next();
			user.get(changeNum-1).setName(name);
			break;
		case 2:
			System.out.print("     熱薑й 釭檜蒂 殮溘п輿撮蹂  : "); age = sc.nextInt();
			user.get(changeNum-1).setAge(age);
			break;
		case 3:
			System.out.print("     熱薑й 輿模(掘)蒂 殮溘п輿撮蹂  : "); gu = sc.next();
			user.get(changeNum-1).setGu(gu);
			break;
		case 4:
			System.out.print("     熱薑й 輿模(翕)擊 殮溘п輿撮蹂  : "); dong = sc.next();
			user.get(changeNum-1).setDong(dong);
			break;
		case 5:
			System.out.print("     熱薑й 廓雖熱蒂 殮溘п輿撮蹂  : "); bunji = sc.next();
			user.get(changeNum-1).setBunji(bunji);
			break;
		case 6:
			System.out.print("     熱薑й 陛掘錳熱蒂 殮溘п輿撮蹂  : "); member = sc.nextInt();
			user.get(changeNum-1).setMember(member);
			break;
		case 7:
			System.out.print("     熱薑й 檜葷擊 殮溘п輿撮蹂  : "); name = sc.next();
			System.out.print("     熱薑й 釭檜蒂 殮溘п輿撮蹂  : "); age = sc.nextInt();
			System.out.print("     熱薑й 輿模(掘)蒂 殮溘п輿撮蹂  : "); gu = sc.next();
			System.out.print("     熱薑й 輿模(掘)擊 殮溘п輿撮蹂  : "); dong = sc.next();
			System.out.print("     熱薑й 廓雖熱蒂 殮溘п輿撮蹂  : "); bunji = sc.next();
			System.out.print("     熱薑й 陛掘錳熱蒂 殮溘п輿撮蹂  : "); member = sc.nextInt();
			Address tmp= new Address(name,age,gu,dong,bunji,member);
			user.set(changeNum-1, tmp);
		}//end switch
		System.out.println("曲收收收收收收收收收收收收收收收收收收收收收旭");
	}//end changeUserInfo
	//�蛾� 薑爾 薑溺 ж晦
	private void orderUserInfo(ArrayList<Address> user) {  
		int orderNum = 0;
		Address tmp;
//		ArrayList<Address> cpy = user.clone();
		while(true) {
			try {
				System.out.println("旨收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收旬");
				System.out.println("早\t橫雯 薑爾蒂 晦遽戲煎 薑溺ж衛啊蝗棲梱?(螃葷離牖 薑溺)\t\t\t\t早");
				System.out.println("早    螃葷離牖戲煎 薑溺ж貊,綠掖 薑爾陛 翕橾й 唳辦 ж嬪 薑爾菟擊 蹺陛煎 綠掖м棲棻     早");
				System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收旭");
				System.out.print("   1.檜葷\n   2.釭檜\n   3.蟾晦高戲煎 撲薑\n   殮溘   :  ");	orderNum = sc.nextInt();
				if(orderNum < 0 || orderNum > 3) throw new MyException("\t1, 2廓 醞縑憮 殮溘п 輿撮蹂.");
				break;
			}catch(MyException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println("\t薑熱蒂 殮溘п輿撮蹂.");
				sc.nextLine();
			}//end try
		}//end while
		switch(orderNum) {
		case 1:
			for(int i = 0;i<user.size()-1;i++) {
				for(int j = i+1;j<user.size();j++) {
					int check = user.get(i).getName().compareToIgnoreCase(user.get(j).getName());
					if(check > 0){											//菴曖 檜葷檜 渦 擅曖 檜葷爾棻 渦 擅縑 氈棻賊,
						tmp = user.get(i);
						user.set(i, user.get(j));
						user.set(j, tmp);
					}else if(check == 0) {									//舒 檜葷檜 僅偽棻賊,
						if(user.get(i).getAge() >= user.get(j).getAge()) {	//舒 餌塋曖 釭檜蒂 綠掖м棲棻.
							tmp = user.get(i);
							user.set(i, user.get(j));
							user.set(j, tmp);
						}//end if
					}//end if
				}//end for(j)
			}//end for(i)
			System.out.println("旨收收收收收收收收收收收收收收收收收收收收收收收收收收旬");
			System.out.println("        檜葷擊 晦遽戲煎 螃葷離牖 薑溺м棲棻");
			System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收收收旭");
			break;
		case 2:
			for(int i = 0;i<user.size()-1;i++) {
				for(int j = i+1;j<user.size();j++) {
					if(user.get(i).getAge() > user.get(j).getAge()){				//舒 餌塋曖 釭檜蒂 綠掖
						tmp = user.get(i);
						user.set(i, user.get(j));
						user.set(j, tmp);
					}else if(user.get(i).getAge() == user.get(j).getAge()) {						//舒 餌塋曖 釭檜陛 僅偽棻賊
						int check = user.get(i).getGu().compareToIgnoreCase(user.get(j).getGu());	//舒 餌塋曖 掘蒂 綠掖м棲棻.
						if(check > 0) {
							tmp = user.get(i);
							user.set(i, user.get(j));
							user.set(j, tmp);
						}else if(check == 0) {																//舒 餌塋曖 掘陛 僅偽棻賊
							int check2 = user.get(i).getDong().compareToIgnoreCase(user.get(j).getDong());	//舒 餌塋曖 翕擊 綠掖м棲棻.
							if(check2 > 0) {
								tmp = user.get(i);
								user.set(i, user.get(j));
								user.set(j, tmp);
							}//end if - 3
						}//end if - 2
					}//end if - 1
				}//end for(j)
			}//end for(i)
			System.out.println("旨收收收收收收收收收收收收收收收收收收收收收收收收收收旬");
			System.out.println("        釭檜蒂 晦遽戲煎 螃葷離牖 薑溺м棲棻");
			System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收收收旭");
			break;
		case 3: 
			System.out.println("旨收收收收收收收收收收收收收收收收收收收收收收收收收收旬");
			System.out.println("          蟾晦高戲煎 腎給董棲棻.");
			System.out.println("曲收收收收收收收收收收收收收收收收收收收收收收收收收收旭");
			break;
		}//end switch
	}//end orderUserInfo
	//⑷營 蛔煙脹 �蛾衋� 檜葷虜 轎溘
	private void printUserName(ArrayList<Address> user) {
		int cnt = 0;
		System.out.println("旨收收收收收收收收收收收收旬");
		System.out.println("     ⑷營 蛔煙脹 �蛾�");
		for(Address users : user) {
			System.out.println("     "+(++cnt)+"廓 : "+users.getName());
		}//end for
		System.out.println("曲收收收收收收收收收收收收旭");
	}//end printUserName
}//end KoreaMarket


