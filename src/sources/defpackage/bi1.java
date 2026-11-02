package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bi1 implements Iterator, qv3 {
    public int X = -1;
    public int Y;
    public int Z;
    public kf3 f0;
    public int g0;
    public final /* synthetic */ ci1 h0;

    public bi1(ci1 ci1Var) {
        this.h0 = ci1Var;
        int iN = x97.n(0, 0, ci1Var.a.length());
        this.Y = iN;
        this.Z = iN;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
    public final void a() {
        qg5 qg5Var;
        ci1 ci1Var = this.h0;
        CharSequence charSequence = ci1Var.a;
        int i = this.Z;
        if (i < 0) {
            this.X = 0;
            this.f0 = null;
            return;
        }
        int i2 = ci1Var.b;
        if (i2 > 0) {
            int i3 = this.g0 + 1;
            this.g0 = i3;
            if (i3 >= i2) {
                int i4 = this.Y;
                charSequence.getClass();
                this.f0 = new kf3(i4, charSequence.length() - 1, 1);
                this.Z = -1;
            } else if (i > charSequence.length()) {
                int i5 = this.Y;
                charSequence.getClass();
                this.f0 = new kf3(i5, charSequence.length() - 1, 1);
                this.Z = -1;
            } else {
                qg5Var = (qg5) ci1Var.c.K(charSequence, Integer.valueOf(this.Z));
                if (qg5Var == null) {
                    int i6 = this.Y;
                    charSequence.getClass();
                    this.f0 = new kf3(i6, charSequence.length() - 1, 1);
                    this.Z = -1;
                } else {
                    int iIntValue = ((Number) qg5Var.X).intValue();
                    int iIntValue2 = ((Number) qg5Var.Y).intValue();
                    this.f0 = x97.a0(this.Y, iIntValue);
                    int i7 = iIntValue + iIntValue2;
                    this.Y = i7;
                    this.Z = i7 + (iIntValue2 == 0 ? 1 : 0);
                }
            }
        } else if (i > charSequence.length()) {
            int i8 = this.Y;
            charSequence.getClass();
            this.f0 = new kf3(i8, charSequence.length() - 1, 1);
            this.Z = -1;
        } else {
            qg5Var = (qg5) ci1Var.c.K(charSequence, Integer.valueOf(this.Z));
            if (qg5Var == null) {
                int i9 = this.Y;
                charSequence.getClass();
                this.f0 = new kf3(i9, charSequence.length() - 1, 1);
                this.Z = -1;
            } else {
                int iIntValue3 = ((Number) qg5Var.X).intValue();
                int iIntValue4 = ((Number) qg5Var.Y).intValue();
                this.f0 = x97.a0(this.Y, iIntValue3);
                int i10 = iIntValue3 + iIntValue4;
                this.Y = i10;
                this.Z = i10 + (iIntValue4 == 0 ? 1 : 0);
            }
        }
        this.X = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.X == -1) {
            a();
        }
        return this.X == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.X == -1) {
            a();
        }
        if (this.X == 0) {
            bt.n();
            return null;
        }
        kf3 kf3Var = this.f0;
        kf3Var.getClass();
        this.f0 = null;
        this.X = -1;
        return kf3Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
