package net.LWJGLClient.client.b.b.d;

import java.nio.FloatBuffer;

import net.LWJGLClient.client.a.Class128;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL11;

/*import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;*/

public abstract class Class916 {
   private static int Field3132 = GL11.glGetInteger(34024) / 2;
   private static int Field3133 = GL11.glGetInteger(3379) / 2;
   protected FloatBuffer Field3134 = Class128.Method1328(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.5F, 1.0F);
   protected final FloatBuffer Field3135 = BufferUtils.createFloatBuffer(16);
   protected final FloatBuffer Field3136 = BufferUtils.createFloatBuffer(16);
   protected int Field3137 = 2048;
   protected int Field3138 = 2048;
   protected int Field3139 = 0;
   protected int Field3140 = 0;
   protected int Field3141 = 33985;

   private static int Method14920(int var0) {
      if (var0 > Field3133 || var0 > Field3132) {
         if (Field3132 < Field3133) {
            var0 = Field3132;
         } else {
            var0 = Field3133;
         }
      }

      return var0;
   }

   public Class916(int var1, int var2) {
      this.Method14921(var1, var2);
   }

   public final void Method14921(int var1, int var2) {
      this.Field3134 = Class128.Method1328(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.5F, 1.0F);
      GL13.glActiveTexture(this.Field3141);
      GL11.glEnable(3553);
      this.Field3137 = Method14920(var1);
      this.Field3138 = Method14920(var2);
      this.Method14981();
      this.Method14982();
      GL13.glActiveTexture(33984);
      GraphicsDisplay.Method997().Method1035("[RenderBufferMapper]: setSize(" + var1 + ", " + var2 + ")");
   }

   protected void Method14982() {
      throw new RuntimeException("not yet implemented");
   }

   public void Method14983(boolean var1, int var2, int var3) {
      throw new RuntimeException("not yet implemented");
   }

   public void Method14984() {
      throw new RuntimeException("not yet implemented");
   }

   public void Method14981() {
      throw new RuntimeException("not yet implemented");
   }
}
