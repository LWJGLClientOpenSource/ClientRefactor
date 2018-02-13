package net.LWJGLClient.client.a.c;

import net.LWJGLClient.client.model.Model;

public final class Class696 {
   private Model Field10506 = null;
   public boolean Field10507 = false;
   private boolean Field10508 = true;
   public long Field10509 = 0L;
   private long Field10510 = 0L;
   public int Field10511 = 0;
   public byte[] Field10512;
   public int Field10513;
   public int Field10514;
   public int Field10515;
   public int Field10516;
   public int Field10517;
   public int Field10518;
   public int Field10519;
   public int Field10520;
   public int Field10521;
   public int Field10522;
   public int Field10523;
   public int Field10524;
   public int Field10525;
   public int Field10526;
   public int Field10527;
   public int Field10528;
   public float[][] Field10529 = null;

   public Class696() {
      this.Field10509 = System.currentTimeMillis();
      this.Field10510 = this.Field10509;
   }

   public final void Method11974(long var1) {
      this.Field10510 = var1;
   }

   public final long Method11975() {
      return this.Field10510;
   }

   public final void Method11976() {
      this.Field10512 = null;
      this.Field10529 = null;
   }

   public final Model Method11977() {
      this.Field10509 = System.currentTimeMillis();
      return this.Field10506;
   }

   public final Model Method11978() {
      if (this.Field10506 == null) {
         return null;
      } else {
         this.Field10509 = System.currentTimeMillis();
         return new Model(new Model[]{this.Field10506});
      }
   }

   public final void Method11979(Model var1) {
      this.Field10506 = var1;
      this.Field10512 = null;
   }

   public final boolean Method11980() {
      return this.Field10508;
   }

   public final void Method11981() {
      this.Field10508 = false;
   }
}
