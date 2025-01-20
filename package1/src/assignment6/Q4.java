package assignment6;

public class Q4 {
public static int numberOfDaysInAYear(int year) {
	if ((year%4==0 && year%100 !=0) || year %400==0) {
	return 366;
	}
	return 365;
}
	public static void main(String[] args) {
  for (int year= 2000; year<=2020; year++) {
	  System.out.println("Year: " + year + " has " + numberOfDaysInAYear(year) + " days");
  }
	}

}

//Year: 2000 has 366 days
//Year: 2001 has 365 days
//Year: 2002 has 365 days
//Year: 2003 has 365 days
//Year: 2004 has 366 days
//Year: 2005 has 365 days
//Year: 2006 has 365 days
//Year: 2007 has 365 days
//Year: 2008 has 366 days
//Year: 2009 has 365 days
//Year: 2010 has 365 days
//Year: 2011 has 365 days
//Year: 2012 has 366 days
//Year: 2013 has 365 days
//Year: 2014 has 365 days
//Year: 2015 has 365 days
//Year: 2016 has 366 days
//Year: 2017 has 365 days
//Year: 2018 has 365 days
//Year: 2019 has 365 days
//Year: 2020 has 366 days