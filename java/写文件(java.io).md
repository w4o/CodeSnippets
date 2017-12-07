```java
// import java.io.*;

public static void write(String fileName, String context) throws Exception {
    File file = new File(fileName);
    if (!file.exists()) {
    	file.createNewFile();
    }
    BufferedWriter br = new BufferedWriter(new FileWriter(file));
    br.write(context);
    br.flush();
    br.close();
}
```
