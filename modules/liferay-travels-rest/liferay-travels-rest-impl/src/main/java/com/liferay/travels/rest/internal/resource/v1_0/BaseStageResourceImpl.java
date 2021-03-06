package com.liferay.travels.rest.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ResourceActionLocalService;
import com.liferay.portal.kernel.service.ResourcePermissionLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.util.ActionUtil;
import com.liferay.portal.vulcan.util.TransformUtil;
import com.liferay.travels.rest.dto.v1_0.Stage;
import com.liferay.travels.rest.resource.v1_0.StageResource;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.validation.constraints.NotNull;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.UriInfo;

/**
 * @author Javier de Arcos
 * @generated
 */
@Generated("")
@Path("/v1.0")
public abstract class BaseStageResourceImpl implements StageResource {

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/liferay-travels-rest/v1.0/trips/{tripId}/stages'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "tripId")})
	@Path("/trips/{tripId}/stages")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Stage")})
	public Page<Stage> getTripStagesPage(
			@NotNull @Parameter(hidden = true) @PathParam("tripId") Long tripId)
		throws Exception {

		return Page.of(Collections.emptyList());
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'POST' 'http://localhost:8080/o/liferay-travels-rest/v1.0/trips/{tripId}/stages' -d $'{"description": ___, "image": ___, "name": ___, "place": ___}' --header 'Content-Type: application/json' -u 'test@liferay.com:test'
	 */
	@Override
	@Consumes({"application/json", "application/xml"})
	@POST
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "tripId")})
	@Path("/trips/{tripId}/stages")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Stage")})
	public Stage postTripStage(
			@NotNull @Parameter(hidden = true) @PathParam("tripId") Long tripId,
			Stage stage)
		throws Exception {

		return new Stage();
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'DELETE' 'http://localhost:8080/o/liferay-travels-rest/v1.0/stages/{stageId}'  -u 'test@liferay.com:test'
	 */
	@Override
	@DELETE
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "stageId")})
	@Path("/stages/{stageId}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Stage")})
	public void deleteStage(
			@NotNull @Parameter(hidden = true) @PathParam("stageId") Long
				stageId)
		throws Exception {
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/liferay-travels-rest/v1.0/stages/{stageId}'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "stageId")})
	@Path("/stages/{stageId}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Stage")})
	public Stage getStage(
			@NotNull @Parameter(hidden = true) @PathParam("stageId") Long
				stageId)
		throws Exception {

		return new Stage();
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'PUT' 'http://localhost:8080/o/liferay-travels-rest/v1.0/stages/{stageId}' -d $'{"description": ___, "image": ___, "name": ___, "place": ___}' --header 'Content-Type: application/json' -u 'test@liferay.com:test'
	 */
	@Override
	@Consumes({"application/json", "application/xml"})
	@PUT
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "stageId")})
	@Path("/stages/{stageId}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Stage")})
	public Stage putStage(
			@NotNull @Parameter(hidden = true) @PathParam("stageId") Long
				stageId,
			Stage stage)
		throws Exception {

		return new Stage();
	}

	public void setContextAcceptLanguage(AcceptLanguage contextAcceptLanguage) {
		this.contextAcceptLanguage = contextAcceptLanguage;
	}

	public void setContextCompany(
		com.liferay.portal.kernel.model.Company contextCompany) {

		this.contextCompany = contextCompany;
	}

	public void setContextHttpServletRequest(
		HttpServletRequest contextHttpServletRequest) {

		this.contextHttpServletRequest = contextHttpServletRequest;
	}

	public void setContextHttpServletResponse(
		HttpServletResponse contextHttpServletResponse) {

		this.contextHttpServletResponse = contextHttpServletResponse;
	}

	public void setContextUriInfo(UriInfo contextUriInfo) {
		this.contextUriInfo = contextUriInfo;
	}

	public void setContextUser(
		com.liferay.portal.kernel.model.User contextUser) {

		this.contextUser = contextUser;
	}

	protected Map<String, String> addAction(
		String actionName, GroupedModel groupedModel, String methodName) {

		return ActionUtil.addAction(
			actionName, getClass(), groupedModel, methodName,
			contextScopeChecker, contextUriInfo);
	}

	protected Map<String, String> addAction(
		String actionName, Long id, String methodName, Long ownerId,
		String permissionName, Long siteId) {

		return ActionUtil.addAction(
			actionName, getClass(), id, methodName, contextScopeChecker,
			ownerId, permissionName, siteId, contextUriInfo);
	}

	protected Map<String, String> addAction(
		String actionName, String methodName, String permissionName,
		Long siteId) {

		return addAction(
			actionName, siteId, methodName, null, permissionName, siteId);
	}

	protected <T, R> List<R> transform(
		java.util.Collection<T> collection,
		UnsafeFunction<T, R, Exception> unsafeFunction) {

		return TransformUtil.transform(collection, unsafeFunction);
	}

	protected <T, R> R[] transform(
		T[] array, UnsafeFunction<T, R, Exception> unsafeFunction,
		Class<?> clazz) {

		return TransformUtil.transform(array, unsafeFunction, clazz);
	}

	protected <T, R> R[] transformToArray(
		java.util.Collection<T> collection,
		UnsafeFunction<T, R, Exception> unsafeFunction, Class<?> clazz) {

		return TransformUtil.transformToArray(
			collection, unsafeFunction, clazz);
	}

	protected <T, R> List<R> transformToList(
		T[] array, UnsafeFunction<T, R, Exception> unsafeFunction) {

		return TransformUtil.transformToList(array, unsafeFunction);
	}

	protected AcceptLanguage contextAcceptLanguage;
	protected com.liferay.portal.kernel.model.Company contextCompany;
	protected HttpServletRequest contextHttpServletRequest;
	protected HttpServletResponse contextHttpServletResponse;
	protected Object contextScopeChecker;
	protected UriInfo contextUriInfo;
	protected com.liferay.portal.kernel.model.User contextUser;
	protected GroupLocalService groupLocalService;
	protected ResourceActionLocalService resourceActionLocalService;
	protected ResourcePermissionLocalService resourcePermissionLocalService;
	protected RoleLocalService roleLocalService;

}