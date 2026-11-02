package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yt8 extends zt8 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public yt8(yt8 yt8Var, vt vtVar) {
        au8 wt8Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = yt8Var.c;
        this.d = yt8Var.d;
        this.e = yt8Var.e;
        this.f = yt8Var.f;
        this.g = yt8Var.g;
        this.h = yt8Var.h;
        this.i = yt8Var.i;
        String str = yt8Var.k;
        this.k = str;
        if (str != null) {
            vtVar.put(str, this);
        }
        matrix.set(yt8Var.j);
        ArrayList arrayList = yt8Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof yt8) {
                this.b.add(new yt8((yt8) obj, vtVar));
            } else {
                if (obj instanceof xt8) {
                    xt8 xt8Var = (xt8) obj;
                    xt8 xt8Var2 = new xt8(xt8Var);
                    xt8Var2.e = 0.0f;
                    xt8Var2.g = 1.0f;
                    xt8Var2.h = 1.0f;
                    xt8Var2.i = 0.0f;
                    xt8Var2.j = 1.0f;
                    xt8Var2.k = 0.0f;
                    xt8Var2.l = Paint.Cap.BUTT;
                    xt8Var2.m = Paint.Join.MITER;
                    xt8Var2.n = 4.0f;
                    xt8Var2.d = xt8Var.d;
                    xt8Var2.e = xt8Var.e;
                    xt8Var2.g = xt8Var.g;
                    xt8Var2.f = xt8Var.f;
                    xt8Var2.c = xt8Var.c;
                    xt8Var2.h = xt8Var.h;
                    xt8Var2.i = xt8Var.i;
                    xt8Var2.j = xt8Var.j;
                    xt8Var2.k = xt8Var.k;
                    xt8Var2.l = xt8Var.l;
                    xt8Var2.m = xt8Var.m;
                    xt8Var2.n = xt8Var.n;
                    wt8Var = xt8Var2;
                } else {
                    if (!(obj instanceof wt8)) {
                        bt.i("Unknown object in the tree!");
                        throw null;
                    }
                    wt8Var = new wt8((wt8) obj);
                }
                this.b.add(wt8Var);
                Object obj2 = wt8Var.b;
                if (obj2 != null) {
                    vtVar.put(obj2, wt8Var);
                }
            }
        }
    }

    @Override // defpackage.zt8
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((zt8) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.zt8
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((zt8) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public yt8() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
