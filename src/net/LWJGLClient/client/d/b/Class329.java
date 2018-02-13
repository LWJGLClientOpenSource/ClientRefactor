package net.LWJGLClient.client.d.b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.d.b.a.Class328;
import net.LWJGLClient.client.d.b.a.Class330;
import net.LWJGLClient.client.model.Class862;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.b.Class663;
import net.LWJGLClient.client.a.d.RgbImage;
import net.LWJGLClient.client.d.b.a.Class332;

public final class Class329 {
   public static final Class337 Field2502 = new Class337();
   private final Client Field2503;
   private Map Field2504 = new HashMap();
   private Map Field2505 = new HashMap();
   private List Field2506 = new LinkedList();
   private List Field2507 = new LinkedList();
   private int Field2508;
   private int Field2509;
   private final boolean Field2510;
   private int Field2511 = 100;
   private int Field2512;
   private int Field2513;
   private int Field2514;
   private int Field2515;
   private long Field2516 = 0L;
   private long Field2517 = 0L;
   private int Field2518 = -1;
   private String Field2519 = null;
   private int Field2520 = 0;
   private int Field2521;
   private boolean Field2522 = true;
   private int Field2523 = -1;
   private long Field2524 = System.currentTimeMillis();

   public final void Method3382(int var1, int var2, String var3) {
      this.Field2508 = (var1 >> 3) - 6;
      this.Field2509 = (var2 >> 3) - 6;
      this.Field2508 -= 12;
      this.Field2509 -= 22;
      var1 = (1920 - Client.width) / 3;
      var2 = (1080 - Client.height) / 3;
      float var4 = (float)(this.Field2512 / 2) - this.Method3401((float)(this.Field2512 / 2));
      float var5 = (float)(this.Field2513 / 2) - this.Method3401((float)(this.Field2513 / 2));
      this.Field2514 = Math.round((float)(this.Field2508 << 5) + var4 + (float)var1);
      this.Field2515 = Math.round((float)(this.Field2509 << 5) - var5 - (float)var2);
      if (var3 != null) {
         this.Field2519 = var3.replaceAll("[/]", " ");
         this.Field2517 = System.currentTimeMillis();
         this.Field2516 = 3000L;
      }

   }

   private static long Method3383(int var0, int var1) {
      return (long)((var0 << 16) + var1);
   }

   public final void Method3384(int var1, Class332 var2) {
      Map var3 = this.Field2504;
      synchronized(this.Field2504) {
         Object var4;
         if ((var4 = (List)this.Field2505.get(var1)) == null) {
            var4 = new LinkedList();
            this.Field2505.put(var1, var4);
         }

         ((List)var4).add(var2);
      }
   }

   public final void Method3385(int var1, int var2) {
      this.Field2514 = (int)((float)this.Field2514 + this.Method3401((float)var1));
      this.Field2515 = (int)((float)this.Field2515 + this.Method3401((float)var2));
   }

   public Class329(Client var1) {
      this.Field2503 = var1;
      this.Field2510 = false;
      int var4 = Client.Field12490 + (Client.session_player.Field4194 - 6 >> 7);
      int var2 = Client.Field12491 + (Client.session_player.Field4195 - 6 >> 7);
      this.Field2508 = (var4 >> 3) - 6;
      this.Field2509 = (var2 >> 3) - 6;
      this.Field2508 -= 12;
      this.Field2509 -= 22;
      this.Field2514 = this.Field2508 << 5;
      this.Field2515 = this.Field2509 << 5;
      int var3 = Client.height;
      var2 = Client.width;
      boolean var5 = false;
      var5 = false;
      this.Field2512 = var2;
      this.Field2513 = var3;
   }

   public final int Method3386() {
      return this.Field2520;
   }

   public final int Method3387() {
      return this.Field2521;
   }

   public Class329(Client var1, boolean var2) {
      this.Field2503 = var1;
      this.Field2510 = true;
      this.Field2508 = 0;
      this.Field2509 = 0;
      this.Field2514 = this.Field2515 = 0;
      this.Field2520 = 0;

      for(int var11 = 3800; var11 <= 6000; var11 += 96) {
         for(int var3 = 0; var3 <= 14000; var3 += 96) {
            Map var4 = this.Field2504;
            synchronized(this.Field2504) {
               int var5 = (var11 >> 3) - 6;
               int var6 = (var3 >> 3) - 6;
               long var8 = Method3383(var5, var6);
               if (this.Field2504.get(var8) == null) {
                  this.Field2504.put(var8, new Class332(var1, var8, var5, var6, this));
                  ++this.Field2520;
               }
            }
         }
      }

   }

