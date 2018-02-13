package net.LWJGLClient.client.b;

import java.util.Random;
import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.b.a.Class697;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Client;

public final class RSFont extends Class697 {
   private static int Field9971 = 1;
   public int Field9972 = 0;
   private float Field9973 = 1.0F;
   private byte[][] Field9974;
   private int[] Field9975;
   private int[] Field9976;
   private int[] Field9977;
   private int[] Field9978;
   public int[] Field9979;
   public int Field9980;
   private Random Field9981;
   private boolean Field9982;

   public RSFont(boolean var1, String var2, JagexArchive var3) {
      this.Field9972 = Field9971++;
      this.Field9974 = new byte[256][];
      this.Field9975 = new int[256];
      this.Field9976 = new int[256];
      this.Field9977 = new int[256];
      this.Field9978 = new int[256];
      this.Field9979 = new int[256];
      this.Field9981 = new Random();
      this.Field9982 = false;
      Packet var9 = new Packet(var3.readConfig(var2 + ".dat"));
      Packet var10;
      (var10 = new Packet(var3.readConfig("index.dat"))).pos = var9.g2() + 4;
      int var4;
      if ((var4 = var10.g1()) > 0) {
         var10.pos += 3 * (var4 - 1);
      }

      for(var4 = 0; var4 < 256; ++var4) {
         this.Field9977[var4] = var10.g1();
         this.Field9978[var4] = var10.g1();
         int var5 = this.Field9975[var4] = var10.g2();
         int var6 = this.Field9976[var4] = var10.g2();
         int var7 = var10.g1();
         int var8 = var5 * var6;
         this.Field9974[var4] = new byte[var8];
         if (var7 == 0) {
            for(var7 = 0; var7 < var8; ++var7) {
               this.Field9974[var4][var7] = var9.Method400();
            }
         } else if (var7 == 1) {
            for(var7 = 0; var7 < var5; ++var7) {
               for(var8 = 0; var8 < var6; ++var8) {
                  this.Field9974[var4][var7 + var8 * var5] = var9.Method400();
               }
            }
         }

         if (var6 > this.Field9980 && var4 < 128) {
            this.Field9980 = var6;
         }

         this.Field9977[var4] = 1;
         this.Field9979[var4] = var5 + 2;
         var7 = 0;

         for(var8 = var6 / 7; var8 < var6; ++var8) {
            var7 += this.Field9974[var4][var8 * var5];
         }

         if (var7 <= var6 / 7) {
            --this.Field9979[var4];
            this.Field9977[var4] = 0;
         }

         var7 = 0;

         for(var8 = var6 / 7; var8 < var6; ++var8) {
            var7 += this.Field9974[var4][var5 - 1 + var8 * var5];
         }

         if (var7 <= var6 / 7) {
            --this.Field9979[var4];
         }
      }

      if (var1) {
         this.Field9979[32] = this.Field9979[73];
      } else {
         this.Field9979[32] = this.Field9979[105];
      }
   }

   public final void Method9444(String var1, int var2, int var3, int var4) {
      var2 -= this.Method9452(var1);
      this.Method9453(0, var1, var4, var2);
      --var2;
      --var4;
      this.Method9453(var3, var1, var4, var2);
   }

   public final void Method9445(String var1, int var2, int var3, int var4) {
      this.Method9453(0, var1, var4, var2);
      --var2;
      --var4;
      this.Method9453(var3, var1, var4, var2);
   }

   public final void Method9446(String var1, int var2, int var3, int var4) {
      this.Method9453(0, var1, var4, var2 - this.Method9452(var1) / 2);
      --var2;
      --var4;
      this.Method9453(var3, var1, var4, var2 - this.Method9452(var1) / 2);
   }

   public final void Method9447(int var1, String var2, int var3, int var4) {
      this.Method9453(var1, var2, var3, var4 - this.Method9452(var2) / 2);
   }

   public final void Method9448(int var1, String var2, int var3, int var4) {
      this.Method9453(var1, var2, var3, var4);
   }

   public final void Method9449(int var1, int var2, String var3, int var4, boolean var5) {
      this.addButton(var5, var2 - this.Method9451(var3) / 2, var1, var3, var4);
   }

   public final void Method9450(int var1, int var2, String var3, int var4, boolean var5) {
      this.addButton(false, var2, 255, var3, var4);
   }

   public final int Method9451(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (var1.charAt(var3) == '@' && var3 + 4 < var1.length() && var1.charAt(var3 + 4) == '@') {
               var3 += 4;
            } else {
               var2 += this.Field9979[var1.charAt(var3)];
            }
         }

