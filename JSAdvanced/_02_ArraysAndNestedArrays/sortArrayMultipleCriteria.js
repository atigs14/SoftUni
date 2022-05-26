function solve(array) {
    array.sort(twoCriteriaSort);

    return array.join(`\n`);

    function twoCriteriaSort(first, second) {
        if(first.length === second.length){
            return first.localeCompare(second);
        }
        return first.length - second.length;
    }
}

console.log(solve(['alpha', 
'beta', 
'gammda']));

console.log(solve(['Isacc', 
'Theodor', 
'Jack', 
'Harrison', 
'George']
));