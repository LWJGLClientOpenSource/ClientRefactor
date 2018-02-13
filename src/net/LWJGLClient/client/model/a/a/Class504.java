package net.LWJGLClient.client.model.a.a;

import java.util.HashMap;
import java.util.Map;
import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.model.Client;

public final class Class504 {
   private static Map Field12865;
   private int Field12866;
   private int Field12867;
   public int[][] Field12868;

   static {
      (Field12865 = new HashMap()).clear();
      short var1 = 4892;
      boolean var0 = true;
      Field12865.put((2460 << 16) + var1, true);
      var1 = 4893;
      var0 = true;
      Field12865.put((2459 << 16) + var1, true);
      var1 = 4893;
      var0 = true;
      Field12865.put((2460 << 16) + var1, true);
      var1 = 4892;
      var0 = true;
      Field12865.put((2465 << 16) + var1, true);
      var1 = 4893;
      var0 = true;
      Field12865.put((2465 << 16) + var1, true);
      var1 = 4893;
      var0 = true;
      Field12865.put((2466 << 16) + var1, true);
      var1 = 4898;
      var0 = true;
      Field12865.put((2465 << 16) + var1, true);
      var1 = 4898;
      var0 = true;
      Field12865.put((2466 << 16) + var1, true);
      var1 = 4899;
      var0 = true;
      Field12865.put((2465 << 16) + var1, true);
      var1 = 4898;
      var0 = true;
      Field12865.put((2460 << 16) + var1, true);
      var1 = 4898;
      var0 = true;
      Field12865.put((2459 << 16) + var1, true);
      var1 = 4899;
      var0 = true;
      Field12865.put((2460 << 16) + var1, true);
   }

   public Class504(int var1) {
      this.Field12866 = SceneGraph.mapSizeWidth;
      this.Field12867 = SceneGraph.mapSizeWidth;
      this.Field12868 = new int[this.Field12866][this.Field12867];
      this.Method8187();
   }

