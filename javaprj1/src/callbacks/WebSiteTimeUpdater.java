package callbacks;

public class WebSiteTimeUpdater {
	public static void main(String[] args) {
        SystemTimer systemTimer = new SystemTimer();
        TimeUpdaterCallBack webSiteCallBackUpdater = new WebSiteTimeUpdaterCallBack();
        systemTimer.registerCallBackForUpdatesEveryHour(webSiteCallBackUpdater);
        systemTimer.oneHourHasBeenExprired();
    }
}
