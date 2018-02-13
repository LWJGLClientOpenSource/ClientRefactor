package net.LWJGLClient.client.d.b;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import net.LWJGLClient.client.a.c.NPCDefinition;
import net.LWJGLClient.client.a.c.ObjectDefinition;
import net.LWJGLClient.client.a.d.IndexedImage;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.d.b.a.Class330;
import net.LWJGLClient.client.e.Class23;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.d.Player;
import net.LWJGLClient.client.a.d.RgbImage;
import net.LWJGLClient.client.b.a.Class697;
import net.LWJGLClient.client.model.d.Npc;

public final class Class331 {
   private final Client Field2347;
   public int Field2348 = 0;
   public int Field2349 = 0;

   public Class331(Client var1) {
      this.Field2347 = var1;
   }

   public final void Method3415() {
      if (!Client.Field12120) {
         if (!Client.Field12712) {
            this.Field2347.Field12292 = 3;
            this.Field2347.Field12291 = -1;
         } else {
            this.Field2347.Field12292 = this.Field2347.Field12291 = 0;
         }

         int var1 = (Client.Field12712 ? 549 + Client.Field12714 : 0) + this.Field2347.Field12291;
         boolean var10001 = Client.Field12712;
         int var2 = this.Field2347.Field12292;
         boolean var10000 = Client.Field12712;
         var10000 = Client.Field12712;
         if (!Client.Field12712) {
            this.Field2347.Field12603.Method13683();
            if (GraphicsDisplay.Field2678) {
               var1 -= 2;
            }
         }

         int var3 = Client.Field12624 + this.Field2347.Field12637 & 2047;
         int var4 = 48 + Client.session_player.Field4194 / 32 + (!Client.Field12247 ? this.Field2348 << 2 : 0);
         int var5 = 464 - Client.session_player.Field4195 / 32 - (!Client.Field12247 ? this.Field2349 << 2 : 0);
         if (Client.Field12247) {
            this.Field2348 = this.Field2349 = 0;
            Client.Field12247 = false;
         } else {
            this.Field2347.Field12274 = true;
         }

         int var33 = Client.Field12497;
         byte var6 = 0;
         byte var7 = 0;
         if (!Client.Field12712 && GraphicsDisplay.Field2678) {
            var6 = -1;
            var7 = -3;
         }

         int var10004 = this.Field2347.Field12610;
         this.Field2347.Field12681.Method897(155, var3, this.Field2347.Field12654, 256, this.Field2347.Field12507, var5, 12 + (GraphicsDisplay.Field2678 ? var7 : var2), 34 + (GraphicsDisplay.Field2678 ? var6 : var1), 157, var4, this.Field2347);
         int var11;
         int var12;
         List var19;
         Iterator var21;
         if ((var19 = Class329.Field2502.Method3463(Client.Field12490, Client.Field12491)).size() <= 0) {
            for(var3 = 0; var3 < this.Field2347.Field12529; ++var3) {
               var4 = (this.Field2347.Field12530[var3] << 2) + 2 - Client.session_player.Field4194 / 32;
               var11 = (this.Field2347.Field12531[var3] << 2) + 2 - Client.session_player.Field4195 / 32;
               this.Method3417(this.Field2347.Field12581[var3], var4, var11);
            }
         } else {
            var21 = var19.iterator();

            while(var21.hasNext()) {
               Class330 var20;
               var11 = ((var20 = (Class330)var21.next()).Method3408() - Client.Field12490 + Client.Field12494 << 2) + 2 - Client.session_player.Field4194 / 32;
               var12 = (var20.Method3409() - Client.Field12491 + Client.Field12495 << 2) + 2 - Client.session_player.Field4195 / 32;
               this.Method3417(this.Field2347.Field12489[var20.Method3410()], var11, var12);
            }
         }

         var21 = this.Field2347.Field12222.entrySet().iterator();

         long var15;
         while(var21.hasNext()) {
            long var28;
            var15 = ((var28 = (Long)((Entry)var21.next()).getKey()) >> 16 & 65535L) - (long) Client.Field12491;
            long var17 = (var28 >> 32 & 65535L) - (long) Client.Field12490;
            this.Method3417(this.Field2347.Field12532, (int)((var17 << 2) + 2L - (long)(Client.session_player.Field4194 / 32)), (int)((var15 << 2) + 2L - (long)(Client.session_player.Field4195 / 32)));
         }

         for(var3 = 0; var3 < Client.Field12328; ++var3) {
            Npc var22;
            if ((var22 = this.Field2347.Field12327[this.Field2347.Field12329[var3]]) != null && var22.isVisible()) {
               NPCDefinition var29 = var22.Field4103;
               if (var22.Field4103.Field10755 != null) {
                  var29 = var29.Method11888();
               }

               if (var29 != null && var29.Field10754 && var29.Field10751) {
                  var12 = var22.Field4194 / 32 - Client.session_player.Field4194 / 32;
                  var5 = var22.Field4195 / 32 - Client.session_player.Field4195 / 32;
                  this.Method3417(this.Field2347.Field12533, var12, var5);
               }
            }
         }

         for(var3 = 0; var3 < Client.session_player_count; ++var3) {
            Player var23;
            if ((var23 = this.Field2347.session_players[this.Field2347.session_player_list[var3]]) != null && var23.visible) {
               var11 = var23.Field4194 / 32 - Client.session_player.Field4194 / 32;
               var12 = var23.Field4195 / 32 - Client.session_player.Field4195 / 32;
               boolean var24 = false;
               boolean var27 = false;

               for(int var30 = 0; var30 < this.Field2347.Field12305.length; ++var30) {
                  if (this.Field2347.Field12305[var30] != null && this.Field2347.Field12305[var30].equalsIgnoreCase(var23.name)) {
                     var27 = true;
                     break;
                  }
               }

               var15 = Class23.nameToLong(var23.name);

               for(int var31 = 0; var31 < this.Field2347.Field12370; ++var31) {
                  if (var15 == this.Field2347.Field12437[var31] && this.Field2347.Field12323[var31] != 0) {
                     var24 = true;
                     break;
                  }
               }

               boolean var32 = false;
               if (Client.session_player.team > 0 && var23.team > 0 && Client.session_player.team == var23.team) {
                  var32 = true;
               }

               if (var24) {
                  this.Method3417(this.Field2347.Field12536, var11, var12);
               } else if (var27) {
                  this.Method3417(this.Field2347.Field12307, var11, var12);
               } else if (var32) {
                  this.Method3417(this.Field2347.Field12537, var11, var12);
               } else {
                  this.Method3417(this.Field2347.Field12535, var11, var12);
               }
            }
         }

         if (this.Field2347.Field12339 != 0 && Client.currentTime % 20 < 10) {
            Npc var25;
            if (this.Field2347.Field12339 == 1 && this.Field2347.Field12648 >= 0 && this.Field2347.Field12648 < this.Field2347.Field12327.length && (var25 = this.Field2347.Field12327[this.Field2347.Field12648]) != null) {
               var4 = var25.Field4194 / 32 - Client.session_player.Field4194 / 32;
               var11 = var25.Field4195 / 32 - Client.session_player.Field4195 / 32;
               this.Method3416(this.Field2347.Field12350, var11, var4);
            }

            if (this.Field2347.Field12339 == 2) {
               var3 = (this.Field2347.Field12389 - Client.Field12490 - Client.Field12494 << 2) + 2 - Client.session_player.Field4194 / 32;
               var4 = (this.Field2347.Field12390 - Client.Field12491 - Client.Field12495 << 2) + 2 - Client.session_player.Field4195 / 32;
               this.Method3416(this.Field2347.Field12350, var4, var3);
            }

            Player var26;
            if (this.Field2347.Field12339 == 10 && this.Field2347.Field12388 >= 0 && this.Field2347.Field12388 < this.Field2347.session_players.length && (var26 = this.Field2347.session_players[this.Field2347.Field12388]) != null) {
               var4 = var26.Field4194 / 32 - Client.session_player.Field4194 / 32;
               var11 = var26.Field4195 / 32 - Client.session_player.Field4195 / 32;
               this.Method3416(this.Field2347.Field12350, var11, var4);
            }
         }

         if (Client.Field12679 != 0) {
            var3 = (Client.Field12679 << 2) + 2 - Client.session_player.Field4194 / 32;
            var4 = (Client.Field12680 << 2) + 2 - Client.session_player.Field4195 / 32;
            this.Method3417(this.Field2347.Field12349, var3, var4);
         }

         if (GraphicsDisplay.Field2678) {
            if (Client.Field12712) {
               GraphicsDisplay.Method997().Method1010(var1 + 97 + 14, var2 + 78 + 8, 3, 3, 16777215, this.Field2347);
            } else {
               GraphicsDisplay.Method997().Method1010(var1 + 97 + 14 + 522, var2 + 78 + 8, 3, 3, 16777215, this.Field2347);
            }
         } else {
            Class697.Method8269(3, var2 + 78 + 8, var1 + 97 + 14, 16777215, 3);
         }

         if (Client.Field12712) {
            var33 = 30 + (GraphicsDisplay.Field2678 ? 0 : var1);
         } else {
            var10000 = GraphicsDisplay.Field2678;
            var33 = 11;
         }

         var3 = var33;
         var4 = Client.Field12712 ? 12 + (GraphicsDisplay.Field2678 ? 0 : var2) : (GraphicsDisplay.Field2678 ? 8 : 14);
         this.Field2347.Field12565.Method897(33, Client.Field12624, this.Field2347.Field12515, 256, this.Field2347.Field12443, 25, var4, var3, 33, 25, this.Field2347);
         if (Client.Field12712) {
            this.Field2347.Field12316[0].Method14495(var1 + 25, var2 + 7);
         } else {
            if (GraphicsDisplay.Field2678) {
               if (this.Field2347.Field12605 != null) {
                  this.Field2347.Field12605.Method13683();
               }

               this.Field2347.Field12316[1].Method14495(520, 0);
            } else {
               this.Field2347.Field12316[1].Method14495(0, 6);
            }

            this.Field2347.Method13240();
         }

         if (!Client.Field12713) {
            Client.Field12713 = true;
         }

         this.Field2347.Field12604.Method13683();
      }
   }

