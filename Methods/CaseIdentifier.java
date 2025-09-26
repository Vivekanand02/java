class CaseIdentifier{
	String caseId(char character){
		if(character>='A' && character<='Z') return "Uppercase character";
		else if (character>='a' && character<='v') return "Lowercase character";
		else if (character>='0' && character<='9') return "Digit character";
		else return "Symbols";
	}
	public static void main(String[] args){
		CaseIdentifier cId=new CaseIdentifier();
		System.out.println(cId.caseId('-'));
	}
}