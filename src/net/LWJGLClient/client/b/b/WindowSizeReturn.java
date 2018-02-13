package net.LWJGLClient.client.b.b;

import org.lwjgl.glfw.GLFWWindowSizeCallback;

final class WindowSizeReturn extends GLFWWindowSizeCallback {
   WindowSizeReturn(GraphicsDisplay var1) {
   }

   public final void invoke(long var1, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         GraphicsDisplay.Method1050(Math.round((float)var3 / GraphicsDisplay.Method1049()));
         GraphicsDisplay.Method1051(Math.round((float)var4 / GraphicsDisplay.Method1049()));
         GraphicsDisplay.Field2684 = true;
      }

   }
}
