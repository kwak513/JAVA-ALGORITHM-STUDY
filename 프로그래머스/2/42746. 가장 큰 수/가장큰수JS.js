function solution(numbers) {
    
    const numbersToString = [];
    
    for(let i = 0; i < numbers.length; i++){
        
        const currentNumToString = numbers[i].toString();
        
        numbersToString.push(currentNumToString);
        
    }
    
    numbersToString.sort((a, b) => (b + a) - (a + b));
    
    if(numbersToString[0] === "0"){
        return "0";
    }
    
    let answer = "";
    
    for(const str of numbersToString){
        answer += str;
    }
    
    return answer.toString();
    
    // return numbersToString.join('');
}
