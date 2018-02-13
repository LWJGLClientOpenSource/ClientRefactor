package net.LWJGLClient.client.b.a;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JPanel;

import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.e.b.Class387;
import net.LWJGLClient.client.model.Client;

public class GameShell implements FocusListener, KeyListener, MouseListener, MouseMotionListener, MouseWheelListener, WindowListener, Runnable {
   private Graphics graphics;
   private boolean Field8775;
   private long Field8776;
   private static int Field8777 = 0;
   public boolean Field8778;
   private long Field8779;
   private int opos;
   private int ratio;
   private int del;
   private int count;
   private int Field8784;
   private long Field8785;
   public long Field8786;
   private int Field8787;
   private int Field8788;
   private int Field8789;
   public int Field8790;
   public int Field8791;
   public int Field8792;
   public boolean Field8793;
   private int gameState;
   private int delayTime;
   private int minDelay;
   private long[] otim;
   public int Field8798;
   private int Field8799;
   public int Field8800;
   public int Field8801;
   private boolean gameShellDumpRequested;
   public int myWidth;
   public int myHeight;
   public RSFrame gameFrame;
   private boolean shouldClearScreen;
   public boolean awtFocus;

   public int Field8808;

   public int mouseEventX;
   public int mouseEventY;
   private int eventMouseButtonPressed;
   private int eventClickX;
   private int eventClickY;
   public long eventTime;
   public int mouseButtonPressed;
   public int clickX;
   public int clickY;
   public int[] keyStatus;
   private int[] inputBuffer;
   private int readIndex;
   private int writeIndex;
/*
    final int readChar() {
        int k = -1;
        if (writeIndex != readIndex) {
            k = inputBuffer[readIndex];
            readIndex = readIndex + 1 & 0x7f;
        }
        return k;
    }
 */
   public final void Method11951(int var1, int var2, boolean var3) {
      this.myWidth = var1;
      this.myHeight = var2;
      this.Field8775 = false;
      Client.width = this.myWidth;
      Client.height = this.myHeight;
      this.run();
   }

   public final Graphics Method11952() {
      return this.graphics;
   }

   public final int Method11953() {
      if (GraphicsDisplay.Field2678) {
         return GraphicsDisplay.Method1038();
      } else {
         return this.gameFrame != null ? this.gameFrame.getWidth() : 500;
      }
   }

   public final int Method11954() {
      if (GraphicsDisplay.Field2678) {
         return GraphicsDisplay.Method1039();
      } else {
         return this.gameFrame != null ? this.gameFrame.getHeight() : 334;
      }
   }

   public static int Method11955() {
      return Field8777;
   }

