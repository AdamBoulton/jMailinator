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
    private String fromFull;
    private boolean beenRead;
    private String from;
    private String ip;

    
    //Auto generated getter / setters
    public long getSeconds_ago() {
        return secondsAgo;
    }

    public void setSeconds_ago(long seconds_ago) {
        this.secondsAgo = seconds_ago;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFromfull() {
        return fromFull;
    }

    public void setFromfull(String fromfull) {
        this.fromFull = fromfull;
    }

    public boolean isBeen_read() {
        return beenRead;
    }

    public void setBeen_read(boolean been_read) {
        this.beenRead = been_read;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Message{" + "seconds_ago=" + secondsAgo + ", to=" + to + ", id=" + id + ", time=" + time + ", subject=" + subject + ", fromfull=" + fromFull + ", been_read=" + beenRead + ", from=" + from + ", ip=" + ip + '}';
    }


}
