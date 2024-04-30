class ARRAYtask 
{
	public static void main(String[] args) 
	{

		System.out.println("Hello World!");
		int arr[]={1,3,5,2,4,6,11,12,15,16};
		System.out.println("even arrays intergeers are :");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
               System.out.print(arr[i]+" ");
			}
		}
		System.out.println("odd arrays intergeers are :");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
               System.out.print(arr[i]+" ");
			}
		}
	}
}
