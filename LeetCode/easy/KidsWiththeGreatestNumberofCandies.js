var kidsWithCandies = function(candies, extraCandies) {
    

    let maxCandyCount = 0;

    for(let i = 0; i < candies.length; i++){

        const currentCandyCount = candies[i];

        maxCandyCount = Math.max(maxCandyCount, currentCandyCount);
    }

    const result = [];

    for(let j = 0; j < candies.length; j++){
        const currentCandyCount = candies[j] + extraCandies;

        if(currentCandyCount >= maxCandyCount){
            result[j] = true;
        }
        else{
            result[j] = false;
        }
    }

    return result;
};

// The time complexity in this code is O(n). There are two for loops, and the first one is repeated n times and the second one is also repeated n times which is total 2n times. And since the constrants are regardless when calculating the time complexity, the result is O(n).
// The space complexity is O(n). I made a array called result. And the length of the result array increases to n as the for loop executes.
