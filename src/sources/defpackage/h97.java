package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h97 extends no2 implements gn2 {
    public final /* synthetic */ i97 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h97(i97 i97Var) {
        super(1, ch3.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
        this.X = i97Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        Iterator it = this.X.b.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            if (!dh3.f(((e95) it.next()).a.a.get(obj), Boolean.TRUE)) {
                gb3 gb3Var = (gb3) obj;
                gb3Var.getClass();
                Integer num = gb3Var.b;
                if ((num != null ? num.intValue() : 0) == 0) {
                    Integer num2 = gb3Var.c;
                    if ((num2 != null ? num2.intValue() : 0) == 0) {
                        Integer num3 = gb3Var.d;
                        if ((num3 != null ? num3.intValue() : 0) == 0) {
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            z2 = true;
        }
        z = z2;
        return Boolean.valueOf(z);
    }
}
