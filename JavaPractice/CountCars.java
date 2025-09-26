class CountCars{
	public static void main(String[] args){
		int v=200,w=540,tw,fw;
		float res=((w-2*v)/2);
		if(w>=2 && w%2==0 && v<w)
			System.out.print("tw :"+(int)(v-res)+" fw :"+(int)(res) );
		else System.out.print("Invalid input");
		
	}
}