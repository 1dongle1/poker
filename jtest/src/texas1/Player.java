package texas1;
/**
 * 	玩家
 * 	@author Geek
 *	@version 1.0
 * 	@date 2018年6月22日 上午9:39:08
 *	@TextDemo 简易poker游戏
 *	@copyright 
 *	@remark
 */
 
import java.util.ArrayList;
import java.util.List;
 
public class Player {
	private int id;
	private String name;
	private List<Poker> pokers = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Poker> getPokers() {
		return pokers;
	}
	public void setPokers(List<Poker> pokers) {
		this.pokers = pokers;
	}
	
	public void getPoker(Poker poker) {
		this.pokers.add(poker);
	}
	/**
	 * 出最大的牌
	 * @return
	 */
	public Poker putPoker() {
		Poker poker = this.pokers.get(0);;
		if(this.pokers.get(0).compareDianShu(this.pokers.get(1))==1) {
			poker = this.pokers.get(0);
		}
		else if(this.pokers.get(0).compareDianShu(this.pokers.get(1))==-1){
			poker = this.pokers.get(1);
		}
		return poker;
	}
	
 
	
	
	public Player() {
		
	}
	
	public Player(int id,String name) {
		setId(id);
		setName(name);
	}
	
}
