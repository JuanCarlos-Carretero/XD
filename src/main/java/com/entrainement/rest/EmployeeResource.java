package com.entrainement.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Employee Resource")
@Path("/employees")
public class EmployeeResource {

    @GET
    @Produces("application/json")
    @ApiOperation(value = "Get all employees", notes = "Returns a list of employees")
    public Response getAllEmployees() {
        // Tu lógica para obtener todos los empleados
        return Response.ok().entity("Lista de empleados").build();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    @ApiOperation(value = "Get employee by ID", notes = "Returns a single employee")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Employee found"),
        @ApiResponse(code = 404, message = "Employee not found")
    })
    public Response getEmployeeById(@PathParam("id") Long id) {
        // Tu lógica para obtener un empleado por su ID
        return Response.ok().entity("Empleado con ID: " + id).build();
    }
}
