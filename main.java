public class Main
{
	public static void main(String[] args) {
		int []arr={1,2,2,3,5,6,7,7,7,7};
		int key=7;
		int left=0;
		int ans=-1;
		int right=arr.length-1;
		for (int i=0;i<arr.length-1;i++){
		    int mid=(left+right)/2;
		    if(arr[mid]==key){
		        ans=mid;
		        left=mid+1;
		        }else if(arr[mid]<key){
		        left=mid+1;
		    }else{
		        right=mid-1;
		    }
		       }
		       System.out.print(ans);
	}
}
