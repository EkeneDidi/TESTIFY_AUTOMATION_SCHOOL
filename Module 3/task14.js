//My Personal Library 2

const book = {
    title: "the notebook",

description: "The Notebook is a contemporary love story set in the pre- and post-World War II era",
 
numberOfPages: 478,

author:  "Nicholas Sparks",

reading: true,

toggleOpenAndClose: function(){
    if(book.reading===false) {
        book.reading = true
    } else {
        book.reading = false
    }
}

}
book.toggleOpenAndClose()
console.info(book.reading)