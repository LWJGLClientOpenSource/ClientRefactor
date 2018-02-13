package net.LWJGLClient.client.b.b.c;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;
//openGL errors
public final class ShaderUtils {
   private static int Field3229 = 35633;
   private static int Field3230 = 35632;
   private static Map Field3231 = new HashMap();

   static {
      BufferUtils.createFloatBuffer(16);
   }

   public static int loadShadow(String var0) {
      if (var0.endsWith(".vert")) {
         return Method7383(var0, Field3229);
      } else if (var0.endsWith(".frag")) {
         return Method7383(var0, Field3230);
      } else {
         System.err.println("[ShaderUtils]: shader not found: " + var0);
         return 0;
      }
   }

   private static int Method7383(String var0, int var1) {
      Integer var2;
      if ((var2 = (Integer)Field3231.get(var0)) == null) {
         String var4;
         if (GraphicsDisplay.Field2672) {
            var4 = Method7393(Thread.currentThread().getContextClassLoader().getResourceAsStream(var0));
         } else {
            var4 = Class418.Method7394(var0);
         }

         if (var4 == null) {
            System.err.println("Shader not found: " + var0 + ", debug: " + GraphicsDisplay.Field2672);
            GraphicsDisplay.Field2665 = false;
            return 0;
         }

         var2 = Method7392(var4, var1);
         Field3231.put(var0, var2);
      }

      return var2;
   }

   public static void Method7384() {
      Iterator var1 = Field3231.values().iterator();

      while(var1.hasNext()) {
         Integer var0;
         GL20.glDeleteShader(var0 = (Integer)var1.next());
         GraphicsDisplay.Method997().Method1035("[ShaderUtils]: deleteShader(" + var0 + ")");
      }

      Field3231.clear();
   }

   public static void Method7385(int var0) {
      GraphicsDisplay.Method997().Method1035("[ShaderUtils]: useProgram1(" + var0 + ")");
      GL20.glUseProgram(var0);
      GraphicsDisplay.Method997().Method1035("[ShaderUtils]: useProgram2(" + var0 + ")");
   }

   public static void Method7386() {
      GL20.glUseProgram(0);
      GraphicsDisplay.Method997().Method1035("[ShaderUtils]: useFixedFunctions()");
   }

   public static int Method7387(int... var0) {
      int[] var3 = var0;

      int var2;
      for(var2 = 0; var2 < 2; ++var2) {
         if (var3[var2] <= 0) {
            GraphicsDisplay.Field2665 = false;
            throw new RuntimeException("Shader Compilation Error");
         }
      }

      int var1;
      if ((var1 = GL20.glCreateProgram()) == 0) {
         return 0;
      } else {
         var3 = var0;

         for(int var4 = 0; var4 < 2; ++var4) {
            var2 = var3[var4];
            GL20.glAttachShader(var1, var2);
            GraphicsDisplay.Method997().Method1035("[ShaderUtils]: makeProgram() -> attachShader(" + var1 + ", " + var2 + ")");
         }

         GL20.glLinkProgram(var1);
         GraphicsDisplay.Method997().Method1035("[ShaderUtils]: makeProgram() -> linkProgram(" + var1 + ")");
         return var1;
      }
   }

   public static void Method7388(int var0) {
      GL20.glDeleteProgram(var0);
      GraphicsDisplay.Method997().Method1035("[ShaderUtils]: deleteProgram(" + var0 + ")");
   }

   public static int Method7389(int var0, String var1) {
      int var2 = GL20.glGetAttribLocation(var0, var1);
      GraphicsDisplay.Method997().Method1035("[ShaderUtils]: getAttributeLocation(" + var0 + ", " + var1 + ")");
      return var2;
   }

   public static void Method7390(int var0, int var1, float... var2) {
      GraphicsDisplay.Method997().Method1035("[ShaderUtils]: setUniformVar() -> getUniformLocation(" + var0 + ", " + var1 + ")");
      switch(var2.length) {
      case 1:
         GL20.glUniform1f(var1, var2[0]);
         break;
      case 2:
         GL20.glUniform2f(var1, var2[0], var2[1]);
         break;
      case 3:
         GL20.glUniform3f(var1, var2[0], var2[1], var2[2]);
         break;
      case 4:
         GL20.glUniform4f(var1, var2[0], var2[1], var2[2], var2[3]);
         break;
      default:
         FloatBuffer var3;
         (var3 = BufferUtils.createFloatBuffer(var2.length)).put(var2);
         var3.rewind();
         GL20.glUniform1fv(var1, var3);
      }

      GraphicsDisplay.Method997().Method1035("[ShaderUtils]: setUniformVar() -> Uniform" + var2.length + "f(" + var0 + ", " + var1 + ")");
   }

