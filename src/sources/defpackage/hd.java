package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Trace;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hd implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ hd(o87 o87Var, b71 b71Var, oi oiVar, dn2 dn2Var) {
        this.X = (byte) 5;
        this.Y = o87Var;
        this.f0 = b71Var;
        this.g0 = oiVar;
        this.Z = dn2Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00fe  */
    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = 0;
        byte b2 = 1;
        q51 q51Var = null;
        switch (this.X) {
            case 0:
                ((oo1) this.Y).i((dn2) this.Z, (vn1) this.f0, (z24) this.g0);
                return dn8.a;
            case 1:
                Context context = (Context) this.Y;
                wx wxVar = (wx) this.Z;
                t6 t6Var = (t6) this.f0;
                dq dqVar = (dq) this.g0;
                Trace.beginSection("CameraFactoryAdapter#appComponent");
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                l91 l91Var = new l91(new fu6(context, wxVar, (rj0) ((vz7) t6Var.Y).getValue(), dqVar, (vh0) t6Var.h0, (bm0) t6Var.g0));
                if (hi5.i0("CXCP")) {
                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                }
                Trace.endSection();
                return l91Var;
            case 2:
                gi0 gi0Var = (gi0) this.Y;
                Context context2 = (Context) this.Z;
                wx wxVar2 = (wx) this.f0;
                jx1 jx1Var = (jx1) this.g0;
                try {
                    Trace.beginSection("Create CameraPipe");
                    long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    Context contextA = o51.a(context2);
                    contextA.getClass();
                    pj0 pj0Var = new pj0(new c37(wxVar2.a), 119);
                    dq dqVar2 = gi0Var.a;
                    rj0 rj0VarA = tj0.a(new nj0(contextA, pj0Var, new lj0((hj0) dqVar2.Y, (dq) dqVar2.Z, jx1Var)));
                    if (hi5.i0("CXCP")) {
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos2) / 1000000.0d)}, 1));
                        break;
                    }
                    return rj0VarA;
                } finally {
                    Trace.endSection();
                }
            case 3:
                Float f = (Float) this.Y;
                lc3 lc3Var = (lc3) this.Z;
                Float f2 = (Float) this.f0;
                kc3 kc3Var = (kc3) this.g0;
                if (!f.equals(lc3Var.X) || !f2.equals(lc3Var.Y)) {
                    lc3Var.X = f;
                    lc3Var.Y = f2;
                    lc3Var.f0 = new t18(kc3Var, ys0.j0, f, f2, null);
                    lc3Var.j0.b.setValue(Boolean.TRUE);
                    lc3Var.g0 = false;
                    lc3Var.h0 = true;
                }
                return dn8.a;
            case 4:
                o87 o87Var = (o87) this.Y;
                wf7 wf7Var = (wf7) this.Z;
                wf7 wf7Var2 = (wf7) this.f0;
                wf7 wf7Var3 = (wf7) this.g0;
                o87Var.e = wf7Var;
                o87Var.f = wf7Var2;
                o87Var.c = wf7Var3;
                return dn8.a;
            case 5:
                o87 o87Var2 = (o87) this.Y;
                b71 b71Var = (b71) this.f0;
                oi oiVar = (oi) this.g0;
                dn2 dn2Var = (dn2) this.Z;
                if (((p87) ((rh5) o87Var2.d.i0).getValue()) == p87.Y) {
                    if (o87Var2.d.d().a.containsKey(p87.Z)) {
                        w51.G(b71Var, null, null, new fy2(oiVar, q51Var, b2), 3);
                        w51.G(b71Var, null, null, new uw4(o87Var2, q51Var, b), 3);
                    } else {
                        w51.G(b71Var, null, null, new uw4(o87Var2, q51Var, b2), 3).D(new xo(dn2Var, (byte) 2));
                    }
                } else {
                    w51.G(b71Var, null, null, new uw4(o87Var2, q51Var, b2), 3).D(new xo(dn2Var, (byte) 2));
                }
                return dn8.a;
            default:
                r39 r39Var = (r39) this.Y;
                UUID uuid = (UUID) this.Z;
                kj2 kj2Var = (kj2) this.f0;
                Context context3 = (Context) this.g0;
                String string = uuid.toString();
                l49 l49VarC = r39Var.Z.c(string);
                if (l49VarC == null || l49VarC.b.a()) {
                    bt.i("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    fv5 fv5Var = r39Var.Y;
                    synchronized (fv5Var.k) {
                        try {
                            lh4.P0().getClass();
                            a59 a59Var = (a59) fv5Var.g.remove(string);
                            if (a59Var != null) {
                                if (fv5Var.a == null) {
                                    PowerManager.WakeLock wakeLockA = yz8.a(fv5Var.b);
                                    fv5Var.a = wakeLockA;
                                    wakeLockA.acquire();
                                }
                                fv5Var.f.put(string, a59Var);
                                Intent intentC = i08.c(fv5Var.b, v18.b(a59Var.a), kj2Var);
                                Context context4 = fv5Var.b;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    ue3.h0(context4, intentC);
                                } else {
                                    context4.startService(intentC);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    s39 s39VarB = v18.b(l49VarC);
                    int i = i08.l0;
                    Intent intent = new Intent(context3, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", kj2Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", kj2Var.b);
                    intent.putExtra("KEY_NOTIFICATION", kj2Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", s39VarB.a);
                    intent.putExtra("KEY_GENERATION", s39VarB.b);
                    context3.startService(intent);
                }
                return null;
        }
    }

    public /* synthetic */ hd(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
    }
}
