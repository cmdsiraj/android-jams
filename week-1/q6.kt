fun main()
{
    val character = 's'
    if(character in ('a'..'z'))
    {
        println("${character} is an Alphabet")
    }
   else if(character in 'A' until 'Z' )
    {
        println("${character} is an Alphabet")
    }
    else
    {
         println("${character} is not an Alphabet")
    }
}
