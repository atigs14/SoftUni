function solve(params) {
    let result = [];
    params.sort((a, b) => b - a);


    while (params.length != 0) {
        result.push(params.pop());
        result.push(params.shift());
    }

    return result;
}

console.log(
    solve([1, 65, 3, 52, 48, 63, 31, -3, 18, 56]));