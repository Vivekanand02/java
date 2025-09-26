class Program{
	static void smallest(int a,int b,int c){
		if(a<b && a<c){
			System.out.print(a);
		}
		else if(b<a && b<c){
			System.out.print(b);
		}
		else {
			System.out.print(c);
		}
	}
	public static void main(String[] args){
		smallest(15,6,2);
	}
}