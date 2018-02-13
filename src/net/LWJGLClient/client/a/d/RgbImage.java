package net.LWJGLClient.client.a.d;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.a.c.ItemDef;
import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.b.a.Class697;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.c.b.Class280;
import net.LWJGLClient.client.model.Client;

public final class RgbImage extends Class697 {
   public long Field9878 = 0L;
   public long Field9879 = 0L;
   public int Field9880;
   private long Field9881 = System.currentTimeMillis();
   private boolean Field9882;
   private float Field9883;
   private float Field9884;
   private String Field9885;
   private float Field9886;
   private float Field9887;
   private boolean Field9888;
   private int Field9889;
   private int Field9890;
   private int Field9891;
   private boolean Field9892;
   public int[] Field9893;
   public int Field9894;
   public int Field9895;
   private int Field9896;
   private int Field9897;
   public int Field9898;
   public int Field9899;

   static {
      boolean var10000 = GraphicsDisplay.Field2678;
   }

   public RgbImage(int var1, int var2) {
      this.Field9882 = !Client.Field12593;
      this.Field9883 = 255.0F;
      this.Field9884 = 0.0F;
      (new StringBuilder(String.valueOf(Signlink.cacheDirectory()))).append("Sprites/");
      this.Field9885 = null;
      this.Field9886 = 1.0F;
      this.Field9887 = 1.0F;
      this.Field9888 = false;
      this.Field9889 = 0;
      this.Field9890 = 0;
      this.Field9891 = 0;
      this.Field9892 = false;
      this.Field9893 = new int[var1 * var2];
      this.Field9894 = this.Field9898 = var1;
      this.Field9895 = this.Field9899 = var2;
      this.Field9896 = this.Field9897 = 0;
   }

   public final void Method14444() {
      this.Field9883 = 0.0F;
      this.Field9882 = true;
      this.Field9881 = System.currentTimeMillis();
   }

   public final void Method868(RgbImage var1) {
      if (this.Field9883 < 255.0F) {
         this.Field9883 = var1.Field9883;
      }

   }

   public final void Method14462(float var1) {
      this.Field9884 = var1;
   }

   public final float Method870() {
      return this.Field9884;
   }

   public final void Method14493(int var1, int var2, int var3) {
      if (this.Field9893 != null) {
         for(var1 = 0; var1 < this.Field9893.length; ++var1) {
            if ((this.Field9893[var1] >> 16 & 255) == 255 && (this.Field9893[var1] >> 8 & 255) == var2 && (this.Field9893[var1] & 255) == 255) {
               this.Field9893[var1] = 0;
            }
         }

      }
   }

   private void Method872(String var1, int var2, int var3, float var4, float var5) {
      this.Field9888 = true;
      this.Field9885 = var1;
      this.Field9886 = var4;
      this.Field9887 = var5;
   }

   public final void Method14494(int var1, int var2) {
      if (GraphicsDisplay.Field2678) {
         this.Field9888 = true;
         this.Field9889 = var1;
         this.Field9878 = Client.Method13218("item-" + var1 + "-" + var2);
      }
   }

   public final void Method9426() {
      if (this.Field9888 && this.Field9893 == null) {
         this.Method9428();
      }

      this.Field9888 = false;
   }

   public final void Method14450() {
      if (this.Field9893 != null && this.Field9888) {
         if (this.Field9888) {
            this.Field9893 = null;
         }

      }
   }

