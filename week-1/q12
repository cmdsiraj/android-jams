fun main()
{
    val n=5  //no.of digits
    val num = 54748 //number to be checked
    var orgnum=num 
    var sum =0
    while(orgnum!=0)
    {
        var j= orgnum%10
        var k = power(n,j)
        sum=sum+k
        orgnum=orgnum/10
    }
    if(sum==num)
    {
        println("$num is an Armstrong number")
    }
    else
    println("$num is not an Armstrong number")
}
fun power(n: Int, j: Int): Int
{
    var i=1
    var res=1
    while(i<=n)
    {
        res=res*j
        i++
    }
    return res   
}
