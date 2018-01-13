A simple watchdog that detects Android ANRs (Application Not Responding) for B4A

Usage:

<pre>
Sub Globals
Dim ANR As WatchDog
End Sub
</pre>

<pre>
Sub Activity_Create(FirstTime As Boolean)
ANR.Startdelay(10000)
End Sub
</pre>
