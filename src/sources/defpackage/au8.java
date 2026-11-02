package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class au8 extends zt8 {
    public kj5[] a;
    public String b;
    public int c;

    public au8(au8 au8Var) {
        this.a = null;
        this.c = 0;
        this.b = au8Var.b;
        kj5[] kj5VarArr = au8Var.a;
        kj5[] kj5VarArr2 = new kj5[kj5VarArr.length];
        for (int i = 0; i < kj5VarArr.length; i++) {
            kj5VarArr2[i] = new kj5(kj5VarArr[i]);
        }
        this.a = kj5VarArr2;
    }

    public kj5[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(kj5[] kj5VarArr) {
        kj5[] kj5VarArr2 = this.a;
        if (kj5VarArr2 != null && kj5VarArr != null && kj5VarArr2.length == kj5VarArr.length) {
            int i = 0;
            while (true) {
                if (i >= kj5VarArr2.length) {
                    kj5[] kj5VarArr3 = this.a;
                    for (int i2 = 0; i2 < kj5VarArr.length; i2++) {
                        kj5VarArr3[i2].a = kj5VarArr[i2].a;
                        int i3 = 0;
                        while (true) {
                            float[] fArr = kj5VarArr[i2].b;
                            if (i3 < fArr.length) {
                                kj5VarArr3[i2].b[i3] = fArr[i3];
                                i3++;
                            }
                        }
                    }
                    return;
                }
                kj5 kj5Var = kj5VarArr2[i];
                char c = kj5Var.a;
                kj5 kj5Var2 = kj5VarArr[i];
                if (c != kj5Var2.a || kj5Var.b.length != kj5Var2.b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        kj5[] kj5VarArr4 = new kj5[kj5VarArr.length];
        for (int i4 = 0; i4 < kj5VarArr.length; i4++) {
            kj5VarArr4[i4] = new kj5(kj5VarArr[i4]);
        }
        this.a = kj5VarArr4;
    }

    public au8() {
        this.a = null;
        this.c = 0;
    }
}
