package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.multiprocess.RemoteWorkerService;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hc4 extends c43 {
    public static final byte[] p;
    public final Context h;
    public final xy0 i;
    public final y5 j;
    public final we5 k;
    public final Object l;
    public final HashMap m;
    public final HashMap n;
    public final HashMap o;

    static {
        lh4.a1("ListenableWorkerImpl");
        p = new byte[0];
    }

    public hc4(RemoteWorkerService remoteWorkerService) {
        attachInterface(this, d43.a);
        this.h = remoteWorkerService.getApplicationContext();
        z47 z47VarI = z47.I(remoteWorkerService);
        this.i = (xy0) z47VarI.Y;
        this.j = (y5) z47VarI.Z;
        this.k = (we5) z47VarI.g0;
        this.l = new Object();
        this.m = new HashMap();
        this.n = new HashMap();
        this.o = new HashMap();
    }

    public final void b(String str, String str2, WorkerParameters workerParameters) {
        HashMap map = this.m;
        ec4 ec4Var = (ec4) map.get(str);
        HashMap map2 = this.n;
        Throwable th = (Throwable) map2.get(str);
        if (ec4Var == null && th == null) {
            try {
                this.i.getClass();
                map.put(str, pz2.G0.l(this.h, str2, workerParameters));
            } catch (Throwable th2) {
                map2.put(str, th2);
            }
        }
    }

    @Override // defpackage.d43
    public final void e(r43 r43Var, byte[] bArr) {
        r43 r43Var2;
        y5 y5Var = this.j;
        try {
            kh5 kh5Var = (kh5) w79.O(bArr, kh5.CREATOR);
            ai5 ai5Var = kh5Var.Y;
            xy0 xy0Var = this.i;
            we5 we5Var = this.k;
            UUID uuid = ai5Var.X;
            WorkerParameters workerParameters = new WorkerParameters(uuid, ai5Var.Y, ai5Var.Z, ai5Var.f0, ai5Var.g0, ai5Var.h0, (Executor) xy0Var.Y, (u61) xy0Var.Z, y5Var, we5Var);
            String string = uuid.toString();
            String str = kh5Var.X;
            lh4.P0().getClass();
            wy7 wy7VarF = f(str, workerParameters);
            r43Var2 = r43Var;
            try {
                wy7VarF.Y.a(new oo0(this, wy7VarF, r43Var2, string, (byte) 1), (h37) y5Var.Y);
            } catch (Throwable th) {
                th = th;
                vb4.a(r43Var2, th);
            }
        } catch (Throwable th2) {
            th = th2;
            r43Var2 = r43Var;
        }
    }

    public final wy7 f(String str, WorkerParameters workerParameters) {
        wy7 wy7VarA;
        String string = workerParameters.a.toString();
        synchronized (this.l) {
            b(string, str, workerParameters);
            ec4 ec4Var = (ec4) this.m.get(string);
            Throwable th = (Throwable) this.n.get(string);
            xy0 xy0Var = this.i;
            y5 y5Var = this.j;
            xy0Var.getClass();
            str.getClass();
            y5Var.getClass();
            ki3 ki3Var = (ki3) y5Var.h0;
            ki3Var.getClass();
            u61 u61VarX = nr4.x(ki3Var);
            m51 m51Var = xy7.a;
            wy7VarA = xy7.a(u61VarX, false, new ia1(ec4Var, th, xy0Var, y5Var, str, workerParameters, null));
            this.o.put(string, wy7VarA);
        }
        return wy7VarA;
    }

    @Override // defpackage.d43
    public final void h(r43 r43Var, byte[] bArr) {
        ec4 ec4Var;
        Throwable th;
        try {
            kh5 kh5Var = (kh5) w79.O(bArr, kh5.CREATOR);
            ai5 ai5Var = kh5Var.Y;
            xy0 xy0Var = this.i;
            y5 y5Var = this.j;
            we5 we5Var = this.k;
            UUID uuid = ai5Var.X;
            WorkerParameters workerParameters = new WorkerParameters(uuid, ai5Var.Y, ai5Var.Z, ai5Var.f0, ai5Var.g0, ai5Var.h0, (Executor) xy0Var.Y, (u61) xy0Var.Z, y5Var, we5Var);
            String string = uuid.toString();
            String str = kh5Var.X;
            synchronized (this.l) {
                b(string, str, workerParameters);
                ec4Var = (ec4) this.m.get(string);
                th = (Throwable) this.n.get(string);
            }
            if (th != null) {
                vb4.a(r43Var, th);
            } else if (ec4Var != null) {
                ((h37) this.j.Y).execute(new gc4(this, ec4Var, r43Var));
            } else {
                vb4.a(r43Var, new IllegalStateException("Should never happen."));
            }
        } catch (Throwable th2) {
            vb4.a(r43Var, th2);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0045 */
    @Override // defpackage.d43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.r43 r7, byte[] r8) {
        /*
            r6 = this;
            android.os.Parcelable$Creator<ih5> r0 = defpackage.ih5.CREATOR     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = defpackage.w79.O(r8, r0)     // Catch: java.lang.Throwable -> L36
            ih5 r8 = (defpackage.ih5) r8     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = r8.X     // Catch: java.lang.Throwable -> L36
            int r3 = r8.Y     // Catch: java.lang.Throwable -> L36
            lh4 r8 = defpackage.lh4.P0()     // Catch: java.lang.Throwable -> L36
            r8.getClass()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = r6.l     // Catch: java.lang.Throwable -> L36
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L36
            java.util.HashMap r0 = r6.m     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L40
            r2 = r0
            ec4 r2 = (defpackage.ec4) r2     // Catch: java.lang.Throwable -> L40
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L39
            y5 r8 = r6.j     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = r8.Y     // Catch: java.lang.Throwable -> L36
            h37 r8 = (defpackage.h37) r8     // Catch: java.lang.Throwable -> L36
            fc4 r0 = new fc4     // Catch: java.lang.Throwable -> L36
            r1 = r6
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L33
            r8.execute(r0)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r0 = move-exception
        L34:
            r6 = r0
            goto L47
        L36:
            r0 = move-exception
            r5 = r7
            goto L34
        L39:
            r5 = r7
            byte[] r6 = defpackage.hc4.p     // Catch: java.lang.Throwable -> L33
            defpackage.vb4.b(r5, r6)     // Catch: java.lang.Throwable -> L33
            return
        L40:
            r0 = move-exception
            r5 = r7
        L42:
            r6 = r0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L45
            throw r6     // Catch: java.lang.Throwable -> L33
        L45:
            r0 = move-exception
            goto L42
        L47:
            defpackage.vb4.a(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc4.l(r43, byte[]):void");
    }
}
