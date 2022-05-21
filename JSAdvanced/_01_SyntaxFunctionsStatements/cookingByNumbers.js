function solve(number, ...operations) {
    parsedNumber = parseInt(number);
    for (let i = 0; i < operations.length; i++) {
        let currentOperation = operations[i];

        switch (currentOperation) {
            case `chop`:
                parsedNumber /= 2;
                break;
            case `dice`:
                parsedNumber = Math.sqrt(parsedNumber);
                break;
            case `spice`:
                parsedNumber += 1;
                break;
            case `bake`:
                parsedNumber *= 3;
                break;
            case `fillet`:
                parsedNumber *= 0.8;
                break;

            default:
                break;
        }

        console.log(parsedNumber);

    }
}

solve(`32`, `chop`, `chop`, `chop`, `chop`, `chop`, `chop`);
solve(`9`, `dice`, `spice`, `chop`, `bake`, `fillet`);