   public static void Method7391(int var0, int var1, int... var2) {
      GraphicsDisplay.Method997().Method1035("[ShaderUtils]: setUniformVar() -> getUniformLocation(" + var0 + ", " + var1 + ")");
      switch(var2.length) {
      case 1:
         GL20.glUniform1i(var1, var2[0]);
         break;
      case 2:
         GL20.glUniform2i(var1, var2[0], var2[1]);
         break;
      case 3:
         GL20.glUniform3i(var1, var2[0], var2[1], var2[2]);
         break;
      case 4:
         GL20.glUniform4i(var1, var2[0], var2[1], var2[2], var2[3]);
         break;
      default:
         IntBuffer var3;
         (var3 = BufferUtils.createIntBuffer(var2.length)).put(var2);
         var3.rewind();
         GL20.glUniform1iv(var1, var3);
      }

      GraphicsDisplay.Method997().Method1035("[ShaderUtils]: setUniformVar() -> Uniform" + var2.length + "i(" + var0 + ", " + var1 + ")");
   }

   private static int Method7392(String var0, int var1) {
      try {
         int var2 = GL20.glCreateShader(var1);
         GraphicsDisplay.Method997().Method1035("[ShaderUtils]: makeShader() -> createShader(" + var1 + ")");
         GL20.glShaderSource(var2, var0);
         GraphicsDisplay.Method997().Method1035("[ShaderUtils]: makeShader() -> shaderSource(" + var2 + ", " + var0 + ")");
         GL20.glCompileShader(var2);
         String var3 = GL20.glGetShaderInfoLog(var2, 1000);
         if (GL20.glGetShaderi(var2, 35713) != 1) {
            System.err.println("Error compiling:\n" + var0);
            System.err.println(var3);
            GraphicsDisplay.Method997().Method1035("[ShaderUtils]: compileShaderError() -> \n" + var3);
            GraphicsDisplay.Field2665 = false;

            try {
               var0 = var3;
               String var7 = (new SimpleDateFormat("yyyy-MM-dd_hh:mm:ss")).format(new Date());
               String var8 = Signlink.Method11830() + "/errors/shaders/";
               var3 = var8 + "compilation_" + var7.replaceAll(":", "-") + ".txt";
               File var11 = new File(var3);
               File var9;
               if (!(var9 = new File(var8)).exists()) {
                  var9.mkdirs();
               }

               BufferedWriter var10;
               (var10 = new BufferedWriter(new FileWriter(var11))).write("Emps-World shader compilation failure: " + var7);
               var10.newLine();
               var10.newLine();
               var10.write("Execution Environment Details:");
               var10.newLine();
               var10.write(GraphicsDisplay.Method1001());
               var10.write(GraphicsDisplay.Method1002());
               var10.newLine();
               var10.newLine();
               var10.write("Shader Error:");
               var10.write(var0);
               var10.newLine();
               var10.write("END");
               var10.close();
            } catch (IOException var5) {
               var5.printStackTrace();
            }

            return 0;
         } else {
            GraphicsDisplay.Method997().Method1035("[ShaderUtils]: makeShader() -> compiledShader(" + var2 + ", " + var0 + ", " + var1 + ")");
            return var2;
         }
      } catch (Exception var6) {
         GraphicsDisplay.Field2665 = false;
         var6.printStackTrace();
         return 0;
      }
   }

   public static String Method7393(InputStream var0) {
      if (var0 == null) {
         return null;
      } else {
         StringBuilder var1 = new StringBuilder();

         try {
            BufferedReader var2 = new BufferedReader(new InputStreamReader(var0));

            String var3;
            while((var3 = var2.readLine()) != null) {
               var1.append(var3);
               var1.append('\n');
            }

            var0.close();
         } catch (IOException var4) {
            var4.printStackTrace();
         }

         return var1.toString();
      }
   }
}
