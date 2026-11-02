package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class w1 implements Iterator, qv3 {
    public final /* synthetic */ byte X;
    public int Y;
    public final Object Z;

    public w1(k22 k22Var) {
        this.X = (byte) 2;
        this.Z = k22Var;
        this.Y = k22Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.X;
        Object obj = this.Z;
        switch (b) {
            case 0:
                return this.Y < ((z1) obj).a();
            case 1:
                return this.Y < ((Object[]) obj).length;
            case 2:
                return this.Y > 0;
            case 3:
                return this.Y < ((byte[]) obj).length;
            case 4:
                return this.Y < ((int[]) obj).length;
            case 5:
                return this.Y < ((long[]) obj).length;
            case 6:
                return this.Y < ((short[]) obj).length;
            default:
                return this.Y < ((ViewGroup) obj).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.X;
        Object obj = this.Z;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    bt.n();
                    return null;
                }
                int i = this.Y;
                this.Y = i + 1;
                return ((z1) obj).get(i);
            case 1:
                try {
                    int i2 = this.Y;
                    this.Y = i2 + 1;
                    return ((Object[]) obj)[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.Y--;
                    em7.g(e.getMessage());
                    return null;
                }
            case 2:
                k22 k22Var = (k22) obj;
                int i3 = k22Var.c;
                int i4 = this.Y;
                this.Y = i4 - 1;
                return k22Var.e[i3 - i4];
            case 3:
                int i5 = this.Y;
                byte[] bArr = (byte[]) obj;
                if (i5 < bArr.length) {
                    this.Y = i5 + 1;
                    return new bk8(bArr[i5]);
                }
                em7.g(String.valueOf(i5));
                return null;
            case 4:
                int i6 = this.Y;
                int[] iArr = (int[]) obj;
                if (i6 < iArr.length) {
                    this.Y = i6 + 1;
                    return new lk8(iArr[i6]);
                }
                em7.g(String.valueOf(i6));
                return null;
            case 5:
                int i7 = this.Y;
                long[] jArr = (long[]) obj;
                if (i7 < jArr.length) {
                    this.Y = i7 + 1;
                    return new tk8(jArr[i7]);
                }
                em7.g(String.valueOf(i7));
                return null;
            case 6:
                int i8 = this.Y;
                short[] sArr = (short[]) obj;
                if (i8 < sArr.length) {
                    this.Y = i8 + 1;
                    return new dl8(sArr[i8]);
                }
                em7.g(String.valueOf(i8));
                return null;
            default:
                int i9 = this.Y;
                this.Y = i9 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i9);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.Z;
                int i = this.Y - 1;
                this.Y = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public w1(Object[] objArr) {
        this.X = (byte) 1;
        objArr.getClass();
        this.Z = objArr;
    }

    public /* synthetic */ w1(Object obj, byte b) {
        this.X = b;
        this.Z = obj;
    }
}
