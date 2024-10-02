package hello.upload.domain;


import lombok.Data;

@Data
public class UploadFile {

    private String uploadFileName;
    private String storeFileName;   // uuid 등으로 안 겹치게 저장함

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
