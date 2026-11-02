package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class la4 implements Iterator, qv3 {
    public final CharSequence X;
    public byte Y;
    public int Z;
    public int f0;
    public int g0;

    public la4(CharSequence charSequence) {
        this.X = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        byte b = this.Y;
        if (b != 0) {
            return b == 1;
        }
        if (this.g0 < 0) {
            this.Y = (byte) 2;
            return false;
        }
        CharSequence charSequence = this.X;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i3 = this.Z; i3 < length2; i3++) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i3 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i3;
                this.Y = (byte) 1;
                this.g0 = i;
                this.f0 = length;
                return true;
            }
        }
        i = -1;
        this.Y = (byte) 1;
        this.g0 = i;
        this.f0 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            bt.n();
            return null;
        }
        this.Y = (byte) 0;
        int i = this.f0;
        int i2 = this.Z;
        this.Z = this.g0 + i;
        return this.X.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
