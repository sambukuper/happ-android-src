package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jf6 {
    public final /* synthetic */ byte a;
    public final LinkedHashSet b;

    public jf6() {
        this.a = (byte) 1;
        this.b = new LinkedHashSet();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "ResolvedFeatureGroup(features=" + this.b + ')';
            default:
                return super.toString();
        }
    }

    public jf6(LinkedHashSet linkedHashSet) {
        this.a = (byte) 0;
        this.b = linkedHashSet;
    }
}
