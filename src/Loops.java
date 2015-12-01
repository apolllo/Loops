import java.util.*;

public class Loops {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> lyrics = getSongLyrics();
        ArrayList<String> lyrics1 = getSongLyrics1();
        ArrayList<String> lyrics2 = getSongLyrics2();
        for (String verse : lyrics) {
            System.out.println(verse);
            System.out.println();
        }
        for (String verse : lyrics1) {
            System.out.println(verse);
            System.out.println();
        }
        lyrics2.forEach((String verse)->{
            System.out.println(verse);
            System.out.println();
        });
    }

    private static String selectSongSubject() {
        Random random = new Random();
        int option = random.ints(0,3).findAny().getAsInt();
        String subject = "";
        if (option == 0) {
            subject = "puppets";
        } else if (option == 1) {
            subject = "kettles";
        } else {
            subject = "bottles";
        }
        return subject;
    }

    private static ArrayList<String> getSongLyrics() {
        ArrayList<String> lyrics = new ArrayList<String>();
        String subject = selectSongSubject();
        String subjectPlural = subject;
        String subjectSingular = subject.substring(0,subject.length()-1);
        for (int i = 10; i > 0; i--) {
            subject = (i != 1) ? subjectPlural : subjectSingular;
            String firstLine = Integer.toString(i) + " green " + subject + " standing on the wall";
            String line = "But if one green " + subjectSingular + " should accidentally fall,";
            String lastLine = "There'll be ";
            lastLine += ((i == 1) ? "no" : Integer.toString(i-1));
            lastLine = lastLine + " green " + subjectPlural + " standing on the wall.";
            String verse = firstLine + "\r\n" + firstLine + "\r\n" + line + "\r\n" + lastLine;
            lyrics.add(verse);
        }
        return lyrics;
    }

    private static ArrayList<String> getSongLyrics1() {
        ArrayList<String> lyrics = new ArrayList<String>();
        String subject = selectSongSubject();
        String subjectPlural = subject;
        String subjectSingular = subject.substring(0,subject.length()-1);
        int i = 10;
        while (i > 0) {
            subject = (i != 1) ? subjectPlural : subjectSingular;
            String firstLine = Integer.toString(i) + " green " + subject + " standing on the wall";
            String line = "But if one green " + subjectSingular + " should accidentally fall,";
            String lastLine = "There'll be ";
            lastLine += ((i == 1) ? "no" : Integer.toString(i-1));
            lastLine = lastLine + " green " + subjectPlural + " standing on the wall.";
            String verse = firstLine + "\r\n" + firstLine + "\r\n" + line + "\r\n" + lastLine;
            lyrics.add(verse);
            i--;
        }
        return lyrics;
    }

    private static ArrayList<String> getSongLyrics2() {
        ArrayList<String> lyrics = new ArrayList<String>();
        String subject = selectSongSubject();
        String subjectPlural = subject;
        String subjectSingular = subject.substring(0,subject.length()-1);
        int i = 10;
        do {
            subject = (i != 1) ? subjectPlural : subjectSingular;
            String firstLine = Integer.toString(i) + " green " + subject + " standing on the wall";
            String line = "But if one green " + subjectSingular + " should accidentally fall,";
            String lastLine = "There'll be ";
            lastLine += ((i == 1) ? "no" : Integer.toString(i-1));
            lastLine = lastLine + " green " + subjectPlural + " standing on the wall.";
            String verse = firstLine + "\r\n" + firstLine + "\r\n" + line + "\r\n" + lastLine;
            lyrics.add(verse);
            i--;
        } while (i > 0);
        return lyrics;
    }
}