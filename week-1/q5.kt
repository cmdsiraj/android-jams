fun main()
{
    println("Enter the three sides of triangle :")
    val a = readLine()
    val b = readLine() 
    val c = readLine()

    if(a == b && a==c ) 
    {
        println("The triangle is an Equilateral triangle")
    }
    else if(a==b && a!=c) 
    {
        println("The triangle is an Iscoseles triangle")
    }
    else
    println("The triangle is a Scalen triangle")
}
