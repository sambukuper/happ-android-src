package defpackage;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vd2 {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public final ArrayList n = new ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(View view, int i, int i2, int i3, int i4) {
        ud2 ud2Var = (ud2) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - ud2Var.o()) - i);
        this.b = Math.min(this.b, (view.getTop() - ud2Var.q()) - i2);
        this.c = Math.max(this.c, ud2Var.v() + view.getRight() + i3);
        this.d = Math.max(this.d, ud2Var.n() + view.getBottom() + i4);
    }
}
