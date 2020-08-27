
public class StolenSolution {
	public static void main(String args[]){
        long start = System.currentTimeMillis();
         
        int largest = 0;
        int longest_sequence = 0;
        for(int n = 2; n < 1000001; n++){
            long Number = n;
            int counter = 1;
            while(Number > 1){
                if(Number % 2 == 0){
                    Number = Number / 2;
                } else{
                    Number = (Number * 3) + 1;
                }
                counter += 1;
            }
             
            if(counter > longest_sequence){
                longest_sequence = counter;
                largest = n;
            }
        }
     
        System.out.format("Answer = %d", largest);
        System.out.println();
        System.out.format("longest_sequence = %d ", longest_sequence);
        System.out.println();
        long stop = System.currentTimeMillis();
        System.out.println("Run time = " + (stop - start) + " milliseconds");
    }
 
}
