public class NumberCruncherAnonym  {
   float values[];

   public NumberCruncherAnonym(float values[]) {
      this.values = values;
   }

   public void crunch(String[] operations) {
      for (String operation : operations) {
         operation = operation.toLowerCase();
         switch (operation) {
         case "sum":
            CrunchOperation sum = new CrunchOperation() {
               public void crunch(float values[]) {
                  for (int i = 1; i < values.length; i++) {
                     values[i] = values[i - 1] + values[i];
                  }
               }
            };
            sum.crunch(values);
            break;

         case "subtract":
            CrunchOperation subtract = new CrunchOperation() {
               public void crunch(float values[]) {
                  for (int i = 1; i < values.length; i++) {
                     values[i] = values[i - 1] - values[i];
                  }
               }
            };
            subtract.crunch(values);
            break;
         }
      }
   }
}
