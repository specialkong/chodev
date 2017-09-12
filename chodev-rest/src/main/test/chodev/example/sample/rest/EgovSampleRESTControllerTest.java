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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import chodev.example.sample.vo.SampleVO;

public class EgovSampleRESTControllerTest {

	@Test
	public void selectSampleListTest() throws Exception {
		SampleVO searchVO = new SampleVO();
		searchVO.setPageIndex(1);
		ObjectMapper om = new ObjectMapper();
		
		URL url = new URL("http://localhost:8080/egovSampleList.json");
		String param = om.writeValueAsString(searchVO);
		
		HttpResult result = doPost(url, param);
		System.out.println(result.getResponseCode());
		System.out.println(result.getResponseMessage());
		System.out.println(result.getResponseString());
	}

	@Test
	public void addSampleTest() throws Exception {
		SampleVO sampleVO = new SampleVO();
		sampleVO.setName("resttest1");
		sampleVO.setUseYn("Y");
		sampleVO.setDescription("do create test1");
		sampleVO.setRegUser("tester1");
		ObjectMapper om = new ObjectMapper();
		
		URL url = new URL("http://localhost:8080/addSample.json");
		String param = om.writeValueAsString(sampleVO);
		
		HttpResult result = doPost(url, param);
		System.out.println(result.getResponseCode());
		System.out.println(result.getResponseMessage());
		System.out.println(result.getResponseString());
		
		selectSampleListTest();
	}

	@Test
	public void selectSampleTest() throws Exception {

		SampleVO sampleVO = new SampleVO();
		sampleVO.setId("3");
		ObjectMapper om = new ObjectMapper();
		
		URL url = new URL("http://localhost:8080/selectSample.json");
		String param = om.writeValueAsString(sampleVO);
		
		HttpResult result = doPost(url, param);
		System.out.println(result.getResponseCode());
		System.out.println(result.getResponseMessage());
		System.out.println(result.getResponseString());
		
		url = new URL("http://localhost:8080/selectSample.xml");
		param = om.writeValueAsString(sampleVO);
		
		result = doPost(url, param);
		System.out.println(result.getResponseCode());
		System.out.println(result.getResponseMessage());
		System.out.println(result.getResponseString());
		
	}

	@Test
	public void updateSampleTest() throws Exception {

		SampleVO sampleVO = new SampleVO();
		sampleVO.setId("9");
		sampleVO.setName("resttest1");
		sampleVO.setUseYn("Y");
		sampleVO.setDescription("do modify test1");
		sampleVO.setRegUser("tester1");
		ObjectMapper om = new ObjectMapper();
		
		URL url = new URL("http://localhost:8080/updateSample.json");
		String param = om.writeValueAsString(sampleVO);
		
		HttpResult result = doPost(url, param);
		System.out.println(result.getResponseCode());
		System.out.println(result.getResponseMessage());
		System.out.println(result.getResponseString());
		
		selectSampleTest();
	}

	@Test
	public void deleteSampleTest() throws Exception {

		SampleVO sampleVO = new SampleVO();
		sampleVO.setId("9");
		ObjectMapper om = new ObjectMapper();
		
		URL url = new URL("http://localhost:8080/deleteSample.json");
		String param = om.writeValueAsString(sampleVO);
		
		HttpResult result = doPost(url, param);
		System.out.println(result.getResponseCode());
		System.out.println(result.getResponseMessage());
		System.out.println(result.getResponseString());
		
		selectSampleListTest();
		
	}
	
	@Test
	public void samplesTest() throws Exception {

		URL url = new URL("http://localhost:8080/samples/1");
		
		HttpResult result = doGet(url);
		System.out.println(result.getResponseCode());
		System.out.println(result.getResponseMessage());
		System.out.println(result.getResponseString());
		
		url = new URL("http://localhost:8080/samples/7");
		
		result = doGet(url);
		System.out.println(result.getResponseCode());
		System.out.println(result.getResponseMessage());
		System.out.println(result.getResponseString());
	}

	@Test
	public void jsonTest() throws Exception {
		SampleVO sampleVO = new SampleVO();
		sampleVO.setId("7");
		sampleVO.setName("resttest1");
		sampleVO.setUseYn("Y");
		sampleVO.setDescription("do test1");
		sampleVO.setRegUser("tester1");
		
		// object to json string
		ObjectMapper om = new ObjectMapper();
		String jsonString = om.writeValueAsString(sampleVO);
		System.out.println(jsonString);
		
		// json string to object
		SampleVO object = new SampleVO();
		object = om.readValue(jsonString, SampleVO.class);
		System.out.println(object);
	}
	
	@Test
	public void xmlTest() throws Exception {
		SampleVO sampleVO = new SampleVO();
		sampleVO.setId("7");
		sampleVO.setName("resttest1");
		sampleVO.setUseYn("Y");
		sampleVO.setDescription("do test1");
		sampleVO.setRegUser("tester1");
		
		// object to xml string
		JAXBContext jaxbContext = JAXBContext.newInstance(SampleVO.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(sampleVO, sw);
		String xmlString = sw.toString();
		System.out.println(xmlString);
		
		// xml string to object
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		StringReader sr = new StringReader(xmlString);
		SampleVO object = new SampleVO();
		object = (SampleVO) jaxbUnmarshaller.unmarshal(sr);
		System.out.println(object);
	}
	public HttpResult doPost(URL url, String param) throws Exception {

		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");
		
		con.setRequestMethod("POST");
		con.setDoOutput(true);
		OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
		wr.write(param);
		wr.flush();

		StringBuilder sb = new StringBuilder();
		HttpResult result = new HttpResult();
		int HttpResult = con.getResponseCode();
		if (HttpResult == HttpURLConnection.HTTP_OK) {
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			br.close();
		}
		result.setResponseCode(HttpResult);
		result.setResponseMessage(con.getResponseMessage());
		result.setResponseString(sb.toString());
		
		return result;
	}
	
	public HttpResult doGet(URL url) throws Exception {

		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");
		
		con.setRequestMethod("GET");

		StringBuilder sb = new StringBuilder();
		HttpResult result = new HttpResult();
		int HttpResult = con.getResponseCode();
		if (HttpResult == HttpURLConnection.HTTP_OK) {
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			br.close();
		}
		result.setResponseCode(HttpResult);
		result.setResponseMessage(con.getResponseMessage());
		result.setResponseString(sb.toString());
		
		return result;
	}
}

class HttpResult {
	
	private int responseCode;
	private String responseMessage;
	private String responseString;
	
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public String getResponseString() {
		return responseString;
	}
	public void setResponseString(String responseString) {
		this.responseString = responseString;
	}
}
