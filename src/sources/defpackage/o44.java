package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o44 implements dn2 {
    public final /* synthetic */ byte X;
    public final p44 Y;

    public /* synthetic */ o44(p44 p44Var, byte b) {
        this.X = b;
        this.Y = p44Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        p44 p44Var = this.Y;
        switch (b) {
            case 0:
                if (el1.f(p44Var) == null) {
                    return null;
                }
                Object obj = p44Var.i0.Y;
                return null;
            case 1:
                ta6 ta6Var = p44Var.j0;
                ArrayList<hb6> typeParameters = ta6Var.getTypeParameters();
                ArrayList arrayList = new ArrayList(xv0.Z(typeParameters, 10));
                for (hb6 hb6Var : typeParameters) {
                    hi8 hi8VarM = ((ki8) p44Var.l0.Z).M(hb6Var);
                    if (hi8VarM == null) {
                        throw new AssertionError("Parameter " + hb6Var + " surely belongs to class " + ta6Var + ", so it must be resolved");
                    }
                    arrayList.add(hi8VarM);
                }
                return arrayList;
            default:
                return pw7.d(p44Var);
        }
    }
}
