package com.xuecheng;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.UploadObjectArgs;
import io.minio.errors.*;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @description 测试MinIO
 * @author Mr.M
 * @date 2022/9/11 21:24
 * @version 1.0
 */
public class MinIOTest {

    static MinioClient minioClient =
            MinioClient.builder()
                    .endpoint("http://localhost:9000")
                    .credentials("rrHrPokmLAQXAyFm", "qTE2PiCC0YIveGiSFhJkdqs1L7QCQxR6")
                    .build();
    //上传文件
    public static void upload() throws IOException, NoSuchAlgorithmException, InvalidKeyException, ServerException, InsufficientDataException, ErrorResponseException, InvalidResponseException, XmlParserException, InternalException {
        UploadObjectArgs objectArgs = UploadObjectArgs.builder()
                .bucket("public")
                .filename("E:\\简历.pdf")
                .object("jianli.pdf")
                .build();

        minioClient.uploadObject(objectArgs);
        System.out.println("上传成功");

    }
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InvalidKeyException, ServerException, InsufficientDataException, ErrorResponseException, InvalidResponseException, XmlParserException, InternalException {
        upload();
    }


}
