package com.projectmanagement.CodeNinja.service;

import java.util.List;

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

public interface CodeNinjaServiceInterface {

	public List<AllProjectsDTO> getAllProjects(String customerId);

	public ProjectDetailsDTO getProjectDetails(String customerId, String projectId);

	public List<AllBugsDTO> getAllBugs(String customerId,String employeeId);

	public boolean uploadFile(FileUploadDTO fileUploadDTO);

	public List<AllFilesDTO> getAllFiles(String customerId, String employeeId);

	public boolean createBug(CreateBugDTO createBugDTO);

	public EditProjectDTO getEditProject(String customerId, String projectId);

	public EmployeeTeamDTO getEmployeeTeamList(String customerId);

	public boolean saveProject(SaveProjectDTO saveProjectDTO);

	public BugsAssignDTO getBugsAssignDTO(String customerId, String bugId);

	public boolean assignBug(AssignBugDTO assignBugDTO);

}
