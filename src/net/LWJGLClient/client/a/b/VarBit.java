package net.LWJGLClient.client.a.b;

import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Client;
import org.lwjgl.opengl.GL11;

public class VarBit {
   public static VarBit[] Field12723;
   public int Field12724;
   public int Field12725;
   public int Field12726;
   private boolean Field12727 = false;

   public static void Method1736(JagexArchive var0) {
      Packet var6;
      int var1 = (var6 = new Packet(var0.readConfig("varbit.dat"))).g2();
      if (Field12723 == null) {
         Field12723 = new VarBit[var1];
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         if (Field12723[var2] == null) {
            Field12723[var2] = new VarBit();
         }

         VarBit var10000 = Field12723[var2];
         Packet var4 = var6;
         VarBit var3 = var10000;
         int var5;
         if (Client.normalMem) {
            while((var5 = var4.g1()) != 0) {
               if (var5 == 1) {
                  var3.Field12724 = var4.g2();
                  var3.Field12725 = var4.g1();
                  var3.Field12726 = var4.g1();
               } else if (var5 == 10) {
                  var4.Method406();
               } else if (var5 == 2) {
                  var3.Field12727 = true;
               } else if (var5 == 3) {
                  var4.Method404();
               } else if (var5 == 4) {
                  var4.Method404();
               } else {
                  System.out.println("Error unrecognised config code: " + var5);
               }
            }
         } else {
            var3.Field12724 = var6.g2();
            var3.Field12725 = var6.g1();
            var3.Field12726 = var6.g1();
         }
      }

      if (var6.pos != var6.Field1259.length) {
         System.out.println("varbit load mismatch");
      }

   }

