package A_DateAndTime;

import java.util.Date;

public class D_DueDate {

	public static void main(String[] args) {

		Date date = new Date();
		
		System.out.printf("%1$s %2$tb %2$td %2$tY%n", "Due date:", date);
		
		//%1$s -> due date (if capital S then all caps ang due date)
		//%2$tb -> kapag lower b then shortcut ng Month, kapag capital B then full name ng month
		//%2$tD -> kapag capital D ay full date with slash (e.g.02/23/21) kapag small d ay date lang.(e.g. 23)
		//%2$tY -> kapag lower y then ung 2 last digit ng taon (e.g.2021 means 21) kapag capital Y then full year name (e.g. 2021)

		System.out.printf("%s %tB %<te, %<tY ", "Due date:", date);
	}

}
