package defpackage;

import com.tencent.mmkv.MMKV;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import su.happ.proxyutility.dto.LogFileInfo;
import su.happ.proxyutility.dto.LogFileInfoKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class th4 extends xw8 {
    public final vz7 b = new vz7(new sh4((byte) 0));
    public final vz7 c = new vz7(new sh4((byte) 1));
    public final oh7 d;
    public final h76 e;
    public final u77 f;
    public final f76 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public th4() {
        oh7 oh7VarA = ph7.a(tf4.a);
        this.d = oh7VarA;
        this.e = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.f = u77VarB;
        this.g = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final kf4 e() {
        return (kf4) this.c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(fg4 fg4Var) {
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        Object value3;
        Object objA3;
        Object value4;
        Object objA4;
        Object value5;
        Object value6;
        boolean z = fg4Var instanceof ag4;
        ec7 ec7Var = ec7.Y;
        vz7 vz7Var = this.b;
        oh7 oh7Var = this.d;
        if (z) {
            oh7Var.getClass();
            do {
                value5 = oh7Var.getValue();
                ((uf4) value5).getClass();
            } while (!oh7Var.k(value5, tf4.a));
            int iE = ((MMKV) vz7Var.getValue()).e(-1, "pref_logs_type");
            e69.Z.getClass();
            e69 e69VarI = f08.i(iE);
            int iE2 = ((MMKV) vz7Var.getValue()).e(-1, "pref_logs_output_type");
            nf4.Y.getClass();
            nf4 nf4Var = (nf4) wv0.u0(iE2, nf4.g0);
            if (nf4Var == null) {
                nf4Var = nf4.AUTO;
            }
            nf4 nf4Var2 = nf4Var;
            kf4 kf4VarE = e();
            kf4VarE.getClass();
            LogFileInfo logFileInfo = kf4VarE.g;
            File file = new File(logFileInfo.getPath());
            kf4.c(file, 1);
            if (!file.exists()) {
                logFileInfo = null;
            }
            lf4 lf4VarA = logFileInfo != null ? LogFileInfoKt.a(logFileInfo) : null;
            kf4 kf4VarE2 = e();
            kf4VarE2.getClass();
            LogFileInfo logFileInfo2 = kf4VarE2.h;
            File file2 = new File(logFileInfo2.getPath());
            kf4.c(file2, 1);
            if (!file2.exists()) {
                logFileInfo2 = null;
            }
            lf4 lf4VarA2 = logFileInfo2 != null ? LogFileInfoKt.a(logFileInfo2) : null;
            kf4 kf4VarE3 = e();
            kf4VarE3.getClass();
            LogFileInfo logFileInfo3 = kf4VarE3.i;
            File file3 = new File(logFileInfo3.getPath());
            kf4.c(file3, 1);
            if (!file3.exists()) {
                logFileInfo3 = null;
            }
            lf4 lf4VarA3 = logFileInfo3 != null ? LogFileInfoKt.a(logFileInfo3) : null;
            List listF = e().f();
            qm5 qm5VarC = ec7Var.c();
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                lf4 lf4VarA4 = LogFileInfoKt.a((LogFileInfo) it.next());
                if (lf4VarA4 != null) {
                    qm5VarC.add(lf4VarA4);
                }
            }
            j2 j2VarC = qm5VarC.c();
            do {
                value6 = oh7Var.getValue();
                ((uf4) value6).getClass();
            } while (!oh7Var.k(value6, new sf4(e69VarI, nf4Var2, lf4VarA, lf4VarA2, lf4VarA3, j2VarC, null)));
            return;
        }
        if (fg4Var instanceof bg4) {
            e69 e69Var = ((bg4) fg4Var).a;
            ((MMKV) vz7Var.getValue()).l(e69Var.ordinal(), "pref_logs_type");
            oh7Var.getClass();
            do {
                value4 = oh7Var.getValue();
                objA4 = (uf4) value4;
                objA4.getClass();
                if (objA4 instanceof sf4) {
                    objA4 = sf4.a((sf4) objA4, e69Var, null, null, null, 126);
                } else if (!(objA4 instanceof tf4)) {
                    b61.c();
                    return;
                }
            } while (!oh7Var.k(value4, objA4));
            return;
        }
        if (fg4Var instanceof cg4) {
            nf4 nf4Var3 = ((cg4) fg4Var).a;
            ((MMKV) vz7Var.getValue()).l(nf4Var3.ordinal(), "pref_logs_output_type");
            oh7Var.getClass();
            do {
                value3 = oh7Var.getValue();
                objA3 = (uf4) value3;
                objA3.getClass();
                if (objA3 instanceof sf4) {
                    objA3 = sf4.a((sf4) objA3, null, nf4Var3, null, null, 125);
                } else if (!(objA3 instanceof tf4)) {
                    b61.c();
                    return;
                }
            } while (!oh7Var.k(value3, objA3));
            return;
        }
        if (fg4Var instanceof eg4) {
            jm4.Q(zw8.a(this), (u61) null, new r5(this, (q51) null, (byte) 18), 3);
            return;
        }
        if (fg4Var instanceof dg4) {
            jm4.Q(zw8.a(this), (u61) null, new jy2(this, ((dg4) fg4Var).a, (q51) null, (byte) 7), 3);
            return;
        }
        if (fg4Var instanceof zf4) {
            String str = ((zf4) fg4Var).a;
            oh7Var.getClass();
            do {
                value2 = oh7Var.getValue();
                objA2 = (uf4) value2;
                objA2.getClass();
                if (objA2 instanceof sf4) {
                    objA2 = sf4.a((sf4) objA2, null, null, null, str, 63);
                } else if (!(objA2 instanceof tf4)) {
                    b61.c();
                    return;
                }
            } while (!oh7Var.k(value2, objA2));
            return;
        }
        if (!(fg4Var instanceof yf4)) {
            b61.c();
            return;
        }
        e().j(((yf4) fg4Var).a);
        List listF2 = e().f();
        qm5 qm5VarC2 = ec7Var.c();
        Iterator it2 = listF2.iterator();
        while (it2.hasNext()) {
            lf4 lf4VarA5 = LogFileInfoKt.a((LogFileInfo) it2.next());
            if (lf4VarA5 != null) {
                qm5VarC2.add(lf4VarA5);
            }
        }
        j2 j2VarC2 = qm5VarC2.c();
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            objA = (uf4) value;
            objA.getClass();
            if (objA instanceof sf4) {
                objA = sf4.a((sf4) objA, null, null, j2VarC2, null, 95);
            } else if (!(objA instanceof tf4)) {
                b61.c();
                return;
            }
        } while (!oh7Var.k(value, objA));
    }
}
