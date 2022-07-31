object q5 extends App{
  def calculate(deposit:Double):Double={
    if(deposit<=20000){
      return deposit*0.02;
    }else if(deposit<=200000){
      return deposit*0.04;
    }else if(deposit<=2000000){
      return deposit*0.035;
    }else{
      return deposit*0.065;
    }
  }
  println("Total interest : "+calculate(20000.00));

}
