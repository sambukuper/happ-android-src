package defpackage;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gs6 extends dt6 implements is6, at6 {
    public HashSet i = null;
    public String j = null;
    public HashSet k = null;
    public HashSet l = null;
    public HashSet m = null;
    public Matrix n;

    @Override // defpackage.at6
    public final Set a() {
        return this.k;
    }

    @Override // defpackage.at6
    public final String b() {
        return this.j;
    }

    @Override // defpackage.at6
    public final void d(HashSet hashSet) {
        this.i = hashSet;
    }

    @Override // defpackage.at6
    public final Set f() {
        return this.i;
    }

    @Override // defpackage.at6
    public final void h(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.at6
    public final void i(String str) {
        this.j = str;
    }

    @Override // defpackage.at6
    public final void j(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.at6
    public final void k(HashSet hashSet) {
        this.k = hashSet;
    }

    @Override // defpackage.is6
    public final void l(Matrix matrix) {
        this.n = matrix;
    }

    @Override // defpackage.at6
    public final Set m() {
        return this.l;
    }

    @Override // defpackage.at6
    public final Set n() {
        return this.m;
    }
}
