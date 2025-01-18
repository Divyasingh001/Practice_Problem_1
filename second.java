class Evenoddnumber{
  public static void main(String[] args){
	int start=1;
	int end=10;
	System.out.println("even number");
	for(int i=start;i<=end;i++){
	   if(i%2==0){
	    System.out.println(i+" ");
	   }
	}
	System.out.println("odd number");
	for(int i=start;i<=end;i++){
           if(i%2!=0){
		System.out.println(i+ " ");
           }
	}
     }
}
