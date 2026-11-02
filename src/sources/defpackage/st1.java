package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class st1 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ArrayList Y;
    public final /* synthetic */ y05 Z;

    public /* synthetic */ st1(ArrayList arrayList, y05 y05Var, byte b) {
        this.X = b;
        this.Y = arrayList;
        this.Z = y05Var;
    }

    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        y05 y05Var = this.Z;
        ArrayList arrayList = this.Y;
        switch (b) {
            case 0:
                vf3 vf3Var = (vf3) obj;
                if (vf3Var instanceof qt1) {
                    arrayList.add(vf3Var);
                } else if (vf3Var instanceof rt1) {
                    arrayList.remove(((rt1) vf3Var).a);
                }
                y05Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                vf3 vf3Var2 = (vf3) obj;
                if (vf3Var2 instanceof zu1) {
                    arrayList.add(vf3Var2);
                } else if (vf3Var2 instanceof av1) {
                    arrayList.remove(((av1) vf3Var2).a);
                } else if (vf3Var2 instanceof yu1) {
                    arrayList.remove(((yu1) vf3Var2).a);
                }
                y05Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 2:
                vf3 vf3Var3 = (vf3) obj;
                if (vf3Var3 instanceof yg2) {
                    arrayList.add(vf3Var3);
                } else if (vf3Var3 instanceof zg2) {
                    arrayList.remove(((zg2) vf3Var3).a);
                }
                y05Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                vf3 vf3Var4 = (vf3) obj;
                if (vf3Var4 instanceof ft5) {
                    arrayList.add(vf3Var4);
                } else if (vf3Var4 instanceof gt5) {
                    arrayList.remove(((gt5) vf3Var4).a);
                } else if (vf3Var4 instanceof et5) {
                    arrayList.remove(((et5) vf3Var4).a);
                }
                y05Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return dn8Var;
    }
}
