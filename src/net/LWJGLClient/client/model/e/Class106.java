package net.LWJGLClient.client.model.e;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.concurrent.Callable;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.Line.Info;

final class Class106 implements Callable {
   // $FF: synthetic field
   private final InputStream Field9903;

   Class106(Class323 var1, InputStream var2) {
      this.Field9903 = var2;
   }

   private Clip Method866() {
      Info var1 = new Info(Clip.class);

      try {
         Clip var7 = (Clip)AudioSystem.getLine(var1);
         AudioInputStream var2 = AudioSystem.getAudioInputStream(this.Field9903);
         var7.open(var2);
         return var7;
      } catch (MalformedURLException var3) {
         var3.printStackTrace();
      } catch (IOException var4) {
         var4.printStackTrace();
      } catch (LineUnavailableException var5) {
         var5.printStackTrace();
      } catch (UnsupportedAudioFileException var6) {
         var6.printStackTrace();
      }

      return null;
   }

   // $FF: synthetic method
   public final Object call() {
      return this.Method866();
   }
}
