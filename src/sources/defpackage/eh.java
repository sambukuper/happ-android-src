package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eh implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ y05 Y;

    public /* synthetic */ eh(y05 y05Var, byte b) {
        this.X = b;
        this.Y = y05Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        y05 y05Var = this.Y;
        switch (b) {
            case 0:
                y24 y24Var = (y24) y05Var.getValue();
                if (y24Var != null) {
                    return y24Var;
                }
                zc3.d("Required value was null.");
                b61.n();
                return null;
            case 1:
                y24 y24Var2 = (y24) y05Var.getValue();
                if (y24Var2 != null) {
                    return y24Var2;
                }
                zc3.d("Required value was null.");
                b61.n();
                return null;
            case 2:
                if (y05Var != null) {
                    return (List) y05Var.getValue();
                }
                return null;
            case 3:
                y05Var.setValue(Boolean.TRUE);
                return dn8Var;
            case 4:
                y05Var.setValue(Boolean.valueOf(!((Boolean) y05Var.getValue()).booleanValue()));
                return dn8Var;
            case 5:
                return (z64) ((dn2) y05Var.getValue()).invoke();
            case 6:
                return new y64((gn2) y05Var.getValue());
            case 7:
                y24 y24Var3 = (y24) y05Var.getValue();
                if (y24Var3 != null) {
                    return y24Var3;
                }
                zc3.d("Required value was null.");
                b61.n();
                return null;
            default:
                return (y24) y05Var.getValue();
        }
    }
}
