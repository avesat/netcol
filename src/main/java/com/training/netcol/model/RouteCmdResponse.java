package com.training.netcol.model;

import lombok.Data;

@Data
public class RouteCmdResponse {
    private String status;

    @Data
    public static class Host {
        private String addr;
        private String user;
        private String password;
        private Long id;
        private String status;

        public Host(String addr, String user, String password, Long id) {
            this.addr = addr;
            this.user = user;
            this.password = password;
            this.id = id;
        }
    }
}
