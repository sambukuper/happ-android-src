package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jh8 {
    public final boolean a;
    public final boolean b;
    public final xi8 c;
    public final w79 d;
    public final oc e;
    public int f;
    public ArrayDeque g;
    public pc7 h;

    public jh8(boolean z, boolean z2, boolean z3, xi8 xi8Var, w79 w79Var, oc ocVar) {
        xi8Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = xi8Var;
        this.d = w79Var;
        this.e = ocVar;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        arrayDeque.getClass();
        arrayDeque.clear();
        pc7 pc7Var = this.h;
        pc7Var.getClass();
        pc7Var.clear();
    }

    public final void b() {
        if (this.g == null) {
            this.g = new ArrayDeque(4);
        }
        if (this.h == null) {
            this.h = new pc7();
        }
    }
}
