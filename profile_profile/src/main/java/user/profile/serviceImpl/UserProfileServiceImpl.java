package user.profile.serviceImpl;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.profile.entity.UserProfile;
import user.profile.repository.UserProfileRepository;
import user.profile.request.UserDto;
import user.profile.request.UserProfieRequest;
import user.profile.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService{

	@Autowired
	UserProfileRepository userprofileRepository;
	
	@Override
	public Object getProfile(Long id) {
		Optional<UserProfile> user= userprofileRepository.findById(id);
		if (user.isPresent()) {
	        return user.get();
	    } else {
	        return "User profile not found with ID: " + id;
	    }
	}
	@Override
	public void createProfileFromUser(UserDto userDto) {
        UserProfile profile = new UserProfile();
        profile.setUserId(userDto.getId());
        profile.setName(userDto.getName());
        profile.setEmail(userDto.getEmail());
        profile.setSubscribed(false); // default

        userprofileRepository.save(profile);
	}

	@Override
	public Object updateProfile(Long id,UserProfieRequest request) {
		Optional<UserProfile> user= userprofileRepository.findById(id);
		if (user.isPresent()) {
			UserProfile userProfile=user.get();
			userProfile.setName(request.getName());
			userProfile.setEmail(request.getEmail());
			userProfile.setPhoneNumber(request.getPhoneNumber());
			return userprofileRepository.save(userProfile);
		}
		else {
		throw  new RuntimeException("User not found");
	}
	}

}
