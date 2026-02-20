class Result {

    /*
     * Complete the 'findTaskPairForSlot' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY taskDurations
     *  2. INTEGER slotLength
     */

    public static List<Integer> findTaskPairForSlot(List<Integer> taskDurations, int slotLength) {
    
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < taskDurations.size(); i++){
            
            int currentNum = taskDurations.get(i);
            int targetNum = slotLength - currentNum;
            
            if(map.containsKey(targetNum)){
                int targetIdx = map.get(targetNum);
                
                return new ArrayList<>(Arrays.asList(targetIdx, i));
            }
            
            map.put(currentNum, i);
            
        }
        
        return new ArrayList<>(Arrays.asList(-1, -1));
    
    
    
    
    
    
        /*
        for(int i = 0; i < taskDurations.size(); i++){
            
            int currentInt = taskDurations.get(i);
            
            for(int j = i + 1; j < taskDurations.size(); j++){
                
                int intToAdd = taskDurations.get(j);
                
                if(currentInt + intToAdd == slotLength){
                    return new ArrayList<>(Arrays.asList(i, j));
                }
                
            }
        }

        return new ArrayList<>(Arrays.asList(-1, -1));
        */
        
        
    }

}
