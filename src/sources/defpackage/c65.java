package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c65 implements gn2 {
    public final /* synthetic */ byte X;
    public final z47 Y;

    public /* synthetic */ c65(z47 z47Var, byte b) {
        this.X = b;
        this.Y = z47Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        z47 z47Var = this.Y;
        switch (b) {
            case 0:
                fk2 fk2Var = (fk2) obj;
                fk2Var.getClass();
                return new h02((vx4) z47Var.Z, fk2Var, (byte) 0);
            default:
                d65 d65Var = (d65) obj;
                d65Var.getClass();
                qs0 qs0Var = d65Var.a;
                List list = d65Var.b;
                if (qs0Var.c) {
                    em7.j(qs0Var, "Unresolved local class: ");
                    return null;
                }
                qs0 qs0VarE = qs0Var.e();
                bt0 bt0VarE = qs0VarE != null ? z47Var.E(qs0VarE, wv0.o0(list, 1)) : (bt0) ((pe4) z47Var.f0).B(qs0Var.a);
                boolean zG = qs0Var.g();
                ve4 ve4Var = (ve4) z47Var.Y;
                v15 v15VarF = qs0Var.f();
                Integer num = (Integer) wv0.t0(list);
                return new e65(ve4Var, bt0VarE, v15VarF, zG, num != null ? num.intValue() : 0);
        }
    }
}
