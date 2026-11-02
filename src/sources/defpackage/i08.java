package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i08 implements ha5, p52 {
    public static final /* synthetic */ int l0 = 0;
    public final x39 X;
    public final y5 Y;
    public final Object Z = new Object();
    public s39 f0;
    public final LinkedHashMap g0;
    public final HashMap h0;
    public final HashMap i0;
    public final cc0 j0;
    public SystemForegroundService k0;

    static {
        lh4.a1("SystemFgDispatcher");
    }

    public i08(Context context) {
        x39 x39VarV0 = x39.v0(context);
        this.X = x39VarV0;
        this.Y = x39VarV0.l0;
        this.f0 = null;
        this.g0 = new LinkedHashMap();
        this.i0 = new HashMap();
        this.h0 = new HashMap();
        this.j0 = new cc0(x39VarV0.s0);
        x39VarV0.n0.a(this);
    }

    public static Intent c(Context context, s39 s39Var, kj2 kj2Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", s39Var.a);
        intent.putExtra("KEY_GENERATION", s39Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", kj2Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", kj2Var.b);
        intent.putExtra("KEY_NOTIFICATION", kj2Var.c);
        return intent;
    }

    @Override // defpackage.ha5
    public final void a(l49 l49Var, x31 x31Var) {
        if (x31Var instanceof w31) {
            lh4.P0().getClass();
            s39 s39VarB = v18.b(l49Var);
            int i = ((w31) x31Var).a;
            x39 x39Var = this.X;
            y5 y5Var = x39Var.l0;
            ((h37) y5Var.Y).execute(new uj7(x39Var.n0, new bh7(s39VarB), true, i));
        }
    }

    @Override // defpackage.p52
    public final void b(s39 s39Var, boolean z) {
        Map.Entry entry;
        synchronized (this.Z) {
            try {
                bm3 bm3Var = ((l49) this.h0.remove(s39Var)) != null ? (bm3) this.i0.remove(s39Var) : null;
                if (bm3Var != null) {
                    bm3Var.m(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        kj2 kj2Var = (kj2) this.g0.remove(s39Var);
        if (s39Var.equals(this.f0)) {
            if (this.g0.size() > 0) {
                Iterator it = this.g0.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f0 = (s39) entry.getKey();
                if (this.k0 != null) {
                    kj2 kj2Var2 = (kj2) entry.getValue();
                    SystemForegroundService systemForegroundService = this.k0;
                    int i = kj2Var2.a;
                    int i2 = kj2Var2.b;
                    Notification notification = kj2Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        wa.K(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        wa.J(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.k0.f0.cancel(kj2Var2.a);
                }
            } else {
                this.f0 = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.k0;
        if (kj2Var == null || systemForegroundService2 == null) {
            return;
        }
        lh4 lh4VarP0 = lh4.P0();
        s39Var.toString();
        lh4VarP0.getClass();
        systemForegroundService2.f0.cancel(kj2Var.a);
    }

    public final void d(Intent intent) {
        if (this.k0 == null) {
            bt.i("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        s39 s39Var = new s39(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        lh4.P0().getClass();
        if (notification == null) {
            bt.q("Notification passed in the intent was null.");
            return;
        }
        kj2 kj2Var = new kj2(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.g0;
        linkedHashMap.put(s39Var, kj2Var);
        kj2 kj2Var2 = (kj2) linkedHashMap.get(this.f0);
        if (kj2Var2 == null) {
            this.f0 = s39Var;
        } else {
            this.k0.f0.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((kj2) ((Map.Entry) it.next()).getValue()).b;
                }
                kj2Var = new kj2(kj2Var2.a, kj2Var2.c, i);
            } else {
                kj2Var = kj2Var2;
            }
        }
        SystemForegroundService systemForegroundService = this.k0;
        int i2 = kj2Var.a;
        int i3 = kj2Var.b;
        Notification notification2 = kj2Var.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            wa.K(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            wa.J(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    public final void e() {
        this.k0 = null;
        synchronized (this.Z) {
            try {
                Iterator it = this.i0.values().iterator();
                while (it.hasNext()) {
                    ((bm3) it.next()).m(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        fv5 fv5Var = this.X.n0;
        synchronized (fv5Var.k) {
            fv5Var.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        lh4.P0().getClass();
        for (Map.Entry entry : this.g0.entrySet()) {
            if (((kj2) entry.getValue()).b == i2) {
                s39 s39Var = (s39) entry.getKey();
                x39 x39Var = this.X;
                y5 y5Var = x39Var.l0;
                ((h37) y5Var.Y).execute(new uj7(x39Var.n0, new bh7(s39Var), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.k0;
        if (systemForegroundService != null) {
            systemForegroundService.Y = true;
            lh4.P0().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i);
        }
    }
}
