package cdac.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cdac.springmvc.model.Student;


import cdac.springmvc.service.StudentService;

@Controller
public class MyController {
	
	@Autowired
	StudentService studentservice;

	@RequestMapping("/home")
	public String gethome()

	{
	return "home";
	}//not used in pgm..
	
	//*******************insert****************************************
	@RequestMapping("/registerform1")
	public String getmyform1()

	{
		return "registerform";
	}
	
	@RequestMapping(value="/processregistrationform",method =RequestMethod.POST )
	public ModelAndView getstudent1(@ModelAttribute Student stu){
		//public String getstudent1(@ModelAttribute Student stu  , Model m){
		//m.addAttribute("stu", stu);
		int i = studentservice.save(stu);
		if(i>0)
			System.out.println("data inserted");
		else 
			System.out.println("insertion fail");
		//return new ModelAndView("studentdetails","list",studentservice.getAll());
		return new ModelAndView("singlestudent","stu",stu);
		//return "home"; ..this i did by using model keyword which returns string
	}
	//*******************delete****************************************
	/*@RequestMapping("/deleteform2")
	public String getmyform2(Model m)
	{
		return "deleteform2";
	}
	
	@RequestMapping(value="/processdeleteform",method =RequestMethod.POST )
	public String deletestudent1(@ModelAttribute Student stu,Model m)
	{
		
		int j =studentservice.delete(stu.id);
		if(j>0)
			System.out.println("data deleted");
		else 
			System.out.println("deletion fail");
		return  "redirect:/index.jsp";
		//return "redirect:/studentdetails";
		
	}*/
	
	@RequestMapping(value="/processdeleteform6/{id}",method =RequestMethod.GET)
	public ModelAndView deletestudent1(@PathVariable("id") int id)
	{
		
		int j =studentservice.delete(id);
		if(j>0)
			System.out.println("data deleted");
		else 
			System.out.println("deletion fail");
		return new ModelAndView("studentdetails","list",studentservice.getAll());
		
		//return new ModelAndView("studentdetails","list",studentservice.getAll());//return "redirect:/studentdetails";
		
	}
	
	
	//*******************update****************************************
	@RequestMapping("/updateform")
	public String getmyform3()
	{
		return "updateform";
	}
	@RequestMapping(value="/processupdateform",method =RequestMethod.POST )
	public ModelAndView updateStudent(@ModelAttribute Student stu,Model m)
	{
		int k=studentservice.update(stu);
		if(k>0)
			System.out.println("data updated");
		else 
			System.out.println("updation fail");
		
		return new ModelAndView("studentdetails","list",studentservice.getAll());
	/*@RequestMapping(value="/processupdateform/{id}",method =RequestMethod.POST )
	public String updateStudent(@PathVariable int id Model m)  //by using modelattribute
	{
		m.Attribute(stu);
		int k=studentservice.update(s);
		if(k>0)
			System.out.println("data updated");
		else 
			System.out.println("updation fail");
		
		return  "redirect:/index.jsp";*/
		
	}
	//*******************single student display****************************************
	@RequestMapping("/viewsinglestudentform")
	public String getmyform()
	{
		return "viewsinglestudentform";
	}
	
	@RequestMapping(value="/processviewsinglestudform",method =RequestMethod.POST )
	public ModelAndView getstudent3(@ModelAttribute Student stu)
	{
		return new ModelAndView("singlestudent","stu",studentservice.get(stu.id));
	}
	
	//**********************view all student***************
	@RequestMapping(value="/viewallstudentform")
	public ModelAndView getstudent4()
	{

		return new ModelAndView("studentdetails","list",studentservice.getAll());
		//return new ModelAndView("studentdetails","command",studentservice.getAll());
		//command will direct take my list anf pass to spring form.. diff betn form and command is .. u need to always refresh ur 
		//studentdetails page whenever ur doing operation like detele..but if u use command no need to refesh and go back n come to that page..
	}
	
	
	

}
