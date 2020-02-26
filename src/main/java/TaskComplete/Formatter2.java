package TaskComplete;

import com.sun.xml.internal.txw2.annotation.XmlNamespace;
import jdk.nashorn.internal.objects.NativeString;

public class Formatter2 implements Formatter {
  private String str;
  public  Formatter2(String str){
    this.str = str;
  }
  @Override
  public String change(String str) {
    return str.toUpperCase();
  }

  @Override
  public String toString() {
    return str.toUpperCase();
  }
}
