function solve(input) {
    let biggestEl = 0;
    let result = [];

    for (let i = 0; i < input.length; i++) {
        if (biggestEl <= input[i]) {
            biggestEl = input[i];
            result.push(biggestEl);
        }
    }

    return result;
}

console.log(solve([1, 
    3, 
    8, 
    4, 
    10, 
    12, 
    3, 
    2, 
    24]));