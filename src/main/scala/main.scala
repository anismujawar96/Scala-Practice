object Main {

  def main(args:Array[String]): Unit =
  {
    println("Select Your Operation");
    printf("1.Add  2.Sub");
    var Option = readInt();
    print("your ans = "+mathCalculate(Option));
  }

  def mathCalculate(a: Int): Int =
  {
    println("provide 2 int number to add");
    println("provide 1 int number");
    var num1 = readInt();
    println("provide 2 int number");
    var num2 = readInt();
    if(a==1)
        return num1 + num2;
    else
      return num1 - num2;
  }
}
