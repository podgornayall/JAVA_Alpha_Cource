package work22;

public class Task22 {
    public static void main(String[] args) {
        long msec;
        long dd,yy,hh,mm,ss;
        boolean leapYear;

        msec=System.currentTimeMillis();
        dd=msec/(24*60*60*1000);
        yy=1970+dd/365;
        dd=(dd+1)%365-(yy-1601)/400+(yy-1901)/100-(yy-1969)/4;
        yy+=(dd/365);
        leapYear=((yy%4) == 0) & ((yy%100) != 0) | ((yy % 400) == 0);
        msec%=(24*60*60*1000);
        hh=msec/(3_600_000)+2;
        msec%=(3_600_000);
        mm=msec/(60_000);
        msec%=(60_000);
        ss=msec/1000;

        System.out.println("Дата в формате DD:HH:MM:SS > "+dd+":"+hh+":"+mm+":"+ss+" где DD - день в году");
    }
}
