package net.LWJGLClient.client.b.b;

import net.LWJGLClient.client.model.Client;
import org.lwjgl.glfw.GLFWScrollCallback ;

final class ScrollSensor extends GLFWScrollCallback  {
   ScrollSensor(GraphicsDisplay var1) {
   }

   public final void invoke(long var1, double var3, double var5) {
      double var7 = var5;
      if (var5 > 0.0D) {
         var7 = 32.0D;
      } else if (var5 < 0.0D) {
         var7 = -32.0D;
      }

      if (var7 != 0.0D) {
         Client var10000 = GraphicsDisplay.Method1054();
         //var10000.d_91 = (int)((double)var10000.d_91 - var7 * Client.Field12427);
      }

   }
}
