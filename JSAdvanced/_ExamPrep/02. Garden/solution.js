class Garden {
  constructor(spaceAvailable) {
    this.spaceAvailable = spaceAvailable;
    this.plants = [];
    this.storage = [];
  }

  addPlant(plantName, spaceRequeired) {
    if (this.spaceAvailable < spaceRequeired) {
      throw new Error(`Not enough space in the garden.`);
    }

    this.spaceAvailable -= spaceRequeired;
    this.plants.push({
      plantName,
      spaceRequeired,
      ripe: false,
      quantity: 0
    });

    return `The ${plantName} has been successfully  planted in the garden.`;
  }

  ripenPlant(plantName, quantity) {
    if (quantity <= 0) {
      throw new Error(`The quantity cannot be zero or negative.`)
    }
    const plant = this.plants.find(p => p.plantName == plantName);
    if (plant == undefined) {
      throw new Error(`There is no ${plantName} in the garden.`);
    }
    if (plant.ripe) {
      throw new Error(`The ${plantName} is already ripe.`);
    }

    plant.ripe = true;
    plant.quantity += quantity;

    if (quantity == 1) {
      return `${quantity} ${plantName} has successfully ripened.`;
    } else {
      return `${quantity} ${plantName}s have successfully ripened.`;
    }
  }

  harvestPlant(plantName) {
    
  }

  generateReport() {

  }
}
