package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.MenuCard;
import com.demo.service.ServiceInterface;

@Controller
@RequestMapping("/Product")
public class ProductController {
	@Autowired
  private ServiceInterface s;
	
  @GetMapping("/products")
	public ModelAndView getProduct() {
		List<MenuCard> list = s.displayAll();
			return new ModelAndView("displayproduct","list",list);	
	}
	
  @GetMapping("/addProduct")
  public String displayForm() {
	  return "addProduct";
  }
	
  @PostMapping("/formdatasubmit")
  public ModelAndView formdatasubmit(@RequestParam("proid") int id,@RequestParam("proname") String name,@RequestParam("prorate") String rate ) {
	  MenuCard m =new MenuCard(id,name,rate);
	  s.insertData(m);
	  
	return new ModelAndView("redirect:/Product/products");
	  
  }
  @GetMapping("/Deleteproduct/{id}")
  public ModelAndView Deleteproduct(@PathVariable int id) {
	
	  s.DeleteProduct(id);
	  return new ModelAndView("redirect:/Product/products");
	  
  }
}
