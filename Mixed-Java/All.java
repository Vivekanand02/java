class All{
	static void first(){
		for(int i=1;i<=7;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
	static void second(){
		for(int i=1;i<=7;i++){
			for(int j=1;j<=8-i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void third(){
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void fourth(){
		for(int i=1;i<=7;i++){
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=8-i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void fifth(){
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void sixth(){
		for(int i=1;i<=7;i++){
			for(int j=2;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=8-i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		//first();
		//second();
		//third();
		//fourth();
		//fifth();
		sixth();
	}
}