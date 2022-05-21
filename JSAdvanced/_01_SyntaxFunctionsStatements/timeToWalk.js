function solve(steps, lenghtOfFootPrint, speed) {
    let distanceMeters = steps * lenghtOfFootPrint;
    let speedMetersSeconds = speed / 3.6;
    let time = distanceMeters / speedMetersSeconds;
    let rest = Math.floor(distanceMeters / 500);

    let timeHrs = Math.floor(time / 3600);
    let timeMin = Math.floor(time / 60);
    let timeSec = Math.round(time - (timeMin * 60));

    console.log((timeHrs < 10 ? "0" : "") + timeHrs + ":" + (timeMin + rest < 10 ? `0` : ``) + (timeMin + rest) + `:` + (timeSec < 10 ? `0` : ``) + timeSec);

}

solve(4000, 0.6, 5);
