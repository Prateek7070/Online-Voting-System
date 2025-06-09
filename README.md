import java.util.*;

public class VotingSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Integer> candidates = new LinkedHashMap<>();
    private static final Set<String> voters = new HashSet<>();
    private static final String adminUsername = "admin";
    private static final String adminPassword = "password";
