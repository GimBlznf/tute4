object Q3 {

  def main(args: Array[String]): Unit = {

    formatNames("Benny")(toUpper(_))(Array());
    formatNames("Niroshan")(toUpper(_))(Array(2,3,4,5,6,7));
    formatNames("Saman")(toLower(_))(Array());
    formatNames("Kumara")(toUpper(_))(Array(1,2,3,4));

  }

  def toUpper(name: String): String = {
    name.toUpperCase();
  }

  def toLower(name: String): String = {
    name.toLowerCase();
  }

  def formatNames(name: String)(function: String => String)(indexlist: Array[Int]): Unit = {
    var a = function(name)
    var index: Int = 0;
    while (index < indexlist.length) {
      var x = a.charAt(indexlist(index));
      a = a.substring(0, indexlist(index)) + x.toLower + a.substring(
        indexlist(index) + 1
      ) 
      index = index + 1
    }

    println(a)

  }

}
