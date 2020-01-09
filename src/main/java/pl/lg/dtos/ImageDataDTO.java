package pl.lg.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ImageDataDTO {

    @NotBlank
    private String fileName;

    @NotBlank
    private String contentType;

    @NotBlank
    private byte[] image;
}
