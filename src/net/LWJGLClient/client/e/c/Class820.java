package net.LWJGLClient.client.e.c;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import net.LWJGLClient.client.Signlink;

public final class Class820 extends JFrame implements ActionListener {
   private final JFileChooser Field3065;
   private static File Field3066 = null;
   private String Field3067;

   public final void Method13683() {
      Field3066 = this.Field3065.getCurrentDirectory();
   }

   private String Method13684() {
      return Signlink.cacheDirectory() + this.Field3067 + ".dat";
   }

   public Class820(String var1) {
      this.Field3067 = var1;
      Class820 var14 = this;
      RandomAccessFile var2 = null;
      boolean var8 = false;

      label84: {
         label83: {
            try {
               var8 = true;
               byte[] var15 = new byte[(var2 = new RandomAccessFile(var14.Method13684(), "rw")).readInt()];
               var2.read(var15);
               Field3066 = new File(new String(var15));
               var2.close();
               var8 = false;
               break label83;
            } catch (IOException var12) {
               var12.printStackTrace();
               var8 = false;
            } finally {
               if (var8) {
                  try {
                     if (var2 != null) {
                        var2.close();
                     }
                  } catch (IOException var9) {
                     var9.printStackTrace();
                  }

               }
            }

            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (IOException var11) {
               var11.printStackTrace();
            }
            break label84;
         }

         try {
            var2.close();
         } catch (IOException var10) {
            var10.printStackTrace();
         }
      }

      this.Field3065 = new JFileChooser();
      this.Field3065.setDialogTitle("Pick file(s)");
      this.Field3065.setMultiSelectionEnabled(true);
      this.Field3065.setFileSelectionMode(0);
      if (Field3066 != null) {
         this.Field3065.setCurrentDirectory(Field3066);
      }

   }

   public final String[] Method13685() {
      if (this.Field3065.showOpenDialog((Component)null) != 0) {
         return null;
      } else {
         File[] var1;
         String[] var2 = new String[(var1 = this.Field3065.getSelectedFiles()).length];
         int var3 = 0;
         File[] var6 = var1;
         int var5 = var1.length;

         for(int var4 = 0; var4 < var5; ++var4) {
            File var18 = var6[var4];
            var2[var3++] = var18.getAbsolutePath();
         }

         Class820 var19 = this;
         Field3066 = this.Field3065.getCurrentDirectory();
         RandomAccessFile var21 = null;
         boolean var12 = false;

         label118: {
            try {
               var12 = true;
               var21 = new RandomAccessFile(var19.Method13684(), "rw");
               if (Field3066 != null) {
                  String var20 = Field3066.getAbsolutePath();
                  var21.writeInt(var20.length());
                  var21.write(var20.getBytes());
                  var12 = false;
               } else {
                  var12 = false;
               }
               break label118;
            } catch (IOException var16) {
               var16.printStackTrace();
               var12 = false;
            } finally {
               if (var12) {
                  try {
                     if (var21 != null) {
                        var21.close();
                     }
                  } catch (IOException var13) {
                     var13.printStackTrace();
                  }

               }
            }

            try {
               if (var21 != null) {
                  var21.close();
                  return var2;
               }
            } catch (IOException var15) {
               var15.printStackTrace();
            }

            return var2;
         }

         try {
            var21.close();
         } catch (IOException var14) {
            var14.printStackTrace();
         }

         return var2;
      }
   }

   public final void actionPerformed(ActionEvent var1) {
      System.out.println("action");
   }
}
