public class Request {
    private String username;
    private String role;
    private String data;

    public Request(String username, String role, String data){
        this.username=username;
        this.role=role;
        this.data=data;
    }

    public String getUsername() {
        return username;
    }
   
    public String getRole() {
        return role;
    }

    public String getData() {
        return data;
    }
    
}
