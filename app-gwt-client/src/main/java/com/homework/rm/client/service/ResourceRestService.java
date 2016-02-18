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
    @Path("/current-ram")
    void getCurrentRam(MethodCallback<Integer> callback);
    @GET
    @Path("/total-ram")
    void getTotalRam(MethodCallback<Integer> callback);
    @GET
    @Path("/virtual-memory")
    void getVirtualMemory(MethodCallback<Integer> callback);
    @GET
    @Path("/disk-space")
    void getDiskSpace(MethodCallback<Integer> callback);
}
