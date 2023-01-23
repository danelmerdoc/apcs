public class DateForApcs2{
    
    public short year;
    public byte month_0_11;
    public byte day_1_31;
    
    public String iso8601() {
            return (year + "-" + (month_0_11 + 1) + "-" + day_1_31);
        }
    public Boolean isLeapYear (){
       
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0); 
    }
    public Boolean isEarlyJuly(){
        if (month_0_11 > 6){
            return true;
        }
        else if (month_0_11 == 6 && day_1_31 < 16){
            return true;
        }
        else{
            return false;
        }
    }
    }
