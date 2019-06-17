package com.training.netcol.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@Getter
@ToString
public class Host extends GenModel {
    private Long id = 1L;
    private Long requestId;
    private String ipAddress;
    private String user;
    private String password;
    private List<IpInterface> ipInterfaces;
    private List<IpRoute> ipRoutes;

    public Host() {}

    private Host(Builder builder) {
        requestId = builder.requestId;
        ipAddress = builder.ipAddress;
        user = builder.user;
        password = builder.password;
        ipInterfaces = builder.ipInterfaces;
        ipRoutes = builder.ipRoutes;
    }

    public static class Builder {
        private Long requestId;
        private String ipAddress;
        private String user;
        private String password;
        @Getter private List<IpInterface> ipInterfaces;
        private List<IpRoute> ipRoutes;

        public Builder() {
            ipInterfaces = new ArrayList<>();
            ipRoutes = new ArrayList<>();
        }

        public Host build() {
            return new Host(this);
        }

        public Builder requestId(Long requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder ipInterfaces(IpInterface ipInterface) {
            this.ipInterfaces.add(ipInterface);
            return this;
        }

        public Builder ipRoutes(IpRoute ipRoute) {
            this.ipRoutes.add(ipRoute);
            return this;
        }
    }
}
