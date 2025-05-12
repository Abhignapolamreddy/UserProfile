package user.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.profile.entity.UserProfile;
import user.profile.request.UserDto;
import user.profile.request.UserProfieRequest;
import user.profile.service.UserProfileService;

@RestController
@RequestMapping("/api/profiles")
public class UserProfileController {
@Autowired
private UserProfileService userProfileService;

@PostMapping
public void  createProfileFromUser(@RequestBody UserDto userDto) {
	 userProfileService.createProfileFromUser(userDto);
}

@GetMapping("/{id}")
public Object getProfile(@PathVariable Long id) {
	return userProfileService.getProfile(id);
	
}
@PutMapping("/{id}")
public Object updateProfile(@PathVariable Long id, @RequestBody UserProfieRequest updatedProfile) {
	return  userProfileService.updateProfile(id, updatedProfile);
}
}