   public final void clear() {
      this.Field2522 = false;
   }

   public final boolean Method3389() {
      if (this.Field2522) {
         return false;
      } else {
         Map var1 = this.Field2504;
         synchronized(this.Field2504) {
            Iterator var3 = this.Field2504.entrySet().iterator();

            while(var3.hasNext()) {
               Entry var2 = (Entry)var3.next();
               this.Field2506.add((Class332)var2.getValue());
            }

            this.Field2504.clear();
            var3 = this.Field2506.iterator();

            while(true) {
               if (!var3.hasNext()) {
                  this.Field2506.clear();
                  if (this.Field2507.size() > 0) {
                     Class843.Method13993(this.Field2507);
                     this.Field2507.clear();
                  }
                  break;
               }

               long var4;
               Class332 var7;
               if ((var4 = (var7 = (Class332)var3.next()).Method3424()) != 0L) {
                  this.Field2507.add(var4);
               }

               this.Field2504.remove(var7.Method3431());
            }
         }

         this.Field2504.clear();
         this.Field2505.clear();
         this.Field2506.clear();
         this.Field2507.clear();
         return true;
      }
   }

   public final void Method3390(Class862 var1) {
      Map var2 = this.Field2504;
      synchronized(this.Field2504) {
         List var3;
         if ((var3 = (List)this.Field2505.get(var1.Field2736)) != null) {
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               ((Class332)var4.next()).Method3426(var1, this.Field2510);
            }

            if (this.Field2510) {
               ++this.Field2521;
            }

            this.Field2505.remove(var1.Field2736);
         }

      }
   }

   private boolean Method3391(int var1, int var2, int var3) {
      if (var1 >= -var3 && var2 >= -var3) {
         return var1 - var3 <= this.Field2512 && var2 - var3 <= this.Field2513;
      } else {
         return false;
      }
   }

   private boolean Method3392(int var1, int var2, boolean var3) {
      var1 = var1 * this.Field2511 / 100;
      var2 = var2 * this.Field2511 / 100;
      int var4 = var3 ? 0 : 1024 * this.Field2511 / 100;
      if (var1 >= -(512 * this.Field2511 / 100) - var4 && var2 >= -(512 * this.Field2511 / 100) - var4) {
         return var1 - var4 <= this.Field2512 && var2 - var4 <= this.Field2513;
      } else {
         return false;
      }
   }

   private int Method3393(int var1) {
      return (var1 <<= 5) - this.Field2514;
   }

   private int Method3394(int var1) {
      var1 = (var1 <<= 5) - this.Field2515;
      return 1080 - var1;
   }

   private int Method3395(int var1) {
      return (var1 << 2) - this.Field2514 + 235;
   }

   private int Method3396(int var1) {
      return this.Field2515 - (var1 << 2) + 1342;
   }

   public final void Method3397() {
      if (this.Field2523 >= 0) {
         Class330 var1;
         int var2 = (var1 = (Class330)Field2502.Method3462().get(this.Field2523)).Method3413();
         int var3 = var1.Method3414();
         if (var2 > 0 && var3 > 0) {
            this.Method3382(var2, var3, (String)null);
            if (var1.Method3406() != null) {
               this.Method3402(Field2502.Method3462().indexOf(var1.Method3406()));
            }
         }

         this.Field2523 = -1;
      }

   }

   public final void Method3398(int var1, int var2, int var3) {
      Class330 var4 = this.Field2523 >= 0 ? (Class330)Field2502.Method3462().get(this.Field2523) : null;
      var1 = Math.round((float)(this.Field2514 / 4) + this.Method3401((float)(var1 / 4)) - 62.0F);
      var2 = Math.round((float)(this.Field2515 / 4) - this.Method3401((float)(var2 / 4)) + 336.0F);
      if (var4 != null) {
         this.Field2503.Field12575 = 1;
         if (var4.Method3413() > 0) {
            this.Field2503.Method13315("Investigate", 517, var1, var2, var3 == 1);
            return;
         }
      } else if (Client.myPrivilege >= 2 && var3 == 2) {
         this.Field2503.Field12575 = 1;
         this.Field2503.Method13315("Teleport to @lre@" + var1 + "@whi@/@lre@" + var2, 515, var1, var2, var3 == 1);
      }

   }

   public final void Method3399() {
      if (!this.Field2510) {
         Class329 var1 = this;
         Map var2 = this.Field2504;
         int var6;
         int var7;
         synchronized(this.Field2504) {
            Iterator var4 = var1.Field2504.entrySet().iterator();

            while(var4.hasNext()) {
               Entry var3;
               Class332 var5 = (Class332)(var3 = (Entry)var4.next()).getValue();
               var6 = var1.Method3393(var5.Method3422()) * var1.Field2511 / 100;
               var7 = var1.Method3394(var5.Method3423()) * var1.Field2511 / 100;
               if (var5.Method3431() != (Long)var3.getKey()) {
                  System.out.println(" no no no");
               }

               if (var1.Method3392(var6, var7, false)) {
                  var5.Method3428(var6, var7, var1.Field2511);
               } else {
                  var1.Field2506.add(var5);
               }
            }

            Class332 var13;
            for(var4 = var1.Field2506.iterator(); var4.hasNext(); var1.Field2504.remove(var13.Method3431())) {
               long var19;
               if ((var19 = (var13 = (Class332)var4.next()).Method3424()) != 0L) {
                  var1.Field2507.add(var19);
               }
            }

            var1.Field2506.clear();
            if (var1.Field2507.size() > 0) {
               Class843.Method13993(var1.Field2507);
               var1.Field2507.clear();
            }
         }

         this.Field2503.Field12604.Method13683();
         int var12 = Math.round(this.Method3400((float)this.Method3395(Client.Field12490 + (Client.session_player.Field4194 - 6 >> 7))));
         int var15 = Math.round(this.Method3400((float)this.Method3396(Client.Field12491 + (Client.session_player.Field4195 - 6 >> 7))));
         int var9;
         int var18;
         int var21;
         if (this.Method3391(var12, var15, -300)) {
            if (Client.currentTime % 30 < 15) {
               this.Field2503.Field12555[0].Method14495(var12, var15);
            }
         } else {
            int var10000 = Client.width;
            var10000 = Client.height;
            int var8 = Client.width - 300;
            var7 = Client.height - 195;
            var9 = var12;
            int var10 = var15;
            if (var12 < 32) {
               var9 = 32;
            } else if (var12 > var8) {
               var9 = var8;
            }

            if (var15 < 32) {
               var10 = 32;
            } else if (var15 > var7) {
               var10 = var7;
            }

            var18 = var12 - var9;
            var21 = var15 - var10;
            var12 = var9;
            var15 = var10;
            if (Client.currentTime % 30 < 15) {
               float var23 = (float)Math.toDegrees(Math.atan2((double)var18, (double)var21));
               this.Field2503.Field12555[0].Method14462(var23);
               this.Field2503.Field12555[0].Method14495(var9, var10);
            }
         }

         this.Field2503.Field12287.add(new Class663(var12 + 4, var15 - 34, "You are here", false, true));
         var1 = this;
         Iterator var17 = Field2502.Method3461().iterator();

         while(true) {
            Class328 var14;
            do {
               do {
                  if (!var17.hasNext()) {
                     var1 = this;
                     boolean var16 = false;
                     var15 = 0;

                     Class330 var20;
                     for(Iterator var24 = Field2502.Method3462().iterator(); var24.hasNext(); ++var15) {
                        var20 = (Class330)var24.next();
                        var6 = Math.round(var1.Method3400((float)var1.Method3395(var20.Method3408())));
                        var7 = Math.round(var1.Method3400((float)var1.Method3396(var20.Method3409())));
                        RgbImage var27;
                        (var27 = var1.Field2503.Field12489[var20.Method3410()]).Method14495(var6, var7);
                        if (!var16 && var27.Method14519(var1.Field2503.o_37, var1.Field2503.p_34)) {
                           var27.Method886(var6, var7, 16776960, 1, true);
                           var1.Field2523 = var15;
                           var16 = true;
                           if (var20.Method3411() != null) {
                              var1.Field2503.Field12286.add(new Class663(var6, var7 + 20, var20.Method3411(), false));
                           }
                        }

                        var27.Method14458();
                     }

                     if (var1.Field2518 >= 0) {
                        var20 = (Class330)Field2502.Method3462().get(var1.Field2518);
                        var21 = Math.round(var1.Method3400((float)var1.Method3395(var20.Method3408())));
                        var6 = Math.round(var1.Method3400((float)var1.Method3396(var20.Method3409())));
                        RgbImage var28;
                        (var28 = var1.Field2503.Field12489[var20.Method3410()]).Method886(var21, var6, 16711680, 2, true);
                        var28.Method14458();
                     }

                     if (System.currentTimeMillis() - var1.Field2517 > var1.Field2516) {
                        var1.Field2518 = -1;
                        var1.Field2519 = null;
                     }

                     if (!var16 && var1.Field2503.Field12575 <= 1) {
                        var1.Field2523 = -1;
                     }

                     var12 = Client.width / 2;
                     String var22 = "Emps-World Map\nUse the arrow keys or drag the middle mouse button to navigate.\nZoom with the mouse wheel or page up/down buttons.\n";
                     this.Field2503.Field12287.add(new Class663(var12, 4, var22, true, true));
                     if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                        GraphicsDisplay.Method997().Method1025();
                     }

                     return;
                  }
               } while((var14 = (Class328)var17.next()).Method3381() == 2);

               var18 = Math.round(var1.Method3400((float)var1.Method3395(var14.Method3379())));
               var21 = Math.round(var1.Method3400((float)var1.Method3396(var14.Method3380())));
            } while(!var1.Method3391(var18, var21, 0));

            String var25 = var14.Method3377();
            var6 = var1.Field2519 != null && var25.toLowerCase().equalsIgnoreCase(var1.Field2519) ? 16719904 : 16777215;
            String[] var29;
            var9 = (var29 = var14.Method3378().split("/")).length;

            for(var7 = 0; var7 < var9; ++var7) {
               String var26 = var29[var7];
               Client.boldFont.Method9446(var26, var18, var6, var21);
               var21 += 14;
            }
         }
      }
   }

   private float Method3400(float var1) {
      return var1 * (float)this.Field2511 / 100.0F;
   }

   private float Method3401(float var1) {
      return var1 * 100.0F / (float)this.Field2511;
   }

   public final void Method3402(int var1) {
      this.Field2518 = var1;
      this.Field2517 = System.currentTimeMillis();
      this.Field2516 = 3000L;
   }

   public final void Method3403(int var1) {
      if (System.currentTimeMillis() - this.Field2524 >= 50L) {
         this.Field2524 = System.currentTimeMillis();
         if (var1 != 0) {
            var1 = var1 > 0 ? -8 : 8;
            int var2 = this.Field2511;
            float var3 = this.Method3400((float)this.Method3395(3200));
            float var4 = this.Method3400((float)this.Method3396(3200));
            this.Field2511 += var1;
            var1 = !Client.Method13320() && !Client.Field12080 ? 70 : 30;
            if (this.Field2511 < var1) {
               this.Field2511 = var1;
            } else if (this.Field2511 > 180) {
               this.Field2511 = 180;
            }

            float var6 = this.Method3400((float)this.Method3395(3200));
            float var5 = this.Method3400((float)this.Method3396(3200));
            var6 -= var3;
            var3 = var5 - var4;
            if (var2 - this.Field2511 != 0) {
               this.Field2514 = (int)((float)this.Field2514 - var6 * 0.125F);
               this.Field2515 = (int)((float)this.Field2515 - var3 * 0.125F * 0.25F);
            }

         }
      }
   }

   public final void Method3404() {
      if (!this.Field2510) {
         int var1 = this.Field2514 / 32 + 36;
         int var2 = this.Field2515 / 32 + 36;
         int var3 = (1 + Client.width / 104) * 100 / this.Field2511;

         int var4;
         for(int var5 = (var4 = (1 + Client.height / 104) * 100 / this.Field2511) - 1; var5 >= -var4; --var5) {
            for(int var6 = -var3 - 1; var6 <= var3; ++var6) {
               int var7 = var1 + var6 * 12;
               int var8 = var2 + var5 * 12;
               if (this.Method3392(this.Method3393(var7), this.Method3394(var8), true)) {
                  var7 = (var7 /= 12) * 12;
                  var8 = (var8 /= 12) * 12;
                  Map var9 = this.Field2504;
                  synchronized(this.Field2504) {
                     long var10 = Method3383(var7, var8);
                     if (this.Field2504.get(var10) == null) {
                        this.Field2504.put(var10, new Class332(this.Field2503, var10, var7, var8, this));
                     }
                  }
               }
            }
         }

      }
   }
}
