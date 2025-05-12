package user.profile.service;

import user.profile.request.UserDto;
import user.profile.request.UserProfieRequest;

public interface UserProfileService {
	
	Object getProfile(Long id);

	Object updateProfile(Long id, UserProfieRequest request);

	void createProfileFromUser(UserDto user);

}
