package com.example;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Team {

	@Id
	@GeneratedValue
	Long id;
	String name,location,mascotte;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teamId")
	Set<Player> playeers;
	
	public Team(String name, String location, Set<Player> playeers) {
		super();
		this.name = name;
		this.location = location;
		this.playeers = playeers;
	}
	public Set<Player> getPlayeers() {
		return playeers;
	}
	public Team() {
		super();
	}
	public void setPlayeers(Set<Player> playeers) {
		this.playeers = playeers;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascotte() {
		return mascotte;
	}
	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}
	
	
	
	
}
