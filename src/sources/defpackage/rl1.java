package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rl1 extends z51 {
    public final /* synthetic */ byte p;
    public final /* synthetic */ AbstractCollection q;

    public /* synthetic */ rl1(AbstractCollection abstractCollection, byte b) {
        this.p = b;
        this.q = abstractCollection;
    }

    @Override // defpackage.z51
    public final void k(ld0 ld0Var) {
        byte b = this.p;
        AbstractCollection abstractCollection = this.q;
        switch (b) {
            case 0:
                ld0Var.getClass();
                hf5.r(ld0Var, null);
                ((ArrayList) abstractCollection).add(ld0Var);
                return;
            default:
                if (ld0Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "fakeOverride", "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4", "addFakeOverride"));
                }
                hf5.r(ld0Var, null);
                ((LinkedHashSet) abstractCollection).add(ld0Var);
                return;
        }
    }

    @Override // defpackage.z51
    public final void u(ld0 ld0Var, ld0 ld0Var2) {
        switch (this.p) {
            case 0:
                if (ld0Var2 instanceof jo2) {
                    jo2 jo2Var = (jo2) ld0Var2;
                    Map linkedHashMap = jo2Var.G0;
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        jo2Var.G0 = linkedHashMap;
                    }
                    linkedHashMap.put(yl1.a, ld0Var);
                }
                break;
        }
    }

    private final void a0(ld0 ld0Var, ld0 ld0Var2) {
    }
}
