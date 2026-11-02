package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p29 implements a94 {
    public final /* synthetic */ m51 X;
    public final /* synthetic */ ai Y;
    public final /* synthetic */ p86 Z;
    public final /* synthetic */ ea6 f0;

    public p29(m51 m51Var, ai aiVar, p86 p86Var, ea6 ea6Var) {
        this.X = m51Var;
        this.Y = aiVar;
        this.Z = p86Var;
        this.f0 = ea6Var;
    }

    @Override // defpackage.a94
    public final void k(d94 d94Var, n84 n84Var) {
        boolean z;
        lm0 lm0VarY = null;
        switch (o29.a[n84Var.ordinal()]) {
            case 1:
                w51.G(this.X, null, e71.f0, new pi(this.f0, this.Z, d94Var, this, null, (byte) 20), 1);
                return;
            case 2:
                ai aiVar = this.Y;
                if (aiVar != null) {
                    sa2 sa2Var = (sa2) aiVar.Z;
                    synchronized (sa2Var.a) {
                        try {
                            synchronized (sa2Var.a) {
                                z = sa2Var.b;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) sa2Var.c;
                                sa2Var.c = (ArrayList) sa2Var.d;
                                sa2Var.d = arrayList;
                                sa2Var.b = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((q51) arrayList.get(i)).f(dn8.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                p86 p86Var = this.Z;
                synchronized (p86Var.c) {
                    if (p86Var.t) {
                        p86Var.t = false;
                        lm0VarY = p86Var.y();
                    }
                    break;
                }
                if (lm0VarY != null) {
                    ((mm0) lm0VarY).f(dn8.a);
                    return;
                }
                return;
            case 3:
                p86 p86Var2 = this.Z;
                synchronized (p86Var2.c) {
                    p86Var2.t = true;
                }
                return;
            case 4:
                this.Z.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                b61.c();
                return;
        }
    }
}
