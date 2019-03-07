package hello;

import javax.persistence.*;

/**
 * Created by i341924 on 2019/3/6.
 */
@Entity
public class Dongle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tid;
    private String space;
    private String service;

    public Dongle(){}
    public Integer getTid(){
        return tid;
    }
    public void setTid(Integer tid){
        this.tid = tid;
    }

    public String getSpace(){
        return space;
    }

    public void setSpace(){
        this.space = space;
    }
    public String getService(){
        return service;
    }

    public void setService(){
        this.service = service;
    }

}
