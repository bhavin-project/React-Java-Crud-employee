package com.example.myapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.myapp.model.studentModel;
import com.example.myapp.repository.studentRepo;

@Controller
@RestController
public class studentController {
	
	
	@Autowired
	studentRepo studentRepo;
//	=======================++ Get HTMLFILE FOR different filename other than index  ++=========================
//	@GetMapping("/getPage")
//	public ResponseEntity<InputStreamResource> index() throws IOException {
//		ClassPathResource htmlFile = new ClassPathResource("static/index.html");
//		InputStream inputStream = htmlFile.getInputStream();
//
//		return ResponseEntity.ok()
//		.contentType(MediaType.TEXT_HTML)
//		.body(new InputStreamResource(inputStream));
//	}
	
//	@GetMapping({"/login","/"})
//	public ModelAndView loginPage() {
//		ModelAndView model = new ModelAndView();
//		model.setViewName("login");
//		return model;
//	}

//	+++++++++++++++++++++  Theamleaf  +++++++++++++++++++++++++
	
	@RequestMapping(value="/",method = RequestMethod.GET)       
	public String index()  
	{    
		System.out.println("Hello from theamleaf");	
		return"index";    
	}    
	@RequestMapping(value="/save", method=RequestMethod.POST)    
	public ModelAndView save(@ModelAttribute studentModel user)  
	{    
		ModelAndView modelAndView = new ModelAndView();    
		modelAndView.setViewName("userData");        
		modelAndView.addObject("user", user);      
		return modelAndView;    
	}    
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	
	@PostMapping("/checkExisting")
	public String saveData(@RequestParam(value = "exampleInputEmail1",required = false) String email, @RequestParam(value = "exampleInputPassword1",required = false) String name) {
		System.out.println("hello");
		Optional<studentModel> studentFromDb = studentRepo.findById(20);
		Long noofrecrd=studentRepo.count();

		// Boolean bul =  studentRepo.existsById(34);

		List<studentModel> student =studentRepo.findByFirstnameContainingIgnoreCaseOrLastnameContainingIgnoreCaseOrStatus(" "," ","1");

		int size = student.size();
		student.forEach(row -> {
			int id =  row.getId();
			String firstName = row.getFirstname();
			String lastName = row.getLastname();
			System.out.println("ID: " + id);
			System.out.println("First Name: " + firstName.toLowerCase());
			System.out.println("Last Name: " + lastName.toUpperCase());
			System.out.println("-----------------------");
		});

		//studentModel st = student.get(0);
		//System.out.println(st.getFirstname());


		//studentModel getStudent = studentFromDb.get();

		//studentModel student = new  studentModel();
		// getStudent.setFirst_name(name);
		//getStudent.setEmail_id(email);
		//student.setAddress("ttttttt");
		//		 String str = name+ " " +email;
		//		 System.out.print(str);	
		//		 studentRepo.save(getStudent);

		//System.out.println(getStudent.getCity().getCityname());
		System.out.println("No.of records "+size);
		//System.out.println(bul);
		//return name+ " " +email;
		return "redirect:/success";
	}
	 
	 
	
//	  @ResponseBody
//	  
//	  @RequestMapping(value = "/admin/LoadEmployeeData", method =
//	  RequestMethod.POST, produces = { "application/json" }) public String
//	  LoadEmployeeData(HttpServletRequest request, @RequestParam int
//	  pageno, @RequestParam int length, String search) {
//	  
//	  JSONObject jsonObject = new JSONObject(); 
//	  JSONArray jsonArray1 = new JSONArray(); 
//	  JSONParser jsonp = new JSONParser();
//	   JSONObject jsonobjectout = new JSONObject(); 
//	   String returnstring = "";
//	  
//	  List<String> Columns = new ArrayList<String>(); Pageable pageable =
//	  (Pageable) PageRequest.of(pageno, length); try {
//	  
//	  // List<Tuple> tb_employee_dtl2 = employee.LoadEmpData1(pageable); // // for
//	  (Tuple row : tb_employee_dtl2) { // // // Get Column Names // // List<String>
//	  listd = new ArrayList<>(); // List<TupleElement<?>> elements =
//	  row.getElements(); // for (TupleElement<?> element : elements) { //
//	  System.out.println("Alias ==>" + element.getAlias()); //
//	  listd.add(element.getAlias()); // } // }
//	  
//	  // Add Server Side Validation TODO System.out.println("pageno" + pageno +
//	  "search" + search);
//	  
//	  Page<employeeTable> tb_employee_dtl3 = employee.LoadEmpData(pageable,
//	  search);
//	  
//	  // Set<Specializationmst> specializationmstsd1 = specializationmsts.toSet();
//	  //
//	  
//	  // Iterator<Specializationmst> namesIterator =
//	  specializationmstsd1.iterator(); // // while(namesIterator.hasNext()) { //
//	  System.out.println(namesIterator.next()); // } // int count = (int)
//	  tb_employee_dtl3.getPageable().getOffset(); count = count + 1;
//	  List<employeeTable> tb_employee_dtl4 = tb_employee_dtl3.getContent(); //
//	  List<SpecilizationMaster> specializationmstsd = //
//	  specializationmsts.getContent(); // // java.lang.reflect.Field[] fields =
//	  specializationmstsd.get(0).getClass().getDeclaredFields(); // for
//	  (java.lang.reflect.Field field : fields) { //
//	  Columns.add(field.getAnnotation(Column.class).name()); // } //
//	  System.out.println("============"+ Columns.get(0)); // // for (int i = 0; i <
//	  specializationmstsd.size(); i++) { // Specializationmst specializationmst =
//	  specializationmstsd.get(i); // Map<String, Object> columns = new
//	  LinkedHashMap<String, Object>(); // for (int j = 1; j <= Columns.size(); j++)
//	  { // columns.put(Columns.get(i), specializationmst.getClass().getName()); //
//	  System.out.println("=======:====="+specializationmst.getClass().getName());
//	  // } // }
//	  
//	  for (int i = 0; i < tb_employee_dtl4.size(); i++) {
//	  
//	  employeeTable tb_employee_dtl = tb_employee_dtl4.get(i); JSONObject
//	  jsonObject2 = new JSONObject(); jsonObject2.put("empno",
//	  "<span class='avtar avatar-blue'>" + count + "</span>");
//	  jsonObject2.put("empname", tb_employee_dtl.getEmployeeName());
//	  jsonObject2.put("location", tb_employee_dtl.getLocation());
//	  jsonObject2.put("designation",
//	  tb_employee_dtl.getDesId().getDesignationName()); jsonObject2.put("action",
//	  "<a href=\"#\" onclick=\"GetEmployeeData(" + tb_employee_dtl.getEmpId() +
//	  ")\"><i class=\"fa fa-pencil\" aria-hidden=\"true\"></i></a> &nbsp;&nbsp; <a href=\"#\" onclick=\"DeleteEmployeeData("
//	  + tb_employee_dtl.getEmpId() +
//	  ")\"><i class=\"fa fa-trash\" aria-hidden=\"true\"></i></a>");
//	  jsonArray1.add(jsonObject2); count++;
//	  
//	  } jsonobjectout.put("status", "1"); jsonobjectout.put("data", jsonArray1);
//	  jsonobjectout.put("message", "Employee Data Load Successfully");
//	  jsonobjectout.put("TotalCount", tb_employee_dtl3.getTotalElements());
//	  returnstring = jsonobjectout.toJSONString();
//	  
//	  } catch (Exception e) { e.printStackTrace(); jsonobjectout.put("status",
//	  "0"); jsonobjectout.put("message", "Failure"); returnstring =
//	  jsonobjectout.toJSONString(); }
//	  System.out.println("Employee Data Load Output-->" + returnstring);
//	  
//	  return returnstring; }
	 
	
}
