
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
		System.out.println("------�������...--------");
		int id1;
		String name1;
		System.out.println("�������1λ��ҵ�ID������:");
		System.out.print("����ID:");
		id1 = in.nextInt();
		System.out.println("��������: ");
		in.nextLine();
		name1 = in.nextLine();
		int id2;
		String name2;
		System.out.println("�������2λ��ҵ�ID������:");
		System.out.print("����ID:");
		id2 = in.nextInt();
		System.out.println("��������: ");
		in.nextLine();
		name2 = in.nextLine();
		Player player = new Player(id1, name1);
		Player player2 = new Player(id2, name2);
		System.out.println("------��ӭ���: "+player.getName());
		System.out.println("------��ӭ���: "+player2.getName());
		System.out.println("--------��ʼ����...--------");
		for (int i = 0; i < 4; i+=2) {
			System.out.println("----���:"+player.getName()+"-����");
			player.getPoker(list.get(i));
			System.out.println("----���:"+player2.getName()+"-����");
			player2.getPoker(list.get(i+1));
		}
		System.out.println("--------���ƽ���!------------");
		System.out.println("----------��ʼ��Ϸ...---------");
		System.out.println("���:"+player.getName()+"��������Ϊ:"+player.putPoker());
		System.out.println("���:"+player2.getName()+"��������Ϊ:"+player2.putPoker());
		judgement.whoWin(player, player2);
		System.out.println("��Ҹ��Ե�����Ϊ: ");
		System.out.println(player.getName()+":"+player.getPokers());
		System.out.println(player2.getName()+":"+player2.getPokers());
	}
	
	
	public void showPork(Iterator<Poker> iterator) {
		System.out.print("Ϊ:[");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+",");
		}
		System.out.println("]");
	}
}
