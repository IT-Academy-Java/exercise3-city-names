let city1, city2, city3, city4, city5, city6;
let cityInput = [];

for (let i = 0; i < 6; i++) {
    let actualName = prompt(`Write a name of city${i+1}`);
    if(actualName != null){
        cityInput.push(actualName)
    }
}

let arrayCiutats = [...cityInput];
arrayCiutats.sort();

console.log(arrayCiutats);
