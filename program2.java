public class program2 {
    
    public static void main(String arg[])
    {

        int arr[]={1,2,3,4,5};


        try{
            System.out.println(arr[10]);
        }catch(Exception e){
            
            System.out.println("Error in printing");
        }finally{
            System.out.println("Finally");
        }
    }
    
}
