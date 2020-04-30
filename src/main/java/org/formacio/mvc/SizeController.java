package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SizeController {

	@Autowired
	private ServeiAlumnat serveiAlumnat;

    @RequestMapping(path = "/alumnes")
    
    @ResponseBody //Ho transforma directament a un json? Tornar a mirar videos
	public int nombreAlumnes() {
		return serveiAlumnat.numeroAlumnesRepositori();
	}

}