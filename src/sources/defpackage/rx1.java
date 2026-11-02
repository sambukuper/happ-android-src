package defpackage;

import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rx1 extends ru2 {
    public static final /* synthetic */ int c = 0;
    public final px1 a = px1.e;
    public final s82 b = s82.X;

    @Override // defpackage.ru2
    public final s82 a() {
        return this.b;
    }

    @Override // defpackage.ru2
    public final boolean b(aj0 aj0Var, xy0 xy0Var) {
        Set setA = aj0Var.a();
        setA.getClass();
        setA.toString();
        toString();
        hi5.z0("DynamicRangeFeature");
        px1 px1Var = this.a;
        if (!setA.contains(px1Var)) {
            return false;
        }
        for (hq8 hq8Var : (List) xy0Var.h0) {
            Set setK = hq8Var.k(aj0Var);
            Objects.toString(setK);
            toString();
            hq8Var.toString();
            hi5.z0("DynamicRangeFeature");
            if (setK != null && !setK.contains(px1Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.a + ')';
    }
}
