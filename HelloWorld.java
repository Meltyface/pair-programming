public class HelloWorld {
    
    /*
      public
      protected
      (default: nothing)
      private 
     */

    //main method == entry point of application

    // String - define the type of the argument
    // ABC[]  => array of ABC
    //
    public static void main(String[] args) {
        String name = args[0];
        System.out.println("Hello " + name);
    }

}
