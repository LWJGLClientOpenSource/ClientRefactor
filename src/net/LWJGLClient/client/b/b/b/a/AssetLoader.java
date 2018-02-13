package net.LWJGLClient.client.b.b.b.a;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import org.lwjgl.BufferUtils;
//import org.lwjgl.opengl.Class383;
import org.lwjgl.opengl.GL15;

public class AssetLoader {
   public FloatBuffer Field1933 = null;
   public ByteBuffer Field1934 = null;
   public FloatBuffer Field1935 = null;

   public final void Method12366() {
      boolean var1 = false;
      this.Method12367(0);
   }

   public final void Method12367(int var1) {
      if (var1 == 0) {
         var1 = 393216;
      }

      if (this.Field1933 == null) {
         this.Field1933 = BufferUtils.createFloatBuffer(var1);
      } else {
         this.Field1933.clear();
      }

      if (this.Field1934 == null) {
         this.Field1934 = BufferUtils.createByteBuffer((var1 << 2) / 3);
      } else {
         this.Field1934.clear();
      }

      if (this.Field1935 == null) {
         this.Field1935 = BufferUtils.createFloatBuffer((var1 << 1) / 3);
      } else {
         this.Field1935.clear();
      }
   }

   public final void Method12368(ModelVBO var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.Method12369(var2, var3, var4, true, var5, false, var6);
   }

   public final void Method12369(int var1, int var2, int var3, boolean var4, boolean var5, boolean var6, int var7) {
      GL15.glBindBuffer(34962, var1);
      GL15.glBufferData(34962, this.Field1933, var7);
      if (var4) {
         GL15.glBindBuffer(34962, var2);
         GL15.glBufferData(34962, this.Field1934, var7);
         if (var5) {
            GL15.glBindBuffer(34962, var3);
            GL15.glBufferData(34962, this.Field1935, var7);
         }
      } else if (var6) {
         GL15.glBindBuffer(34962, var2);
         GL15.glBufferData(34962, this.Field1934, var7);
      }

      GraphicsDisplay.Method997().Method1035("[AssetLoader]: writeHandles(" + var1 + ", " + var2 + ", " + var3 + ", " + var4 + ", " + var5 + ")");
   }
}
