package net.LWJGLClient.client.d.b.a;

import net.LWJGLClient.client.a.OnDemandFetcher;
import net.LWJGLClient.client.d.Class569;
import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.d.b.Class329;
import net.LWJGLClient.client.model.Class862;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.a.a.Class504;
import net.LWJGLClient.client.a.d.RgbImage;

public final class Class332 {
   private static boolean Field1987 = false;
   private final int Field1988;
   private final int Field1989;
   private final int Field1990;
   private final int Field1991;
   private final Client Field1992;
   private final Class329 Field1993;
   private byte[][] Field1994;
   private byte[][] Field1995;
   private int[] Field1996;
   private int[] Field1997;
   private int[] Field1998;
   private RgbImage Field1999 = null;
   private final long Field2000;
   private static byte[][][] Field2001 = new byte[4][104][104];
   private static int[][][] Field2002 = new int[4][105][105];
   private static Class569 Field2003;
   private static SceneGraph Field2004;
   private static Class504[] Field2005;
   private int Field2006 = 0;
   private int Field2007 = 0;
   private int Field2008 = 0;

   static {
      Field2003 = new Class569(Field2001, Field2002);
      Field2004 = new SceneGraph(Field2002);
      Field2005 = new Class504[4];
   }

   public final int Method3422() {
      return this.Field1988;
   }

   public final int Method3423() {
      return this.Field1989;
   }

   public Class332(Client var1, long var2, int var4, int var5, Class329 var6) {
      Field1987 = false;
      this.Field1992 = var1;
      this.Field2000 = var2;
      this.Field1993 = var6;
      this.Field1988 = var4;
      this.Field1989 = var5;
      this.Field1990 = var4 - 6 << 3;
      this.Field1991 = var5 - 6 << 3;
      this.Method3430(var1.Field12526);
   }

   public final long Method3424() {
      long var1 = 0L;
      this.Field1994 = null;
      this.Field1995 = null;
      this.Field1996 = null;
      this.Field1997 = null;
      this.Field1998 = null;
      if (this.Field1999 != null) {
         var1 = this.Field1999.Field9879;
         this.Field1999.Field9893 = null;
      }

      this.Field1999 = null;
      return var1;
   }

   private static void Method3425() {
      int var0;
      for(var0 = 0; var0 < 4; ++var0) {
         for(int var1 = 0; var1 <= 104; ++var1) {
            for(int var2 = 0; var2 <= 104; ++var2) {
               if (var1 < 104 && var2 < 104) {
                  Field2001[var0][var1][var2] = 0;
               }

               Field2002[var0][var1][var2] = 0;
            }
         }
      }

      Field2004.Method8852();
      Field2003 = new Class569(Field2001, Field2002);
      Field2004 = new SceneGraph(Field2002);

      for(var0 = 0; var0 < 4; ++var0) {
         Field2005[var0] = new Class504(var0);
      }

   }

   public final void Method3426(Class862 var1, boolean var2) {
      if (this.Field1994 != null) {
         ++this.Field2006;

         for(int var3 = 0; var3 < this.Field1994.length; ++var3) {
            if (this.Field1996[var3] == var1.Field2736) {
               this.Field1994[var3] = var1.Field2735;
               if (var1.Field2735 == null) {
                  this.Field1996[var3] = -1;
               }
               break;
            }

            if (this.Field1997[var3] == var1.Field2736) {
               this.Field1995[var3] = var1.Field2735;
               if (var1.Field2735 == null) {
                  this.Field1997[var3] = -1;
               }
               break;
            }
         }

         if (var2 && this.Field2006 == this.Field2007) {
            Client.Field12490 = this.Field1988 - 6 << 3;
            Client.Field12491 = this.Field1989 - 6 << 3;
            Method3425();
            this.Method3427(var2);
         }

      }
   }

