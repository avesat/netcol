package com.training.netcol.model;

import com.training.netcol.task.TaskStatus;
import lombok.Data;

@Data
public class HostResponse {
    private Long id;
    private TaskStatus status;
}
