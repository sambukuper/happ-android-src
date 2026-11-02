package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n13 implements je7 {
    public final dk2 X;
    public boolean Y;
    public final /* synthetic */ r13 Z;

    public n13(r13 r13Var) {
        this.Z = r13Var;
        this.X = new dk2(r13Var.c.timeout());
    }

    public final void g() {
        r13 r13Var = this.Z;
        byte b = r13Var.e;
        if (b == 6) {
            return;
        }
        if (b != 5) {
            om0.e(r13Var.e, "state: ");
            return;
        }
        dk2 dk2Var = this.X;
        ta8 ta8Var = dk2Var.a;
        ta8 ta8Var2 = ta8.NONE;
        ta8Var2.getClass();
        dk2Var.a = ta8Var2;
        ta8Var.clearDeadline();
        ta8Var.clearTimeout();
        r13Var.e = (byte) 6;
    }

    @Override // defpackage.je7
    public long read(i90 i90Var, long j) throws IOException {
        r13 r13Var = this.Z;
        i90Var.getClass();
        try {
            return r13Var.c.read(i90Var, j);
        } catch (IOException e) {
            r13Var.b.k();
            g();
            throw e;
        }
    }

    @Override // defpackage.je7
    public final ta8 timeout() {
        return this.X;
    }
}
