function radar(speed, location) {
    
    let speedLimit = 0;
    let difference = 0;
    let status = ``;

    switch (location) {
        case `motorway`:
            speedLimit = 130;
            break;
        case `interstate`:
            speedLimit = 90;
            break;
        case `city`:
            speedLimit = 50;
            break;
        case `residential`:
            speedLimit = 20;
            break;
        default:
            break;
    }

    if (speed <= speedLimit) {
    console.log(`Driving ${speed} km/h in a ${speedLimit} zone`)
    }
    else{
        difference = speed - speedLimit;
        if (difference <= 20) {
            status = `speeding`;
        } else if (difference <= 40) {
            status = `excessive speeding`
        } else{
            status = `reckless driving`
        }
        console.log(`The speed is ${difference} km/h faster than the allowed speed of ${speedLimit} - ${status}`)
    }
    
}

radar(100,`motorway`);
radar(21,`residential`);
radar(200,`residential`);