package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fv5 {
    public final Context b;
    public final xy0 c;
    public final y5 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    static {
        lh4.a1("Processor");
    }

    public fv5(Context context, xy0 xy0Var, y5 y5Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = xy0Var;
        this.d = y5Var;
        this.e = workDatabase;
    }

    public static boolean d(a59 a59Var, int i) {
        if (a59Var == null) {
            lh4.P0().getClass();
            return false;
        }
        a59Var.l.i(new r49(i));
        lh4.P0().getClass();
        return true;
    }

    public final void a(p52 p52Var) {
        synchronized (this.k) {
            this.j.add(p52Var);
        }
    }

    public final a59 b(String str) {
        a59 a59Var = (a59) this.f.remove(str);
        boolean z = a59Var != null;
        if (!z) {
            a59Var = (a59) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        int i = i08.l0;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable unused) {
                            lh4.P0().getClass();
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a59Var;
    }

    public final a59 c(String str) {
        a59 a59Var = (a59) this.f.get(str);
        return a59Var == null ? (a59) this.g.get(str) : a59Var;
    }
}
