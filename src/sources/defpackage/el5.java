package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class el5 extends xc8 {
    public final h80 b;
    public final cv5 c;

    public el5(o02 o02Var, h80 h80Var) {
        cv5 cv5Var;
        this.b = h80Var;
        if (o02Var.Y) {
            cv5Var = o02.f0;
        } else {
            int iMyPid = Process.myPid();
            String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : ie2.h("Process pid(", iMyPid, ")");
            synchronized (o02Var.X) {
                if (!o02Var.Y) {
                    o02.f0 = new cv5(o02Var, iMyPid, processName);
                    o02Var.Y = true;
                }
            }
            cv5Var = o02.f0;
        }
        this.c = cv5Var;
    }
}
