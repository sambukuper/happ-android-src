package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class el2 implements j6 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ml2 Y;

    public /* synthetic */ el2(ml2 ml2Var, byte b) {
        this.X = b;
        this.Y = ml2Var;
    }

    @Override // defpackage.j6
    public final void c(Object obj) {
        byte b = this.X;
        ml2 ml2Var = this.Y;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                il2 il2Var = (il2) ml2Var.F.pollFirst();
                if (il2Var != null) {
                    ml2Var.c.A(il2Var.X);
                    break;
                }
                break;
            default:
                i6 i6Var = (i6) obj;
                il2 il2Var2 = (il2) ml2Var.F.pollFirst();
                if (il2Var2 != null) {
                    String str = il2Var2.X;
                    int i2 = il2Var2.Y;
                    qk2 qk2VarA = ml2Var.c.A(str);
                    if (qk2VarA != null) {
                        qk2VarA.w(i2, i6Var.X, i6Var.Y);
                        break;
                    }
                }
                break;
        }
    }
}