   private void Method3427(boolean var1) {
      if (this.Field1994 != null) {
         int var2 = this.Field1994.length;

         int var3;
         int var4;
         int var5;
         for(var3 = 0; var3 < var2; ++var3) {
            var4 = (this.Field1998[var3] >> 8 << 6) - this.Field1990;
            var5 = ((this.Field1998[var3] & 255) << 6) - this.Field1991;
            byte[] var6;
            if ((var6 = this.Field1994[var3]) != null) {
               Field2003.Method8835(var6, var5, var4, this.Field1988 - 6 << 3, this.Field1989 - 6 << 3, Field2005);
            }
         }

         if (var1) {
            try {
               Field2003.Method8817(Field2005, Field2004);
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

         for(var3 = 0; var3 < var2; ++var3) {
            var4 = (this.Field1998[var3] >> 8 << 6) - this.Field1990;
            var5 = ((this.Field1998[var3] & 255) << 6) - this.Field1991;
            if (this.Field1994[var3] == null && this.Field1989 < 800) {
               Field2003.Method8819(var5, 64, 64, var4);
            }
         }

         for(var3 = 0; var3 < var2; ++var3) {
            byte[] var8;
            if (this.Field1995 != null && (var8 = this.Field1995[var3]) != null) {
               var5 = (this.Field1998[var3] >> 8 << 6) - this.Field1990;
               int var9 = ((this.Field1998[var3] & 255) << 6) - this.Field1991;
               Field2003.Method8844(var5, Field2005, var9, Field2004, var8, Model.Field2798, false, true);
            }
         }

         Field2003.Method8826(Field2004, Field2005);
         if (!var1) {
            Field2003.Method8817(Field2005, Field2004);
         }

      }
   }

   public final void Method3428(int var1, int var2, int var3) {
      if (this.Field1999 != null && this.Field2008 == 2) {
         if (this.Field1999.Field9878 < 0L) {
            this.Field1999.Method9109(var1, var2, true);
            this.Field1999.Field9878 = -this.Field1999.Field9878;
         } else {
            var3 = var3 * 512 / 100;
            this.Field1999.Field9894 = var3;
            this.Field1999.Field9895 = var3;
            this.Field1999.Field9893 = null;
            this.Field1999.Method9109(var1, var2, true);
         }
      } else {
         if (this.Field2006 == this.Field2007 && this.Field2008 == 0) {
            this.Field2008 = 1;
            Model.Field2749.submit(new Class333(this, this));
         }

      }
   }

   private static void Method3429(int var0, int[] var1, int var2) {
      for(var2 = 0; var2 < 104; ++var2) {
         int var3 = 24624 + (103 - var2 << 9 << 2);

         for(int var4 = 0; var4 < 104; ++var4) {
            if ((Field2001[var0][var4][var2] & 24) == 0) {
               Field2004.Method8882(var1, var3, var0, var4, var2, 512);
            }

            if (var0 < 3 && (Field2001[var0 + 1][var4][var2] & 8) != 0) {
               Field2004.Method8882(var1, var3, var0 + 1, var4, var2, 512);
            }

            var3 += 4;
         }
      }

   }

   private void Method3430(OnDemandFetcher var1) {
      this.Field1994 = null;
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = (this.Field1988 - 6) / 8; var3 <= (this.Field1988 + 6) / 8; ++var3) {
         for(var4 = (this.Field1989 - 6) / 8; var4 <= (this.Field1989 + 6) / 8; ++var4) {
            ++var2;
         }
      }

      this.Field1994 = new byte[var2][];
      this.Field1995 = new byte[var2][];
      this.Field1998 = new int[var2];
      this.Field1996 = new int[var2];
      this.Field1997 = new int[var2];
      var2 = 0;

      for(var3 = (this.Field1988 - 6) / 8; var3 <= (this.Field1988 + 6) / 8; ++var3) {
         for(var4 = (this.Field1989 - 6) / 8; var4 <= (this.Field1989 + 6) / 8; ++var4) {
            this.Field1998[var2] = (var3 << 8) + var4;
            int var5;
            if ((var5 = this.Field1996[var2] = var1.Method1315(0, var4, var3)) != -1) {
               this.Field1993.Method3384(var5, this);
               var1.Method11951(3, var5, true);
               ++this.Field2007;
            }

            if ((var5 = this.Field1997[var2] = var1.Method1315(1, var4, var3)) != -1) {
               this.Field1993.Method3384(var5, this);
               var1.Method11951(3, var5, true);
               ++this.Field2007;
            }

            ++var2;
         }
      }

   }

   public final long Method3431() {
      return this.Field2000;
   }

   // $FF: synthetic method
   static void Method3432(Class332 var0) {
      Method3425();
   }

   // $FF: synthetic method
   static void Method3433(Class332 var0, boolean var1) {
      var0.Method3427(false);
   }

   // $FF: synthetic method
   static void Method3434(Class332 var0) {
      var0 = var0;
      int var1 = Client.Field12379;
      if (var0.Field1999 == null) {
         var0.Field1999 = new RgbImage(512, 512);
         var0.Field1999.Field9878 = Client.Method13218("minimap-" + var0.Field1988 + "-" + var0.Field1989);
         if (var0.Field1999.Field9878 > 0L) {
            var0.Field1999.Field9878 = -var0.Field1999.Field9878;
         }

         int[] var2 = var0.Field1999.Field9893;

         int var3;
         for(var3 = 0; var3 < 4; ++var3) {
            if (var3 != var1) {
               Method3429(var3, var2, 512);
            }
         }

         Method3429(var1, var2, 512);
         var1 = var1;

         for(var3 = 0; var3 < 104; ++var3) {
            for(int var4 = 0; var4 < 104; ++var4) {
               if ((Field2001[var1][var4][var3] & 24) == 0) {
                  var0.Field1992.Field12061.Method3421(Field2004, var2, var3, 15658734, var4, var1, 512, false);
               }

               if (var1 < 3 && (Field2001[var1 + 1][var4][var3] & 8) != 0) {
                  var0.Field1992.Field12061.Method3421(Field2004, var2, var3, 15658734, var4, var1 + 1, 512, false);
               }
            }
         }
      }

   }

   // $FF: synthetic method
   static void Method3435(Class332 var0, int var1) {
      var0.Field2008 = 2;
   }
}
