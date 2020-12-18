fun main()
{
    var n=153
    var j=0
    val k=n
    var sum=0
    while(n!=0)
    {
        j=n%10
        n=n/10
        sum=sum+(j*j*j)
    }
    if(sum==k)
    {
        println("$k is an Armstrong number")
    }
}
