class  Mail{
  public static void main(String[] value)
  {

   String arriva="Shivubiradar2kS@gmail.com";
   String arriv2="kandgool@gmail.com";
   String arriva3="vishal@gmail.com";
   String arriv4="raju@gmail.com";
   String arriva5="akash@gmail.com";
   String[] total={arriv4,arriva,arriv2,arriva5,arriva3};
   
    String ref=total[1];
	System.out.println("Element at index of 1 : "+ref);
	String ref1=total[4];
	System.out.println("Element at index of 4 : "+ref1);
	String ref2=total[2];
	System.out.println("Element at index of 2 : "+ref2);
	String ref3=total[3];
	System.out.println("Element at index of 3 : "+ref3);
	String ref4=total[0];
	System.out.println("Element at index of 0 : "+ref4);
  }
}