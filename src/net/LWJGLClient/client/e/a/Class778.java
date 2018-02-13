package net.LWJGLClient.client.e.a;

public final class Class778 {
   private int Field2974;
   private final int[] Field2975 = new int[256];
   private final int[] Field2976 = new int[256];
   private int Field2977;
   private int Field2978;
   private int Field2979;

   public Class778(int[] var1) {
      System.arraycopy(var1, 0, this.Field2975, 0, 4);
      this.Method13432();
   }

   public final int Method13430() {
      if (this.Field2974-- == 0) {
         this.Method13431();
         this.Field2974 = 255;
      }

      return this.Field2975[this.Field2974];
   }

   private void Method13431() {
      this.Field2978 += ++this.Field2979;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.Field2976[var1];
         if ((var1 & 3) == 0) {
            this.Field2977 ^= this.Field2977 << 13;
         } else if ((var1 & 3) == 1) {
            this.Field2977 ^= this.Field2977 >>> 6;
         } else if ((var1 & 3) == 2) {
            this.Field2977 ^= this.Field2977 << 2;
         } else if ((var1 & 3) == 3) {
            this.Field2977 ^= this.Field2977 >>> 16;
         }

         this.Field2977 += this.Field2976[var1 + 128 & 255];
         int var3;
         this.Field2976[var1] = var3 = this.Field2976[(var2 & 1020) >> 2] + this.Field2977 + this.Field2978;
         this.Field2975[var1] = this.Field2978 = this.Field2976[(var3 >> 8 & 1020) >> 2] + var2;
      }

   }

   private void Method13432() {
      int var7 = 504502448;
      int var6 = 504502448;
      int var5 = 504502448;
      int var4 = 504502448;
      int var3 = 504502448;
      int var2 = 504502448;
      int var1 = 504502448;
      int var8 = 504502448;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
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

      for(var9 = 0; var9 < 256; var9 += 8) {
         var8 += this.Field2975[var9];
         var1 += this.Field2975[var9 + 1];
         var2 += this.Field2975[var9 + 2];
         var3 += this.Field2975[var9 + 3];
         var4 += this.Field2975[var9 + 4];
         var5 += this.Field2975[var9 + 5];
         var6 += this.Field2975[var9 + 6];
         var7 += this.Field2975[var9 + 7];
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
         this.Field2976[var9] = var8;
         this.Field2976[var9 + 1] = var1;
         this.Field2976[var9 + 2] = var2;
         this.Field2976[var9 + 3] = var3;
         this.Field2976[var9 + 4] = var4;
         this.Field2976[var9 + 5] = var5;
         this.Field2976[var9 + 6] = var6;
         this.Field2976[var9 + 7] = var7;
      }

      for(var9 = 0; var9 < 256; var9 += 8) {
         var8 += this.Field2976[var9];
         var1 += this.Field2976[var9 + 1];
         var2 += this.Field2976[var9 + 2];
         var3 += this.Field2976[var9 + 3];
         var4 += this.Field2976[var9 + 4];
         var5 += this.Field2976[var9 + 5];
         var6 += this.Field2976[var9 + 6];
         var7 += this.Field2976[var9 + 7];
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
         this.Field2976[var9] = var8;
         this.Field2976[var9 + 1] = var1;
         this.Field2976[var9 + 2] = var2;
         this.Field2976[var9 + 3] = var3;
         this.Field2976[var9 + 4] = var4;
         this.Field2976[var9 + 5] = var5;
         this.Field2976[var9 + 6] = var6;
         this.Field2976[var9 + 7] = var7;
      }

      this.Method13431();
      this.Field2974 = 256;
   }
}
