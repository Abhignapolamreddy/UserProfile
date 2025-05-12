package user.profile.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import user.profile.entity.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    Optional<UserProfile> findByEmail(String email);

}
