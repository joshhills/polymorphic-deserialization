package com.joshhills.polymorphicdeserialization.controller;

import com.joshhills.polymorphicdeserialization.model.Character;
import com.joshhills.polymorphicdeserialization.service.CharacterService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    /**
     * The service to retrieve character information from
     */
    private final CharacterService characterService;

    /**
     * @param characterService The service to retrieve character information from
     */
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping
    public Character postCharacter(@Valid @RequestBody Character character) {
        return characterService.createCharacter(character);
    }

    @GetMapping
    public Collection<Character> getCharacters() {
        return characterService.getCharacters();
    }

    @GetMapping("/{id}")
    public Character getCharacter(@PathVariable String id) {
        return characterService.getCharacter(id);
    }

    @PutMapping
    public Character putCharacter(@Valid @RequestBody Character character) {
        return characterService.updateCharacter(character);
    }

    @DeleteMapping("/{id}")
    public Character deleteCharacter(@PathVariable String id) {
        return characterService.deleteCharacter(id);
    }
}
