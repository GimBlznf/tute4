object q1{
  
  def main(args: Array[String]):Unit={
    print("Enter deposit amount : ");
    var deposit = scala.io.StdIn.readDouble();
    print("The interest is "+findInterest(deposit));
  }
  
  def findInterest(deposit:Double):Double = deposit match{
    case  deposit  if deposit<=20000        =>    deposit*0.02
    case  deposit  if deposit<=200000       =>    deposit*0.04
    case  deposit  if deposit<=2000000      =>    deposit*0.035
    case  deposit  if deposit>2000000       =>    deposit*0.065
  }

}
