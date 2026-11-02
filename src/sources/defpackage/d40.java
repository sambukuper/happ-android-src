package defpackage;

import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d40 implements Runnable {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ List Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;

    public /* synthetic */ d40(o88 o88Var, z24 z24Var, List list, ql qlVar, fi1 fi1Var, fi2 fi2Var, boolean z) {
        this.f0 = o88Var;
        this.g0 = z24Var;
        this.Y = list;
        this.h0 = qlVar;
        this.i0 = fi1Var;
        this.j0 = fi2Var;
        this.Z = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x05 x05VarC;
        byte b = this.X;
        Object obj = this.j0;
        List list = this.Y;
        Object obj2 = this.i0;
        Object obj3 = this.h0;
        Object obj4 = this.g0;
        Object obj5 = this.f0;
        switch (b) {
            case 0:
                o88 o88Var = (o88) obj5;
                z24 z24Var = (z24) obj4;
                ql qlVar = (ql) obj3;
                fi1 fi1Var = (fi1) obj2;
                fi2 fi2Var = (fi2) obj;
                boolean z = this.Z;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    dd7 dd7VarH = kd7.h();
                    x05 x05Var = dd7VarH instanceof x05 ? (x05) dd7VarH : null;
                    if (x05Var == null || (x05VarC = x05Var.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        dd7 dd7VarJ = x05VarC.j();
                        try {
                            o88 o88VarD = xt7.d(o88Var, z24Var);
                            if (list == null) {
                                list = d02.X;
                            }
                            y5 y5Var = new y5(qlVar, o88VarD, list, fi1Var, fi2Var, z);
                            y5Var.l();
                            y5Var.h();
                            dd7.q(dd7VarJ);
                            x05VarC.w().l();
                            x05VarC.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            dd7.q(dd7VarJ);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            x05VarC.c();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            default:
                WorkDatabase workDatabase = (WorkDatabase) obj5;
                String str = (String) obj4;
                l49 l49Var = (l49) obj3;
                l49 l49Var2 = (l49) obj2;
                Set set = (Set) obj;
                n49 n49VarX = workDatabase.x();
                p49 p49VarY = workDatabase.y();
                l49 l49VarB = l49.b(l49Var2, null, l49Var.b, null, null, l49Var.k, l49Var.n, l49Var.s, l49Var.t + 1, l49Var.u, l49Var.v, 29613053);
                if (l49Var2.v == 1) {
                    l49VarB.u = l49Var2.u;
                    l49VarB.v++;
                }
                l49 l49VarZ = z51.Z(list, l49VarB);
                n49VarX.getClass();
                u15.G(n49VarX.a, false, true, new py7(n49VarX, l49VarZ));
                p49VarY.getClass();
                str.getClass();
                u15.G(p49VarY.a, false, true, new nm7(str, (byte) 19));
                p49VarY.a(str, set);
                if (this.Z) {
                    return;
                }
                n49VarX.e(-1L, str);
                d49 d49VarW = workDatabase.w();
                d49VarW.getClass();
                u15.G(d49VarW.a, false, true, new nm7(str, (byte) 5));
                return;
        }
    }

    public /* synthetic */ d40(WorkDatabase workDatabase, String str, l49 l49Var, l49 l49Var2, List list, Set set, boolean z, x39 x39Var) {
        this.f0 = workDatabase;
        this.g0 = str;
        this.h0 = l49Var;
        this.i0 = l49Var2;
        this.Y = list;
        this.j0 = set;
        this.Z = z;
    }
}
