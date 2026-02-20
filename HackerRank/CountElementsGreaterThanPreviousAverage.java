
class Result {

    /*
     * Complete the 'countResponseTimeRegressions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY responseTimes as parameter.
     */
     
     

    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
    // Write your code here
        int count = 0;
        long sum = 0;
        
        for(int i = 0; i < responseTimes.size(); i++){
            if(i > 0){
                double average = (double) sum / i;
                if(average < responseTimes.get(i)){
                    count++;
                }
                
            }
            
            sum += responseTimes.get(i);
        }
        
        return count;

    }

}
