package com.homework.rm.client.service;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Константин on 18.02.2016.
 */
@Path("/info")
public interface ResourceRestService extends RestService {
    @GET
    @Path("/cpu-load")
    void getCpuLoad(MethodCallback<Float> callback);
    @GET
    @Path("/used-ram")
    void getUsedRam(MethodCallback<Float> callback);
    @GET
    @Path("/total-ram")
    void getTotalRam(MethodCallback<Float> callback);
    @GET
    @Path("/virtual-memory")
    void getVirtualMemory(MethodCallback<Float> callback);
    @GET
    @Path("/used-disk-space")
    void getUsedDiskSpace(MethodCallback<Float> callback);
    @GET
    @Path("/total-disk-space")
    void getTotalDiskSpace(MethodCallback<Float> callback);
}
