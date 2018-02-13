package net.LWJGLClient.client.b.b;

import org.lwjgl.glfw.GLFWFramebufferSizeCallback ;

final class FrameSizeCallback extends GLFWFramebufferSizeCallback  {
   FrameSizeCallback(GraphicsDisplay var1) {
   }

   public final void invoke(long var1, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         GraphicsDisplay.Method1052(Math.round((float)var3 / GraphicsDisplay.Method1049()));
         GraphicsDisplay.Method1053(Math.round((float)var4 / GraphicsDisplay.Method1049()));
         GraphicsDisplay.Field2684 = true;
      }

   }
}
