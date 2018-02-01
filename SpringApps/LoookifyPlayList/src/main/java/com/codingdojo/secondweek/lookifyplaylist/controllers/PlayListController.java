package com.codingdojo.secondweek.lookifyplaylist.controllers;

import java.util.List;





import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.secondweek.lookifyplaylist.models.Playlist;
import com.codingdojo.secondweek.lookifyplaylist.services.PlaylistService;



@Controller
public class PlayListController {
	private PlaylistService playlistService;
	
	public PlayListController(PlaylistService playlistService) {
		this.playlistService = playlistService;
	}
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Playlist> allplaylist = playlistService.getPlaylist();
		model.addAttribute("allplaylist", allplaylist);
		return "dashboard.jsp";
	}
	@GetMapping("/songs/new")
	public String newSong(@ModelAttribute("playlist") Playlist playlist, BindingResult result) {
		return "new.jsp";
	}
	@PostMapping("/songs/new")
	public String createdSong(@Valid @ModelAttribute("playlist") Playlist playlist, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		else {
			playlistService.addPlaylist(playlist);
			return "redirect:/dashboard";
		}
	}
	@GetMapping("/songs/{id}")
	public String asong(@PathVariable("id") Long id, Model model) {
		Playlist playlist = playlistService.getPlaylistById(id);
		model.addAttribute("playlist", playlist);
		return "songs.jsp";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		playlistService.delete(id);
		return "redirect:/dashboard";
	}
	@GetMapping("/songs/top")
	public String top(Model model) {
		List<Playlist> top = playlistService.topSongs();
		model.addAttribute("top", top);
		//System.out.println(top);
		return "top.jsp";
	}
	@GetMapping("/search")
	public String search(Model model, @RequestParam("search") String search) {
		List<Playlist> getByArtist = playlistService.artist(search);
		model.addAttribute("getByArtist", getByArtist);
		List<Playlist> getByTitle = playlistService.title(search);
		model.addAttribute("getByTitle", getByTitle);
		return "search.jsp";
	}
	
//	@GetMapping("/search")
//	public String search(Model model, @RequestParam("search") String search) {
//		List<Playlist> getByTitle = playlistService.title(search);
//		model.addAttribute("getByArtist", getBytitle);
//		return "search.jsp";
	}
	

	
	
	
	
	
	
	
	
	
