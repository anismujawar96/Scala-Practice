package second_day

object Test {

 // var count = 0;
  def main(args:Array[String]): Unit =
  {
    printf("enter no in binary to test");
    val binaryNumber:String = readLine();
    var textNumber:Int = Integer.parseInt(binaryNumber,2);
   println( "total count is = "+testCase(textNumber));
  }

    def testCase(n:Int,acc:Int=0):Int =
    {
      if (n == 0)
        return acc;
      else if (n % 2 == 0)
        {
          println(n+" = this is even number with divide by 2 "+" With stepNo ="+acc)
          return testCase(n / 2, acc + 1);
        }
      else
      {
        println(n+" = this is odd number with subtract by 1 "+" With stepNo ="+acc)
        return testCase(n - 1,acc + 1);
      }
    }

}
