/**
 * 
 */
package com.npu.capstone.service;

import org.springframework.web.multipart.MultipartFile;

import com.npu.capstone.domain.JobSeeker;
import com.npu.capstone.domain.Profile;
import com.npu.capstone.domain.Project;

/**
 * @author Archana
 *
 */
public interface ProfilePageService {

	public String uploadResume( MultipartFile file);
	public void saveProfileForUser( Profile profile);
    public Profile getProfileDetailsForUser( long id);
    public void saveProjectDetails( Project project, long profile_id);
}
