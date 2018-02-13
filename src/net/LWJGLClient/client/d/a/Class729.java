package net.LWJGLClient.client.d.a;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.b.a.b.ModelLoader;
import net.LWJGLClient.client.b.b.f.Class838;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.b.b.f.c.Class598;
import net.LWJGLClient.client.d.Class569;
import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.a.a.Class504;

public final class Class729 {
   private boolean Field10783 = false;
   private Client Field10784 = null;
   private boolean Field10785 = false;
   private int Field10786 = 0;
   private int Field10787 = 0;
   private byte[][] Field10788;
   private byte[][] Field10789;
   private boolean Field10790;
   private int[] Field10791;
   private int Field10792;
   private int Field10793;
   private int[][][] Field10794;
   private int Field10795;
   private boolean Field10796;
   private byte[][][] Field10797;
   private int[][][] Field10798;
   private boolean Field10799 = false;
   private Class504[] Field10800 = null;
   private SceneGraph Field10801 = null;
   private Class569 Field10802 = null;
   private boolean Field10803 = false;

   private void Method12344() {
      this.Field10788 = null;
      this.Field10789 = null;
      this.Field10791 = null;
      this.Field10794 = null;
      this.Field10797 = null;
      this.Field10798 = null;
   }

   public Class729(Client var1) {
      this.Field10784 = var1;
   }

   public final void Method12345(Client var1) {
      if (GraphicsDisplay.Field2678) {
         boolean var10000 = GraphicsDisplay.Field2667;
      }

      Client.Field12218 = this.Field10802;
      Client.Field12428.Field924.Method8951();
      Client.Field12428 = this.Field10801;
      var1.Field12655 = this.Field10800;
      var1.intGroundArray = this.Field10798;
      var1.tileSettingBits = this.Field10797;
      this.Method12344();
   }

   public final void Method12346() {
      this.Field10803 = true;
      this.Method12344();
   }

   public final boolean Method12347() {
      return this.Field10785 && this.Field10802.Method8824();
   }

