//Receiver
public class Document {
    private StringBuilder text;
    private String clipboard;

    public Document(){
        text=new StringBuilder();
        clipboard="";
    }

    public void write(String text){
        this.text.append(text);
    }

    public void delete(int n){
        if(n<=text.length()){
            text.delete(text.length()-n,text.length());
        }else{
            text.setLength(0);
        }
    }

    public void copy(int start, int end){
        if(start>=0 && end<=text.length() && start<end){
            this.clipboard=this.text.toString().substring(start,end);
            System.out.println("Copied: "+clipboard);
        }
    }

    public void paste(){
        this.text.append(clipboard);
    }

    public String getText(){
        return text.toString();
    }
}
