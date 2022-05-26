function solve(params) {
    let result = [];
    let number = 1;

    for (let i = 0; i < params.length; i++) {
        let command = params[i];
        

        switch (command) {
            case `add`:
                result.push(number);
                number ++;
                break;
            case `remove`:
                result.pop();
                number++;
                break;
        }

    }

    if (result.length == 0) {
        console.log(`Empty`);
    } else {
        for (let i = 0; i < result.length; i++) {
            console.log(result[i]);
        }    
    }
    
}

solve(['add', 
'add', 
'add', 
'add']
)

solve(['add', 
'add', 
'remove', 
'add', 
'add'])

solve(['remove', 
'remove', 
'remove'])