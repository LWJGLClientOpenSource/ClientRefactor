package net.LWJGLClient.client.b.b;

import org.lwjgl.glfw.GLFWWindowIconifyCallback;

final class WindowIcon extends GLFWWindowIconifyCallback {
   WindowIcon(GraphicsDisplay var1) {
   }

   public final void invoke(long var1, boolean var3) {
      GraphicsDisplay.Method1048(var3);
   }
}
