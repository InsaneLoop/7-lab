
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {}

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {}

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {}
