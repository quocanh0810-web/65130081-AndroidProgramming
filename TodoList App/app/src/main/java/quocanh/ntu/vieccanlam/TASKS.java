package quocanh.ntu.vieccanlam;

import java.io.Serializable;
import java.util.HashMap;

public class TASKS implements Serializable {
    String name;
    String date;
    String message;
    String priority;
    public TASKS(String name, String priority, String message, String date) {
        this.name = name;
        this.date = date;
        this.message = message;
        this.priority = priority;
    }

    public TASKS() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    //
    public HashMap<String, String> toFirebaseObject(){
        HashMap<String, String> taskObjiect =  new HashMap<String, String>();
        taskObjiect.put("name", name);
        taskObjiect.put("date", name);
        taskObjiect.put("message", name);
        taskObjiect.put("priority", name);
        return taskObjiect;
    }

}
