package texas1;
/**
 * 	裁判
 * 	@author Geek
 *	@version 1.0
 * 	@date 2018年6月22日 上午9:38:47
 *	@TextDemo 简易poker游戏
 *	@copyright 
 *	@remark
 */
 
import java.util.List;
 
public class Judgement {
	/**
	 * 洗牌
	 * @param list
	 * @return
	 */
	public List<Poker> washPoke(List<Poker> list){
		System.out.println("--------开始洗牌...-------");
		Poker poker = null;
		for (int i = 0; i < list.size(); i++) {
			int randrom = (int)(Math.random()*52);
			poker = list.get(randrom);
			list.set(randrom, list.get(i));
			list.set(i, poker);
		}
		System.out.println("--------洗牌结束!--------");
		return list;
	}
	/**
	 * 判断谁赢得了游戏
	 * @return
	 */
	public void whoWin(Player player,Player player2) {
		if(player.putPoker().compareDianShu(player2.putPoker())==0){
			if(player.putPoker().compare(player2.putPoker())==0) {
				System.out.println("--------平局---------");
				return;
			}else if(player.putPoker().compare(player2.putPoker())==1){
				System.out.println("--------玩家:"+player.getName()+"获胜!---------");
				return;
			}
			else {
				System.out.println("--------玩家:"+player2.getName()+"获胜!---------");
				return;
			}
		}else if(player.putPoker().compareDianShu(player2.putPoker())==1) {
			System.out.println("--------玩家:"+player.getName()+"获胜!---------");
			return;
		}	
		System.out.println("--------玩家:"+player2.getName()+"获胜!---------");
	}
	
}
