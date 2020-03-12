
package texas1;
 
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
 
public class Mange {
	public void startGame() {
		Scanner in = new Scanner(System.in);
		List<Poker> list =new Poker().createPoker();
		showPork(list.iterator());
		Judgement judgement = new Judgement();
		list = judgement.washPoke(list);
		System.out.println("------创建玩家...--------");
		int id1;
		String name1;
		System.out.println("请输入第1位玩家的ID和姓名:");
		System.out.print("输入ID:");
		id1 = in.nextInt();
		System.out.println("输入姓名: ");
		in.nextLine();
		name1 = in.nextLine();
		int id2;
		String name2;
		System.out.println("请输入第2位玩家的ID和姓名:");
		System.out.print("输入ID:");
		id2 = in.nextInt();
		System.out.println("输入姓名: ");
		in.nextLine();
		name2 = in.nextLine();
		Player player = new Player(id1, name1);
		Player player2 = new Player(id2, name2);
		System.out.println("------欢迎玩家: "+player.getName());
		System.out.println("------欢迎玩家: "+player2.getName());
		System.out.println("--------开始发牌...--------");
		for (int i = 0; i < 4; i+=2) {
			System.out.println("----玩家:"+player.getName()+"-拿牌");
			player.getPoker(list.get(i));
			System.out.println("----玩家:"+player2.getName()+"-拿牌");
			player2.getPoker(list.get(i+1));
		}
		System.out.println("--------发牌结束!------------");
		System.out.println("----------开始游戏...---------");
		System.out.println("玩家:"+player.getName()+"最大的手牌为:"+player.putPoker());
		System.out.println("玩家:"+player2.getName()+"最大的手牌为:"+player2.putPoker());
		judgement.whoWin(player, player2);
		System.out.println("玩家各自的手牌为: ");
		System.out.println(player.getName()+":"+player.getPokers());
		System.out.println(player2.getName()+":"+player2.getPokers());
	}
	
	
	public void showPork(Iterator<Poker> iterator) {
		System.out.print("为:[");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+",");
		}
		System.out.println("]");
	}
}
