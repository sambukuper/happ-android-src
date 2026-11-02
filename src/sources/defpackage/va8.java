package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class va8 extends fx6 implements Runnable {
    public final long h0;

    public va8(long j, s51 s51Var) {
        super(s51Var, s51Var.w());
        this.h0 = j;
    }

    @Override // defpackage.e1, defpackage.rm3
    public final String X() {
        return super.X() + "(timeMillis=" + this.h0 + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        s61 s61Var = this.f0;
        u70.M(s61Var);
        x61 x61Var = (x61) s61Var.H0(x61.Z);
        String str = x61Var != null ? x61Var.Y : null;
        String string = "Timed out waiting for " + this.h0 + " ms";
        if (str != null) {
            StringBuilder sbP = p61.p("Coroutine \"", str, "\" ");
            if (string.length() > 0) {
                string = Character.toLowerCase(string.charAt(0)) + string.substring(1);
            }
            sbP.append(string);
            string = sbP.toString();
        }
        i(new ua8(string, this));
    }
}
