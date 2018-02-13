package net.LWJGLClient.client.c;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.LWJGLClient.client.b.a.GameShell;

public final class Class55 implements Runnable {
   private InputStream Field1246;
   private OutputStream Field1247;
   private Socket Field1248;
   private boolean Field1249 = false;
   private GameShell Field1250;
   private byte[] Field1251;
   private int Field1252;
   private int Field1253;
   private boolean Field1254 = false;
   private boolean Field1255 = false;

   public Class55(GameShell var1, Socket var2) {
      this.Field1250 = var1;
      this.Field1248 = var2;
      this.Field1246 = this.Field1248.getInputStream();
      this.Field1247 = this.Field1248.getOutputStream();
   }

   public final void Method11824() {
      this.Field1249 = true;

      try {
         if (this.Field1246 != null) {
            this.Field1246.close();
         }

         if (this.Field1247 != null) {
            this.Field1247.close();
         }

         if (this.Field1248 != null) {
            this.Field1248.close();
         }
      } catch (Exception var3) {
         System.out.println("Error closing stream");
      }

      this.Field1254 = false;
      synchronized(this) {
         this.notifyAll();
      }

      this.Field1251 = null;
   }

   public final int Method11953() {
      return this.Field1249 ? -1 : this.Field1246.read();
   }

   public final void Method371(byte[] var1, int var2) {
      boolean var3 = true;
      int var4 = var2;
      Class55 var7 = this;
      int var5 = 0;

      int var6;
      while((var6 = var7.Method11954()) < var4) {
         Thread.sleep(100L);
         if (var5++ > 50) {
            throw new IOException("EOF - await: " + var4 + "/" + var6);
         }
      }

      this.Method373(var1, var2);
   }

   public final int Method11954() {
      return this.Field1249 ? -1 : this.Field1246.available();
   }

   public final void Method373(byte[] var1, int var2) {
      int var3 = 0;
      if (!this.Field1249) {
         while(var2 > 0) {
            int var4;
            if ((var4 = this.Field1246.read(var1, var3, var2)) <= 0) {
               throw new IOException("EOF " + var3 + ", " + var2);
            }

            var3 += var4;
            var2 -= var4;
         }

      }
   }

   public final void Method374(int var1, byte[] var2) {
      if (!this.Field1249) {
         if (this.Field1255) {
            this.Field1255 = false;
            throw new IOException("Error in writer thread");
         } else {
            if (this.Field1251 == null) {
               this.Field1251 = new byte[25000];
            }

            synchronized(this) {
               for(int var4 = 0; var4 < var1; ++var4) {
                  this.Field1251[this.Field1253] = var2[var4];
                  this.Field1253 = (this.Field1253 + 1) % 25000;
                  if (this.Field1253 == (this.Field1252 + 24900) % 25000) {
                     throw new IOException("buffer overflow");
                  }
               }

               if (!this.Field1254) {
                  this.Field1254 = true;
                  GameShell.Method11971(this);
               }

               this.notifyAll();
            }
         }
      }
   }

   public final void run() {
      while(this.Field1254) {
         int var1;
         int var2;
         synchronized(this) {
            if (this.Field1253 == this.Field1252) {
               try {
                  this.wait();
               } catch (InterruptedException var6) {
                  ;
               }
            }

            if (!this.Field1254) {
               return;
            }

            var2 = this.Field1252;
            if (this.Field1253 >= this.Field1252) {
               var1 = this.Field1253 - this.Field1252;
            } else {
               var1 = 25000 - this.Field1252;
            }
         }

         if (var1 > 0) {
            try {
               this.Field1247.write(this.Field1251, var2, var1);
            } catch (IOException var5) {
               var5.printStackTrace();
               this.Field1255 = true;
            }

            this.Field1252 = (this.Field1252 + var1) % 25000;

            try {
               if (this.Field1253 == this.Field1252) {
                  this.Field1247.flush();
               }
            } catch (IOException var4) {
               var4.printStackTrace();
               this.Field1255 = true;
            }
         }
      }

   }
}
