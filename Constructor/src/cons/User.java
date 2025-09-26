package cons;
public class User {
    int user_id;
    String userName;
    long phone_no;
  User(int user_id,String userName, long phone_no){
	  user_id=user_id;
	  userName=userName;
	  phone_no=phone_no;
	  
  }
    public static void main(String[] args) {
        User u1 = new User(1,"vivi",87666l);
       System.out.println(u1.user_id);
       System.out.println(u1.userName);
       System.out.println(u1.phone_no);
        
    }
}
