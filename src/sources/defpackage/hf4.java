package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class hf4 implements gn2 {
    public final /* synthetic */ la X;
    public final /* synthetic */ b71 Y;
    public final /* synthetic */ dn2 Z;
    public final /* synthetic */ gn2 f0;
    public final /* synthetic */ lf4 g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hf4(la laVar, b71 b71Var, dn2 dn2Var, gn2 gn2Var, lf4 lf4Var) {
        this.X = laVar;
        this.Y = b71Var;
        this.Z = dn2Var;
        this.f0 = gn2Var;
        this.g0 = lf4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        KeyEvent keyEvent = ((cx3) obj).a;
        keyEvent.getClass();
        long jD = pu.d(keyEvent.getKeyCode());
        long j = ax3.g;
        boolean zA = ax3.a(jD, j);
        boolean z = false;
        b71 b71Var = this.Y;
        la laVar = this.X;
        if (zA && w39.S(keyEvent) == 2 && laVar.d.getValue() == dv1.X) {
            jm4.Q(b71Var, (u61) null, new gf4(laVar, null, (byte) 0), 3);
        } else {
            boolean zA2 = ax3.a(jD, j);
            dv1 dv1Var = dv1.Y;
            if (!zA2 || w39.S(keyEvent) != 2 || laVar.d.getValue() != dv1Var) {
                if (ax3.a(jD, ax3.f) && w39.S(keyEvent) == 2 && laVar.d.getValue() == dv1Var) {
                    jm4.Q(b71Var, (u61) null, new gf4(laVar, null, (byte) 1), 3);
                }
                return Boolean.valueOf(z);
            }
            dn2 dn2Var = this.Z;
            if (dn2Var != null) {
                dn2Var.invoke();
            }
            String str = this.g0.b;
            str.getClass();
            this.f0.B(new yf4(str));
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
