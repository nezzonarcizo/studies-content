package stringBuilder;

public class DeleteStringBuilder { public DeleteStringBuilder() {}
  public static void main(String[] args) { Object objetoRef = "Maria";
    String String = "Joaquina";
    char[] conjArray = { 'S', 'i', 'l', 'v', 'a' };
    
    StringBuilder buffer = new StringBuilder();
    
    buffer.insert(0, objetoRef);
    buffer.insert(0, " ");
    buffer.insert(0, String);
    buffer.insert(0, " ");
    buffer.insert(0, conjArray);
    buffer.insert(0, " ");
    System.out.printf("Valores antes do delete:\n%s\n\n", new Object[] { buffer.toString() });
    
    buffer.delete(0, 1);
    buffer.deleteCharAt(4);
    System.out.printf("Valores depois do delete:\n%s\n\n", new Object[] { buffer.toString() });
  }
}