package Utils;

import java.nio.charset.Charset;
import java.util.Random;

public class Utils {

  public static String getRandomString() {
    char[] chars = "0123fbtrb456789fdgkfdjhghfoiasu34563457787dhgfsuhgsofkgudfabcdefghijklmnopqrstuvwxyz".toCharArray();

// Longitud del array de char.
    int charsLength = chars.length;

// Instanciamos la clase Random
    Random random = new Random();

// Un StringBuffer para componer la cadena aleatoria de forma eficiente
    StringBuffer buffer = new StringBuffer();

// Bucle para elegir una cadena de 10 caracteres al azar
    for (int i = 0; i < 10; i++) {

      // Añadimos al buffer un caracter al azar del array
      buffer.append(chars[random.nextInt(charsLength)]);
    }

    return buffer.toString();
  }

}
