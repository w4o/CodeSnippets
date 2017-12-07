```java
// import java.io.*;

public static String read(File file) throws Exception {

    BufferedReader br = new BufferedReader(new FileReader(file));
    StringBuilder buffer = new StringBuilder();
    String line;
    while ((line = br.readLine()) != null) {
    	buffer.append(line);
    }
    br.close();

    return buffer.toString();
}
```

```java
// import java.io.*;

public static String read(String fileName) throws Exception {
    File file = new File(fileName);
    if (!file.exists()) {
    	return null;
    }
    return read(file);
}
```
