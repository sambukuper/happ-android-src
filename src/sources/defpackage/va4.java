package defpackage;

import io.sentry.c2;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class va4 implements Iterator {
    public xa4 X;
    public xa4 Y = null;
    public int Z;
    public final /* synthetic */ ya4 f0;
    public final /* synthetic */ byte g0;

    public va4(ya4 ya4Var, byte b) {
        this.g0 = b;
        this.f0 = ya4Var;
        this.X = ya4Var.h0.f0;
        this.Z = ya4Var.g0;
    }

    public final xa4 a() {
        xa4 xa4Var = this.X;
        ya4 ya4Var = this.f0;
        if (xa4Var == ya4Var.h0) {
            bt.n();
            return null;
        }
        if (ya4Var.g0 != this.Z) {
            bt.c();
            return null;
        }
        this.X = xa4Var.f0;
        this.Y = xa4Var;
        return xa4Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X != this.f0.h0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.g0) {
            case 0:
                return a();
            default:
                return a().h0;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        xa4 xa4Var = this.Y;
        if (xa4Var == null) {
            c2.g();
            return;
        }
        ya4 ya4Var = this.f0;
        ya4Var.c(xa4Var, true);
        this.Y = null;
        this.Z = ya4Var.g0;
    }
}
