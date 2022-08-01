println("Enter number: ");
val n = scala.io.StdIn.readInt();

def checkNumber(n: Int):String={
  n match{
    case n if(n<=0) => "Negative/Zero is input";
    case n if(n%2==0) => "Even number is given";
    case default => "Odd number is given";
  }; 
}

println("\n\n"+checkNumber(n)+"\n\n");
