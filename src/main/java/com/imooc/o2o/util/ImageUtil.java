package com.imooc.o2o.util;

import com.imooc.o2o.dto.ImageHolder;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Position;
import net.coobird.thumbnailator.geometry.Positions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by byinl on 2018/6/12 15:22.
 */
public class ImageUtil {

    private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random RANDOM = new Random();

    public static String generateThumbnail(InputStream thumbnailInputStream, String fileName, String targetPath) {

        //获取不重复的文件名
        String realFileName = getRandomFileName();
        //获取文件的扩展名
        String extension = getFileExtension(fileName);
        // 如果目标路径不存在，则自动创建
        makeDirPath(targetPath);
        // 获取文件存储的相对路径(带文件名)
        String relativePath = targetPath + realFileName + extension;

        // 获取文件要保存到的目标路径
        File dest = new File(PathUtil.getImgBasePath() + relativePath);
        // 调用Thumbnails生成带有水印的图片
        try {
            Thumbnails.of(thumbnailInputStream).size(200, 200).watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.png")), 0.25f).outputQuality(0.8f).toFile(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dest.getName();
    }

    /**
     * 获取输入文件流的扩展名
     * @param fileName
     * @return
     */
    private static String getFileExtension(String fileName) {
        String originalFileName = fileName;
        return originalFileName.substring(originalFileName.lastIndexOf('.'));
    }


    /**
     * 生成随机文件名，当前年月日小时分钟秒钟+五位随机数
     * @return
     */
    public static String getRandomFileName() {
        //获取随机五位数
        int randNum = RANDOM.nextInt(89999) + 10000;
        String nowTimeStr = SIMPLE_DATE_FORMAT.format(new Date());
        return nowTimeStr + randNum;
    }

    /**
     * 创建目标路径所涉及到的目录
     * @param targetPath
     */
    private static void makeDirPath(String targetPath) {
        String realFileParentPath = PathUtil.getImgBasePath() + targetPath;
        File dirPath = new File(realFileParentPath);
        if(!dirPath.exists()) {
            dirPath.mkdirs();
        }
    }
}
