package net.LWJGLClient.client.a.e;

import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class619 {
   private static Object Field2091 = new Object();
   private static byte[] Field2092 = new byte[520];
   private RandomAccessFile Field2093;
   private RandomAccessFile Field2094;
   private RandomAccessFile Field2095;
   private RandomAccessFile Field2096;
   private int Field2097;

   public Class619(RandomAccessFile var1, RandomAccessFile var2, int var3) {
      this.Field2097 = var3;
      this.Field2093 = var1;
      this.Field2094 = var2;
   }

   public Class619(RandomAccessFile var1, RandomAccessFile var2, RandomAccessFile var3, RandomAccessFile var4, int var5) {
      this.Field2097 = var5;
      this.Field2093 = var1;
      this.Field2095 = var3;
      this.Field2094 = var2;
      this.Field2096 = var4;
   }

   private RandomAccessFile Method9331(int var1) {
      return var1 >= 65535 ? this.Field2095 : this.Field2093;
   }

   private RandomAccessFile Method9332(int var1) {
      return var1 >= 65535 ? this.Field2096 : this.Field2094;
   }

   public final byte[] Method9333(int var1) {
      RandomAccessFile var2 = this.Method9331(var1);
      RandomAccessFile var3 = this.Method9332(var1);
      if (var1 >= 65535) {
         var1 -= 65535;
      }

      Object var4 = Field2091;
      synchronized(Field2091) {
         try {
            Method9336(var3, (long)var1 * 6L);

            int var5;
            int var6;
            for(var6 = 0; var6 < 6; var6 += var5) {
               if ((var5 = var3.read(Field2092, var6, 6 - var6)) == -1) {
                  return null;
               }
            }

            var6 = ((Field2092[0] & 255) << 16) + ((Field2092[1] & 255) << 8) + (Field2092[2] & 255);
            int var15;
            if ((var15 = ((Field2092[3] & 255) << 16) + ((Field2092[4] & 255) << 8) + (Field2092[5] & 255)) <= 0 || (long)var15 > var2.length() / 520L || var6 <= 0) {
               return null;
            } else {
               byte[] var16 = new byte[var6];
               int var7 = 0;
               int var8 = 0;

               while(var7 < var6) {
                  if (var15 == 0) {
                     return null;
                  }

                  Method9336(var2, (long)var15 * 520L);
                  var15 = 0;
                  int var9;
                  if ((var9 = var6 - var7) > 512) {
                     var9 = 512;
                  }

                  int var10;
                  while(var15 < var9 + 8) {
                     if ((var10 = var2.read(Field2092, var15, var9 + 8 - var15)) == -1) {
                        return null;
                     }

                     var15 += var10;
                  }

                  var15 = ((Field2092[0] & 255) << 8) + (Field2092[1] & 255);
                  var10 = ((Field2092[2] & 255) << 8) + (Field2092[3] & 255);
                  int var11 = ((Field2092[4] & 255) << 16) + ((Field2092[5] & 255) << 8) + (Field2092[6] & 255);
                  int var12 = Field2092[7] & 255;
                  if (var15 == var1 && var10 == var8 && var12 == this.Field2097) {
                     if (var11 >= 0 && (long)var11 <= var2.length() / 520L) {
                        for(var15 = 0; var15 < var9; ++var15) {
                           var16[var7++] = Field2092[var15 + 8];
                        }

                        var15 = var11;
                        ++var8;
                        continue;
                     }

                     System.out.println("[Decompressor]: too small/big " + var11);
                     return null;
                  }

                  System.out.println("[Decompressor]: id wrong: " + var15 + "/" + var1 + ", " + var10 + "/" + var8 + ", " + var12 + "/" + this.Field2097);
                  return null;
               }

               byte[] var10000 = var16;
               return var10000;
            }
         } catch (IOException var13) {
            return null;
         }
      }
   }

   public final boolean Method9334(int var1, byte[] var2, int var3) {
      Object var4 = Field2091;
      synchronized(Field2091) {
         boolean var5;
         if (!(var5 = this.Method9335(true, var3, var1, var2))) {
            var5 = this.Method9335(false, var3, var1, var2);
         }

         return var5;
      }
   }

   private boolean Method9335(boolean var1, int var2, int var3, byte[] var4) {
      RandomAccessFile var5 = this.Method9331(var2);
      RandomAccessFile var6 = this.Method9332(var2);
      if (var2 >= 65535) {
         var2 -= 65535;
      }

      Object var7 = Field2091;
      synchronized(Field2091) {
         try {
            int var8;
            int var9;
            int var10;
            if (!var1) {
               if ((var8 = (int)((var5.length() + 519L) / 520L)) == 0) {
                  var8 = 1;
               }
            } else {
               Method9336(var6, (long)(var2 * 6));

               for(var10 = 0; var10 < 6; var10 += var9) {
                  if ((var9 = var6.read(Field2092, var10, 6 - var10)) == -1) {
                     return false;
                  }
               }

               if ((var8 = ((Field2092[3] & 255) << 16) + ((Field2092[4] & 255) << 8) + (Field2092[5] & 255)) <= 0 || (long)var8 > var5.length() / 520L) {
                  return false;
               }
            }

            Field2092[0] = (byte)(var3 >> 16);
            Field2092[1] = (byte)(var3 >> 8);
            Field2092[2] = (byte)var3;
            Field2092[3] = (byte)(var8 >> 16);
            Field2092[4] = (byte)(var8 >> 8);
            Field2092[5] = (byte)var8;
            Method9336(var6, (long)(var2 * 6));
            var6.write(Field2092, 0, 6);
            var9 = 0;

            for(var10 = 0; var9 < var3; ++var10) {
               int var16 = 0;
               int var11;
               if (var1) {
                  Method9336(var5, (long)(var8 * 520));

                  int var12;
                  for(var11 = 0; var11 < 8 && (var12 = var5.read(Field2092, var11, 8 - var11)) != -1; var11 += var12) {
                     ;
                  }

                  if (var11 == 8) {
                     var11 = ((Field2092[0] & 255) << 8) + (Field2092[1] & 255);
                     var12 = ((Field2092[2] & 255) << 8) + (Field2092[3] & 255);
                     var16 = ((Field2092[4] & 255) << 16) + ((Field2092[5] & 255) << 8) + (Field2092[6] & 255);
                     int var13 = Field2092[7] & 255;
                     if (var11 != var2 || var12 != var10 || var13 != this.Field2097) {
                        return false;
                     }

                     if (var16 < 0 || (long)var16 > var5.length() / 520L) {
                        return false;
                     }
                  }
               }

               if (var16 == 0) {
                  var1 = false;
                  if ((var16 = (int)((var5.length() + 519L) / 520L)) == 0) {
                     ++var16;
                  }

                  if (var16 == var8) {
                     ++var16;
                  }
               }

               if (var3 - var9 <= 512) {
                  var16 = 0;
               }

               Field2092[0] = (byte)(var2 >> 8);
               Field2092[1] = (byte)var2;
               Field2092[2] = (byte)(var10 >> 8);
               Field2092[3] = (byte)var10;
               Field2092[4] = (byte)(var16 >> 16);
               Field2092[5] = (byte)(var16 >> 8);
               Field2092[6] = (byte)var16;
               Field2092[7] = (byte)this.Field2097;
               Method9336(var5, (long)var8 * 520L);
               var5.write(Field2092, 0, 8);
               if ((var11 = var3 - var9) > 512) {
                  var11 = 512;
               }

               var5.write(var4, var9, var11);
               var9 += var11;
               var8 = var16;
            }

            return true;
         } catch (IOException var14) {
            var14.printStackTrace();
            return false;
         }
      }
   }

   private static void Method9336(RandomAccessFile var0, long var1) {
      Object var3 = Field2091;
      synchronized(Field2091) {
         var0.seek(var1);
      }
   }
}
