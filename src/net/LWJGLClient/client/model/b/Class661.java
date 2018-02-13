package net.LWJGLClient.client.model.b;

import net.LWJGLClient.client.model.Client;

public abstract class Class661 {
   public int Field9565;
   public int Field9566;
   public String Field9567;
   public long Field9568;
   public long Field9569;

   public Class661(int var1, int var2, String var3) {
      this.Field9565 = var1;
      this.Field9566 = var2;
      this.Field9567 = var3;
   }

   public Class661(int var1, int var2, String var3, long var4) {
      this.Field9565 = var1;
      this.Field9566 = var2;
      this.Field9567 = var3;
      this.Field9568 = var4;
      this.Field9569 = System.currentTimeMillis();
   }

   public abstract void Method10875(boolean var1, Client var2);
}
