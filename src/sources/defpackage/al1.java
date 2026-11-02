package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class al1 extends z51 {
    public final /* synthetic */ l32 p;
    public final /* synthetic */ LinkedHashSet q;
    public final /* synthetic */ boolean r;

    public al1(l32 l32Var, LinkedHashSet linkedHashSet, boolean z) {
        this.p = l32Var;
        this.q = linkedHashSet;
        this.r = z;
    }

    public static /* synthetic */ void a0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.z51
    public final void T(ld0 ld0Var, Collection collection) {
        if (ld0Var == null) {
            a0(3);
            throw null;
        }
        if (!this.r || ld0Var.r() == 2) {
            ld0Var.e0(collection);
        }
    }

    @Override // defpackage.z51
    public final void k(ld0 ld0Var) {
        if (ld0Var == null) {
            a0(0);
            throw null;
        }
        hf5.r(ld0Var, new f0(this, (byte) 13));
        this.q.add(ld0Var);
    }
}
