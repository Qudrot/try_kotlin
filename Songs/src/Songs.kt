class Song (val title : String, val artiste : String){
    fun play() {
        println("playing the song $title by $artiste")
    }
    fun stop(){
        println("stopped playing $title")
    }
}
fun main (args: Array<String>){
    val songOne = Song("one ticket","Kiss Daniel ft Davido")
    val songTwo = Song("jailer","Asa")
    val songThree = Song("High notes","Banky W")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}