   private void Method3416(RgbImage var1, int var2, int var3) {
      boolean var4 = false;
      if (var2 > 50) {
         var4 = true;
         var2 = 50;
      } else if (var2 < -50) {
         var4 = true;
         var2 = -50;
      }

      if (var3 > 50) {
         var4 = true;
         var3 = 50;
      } else if (var3 < -50) {
         var4 = true;
         var3 = -50;
      }

      this.Method3418(var1, var3, var2, true, var4);
   }

   private void Method3417(RgbImage var1, int var2, int var3) {
      this.Method3418(var1, var2, var3, false, false);
   }

   private void Method3418(RgbImage var1, int var2, int var3, boolean var4, boolean var5) {
      if (var1 != null) {
         int var6 = Client.Field12712 ? 549 + Client.Field12714 : 0;
         int var7 = this.Field2347.Field12292;
         int var8 = 14;
         if (Client.Field12712) {
            var8 = 14;
         }

         int var9 = Client.Field12624 + this.Field2347.Field12637 & 2047;
         if (var2 * var2 + var3 * var3 <= 5800) {
            int var10 = Rasterizer.Field9959[var9];
            var9 = Rasterizer.Field9960[var9];
            int var10000 = var10 << 8;
            int var10001 = this.Field2347.Field12610;
            var10 = var10000 / 256;
            var10000 = var9 << 8;
            var10001 = this.Field2347.Field12610;
            var9 = var10000 / 256;
            int var11 = var3 * var10 + var2 * var9 >> 16;
            var2 = var3 * var9 - var2 * var10 >> 16;
            if (GraphicsDisplay.Field2678 && !Client.Field12712) {
               if (this.Field2347.Field12605 != null) {
                  this.Field2347.Field12605.Method13683();
               }

               var8 += 520;
            }

            var3 = var11 + 94 - var1.Field9898 / 2 + 4 + var6 + var8;
            var2 = 83 - var2 - var1.Field9899 / 2 - 4 + var7 + 8;
            if (var4 && var5) {
               int var12 = var6 + 94 - var3;
               int var14 = var7 + 83 - var2;
               float var13 = (float)Math.toDegrees(Math.atan2((double)var12, (double)var14));
               var1.Method14462(var13 + 180.0F);
               var2 += 5;
               var3 += 2;
            }

            var1.Method14495(var3, var2);
         }
      }
   }

