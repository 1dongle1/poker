package texas1;
/**
 * 	poke
 * 	@author Geek
 *	@version 1.0
 * 	@date 2018年6月22日 上午9:38:58
 *	@TextDemo 简易poker游戏
 *	@copyright 
 *	@remark
 */
 
import java.util.ArrayList;
import java.util.List;
 
public class Poker {
	private String hs;
	private String dianshu;
	private String[] hss = new String[] {"方片","梅花","红心","黑桃"};
	private String[] dianshus =  new String [] {
			"3","4",
			"5","6","7","8","9",
			"10","J","Q","K","A","2"};
 
	public List<Poker> createPoker(){
		List<Poker> list = new ArrayList<>();
		System.out.println("---------创建扑克牌---------");
		for(int i=0;i<hss.length;i++) {
			for (int j = 0; j < dianshus.length; j++) {
				list.add(new Poker(hss[i],dianshus[j]));
			}
		}
		System.out.println("---------扑克牌创建成功---------");	
		return list;
	}
 
	public String getHs() {
		return hs;
	}
 
	public void setHs(String hs) {
		this.hs = hs;
	}
 
	public String getDianshu() {
		return dianshu;
	}
 
	public void setDianshu(String dianshu) {
		this.dianshu = dianshu;
	}
	
	public Poker() {
		
	}
	
	public Poker(String hs,String dianshu) {
		setDianshu(dianshu);
		setHs(hs);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getHs()+getDianshu();
	}
	/**
	 * 比较花色
	 * @param poker
	 * @return
	 */
	public int compare(Poker poker){
 
 
		if(this.getHs().equals(poker.getHs())) {
			return 0;
		}
		for(int i=0;i<this.hss.length;i++) {
			if(this.getHs().equals(hss[i])) {
				return -1;
			}
			if(poker.getHs().equals(hss[i])) {
				return 1;
			}
		}
		
		
		return 0;
	}
	
	/**
	 * 比较点数
	 * @param poker
	 * @return
	 */
	public int compareDianShu(Poker poker){
		boolean boolean1 = true;
		if(this.getDianshu().equals(poker.getDianshu())) {
			return 0;
		}
		for(int i=0;i<this.dianshus.length;i++) {
			if(this.getDianshu().equals(dianshus[i])) {
				boolean1 = false;
				break;
			}
			if(poker.getDianshu().equals(dianshus[i])) {
				boolean1 = true;
				break;
			}
		}
		
		if(boolean1) {
			return 1;
		}
		return -1;
		
	}
}