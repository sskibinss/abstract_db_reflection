import java.util.List;
import po.*;

public class Main {
    public static void main(String[] args) {
        Main solution = new Main();
        print(solution.getUsers());
        print(solution.getLocations());
        print(solution.getServers());
    }

    public static void print(List list) {
        String format = "Id=%d, name='%s', description=%s";
        for (Object obj : list) {
            NamedItem item = (NamedItem) obj;
            System.out.println(String.format(format, item.getId(), item.getName(), item.getDescription()));
        }
    }
    public List<User> getUsers(){
        return new AbstractDbSelectExecutor<User>() {
            @Override
            public String getQuery() {
                return "SELECT * FROM " + User.class.getSimpleName().toUpperCase();
            }
        }.execute();
    }
    public List<Location> getLocations(){
        return new AbstractDbSelectExecutor<Location>() {
            @Override
            public String getQuery() {
                return "SELECT * FROM " + Location.class.getSimpleName().toUpperCase();
            }
        }.execute();
    }
    public List<Subject> getSubjects(){
        return new AbstractDbSelectExecutor<Subject>() {
            @Override
            public String getQuery() {
                return "SELECT * FROM " + Subject.class.getSimpleName().toUpperCase();
            }
        }.execute();
    }
    public List<Subscription> getSubscriptions(){
        return new AbstractDbSelectExecutor<Subscription>() {
            @Override
            public String getQuery() {
                return "SELECT * FROM " + Subscription.class.getSimpleName().toUpperCase();
            }
        }.execute();
    }
    public List<Server> getServers(){
        return new AbstractDbSelectExecutor<Server>() {
            @Override
            public String getQuery() {
                return "SELECT * FROM " + Server.class.getSimpleName().toUpperCase();
            }
        }.execute();
    }

}
