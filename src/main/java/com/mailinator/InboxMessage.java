package com.mailinator;


/**
 *
 * @author Adam
 */
public class InboxMessage {
    private long secondsAgo;
    private String to;
    private String id;
    private long time;
    private String subject;
    private String from;
    private String ip;

    
    //Auto generated getter / setters
    public long getSeconds_ago() {
        return secondsAgo;
    }

    protected void setSeconds_ago(long seconds_ago) {
        this.secondsAgo = seconds_ago;
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    protected void setTime(long time) {
        this.time = time;
    }

    public String getSubject() {
        return subject;
    }

    protected void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFrom() {
        return from;
    }

    protected void setFrom(String from) {
        this.from = from;
    }

    public String getIp() {
        return ip;
    }

    protected void setIp(String ip) {
        this.ip = ip;
    }

    public String getTo() {
        return to;
    }

    protected void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "InboxMessage{" + "secondsAgo=" + secondsAgo + ", to=" + to + ", id=" + id + ", time=" + time + ", subject=" + subject + ", from=" + from + ", ip=" + ip + '}';
    }




}
