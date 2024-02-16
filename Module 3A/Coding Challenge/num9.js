//Return the number of vowels in a string

function getVowels(string) {
    let Vowels = 'aAeEiIoOuU';
    let vowelsCount = 0;
    for (let i = 0; i < string.length; i++) {
        if (Vowels.indexOf(string[i]) !== -1) {
            vowelsCount += 1;
        }
    }
    return vowelsCount;
}
console.log("The Number of vowels in -" + 
" My name is Ekene Ndidiamaka Nworah = "  
+ getVowels("My name is Ekene Ndidiamaka Nworah"));