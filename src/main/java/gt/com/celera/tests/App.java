package gt.com.celera.tests;
import org.apache.logging.log4j.core.config.plugins.convert.EnumConverter;
/**
 * Hello world!
 */
public final class App {
  private App() {
  }

  /**
   * Says hello to the world.
   * 
   * @param args The arguments of the program.
   */
  public static void main(String[] args) throws Exception{
    
    String some = "sefa";
    switch (some) {
      case "a":
        System.out.println("not the case you're looking for!");
        break;
      case "sefa":
        System.out.println("this is the case you're looking for!");
        break;

      default:
        break;
    }
    System.out.println("Hello World!");
    
  }
}
