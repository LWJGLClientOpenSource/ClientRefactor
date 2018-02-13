package net.LWJGLClient.client.b.b.d;

import java.nio.FloatBuffer;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.b.Class745;
import net.LWJGLClient.client.model.Client;
import org.lwjgl.opengl.ARBFramebufferObject;
//import org.lwjgl.opengl.Class344;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL11;
//import org.lwjgl.opengl.Class889;
import org.lwjgl.opengl.GL30;

public final class Class914 extends Class916 {
   public Class914(int var1, int var2) {
      super(var1, var2);
   }

   public final void Method14981() {
      if (this.Field3139 != 0) {
         GL30.glDeleteFramebuffers(this.Field3139);
         this.Field3139 = 0;
      }

      if (this.Field3140 != 0) {
         GL11.glDeleteTextures(this.Field3140);
         this.Field3140 = 0;
      }

   }

   protected final void Method14982() {
      this.Field3139 = GL30.glGenFramebuffers();
      ARBFramebufferObject.glBindFramebuffer(36160, this.Field3139);
      this.Field3140 = GL11.glGenTextures();
      GL11.glBindTexture(3553, this.Field3140);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 33169, 0);
      GL11.glTexImage2D(3553, 0, 6402, this.Field3137, this.Field3137, 0, 6402, 5126, (FloatBuffer)null);
      GL30.glFramebufferTexture2D(36160, 36096, 3553, this.Field3140, 0);
      GL11.glDrawBuffer(0);
      GL11.glReadBuffer(0);
      int var1 = 0;

      for(int var2 = 0; var2 < 5 && (var1 = GL30.glCheckFramebufferStatus(36160)) != 36053; ++var2) {
         if (var2 == 4) {
            System.err.println("[RenderBuffer30][init]: size: " + this.Field3137 + ", glCheckFramebufferStatus: " + var1);
            Client.Field12069 = false;
            String var3 = "Unable to render " + this.Field3137 + "x" + this.Field3137 + " shadows.";
            Client.Field12059.add(var3);
            System.err.println("[RenderBuffer30]: " + var3);
            this.Method14981();
            GraphicsDisplay.Method997();
            GraphicsDisplay.Method1034();
            return;
         }

         try {
            Thread.sleep(100L);
         } catch (InterruptedException var4) {
            var4.printStackTrace();
         }
      }

      ARBFramebufferObject.glBindFramebuffer(36160, 0);
      GraphicsDisplay.Method997().Method1035("[RenderBuffer30]: setUpFrameBufferObject(" + this.Field3139 + ", " + this.Field3137 + ", " + var1 + ")");
   }

   public final void Method14983(boolean var1, int var2, int var3) {
      if (var2 != this.Field3137 || var3 != this.Field3138) {
         this.Method14921(var2, var3);
      }

      if (this.Field3139 != 0 && this.Field3140 != 0) {
         GL11.glClear(256);
         GraphicsDisplay.Method997().Method1035("[RenderBuffer30]: glClear(" + this.Field3139 + ", " + var2 + ")");
         Class745.Method12481(true, true);
         GraphicsDisplay.Method997().Method1035("[RenderBuffer30]: glSetPerspective(" + this.Field3139 + ", " + var2 + ")");
         GL11.glGetFloatv(2983, this.Field3136);
         GL11.glGetFloatv(2982, this.Field3135);
         GraphicsDisplay.Method997().Method1035("[RenderBuffer30]: glGetFloat(" + this.Field3139 + ", " + var2 + ")");
         ARBFramebufferObject.glBindFramebuffer(36160, this.Field3139);
         int var4; //GL30.glCheckFramebufferStatus
         if ((var4 = GL30.glCheckFramebufferStatus(36160)) == 36053) {
            GraphicsDisplay.Method997().Method1035("[RenderBuffer30]: glBindFramebuffer(" + this.Field3139 + ", " + var2 + ", " + var4 + ")");
            GL11.glViewport(0, 0, var2, var2);
            GraphicsDisplay.Method997().Method1035("[RenderBuffer30]: glViewport(" + this.Field3139 + ", " + var2 + ")");
            GL11.glPushAttrib(1048575);
            GL11.glCullFace(1029);
            GL11.glEnable(32823);
            GL11.glPolygonOffset(1.5F, 0.0F);
            Class745.Method12475(false);
            GraphicsDisplay.Method997().Method1035("[RenderBuffer30]: renderShadowScene(" + var2 + ")");
            GL13.glActiveTexture(this.Field3141);
            GL11.glBindTexture(3553, this.Field3140);
            GL11.glMatrixMode(5890);
            GL11.glLoadMatrixf(this.Field3134);
            GL11.glMultMatrixf(this.Field3136);
            GL11.glMultMatrixf(this.Field3135);
            GL13.glActiveTexture(33984);
            GL11.glPopAttrib();
            ARBFramebufferObject.glBindFramebuffer(36160, 0);
            GraphicsDisplay.Method997().Method1033();
            GraphicsDisplay.Method997().Method1035("[ShadowMapper]: error");
         }
      }
   }

   public final void Method14984() {
      ARBFramebufferObject.glBindFramebuffer(36160, this.Field3139);
      if (GL30.glCheckFramebufferStatus(36160) == 36053) {
         GL11.glClear(256);
         ARBFramebufferObject.glBindFramebuffer(36160, 0);
         GraphicsDisplay.Method997().Method1035("[RenderBuffer30]: unbindFrameBuffer");
      }
   }
}
