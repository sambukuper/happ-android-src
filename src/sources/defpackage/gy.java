package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gy {
    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public gy(int i, int i2, List list, List list2) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            b61.i("Null audioProfiles");
            throw null;
        }
        this.c = list;
        if (list2 != null) {
            this.d = list2;
        } else {
            b61.i("Null videoProfiles");
            throw null;
        }
    }

    public static gy a(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        return new gy(i, i2, Collections.unmodifiableList(new ArrayList(arrayList)), Collections.unmodifiableList(new ArrayList(arrayList2)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gy) {
            gy gyVar = (gy) obj;
            if (this.a == gyVar.a && this.b == gyVar.b && this.c.equals(gyVar.c) && this.d.equals(gyVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + "}";
    }
}