   public final void Method9428() {
      if (this.Field9888 && this.Field9893 == null) {
         if (this.Field9889 > 0) {
            RgbImage var1;
            if ((var1 = ItemDef.Method11915(this.Field9889, 48, false)) != null) {
               this.Field9894 = 48;
               this.Field9895 = 48;
               this.Field9893 = var1.Field9893;
               return;
            }
         } else {
            try {
               Object var5 = ImageIO.read(new ByteArrayInputStream(Class280.Method2988().Method2989().Method9348(this.Field9885 + ".png")));
               ImageIcon var2;
               if (this.Field9886 != 1.0F || this.Field9887 != 1.0F) {
                  float var3 = (float)(var2 = new ImageIcon((Image)var5)).getIconWidth();
                  float var6 = (float)var2.getIconHeight();
                  var5 = Method877((Image)var5, (int)(var3 * this.Field9886), (int)(var6 * this.Field9887));
               }

               var2 = new ImageIcon((Image)var5);
               this.Field9894 = var2.getIconWidth();
               this.Field9895 = var2.getIconHeight();
               this.Field9898 = this.Field9894;
               this.Field9899 = this.Field9895;
               this.Field9896 = 0;
               this.Field9897 = 0;
               this.Field9893 = new int[this.Field9894 * this.Field9895];
               (new PixelGrabber((Image)var5, 0, 0, this.Field9894, this.Field9895, this.Field9893, 0, this.Field9894)).grabPixels();
               this.Method14471();
               return;
            } catch (Exception var4) {
               var4.printStackTrace();
            }
         }
      }

   }

   private static Image Method877(Image var0, int var1, int var2) {
      return var1 > 0 && var2 > 0 ? var0.getScaledInstance(var1, var2, 2) : var0;
   }

   private void Method14471() {
      for(int var1 = 0; var1 < this.Field9893.length; ++var1) {
         if (this.Field9893[var1] == -65281) {
            this.Field9893[var1] = -1;
         }
      }

   }

