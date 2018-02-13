package net.LWJGLClient.client.b.b;

import net.LWJGLClient.client.b.b.f.b.Class145;

import org.lwjgl.glfw.GLFWCursorPosCallback;

final class CursorPosition extends GLFWCursorPosCallback {
   // $FF: synthetic field
   private GraphicsDisplay Field9877;

   CursorPosition(GraphicsDisplay var1) {
      super();
      this.Field9877 = var1;
      //super();
   }

   public final void invoke(long var1, double var3, double var5) {
      GraphicsDisplay.Method1055((int)Math.round(var3 / (double) GraphicsDisplay.Method1049()));
      GraphicsDisplay.Method1056((int)Math.round(var5 / (double) GraphicsDisplay.Method1049()));
     // GraphicsDisplay.Method1054(GraphicsDisplay.Method1057(), GraphicsDisplay.Method1058());
      if (GraphicsDisplay.Method1059(this.Field9877) == 0L || GraphicsDisplay.Method1060(this.Field9877) != 2 && (GraphicsDisplay.Method1060(this.Field9877) != 0 || GraphicsDisplay.Method1054().openInterfaceID <= 0)) {
         if (GraphicsDisplay.Method1060(this.Field9877) != 2) {
            GraphicsDisplay.Method1062(this.Field9877, GraphicsDisplay.Method1057());
            GraphicsDisplay.Method1063(this.Field9877, GraphicsDisplay.Method1058());
         }

      } else {
         GraphicsDisplay.Method1061().add(new Class145(GraphicsDisplay.Method1057(), GraphicsDisplay.Method1058(), GraphicsDisplay.Method1060(this.Field9877), 1, 0));
         this.Field9877.Method1031(true);
      }
   }
}
