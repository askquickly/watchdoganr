package watchdog;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.*;

import com.github.anrwatchdog.ANRError;
import com.github.anrwatchdog.ANRWatchDog;

@Version(1.0f)
@ShortName("ANRWatchDog")
@DependsOn(values={"anrwatchdog-1.3.0"})
public class watchdog{
	/**
     * Constructs a watchdog that checks the ui thread every 5 seconds
	 * it logs the ANR error and closes the app
     */
	public void start(){
		new ANRWatchDog().start();
	}
	 /**
     * Constructs a watchdog that checks the ui thread every given interval
     *
     * @param timeoutInterval The interval, in milliseconds, between to checks of the UI thread.
     *          It is therefore the maximum time the UI may freeze before being reported as ANR.
     */
	public void startdelay(int t){
		new ANRWatchDog(t).start();
	}
    /**
     * Set whether to ignore the debugger when detecting ANRs.
     * When ignoring the debugger, ANRWatchdog will detect ANRs even if the debugger is connected.
     * By default, it does not, to avoid interpreting debugging pauses as ANRs.
     * Default false.
     *
     * @param ignoreDebugger Whether to ignore the debugger.
     * @return itself for chaining.
     */
	public void IgnoreDebugger(){
		new ANRWatchDog().setIgnoreDebugger(true).start();
	}
	/**
     * Set that only the main thread will be reported.
     *
     * @return itself for chaining.
     */
	public void MainThreadOnly(){
	new ANRWatchDog().setReportMainThreadOnly().start();
	}
	/**
     * Set the prefix that a thread's name must have for the thread to be reported.
     * Note that the main thread is always reported.
     *
     * @param prefix The thread name's prefix for a thread to be reported.
     * @return itself for chaining.
     */
	public void ReportByThreadName(String a){
	new ANRWatchDog().setReportThreadNamePrefix(a).start();
	}
	 /**
     * Set that all running threads will be reported,
     * even those from which no stack trace could be extracted.
     * Default false.
     *
     * @param logThreadsWithoutStackTrace Whether or not all running threads should be reported
     * @return itself for chaining.
     */
	public void setLogThreadsWithoutStackTrace(boolean b) {
		new ANRWatchDog().setLogThreadsWithoutStackTrace(b).start();
	}
}
