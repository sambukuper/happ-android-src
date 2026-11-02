package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dv5 {
    static {
        lh4.a1("ProcessUtils");
    }

    public static final boolean a(Context context, xy0 xy0Var) {
        String strX;
        Object next;
        context.getClass();
        xy0Var.getClass();
        String str = (String) xy0Var.i0;
        if (Build.VERSION.SDK_INT >= 28) {
            strX = en.x();
        } else {
            strX = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, w39.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
                if (objInvoke instanceof String) {
                    strX = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strX = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable unused) {
                lh4.P0().getClass();
            }
        }
        return (str == null || str.length() == 0) ? dh3.f(strX, context.getApplicationInfo().processName) : dh3.f(strX, str);
    }
}
