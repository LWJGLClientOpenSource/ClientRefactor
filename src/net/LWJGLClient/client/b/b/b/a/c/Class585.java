package net.LWJGLClient.client.b.b.b.a.c;

import java.util.HashMap;
import java.util.Map;
import net.LWJGLClient.client.b.b.b.a.b.ModelLoader;
import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.model.Client;

public final class Class585 {
   private static final Map Field11938;
   private boolean Field11939 = false;
   private Map Field11940 = new HashMap();
   private Map Field11941 = new HashMap();
   private float[][][] Field11942;
   private int[][][] Field11943;

   static {
      (Field11938 = new HashMap()).put(669, true);
      Field11938.put(651, true);
      Field11938.put(174, true);
      Field11938.put(61, true);
      Field11938.put(31, true);
      Field11938.put(1, true);
      Field11938.put(24, true);
      Field11938.put(25, true);
      Field11938.put(137, true);
      Field11938.put(138, true);
      Field11938.put(174, true);
      Field11938.put(336, true);
      Field11938.put(638, true);
      Field11938.put(639, true);
      Field11938.put(650, true);
      Field11938.put(668, true);
      Field11938.put(670, true);
      Field11938.put(671, true);
      Field11938.put(701, true);
      Field11938.put(763, true);
      Field11938.put(781, true);
      Field11938.put(782, true);
      Field11938.put(786, true);
      Field11938.put(895, true);
      Field11938.put(896, true);
      Field11938.put(598, true);
   }

   public Class585() {
      this.Field11942 = new float[4][SceneGraph.mapSizeWidth + 1][SceneGraph.mapSizeWidth + 1];
      this.Field11943 = new int[4][SceneGraph.mapSizeWidth + 1][SceneGraph.mapSizeWidth + 1];
   }

   public static boolean Method8950(Integer var0) {
      return Field11938.containsKey(var0);
   }

   public final void Method8951() {
      this.Field11940.clear();
      this.Field11941.clear();
      this.Field11942 = null;
      this.Field11941 = null;
   }

   public final float Method8952(int var1, int var2, int var3) {
      return this.Field11939 && Client.Field12068 > 0 ? this.Field11942[var1][var2][var3] : 0.0F;
   }

   public final float Method8953(int var1, float var2, float var3) {
      int var4 = (int)var2 >> 7;
      int var5 = (int)var3 >> 7;
      int var6 = this.Field11943[var1][var4][var5];
      float var19 = Class586.Method8961(Client.Field12490 + var4 - Client.Field12494, Client.Field12491 + var5 - Client.Field12495, var6).Method8962();
      float var20 = 0.0F;
      float var21 = 0.0F;

      for(float var7 = -1.0F; var7 <= 1.0F; ++var7) {
         for(float var8 = -1.0F; var8 <= 1.0F; ++var8) {
            ++var21;
            float var10001 = var2 + var7 * 128.0F;
            float var11 = var3 + var8 * 128.0F;
            float var10 = var10001;
            long var17 = ModelLoader.Method1481(Method8954((int)var10), Method8954((int)var11), var1);
            Integer var9;
            if ((var9 = (Integer)this.Field11940.get(var17)) != null && var9 > 0) {
               var20 = (float)((double)var20 + (double)(var19 * 0.55F));
            } else {
               var20 = (float)((double)var20 - (double)(var19 * 0.55F));
            }
         }
      }

      if ((var20 /= var21) < 0.0F) {
         var20 = 0.0F;
      }

      return var20;
   }

   private static int Method8954(int var0) {
      return var0 / 128 << 7;
   }

   public final void Method8955() {
      if (Client.Field12068 > 0) {
         for(int var1 = 0; var1 < 4; ++var1) {
            for(int var2 = 0; var2 < SceneGraph.mapSizeWidth + 1; ++var2) {
               for(int var3 = 0; var3 < SceneGraph.mapSizeWidth + 1; ++var3) {
                  int var4 = var2 << 7;
                  int var5 = var3 << 7;
                  float var6 = this.Method8953(var1, (float)var4, (float)var5);
                  this.Field11942[var1][var2][var3] = var6;
               }
            }
         }

         this.Field11939 = true;
      }

   }

   public final boolean Method8956(SceneGraph var1, Integer var2, int var3, int var4, int var5, int var6) {
      int var29 = var1.Field940[var5][var3 >> 7][var4 >> 7];
      if (!Method8950(var2)) {
         return false;
      } else {
         int var7 = var29;
         var6 = var6;
         var5 = var5;
         var2 = var2;
         Class585 var30 = this;
         if (Client.Field12068 > 0) {
            long var15 = ModelLoader.Method1481(var3, var4, var5);
            Integer var8;
            if ((var8 = (Integer)this.Field11940.get(var15)) == null) {
               this.Field11940.put(var15, 1);
               int var31 = Client.Field12490 + (var3 >> 7);
               int var9 = Client.Field12491 + (var4 >> 7);
               Class586 var32 = Class586.Method8961(var31, var9, var2);
               this.Field11943[var5][var3 >> 7][var4 >> 7] = var2;
               var9 = 1 << var32.Method8965() - 1;
               int var10 = var3 + var9 >> var32.Method8965();
               var9 = var4 + var9 >> var32.Method8965();
               int var11;
               if ((var11 = var7 - var32.Method8964() / 2) < 0) {
                  var11 = 0;
               }

               var11 = var11 / var32.Method8964() * var32.Method8964();
               long var26 = ModelLoader.Method1481((var2 << 16) + var10, (var5 << 16) + var9, var11);
               Class588 var33;
               synchronized(this) {
                  if ((var33 = (Class588)var30.Field11941.get(var26)) == null) {
                     var33 = new Class588(var5, var2, var6, var32);
                     var30.Field11941.put(var26, var33);
                  }
               }

               var33.Method9091((float)(var3 >> 7), (float)(var4 >> 7), (float)(var7 + 2 + var32.Method8966()));
            } else {
               this.Field11940.put(var15, var8 + 1);
            }
         }

         return true;
      }
   }

   public final synchronized Map Method8957() {
      return this.Field11941;
   }

   public final synchronized int Method8958() {
      return this.Field11941.size();
   }

   public final void Method8959(boolean var1) {
      this.Field11939 = false;
   }
}
