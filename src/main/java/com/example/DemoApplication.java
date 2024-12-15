
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private TagRepository tagRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Profile profile = new Profile();
        profile.setBio("Java Developer");

        User user = new User();
        user.setName("John Doe");
        user.setProfile(profile);
        userRepository.save(user);

        Post post = new Post();
        post.setTitle("My First Post");
        post.setUser(user);

        Tag tag1 = new Tag();
        tag1.setName("Java");

        Tag tag2 = new Tag();
        tag2.setName("Spring");

        post.getTags().add(tag1);
        post.getTags().add(tag2);
        postRepository.save(post);
    }
}