   public RgbImage(String var1, float var2, float var3) {
      this.Field9882 = !Client.Field12593;
      this.Field9883 = 255.0F;
      this.Field9884 = 0.0F;
      (new StringBuilder(String.valueOf(Signlink.cacheDirectory()))).append("Sprites/");
      this.Field9885 = null;
      this.Field9886 = 1.0F;
      this.Field9887 = 1.0F;
      this.Field9888 = false;
      this.Field9889 = 0;
      this.Field9890 = 0;
      this.Field9891 = 0;
      this.Field9892 = false;
      var1 = var1.replaceAll(" ", "_");
      this.Field9878 = Client.Method13218(var1 + "-" + var2 + "-" + var3);

      try {
         Object var4 = ImageIO.read(new ByteArrayInputStream(Class280.Method2988().Method2989().Method9348(var1 + ".png")));
         ImageIcon var5;
         if (var2 != 1.0F || var3 != 1.0F) {
            float var6 = (float)(var5 = new ImageIcon((Image)var4)).getIconWidth();
            float var8 = (float)var5.getIconHeight();
            var4 = Method877((Image)var4, (int)(var6 * var2), (int)(var8 * var3));
         }

         var5 = new ImageIcon((Image)var4);
         this.Field9894 = var5.getIconWidth();
         this.Field9895 = var5.getIconHeight();
         this.Field9898 = this.Field9894;
         this.Field9899 = this.Field9895;
         this.Field9896 = 0;
         this.Field9897 = 0;
         this.Field9893 = new int[this.Field9894 * this.Field9895];
         (new PixelGrabber((Image)var4, 0, 0, this.Field9894, this.Field9895, this.Field9893, 0, this.Field9894)).grabPixels();
         this.Method14471();
         this.Method872(var1, s_35, t_31, var2, var3);
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   public RgbImage(String var1, float var2) {
      this.Field9882 = !Client.Field12593;
      this.Field9883 = 255.0F;
      this.Field9884 = 0.0F;
      (new StringBuilder(String.valueOf(Signlink.cacheDirectory()))).append("Sprites/");
      this.Field9885 = null;
      this.Field9886 = 1.0F;
      this.Field9887 = 1.0F;
      this.Field9888 = false;
      this.Field9889 = 0;
      this.Field9890 = 0;
      this.Field9891 = 0;
      this.Field9892 = false;
      var1 = var1.replaceAll(" ", "_");
      this.Field9878 = Client.Method13218(var1 + "-" + var2);

      try {
         Object var3 = ImageIO.read(new ByteArrayInputStream(Class280.Method2988().Method2989().Method9348(var1 + ".png")));
         ImageIcon var4;
         if (var2 != 1.0F) {
            float var5 = (float)(var4 = new ImageIcon((Image)var3)).getIconWidth();
            float var7 = (float)var4.getIconHeight();
            var3 = Method877((Image)var3, (int)(var5 * var2), (int)(var7 * var2));
         }

         var4 = new ImageIcon((Image)var3);
         this.Field9894 = var4.getIconWidth();
         this.Field9895 = var4.getIconHeight();
         this.Field9898 = this.Field9894;
         this.Field9899 = this.Field9895;
         this.Field9896 = 0;
         this.Field9897 = 0;
         this.Field9893 = new int[this.Field9894 * this.Field9895];
         (new PixelGrabber((Image)var3, 0, 0, this.Field9894, this.Field9895, this.Field9893, 0, this.Field9894)).grabPixels();
         this.Method14471();
         this.Method872(var1, s_35, t_31, var2, var2);
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public RgbImage(String var1, float var2, byte var3) {
      this.Field9882 = !Client.Field12593;
      this.Field9883 = 255.0F;
      this.Field9884 = 0.0F;
      (new StringBuilder(String.valueOf(Signlink.cacheDirectory()))).append("Sprites/");
      this.Field9885 = null;
      this.Field9886 = 1.0F;
      this.Field9887 = 1.0F;
      this.Field9888 = false;
      this.Field9889 = 0;
      this.Field9890 = 0;
      this.Field9891 = 0;
      this.Field9892 = false;
      var1 = var1.replaceAll(" ", "_");
      this.Field9878 = Client.Method13218(var1 + "-" + var2);

      try {
         String var7;
         if (!var1.endsWith(".jpg") && !var1.endsWith(".png")) {
            var7 = var1 + ".png";
         } else {
            var7 = var1;
         }

         Object var8 = ImageIO.read(new ByteArrayInputStream(Class280.Method2988().Method2989().Method9350(var7, true)));
         ImageIcon var4;
         if (var2 != 1.0F) {
            float var5 = (float)(var4 = new ImageIcon((Image)var8)).getIconWidth();
            float var9 = (float)var4.getIconHeight();
            var8 = Method877((Image)var8, (int)(var5 * var2), (int)(var9 * var2));
         }

         var4 = new ImageIcon((Image)var8);
         this.Field9894 = var4.getIconWidth();
         this.Field9895 = var4.getIconHeight();
         this.Field9898 = this.Field9894;
         this.Field9899 = this.Field9895;
         this.Field9896 = 0;
         this.Field9897 = 0;
         this.Field9893 = new int[this.Field9894 * this.Field9895];
         (new PixelGrabber((Image)var8, 0, 0, this.Field9894, this.Field9895, this.Field9893, 0, this.Field9894)).grabPixels();
         this.Method14471();
         this.Method872(var1, this.Field9894, this.Field9895, var2, var2);
      } catch (Exception var6) {
         System.err.println("[Sprite]: error with image: " + var1);
         var6.printStackTrace();
      }
   }

   public RgbImage(String var1) {
      this.Field9882 = !Client.Field12593;
      this.Field9883 = 255.0F;
      this.Field9884 = 0.0F;
      (new StringBuilder(String.valueOf(Signlink.cacheDirectory()))).append("Sprites/");
      this.Field9885 = null;
      this.Field9886 = 1.0F;
      this.Field9887 = 1.0F;
      this.Field9888 = false;
      this.Field9889 = 0;
      this.Field9890 = 0;
      this.Field9891 = 0;
      this.Field9892 = false;
      var1 = var1.replaceAll(" ", "_");
      this.Field9878 = Client.Method13218(var1);

      try {
         BufferedImage var2;
         if ((var2 = ImageIO.read(new ByteArrayInputStream(Class280.Method2988().Method2989().Method9348(var1 + ".png")))) != null) {
            ImageIcon var3 = new ImageIcon(var2);
            this.Field9894 = var3.getIconWidth();
            this.Field9895 = var3.getIconHeight();
            this.Field9898 = this.Field9894;
            this.Field9899 = this.Field9895;
            this.Field9896 = 0;
            this.Field9897 = 0;
            this.Field9893 = new int[this.Field9894 * this.Field9895];
            (new PixelGrabber(var2, 0, 0, this.Field9894, this.Field9895, this.Field9893, 0, this.Field9894)).grabPixels();
            int var5;
            if (var1.contains("940")) {
               for(var5 = 0; var5 < this.Field9893.length; ++var5) {
                  this.Field9893[var5] = this.Field9893[var5];
                  this.Field9893[var5] |= -16777216;
               }
            } else if (var1.startsWith("hitmarks")) {
               for(var5 = 0; var5 < this.Field9893.length; ++var5) {
                  if (this.Field9893[var5] == 16777215) {
                     this.Field9893[var5] = 0;
                  }
               }
            }

            this.Method872(var1, this.Field9894, this.Field9895, 1.0F, 1.0F);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public RgbImage(JagexArchive var1, String var2, int var3) {
      this.Field9882 = !Client.Field12593;
      this.Field9883 = 255.0F;
      this.Field9884 = 0.0F;
      (new StringBuilder(String.valueOf(Signlink.cacheDirectory()))).append("Sprites/");
      this.Field9885 = null;
      this.Field9886 = 1.0F;
      this.Field9887 = 1.0F;
      this.Field9888 = false;
      this.Field9889 = 0;
      this.Field9890 = 0;
      this.Field9891 = 0;
      this.Field9892 = false;
      this.Field9878 = Client.Method13218(var2 + "_" + var3);
      Packet var4 = new Packet(var1.readConfig(var2 + ".dat"));
      Packet var7 = new Packet(var1.readConfig("index.dat"));
      if (var4.Field1259 == null) {
         System.err.println("[RSInterface]: null sprite: " + var2);
      } else {
         var7.pos = var4.g2();
         this.Field9898 = var7.g2();
         this.Field9899 = var7.g2();
         int var9;
         int[] var5 = new int[var9 = var7.g1()];

         int var6;
         for(var6 = 0; var6 < var9 - 1; ++var6) {
            var5[var6 + 1] = var7.Method403();
            if (var5[var6 + 1] == 0) {
               var5[var6 + 1] = 1;
            }
         }

         for(var6 = 0; var6 < var3; ++var6) {
            var7.pos += 2;
            var4.pos += var7.g2() * var7.g2();
            ++var7.pos;
         }

         this.Field9896 = var7.g1();
         this.Field9897 = var7.g1();
         this.Field9894 = var7.g2();
         this.Field9895 = var7.g2();
         if (this.Field9894 > 2000 || this.Field9895 > 2000) {
            this.Field9894 = this.Field9895 = 1;
         }

         var6 = var7.g1();
         int var8 = this.Field9894 * this.Field9895;
         this.Field9893 = new int[var8];
         if (var6 == 0) {
            for(var9 = 0; var9 < var8; ++var9) {
               this.Field9893[var9] = var5[var4.g1()];
            }

         } else {
            if (var6 == 1) {
               for(var9 = 0; var9 < this.Field9894; ++var9) {
                  for(var8 = 0; var8 < this.Field9895; ++var8) {
                     this.Field9893[var9 + var8 * this.Field9894] = var5[var4.g1()];
                  }
               }
            }

         }
      }
   }

   public static RgbImage Method879(RgbImage var0, int var1, int var2, int var3, int var4) {
      var0.Field9894 = 27;
      var0.Field9895 = var4;
      return var0;
   }

   public final RgbImage Method880(int var1, int var2, int var3, int var4) {
      this.Method9428();
      if (var1 + var3 > this.Field9894) {
         var1 = this.Field9894 - var3;
      } else if (var1 < 0) {
         var1 = 0;
      }

      if (var2 + var4 > this.Field9895) {
         var2 = this.Field9895 - var4;
      } else if (var2 < 0) {
         var2 = 0;
      }

      RgbImage var5 = new RgbImage(var3, var4);
      int var6 = 0;

      for(int var9 = 0; var9 < var3 + var1; ++var9) {
         if (var9 >= var1 && var9 < this.Field9894) {
            int var7 = 0;

            for(int var10 = 0; var10 < var4 + var2; ++var10) {
               if (var10 >= var2 && var10 < this.Field9895) {
                  int var8 = var6 + var7 * var3;
                  var5.Field9893[var8] = this.Field9893[var9 + var10 * this.Field9894];
                  ++var7;
               }
            }

            ++var6;
         }
      }

      this.Method14450();
      return var5;
   }

   public final RgbImage Method881(RgbImage var1, int var2, int var3, int var4, int var5) {
      if (var4 <= 0) {
         return null;
      } else {
         try {
            RgbImage var10 = new RgbImage(var4, 5);
            int[] var11 = new int[var4 * 5];

            for(var5 = 0; var5 < var4; ++var5) {
               for(int var6 = 0; var6 < 5; ++var6) {
                  if (var5 + var6 * var4 <= var11.length && var5 + var6 * var1.Field9894 <= var1.Field9893.length) {
                     var11[var5 + var6 * var4] = var1.Field9893[var5 + var6 * var1.Field9894];
                  }
               }
            }

            var10.Field9895 = 5;
            var10.Field9894 = var4;
            var10.Field9893 = var11;
            return var10;
         } catch (Exception var9) {
            var9.printStackTrace();
            return null;
         }
      }
   }

   public final void Method882(RgbImage var1) {
      for(int var2 = 0; var2 < this.Field9894; ++var2) {
         for(int var3 = 0; var3 < this.Field9895; ++var3) {
            int var4;
            if ((var4 = var1.Field9893[var2 + var3 * this.Field9894]) != 16777215 && var4 > 0) {
               this.Field9893[var2 + var3 * this.Field9894] = var4;
            }
         }
      }

   }

   public final void Method14497(int var1, int var2, int var3) {
      for(var1 = 0; var1 < this.Field9893.length; ++var1) {
         if ((var2 = this.Field9893[var1]) != 0) {
            if ((var3 = var2 >> 16 & 255) <= 0) {
               var3 = 1;
            } else if (var3 > 255) {
               var3 = 255;
            }

            int var4;
            if ((var4 = var2 >> 8 & 255) <= 0) {
               var4 = 1;
            } else if (var4 > 255) {
               var4 = 255;
            }

            if ((var2 = var2 &= 255) <= 0) {
               var2 = 1;
            } else if (var2 > 255) {
               var2 = 255;
            }

            this.Field9893[var1] = (var3 << 16) + (var4 << 8) + var2;
         }
      }

   }

   public final void Method14457() {
      int[] var1 = new int[this.Field9898 * this.Field9899];

      for(int var2 = 0; var2 < this.Field9895; ++var2) {
         System.arraycopy(this.Field9893, var2 * this.Field9894, var1, var2 + this.Field9897 * this.Field9898 + this.Field9896, this.Field9894);
      }

      this.Field9893 = var1;
      this.Field9894 = this.Field9898;
      this.Field9895 = this.Field9899;
      this.Field9896 = 0;
      this.Field9897 = 0;
   }

   public final void Method885(int var1, int var2, int var3) {
      this.Method886(var1, var2, 16777215, 1, true);
   }

   public final void Method886(int var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         this.Method886(var1 - var4, var2 - var4, var3, var4, false);
         this.Method886(var1 - var4, var2 + var4, var3, var4, false);
         this.Method886(var1 + var4, var2 - var4, var3, var4, false);
         this.Method886(var1 + var4, var2 + var4, var3, var4, false);
         this.Method9109(var1, var2, false);
      } else {
         int var11 = this.Field9894 + (var4 << 1);
         int var6 = this.Field9895 + (var4 << 1);
         int[] var7 = new int[var11 * var6];
         this.Method9428();
         this.Method9426();

         int var8;
         for(var8 = 0; var8 < this.Field9894; ++var8) {
            for(int var9 = 0; var9 < this.Field9895; ++var9) {
               int var10;
               if ((var10 = this.Field9893[var8 + var9 * this.Field9894]) < -1) {
                  var10 = -var10;
               }

               if (var10 <= 0) {
                  var7[var8 + var4 + (var9 + var4) * var11] = 0;
               } else {
                  var7[var8 + var4 + (var9 + var4) * var11] = var3;
               }
            }
         }

         var1 -= var4;
         var2 -= var4;
         var1 += this.Field9896;
         var2 += this.Field9897;
         var8 = var1 + var2 * Class697.Field8761;
         var4 = Class697.Field8761 - var11;
         if (var11 > 0 && var6 > 0) {
            if (GraphicsDisplay.Field2678) {
               GraphicsDisplay.Method997().Method1022(var7, var1, var2, var11, var6, 255, -1L);
               return;
            }

            this.Method895(Class697.Field8760, var7, 0, var8, var11, var6, var4, 0);
         }

      }
   }

   public final void Method14495(int var1, int var2) {
      this.Method9109(var1, var2, false);
   }

   public final boolean Method14519(int var1, int var2) {
      return this.Method889(var1, var2, 0);
   }

   public final boolean Method889(int var1, int var2, int var3) {
      if (this.Field9890 == 0 && this.Field9891 == 0) {
         return false;
      } else {
         return var1 >= this.Field9890 - var3 && var2 >= this.Field9891 - var3 && var1 <= this.Field9890 + this.Field9894 + var3 && var2 <= this.Field9891 + this.Field9895 + var3;
      }
   }

   public final void Method14458() {
      this.Field9890 = 0;
      this.Field9891 = 0;
   }

   public final void Method9109(int var1, int var2, boolean var3) {
      long var4 = this.Field9878;
      var1 += this.Field9896;
      var2 += this.Field9897;
      int var6 = 0;
      int var7 = var1 + var2 * Class697.Field8761;
      int var8 = 0;
      int var9 = this.Field9895;
      int var10 = this.Field9894;
      int var11 = Class697.Field8761 - var10;
      int var12 = 0;
      boolean var13 = true;
      int var14;
      if (var2 < Class697.Field8763 && !var3) {
         if (GraphicsDisplay.Field2678) {
            var4 = -1L;
            var6 = Class697.Field8763 - var2;
            var13 = false;
         } else {
            var14 = Class697.Field8763 - var2;
            var9 -= var14;
            var2 = Class697.Field8763;
            var8 = 0 + var14 * var10;
            var7 += var14 * Class697.Field8761;
         }
      }

      if (var2 + var9 > Class697.Field8764 && !var3) {
         var4 = -1L;
         var9 -= var2 + var9 - Class697.Field8764;
         var13 = false;
      }

      if (var1 < Class697.Field8765 && !var3) {
         if (GraphicsDisplay.Field2678) {
            return;
         }

         var14 = Class697.Field8765 - var1;
         var10 -= var14;
         var1 = Class697.Field8765;
         var8 += var14;
         var7 += var14;
         var12 = var14 + 0;
         var11 += var14;
      }

      if (var1 + var10 > Class697.Field8766 && !var3) {
         if (GraphicsDisplay.Field2678) {
            return;
         }

         var14 = var1 + var10 - Class697.Field8766;
         var10 -= var14;
         var12 += var14;
         var11 += var14;
      }

      if (var10 > 0 && var9 > 0 || var3) {
         this.Field9890 = var1;
         this.Field9891 = var2;
         var14 = 255;
         if (this.Field9882 && this.Field9883 < 255.0F) {
            long var17 = System.currentTimeMillis() - this.Field9881;
            var14 = (int)this.Field9883;
            this.Field9883 += (float)var17 / 100.0F;
         }

         if (GraphicsDisplay.Field2678) {
            if (!var3 && !var13) {
               int[] var15 = this.Field9893;
               if (var4 == -1L) {
                  this.Method9428();
                  var15 = this.Field9893;
                  if (var6 != 0 && this.Field9893 != null) {
                     int[] var20 = this.Field9893;
                     var7 = var6;
                     RgbImage var19 = this;
                     int[] var10000;
                     if ((var11 = this.Field9895 - var6) <= 0) {
                        var10000 = null;
                     } else {
                        int[] var21 = new int[this.Field9894 * var11];
                        int var22 = 0;

                        while(true) {
                           if (var22 >= var19.Field9894) {
                              var10000 = var21;
                              break;
                           }

                           for(int var23 = 0; var23 < var11; ++var23) {
                              int var16 = var22 + var23 * var19.Field9894;
                              int var24 = var22 + (var23 + var7) * var19.Field9894;
                              var21[var16] = var20[var24];
                           }

                           ++var22;
                        }
                     }

                     var15 = var10000;
                  }
               }

               if (var15 != null) {
                  GraphicsDisplay.Method997().Method1022(var15, var1, var2 + var6, var10, var9 - var6, var14, var4);
               }

               return;
            }

            GraphicsDisplay.Method997().Method1020(this, var1, var2, var10, var9, var14, var4);
            return;
         }

         this.Method895(Class697.Field8760, this.Field9893, var8, var7, var10, var9, var11, var12);
      }

   }

   public final void Method892(int var1, int var2, int var3) {
      var1 += this.Field9896;
      var2 += this.Field9897;
      int var4 = var1 + var2 * Class697.Field8761;
      int var5 = this.Field9895;
      int var6 = this.Field9894;
      int var7 = Class697.Field8761 - var6;
      if (var6 > 0 && var5 > 0) {
         if (GraphicsDisplay.Field2678) {
            GraphicsDisplay.Method997().Method1020(this, var1, var2, var6, var5, var3, this.Field9878);
            return;
         }

         this.Method896(0, var6, Class697.Field8760, this.Field9893, 0, var5, var7, var3, var4);
      }

   }

   public final void Method893(int var1, int var2) {
      var1 += this.Field9896;
      var2 += this.Field9897;
      int var3 = var1 + var2 * Class697.Field8761;
      int var4 = 0;
      int var5 = this.Field9895;
      int var6 = this.Field9894;
      int var7 = Class697.Field8761 - var6;
      int var8 = 0;
      int var9;
      if (var2 < Class697.Field8763) {
         var9 = Class697.Field8763 - var2;
         var5 -= var9;
         var2 = Class697.Field8763;
         var4 = 0 + var9 * var6;
         var3 += var9 * Class697.Field8761;
      }

      if (var2 + var5 > Class697.Field8764) {
         var5 -= var2 + var5 - Class697.Field8764;
      }

      if (var1 < Class697.Field8765) {
         var9 = Class697.Field8765 - var1;
         var6 -= var9;
         var1 = Class697.Field8765;
         var4 += var9;
         var3 += var9;
         var8 = var9 + 0;
         var7 += var9;
      }

      if (var1 + var6 > Class697.Field8766) {
         var9 = var1 + var6 - Class697.Field8766;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         if (GraphicsDisplay.Field2678) {
            GraphicsDisplay.Method997().Method1020(this, var1, var2, var6, var5, 225, this.Field9878);
            return;
         }

         this.Method896(var4, var6, Class697.Field8760, this.Field9893, var8, var5, var7, 225, var3);
      }

   }

   private void Method14472() {
      if (!GraphicsDisplay.Field2678 && !this.Field9892) {
         this.Field9892 = true;

         int var1;
         int var2;
         int var3;
         int var4;
         for(var1 = 0; var1 < s_35; ++var1) {
            for(var2 = 0; var2 < t_31 && (var3 = var2 * s_35 + var1) < this.Field9893.length; ++var2) {
               if ((var4 = this.Field9893[var3]) == 0 || var4 == -1 || var4 == 16777215 || var4 == -1) {
                  this.Field9893[var3] = 0;
               }
            }
         }

         for(var1 = 0; var1 < this.Field9894; ++var1) {
            for(var2 = 0; var2 < this.Field9895 && (var3 = var2 * this.Field9894 + var1) < this.Field9893.length; ++var2) {
               if ((var4 = this.Field9893[var3]) == 0 || var4 == -1 || var4 == 16777215 || var4 == -1) {
                  this.Field9893[var3] = 0;
               }
            }
         }
      }

   }

   private void Method895(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.Method14472();
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var6 = var2[var3++];
            if (var4 >= var1.length) {
               break;
            }

            if (var6 != 0 && var6 != -1) {
               var1[var4++] = var6;
            } else {
               ++var4;
            }

            if ((var6 = var2[var3++]) != 0 && var6 != -1) {
               var1[var4++] = var6;
            } else {
               ++var4;
            }

            if ((var6 = var2[var3++]) != 0 && var6 != -1) {
               var1[var4++] = var6;
            } else {
               ++var4;
            }

            if ((var6 = var2[var3++]) != 0 && var6 != -1) {
               var1[var4++] = var6;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if ((var6 = var2[var3++]) != 0 && var6 != -1) {
               var1[var4++] = var6;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   private void Method896(int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9) {
      this.Method14472();
      int var10 = 256 - var8;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var2; var12 < 0; ++var12) {
            if ((var6 = var4[var1++]) != 0) {
               if (var9 >= 0 && var9 < var3.length) {
                  int var13 = var3[var9];
                  var3[var9++] = ((var6 & 16711935) * var8 + (var13 & 16711935) * var10 & -16711936) + ((var6 & '\uff00') * var8 + (var13 & '\uff00') * var10 & 16711680) >> 8;
               }
            } else {
               ++var9;
            }
         }

         var9 += var7;
         var1 += var5;
      }

   }

   public final void Method897(int var1, int var2, int[] var3, int var4, int[] var5, int var6, int var7, int var8, int var9, int var10, Client var11) {
      this.Method9428();
      this.Method9426();
      int var12 = Class697.Field8761;
      int var13 = Client.width - 216;
      int[] var14;
      if (GraphicsDisplay.Field2678) {
         var14 = new int[32110];
         var12 = 190;
      } else {
         var14 = null;
      }

      try {
         var9 = -var9 / 2;
         int var15 = -var1 / 2;
         int var16 = (int)(Math.sin((double)var2 / 326.11D) * 65536.0D);
         var2 = (int)(Math.cos((double)var2 / 326.11D) * 65536.0D);
         var16 = var16 * var4 >> 8;
         var2 = var2 * var4 >> 8;
         var4 = (var10 << 16) + var15 * var16 + var9 * var2;
         var6 = (var6 << 16) + (var15 * var2 - var9 * var16);
         var9 = var8 + var7 * var12;

         for(var7 = 0; var7 < var1; ++var7) {
            if (var7 < var5.length) {
               var8 = var5[var7];
               var10 = var9 + var8;
               var15 = var4 + var2 * var8;
               int var17 = var6 - var16 * var8;

               for(var8 = -var3[var7]; var8 < 0; ++var8) {
                  int var18;
                  if ((var18 = (var15 >> 16) + (var17 >> 16) * this.Field9894) < this.Field9893.length && var18 >= 0) {
                     var18 = this.Field9893[var18] | -16777216;
                     if (GraphicsDisplay.Field2678) {
                        if (var18 == 0) {
                           var18 = 1;
                        }

                        var14[var10++] = var18;
                        var15 += var2;
                        var17 -= var16;
                     } else {
                        Class697.Field8760[var10++] = var18;
                        var15 += var2;
                        var17 -= var16;
                     }
                  }
               }

               var4 += var16;
               var6 += var2;
               var9 += var12;
            }
         }

         if (GraphicsDisplay.Field2678) {
            boolean var20 = false;
            if (this.Field9878 == 0L) {
               this.Field9878 = 5L;
            }

            if (!Client.Field12712) {
               var13 -= 29;
               if (this.Field9878 == 5L) {
                  var20 = true;
               }
            }

            if (this.Field9878 != 5L && var11.Field12274) {
               var20 = true;
            }

            if (Client.Field12623 == Client.Field12625 && Client.Field12624 == Client.Field12626 && !var11.Field12274) {
               GraphicsDisplay.Method997().Method1022(var14, var13, 0, 190, 169, 255, this.Field9878);
            } else {
               GraphicsDisplay.Method997().Method1022(var14, var13, 0, 190, 169, 255, -this.Field9878);
            }

            if (var20) {
               var11.Field12274 = false;
               return;
            }
         }
      } catch (Exception var19) {
         var19.printStackTrace();
      }

   }
}
