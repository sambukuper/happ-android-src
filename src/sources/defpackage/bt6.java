package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bt6 extends dt6 implements ct6, at6 {
    public ArrayList i = new ArrayList();
    public HashSet j = null;
    public String k = null;
    public HashSet l = null;
    public HashSet m = null;

    @Override // defpackage.at6
    public final Set a() {
        return null;
    }

    @Override // defpackage.at6
    public final String b() {
        return this.k;
    }

    @Override // defpackage.at6
    public final void d(HashSet hashSet) {
        this.j = hashSet;
    }

    @Override // defpackage.ct6
    public void e(gt6 gt6Var) {
        this.i.add(gt6Var);
    }

    @Override // defpackage.at6
    public final Set f() {
        return this.j;
    }

    @Override // defpackage.ct6
    public final List g() {
        return this.i;
    }

    @Override // defpackage.at6
    public final void h(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.at6
    public final void i(String str) {
        this.k = str;
    }

    @Override // defpackage.at6
    public final void j(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.at6
    public final Set m() {
        return this.l;
    }

    @Override // defpackage.at6
    public final Set n() {
        return this.m;
    }

    @Override // defpackage.at6
    public final void k(HashSet hashSet) {
    }
}
