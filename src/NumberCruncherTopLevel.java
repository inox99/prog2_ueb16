public class NumberCruncherTopLevel {
   float values[];

   public NumberCruncherTopLevel(float values[]) {
      this.values = values;
   }

   public void crunch(String[] operations) {
      for (String operation : operations) {
         operation = operation.toLowerCase().trim();
         switch (operation) {
         case "sum":
            Sum sum = new Sum();
            sum.crunch(values);
            break;

         case "subtract":
            Subtract subtract = new Subtract();
            subtract.crunch(values);
            break;
         }
      }
   }
}
