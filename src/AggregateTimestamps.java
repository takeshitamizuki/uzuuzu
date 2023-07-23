import java.sql.Time;

public class AggregateTimestamps {

	public static void main(String[] args) {

				final int    HOURLY_SALARY            = 900;
				final int    MINUTES_SALARY           = HOURLY_SALARY / 60;
				final int    CONV_HOUR_TO_MILLISEC    = 1000 * 60 * 60;
				final int    CONV_MINUTE_TO_MILLISEC  = 1000 * 60;
				final int    CONV_HOUR_TO_MINUTE      = 60;
				final long   WORK_TIME_TYPE1_END      = 6  * CONV_HOUR_TO_MILLISEC;
				final long   WORK_TIME_TYPE2_START    = 6  * CONV_HOUR_TO_MILLISEC;
				final long   WORK_TIME_TYPE2_END      = 8  * CONV_HOUR_TO_MILLISEC;
				final long   WORK_TIME_TYPE3_START    = 8  * CONV_HOUR_TO_MILLISEC;
				final long   REST_TIME_TYPE1          = 45 * CONV_MINUTE_TO_MILLISEC;
				final long   REST_TIME_TYPE2          = 60 * CONV_MINUTE_TO_MILLISEC;
				final double OVERTIME_SALARY_RATE     = 1.25;
				final int    ACTUAL_WORK_TIME_OVERTIME_OCCUR_MIN = 8  * CONV_HOUR_TO_MINUTE;

				Time startTime            = Time.valueOf(args[0]);
				Time finishTime           = Time.valueOf(args[1]);
				long workTime             = finishTime.getTime() - startTime.getTime();
				int  actualWorkTimeMin    = 0;
				int  partTimeFee          = 0;
				
				if (workTime <= WORK_TIME_TYPE1_END) {
					actualWorkTimeMin = (int)( workTime / CONV_MINUTE_TO_MILLISEC ) ;
				} else if (workTime > WORK_TIME_TYPE2_START && workTime <= WORK_TIME_TYPE2_END) {
					actualWorkTimeMin = (int)( (  workTime - REST_TIME_TYPE1 ) / CONV_MINUTE_TO_MILLISEC ) ;
				} else if (workTime > WORK_TIME_TYPE3_START){
					actualWorkTimeMin = (int)( ( workTime - REST_TIME_TYPE2 ) / CONV_MINUTE_TO_MILLISEC ) ;
				}
				if( actualWorkTimeMin > ACTUAL_WORK_TIME_OVERTIME_OCCUR_MIN ) {
					partTimeFee = ( MINUTES_SALARY * ACTUAL_WORK_TIME_OVERTIME_OCCUR_MIN )
					              + (int)( MINUTES_SALARY * OVERTIME_SALARY_RATE * ( actualWorkTimeMin - ACTUAL_WORK_TIME_OVERTIME_OCCUR_MIN ) );
				} else {
					partTimeFee = MINUTES_SALARY * actualWorkTimeMin;
				}
				System.out.println("本日の給与は" + partTimeFee + "円です");
	}
}
