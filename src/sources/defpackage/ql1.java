package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class ql1 implements dn2 {
    public final /* synthetic */ byte X;
    public final sl1 Y;

    public /* synthetic */ ql1(sl1 sl1Var, byte b) {
        this.X = b;
        this.Y = sl1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        sl1 sl1Var = this.Y;
        switch (b) {
            case 0:
                pk1 pk1Var = pk1.m;
                et4.a.getClass();
                return sl1Var.i(pk1Var, cl1.F0);
            default:
                z14 z14Var = sl1Var.g;
                vl1 vl1Var = sl1Var.j;
                z14Var.getClass();
                vl1Var.getClass();
                Collection collectionC = ((i3) vl1Var.l()).c();
                collectionC.getClass();
                return collectionC;
        }
    }
}