   public final boolean Method12348() {
      if (this.Field10803) {
         return false;
      } else {
         try {
            if (!this.Field10785) {
               if (this.Method12350()) {
                  long var1 = System.currentTimeMillis();

                  for(int var3 = 0; !this.Field10802.Method8825() && var3 < 2; ++var3) {
                     this.Field10802.Method8830(this.Field10784, this.Field10801, this.Field10800, true);
                     Thread.sleep(30L);
                     if (System.currentTimeMillis() - var1 > 400L) {
                        break;
                     }
                  }

                  this.Field10785 = true;
               }

               return true;
            }

            if (this.Field10802 == null) {
               return true;
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            Client.Field12237 = true;
         }

         return true;
      }
   }

   public final void Method12349(boolean var1, boolean var2, boolean var3, byte[][] var4, byte[][] var5, boolean var6, int[] var7, int var8, int var9, int var10, int var11, int[][][] var12, int var13, boolean var14, boolean var15, boolean var16) {
      this.Field10788 = var4;
      this.Field10789 = var5;
      this.Field10790 = var6;
      this.Field10791 = var7;
      this.Field10792 = var8;
      this.Field10793 = var9;
      this.Field10786 = var10;
      this.Field10787 = var11;
      this.Field10794 = var12;
      this.Field10795 = var13;
      this.Field10796 = var14;
      this.Field10799 = var16;
      this.Field10798 = new int[4][SceneGraph.mapSizeWidth + 1][SceneGraph.mapSizeWidth + 1];
      this.Field10797 = new byte[4][SceneGraph.mapSizeWidth][SceneGraph.mapSizeWidth];
   }

   private boolean Method12350() {
      if (this.Field10788 == null) {
         return false;
      } else {
         this.Field10801 = new SceneGraph(this.Field10798);
         this.Field10800 = new Class504[4];

         int var1;
         for(var1 = 0; var1 < 4; ++var1) {
            this.Field10800[var1] = new Class504(var1);
         }

         this.Field10784.Method13293();

         try {
            this.Field10801.Method8853();
            this.Field10802 = new Class569(this.Field10797, this.Field10798);
            Class569.Field457 = this.Field10795;
            boolean var10000 = Client.Field12075;
            var1 = this.Field10788.length;
            int var2;
            int var3;
            int var4;
            int var12;
            if (!this.Field10790) {
               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (this.Field10791[var2] >> 8 << 6) - this.Field10792;
                  var4 = ((this.Field10791[var2] & 255) << 6) - this.Field10793;
                  byte[] var5;
                  if ((var5 = this.Field10788[var2]) != null) {
                     this.Field10802.Method8835(var5, var4, var3, this.Field10786 - 6 << 3, this.Field10787 - 6 << 3, this.Field10800);
                  }
               }

               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (this.Field10791[var2] >> 8 << 6) - this.Field10792;
                  var4 = ((this.Field10791[var2] & 255) << 6) - this.Field10793;
                  if (this.Field10788[var2] == null && this.Field10787 < 800) {
                     this.Field10802.Method8819(var4, 64, 64, var3);
                  }
               }

               for(var2 = 0; var2 < var1; ++var2) {
                  byte[] var11;
                  if (this.Field10789 != null && (var11 = this.Field10789[var2]) != null) {
                     var4 = (this.Field10791[var2] >> 8 << 6) - this.Field10792;
                     var12 = ((this.Field10791[var2] & 255) << 6) - this.Field10793;
                     this.Field10802.Method8843(var4, this.Field10800, var12, this.Field10801, var11, Model.Field2798);
                  }
               }
            }

            int var6;
            if (this.Field10790) {
               int var7;
               int var8;
               int var9;
               for(var2 = 0; var2 < 4; ++var2) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        if ((var12 = this.Field10794[var2][var3][var4]) != -1) {
                           var1 = var12 >> 24 & 3;
                           var6 = var12 >> 1 & 3;
                           var7 = var12 >> 14 & 1023;
                           var12 = var12 >> 3 & 2047;
                           var8 = (var7 / 8 << 8) + var12 / 8;

                           for(var9 = 0; var9 < this.Field10791.length; ++var9) {
                              if (this.Field10791[var9] == var8 && this.Field10788[var9] != null) {
                                 this.Field10802.Method8834(var1, var6, this.Field10800, var3 << 3, (var7 & 7) << 3, this.Field10788[var9], (var12 & 7) << 3, var2, var4 << 3);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               for(var2 = 0; var2 < 4; ++var2) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        if ((var12 = this.Field10794[var2][var3][var4]) != -1) {
                           var1 = var12 >> 24 & 3;
                           var6 = var12 >> 1 & 3;
                           var7 = var12 >> 14 & 1023;
                           var12 = var12 >> 3 & 2047;
                           var8 = (var7 / 8 << 8) + var12 / 8;

                           for(var9 = 0; var9 < this.Field10791.length; ++var9) {
                              if (this.Field10791[var9] == var8 && this.Field10789[var9] != null) {
                                 this.Field10802.Method8838(this.Field10800, this.Field10801, var1, var3 << 3, (var12 & 7) << 3, var2, this.Field10789[var9], (var7 & 7) << 3, var6, var4 << 3, this.Field10799, Model.Field2798);
                              }
                           }
                        }
                     }
                  }
               }
            }

            for(var2 = 0; var2 < 4; ++var2) {
               for(var3 = 1; var3 < SceneGraph.mapSizeWidth - 1; ++var3) {
                  for(var4 = 1; var4 < SceneGraph.mapSizeWidth - 1; ++var4) {
                     this.Field10801.Method8857(var2, var4, var3, this.Field10802.Method8837(var3, var2, var4));
                  }
               }
            }

            this.Field10802.Method8817(this.Field10800, this.Field10801);
            int var14 = Class569.Field466;
            if (this.Field10796) {
               this.Field10801.Method8854(Class569.Field466);
            } else {
               this.Field10801.Method8854(0);
            }

            if (GraphicsDisplay.Field2678) {
               for(var3 = 0; var3 < SceneGraph.mapSizeWidth; ++var3) {
                  for(var4 = 0; var4 < SceneGraph.mapSizeWidth; ++var4) {
                     if ((this.Field10802.Field470[1][var3][var4] & 2) == 2) {
                        this.Field10801.Method8855(var4, var3);
                     }
                  }
               }
            }

            if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
               Class838.Field6956.Method7373();
               Class838.Field6955.Method12366(); //TODO
               var10000 = Class843.Field3772;
               Class598 var15 = Class843.Field3769;
               ModelLoader var13 = Class838.Field6956;
               var4 = SceneGraph.mapSizeWidth;

               for(var1 = 0; var1 < 4; ++var1) {
                  for(var6 = 0; var6 < SceneGraph.mapSizeWidth; var6 += var4) {
                     if (SceneGraph.mapSizeWidth > 0) {
                        Class838.Method13935(var1, this.Field10801, var6, 0, var4, true, false);
                        var4 = 999;
                     }
                  }
               }

               var13.Field3156 = true;
               this.Field10801.Field924.Method8955();
            }

            return true;
         } catch (Exception var10) {
            var10.printStackTrace();
            this.Field10784.Method13209(1001);
            return false;
         }
      }
   }
}
