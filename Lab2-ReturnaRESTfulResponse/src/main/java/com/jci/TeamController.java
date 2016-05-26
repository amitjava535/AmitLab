package com.jci;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

	@RequestMapping("/teams")
	public List<Team> getTeams()
	{
		List<Team> list=new ArrayList<>();
		Team team=new Team();
		
		team.setId(01L);
		team.setName("amit");
		team.setLocation("lko");
		
		list.add(team);
		
		team=new Team();

		team.setId(02L);
		team.setName("anil");
		team.setLocation("mumbai");
		
		list.add(team);
		
		
		
		return list;
		
	}
}