   private void Method3419(int var1, int[] var2, int var3) {
      for(var3 = 0; var3 < SceneGraph.mapSizeWidth; ++var3) {
         int var4 = 24624 + (SceneGraph.mapSizeWidth - 1 - var3 << 9 << 2);

         for(int var5 = 0; var5 < SceneGraph.mapSizeWidth; ++var5) {
            if ((this.Field2347.tileSettingBits[var1][var5][var3] & 24) == 0) {
               Client.Field12428.Method8882(var2, var4, var1, var5, var3, 512);
            }

            if (var1 < 3) {
               byte[][][] var10000 = this.Field2347.tileSettingBits;
            }

            var4 += 4;
         }
      }

   }

   public final void Method3420(int var1, boolean var2) {
      Client.Field12247 = true;

      try {
         int[] var3 = new int[this.Field2347.Field12681.Field9893.length];

         int var4;
         for(var4 = 0; var4 < 4; ++var4) {
            if (var4 != var1) {
               this.Method3419(var4, var3, 512);
               if (var2) {
                  Thread.sleep(20L);
               }
            }
         }

         this.Method3419(var1, var3, 512);
         if (var2) {
            Thread.sleep(20L);
         }

         int var5;
         for(var4 = 0; var4 < SceneGraph.mapSizeWidth; ++var4) {
            for(var5 = 0; var5 < SceneGraph.mapSizeWidth; ++var5) {
               if ((this.Field2347.tileSettingBits[var1][var5][var4] & 24) == 0) {
                  this.Method3421(Client.Field12428, var3, var4, 15658734, var5, var1, 512, true);
               }

               if (var1 < 3 && (this.Field2347.tileSettingBits[var1 + 1][var5][var4] & 8) != 0) {
                  this.Method3421(Client.Field12428, var3, var4, 15658734, var5, var1 + 1, 512, true);
               }
            }
         }

         if (var2) {
            Thread.sleep(20L);
         }

         this.Field2347.Field12529 = 0;

         for(var4 = 0; var4 < SceneGraph.mapSizeWidth; ++var4) {
            for(var5 = 0; var5 < SceneGraph.mapSizeWidth; ++var5) {
               ObjectDefinition var7;
               if ((var1 = Client.Field12428.Method8849(Client.Field12379, var4, var5)) != 0 && (var7 = ObjectDefinition.Method11938(var1)) != null && (var1 = var7.Field10558) >= 0) {
                  this.Field2347.Field12581[this.Field2347.Field12529] = this.Field2347.Field12489[var1];
                  this.Field2347.Field12530[this.Field2347.Field12529] = var4;
                  this.Field2347.Field12531[this.Field2347.Field12529] = var5;
                  ++this.Field2347.Field12529;
               }
            }
         }

         this.Field2347.Field12681.Field9893 = var3;
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public final void Method3421(SceneGraph var1, int[] var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      if (!Client.Field12120 && Client.Field12483 != 1) {
         if ((var4 = var1.Method8875(var6, var5, var3)) != 85) {
            int var13;
            if (var4 != 0) {
               if (var6 != Client.Field12379 && var8) {
                  return;
               }

               var13 = (var7 = var1.Method8879(var6, var5, var3, var4)) >> 6 & 3;
               var7 &= 31;
               int var9 = 24624 + (var5 << 2) + (SceneGraph.mapSizeWidth - 1 - var3 << 9 << 2);
               if (ObjectDefinition.Method11938(var1.Method8848(var6, var5, var3)).Field10567 == -1) {
                  if (var7 == 0 || var7 == 2) {
                     if (var13 == 0) {
                        var2[var9] = 15658734;
                        var2[var9 + 512] = 15658734;
                        var2[var9 + 1024] = 15658734;
                        var2[var9 + 1536] = 15658734;
                     } else if (~var13 == -2) {
                        var2[var9] = 15658734;
                        var2[var9 + 1] = 15658734;
                        var2[var9 + 2] = 15658734;
                        var2[var9 + 3] = 15658734;
                     } else if (var13 == 2) {
                        var2[var9 - -3] = 15658734;
                        var2[3 + var9 + 512] = 15658734;
                        var2[3 + var9 + 1024] = 15658734;
                        var2[1536 + (var9 - -3)] = 15658734;
                     } else if (var13 == 3) {
                        var2[var9 + 1536] = 15658734;
                        var2[var9 + 1536 + 1] = 15658734;
                        var2[var9 + 2 + 1536] = 15658734;
                        var2[var9 + 1536 + 3] = 15658734;
                     }
                  }

                  if (var7 == 3) {
                     if (var13 == 0) {
                        var2[var9] = 15658734;
                     } else if (var13 == 1) {
                        var2[var9 + 3] = 15658734;
                     } else if (var13 == 2) {
                        var2[var9 + 3 + 1536] = 15658734;
                     } else if (var13 == 3) {
                        var2[var9 + 1536] = 15658734;
                     }
                  }

                  if (var7 == 2) {
                     if (var13 == 3) {
                        var2[var9] = 15658734;
                        var2[var9 + 512] = 15658734;
                        var2[var9 + 1024] = 15658734;
                        var2[var9 + 1536] = 15658734;
                     } else if (var13 == 0) {
                        var2[var9] = 15658734;
                        var2[var9 + 1] = 15658734;
                        var2[var9 + 2] = 15658734;
                        var2[var9 + 3] = 15658734;
                     } else if (var13 == 1) {
                        var2[var9 + 3] = 15658734;
                        var2[var9 + 3 + 512] = 15658734;
                        var2[var9 + 3 + 1024] = 15658734;
                        var2[var9 + 3 + 1536] = 15658734;
                     } else if (var13 == 2) {
                        var2[var9 + 1536] = 15658734;
                        var2[var9 + 1536 + 1] = 15658734;
                        var2[var9 + 1536 + 2] = 15658734;
                        var2[var9 + 1536 + 3] = 15658734;
                     }
                  }
               }
            }

            boolean var10000;
            if ((var4 = var1.Method8876(var6, var5, var3)) != 0) {
               var13 = (var7 = var1.Method8879(var6, var5, var3, var4)) >> 6 & 3;
               var7 &= 31;
               int var11;
               ObjectDefinition var12;
               if ((var12 = ObjectDefinition.Method11938(var4)).Field10567 != -1 && var12.Field10567 < this.Field2347.Field12517.length) {
                  var10000 = GraphicsDisplay.Field2678;
                  IndexedImage var15;
                  if ((var15 = this.Field2347.Field12517[var12.Field10567]) != null) {
                     int var10 = ((var12.Field10556 << 2) - var15.Field9652) / 2;
                     var11 = ((var12.Field10570 << 2) - var15.Field9653) / 2;
                     var15.Method901(48 + (var5 << 2) + var10, 48 + (SceneGraph.mapSizeWidth - var3 - var12.Field10570 << 2) + var11, true, var2);
                  }
               } else if (var7 == 9) {
                  var11 = 24624 + (var5 << 2) + (SceneGraph.mapSizeWidth - 1 - var3 << 9 << 2);
                  if (var13 != 0 && var13 != 2) {
                     var2[var11] = 15658734;
                     var2[var11 + 512 + 1] = 15658734;
                     var2[var11 + 1024 + 2] = 15658734;
                     var2[var11 + 1536 + 3] = 15658734;
                  } else {
                     var2[var11 + 1536] = 15658734;
                     var2[var11 + 1024 + 1] = 15658734;
                     var2[var11 + 512 + 2] = 15658734;
                     var2[var11 + 3] = 15658734;
                  }
               }
            }

            ObjectDefinition var14;
            if (var1.Method8877(var6, var5, var3) != 0 && (var7 = (var14 = ObjectDefinition.Method11938(var1.Method8849(var6, var5, var3))).Field10567) != -1 && var7 < this.Field2347.Field12517.length) {
               var10000 = GraphicsDisplay.Field2678;
               if (this.Field2347.Field12517[var7] != null) {
                  int var16 = var14.Field10556;
                  var16 = var14.Field10570;
               }
            }

         }
      }
   }
}
