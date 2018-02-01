package com.codingdojo.secondweek.grouplanguage.services;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.codingdojo.secondweek.grouplanguage.models.Language;
import com.codingdojo.secondweek.grouplanguage.repositories.LanguageRepository;



@Service
public class LanguageService {
	
private LanguageRepository languageRepository;
	
    public LanguageService(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }

	private List<Language> languages = new ArrayList<Language>(Arrays.asList(
			new Language("Java", "James Gosling", "Java SE 8 Update 144"),
            new Language("Python", "Guido van Rossum", "2.7"),
            new Language("Javascript", "Brendan Eich", "ES6")
			));
	
	public List<Language> allLanguages() {
		return (List<Language>) languageRepository.findAll();
	}

	public Language findLanguageByIndex(int index) {
		if (index < languages.size()){
            return languages.get(index);
        }else{
            return null;
        }
	}
	
	 public void addLanguage(Language language) {
	        languageRepository.save(language);
	    }

	public void updateLanguage(int id, Language language) {
		languageRepository.save(language);
		}

	public void destroyLanguage(Long id) {
		languageRepository.delete(id);
    }
}
