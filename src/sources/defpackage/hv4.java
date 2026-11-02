package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hv4 extends s50 {
    public static final hv4 g;
    public static final hv4 h;
    public final boolean f;

    static {
        hv4 hv4Var = new hv4(false, new int[]{2, 4, 0});
        g = hv4Var;
        int i = hv4Var.c;
        int i2 = hv4Var.b;
        h = (i2 == 1 && i == 9) ? new hv4(false, new int[]{2, 0, 0}) : new hv4(false, new int[]{i2, i + 1, 0});
        new hv4(false, new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv4(boolean z, int[] iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f = z;
    }
}
