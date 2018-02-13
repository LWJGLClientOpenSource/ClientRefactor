package net.LWJGLClient.client.model.d;

import net.LWJGLClient.client.a.a.Sequence;
import net.LWJGLClient.client.a.c.NPCDefinition;
import net.LWJGLClient.client.model.Model;

public final class Npc extends Mobile {
   public int Field4102 = -1;
   public NPCDefinition Field4103;

   private Model Method9314(int var1, int var2, boolean var3, boolean var4) {
      int var5;
      int var6;
      int var7;
      int var8;
      Sequence var10;
      if (super.animation >= 0 && super.animationDelay == 0 && (var10 = Sequence.anims[super.animation]) != null) {
         var5 = var10.frame2IDS[super.Field1307];
         var6 = -1;
         if (super.anInt >= 0 && super.anInt != super.standAnimIndex) {
            var6 = Sequence.anims[super.anInt].frame2IDS[super.anInt1527];
         }

         var7 = var10.Field10144[super.Field1307];
         var8 = super.Field1308;
         int var9 = -1;
         if (super.anInt >= 0 && super.anInt != super.standAnimIndex) {
            var9 = Sequence.anims[super.anInt].frame2IDS[super.anInt1527];
         }

         if (Sequence.Method8273(var9, var5, var6) && super.animation >= 0) {
            return this.Field4103.Method11892(var9, var5, Sequence.anims[super.animation].Field10146, var6, var7, var8, var1, var2, this);
         }
      }

      var3 = false;
      var5 = -1;
      var6 = -1;
      var7 = 0;
      var8 = 0;
      Sequence var11;

      if (super.anInt >= 0 && (var4 || super.anInt1527 == 0) && (var11 = Sequence.anims[super.anInt]) != null && this.anInt1527 < var11.frame2IDS.length && super.anInt1527 < var11.frame2IDS.length) {
         var5 = var11.frame2IDS[super.anInt1527];
         var6 = var11.frame2IDS[super.Field1339];
         var7 = var11.Field10144[super.anInt1527];
         var8 = super.Field1296;
         var3 = true;
      }

      Model var12;
      if ((var12 = this.Field4103.Method11892(-1, var5, (int[])null, var6, var7, var8, var1, var2, this)) != null && var3) {
         var12.Field2753 = var5 != -1;
      }

      return var12;
   }

   public final Model Method9342(boolean var1) {
      if (this.Field4103 == null) {
         return null;
      } else {
         Model var2;
         if ((var2 = this.Method9314(Model.Field2798, this.Field4102, true, true)) == null) {
            return null;
         } else {
            var2.Field2855 = true;
            super.height = var2.Field10127;
            super.Field1289 = var2.Field2846; //2739 TODO
            return var2;
         }
      }
   }

   public final Model getModel(int var1) {
      if (this.Field4103 == null) {
         return null;
      } else {
         int var3 = this.Field4102;
         Model var4;
         if ((var4 = this.Method9314(var1, var3, true, true)) == null) {
            return null;
         } else {
            super.height = var4.Field10127;
            var4.Field2855 = true;
            boolean var10000 = this.Field4103.Field10728;
            return var4;
         }
      }
   }

   public final boolean isVisible() {
      return this.Field4103 != null;
   }
}
