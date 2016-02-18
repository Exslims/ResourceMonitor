package com.homework.rm.client;

import org.fusesource.restygwt.client.MethodCallback;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Константин on 18.02.2016.
 */
@Path("/info")
public interface ResourceRestService {
    @GET
    @Path("/cpu-load")
    void getCpuLoad(MethodCallback<Integer> callback);
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
