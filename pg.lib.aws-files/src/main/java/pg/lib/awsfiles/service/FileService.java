package pg.lib.awsfiles.service;

import org.springframework.web.multipart.MultipartFile;

import pg.lib.awsfiles.entity.FileEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FileService {
    Optional<FileEntity> findById(UUID fileId);

    UUID initFile(MultipartFile file);

    UUID uploadFile(MultipartFile file);

    String getFileUrl(UUID fileId);

    FileEntity getFileById(UUID fileId);

    List<String> getFilesUrls(List<FileEntity> fileEntities);

    void deleteFile(UUID fileId);
}
