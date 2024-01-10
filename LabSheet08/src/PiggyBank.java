
public class PiggyBank {
		public int one;
		public int two;
		public int five;
		public int ten;
		public int size;
		
		public void setPeggyBank(int s) {
			clear();
			size = s;
		}
		public int getPiggyBank() {
			return size;
		}
		public void clear() {
		/*	one=0;
			two=0;
			five=0;
			ten=0;*/
			one = two = five = ten =0;
		}
		public int getTotal(){
			return one + (2*two)+(5*five)+(10*ten);
		}
		public void addOne(int c) {
			if(getTotal()+c<=size) {
				one = one+c;
			
			}			
			else {				
			System.out.println("Piggybank is full");
			}
		}
		
		public void addTwo(int c) {
			if(getTotal()+(c*2)<=size) {
				two = two*2+c;
				}
			else
			{
				System.out.println("Piggybank is full");
			}
		}
		
		public void addFive(int c) {
			if(getTotal()+(c*5)<=size) {
				five = five*5+c;
				}		
			else
			{
				System.out.println("Piggybank is full");
			}
		}
		
		public void addTen(int c) {
			if(getTotal()+(c*10)<=size) {
				ten = ten*10+c;
				}		
			else
			{
				System.out.println("Piggybank is full");
			}
		}
}
