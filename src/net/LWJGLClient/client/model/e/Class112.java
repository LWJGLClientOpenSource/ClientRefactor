package net.LWJGLClient.client.model.e;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.FloatControl.Type;

public final class Class112 {
   private Class109 Field9932;
   private float Field9933 = 1.0F;
   private byte[] Field9934 = null;

   public Class112(float var1, byte[] var2) {
      this.Field9932 = Class109.Field9906;
      this.Field9933 = var1;
      this.Field9934 = var2;
   }

   public final void Method902() {
      ByteArrayInputStream var1 = new ByteArrayInputStream(this.Field9934);

      AudioInputStream var20;
      try {
         var20 = AudioSystem.getAudioInputStream(var1);
      } catch (UnsupportedAudioFileException var16) {
         var16.printStackTrace();
         return;
      } catch (IOException var17) {
         var17.printStackTrace();
         return;
      }

      AudioFormat var2 = var20.getFormat();
      Info var3 = new Info(SourceDataLine.class, var2);

      SourceDataLine var23;
      try {
         (var23 = (SourceDataLine)AudioSystem.getLine(var3)).open(var2);
      } catch (LineUnavailableException var14) {
         var14.printStackTrace();
         return;
      } catch (Exception var15) {
         var15.printStackTrace();
         return;
      }

      FloatControl var21;
      float var4 = (var21 = (FloatControl)var23.getControl(Type.MASTER_GAIN)).getMaximum();
      float var5 = var21.getMinimum();
      float var6 = var4;
      float var7 = var5;
      if (var4 < 0.0F) {
         var6 = -var4;
      }

      if (var5 < 0.0F) {
         var7 = -var5;
      }

      var5 = (var5 = var6 + var7) - var5 * this.Field9933;
      var4 -= var5;
      var21.setValue(var4);
      if (var23.isControlSupported(Type.PAN)) {
         var21 = (FloatControl)var23.getControl(Type.PAN);
         if (this.Field9932 == Class109.Field9905) {
            var21.setValue(0.5F);
         } else if (this.Field9932 == Class109.Field9904) {
            var21.setValue(-0.5F);
         }
      }

      var23.start();
      int var22 = 0;

      label118: {
         try {
            while(true) {
               if (var22 == -1) {
                  break label118;
               }

               if ((var22 = var20.read(this.Field9934, 0, this.Field9934.length)) >= 0) {
                  var23.write(this.Field9934, 0, var22);
               }
            }
         } catch (IOException var18) {
            var18.printStackTrace();
         } finally {
            var23.drain();
            var23.close();
         }

         return;
      }

      this.Field9934 = null;
   }
}
