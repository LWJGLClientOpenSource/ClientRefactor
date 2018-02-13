package net.LWJGLClient.client.e.b;

import net.LWJGLClient.client.model.Client;

public final class MouseDetection implements Runnable {
   private Client Field3624;
   private Object Field3625 = new Object();
   private int[] Field3626 = new int[500];
   public boolean Field3627 = true;
   private int[] Field3628 = new int[500];
   public int Field3629;

   public final void run() {
      while(this.Field3627) {
         Object var1 = this.Field3625;
         synchronized(this.Field3625) {
            if (this.Field3629 < 500) {
               this.Field3628[this.Field3629] = this.Field3624.Field12148;
               this.Field3626[this.Field3629] = this.Field3624.Field12149;
               ++this.Field3629;
            }
         }

         try {
            Thread.sleep(50L);
         } catch (Exception var2) {
            ;
         }
      }

   }

   public MouseDetection(Client var1) {
      this.Field3624 = var1;
   }

   public final void Method11824() {
      this.Field3624 = null;
   }
}
/*public final class ISSACCipher {
    private final int[] b = new int[256];
    private final int[] c = new int[256];
    private int a;
    private int d;
    private int e;
    private int f;

    public ISSACCipher(int[] var1) {
        System.arraycopy(var1, 0, this.b, 0, 4);
        this.c();
    }

    public final int a() {
        if (this.a-- == 0) {
            this.b();
            this.a = 255;
        }

        return this.b[this.a];
    }

    private void b() {
        this.e += ++this.f;

        for (int var1 = 0; var1 < 256; ++var1) {
            int var2 = this.c[var1];
            if ((var1 & 3) == 0) {
                this.d ^= this.d << 13;
            } else if ((var1 & 3) == 1) {
                this.d ^= this.d >>> 6;
            } else if ((var1 & 3) == 2) {
                this.d ^= this.d << 2;
            } else if ((var1 & 3) == 3) {
                this.d ^= this.d >>> 16;
            }

            this.d += this.c[var1 + 128 & 255];
            int var3;
            this.c[var1] = var3 = this.c[(var2 & 1020) >> 2] + this.d + this.e;
            this.b[var1] = this.e = this.c[(var3 >> 8 & 1020) >> 2] + var2;
        }

    }

    private void c() {
        int var7 = 504502448;
        int var6 = 504502448;
        int var5 = 504502448;
        int var4 = 504502448;
        int var3 = 504502448;
        int var2 = 504502448;
        int var1 = 504502448;
        int var8 = 504502448;

        int var9;
        for (var9 = 0; var9 < 4; ++var9) {
            var8 ^= var1 << 11;
            var3 += var8;
            var1 = var1 + var2 ^ var2 >>> 2;
            var4 += var1;
            var2 = var2 + var3 ^ var3 << 8;
            var5 += var2;
            var3 = var3 + var4 ^ var4 >>> 16;
            var6 += var3;
            var4 = var4 + var5 ^ var5 << 10;
            var7 += var4;
            var5 = var5 + var6 ^ var6 >>> 4;
            var8 += var5;
            var6 = var6 + var7 ^ var7 << 8;
            var1 += var6;
            var7 = var7 + var8 ^ var8 >>> 9;
            var2 += var7;
            var8 += var1;
        }

        for (var9 = 0; var9 < 256; var9 += 8) {
            var8 += this.b[var9];
            var1 += this.b[var9 + 1];
            var2 += this.b[var9 + 2];
            var3 += this.b[var9 + 3];
            var4 += this.b[var9 + 4];
            var5 += this.b[var9 + 5];
            var6 += this.b[var9 + 6];
            var7 += this.b[var9 + 7];
            var8 ^= var1 << 11;
            var3 += var8;
            var1 = var1 + var2 ^ var2 >>> 2;
            var4 += var1;
            var2 = var2 + var3 ^ var3 << 8;
            var5 += var2;
            var3 = var3 + var4 ^ var4 >>> 16;
            var6 += var3;
            var4 = var4 + var5 ^ var5 << 10;
            var7 += var4;
            var5 = var5 + var6 ^ var6 >>> 4;
            var8 += var5;
            var6 = var6 + var7 ^ var7 << 8;
            var1 += var6;
            var7 = var7 + var8 ^ var8 >>> 9;
            var2 += var7;
            var8 += var1;
            this.c[var9] = var8;
            this.c[var9 + 1] = var1;
            this.c[var9 + 2] = var2;
            this.c[var9 + 3] = var3;
            this.c[var9 + 4] = var4;
            this.c[var9 + 5] = var5;
            this.c[var9 + 6] = var6;
            this.c[var9 + 7] = var7;
        }

        for (var9 = 0; var9 < 256; var9 += 8) {
            var8 += this.c[var9];
            var1 += this.c[var9 + 1];
            var2 += this.c[var9 + 2];
            var3 += this.c[var9 + 3];
            var4 += this.c[var9 + 4];
            var5 += this.c[var9 + 5];
            var6 += this.c[var9 + 6];
            var7 += this.c[var9 + 7];
            var8 ^= var1 << 11;
            var3 += var8;
            var1 = var1 + var2 ^ var2 >>> 2;
            var4 += var1;
            var2 = var2 + var3 ^ var3 << 8;
            var5 += var2;
            var3 = var3 + var4 ^ var4 >>> 16;
            var6 += var3;
            var4 = var4 + var5 ^ var5 << 10;
            var7 += var4;
            var5 = var5 + var6 ^ var6 >>> 4;
            var8 += var5;
            var6 = var6 + var7 ^ var7 << 8;
            var1 += var6;
            var7 = var7 + var8 ^ var8 >>> 9;
            var2 += var7;
            var8 += var1;
            this.c[var9] = var8;
            this.c[var9 + 1] = var1;
            this.c[var9 + 2] = var2;
            this.c[var9 + 3] = var3;
            this.c[var9 + 4] = var4;
            this.c[var9 + 5] = var5;
            this.c[var9 + 6] = var6;
            this.c[var9 + 7] = var7;
        }

        this.b();
        this.a = 256;
    }
}*/