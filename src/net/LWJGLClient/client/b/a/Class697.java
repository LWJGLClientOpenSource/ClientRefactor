package net.LWJGLClient.client.b.a;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.model.c.Class171;

public class Class697 extends Class171 {
   public static float[] Field8758 = new float[1];
   private static int[] Field8759 = new int[1];
   public static int[] Field8760;
   public static int Field8761;
   public static int Field8762;
   public static int Field8763;
   public static int Field8764;
   public static int Field8765;
   public static int Field8766;
   public static int Field8767;
   public static int Field8768;
   public static int Field8769;

   public static void Method11982(int var0, int var1, int[] var2) {
      Field8760 = var2;
      Field8761 = var1;
      Field8762 = var0;
      Method11985(var0, 0, var1, 0);
   }

   public static void Method14474() {
      Field8765 = 0;
      Field8763 = 0;
      Field8766 = Field8761;
      Field8764 = Field8762;
      Field8767 = Field8766 - 1;
      Field8768 = Field8766 / 2;
   }

   public static void Method11984(int var0, int var1) {
      Field8761 = var0;
      Field8762 = var1;
      Method11985(var1, 0, Field8761, 0);
   }

   public static void Method11985(int var0, int var1, int var2, int var3) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var3 < 0) {
         var3 = 0;
      }

      if (var2 > Field8761) {
         var2 = Field8761;
      }

      if (var0 > Field8762) {
         var0 = Field8762;
      }

      Field8765 = var1;
      Field8763 = var3;
      Field8766 = var2;
      Field8764 = var0;
      Field8767 = Field8766 - 1;
      Field8768 = Field8766 / 2;
      Field8769 = Field8764 / 2;
   }

   public static void Method14445(int var0) {
      if (!GraphicsDisplay.Field2678) {
         int var1 = Field8761 * Field8762;
         if (Field8758.length != Field8761 * Field8762) {
            Field8758 = new float[Field8761 * Field8762];
            Field8759 = new int[Field8761 * Field8762];
         }

         for(int var2 = 0; var2 < var1; ++var2) {
            Field8760[var2] = var0;
            Field8758[var2] = 1.6777215E7F;
            Field8759[var2] = 0;
         }

      }
   }

   public static void Method8270(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (!GraphicsDisplay.Field2678) {
         if (var5 < Field8765) {
            var2 -= Field8765 - var5;
            var5 = Field8765;
         }

         if (var1 < Field8763) {
            var3 -= Field8763 - var1;
            var1 = Field8763;
         }

         if (var5 + var2 > Field8766) {
            var2 = Field8766 - var5;
         }

         if (var1 + var3 > Field8764) {
            var3 = Field8764 - var1;
         }

         int var6 = 256 - var4;
         int var7 = (var0 >> 16 & 255) * var4;
         int var8 = (var0 >> 8 & 255) * var4;
         var0 = (var0 & 255) * var4;
         var4 = Field8761 - var2;
         var1 = var5 + var1 * Field8761;

         for(var5 = 0; var5 < var3; ++var5) {
            for(int var9 = -var2; var9 < 0; ++var9) {
               int var10 = (Field8760[var1] >> 16 & 255) * var6;
               int var11 = (Field8760[var1] >> 8 & 255) * var6;
               int var12 = (Field8760[var1] & 255) * var6;
               var10 = (var7 + var10 >> 8 << 16) + (var8 + var11 >> 8 << 8) + (var0 + var12 >> 8);
               Field8760[var1++] = var10;
            }

            var1 += var4;
         }

      }
   }

   public static void Method8269(int var0, int var1, int var2, int var3, int var4) {
      if (!GraphicsDisplay.Field2678) {
         if (var2 < Field8765) {
            var4 -= Field8765 - var2;
            var2 = Field8765;
         }

         if (var1 < Field8763) {
            var0 -= Field8763 - var1;
            var1 = Field8763;
         }

         if (var2 + var4 > Field8766) {
            var4 = Field8766 - var2;
         }

         if (var1 + var0 > Field8764) {
            var0 = Field8764 - var1;
         }

         int var5 = Field8761 - var4;
         var1 = var2 + var1 * Field8761;

         for(var0 = -var0; var0 < 0; ++var0) {
            for(var2 = -var4; var2 < 0; ++var2) {
               Field8760[var1++] = var3;
            }

            var1 += var5;
         }

      }
   }

   public static void Method14503(int var0, int var1, int var2, int var3, int var4) {
      if (!GraphicsDisplay.Field2678) {
         Method11989(var4, var3, var1, var0);
         Method11989(var4 + var2 - 1, var3, var1, var0);
         Method11991(var4, var3, var2, var0);
         Method11991(var4, var3, var2, var0 + var1 - 1);
      }
   }

   public static void Method11988(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (!GraphicsDisplay.Field2678) {
         Method11990(var3, var4, var0, var2, var5);
         Method11990(var3, var4, var0 + var1 - 1, var2, var5);
         if (var1 >= 3) {
            Method11992(var3, var5, var2, var0 + 1, var1 - 2);
            Method11992(var3, var5 + var4 - 1, var2, var0 + 1, var1 - 2);
         }

      }
   }

   public static void Method11989(int var0, int var1, int var2, int var3) {
      if (!GraphicsDisplay.Field2678) {
         if (var0 >= Field8763 && var0 < Field8764) {
            if (var3 < Field8765) {
               var2 -= Field8765 - var3;
               var3 = Field8765;
            }

            if (var3 + var2 > Field8766) {
               var2 = Field8766 - var3;
            }

            var0 = var3 + var0 * Field8761;

            for(var3 = 0; var3 < var2; ++var3) {
               Field8760[var0 + var3] = var1;
            }

         }
      }
   }

   private static void Method11990(int var0, int var1, int var2, int var3, int var4) {
      if (!GraphicsDisplay.Field2678) {
         if (var2 >= Field8763 && var2 < Field8764) {
            if (var4 < Field8765) {
               var1 -= Field8765 - var4;
               var4 = Field8765;
            }

            if (var4 + var1 > Field8766) {
               var1 = Field8766 - var4;
            }

            int var5 = 256 - var3;
            int var6 = (var0 >> 16 & 255) * var3;
            int var7 = (var0 >> 8 & 255) * var3;
            var0 = (var0 & 255) * var3;
            var2 = var4 + var2 * Field8761;

            for(var3 = 0; var3 < var1; ++var3) {
               var4 = (Field8760[var2] >> 16 & 255) * var5;
               int var8 = (Field8760[var2] >> 8 & 255) * var5;
               int var9 = (Field8760[var2] & 255) * var5;
               var4 = (var6 + var4 >> 8 << 16) + (var7 + var8 >> 8 << 8) + (var0 + var9 >> 8);
               Field8760[var2++] = var4;
            }

         }
      }
   }

   public static void Method11991(int var0, int var1, int var2, int var3) {
      if (!GraphicsDisplay.Field2678) {
         if (var3 >= Field8765 && var3 < Field8766) {
            if (var0 < Field8763) {
               var2 -= Field8763 - var0;
               var0 = Field8763;
            }

            if (var0 + var2 > Field8764) {
               var2 = Field8764 - var0;
            }

            var0 = var3 + var0 * Field8761;

            for(var3 = 0; var3 < var2; ++var3) {
               Field8760[var0 + var3 * Field8761] = var1;
            }

         }
      }
   }

   private static void Method11992(int var0, int var1, int var2, int var3, int var4) {
      if (!GraphicsDisplay.Field2678) {
         if (var1 >= Field8765 && var1 < Field8766) {
            if (var3 < Field8763) {
               var4 -= Field8763 - var3;
               var3 = Field8763;
            }

            if (var3 + var4 > Field8764) {
               var4 = Field8764 - var3;
            }

            int var5 = 256 - var2;
            int var6 = (var0 >> 16 & 255) * var2;
            int var7 = (var0 >> 8 & 255) * var2;
            var0 = (var0 & 255) * var2;
            var1 += var3 * Field8761;

            for(var2 = 0; var2 < var4; ++var2) {
               var3 = (Field8760[var1] >> 16 & 255) * var5;
               int var8 = (Field8760[var1] >> 8 & 255) * var5;
               int var9 = (Field8760[var1] & 255) * var5;
               var3 = (var6 + var3 >> 8 << 16) + (var7 + var8 >> 8 << 8) + (var0 + var9 >> 8);
               Field8760[var1] = var3;
               var1 += Field8761;
            }

         }
      }
   }

   public static void Method14521(int var0, int var1, int var2, int var3, int var4) {
      if (!GraphicsDisplay.Field2678) {
         if (Field8765 > 0) {
            var4 -= Field8765;
            var2 = Field8765;
         }

         if (Field8763 > 0) {
            var0 -= Field8763;
            var1 = Field8763;
         }

         if (var2 + var4 > Field8766) {
            var4 = Field8766 - var2;
         }

         if (var1 + var0 > Field8764) {
            var0 = Field8764 - var1;
         }

         var3 = Field8761 - var4;
         var1 = var2 + var1 * Field8761;

         for(var0 = -var0; var0 < 0; ++var0) {
            for(var2 = -var4; var2 < 0; ++var2) {
               Field8760[var1++] = 0;
            }

            var1 += var3;
         }

      }
   }
}
