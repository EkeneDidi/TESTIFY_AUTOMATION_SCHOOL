

const book = {
    title: "the notebook",
    description: "The Notebook is a contemporary love story set in the pre- and post-World War II era",
    numberOfPages: 478,
    author:  "Nicholas Sparks",
    reading: true,
    books: [

        {
            title: "Perks of Being a Wallflower",
            description: "This is the kind of book you want to shove in your friend's face and not leave until they read.",
            numberOfPages: 378,
            author:  "Stephen Chbosky",
            reading: false,
        },

        { 
            title: "The Bluest Eye",
            description: "It has less to do with plot and more to do with general themes of life and of course each character seem to give off an intense vibe - from pity or even empathy to anger, hatred and disgust",
            numberOfPages: 500,
            author:  "Toni Morrison",
            reading: true,

        },

        {
            title: "Brida and The Witch of Portobello",
            description: "Brida is the journey of a young witch (also called Brida) finding her soulmate - an important ritual amongst the sisterhood of the witches. Witch of Portobello is another story I regretted to have not finshed, it began excitingly enough.",
            numberOfPages: 800,
            author:  "Paulo Coehlo",
            reading: true,

        }
    ]
    

}
console.log([book.books[1],book.books[2]])