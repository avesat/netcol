package com.training.netcol.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@ToString
public class IpRoute extends GenModel {
    private Long id;
    private String destination;
    private String gateway;
    private String genmask;
    private String flags;
    private int metric;
    private int refs;
    private IpInterface iface;

    public IpRoute() {}

    private IpRoute(Builder builder) {
        destination = builder.destination;
        gateway = builder.gateway;
        genmask = builder.genmask;
        flags = builder.flags;
        metric = builder.metric;
        refs = builder.refs;
        iface = builder.iface;
    }

    public static class Builder {
        private String destination;
        private String gateway;
        private String genmask;
        private String flags;
        private int metric;
        private int refs;
        private IpInterface iface;

        public IpRoute build() {
            return new IpRoute(this);
        }

        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder gateway(String gateway) {
            this.gateway = gateway;
            return this;
        }

        public Builder genmask(String genmask) {
            this.genmask = genmask;
            return this;
        }

        public Builder flags(String flags) {
            this.flags = flags;
            return this;
        }

        public Builder metric(int metric) {
            this.metric = metric;
            return this;
        }

        public Builder refs(int refs) {
            this.refs = refs;
            return this;
        }

        public Builder iface(IpInterface iface) {
            this.iface = iface;
            return this;
        }
    }
}