         return var2;
      }
   }

   public final int Method9452(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (var1.charAt(var3) < this.Field9979.length) {
               var2 += this.Field9979[var1.charAt(var3)];
            }
         }

         return var2;
      }
   }

   public final void Method9453(int var1, String var2, int var3, int var4) {
      if (var2 != null) {
         var3 -= this.Field9980;

         for(int var5 = 0; var5 < var2.length(); ++var5) {
            char var6;
            if ((var6 = var2.charAt(var5)) != ' ' && var6 >= 0 && var6 < 256) {
               this.Method9460(this.Field9974[var6], var4 + this.Field9977[var6], var3 + this.Field9978[var6], this.Field9975[var6], this.Field9976[var6], var1, var6);
            }

            if (var6 >= 0 && var6 < 256) {
               var4 += this.Field9979[var6];
            }
         }

      }
   }

   public final void Method9454(int var1, String var2, int var3, int var4, int var5) {
      if (var2 != null) {
         var3 -= this.Method9452(var2) / 2;
         var5 -= this.Field9980;

         for(int var6 = 0; var6 < var2.length(); ++var6) {
            char var7;
            if ((var7 = var2.charAt(var6)) != ' ' && var7 >= 0 && var7 < 256) {
               this.Method9460(this.Field9974[var7], var3 + this.Field9977[var7], var5 + this.Field9978[var7] + (int)(Math.sin((double)var6 / 2.0D + (double)var4 / 5.0D) * 5.0D), this.Field9975[var7], this.Field9976[var7], var1, var7);
            }

            if (var7 >= 0 && var7 < 256) {
               var3 += this.Field9979[var7];
            }
         }

      }
   }

   public final void Method9455(int var1, String var2, int var3, int var4, int var5) {
      if (var2 != null) {
         var1 -= this.Method9452(var2) / 2;
         var4 -= this.Field9980;

         for(int var6 = 0; var6 < var2.length(); ++var6) {
            char var7;
            if ((var7 = var2.charAt(var6)) != ' ' && var7 >= 0 && var7 < 256) {
               this.Method9460(this.Field9974[var7], var1 + this.Field9977[var7] + (int)(Math.sin((double)var6 / 5.0D + (double)var3 / 5.0D) * 5.0D), var4 + this.Field9978[var7] + (int)(Math.sin((double)var6 / 3.0D + (double)var3 / 5.0D) * 5.0D), this.Field9975[var7], this.Field9976[var7], var5, var7);
            }

            if (var7 >= 0 && var7 < 256) {
               var1 += this.Field9979[var7];
            }
         }

      }
   }

   public final void Method9456(int var1, String var2, int var3, int var4, int var5, int var6) {
      if (var2 != null) {
         double var7;
         if ((var7 = 7.0D - (double)var1 / 8.0D) < 0.0D) {
            var7 = 0.0D;
         }

         var5 -= this.Method9452(var2) / 2;
         var4 -= this.Field9980;

         for(var1 = 0; var1 < var2.length(); ++var1) {
            char var9;
            if ((var9 = var2.charAt(var1)) != ' ' && var9 >= 0 && var9 < 256) {
               this.Method9460(this.Field9974[var9], var5 + this.Field9977[var9], var4 + this.Field9978[var9] + (int)(Math.sin((double)var1 / 1.5D + (double)var3) * var7), this.Field9975[var9], this.Field9976[var9], var6, var9);
            }

            if (var9 >= 0 && var9 < 256) {
               var5 += this.Field9979[var9];
            }
         }

      }
   }

   public final void addButton(boolean var1, int var2, int var3, String var4, int var5) {
      if (var4 != null) {
         var5 -= this.Field9980;
         int var6 = var2;

         int var7;
         for(var7 = 0; var7 < var4.length(); ++var7) {
            if (var4.charAt(var7) == '@' && var7 + 4 < var4.length() && var4.charAt(var7 + 4) == '@') {
               int var9;
               if ((var9 = this.Method9459(var4.substring(var7 + 1, var7 + 4))) != -1) {
                  var3 = var9;
               }

               var7 += 4;
            } else {
               char var8;
               if ((var8 = var4.charAt(var7)) != ' ' && var8 >= 0 && var8 < 256) {
                  if (var1) {
                     this.Method9460(this.Field9974[var8], var2 + this.Field9977[var8] + 1, var5 + this.Field9978[var8] + 1, this.Field9975[var8], this.Field9976[var8], 0, var8);
                  }

                  this.Method9460(this.Field9974[var8], var2 + this.Field9977[var8], var5 + this.Field9978[var8], this.Field9975[var8], this.Field9976[var8], var3, var8);
               }

               if (var8 >= 0 && var8 < 256) {
                  var2 += this.Field9979[var8];
               }
            }
         }

         if (this.Field9982 && var5 <= Class697.Field8764 && var5 >= Class697.Field8763) {
            var7 = (int)((double)this.Field9980 * 0.7D);
            if (GraphicsDisplay.Field2678) {
               GraphicsDisplay.Method997().Method1010(var2, var5 + var7, var2 - var6, 1, 8388608, Client.Field12183);
            } else {
               Class697.Method11989(var5 + var7, 8388608, var2, var2 - var6);
            }
         }

         this.Field9982 = false;
      }
   }

   public final void Method9458(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null) {
         this.Field9981.setSeed((long)var4);
         var4 = 192 + (this.Field9981.nextInt() & 31);
         var5 = 15 - this.Field9980;

         for(int var6 = 0; var6 < var3.length(); ++var6) {
            if (var3.charAt(var6) == '@' && var6 + 4 < var3.length() && var3.charAt(var6 + 4) == '@') {
               int var8;
               if ((var8 = this.Method9459(var3.substring(var6 + 1, var6 + 4))) != -1) {
                  var2 = var8;
               }

               var6 += 4;
            } else {
               char var7;
               if ((var7 = var3.charAt(var6)) != ' ' && var7 >= 0 && var7 < 256) {
                  this.Method9461(192, var1 + this.Field9977[var7] + 1, this.Field9974[var7], this.Field9975[var7], var5 + this.Field9978[var7] + 1, this.Field9976[var7], 0, var7);
                  this.Method9461(var4, var1 + this.Field9977[var7], this.Field9974[var7], this.Field9975[var7], var5 + this.Field9978[var7], this.Field9976[var7], var2, var7);
               }

               if (var7 >= 0 && var7 < 256) {
                  var1 += this.Field9979[var7];
               }

               if ((this.Field9981.nextInt() & 3) == 0) {
                  ++var1;
               }
            }
         }

      }
   }

   private int Method9459(String var1) {
      if (var1.equals("369")) {
         return 3368601;
      } else if (var1.equals("mon")) {
         return 65408;
      } else if (var1.equals("red")) {
         return 16711680;
      } else if (var1.equals("lbl")) {
         return 3368635;
      } else if (var1.equals("gre")) {
         return 65280;
      } else if (var1.equals("blu")) {
         return 255;
      } else if (var1.equals("yel")) {
         return 16776960;
      } else if (var1.equals("cya")) {
         return 65535;
      } else if (var1.equals("mag")) {
         return 16711935;
      } else if (var1.equals("whi")) {
         return 16777215;
      } else if (var1.equals("bla")) {
         return 0;
      } else if (var1.equals("lre")) {
         return 16748608;
      } else if (var1.equals("dre")) {
         return 8388608;
      } else if (var1.equals("dbl")) {
         return 128;
      } else if (var1.equals("or1")) {
         return 16756736;
      } else if (var1.equals("or2")) {
         return 16740352;
      } else if (var1.equals("or3")) {
         return 16723968;
      } else if (var1.equals("or4")) {
         return 6631936;
      } else if (var1.equals("gr1")) {
         return 12648192;
      } else if (var1.equals("gr2")) {
         return 8453888;
      } else if (var1.equals("gr3")) {
         return 4259584;
      } else {
         if (var1.equals("str")) {
            this.Field9982 = true;
         }

         if (var1.equals("end")) {
            this.Field9982 = false;
         }

         return -1;
      }
   }

   private void Method9460(byte[] var1, int var2, int var3, int var4, int var5, int var6, char var7) {
      boolean var8 = true;
      int var9 = 0;
      int var10 = var2 + var3 * Class697.Field8761;
      int var11 = Class697.Field8761 - var4;
      int var12 = 0;
      int var13 = 0;
      int var14;
      if (var3 < Class697.Field8763) {
         if (GraphicsDisplay.Field2678) {
            var8 = false;
            var9 = Class697.Field8763 - var3;
         } else {
            var14 = Class697.Field8763 - var3;
            var5 -= var14;
            var3 = Class697.Field8763;
            var13 = 0 + var14 * var4;
            var10 += var14 * Class697.Field8761;
         }
      }

      if (var3 + var5 >= Class697.Field8764) {
         var8 = false;
         var5 -= var3 + var5 - Class697.Field8764 + 1;
      }

      if (var2 < Class697.Field8765) {
         if (GraphicsDisplay.Field2678) {
            return;
         }

         var14 = Class697.Field8765 - var2;
         var4 -= var14;
         var2 = Class697.Field8765;
         var13 += var14;
         var10 += var14;
         var12 = var14 + 0;
         var11 += var14;
      }

      if (var2 + var4 >= Class697.Field8766) {
         if (GraphicsDisplay.Field2678) {
            return;
         }

         var14 = var2 + var4 - Class697.Field8766 + 1;
         var4 -= var14;
         var12 += var14;
         var11 += var14;
      }

      if (var4 > 0 && var5 > 0) {
         int var15;
         int var16;
         int var17;
         byte[] var20;
         if (GraphicsDisplay.Field2678) {
            byte[] var21 = var1;
            if (!var8 && var9 != 0) {
               var11 = var4;
               var20 = var1;
               int var19 = var9;
               byte[] var10000;
               if ((var13 = var5 - var9) < 0) {
                  var10000 = null;
               } else {
                  var21 = new byte[var4 * var13];
                  var15 = 0;

                  while(true) {
                     if (var15 >= var11) {
                        var10000 = var21;
                        break;
                     }

                     for(var16 = 0; var16 < var13; ++var16) {
                        var12 = var15 + var16 * var11;
                        var17 = var15 + (var16 + var19) * var11;
                        var21[var12] = var20[var17];
                     }

                     ++var15;
                  }
               }

               var21 = var10000;
            }

            var4 = (int)((float)var4 * this.Field9973);
            var5 = (int)((float)var5 * this.Field9973);
            if (var21 != null) {
               GraphicsDisplay.Method997().Method1019(var21, var2, var3 + var9, var4, var5 - var9, var6, var7, this, var8);
            }

            this.Field9973 = 1.0F;
            return;
         }

         var16 = var12;
         var15 = var11;
         var2 = var10;
         var12 = var13;
         var11 = var6;
         var20 = var1;
         int[] var18 = Class697.Field8760;
         var17 = -(var4 >> 2);
         var13 = -(var4 & 3);

         for(var3 = -var5; var3 < 0; ++var3) {
            for(var4 = var17; var4 < 0; ++var4) {
               if (var20[var12++] != 0) {
                  var18[var2++] = var11;
               } else {
                  ++var2;
               }

               if (var20[var12++] != 0) {
                  var18[var2++] = var11;
               } else {
                  ++var2;
               }

               if (var20[var12++] != 0) {
                  var18[var2++] = var11;
               } else {
                  ++var2;
               }

               if (var20[var12++] != 0) {
                  var18[var2++] = var11;
               } else {
                  ++var2;
               }
            }

            for(var4 = var13; var4 < 0; ++var4) {
               if (var20[var12++] != 0) {
                  var18[var2++] = var11;
               } else {
                  ++var2;
               }
            }

            var2 += var15;
            var12 += var16;
         }
      }

   }

   private void Method9461(int var1, int var2, byte[] var3, int var4, int var5, int var6, int var7, char var8) {
      int var9 = var2 + var5 * Class697.Field8761;
      int var10 = Class697.Field8761 - var4;
      int var11 = 0;
      int var12 = 0;
      int var13;
      if (var5 < Class697.Field8763) {
         if (GraphicsDisplay.Field2678) {
            return;
         }

         var13 = Class697.Field8763 - var5;
         var6 -= var13;
         var5 = Class697.Field8763;
         var12 = 0 + var13 * var4;
         var9 += var13 * Class697.Field8761;
      }

      if (var5 + var6 >= Class697.Field8764) {
         if (GraphicsDisplay.Field2678) {
            return;
         }

         var6 -= var5 + var6 - Class697.Field8764 + 1;
      }

      if (var2 < Class697.Field8765) {
         if (GraphicsDisplay.Field2678) {
            return;
         }

         var13 = Class697.Field8765 - var2;
         var4 -= var13;
         var2 = Class697.Field8765;
         var12 += var13;
         var9 += var13;
         var11 = var13 + 0;
         var10 += var13;
      }

      if (var2 + var4 >= Class697.Field8766) {
         if (GraphicsDisplay.Field2678) {
            return;
         }

         var13 = var2 + var4 - Class697.Field8766 + 1;
         var4 -= var13;
         var11 += var13;
         var10 += var13;
      }

      if (var4 > 0 && var6 > 0) {
         if (GraphicsDisplay.Field2678) {
            GraphicsDisplay var19 = GraphicsDisplay.Method997();
            int var10003 = var5;
            var5 = var4;
            var4 = var10003;
            var19.Method1019(var3, var2, var4, var5, var6, var7, var8, this, true);
         } else {
            int var10001 = var6;
            int var10002 = var9;
            var9 = var7;
            int var18 = var10;
            var7 = var11;
            var6 = var4;
            var5 = var12;
            int[] var17 = Class697.Field8760;
            int var15 = var10002;
            var2 = var10001;
            byte[] var14 = var3;
            var9 = ((var9 & 16711935) * var1 & -16711936) + ((var9 & '\uff00') * var1 & 16711680) >> 8;
            var10 = 256 - var1;

            for(var2 = -var2; var2 < 0; ++var2) {
               for(var11 = -var6; var11 < 0; ++var11) {
                  if (var14[var5++] != 0) {
                     var12 = var17[var15];
                     var17[var15++] = (((var12 & 16711935) * var10 & -16711936) + ((var12 & '\uff00') * var10 & 16711680) >> 8) + var9;
                  } else {
                     ++var15;
                  }
               }

               var15 += var18;
               var5 += var7;
            }

         }
      }
   }
}
