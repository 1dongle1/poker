
package fibonacci;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=200;
		for(int i=1;i<=n;i++) {
			int j = fibonacci(i);
			System.out.println("Fibonacci("+i+")="+j);
		}
	}
	public  int fibonacci(int m){
        if(m==1&&m==2){
            return 1;
        }
        int a1=1,a2=1;
        for(int i=2;i<m;i++){
            a1=a2;
            a2=a2+a1;
        }
        return a2;
	}

}