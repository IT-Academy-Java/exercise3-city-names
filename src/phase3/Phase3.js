/*
 * Phase 3
 */

let city1, city2, city3, city4, city5, city6;
let cityInput = [];

for (let i = 0; i < 6; i++) {
    let actualName = prompt(`Write a name of city${i+1}`);
    if(actualName != null){
        wordTemp = updateLetter(actualName);
        cityInput.push(wordTemp)
    }
}

function updateLetter(word){
    let newWord = "";
    for (let i = 0; i < word.length; i++) {
        if(word.charAt(i) === "a" || word.charAt(i) === "A"){
            newWord += "4";
        } else{
            newWord += word.charAt(i);
        }
    }
    return newWord;
}

let arrayCiutats = [...cityInput];
console.log("---- SIN ORDENAR ---")
console.log(arrayCiutats);

console.log("----  ORDENADAS  ---")
arrayCiutats.sort();
console.log(arrayCiutats);
