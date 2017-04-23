package com.npu.capstone.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.npu.capstone.dao.ProfileDao;
import com.npu.capstone.dao.ProfileDaoImpl;
import com.npu.capstone.domain.JobSeeker;
import com.npu.capstone.domain.Profile;
import com.npu.capstone.domain.Project;

@Service
public class ProfilePageServiceImpl implements ProfilePageService {

	@Autowired
	private ProfileDao profileDoa;

	@Override
	public String uploadResume(MultipartFile file) {

		// Get name of uploaded file.
		String fileName = file.getOriginalFilename();

		// Path where the uploaded file will be stored.
		String path = "C:/Users/Archana/Desktop/fileUpload/" + fileName;

		// This buffer will store the data read from 'uploadedFileRef'
		byte[] buffer = new byte[1000];

		// Now create the output file on the server.
		File outputFile = new File(path);

		FileInputStream reader = null;
		FileOutputStream writer = null;
		int totalBytes = 0;
		try {
			outputFile.createNewFile();

			// Create the input stream to uploaded file to read data from it.
			reader = (FileInputStream) file.getInputStream();

			// Create writer for 'outputFile' to write data read from
			// 'uploadedFileRef'
			writer = new FileOutputStream(outputFile);

			// Iteratively read data from 'uploadedFileRef' and write to
			// 'outputFile';
			int bytesRead = 0;
			while ((bytesRead = reader.read(buffer)) != -1) {
				writer.write(buffer);
				totalBytes += bytesRead;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return "File uploaded successfully! Total Bytes Read=" + totalBytes;
	}

	@Override
	public void saveProfileForUser(Profile profile) {

		Profile checkprofile = profileDoa.getProfileParams(profile.getJobseeker_id());
		
		if (checkprofile != null) {

			profileDoa.updateProfile(profile);
		} 
		else
		{
			profileDoa.insertProfile(profile);
		}
	}

	@Override
	public Profile getProfileDetailsForUser(long id) {

		return profileDoa.getProfileParams(id);
	}

	@Override
	public void saveProjectDetails(Project project, long id) {
		
		profileDoa.updateProjectProfile(project, id);
	}

}
