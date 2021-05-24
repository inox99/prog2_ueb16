public class Testdialog {
   public static void main(String[] args) {
      try {
         // variblen definieren
         float values[] = { 1, 2, 3, 4, 5 };
         // String[] operations = { "sum" };
         String[] operations = { "subtract", "sum" };

         // initialwerteausgeben
         for (float f : values) {
            System.out.printf("%f, ", f);
         }
         System.out.println();

         System.out.println(String.join(", ", operations));
         // operationen ausführen
         System.out.println("mit NumberCruncherAnonym");
         NumberCruncherAnonym cruncherAnonym = new NumberCruncherAnonym(values);
         // initialwerteausgeben
         for (float f : values) {
            System.out.printf("%f, ", f);
         }
         System.out.println();
         cruncherAnonym.crunch(operations);

         // ergebnis ausgeben
         for (float f : values) {
            System.out.printf("%f, ", f);
         }
         System.out.println();

         //
         // das gleiche mit NumberCruncherTopLevel
         System.out.println();
         float values2[] = { 1, 2, 3, 4, 5 };
         System.out.println(String.join(", ", operations));
         System.out.println("mit NumberCruncherTopLevel");
         NumberCruncherTopLevel cruncherTopLevel = new NumberCruncherTopLevel(values2);
         for (float f : values2) {
            System.out.printf("%f, ", f);
         }
         System.out.println();
         cruncherTopLevel.crunch(operations);
         // ergebnis ausgeben
         for (float f : values2) {
            System.out.printf("%f, ", f);
         }
         System.out.println();

      } catch (

      Exception e) {
         System.out.println(e);
      }
   }
}