package net.LWJGLClient.client.b.a.a;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import net.LWJGLClient.client.b.a.Class697;

public abstract class GraphicsBuffer {
   Image Field240;
   public int Field241;
   int[] Field242;
   public int Field243;

   public abstract void Method3036(Component var1, int var2, int var3, boolean var4);

   public abstract void Method3035(Component var1, int var2, int var3, boolean var4);

   public abstract void Method3038(int var1, Graphics var2, int var3);

   public final void Method13683() {
      Class697.Method11982(this.Field243, this.Field241, this.Field242);
   }
}
