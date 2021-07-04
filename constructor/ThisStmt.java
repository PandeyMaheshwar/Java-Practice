class ThisStmt
{
 ThisStmt()
 {  this(1);
 	System.out.println("!!!!!");
 }
 ThisStmt(int i)
 {
 	System.out.println("@@@@@");
 }
 public static void main(String[] args) {
 	ThisStmt a = new ThisStmt();
 }
}