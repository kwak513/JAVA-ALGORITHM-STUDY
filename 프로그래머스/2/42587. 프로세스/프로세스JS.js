function solution(priorities, location) {
    
    const queue = [];
    
    for(let i = 0; i < priorities.length; i++){
        queue.push([i, priorities[i]]);
    }
    
    let count = 0;
    
    while(queue.length !== 0){
        
        let polledItem = queue.shift();
        let hasBigger = false;
        
        for(const item of queue){
            
            let idx = item[0];
            let priorNum = item[1];
            
            if(polledItem[1] < priorNum){
                hasBigger = true;
                break;
            }
        }
        
        if(hasBigger){
            queue.push(polledItem);
        }
        else{
            count++;
            
            if(location === polledItem[0]){
                return count;
            }
        }
        
    }
    return -1;
}
