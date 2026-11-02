package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fb0 implements Iterator {
    public final /* synthetic */ byte X = 0;
    public int Y = 0;
    public final int Z;
    public final /* synthetic */ Iterable f0;

    public fb0(hb0 hb0Var) {
        this.f0 = hb0Var;
        this.Z = hb0Var.size();
    }

    public byte a() {
        try {
            byte[] bArr = ((mc4) this.f0).Y;
            int i = this.Y;
            this.Y = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            em7.g(e.getMessage());
            return (byte) 0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.X) {
            case 0:
                return this.Y < this.Z;
            default:
                return this.Y < this.Z;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.X) {
            case 0:
                int i = this.Y;
                if (i < this.Z) {
                    this.Y = i + 1;
                    return Byte.valueOf(((hb0) this.f0).f(i));
                }
                bt.n();
                return null;
            default:
                return Byte.valueOf(a());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public fb0(mc4 mc4Var) {
        this.f0 = mc4Var;
        this.Z = mc4Var.Y.length;
    }
}