   private static void Method1737(Client var0) {
      float var1 = GraphicsDisplay.Method1040();
      int var2 = Math.round((float)var0.Method13236() * var1);
      int var3 = Math.round((float)var0.Method13237() * var1);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)var0.Method13236(), 0.0D, (double)var0.Method13237(), 1000.0D, -1000.0D);
      GL11.glViewport(0, 0, var2, var3);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glDisable(3553);
      GL11.glDisable(2929);
   }

   public static void Method1738(int var0, int var1, int var2, int var3, int var4, Client var5) {
      Method1737(var5);
      var1 = var5.Method13237() - var1;
      Method1740(var4, 256);
      GL11.glBegin(7);
     GL11.glVertex2f((float)var0, (float)var1);
     GL11.glVertex2f((float)var0, (float)(var1 - var3));
     GL11.glVertex2f((float)(var0 + var2), (float)(var1 - var3));
     GL11.glVertex2f((float)(var0 + var2), (float)var1);
      GL11.glEnd();
   }

   public static void Method1739(String var0, int var1, int var2, int var3, Client var4) {
      Method1737(var4);
      int var5 = var1;
      var2 = var4.Method13237() - var2;
      Method1740(var3, 256);
      GL11.glBegin(0);
      char[] var6;
      int var9 = (var6 = var0.toLowerCase().toCharArray()).length;

      for(var3 = 0; var3 < var9; ++var3) {
         char var7;
         int var8;
         if ((var7 = var6[var3]) == 'a') {
            for(var8 = 0; var8 < 8; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + var8));
            }

            for(var8 = 2; var8 <= 6; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 4));
            }

            var1 += 8;
         } else if (var7 == 'b') {
            for(var8 = 0; var8 < 8; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
            }

            for(var8 = 1; var8 <= 6; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)var2);
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 4));
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
            }

           GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 5));
           GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 7));
           GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 6));
           GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 1));
           GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 2));
           GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 3));
            var1 += 8;
         } else if (var7 == 'c') {
            for(var8 = 1; var8 <= 7; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
            }

            for(var8 = 2; var8 <= 5; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)var2);
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
            }

           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 1));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 2));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 6));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 7));
            var1 += 8;
         } else if (var7 == 'd') {
            for(var8 = 0; var8 <= 8; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
            }

            for(var8 = 2; var8 <= 5; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)var2);
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
            }

           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 1));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 2));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 3));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 4));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 5));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 6));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 7));
            var1 += 8;
         } else if (var7 == 'e') {
            for(var8 = 0; var8 <= 8; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
            }

            for(var8 = 1; var8 <= 6; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)var2);
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
            }

            for(var8 = 2; var8 <= 5; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 4));
            }

            var1 += 8;
         } else if (var7 == 'f') {
            for(var8 = 0; var8 <= 8; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
            }

            for(var8 = 1; var8 <= 6; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
            }

            for(var8 = 2; var8 <= 5; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 4));
            }

            var1 += 8;
         } else if (var7 == 'g') {
            for(var8 = 1; var8 <= 7; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
            }

            for(var8 = 2; var8 <= 5; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)var2);
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
            }

           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 1));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 2));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 3));
           GL11.glVertex2f((float)(var1 + 5), (float)(var2 + 3));
           GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 3));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 6));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 7));
            var1 += 8;
         } else if (var7 == 'h') {
            for(var8 = 0; var8 <= 8; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + var8));
            }

            for(var8 = 2; var8 <= 6; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 4));
            }

            var1 += 8;
         } else if (var7 == 'i') {
            for(var8 = 0; var8 <= 8; ++var8) {
              GL11.glVertex2f((float)(var1 + 3), (float)(var2 + var8));
            }

            for(var8 = 1; var8 <= 5; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)var2);
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
            }

            var1 += 7;
         } else if (var7 == 'j') {
            for(var8 = 1; var8 <= 8; ++var8) {
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + var8));
            }

            for(var8 = 2; var8 <= 5; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)var2);
            }

           GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 3));
           GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 2));
           GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 1));
            var1 += 8;
         } else if (var7 == 'k') {
            for(var8 = 0; var8 <= 8; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
            }

           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 8));
           GL11.glVertex2f((float)(var1 + 5), (float)(var2 + 7));
           GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 6));
           GL11.glVertex2f((float)(var1 + 3), (float)(var2 + 5));
           GL11.glVertex2f((float)(var1 + 2), (float)(var2 + 4));
           GL11.glVertex2f((float)(var1 + 2), (float)(var2 + 3));
           GL11.glVertex2f((float)(var1 + 3), (float)(var2 + 4));
           GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 3));
           GL11.glVertex2f((float)(var1 + 5), (float)(var2 + 2));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 1));
           GL11.glVertex2f((float)(var1 + 7), (float)var2);
            var1 += 8;
         } else if (var7 == 'l') {
            for(var8 = 0; var8 <= 8; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
            }

            for(var8 = 1; var8 <= 6; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)var2);
            }

            var1 += 7;
         } else if (var7 == 'm') {
            for(var8 = 0; var8 <= 8; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + var8));
            }

           GL11.glVertex2f((float)(var1 + 3), (float)(var2 + 6));
           GL11.glVertex2f((float)(var1 + 2), (float)(var2 + 7));
           GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 5));
           GL11.glVertex2f((float)(var1 + 5), (float)(var2 + 6));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 7));
           GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 5));
            var1 += 8;
         } else if (var7 == 'n') {
            for(var8 = 0; var8 <= 8; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + var8));
            }

           GL11.glVertex2f((float)(var1 + 2), (float)(var2 + 7));
           GL11.glVertex2f((float)(var1 + 2), (float)(var2 + 6));
           GL11.glVertex2f((float)(var1 + 3), (float)(var2 + 5));
           GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 4));
           GL11.glVertex2f((float)(var1 + 5), (float)(var2 + 3));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 2));
           GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 1));
            var1 += 8;
         } else if (var7 != 'o' && var7 != '0') {
            if (var7 == 'p') {
               for(var8 = 0; var8 <= 8; ++var8) {
                 GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
               }

               for(var8 = 2; var8 <= 5; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 4));
               }

              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 7));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 5));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 6));
               var1 += 8;
            } else if (var7 == 'q') {
               for(var8 = 1; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
                  if (var8 != 1) {
                    GL11.glVertex2f((float)(var1 + 7), (float)(var2 + var8));
                  }
               }

               for(var8 = 2; var8 <= 6; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
                  if (var8 != 6) {
                    GL11.glVertex2f((float)(var1 + var8), (float)var2);
                  }
               }

              GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 3));
              GL11.glVertex2f((float)(var1 + 5), (float)(var2 + 2));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 1));
              GL11.glVertex2f((float)(var1 + 7), (float)var2);
               var1 += 8;
            } else if (var7 == 'r') {
               for(var8 = 0; var8 <= 8; ++var8) {
                 GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
               }

               for(var8 = 2; var8 <= 5; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 4));
               }

              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 7));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 5));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 6));
              GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 3));
              GL11.glVertex2f((float)(var1 + 5), (float)(var2 + 2));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 1));
              GL11.glVertex2f((float)(var1 + 7), (float)var2);
               var1 += 8;
            } else if (var7 == 's') {
               for(var8 = 2; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
               }

              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 7));
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 6));
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 5));

               for(var8 = 2; var8 <= 6; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 4));
                 GL11.glVertex2f((float)(var1 + var8), (float)var2);
               }

              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 3));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 2));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 1));
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 1));
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 2));
               var1 += 8;
            } else if (var7 == 't') {
               for(var8 = 0; var8 <= 8; ++var8) {
                 GL11.glVertex2f((float)(var1 + 4), (float)(var2 + var8));
               }

               for(var8 = 1; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
               }

               var1 += 7;
            } else if (var7 == 'u') {
               for(var8 = 1; var8 <= 8; ++var8) {
                 GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
                 GL11.glVertex2f((float)(var1 + 7), (float)(var2 + var8));
               }

               for(var8 = 2; var8 <= 6; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)var2);
               }

               var1 += 8;
            } else if (var7 == 'v') {
               for(var8 = 2; var8 <= 8; ++var8) {
                 GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
                 GL11.glVertex2f((float)(var1 + 6), (float)(var2 + var8));
               }

              GL11.glVertex2f((float)(var1 + 2), (float)(var2 + 1));
              GL11.glVertex2f((float)(var1 + 5), (float)(var2 + 1));
              GL11.glVertex2f((float)(var1 + 3), (float)var2);
              GL11.glVertex2f((float)(var1 + 4), (float)var2);
               var1 += 7;
            } else if (var7 == 'w') {
               for(var8 = 1; var8 <= 8; ++var8) {
                 GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
                 GL11.glVertex2f((float)(var1 + 7), (float)(var2 + var8));
               }

              GL11.glVertex2f((float)(var1 + 2), (float)var2);
              GL11.glVertex2f((float)(var1 + 3), (float)var2);
              GL11.glVertex2f((float)(var1 + 5), (float)var2);
              GL11.glVertex2f((float)(var1 + 6), (float)var2);

               for(var8 = 1; var8 <= 6; ++var8) {
                 GL11.glVertex2f((float)(var1 + 4), (float)(var2 + var8));
               }

               var1 += 8;
            } else if (var7 == 'x') {
               for(var8 = 1; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + var8));
               }

               for(var8 = 7; var8 > 0; --var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8 - var8));
               }

               var1 += 8;
            } else if (var7 == 'y') {
              GL11.glVertex2f((float)(var1 + 4), (float)var2);
              GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 1));
              GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 2));
              GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 3));
              GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 4));
              GL11.glVertex2f((float)(var1 + 3), (float)(var2 + 5));
              GL11.glVertex2f((float)(var1 + 2), (float)(var2 + 6));
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 7));
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 8));
              GL11.glVertex2f((float)(var1 + 5), (float)(var2 + 5));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 6));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 7));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 8));
               var1 += 8;
            } else if (var7 == 'z') {
               for(var8 = 1; var8 <= 6; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)var2);
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + var8));
               }

              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 7));
               var1 += 8;
            } else if (var7 == '1') {
               for(var8 = 2; var8 <= 6; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)var2);
               }

               for(var8 = 1; var8 <= 8; ++var8) {
                 GL11.glVertex2f((float)(var1 + 4), (float)(var2 + var8));
               }

              GL11.glVertex2f((float)(var1 + 3), (float)(var2 + 7));
               var1 += 8;
            } else if (var7 == '2') {
               for(var8 = 1; var8 <= 6; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)var2);
               }

               for(var8 = 2; var8 <= 5; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
               }

              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 7));
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 6));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 7));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 6));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 5));
              GL11.glVertex2f((float)(var1 + 5), (float)(var2 + 4));
              GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 3));
              GL11.glVertex2f((float)(var1 + 3), (float)(var2 + 2));
              GL11.glVertex2f((float)(var1 + 2), (float)(var2 + 1));
               var1 += 8;
            } else if (var7 == '3') {
               for(var8 = 1; var8 <= 5; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
                 GL11.glVertex2f((float)(var1 + var8), (float)var2);
               }

               for(var8 = 1; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + 6), (float)(var2 + var8));
               }

               for(var8 = 2; var8 <= 5; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 4));
               }

               var1 += 8;
            } else if (var7 == '4') {
               for(var8 = 2; var8 <= 8; ++var8) {
                 GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
               }

               for(var8 = 2; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 1));
               }

               for(var8 = 0; var8 <= 4; ++var8) {
                 GL11.glVertex2f((float)(var1 + 4), (float)(var2 + var8));
               }

               var1 += 8;
            } else if (var7 == '5') {
               for(var8 = 1; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
               }

               for(var8 = 4; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
               }

              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 1));
              GL11.glVertex2f((float)(var1 + 2), (float)var2);
              GL11.glVertex2f((float)(var1 + 3), (float)var2);
              GL11.glVertex2f((float)(var1 + 4), (float)var2);
              GL11.glVertex2f((float)(var1 + 5), (float)var2);
              GL11.glVertex2f((float)(var1 + 6), (float)var2);
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 1));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 2));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 3));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 4));
              GL11.glVertex2f((float)(var1 + 5), (float)(var2 + 4));
              GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 4));
              GL11.glVertex2f((float)(var1 + 3), (float)(var2 + 4));
              GL11.glVertex2f((float)(var1 + 2), (float)(var2 + 4));
               var1 += 8;
            } else if (var7 == '6') {
               for(var8 = 1; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
               }

               for(var8 = 2; var8 <= 6; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)var2);
               }

               for(var8 = 2; var8 <= 5; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 4));
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
               }

              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 1));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 2));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 3));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 4));
               var1 += 8;
            } else if (var7 == '7') {
               for(var8 = 0; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
               }

              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 7));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + 6));
              GL11.glVertex2f((float)(var1 + 6), (float)(var2 + 5));
              GL11.glVertex2f((float)(var1 + 5), (float)(var2 + 4));
              GL11.glVertex2f((float)(var1 + 4), (float)(var2 + 3));
              GL11.glVertex2f((float)(var1 + 3), (float)(var2 + 2));
              GL11.glVertex2f((float)(var1 + 2), (float)(var2 + 1));
              GL11.glVertex2f((float)(var1 + 1), (float)var2);
               var1 += 8;
            } else if (var7 == '8') {
               for(var8 = 1; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
                 GL11.glVertex2f((float)(var1 + 7), (float)(var2 + var8));
               }

               for(var8 = 2; var8 <= 6; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
                 GL11.glVertex2f((float)(var1 + var8), (float)var2);
               }

               for(var8 = 2; var8 <= 6; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 4));
               }

               var1 += 8;
            } else if (var7 != '9') {
               if (var7 == '.') {
                 GL11.glVertex2f((float)(var1 + 1), (float)var2);
                  var1 += 2;
               } else if (var7 == ',') {
                 GL11.glVertex2f((float)(var1 + 1), (float)var2);
                 GL11.glVertex2f((float)(var1 + 1), (float)(var2 + 1));
                  var1 += 2;
               } else if (var7 == '\n') {
                  var2 -= 10;
                  var1 = var5;
               } else if (var7 == ' ') {
                  var1 += 8;
               }
            } else {
               for(var8 = 1; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + 7), (float)(var2 + var8));
               }

               for(var8 = 5; var8 <= 7; ++var8) {
                 GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
               }

               for(var8 = 2; var8 <= 6; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
                 GL11.glVertex2f((float)(var1 + var8), (float)var2);
               }

               for(var8 = 2; var8 <= 6; ++var8) {
                 GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 4));
               }

              GL11.glVertex2f((float)(var1 + 1), (float)var2);
               var1 += 8;
            }
         } else {
            for(var8 = 1; var8 <= 7; ++var8) {
              GL11.glVertex2f((float)(var1 + 1), (float)(var2 + var8));
              GL11.glVertex2f((float)(var1 + 7), (float)(var2 + var8));
            }

            for(var8 = 2; var8 <= 6; ++var8) {
              GL11.glVertex2f((float)(var1 + var8), (float)(var2 + 8));
              GL11.glVertex2f((float)(var1 + var8), (float)var2);
            }

            var1 += 8;
         }
      }

      GL11.glEnd();
   }

   private static void Method1740(int var0, int var1) {
      float var4 = (float)(var0 >> 16 & 255);
      float var2 = (float)(var0 >> 8 & 255);
      float var3 = (float)(var0 & 255);
      GL11.glColor4f(var4 / 256.0F, var2 / 256.0F, var3 / 256.0F, 1.0F);
   }
}


