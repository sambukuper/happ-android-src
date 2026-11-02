package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class xh4 implements gn2 {
    public final /* synthetic */ j74 X;
    public final /* synthetic */ b71 Y;
    public final /* synthetic */ float Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xh4(j74 j74Var, b71 b71Var, float f) {
        this.X = j74Var;
        this.Y = b71Var;
        this.Z = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        KeyEvent keyEvent = ((cx3) obj).a;
        keyEvent.getClass();
        long jD = pu.d(keyEvent.getKeyCode());
        long j = ax3.d;
        boolean zA = ax3.a(jD, j);
        boolean z = false;
        j74 j74Var = this.X;
        if (!zA || j74Var.j()) {
            boolean zA2 = ax3.a(jD, j);
            b71 b71Var = this.Y;
            float f = this.Z;
            if (zA2 && w39.S(keyEvent) == 2) {
                jm4.Q(b71Var, (u61) null, new wh4(j74Var, f, null, (byte) 0), 3);
            } else if (ax3.a(jD, ax3.e) && w39.S(keyEvent) == 2) {
                jm4.Q(b71Var, (u61) null, new wh4(j74Var, f, null, (byte) 1), 3);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
