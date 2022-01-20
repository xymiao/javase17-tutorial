import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Input02 {
    public static void main(String[] args) {
        File file = new File("D:\\Program\\BaiduNetdisk\\sounds\\1.wav");
        try (AudioInputStream stream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            // 睡眠一会让 clip 播放音频文件。
            Thread.sleep(500);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
