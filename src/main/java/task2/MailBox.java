package task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private MailSender mailSender;
    private List<MailInfo> infos;

    public MailBox(){
        mailSender = new MailSender();
        infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {infos.add(mailInfo);}

    public void sendAll(){
        for (MailInfo letter: infos) {
            mailSender.sendMail(letter);
        }
    }
}
