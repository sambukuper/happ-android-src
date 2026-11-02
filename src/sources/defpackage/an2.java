package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class an2 extends ft8 {
    public final List a;

    public an2(ArrayList arrayList) {
        this.a = arrayList;
        if (arrayList != null) {
            zp4.P(arrayList);
        }
    }

    public final String toString() {
        return "FullValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}
