package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vl6 extends l34 {
    public static final vl6 c = new vl6("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vl6(String str, byte b) {
        super(str);
        this.b = b;
    }

    @Override // defpackage.xr4
    public final yr4 c(zr4 zr4Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                e02 e02Var = e02.X;
                if (size == 0) {
                    return zr4Var.g0(q31.j(j), q31.i(j), e02Var, new zw5((byte) 11));
                }
                if (size == 1) {
                    eo5 eo5VarO = ((tr4) list.get(0)).o(j);
                    return zr4Var.g0(s31.g(eo5VarO.X, j), s31.f(eo5VarO.Y, j), e02Var, new d1(eo5VarO, (byte) 10));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    eo5 eo5VarO2 = ((tr4) list.get(i)).o(j);
                    iMax = Math.max(eo5VarO2.X, iMax);
                    iMax2 = Math.max(eo5VarO2.Y, iMax2);
                    arrayList.add(eo5VarO2);
                }
                return zr4Var.g0(s31.g(iMax, j), s31.f(iMax2, j), e02Var, new kd(arrayList, (byte) 4));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
