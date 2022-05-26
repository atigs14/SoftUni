function solve(input, rotations) {

    for (let i = 0; i < rotations; i++) {
        let lastElement = input.pop();
        input.unshift(lastElement);
    }
    console.log(input.join(` `));
}

solve(['1', 
'2', 
'3', 
'4'], 
2)

solve(['Banana', 
'Orange', 
'Coconut', 
'Apple'], 
15)