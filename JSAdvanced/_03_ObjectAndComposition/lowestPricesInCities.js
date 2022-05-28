function solve(input) {

    let result = {};

    for (const iterator of input) {
        let [townName, productName, productPrice] = iterator.split(` | `);

        if (!result.hasOwnProperty(productName)) {
            result[productName] = { townName, productPrice };
        } else {
            if (productPrice < result[productName].productPrice) {
                result[productName] = { townName, productPrice };
            }
        }
    }

    let productNames = Object.keys(result);

    for (const iterator of productNames) {
        console.log(`${iterator} -> ${result[iterator].productPrice} (${result[iterator].townName})`);
    }
}

//TESTS

solve(['Sample Town | Sample Product | 1000',

    'Sample Town | Orange | 2',

    'Sample Town | Peach | 1',

    'Sofia | Orange | 3',

    'Sofia | Peach | 2',

    'New York | Sample Product | 1000.1',

    'New York | Burger | 10'])
