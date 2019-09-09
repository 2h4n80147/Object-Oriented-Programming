

class Time {
	int hour;
	int minute;
	int second;
	
	public boolean in_range (int x, int l, int r) {
		return (l <= x && x <= r);
	}
	void setHour(int h) throws Exception {
		if (!in_range (h, 0, 23))
		{
			throw new Exception("hour is invalid");
		}
		hour = h;
	}
	void setMinute (int m) throws Exception {
		if(!in_range(m, 0, 59))
			throw new Exception("minute is invalid");
		minute = m;
	}
	void setSecond (int s) throws Exception {
		
		if (!in_range (s, 0, 59))
			throw new Exception("second is invalid");
		second = s;
	}
	Time (int h, int m, int s) {
		try {
			setHour(h);
			setMinute(m);
			setSecond(s);
		} catch (Exception e) {
			System.out.println("Invalid time format " + e.getMessage());
		}
	}
	public String toUniversal () {
		String H = Integer.toString(hour);
		if (H.length() == 1)
			H = "0" + H;
		String M = Integer.toString(minute);
		if (M.length() == 1)
			M = "0" + M;
		String S = Integer.toString(second);
		if (S.length() == 1)
			S=  "0" +S;
		
		return H+":"+M+":"+S;
	}	
	public String toStandard () {
		
		
		
		int timer = hour * 3600 + minute * 60 + second;
		String day = "";
		if (timer < 12 * 60 * 60)
			day = "AM";
		else
			day = "PM";
		
		String H = Integer.toString((day == "AM" ? hour : (hour == 12 ? 12 : hour - 12)));
		if (H.length() == 1)
			H = "0" + H;
		String M = Integer.toString(minute);
		if (M.length() == 1)
			M = "0" + M;
		String S = Integer.toString(second);
		if (S.length() == 1)
			S=  "0" +S;
		return H+":"+M+":"+S+" " + day;
	}
	public void add (Time b) {
		hour += b.hour;
		minute += b.minute;
		second += b.second;
		
		minute += second/60;
		second %= 60;
		hour += minute/60;
		minute %= 60;
		hour %= 24;
	}
}
public class P4 {
	public static void main (String args[]) {
		Time t = new Time(23,5,6);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		
		Time t2 = new Time(4, 24, 33);
		System.out.println(t2.toUniversal());
		System.out.println(t2.toStandard());
		
		
		t.add(t2);

		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
	}
}
