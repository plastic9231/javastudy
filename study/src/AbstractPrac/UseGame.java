package AbstractPrac;

public class UseGame {

	public static void main(String[] args) {
		
		Unit[] un = new Unit[3];
		un[0] = new Marine();
		un[1] = new SiegeTank();
		un[2] = new Dropship();
		
		for(int i = 0; i < un.length; i++) {
			System.out.println("========================");
			// 모든 유닛들을 이동시켜라
			un[i].move(100, 200);
			un[i].message();
			System.out.println("========================");
			
			
		}
		
		
	}

}
