public class Testdialog {
   public static void main(String[] args) {
      //variblen definieren
      float values[] = { 1, 2, 3, 4, 5 };
      //String[] operations = { "sum" };
      String[] operations = { "subtract" };

      // operationen ausführen
      NumberCruncherAnonym cruncherAnonym = new NumberCruncherAnonym(values);
      cruncherAnonym.crunch(operations);

      // ergebnis ausgeben
      for (float f : values) {
         System.out.printf("%f, ", f);
      }
   }
}