package org.example.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Kelas pemodelan DTO (data transfer object) dari objek schedule
 * @author Dwi Satria Patra
 */
@Data
public class ScheduleDto {
    @Schema(example = "1")
    private Long scheduleId;
    @Schema(example = "1")
    private Long filmCode;
    @Schema(example = "11 Juli")
    private String date;
    @Schema(example = "15.00")
    private String startTime;
    @Schema(example = "17.00")
    private String endTime;
    @Schema(example = "40000")
    private Long ticketPrice;
    @Schema(example = "Studio C")
    private String studioName;
}
