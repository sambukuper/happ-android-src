package defpackage;

import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pc4 {
    public final v85 X;
    public boolean Y;
    public int Z = -1;
    public final /* synthetic */ qc4 f0;

    public pc4(qc4 qc4Var, v85 v85Var) {
        this.f0 = qc4Var;
        this.X = v85Var;
    }

    public final void a(boolean z) {
        if (z == this.Y) {
            return;
        }
        this.Y = z;
        int i = z ? 1 : -1;
        qc4 qc4Var = this.f0;
        int i2 = qc4Var.c;
        qc4Var.c = i + i2;
        if (!qc4Var.d) {
            qc4Var.d = true;
            while (true) {
                try {
                    int i3 = qc4Var.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        qc4Var.g();
                    } else if (z3) {
                        qc4Var.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    qc4Var.d = false;
                    throw th;
                }
            }
            qc4Var.d = false;
        }
        if (this.Y) {
            qc4Var.c(this);
        }
    }

    public boolean c(BaseActivity baseActivity) {
        return false;
    }

    public boolean d() {
        return true;
    }

    public void b() {
    }
}
