package net.LWJGLClient.client.b.b.c;

public final class ShaderSelector extends ShaderData {
   public final int Method7538() {
      if (this.Field3204 == 0) {
         int var1 = ShaderUtils.loadShadow("picking.vert");
         int var2 = ShaderUtils.loadShadow("picking.frag");
         if (var1 == 0 || var2 == 0) {
            return 0;
         }

         this.Field3204 = ShaderUtils.Method7387(var1, var2);
      }

      return this.Field3204;
   }
}
