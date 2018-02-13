package net.LWJGLClient.client.b.b;

import net.LWJGLClient.client.b.b.f.b.Class145;

import org.lwjgl.glfw.GLFWMouseButtonCallback;

final class MouseClick extends GLFWMouseButtonCallback {
   MouseClick(GraphicsDisplay var1) {
      this.Field9900 = var1;
      //super();
   }

   public final void invoke(long var1, int var3, int var4, int var5) {
      GraphicsDisplay.Method1061().add(new Class145(GraphicsDisplay.Method1057(), GraphicsDisplay.Method1058(), var3, var4, var5));
      this.Field9900.Method1031(true);
   }
   private GraphicsDisplay Field9900;
}
