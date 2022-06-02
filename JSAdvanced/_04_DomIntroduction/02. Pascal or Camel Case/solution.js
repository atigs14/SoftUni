function solve() {
    let input = document.getElementById(`text`).value.toLowerCase();
    let currentCase = document.getElementById(`naming-convention`).value;
    let result = ``;

    let words = input.split(` `);


    if (currentCase == `Camel Case`) {
        result += words[0];
        toUpperFirstLetterOfWord(words);

    } else if(currentCase == `Pascal Case`){
      result += words[0].substring(0,1).toUpperCase() + words[0].substring(1);
      toUpperFirstLetterOfWord(words);
    } else {
        result = `Error!`
    }

    result.trim()

    document.getElementById(`result`).textContent = result;


    function toUpperFirstLetterOfWord(words) {
      for (let i = 1; i < words.length; i++) {
        let word = words[i];

        word = word.substring(0,1).toUpperCase() + word.substring(1);
        result += word;
      }
    }


}