/**
 * @param {string} str1
 * @param {string} str2
 * @return {string}
 */
var gcdOfStrings = function(str1, str2) {
    // 1. str1 + str2 === str2 + str
    if(str1 + str2 !== str2 + str1){
        return "";
    }

    // 2. Length's Greatest Common Divisor
    const str1Length = str1.length;
    const str2Length = str2.length;

    const minLength = Math.min(str1Length, str2Length);

    let gcdLength = 1;

    // 7 can't be a divisor of 6. 
    for(let i = minLength; i > 0; i--){
        if(str1Length % i ===0 && str2Length % i ===0){
            gcdLength = i;
            break;
        }
    }
    
    // 3. slice the input until gcdLength.
    return str1.slice(0, gcdLength);

};
