package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ty6 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ uy6 Y;

    public /* synthetic */ ty6(uy6 uy6Var, byte b) {
        this.X = b;
        this.Y = uy6Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        uy6 uy6Var = this.Y;
        dt0 dt0Var = (dt0) obj;
        switch (b) {
            case 0:
                dt0Var.getClass();
                dt0Var.a("type", yl7.b);
                dt0Var.a("value", km4.m("kotlinx.serialization.Sealed<" + uy6Var.a.E() + '>', i37.M, new e37[0], new ty6(uy6Var, (byte) 1)));
                break;
            default:
                dt0Var.getClass();
                for (Map.Entry entry : uy6Var.d.entrySet()) {
                    dt0Var.a((String) entry.getKey(), ((ow3) entry.getValue()).d());
                }
                break;
        }
        return dn8Var;
    }
}
