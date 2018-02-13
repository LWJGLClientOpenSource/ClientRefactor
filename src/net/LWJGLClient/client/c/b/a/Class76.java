package net.LWJGLClient.client.c.b.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public final class Class76 implements Runnable {
   private boolean Field3110 = true;
   private final InputStream Field3111;
   private final OutputStream Field3112;
   private final Class78 Field3113;
   private boolean Field3114 = false;
   private int Field3115 = -1;
   private int Field3116 = -1;
   private int Field3117 = -1;
   private int Field3118 = 0;
   private int Field3119 = 0;
   private byte[] Field3120 = new byte[256];
   private byte[] Field3121 = new byte[262144];
   private boolean Field3122 = false;

   public Class76(InputStream var1, OutputStream var2, Class78 var3) {
      this.Field3111 = var1;
      this.Field3112 = var2;
      this.Field3113 = var3;
   }

   public final void Method11824() {
      if (this.Field3110) {
         this.Field3110 = false;

         try {
            this.Field3111.close();
         } catch (IOException var2) {
            var2.printStackTrace();
         }

         this.Field3120 = null;
         this.Field3121 = null;
      }
   }

   public final void Method572(Class77 var1) {
      if (this.Field3122) {
         throw new IOException("has error");
      } else {
         byte[] var2;
         if ((var2 = var1.Method577().getBytes(StandardCharsets.UTF_8)).length > 255) {
            System.err.println("[SocketReader]: File request too long: " + var1.Method577());
         }

         OutputStream var4 = this.Field3112;
         synchronized(this.Field3112) {
            this.Field3112.write(1);
            this.Field3112.write(var2.length);
            this.Field3112.write(var2);
            this.Field3112.flush();
         }
      }
   }

   public final void run() {
      while(this.Field3110 && !this.Field3122) {
         try {
            Thread.sleep(30L);
            int var1;
            if ((var1 = this.Field3111.available()) <= 0) {
               Thread.sleep(100L);
            } else {
               while(var1 > 0) {
                  if (this.Field3115 == -1) {
                     if (var1 <= 0) {
                        break;
                     }

                     --var1;
                     this.Field3115 = this.Field3111.read() & 255;
                  }

                  if (this.Field3116 == -1) {
                     if (var1 < 5) {
                        break;
                     }

                     this.Field3116 = this.Field3111.read() & 255;
                     this.Field3117 = (this.Field3111.read() & 255) + ((this.Field3111.read() & 255) << 8) + ((this.Field3111.read() & 255) << 16) + ((this.Field3111.read() & 255) << 24);
                     this.Field3119 = this.Field3117;
                     var1 -= 5;
                  }

                  if (!this.Field3114) {
                     if (this.Field3116 < 0 || var1 < this.Field3116) {
                        break;
                     }

                     this.Field3111.read(this.Field3120, 0, this.Field3116);
                     var1 -= this.Field3116;
                     this.Field3114 = true;
                  }

                  if (var1 <= 0) {
                     break;
                  }

                  int var2 = this.Field3119;
                  if (this.Field3119 > var1) {
                     var2 = var1;
                  }

                  this.Field3111.read(this.Field3121, this.Field3118, var2);
                  var1 -= this.Field3117;
                  this.Field3118 += var2;
                  this.Field3119 -= var2;
                  if (this.Field3118 == this.Field3117) {
                     this.Field3113.Method590(new String(this.Field3120, 0, this.Field3116), this.Field3121, this.Field3117);
                     this.Field3115 = -1;
                     this.Field3116 = -1;
                     this.Field3117 = -1;
                     this.Field3118 = 0;
                     this.Field3119 = 0;
                     this.Field3114 = false;
                  }
               }
            }
         } catch (Exception var3) {
            this.Field3122 = true;
            var3.printStackTrace();
         }
      }

   }
}
