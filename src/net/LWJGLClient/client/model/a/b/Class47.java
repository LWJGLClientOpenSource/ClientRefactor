package net.LWJGLClient.client.model.a.b;

import net.LWJGLClient.client.a.c.ItemDef;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.a.a.Class511;
import net.LWJGLClient.client.b.b.GraphicsDisplay;

public final class Class47 extends Class511 {
   public int itemID;
   public int Field2195;
   public int Field2196;
   public int Field2197;
   public int Field2198;
   public int Field2199;

   public final Model getModel(int var1) {
      Model var2;
      if ((var2 = ItemDef.forID(this.itemID).Method11920(this.Field2199, true)) != null) {
         var2.Field2745 = false;
      }

      if (!GraphicsDisplay.Field2678 && var2 != null) {
         var2.Field2745 = true;
      }

      if (var2 != null && super.Field10125) {
         if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
            var2.Method14452(super.Field10121, super.Field10122, super.Field10123, super.Field10124, super.Field10118, super.Field10119, super.Field10120);
         } else {
            var2.Method14451(super.Field10121, super.Field10122, super.Field10123, super.Field10124);
         }
      }

      if (var2 != null) {
         if (var2.Field2846 < 40) {
            var2.Field2846 = 40;
         }

         if (var2.Field10127 < 20) {
            var2.Field10127 = 20;
         }
      }

      return var2;
   }
}
