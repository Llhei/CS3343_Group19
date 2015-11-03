package simulator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
  
  private static String fileName;
  static File log;
  
  public Logger(String fn) {
    fileName = fn;
    
  }
<<<<<<< HEAD
  /**
   * Creating Log and print log.
   */
  public static void createLog(String msg) {
    System.out.println(msg);
    
    log = new File(fileName + ".txt");
    try {
      if (log.exists() == false) {
        log.createNewFile();
=======
  
  public static void createLog(String msg) {
    System.out.println(msg);
    
    log = new File(fileName+".txt");
    try{
      if(log.exists()==false){
              log.createNewFile();
>>>>>>> origin/master
      }
      PrintWriter out = new PrintWriter(new FileWriter(log, true));
      out.append(msg + System.getProperty("line.separator"));
      out.close();
<<<<<<< HEAD
      } catch(IOException e) {
        System.out.println("Could not log.");
=======
      }catch(IOException e){
          System.out.println("COULD NOT LOG!!");
>>>>>>> origin/master
      }
    
  }
    
}
