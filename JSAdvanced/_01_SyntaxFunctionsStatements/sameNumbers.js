function sameNumber(numbers) {
    let input = String(numbers);
    let isSame = true;
    let sum = 0;

    let firstDigit = input[0];
    
    for (let index = 0; index < input.length; index++) {
        let currentDigit = +input[index];

        if (firstDigit != currentDigit) {
            isSame = false;
        }
        sum += currentDigit;
    }

    console.log(isSame);
    console.log(sum);
}

sameNumber(444);