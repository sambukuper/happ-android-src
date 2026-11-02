package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class xk3 implements dn2 {
    public final /* synthetic */ byte X;
    public final cl3 Y;

    public /* synthetic */ xk3(cl3 cl3Var, byte b) {
        this.X = b;
        this.Y = cl3Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        d02 d02Var = d02.X;
        cl3 cl3Var = this.Y;
        switch (b) {
            case 0:
                w79.m(cl3Var);
                return d02Var;
            case 1:
                if (!mb6.K(cl3Var)) {
                    return cl3Var.l();
                }
                w79.m(cl3Var);
                return d02Var;
            case 2:
                Type genericType = cl3Var.U().getGenericType();
                genericType.getClass();
                return w51.Q(genericType, e02.X, null, false, false, null, 30);
            default:
                return new bl3(cl3Var);
        }
    }
}