   public final void Method11956(boolean var1, float var2) {
      ++this.Field8799;
      if (this.Field8778) {
         try {
            Thread.sleep(50L);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }

      this.mouseButtonPressed = this.eventMouseButtonPressed;
      this.clickX = (int)((double)this.eventClickX * Client.Field12138);
      this.clickY = (int)((double)this.eventClickY * Client.Field12138);
      this.eventMouseButtonPressed = 0;
      this.doLogic(true, var2);
      this.readIndex = this.writeIndex;
   }

   private void Method13202() {
      if (GraphicsDisplay.Field2678) {
         if (this.gameState > 0) {
            --this.gameState;
            if (this.gameState == 0) {
               this.destroy();
               return;
            }
         }

         if (System.currentTimeMillis() - this.Field8776 >= 1000L) {
            this.Field8801 = this.Field8800;
            this.Field8800 = Field8777;
            if (this.Field8801 <= 0) {
               this.Field8801 = 1;
            }

            if (this.Field8800 <= 0) {
               this.Field8800 = 1;
            }

            this.Field8776 = System.currentTimeMillis();
            Field8777 = 0;
            this.Field8798 = this.Field8799;
            this.Field8799 = 0;
         }

         ++Field8777;
         this.Method13364();
      } else {
         try {
            if (this.gameState > 0) {
               --this.gameState;
               if (this.gameState == 0) {
                  this.destroy();
                  return;
               }
            }

            this.delayTime = 20;
            this.minDelay = 5;
            int var1 = this.ratio;
            int var2 = this.del;
            this.ratio = 256;
            this.del = 1;
            long ntime = System.currentTimeMillis();
            if (this.otim[this.opos] == 0L) {
               this.ratio = var1;
               this.del = var2;
            } else if (ntime > this.otim[this.opos]) {
               this.ratio = (int)((long)(2560 * this.delayTime) / (ntime - this.otim[this.opos]));
            }

            if (this.ratio < 20) {
               this.ratio = 20;
            }

            if (this.ratio > 256) {
               this.ratio = 256;
               this.del = (int)((long)this.delayTime - (ntime - this.otim[this.opos]));
            }

            if (this.del > this.delayTime) {
               this.del = this.delayTime;
            }

            this.otim[this.opos] = ntime;
            this.opos = (this.opos + 1) % 10;
            if (this.del > 1) {
               for(var1 = 0; var1 < 10; ++var1) {
                  if (this.otim[var1] != 0L) {
                     this.otim[var1] += (long)this.del;
                  }
               }
            }

            if (this.del < this.minDelay) {
               this.del = this.minDelay;
            }

            try {
               Thread.sleep((long)this.del);
            } catch (InterruptedException var6) {
               ++this.Field8784;
            }

            if (System.currentTimeMillis() - this.Field8779 >= 15L) {
               for(this.Field8779 = System.currentTimeMillis(); this.count < 256; this.count += this.ratio) {
                  this.mouseButtonPressed = this.eventMouseButtonPressed;
                  this.clickX = (int)((double)this.eventClickX * Client.Field12138);
                  this.clickY = (int)((double)this.eventClickY * Client.Field12138);
                  this.eventMouseButtonPressed = 0;
                  this.doLogic(true, 1.0F);
                  this.readIndex = this.writeIndex;
               }
            }

            this.count &= 255;
            if (this.delayTime > 0) {
               this.Field8800 = 1000 * this.ratio / (this.delayTime << 8);
            }

            this.Method13364();
         } catch (Exception var7) {
            System.out.println("Game Error!");
            var7.printStackTrace();

            try {
               Thread.sleep(500L);
            } catch (Exception var5) {
               ;
            }
         }
      }
   }

   public void run() {
      if (GraphicsDisplay.Field2678) {
         GraphicsDisplay.Method997().Method1007((Client)this);
      }

      Client.Method13224(true);
      Client.Method13222();
      int var1;
      if (!GraphicsDisplay.Field2678) {
         new JPanel();
         if (!this.Field8775) {
            this.gameFrame = new RSFrame();
            this.graphics = this.gameFrame.getGraphics();
         }

         this.graphics = this.getGameComponent().getGraphics();
         this.getGameComponent().addMouseListener(this);
         this.getGameComponent().addMouseMotionListener(this);
         this.getGameComponent().addKeyListener(this);
         this.getGameComponent().addFocusListener(this);
         this.getGameComponent().addMouseWheelListener(this);
         this.getGameComponent().setFocusTraversalKeysEnabled(false);
         var1 = 0;

         while(var1++ < 10) {
            try {
               if (this.Method13351()) {
                  break;
               }
            } catch (Exception var4) {
               var4.printStackTrace();
            }
         }
      }

      for(var1 = 0; var1 < 10; ++var1) {
         this.otim[var1] = System.currentTimeMillis();
      }

      while(true) {
         while(true) {
            try {
               this.Method13202();
            } catch (Exception var3) {
               var3.printStackTrace();
            }
         }
      }
   }

   private void destroy() {
      this.gameState = -2;
      if (this.gameFrame != null) {
         try {
            System.exit(-1);
         } catch (Throwable var1) {
            ;
         }
      } else {
         this.Method13317();
         System.exit(0);
      }
   }

   public void mousePressed(MouseEvent var1) {
      int var2 = var1.getX() - 4;
      int var3 = var1.getY() - 26;
      this.Field8787 = var1.getButton();
      boolean var4 = var1.isMetaDown();
      this.Method11959(var2, var3, this.Field8787, var4);
   }

   public final void Method11959(int var1, int var2, int var3, boolean var4) {
      this.Field8787 = var3;
      if (this.Field8787 == 2) {
         this.Field8788 = var1;
         this.Field8789 = var2;
      } else {
         this.eventClickX = var1;
         this.eventClickY = var2;
         this.eventTime = System.currentTimeMillis();
         if (var4) {
            this.eventMouseButtonPressed = 2;
            this.Field8808 = 2;
         } else {
            this.eventMouseButtonPressed = 1;
            this.Field8808 = 1;
         }

         this.Field8788 = var1;
         this.Field8789 = var2;
      }
   }

   public void mouseReleased(MouseEvent var1) {
      this.Field8808 = 0;
   }

   public void mouseClicked(MouseEvent var1) {
   }

   public void mouseEntered(MouseEvent var1) {
   }

   public void mouseExited(MouseEvent var1) {
      this.mouseEventX = -1;
      this.mouseEventY = -1;
   }

   public void mouseDragged(MouseEvent var1) {
      Client var2 = (Client)this;
      int var3 = var1.getX();
      int var7 = var1.getY();
      int var4;
      int var5;
      if (this.Field8787 == 2) {
         int var8 = this.Field8788 - var3;
         var4 = this.Field8789 - var7;
         var5 = var8 < 0 ? -var8 : var8;
         int var6 = var4 < 0 ? -var4 : var4;
         if (var4 > 0) {
            this.Method11962(40, 0, var6);
         } else if (var4 < 0) {
            this.Method11962(38, 0, var6);
         }

         if (var8 > 0) {
            this.Method11962(39, 0, var5);
         } else if (var8 < 0) {
            this.Method11962(37, 0, var5);
         }

         this.Field8788 = var3;
         this.Field8789 = var7;
      } else {
         if (System.currentTimeMillis() - this.Field8786 > 500L) {
            if (var2.openInterfaceID != -1) {
               if (System.currentTimeMillis() - this.Field8785 < 250L || var3 - 5 >= var2.Field12282 && var3 <= 505 + var2.Field12282 && var7 - 5 >= var2.Field12283 && var7 <= 45 + var2.Field12283) {
                  int var10000 = var2.Field12282;
                  var10000 = var2.Field12283;
                  this.Field8785 = System.currentTimeMillis();
                  var4 = var3 - this.mouseEventX;
                  var5 = var7 - this.mouseEventY;
                  var2.Field12282 += var4;
                  var2.Field12283 += var5;
               }
            } else {
               boolean var9 = var2.Field12147;
            }
         }

         this.mouseEventX = (int)((double)var3 * Client.Field12138) - 4;
         this.mouseEventY = (int)((double)var7 + Client.Field12138) - 26;
      }
   }

   public final void Method11960(int var1, int var2) {
      if (GraphicsDisplay.Field2678) {
         this.mouseEventX = (int)((double)var1 * Client.Field12138);
         this.mouseEventY = (int)((double)var2 * Client.Field12138);
      } else {
         this.mouseEventX = (int)((double)var1 * Client.Field12138) - 4;
         this.mouseEventY = (int)((double)var2 * Client.Field12138) - 26;
      }
   }

   public void mouseMoved(MouseEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      this.Method11960(var2, var3);
   }

   public void mouseWheelMoved(MouseWheelEvent var1) {
      int var2;
      if ((var2 = var1.getWheelRotation()) > 0) {
         var2 = 32;
      } else if (var2 < 0) {
         var2 = -32;
      }

      if (var2 != 0) {
         this.Field8791 += var2;
      }

   }

   public void keyPressed(KeyEvent var1) {
      int var10001 = var1.getKeyCode();
      char var3 = var1.getKeyChar();
      int var2 = var10001;
      this.Method11962(var2, var3, 0);
   }

   public final void Method11961(int var1, int var2) {
      this.Method11962(var1, var2, 0);
   }

   public final void Method11962(int var1, int var2, int var3) {
      Client var4 = (Client)this;
      int var5 = var2;
      if (Class387.Method6713(var1)) {
         Class387.Method6712();
         if (var2 < 30) {
            var2 = 0;
         }

         if (var1 == 37) {
            var2 = 1;
         }

         if (var1 == 39) {
            var2 = 2;
         }

         if (var1 == 38) {
            var2 = 3;
         }

         if (var1 == 40) {
            var2 = 4;
         }

         if (var1 == 17) {
            var2 = 5;
         }

         if (var1 == 8) {
            var2 = 8;
         }

         if (var1 == 127) {
            var2 = 8;
         }

         if (var1 == 9) {
            var2 = 9;
         }

         if (var1 == 10) {
            var2 = 10;
         }

         if (var1 >= 112 && var1 <= 123) {
            var2 = var1 + 1008 - 112;
         }

         if (var1 == 36) {
            var2 = 1000;
         }

         if (var1 == 35) {
            var2 = 1001;
         }

         if (var1 == 33) {
            var2 = 1002;
         }

         if (var1 == 34) {
            var2 = 1003;
         }

         if (var1 == 5) {
            this.keyStatus[5] = 1;
         }

         if (var2 > 0 && var2 < 128) {
            if (var5 == 0) {
               if (var3 < 0) {
                  var3 = -var3;
               }

               if (var3 < 4) {
                  var3 = 4;
               }

               if (Rasterizer.Field9949) {
                  var3 /= 2;
               }

               var5 = Client.class329 == null ? 64 : 128;
               if (var2 != 1 && var2 != 2) {
                  if (var2 == 3 || var2 == 4) {
                     this.keyStatus[var2] += var3;
                     if (this.keyStatus[var2] >= var5) {
                        this.keyStatus[var2] = var5;
                     }
                  }
               } else {
                  this.keyStatus[var2] += var3;
                  if (this.keyStatus[var2] >= 128) {
                     this.keyStatus[var2] = 128;
                  }
               }

               this.Field8793 = true;
            } else {
               var3 = Client.class329 == null ? 12 : 24;
               if (var2 != 1 && var2 != 2) {
                  if (var2 != 3 && var2 != 4) {
                     this.keyStatus[var2] = 1;
                  } else {
                     this.keyStatus[var2] = var3;
                  }
               } else {
                  this.keyStatus[var2] = 24;
               }
            }
         }

         if (var2 > 4) {
            this.inputBuffer[this.writeIndex] = var2;
            this.writeIndex = this.writeIndex + 1 & 127;
         }

         boolean var6 = false;
         if (var1 == 112) {
            var4.Field12646 = 3;
            var6 = true;
         } else if (var1 == 113) {
            var4.Field12646 = 4;
            var6 = true;
         } else if (var1 == 114) {
            var4.Field12646 = 5;
            var6 = true;
         } else if (var1 == 115) {
            var4.Field12646 = 6;
            var6 = true;
         } else if (var1 == 116) {
            var4.Field12646 = 0;
            var6 = true;
         } else if (var1 == 27) {
            var4.Field12646 = 10;
            var6 = true;
         } else if (var1 == 33) {
            //var4.d_91 = -30;
         } else if (var1 == 34) {
            //var4.d_91 = 30;
         } else if ((var1 == 17 || var1 == 9) && var4.Field12150 != null) {
            var3 = -1;

            for(var5 = 0; var5 < var4.Field12370; ++var5) {
               if (var4.Players[var5].equals(var4.Field12150)) {
                  var3 = var5;
                  break;
               }
            }

            if (var3 >= 0) {
               Client.Field12649 = true;
               var4.Field12650 = 0;
               var4.Field12676 = true;
               var4.Field12639 = "";
               var4.Field12521 = 3;
               var4.Field12435 = var4.Field12437[var3];
               var4.Field12564 = var4.Players[var3];
            } else {
               Client.Field12649 = true;
               var4.Field12650 = 0;
               var4.Field12676 = true;
               var4.Field12639 = "";
               var4.Field12521 = 3;
               var4.Field12435 = Client.Method13217(var4.Field12150);
               var4.Field12564 = var4.Field12150;
            }
         }

         if (var6) {
            if (var4.Field12647 == var4.Field12646) {
               var4.Field12646 = 14;
            }

            var4.Field12647 = var4.Field12646;
            var4.Field12590 = true;
            var4.Field12560 = true;
         }

      }
   }

   public final void Method11963(int var1, char var2) {
      if (var1 == 5) {
         this.keyStatus[5] = 0;
      }

      if (var2 < 30) {
         var2 = 0;
      }

      if (var1 == 37) {
         var2 = 1;
      }

      if (var1 == 39) {
         var2 = 2;
      }

      if (var1 == 38) {
         var2 = 3;
      }

      if (var1 == 40) {
         var2 = 4;
      }

      if (var1 == 17) {
         var2 = 5;
      }

      if (var1 == 8) {
         var2 = '\b';
      }

      if (var1 == 127) {
         var2 = '\b';
      }

      if (var1 == 9) {
         var2 = '\t';
      }

      if (var1 == 10) {
         var2 = '\n';
      }

      if (var2 > 0 && var2 < 128) {
         this.keyStatus[var2] = 0;
      }

   }

   public void keyReleased(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      char var3 = var1.getKeyChar();
      this.Method11963(var2, var3);
   }

   public void keyTyped(KeyEvent var1) {
   }

   public final int readChar() {
      int var1 = -1;
      if (this.writeIndex != this.readIndex) {
         var1 = this.inputBuffer[this.readIndex];
         this.readIndex = this.readIndex + 1 & 127;
      }

      return var1;
   }

   public void focusGained(FocusEvent var1) {
      this.awtFocus = true;
      this.shouldClearScreen = true;
      this.repaintGame();
   }

   public void focusLost(FocusEvent var1) {
      this.awtFocus = false;

      for(int var2 = 0; var2 < 128; ++var2) {
         this.keyStatus[var2] = 0;
      }

   }

   public void windowActivated(WindowEvent var1) {
   }

   public void windowClosed(WindowEvent var1) {
   }

   public void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public void windowDeactivated(WindowEvent var1) {
   }

   public void windowDeiconified(WindowEvent var1) {
   }

   public void windowIconified(WindowEvent var1) {
   }

   public void windowOpened(WindowEvent var1) {
   }

   public boolean Method13351() {
      return false;
   }

   public void doLogic(boolean var1, float var2) {
   }

   public void Method13317() {
   }

   public void Method13364() {
   }

   public void repaintGame() {
   }

   public final Component getGameComponent() {
      return (Component)(this.gameFrame != null ? this.gameFrame : Signlink.Field2957);
   }

   public static void Method11971(Runnable var0) {
      (new Thread(var0)).start();
   }

   public void drawLoadingText(int var1, String var2) {
      if (GraphicsDisplay.Field2678) {
         ((Client)this).drawLoadingText(var1, var2);
      } else if (this.graphics != null) {
         Client var3;
         int var4 = (var3 = (Client)this).Method13236();
         int var9 = var3.Method13237();
         Font var5 = new Font("Helvetica", 1, 13);
         FontMetrics var6 = this.getGameComponent().getFontMetrics(var5);
         Font var7 = new Font("Helvetica", 0, 13);
         this.getGameComponent().getFontMetrics(var7);
         if (this.shouldClearScreen) {
            this.graphics.setColor(Color.black);
            this.graphics.fillRect(0, 0, var4, var9);
            this.shouldClearScreen = false;
         }

         Color var10 = new Color(6684672);
         Color var8 = new Color(14540253);
         var9 = var9 / 2 - 18;
         this.graphics.setColor(var10);
         this.graphics.drawRect(var4 / 2 - 152, var9, 304, 34);
         this.graphics.fillRect(var4 / 2 - 150, var9 + 2, var1 * 3, 30);
         this.graphics.setColor(Color.black);
         this.graphics.fillRect(var4 / 2 - 150 + var1 * 3, var9 + 2, 300 - var1 * 3, 30);
         this.graphics.setFont(var5);
         this.graphics.setColor(var8);
         this.graphics.drawString(var2, (var4 - var6.stringWidth(var2)) / 2, var9 + 22);
      }
   }

   public GameShell() {
      Runtime.getRuntime().availableProcessors();
      this.Field8775 = false;
      this.Field8776 = 0L;
      System.nanoTime();
      this.Field8778 = false;
      this.Field8779 = System.currentTimeMillis();
      this.opos = 0;
      this.ratio = 256;
      this.del = 1;
      this.count = 0;
      this.Field8784 = 0;
      this.Field8785 = 0L;
      this.Field8786 = 0L;
      this.Field8787 = 0;
      this.Field8788 = 0;
      this.Field8789 = 0;
      this.Field8790 = 0;
      this.Field8791 = 0;
      this.Field8792 = 0;
      this.Field8793 = false;
      this.Field8798 = 1;
      this.Field8799 = 0;
      this.Field8800 = 1;
      this.Field8801 = 1;
      this.delayTime = 20;
      this.minDelay = 5;
      this.otim = new long[10];
      this.gameShellDumpRequested = false;
      this.shouldClearScreen = true;
      this.awtFocus = true;
      this.keyStatus = new int[128];
      this.inputBuffer = new int[128];
   }

   public final void Method11973() {
      this.eventClickX = -1;
      this.eventClickY = -1;
   }
}
