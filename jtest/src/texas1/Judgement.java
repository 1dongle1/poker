package texas1;
/**
 * 	����
 * 	@author Geek
 *	@version 1.0
 * 	@date 2018��6��22�� ����9:38:47
 *	@TextDemo ����poker��Ϸ
 *	@copyright 
 *	@remark
 */
 
import java.util.List;
 
public class Judgement {
	/**
	 * ϴ��
	 * @param list
	 * @return
	 */
	public List<Poker> washPoke(List<Poker> list){
		System.out.println("--------��ʼϴ��...-------");
		Poker poker = null;
		for (int i = 0; i < list.size(); i++) {
			int randrom = (int)(Math.random()*52);
			poker = list.get(randrom);
			list.set(randrom, list.get(i));
			list.set(i, poker);
		}
		System.out.println("--------ϴ�ƽ���!--------");
		return list;
	}
	/**
	 * �ж�˭Ӯ������Ϸ
	 * @return
	 */
	public void whoWin(Player player,Player player2) {
		if(player.putPoker().compareDianShu(player2.putPoker())==0){
			if(player.putPoker().compare(player2.putPoker())==0) {
				System.out.println("--------ƽ��---------");
				return;
			}else if(player.putPoker().compare(player2.putPoker())==1){
				System.out.println("--------���:"+player.getName()+"��ʤ!---------");
				return;
			}
			else {
				System.out.println("--------���:"+player2.getName()+"��ʤ!---------");
				return;
			}
		}else if(player.putPoker().compareDianShu(player2.putPoker())==1) {
			System.out.println("--------���:"+player.getName()+"��ʤ!---------");
			return;
		}	
		System.out.println("--------���:"+player2.getName()+"��ʤ!---------");
	}
	
}
