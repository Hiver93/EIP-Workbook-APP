package com.kdw.eip.workbook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kdw.eip.workbook.domain.dto.resp.WorkbookRespDto;
import com.kdw.eip.workbook.domain.entity.Workbook;
import com.kdw.eip.workbook.repository.WorkbookRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class WorkbookService {
	private WorkbookRepository workbookRepository;
	
	public List<WorkbookRespDto> getWorkbookList(){
		return workbookRepository.findAll().stream().map(WorkbookRespDto::fromEntity).toList();
	}
	
	public void createWorkbook(Workbook workbook) {
		this.workbookRepository.save(workbook);
	}
}
