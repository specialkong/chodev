/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package chodev.example.sample.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import chodev.example.sample.service.EgovSampleService;
import chodev.example.sample.vo.SampleVO;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

/**
 * @Class Name : EgovSampleRESTController.java
 * @Description : EgovSample REST Controller Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2009.03.16           최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2009. 03.16
 * @version 1.0
 * @see
 *
 *  Copyright (C) by MOPAS All right reserved.
 */

@RestController
public class EgovSampleRESTController {

	/** EgovSampleService */
	@Resource(name = "sampleService")
	private EgovSampleService sampleService;

	/**
	 * 글 목록을 조회한다. (paging)
	 * @param searchVO
	 * @return Map<String, Object>
	 * @exception Exception
	 */
	@RequestMapping(value = "/egovSampleList")
	public @ResponseBody Map<String, Object> selectSampleList(@RequestBody SampleVO searchVO) throws Exception {

		/** EgovPropertyService.sample */
		searchVO.setPageUnit(searchVO.getPageUnit());
		searchVO.setPageSize(searchVO.getPageSize());

		/** paging setting */
		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
		paginationInfo.setPageSize(searchVO.getPageSize());

		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex() + 1);
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

		List<?> sampleList = sampleService.selectSampleList(searchVO);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("resultList", sampleList);

		int totCnt = sampleService.selectSampleListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
		map.put("paginationInfo", paginationInfo);
		map.put("searchVO", searchVO);

		return map;
	}

	/**
	 * 글을 등록한다.
	 * @param sampleVO - 등록할 정보가 담긴 VO
	 * @exception Exception
	 */
	@RequestMapping(value = "/addSample", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> addSample(@RequestBody SampleVO sampleVO)
			throws Exception {

		sampleService.insertSample(sampleVO);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "ok");
		return map;
	}

	/**
	 * 글을 조회한다.
	 * @param searchVO - 목록 조회조건 정보가 담긴 VO
	 * @return @ModelAttribute("sampleVO") - 조회한 정보
	 * @exception Exception
	 */
	@RequestMapping(value = "/selectSample", method = RequestMethod.POST)
	public @ResponseBody SampleVO selectSample(@RequestBody SampleVO searchVO) throws Exception {
		return sampleService.selectSample(searchVO);
	}

	/**
	 * 글을 수정한다.
	 * @param sampleVO - 수정할 정보가 담긴 VO
	 * @exception Exception
	 */
	@RequestMapping("/updateSample")
	public @ResponseBody Map<String, Object> updateSample(@RequestBody SampleVO sampleVO)
			throws Exception {

		sampleService.updateSample(sampleVO);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "ok");
		return map;
	}

	/**
	 * 글을 삭제한다.
	 * @param sampleVO - 삭제할 정보가 담긴 VO
	 * @param status
	 * @exception Exception
	 */
	@RequestMapping("/deleteSample")
	public @ResponseBody Map<String, Object> deleteSample(@RequestBody SampleVO searchVO) throws Exception {
		sampleService.deleteSample(searchVO);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "ok");
		return map;
	}
}
