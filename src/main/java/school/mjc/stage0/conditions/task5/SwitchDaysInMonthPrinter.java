package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {

        String season; // season

        switch (month) {
            case (1):
                season = "31";
                break;
            case (2):
                season = "28";
                break;
            case (3):
                season = "31";
                break;
            case (4):
                season = "30";
                break;
            case (5):
                season = "31";
                break;
            case (6):
                season = "30";
                break;
            case (7):
                season = "31";
                break;
            case (8):
                season = "31";
                break;
            case (9):
                season = "30";
                break;
            case (10):
                season = "31";
                break;
            case (11):
                season = "30";
                break;
            case (12):
                season = "31";
                break;
            default:
                season = "wrong number!";
                break;

        }
        System.out.println(season);
    }
}
