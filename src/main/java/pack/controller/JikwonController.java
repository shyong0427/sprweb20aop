package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.model.JikwonDto;
import pack.model.JikwonInter;

@Controller
public class JikwonController {	
	@Autowired
	@Qualifier("jikwonImpl")
	private JikwonInter jikwonInter;
	
	@RequestMapping("jikwonlist")
	public ModelAndView getList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("list");
		
		List<JikwonDto> list = jikwonInter.jikwonList();
		modelAndView.addObject("list", list);
			
		return modelAndView;
	}
}