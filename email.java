public class Main{
  public static void main(String[] args){
	String address = "abcdefg@gmail.com";
	String text = "最近寒くなってきた。10月10日";
	email(address, text);
  }

  public static void email(String address, String text){
	System.out.println(address + "に以下のメールを送信しました。");
	System.out.println("件名:つぶやき");
	System.out.println("本文:"+text);
 }
}
