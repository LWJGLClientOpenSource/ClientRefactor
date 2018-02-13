package net.LWJGLClient.client.e.d;

import net.LWJGLClient.client.c.Packet;

public final class Class441 {
   private int Field9340;
   private int[] Field9341;
   private int[] Field9342;
   int Field9343;
   int Field9344;
   int Field9345;
   private int Field9346;
   private int Field9347;
   private int Field9348;
   private int Field9349;
   private int Field9350;

   public final void Method7784(Packet var1) {
      this.Field9345 = var1.g1();
      this.Field9343 = var1.Method404();
      this.Field9344 = var1.Method404();
      this.Method7785(var1);
   }

   public final void Method7785(Packet var1) {
      this.Field9340 = var1.g1();
      this.Field9341 = new int[this.Field9340];
      this.Field9342 = new int[this.Field9340];

      for(int var2 = 0; var2 < this.Field9340; ++var2) {
         this.Field9341[var2] = var1.g2();
         this.Field9342[var2] = var1.g2();
      }

   }

   final void Method7786() {
      this.Field9346 = 0;
      this.Field9347 = 0;
      this.Field9348 = 0;
      this.Field9349 = 0;
      this.Field9350 = 0;
   }

   final int Method7787(int var1) {
      if (this.Field9350 >= this.Field9346) {
         this.Field9349 = this.Field9342[this.Field9347++] << 15;
         if (this.Field9347 >= this.Field9340) {
            this.Field9347 = this.Field9340 - 1;
         }

         this.Field9346 = (int)((double)this.Field9341[this.Field9347] / 65536.0D * (double)var1);
         if (this.Field9346 > this.Field9350) {
            this.Field9348 = ((this.Field9342[this.Field9347] << 15) - this.Field9349) / (this.Field9346 - this.Field9350);
         }
      }

      this.Field9349 += this.Field9348;
      ++this.Field9350;
      return this.Field9349 - this.Field9348 >> 15;
   }
}