   public final void Method8187() {
      for(int var1 = 0; var1 < this.Field12866; ++var1) {
         for(int var2 = 0; var2 < this.Field12867; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 != this.Field12866 - 1 && var2 != this.Field12867 - 1) {
               this.Field12868[var1][var2] = 16777216;
            } else {
               this.Field12868[var1][var2] = 16777215;
            }

            int var10001 = Client.Field12490 + var1;
            int var4 = Client.Field12491 + var2;
            if ((Boolean)Field12865.get((var10001 << 16) + var4) != null) {
               this.Field12868[var1][var2] = 16777215;
            }
         }
      }

   }

   public final void Method8188(int var1, int var2, int var3, int var4, boolean var5) {
      if (var4 == 0) {
         if (var2 == 0) {
            this.Method8191(var3, var1, 128);
            this.Method8191(var3 - 1, var1, 8);
         }

         if (var2 == 1) {
            this.Method8191(var3, var1, 2);
            this.Method8191(var3, var1 + 1, 32);
         }

         if (var2 == 2) {
            this.Method8191(var3, var1, 8);
            this.Method8191(var3 + 1, var1, 128);
         }

         if (var2 == 3) {
            this.Method8191(var3, var1, 32);
            this.Method8191(var3, var1 - 1, 2);
         }
      }

      if (var4 == 1 || var4 == 3) {
         if (var2 == 0) {
            this.Method8191(var3, var1, 1);
            this.Method8191(var3 - 1, var1 + 1, 16);
         }

         if (var2 == 1) {
            this.Method8191(var3, var1, 4);
            this.Method8191(var3 + 1, var1 + 1, 64);
         }

         if (var2 == 2) {
            this.Method8191(var3, var1, 16);
            this.Method8191(var3 + 1, var1 - 1, 1);
         }

         if (var2 == 3) {
            this.Method8191(var3, var1, 64);
            this.Method8191(var3 - 1, var1 - 1, 4);
         }
      }

      if (var4 == 2) {
         if (var2 == 0) {
            this.Method8191(var3, var1, 130);
            this.Method8191(var3 - 1, var1, 8);
            this.Method8191(var3, var1 + 1, 32);
         }

         if (var2 == 1) {
            this.Method8191(var3, var1, 10);
            this.Method8191(var3, var1 + 1, 32);
            this.Method8191(var3 + 1, var1, 128);
         }

         if (var2 == 2) {
            this.Method8191(var3, var1, 40);
            this.Method8191(var3 + 1, var1, 128);
            this.Method8191(var3, var1 - 1, 2);
         }

         if (var2 == 3) {
            this.Method8191(var3, var1, 160);
            this.Method8191(var3, var1 - 1, 2);
            this.Method8191(var3 - 1, var1, 8);
         }
      }

      if (var5) {
         if (var4 == 0) {
            if (var2 == 0) {
               this.Method8191(var3, var1, 65536);
               this.Method8191(var3 - 1, var1, 4096);
            }

            if (var2 == 1) {
               this.Method8191(var3, var1, 1024);
               this.Method8191(var3, var1 + 1, 16384);
            }

            if (var2 == 2) {
               this.Method8191(var3, var1, 4096);
               this.Method8191(var3 + 1, var1, 65536);
            }

            if (var2 == 3) {
               this.Method8191(var3, var1, 16384);
               this.Method8191(var3, var1 - 1, 1024);
            }
         }

         if (var4 == 1 || var4 == 3) {
            if (var2 == 0) {
               this.Method8191(var3, var1, 512);
               this.Method8191(var3 - 1, var1 + 1, 8192);
            }

            if (var2 == 1) {
               this.Method8191(var3, var1, 2048);
               this.Method8191(var3 + 1, var1 + 1, 32768);
            }

            if (var2 == 2) {
               this.Method8191(var3, var1, 8192);
               this.Method8191(var3 + 1, var1 - 1, 512);
            }

            if (var2 == 3) {
               this.Method8191(var3, var1, 32768);
               this.Method8191(var3 - 1, var1 - 1, 2048);
            }
         }

         if (var4 == 2) {
            if (var2 == 0) {
               this.Method8191(var3, var1, 66560);
               this.Method8191(var3 - 1, var1, 4096);
               this.Method8191(var3, var1 + 1, 16384);
            }

            if (var2 == 1) {
               this.Method8191(var3, var1, 5120);
               this.Method8191(var3, var1 + 1, 16384);
               this.Method8191(var3 + 1, var1, 65536);
            }

            if (var2 == 2) {
               this.Method8191(var3, var1, 20480);
               this.Method8191(var3 + 1, var1, 65536);
               this.Method8191(var3, var1 - 1, 1024);
            }

            if (var2 == 3) {
               this.Method8191(var3, var1, 81920);
               this.Method8191(var3, var1 - 1, 1024);
               this.Method8191(var3 - 1, var1, 4096);
            }
         }
      }

   }

   public final void Method8189(boolean var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 256;
      if (var1) {
         var7 = 131328;
      }

      int var8;
      if (var6 == 1 || var6 == 3) {
         var8 = var2;
         var2 = var3;
         var3 = var8;
      }

      for(var8 = var4; var8 < var4 + var2; ++var8) {
         if (var8 >= 0 && var8 < this.Field12866) {
            for(var6 = var5; var6 < var5 + var3; ++var6) {
               if (var6 >= 0 && var6 < this.Field12867) {
                  this.Method8191(var8, var6, var7);
               }
            }
         }
      }

   }

   public final void Method8190(int var1, int var2) {
      int var3 = Client.Field12490 + var2;
      int var4 = Client.Field12491 + var1;
      if (var3 == 2875 && var4 >= 5269 && var4 <= 5272) {
         this.Field12868[var2][var1] = 0;
      } else if (var3 == 2949 && var4 == 3681) {
         this.Field12868[var2][var1] = 0;
      } else if ((var3 < 3329 || var4 < 3203 || var3 > 3330 || var4 > 3261) && (var3 < 3360 || var4 < 3203 || var3 > 3361 || var4 > 3261) && (var3 < 3391 || var4 < 3203 || var3 > 3392 || var4 > 3261) && (var3 < 3329 || var4 < 3203 || var3 > 3392 || var4 > 3204) && (var3 < 3329 || var4 < 3222 || var3 > 3392 || var4 > 3223) && (var3 < 3329 || var4 < 3241 || var3 > 3392 || var4 > 3242) && (var3 < 3329 || var4 < 3260 || var3 > 3392 || var4 > 3261) && (var3 < 1624 || var4 < 5601 || var3 > 1629 || var4 > 5608)) {
         this.Field12868[var2][var1] |= 2097152;
      } else {
         this.Field12868[var2][var1] = 0;
      }
   }

   private void Method8191(int var1, int var2, int var3) {
      int var4 = Client.Field12490 + var1;
      int var5 = Client.Field12491 + var2;
      if (var4 == 2875 && var5 >= 5269 && var5 <= 5272) {
         this.Field12868[var1][var2] = 0;
      } else if (var1 >= 0 && var2 >= 0) {
         this.Field12868[var1][var2] |= var3;
      }
   }

   public final void Method8192(int var1, int var2, boolean var3, int var4, int var5) {
      if (var2 == 0) {
         if (var1 == 0) {
            this.Method8194(128, var4, var5);
            this.Method8194(8, var4 - 1, var5);
         }

         if (var1 == 1) {
            this.Method8194(2, var4, var5);
            this.Method8194(32, var4, var5 + 1);
         }

         if (var1 == 2) {
            this.Method8194(8, var4, var5);
            this.Method8194(128, var4 + 1, var5);
         }

         if (var1 == 3) {
            this.Method8194(32, var4, var5);
            this.Method8194(2, var4, var5 - 1);
         }
      }

      if (var2 == 1 || var2 == 3) {
         if (var1 == 0) {
            this.Method8194(1, var4, var5);
            this.Method8194(16, var4 - 1, var5 + 1);
         }

         if (var1 == 1) {
            this.Method8194(4, var4, var5);
            this.Method8194(64, var4 + 1, var5 + 1);
         }

         if (var1 == 2) {
            this.Method8194(16, var4, var5);
            this.Method8194(1, var4 + 1, var5 - 1);
         }

         if (var1 == 3) {
            this.Method8194(64, var4, var5);
            this.Method8194(4, var4 - 1, var5 - 1);
         }
      }

      if (var2 == 2) {
         if (var1 == 0) {
            this.Method8194(130, var4, var5);
            this.Method8194(8, var4 - 1, var5);
            this.Method8194(32, var4, var5 + 1);
         }

         if (var1 == 1) {
            this.Method8194(10, var4, var5);
            this.Method8194(32, var4, var5 + 1);
            this.Method8194(128, var4 + 1, var5);
         }

         if (var1 == 2) {
            this.Method8194(40, var4, var5);
            this.Method8194(128, var4 + 1, var5);
            this.Method8194(2, var4, var5 - 1);
         }

         if (var1 == 3) {
            this.Method8194(160, var4, var5);
            this.Method8194(2, var4, var5 - 1);
            this.Method8194(8, var4 - 1, var5);
         }
      }

      if (var3) {
         if (var2 == 0) {
            if (var1 == 0) {
               this.Method8194(65536, var4, var5);
               this.Method8194(4096, var4 - 1, var5);
            }

            if (var1 == 1) {
               this.Method8194(1024, var4, var5);
               this.Method8194(16384, var4, var5 + 1);
            }

            if (var1 == 2) {
               this.Method8194(4096, var4, var5);
               this.Method8194(65536, var4 + 1, var5);
            }

            if (var1 == 3) {
               this.Method8194(16384, var4, var5);
               this.Method8194(1024, var4, var5 - 1);
            }
         }

         if (var2 == 1 || var2 == 3) {
            if (var1 == 0) {
               this.Method8194(512, var4, var5);
               this.Method8194(8192, var4 - 1, var5 + 1);
            }

            if (var1 == 1) {
               this.Method8194(2048, var4, var5);
               this.Method8194(32768, var4 + 1, var5 + 1);
            }

            if (var1 == 2) {
               this.Method8194(8192, var4, var5);
               this.Method8194(512, var4 + 1, var5 - 1);
            }

            if (var1 == 3) {
               this.Method8194(32768, var4, var5);
               this.Method8194(2048, var4 - 1, var5 - 1);
            }
         }

         if (var2 == 2) {
            if (var1 == 0) {
               this.Method8194(66560, var4, var5);
               this.Method8194(4096, var4 - 1, var5);
               this.Method8194(16384, var4, var5 + 1);
            }

            if (var1 == 1) {
               this.Method8194(5120, var4, var5);
               this.Method8194(16384, var4, var5 + 1);
               this.Method8194(65536, var4 + 1, var5);
            }

            if (var1 == 2) {
               this.Method8194(20480, var4, var5);
               this.Method8194(65536, var4 + 1, var5);
               this.Method8194(1024, var4, var5 - 1);
            }

            if (var1 == 3) {
               this.Method8194(81920, var4, var5);
               this.Method8194(1024, var4, var5 - 1);
               this.Method8194(4096, var4 - 1, var5);
            }
         }
      }

   }

   public final void Method8193(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 = 131328;
      }

      if (var1 == 1 || var1 == 3) {
         var1 = var2;
         var2 = var5;
         var5 = var1;
      }

      for(var1 = var3; var1 < var3 + var2; ++var1) {
         if (var1 >= 0 && var1 < this.Field12866) {
            for(int var8 = var4; var8 < var4 + var5; ++var8) {
               if (var8 >= 0 && var8 < this.Field12867) {
                  this.Method8194(var7, var1, var8);
               }
            }
         }
      }

   }

   private void Method8194(int var1, int var2, int var3) {
      this.Field12868[var2][var3] &= 16777215 - var1;
   }
}
