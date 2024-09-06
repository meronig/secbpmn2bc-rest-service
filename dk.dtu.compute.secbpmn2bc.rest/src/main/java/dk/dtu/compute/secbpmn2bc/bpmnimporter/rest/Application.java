package dk.dtu.compute.secbpmn2bc.bpmnimporter.rest;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import dk.dtu.compute.secbpmn2bc.bpmnimporter.files.Bpmn2secbpmnbc;


@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	  
		String arg0 = "../dk.dtu.compute.secbpmn2bc.bpmnimporter.model/ICRC_SendTokensToQRUser_simple.bpmn";
		try {
				Bpmn2secbpmnbc runner = new Bpmn2secbpmnbc();
				//runner.loadModels(arg0);
				
				File file = new File(arg0);
				InputStream is = new FileInputStream(file);
				
	            runner.loadModels(is);
				
				runner.doBpmn2secbpmnbc(new NullProgressMonitor());
				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				runner.saveModels(outputStream);
				return outputStream.toString();
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ATLExecutionException e) {
			e.printStackTrace();
		}
		
      return String.format("Hello %s!", name);
    }
	
	@PostMapping("/convert")
	public String convert(@RequestParam("file") MultipartFile file) {
		try {
			Bpmn2secbpmnbc runner = new Bpmn2secbpmnbc();
			runner.loadModels(file.getInputStream());
			runner.doBpmn2secbpmnbc(new NullProgressMonitor());
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			runner.saveModels(outputStream);
			return outputStream.toString();
	} catch (ATLCoreException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ATLExecutionException e) {
		e.printStackTrace();
	}return null;
	}
	
	@PostMapping("/annotate")
	public String annotate(@RequestParam("file") MultipartFile file) {
		return null;
	
	}
}
