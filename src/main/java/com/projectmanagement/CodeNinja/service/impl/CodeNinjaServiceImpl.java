package com.projectmanagement.CodeNinja.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projectmanagement.CodeNinja.dao.BugCategoryRepository;
import com.projectmanagement.CodeNinja.dao.BugRepository;
import com.projectmanagement.CodeNinja.dao.EmployeeRepository;
import com.projectmanagement.CodeNinja.dao.ProjectRepository;
import com.projectmanagement.CodeNinja.dao.ProjectStatusRepository;
import com.projectmanagement.CodeNinja.dao.ReviewRepository;
import com.projectmanagement.CodeNinja.dao.TeamRepository;
import com.projectmanagement.CodeNinja.dto.AllBugsDTO;
import com.projectmanagement.CodeNinja.dto.AllFilesDTO;
import com.projectmanagement.CodeNinja.dto.AllProjectsDTO;
import com.projectmanagement.CodeNinja.dto.AssignBugDTO;
import com.projectmanagement.CodeNinja.dto.BugDTO;
import com.projectmanagement.CodeNinja.dto.BugsAssignDTO;
import com.projectmanagement.CodeNinja.dto.CreateBugDTO;
import com.projectmanagement.CodeNinja.dto.EditProjectDTO;
import com.projectmanagement.CodeNinja.dto.EmployeeTeamDTO;
import com.projectmanagement.CodeNinja.dto.FileUploadDTO;
import com.projectmanagement.CodeNinja.dto.ProjectDetailsDTO;
import com.projectmanagement.CodeNinja.dto.SaveProjectDTO;
import com.projectmanagement.CodeNinja.entity.Bug;
import com.projectmanagement.CodeNinja.entity.Employee;
import com.projectmanagement.CodeNinja.entity.Project;
import com.projectmanagement.CodeNinja.entity.Review;
import com.projectmanagement.CodeNinja.service.CodeNinjaServiceInterface;

@Component
public class CodeNinjaServiceImpl implements CodeNinjaServiceInterface {

	@Autowired
	BugCategoryRepository bugCategoryRepository;
	@Autowired
	BugRepository bugRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	ProjectStatusRepository projectStatusRepository;
	@Autowired
	ReviewRepository reviewRepository;
	@Autowired
	TeamRepository teamRepository;

	@Override
	public List<AllProjectsDTO> getAllProjects(String customerId) {
		// TODO Auto-generated method stub
		List<AllProjectsDTO> allProjectsList = new ArrayList<>();
		AllProjectsDTO allProjects;
		String teamLeadName = "";
		List<Project> projectList = projectRepository.findByCustomerId(customerId);
		if (projectList != null) {
			for (Project project : projectList) {
				allProjects = new AllProjectsDTO();
				allProjects.setProjectId(project.getId());
				allProjects.setProjectName(project.getName());
				allProjects.setStatus(project.getStatus());
				allProjects.setTeamLeadId(project.getProjectLeadId());
				teamLeadName = employeeRepository.findByCustomerIdAndId(customerId, project.getProjectLeadId())
						.getName();
				allProjects.setTeamLeadName(teamLeadName);
				allProjects.setCompletionDate(project.getEstimatedCompletionDate());
				allProjectsList.add(allProjects);
			}
		}
		return allProjectsList;
	}

	@Override
	public ProjectDetailsDTO getProjectDetails(String customerId, String projectId) {
		// TODO Auto-generated method stub
		ProjectDetailsDTO projectDetails = new ProjectDetailsDTO();
		String projectLeadName = "";
		String teamName = "";
		Project project = projectRepository.findByCustomerIdAndId(customerId, projectId);
		if (project != null) {
			projectDetails.setProjectName(project.getName());
			projectDetails.setRepoUrl(project.getRepoUrl());
			teamName = teamRepository.findByCustomerIdAndId(customerId, project.getTeamId()).getName();
			projectDetails.setTeamName(teamName);
			projectLeadName = employeeRepository.findByCustomerIdAndId(customerId, project.getProjectLeadId())
					.getName();
			projectDetails.setProjectLeadName(projectLeadName);
		}
		return projectDetails;
	}

	@Override
	public List<AllBugsDTO> getAllBugs(String customerId, String employeeId) {
		// TODO Auto-generated method stub
		List<AllBugsDTO> allBugsList = new ArrayList<>();
		AllBugsDTO allBugs;
		String projectName = "";
		float severity = 0;
		List<Bug> bugsList = bugRepository.findByCustomerIdAndAssignedTo(customerId, employeeId);
		if (bugsList != null) {
			for (Bug bug : bugsList) {
				allBugs = new AllBugsDTO();
				allBugs.setBugId(bug.getId());
				allBugs.setBugName(bug.getName());
				allBugs.setProjectId(bug.getProjectId());
				projectName = projectRepository.findByCustomerIdAndId(customerId, bug.getProjectId()).getName();
				allBugs.setProjectName(projectName);
				severity = bugCategoryRepository.findByCustomerIdAndId(customerId, bug.getCategoryId()).getSeverity();
				allBugs.setSeverity(severity);
				allBugsList.add(allBugs);
			}
		}
		return allBugsList;
	}

	@Override
	public boolean uploadFile(FileUploadDTO fileUploadDTO) {
		// TODO Auto-generated method stub
		Review review = new Review();
		review.setCreatedOn(new Date());
		review.setCustomerId(fileUploadDTO.getCustomerId());
		review.setFileName(fileUploadDTO.getFileName());
		review.setFileUrl(fileUploadDTO.getFileUrl());
		review.setModifiedOn(new Date());
		review.setProjectId(fileUploadDTO.getProjectId());
		review.setStatus("Pending");
		try {
			reviewRepository.save(review);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<AllFilesDTO> getAllFiles(String customerId,String employeeId) {
		// TODO Auto-generated method stub
		List<AllFilesDTO> allFilesList = new ArrayList<>();
		AllFilesDTO allFiles;
		List<BugDTO> bugsList = new ArrayList<>();
		BugDTO bugDTO;
		List<Bug> bug;
		Employee employee = employeeRepository.findByCustomerIdAndId(customerId, employeeId);
		if(employee != null){
		List<Review> reviewList = reviewRepository.findByCustomerIdAndProjectId(customerId, employee.getProjectId());
		if (reviewList != null) {
			for (Review review : reviewList) {
				allFiles = new AllFilesDTO();
				allFiles.setFileName(review.getFileName());
				allFiles.setFileUrl(review.getFileUrl());
				allFiles.setStatus(review.getStatus());
				bug = bugRepository.findByCustomerIdAndFileUrl(customerId, review.getFileUrl());
				for (Bug bugs : bug) {
					bugDTO = new BugDTO();
					bugDTO.setBugId(bugs.getId());
					bugDTO.setBugName(bugs.getName());
					bugsList.add(bugDTO);
				}
				allFiles.setBugList(bugsList);
				allFilesList.add(allFiles);
			}
		}
		}

		return allFilesList;
	}

	@Override
	public boolean createBug(CreateBugDTO createBugDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EditProjectDTO getEditProject(String customerId, String projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeTeamDTO getEmployeeTeamList(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveProject(SaveProjectDTO saveProjectDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BugsAssignDTO getBugsAssignDTO(String customerId, String bugId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean assignBug(AssignBugDTO assignBugDTO) {
		// TODO Auto-generated method stub
		return false;
	}

}
