package defpackage;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nk3 implements dn2 {
    public final /* synthetic */ byte X;
    public final pk3 Y;

    public /* synthetic */ nk3(pk3 pk3Var, byte b) {
        this.X = b;
        this.Y = pk3Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        pk3 pk3Var = this.Y;
        switch (b) {
            case 0:
                TypeVariable[] typeParameters = pk3Var.Y.t().getTypeParameters();
                TypeVariable[] typeParameters2 = pk3Var.X().getTypeParameters();
                typeParameters2.getClass();
                typeParameters.getClass();
                int length = typeParameters.length;
                int length2 = typeParameters2.length;
                Object[] objArrCopyOf = Arrays.copyOf(typeParameters, length + length2);
                System.arraycopy(typeParameters2, 0, objArrCopyOf, length, length2);
                return (TypeVariable[]) objArrCopyOf;
            case 1:
                return z39.l(pk3Var);
            default:
                return mb6.K(pk3Var) ? new zd0(pk3Var.X(), mb6.C(pk3Var)) : new ae0(pk3Var.X());
        }
    }
}
