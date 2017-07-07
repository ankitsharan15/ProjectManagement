package com.projectmanagement.CodeNinja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectmanagement.CodeNinja.dto.AllBugsDTO;
import com.projectmanagement.CodeNinja.dto.AllFilesDTO;
import com.projectmanagement.CodeNinja.dto.AllProjectsDTO;
import com.projectmanagement.CodeNinja.dto.AssignBugDTO;
import com.projectmanagement.CodeNinja.dto.BugsAssignDTO;
import com.projectmanagement.CodeNinja.dto.CreateBugDTO;
import com.projectmanagement.CodeNinja.dto.EditProjectDTO;
import com.projectmanagement.CodeNinja.dto.EmployeeTeamDTO;
import com.projectmanagement.CodeNinja.dto.FileUploadDTO;
import com.projectmanagement.CodeNinja.dto.ProjectDetailsDTO;
import com.projectmanagement.CodeNinja.dto.SaveProjectDTO;
import com.projectmanagement.CodeNinja.service.CodeNinjaServiceInterface;

@RestController
@RequestMapping("/bugsmanagement")
public class CodeNinjaController {

	@Autowired
	CodeNinjaServiceInterface codeNinjaService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String index() {
		return "index.html";
	}

	@RequestMapping(value = "/getAllProjects", method = RequestMethod.GET)
	public List<AllProjectsDTO> getAllProjectsDTO(@RequestParam(value = "customerId") String customerId) {
		return codeNinjaService.getAllProjects(customerId);
	}

	@RequestMapping(value = "/getProject", method = RequestMethod.GET)
	public ProjectDetailsDTO getProjectDetailsDTO(@RequestParam(value = "customerId") String customerId,
			@RequestParam(value = "projectId") String projectId) {
		return codeNinjaService.getProjectDetails(customerId, projectId);
	}

	@RequestMapping(value = "/getAllBugs", method = RequestMethod.GET)
	public List<AllBugsDTO> getAllBugsDTO(@RequestParam(value = "customerId") String customerId, @RequestParam(value="employeeId") String employeeId) {
		return codeNinjaService.getAllBugs(customerId, employeeId);
	}

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public boolean uploadFile(@RequestBody FileUploadDTO fileUploadDTO) {
		return codeNinjaService.uploadFile(fileUploadDTO);
	}

	@RequestMapping(value = "/getAllFiles", method = RequestMethod.GET)
	public List<AllFilesDTO> getAllFilesDTO(@RequestParam(value = "customerId") String customerId ,@RequestParam(value= "employeeId") String employeeId) {
		return codeNinjaService.getAllFiles(customerId,employeeId);
	}

	@RequestMapping(value = "/createBug", method = RequestMethod.POST)
	public boolean createBug(@RequestBody CreateBugDTO createBugDTO) {
		return codeNinjaService.createBug(createBugDTO);
	}

	@RequestMapping(value = "/editProject", method = RequestMethod.GET)
	public EditProjectDTO getEditProjectDTO(@RequestParam(value = "customerId") String customerId,
			@RequestParam(value = "projectId") String projectId) {
		return codeNinjaService.getEditProject(customerId, projectId);
	}

	@RequestMapping(value = "/newProject", method = RequestMethod.GET)
	public EmployeeTeamDTO getEmployeeTeamList(@RequestParam(value = "customerId") String customerId) {
		return codeNinjaService.getEmployeeTeamList(customerId);
	}

	@RequestMapping(value = "/saveProject", method = RequestMethod.POST)
	public boolean saveProject(@RequestBody SaveProjectDTO saveProjectDTO) {
		return codeNinjaService.saveProject(saveProjectDTO);
	}

	@RequestMapping(value = "/bugsassign", method = RequestMethod.GET)
	public BugsAssignDTO getBugsAssignDTO(@RequestParam(value = "customerId") String customerId,
			@RequestParam(value = "bugId") String bugId) {
		return codeNinjaService.getBugsAssignDTO(customerId, bugId);
	}

	@RequestMapping(value = "/assignBug", method = RequestMethod.POST)
	public boolean assignBug(@RequestBody AssignBugDTO assignBugDTO) {
		return codeNinjaService.assignBug(assignBugDTO);
	}

}
