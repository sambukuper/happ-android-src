package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nl5 implements Iterator, qv3 {
    public final /* synthetic */ byte X;
    public int Y;
    public boolean Z;
    public final Object[] f0;

    public nl5(if8 if8Var, kf8[] kf8VarArr) {
        this.X = (byte) 0;
        if8Var.getClass();
        this.f0 = kf8VarArr;
        this.Z = true;
        kf8 kf8Var = kf8VarArr[0];
        Object[] objArr = if8Var.d;
        int iBitCount = Integer.bitCount(if8Var.a) * 2;
        kf8Var.getClass();
        objArr.getClass();
        kf8Var.Y = objArr;
        kf8Var.Z = iBitCount;
        kf8Var.f0 = 0;
        this.Y = 0;
        b();
    }

    public void a() {
        kf8[] kf8VarArr = (kf8[]) this.f0;
        int i = this.Y;
        kf8 kf8Var = kf8VarArr[i];
        if (kf8Var.f0 < kf8Var.Z) {
            return;
        }
        while (-1 < i) {
            int iC = c(i);
            if (iC == -1) {
                kf8 kf8Var2 = kf8VarArr[i];
                int i2 = kf8Var2.f0;
                Object[] objArr = kf8Var2.Y;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    kf8Var2.f0 = i2 + 1;
                    iC = c(i);
                }
            }
            if (iC != -1) {
                this.Y = iC;
                return;
            }
            if (i > 0) {
                kf8 kf8Var3 = kf8VarArr[i - 1];
                int i3 = kf8Var3.f0;
                int length2 = kf8Var3.Y.length;
                kf8Var3.f0 = i3 + 1;
            }
            kf8VarArr[i].a(jf8.e.d, 0, 0);
            i--;
        }
        this.Z = false;
    }

    public void b() {
        kf8 kf8Var;
        int i;
        kf8[] kf8VarArr = (kf8[]) this.f0;
        int i2 = this.Y;
        kf8 kf8Var2 = kf8VarArr[i2];
        if (kf8Var2.f0 < kf8Var2.Z) {
            return;
        }
        while (-1 < i2) {
            int iE = e(i2);
            if (iE == -1 && (i = (kf8Var = kf8VarArr[i2]).f0) < kf8Var.Y.length) {
                kf8Var.f0 = i + 1;
                iE = e(i2);
            }
            if (iE != -1) {
                this.Y = iE;
                return;
            }
            if (i2 > 0) {
                kf8VarArr[i2 - 1].f0++;
            }
            kf8 kf8Var3 = kf8VarArr[i2];
            Object[] objArr = if8.e.d;
            kf8Var3.getClass();
            objArr.getClass();
            kf8Var3.Y = objArr;
            kf8Var3.Z = 0;
            kf8Var3.f0 = 0;
            i2--;
        }
        this.Z = false;
    }

    public int c(int i) {
        kf8[] kf8VarArr = (kf8[]) this.f0;
        kf8 kf8Var = kf8VarArr[i];
        int i2 = kf8Var.f0;
        if (i2 < kf8Var.Z) {
            return i;
        }
        Object[] objArr = kf8Var.Y;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        jf8 jf8Var = (jf8) obj;
        if (i == 6) {
            kf8 kf8Var2 = kf8VarArr[i + 1];
            Object[] objArr2 = jf8Var.d;
            kf8Var2.a(objArr2, objArr2.length, 0);
        } else {
            kf8VarArr[i + 1].a(jf8Var.d, Integer.bitCount(jf8Var.a) * 2, 0);
        }
        return c(i + 1);
    }

    public int e(int i) {
        kf8[] kf8VarArr = (kf8[]) this.f0;
        kf8 kf8Var = kf8VarArr[i];
        int i2 = kf8Var.f0;
        if (i2 < kf8Var.Z) {
            return i;
        }
        Object[] objArr = kf8Var.Y;
        if (i2 >= objArr.length) {
            return -1;
        }
        Object obj = objArr[i2];
        obj.getClass();
        if8 if8Var = (if8) obj;
        if (i == 6) {
            kf8 kf8Var2 = kf8VarArr[i + 1];
            Object[] objArr2 = if8Var.d;
            int length = objArr2.length;
            kf8Var2.getClass();
            kf8Var2.Y = objArr2;
            kf8Var2.Z = length;
            kf8Var2.f0 = 0;
        } else {
            kf8 kf8Var3 = kf8VarArr[i + 1];
            Object[] objArr3 = if8Var.d;
            int iBitCount = Integer.bitCount(if8Var.a) * 2;
            kf8Var3.getClass();
            objArr3.getClass();
            kf8Var3.Y = objArr3;
            kf8Var3.Z = iBitCount;
            kf8Var3.f0 = 0;
        }
        return e(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.X) {
            case 0:
                break;
        }
        return this.Z;
    }

    @Override // java.util.Iterator
    public Object next() {
        byte b = this.X;
        Object[] objArr = this.f0;
        switch (b) {
            case 0:
                if (!this.Z) {
                    bt.n();
                    return null;
                }
                Object next = ((kf8[]) objArr)[this.Y].next();
                b();
                return next;
            default:
                if (!this.Z) {
                    bt.n();
                    return null;
                }
                Object next2 = ((kf8[]) objArr)[this.Y].next();
                a();
                return next2;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public nl5(jf8 jf8Var, kf8[] kf8VarArr) {
        this.X = (byte) 1;
        this.f0 = kf8VarArr;
        this.Z = true;
        kf8VarArr[0].a(jf8Var.d, Integer.bitCount(jf8Var.a) * 2, 0);
        this.Y = 0;
        a();
    }
}
