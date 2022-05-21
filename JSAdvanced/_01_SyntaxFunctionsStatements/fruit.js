function buyKFruit(fruits, weightInGrams, pricePerKilogram) {
    let weightInKilograms = weightInGrams / 1000;
    let totalPrice = weightInKilograms * pricePerKilogram;

    console.log(`I need $${totalPrice.toFixed(2)} to buy ${weightInKilograms.toFixed(2)} kilograms ${fruits}.`)
}

buyKFruit('orange', 2500, 1.80)