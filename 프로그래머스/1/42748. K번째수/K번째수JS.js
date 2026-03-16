function solution(array, commands) {
    
    const answer = [];
    
    for(let p = 0; p < commands.length; p++){
        
        const iToIdx = commands[p][0] - 1;
        const jToIdx = commands[p][1];
        const kToIdx = commands[p][2] - 1;
        
        const copyOfArray = [];
        
        for(let q = 0; q < array.length; q++){
            copyOfArray.push(array[q]);
        }
        
        const cutArray = copyOfArray.slice(iToIdx, jToIdx);
        
        cutArray.sort((a, b) => a - b);
        
        answer[p] = cutArray[kToIdx];
        
    }
    return answer;
}
