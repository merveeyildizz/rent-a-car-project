package com.tobeto.rentacar.services.dtos.requests.car;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {

    @NotNull(message = "Bu alan bos birakilamaz!")
    @Min(value = 1)
    private int id;

    @NotBlank(message = "Plate alanı boş geçilemez")
    @Pattern(regexp = "(0[1-9]|[1-7][0-9]|8[01])((\\s?[a-zA-Z]\\s?)(\\d{4,5})|(\\s?[a-zA-Z]{2}\\s?)(\\d{3,4})|(\\s?[a-zA-Z]{3}\\s?)(\\d{2,3}))"
            ,message = "Geçersiz plaka")
    private String plateNumber;

    @Min(value = 0,message = "O'dan küçük olamaz.")
    @NotNull(message = "Bu alan boş geçilemez")
    private int kilometer;

    @NotNull(message = "Dailyprice alanı boş geçilemez")
    @DecimalMin(value = "0.0",inclusive = false,message = "Dailyprice 0'dan küçük olamaz")
    private double dailyPrice;

    @NotNull(message = "Bu alan boş geçilemez")
    @Min(value=2005,message = "Yıl 2005'ten küçük olamaz.")
    @Max(value = 2024,message = "Yıl 2024'ten büyük olamaz")
    private int year;
}
