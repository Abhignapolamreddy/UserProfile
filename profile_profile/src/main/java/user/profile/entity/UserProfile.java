package user.profile.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_profiles")
@Data
public class UserProfile {

    @Id
    private Long userId; // Same as the ID from Auth Service

    private String name;

    @Column(unique = true)
    private String email;

    public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	private String profilePicture;

    private boolean subscribed;

    @Column(unique = true)
    private String phoneNumber;  // ✅ Added phone number
}

