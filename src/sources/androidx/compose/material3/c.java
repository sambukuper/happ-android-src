package androidx.compose.material3;

import defpackage.dw0;
import defpackage.jl6;
import defpackage.kt1;
import defpackage.nh1;
import defpackage.pc6;
import defpackage.tb3;
import defpackage.tk8;
import defpackage.xz4;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements tb3 {
    public final boolean a;
    public final float b;
    public final long c;

    public c(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.tb3
    public final nh1 a(xz4 xz4Var) {
        return new DelegatingThemeAwareRippleNode(xz4Var, this.a, this.b, new jl6(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a != cVar.a || !kt1.b(this.b, cVar.b)) {
            return false;
        }
        long j = cVar.c;
        int i = dw0.h;
        return tk8.a(this.c, j);
    }

    @Override // defpackage.tb3
    public final int hashCode() {
        int iD = pc6.d(Boolean.hashCode(this.a) * 31, this.b, 961);
        int i = dw0.h;
        return Long.hashCode(this.c) + iD;
    }
}
