package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ip4 implements Map, Serializable, tv3 {
    public static final ip4 p0;
    public Object[] X;
    public Object[] Y;
    public int[] Z;
    public int[] f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public jp4 l0;
    public kp4 m0;
    public jp4 n0;
    public boolean o0;

    static {
        ip4 ip4Var = new ip4(0);
        ip4Var.o0 = true;
        p0 = ip4Var;
    }

    public ip4(int i) {
        if (i < 0) {
            bt.q("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.X = objArr;
        this.Y = null;
        this.Z = iArr;
        this.f0 = new int[iHighestOneBit];
        this.g0 = 2;
        this.h0 = 0;
        this.i0 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i = this.g0 * 2;
            int length = this.f0.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f0;
                int i3 = iArr[iJ];
                if (i3 == 0) {
                    int i4 = this.h0;
                    Object[] objArr = this.X;
                    if (i4 >= objArr.length) {
                        g(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.h0 = i5;
                    objArr[i4] = obj;
                    this.Z[i4] = iJ;
                    iArr[iJ] = i5;
                    this.k0++;
                    this.j0++;
                    if (i2 > this.g0) {
                        this.g0 = i2;
                    }
                    return i4;
                }
                if (dh3.f(this.X[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    m(this.f0.length * 2);
                    break;
                }
                iJ = iJ == 0 ? this.f0.length - 1 : iJ - 1;
            }
        }
    }

    public final ip4 b() {
        c();
        this.o0 = true;
        if (this.k0 > 0) {
            return this;
        }
        ip4 ip4Var = p0;
        ip4Var.getClass();
        return ip4Var;
    }

    public final void c() {
        if (this.o0) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.h0 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.Z;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f0[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        z91.O(this.X, 0, this.h0);
        Object[] objArr = this.Y;
        if (objArr != null) {
            z91.O(objArr, 0, this.h0);
        }
        this.k0 = 0;
        this.h0 = 0;
        this.j0++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void e(boolean z) {
        int i;
        Object[] objArr = this.Y;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.h0;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.Z;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.X;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f0[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        z91.O(this.X, i3, i);
        if (objArr != null) {
            z91.O(objArr, i3, this.h0);
        }
        this.h0 = i3;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        jp4 jp4Var = this.n0;
        if (jp4Var != null) {
            return jp4Var;
        }
        jp4 jp4Var2 = new jp4(this, (byte) 0);
        this.n0 = jp4Var2;
        return jp4Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.k0 == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection collection) {
        boolean zF;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iH = h(entry.getKey());
                    if (iH < 0) {
                        zF = false;
                    } else {
                        Object[] objArr = this.Y;
                        objArr.getClass();
                        zF = dh3.f(objArr[iH], entry.getValue());
                    }
                    if (!zF) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void g(int i) {
        Object[] objArr = this.X;
        int length = objArr.length;
        int i2 = this.h0;
        int i3 = length - i2;
        int i4 = i2 - this.k0;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            e(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.X = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.Y;
            this.Y = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.Z = Arrays.copyOf(this.Z, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f0.length) {
                m(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.Y;
        objArr.getClass();
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i = this.g0;
        while (true) {
            int i2 = this.f0[iJ];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (dh3.f(this.X[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f0.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        fp4 fp4Var = new fp4(this, (byte) 0);
        int i = 0;
        while (fp4Var.hasNext()) {
            int i2 = fp4Var.X;
            ip4 ip4Var = (ip4) fp4Var.f0;
            if (i2 >= ip4Var.h0) {
                bt.n();
                return 0;
            }
            fp4Var.X = i2 + 1;
            fp4Var.Y = i2;
            Object obj = ip4Var.X[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ip4Var.Y;
            objArr.getClass();
            Object obj2 = objArr[fp4Var.Y];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            fp4Var.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.h0;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.Z[i] >= 0) {
                Object[] objArr = this.Y;
                objArr.getClass();
                if (dh3.f(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.k0 == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.i0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        jp4 jp4Var = this.l0;
        if (jp4Var != null) {
            return jp4Var;
        }
        jp4 jp4Var2 = new jp4(this, (byte) 1);
        this.l0 = jp4Var2;
        return jp4Var2;
    }

    public final void m(int i) {
        int[] iArr;
        this.j0++;
        int i2 = 0;
        if (this.h0 > this.k0) {
            e(false);
        }
        this.f0 = new int[i];
        this.i0 = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.h0) {
            int i3 = i2 + 1;
            int iJ = j(this.X[i2]);
            int i4 = this.g0;
            while (true) {
                iArr = this.f0;
                if (iArr[iJ] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    bt.i("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iJ = iJ == 0 ? iArr.length - 1 : iJ - 1;
            }
            iArr[iJ] = i3;
            this.Z[i2] = iJ;
            i2 = i3;
        }
    }

    public final void n(int i) {
        int i2;
        int i3;
        int iJ;
        int[] iArr;
        Object[] objArr = this.X;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.Y;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.Z[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.f0.length - 1 : length - 1;
                int[] iArr2 = this.f0;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.g0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iJ = j(this.X[i3]) - length;
                    iArr = this.f0;
                }
            } while ((iJ & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.Z[i3] = i4;
        }
        this.Z[i] = -1;
        this.k0--;
        this.j0++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.Y;
        if (objArr == null) {
            int length = this.X.length;
            if (length < 0) {
                bt.q("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.Y = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.Y;
            if (objArr == null) {
                int length = this.X.length;
                if (length < 0) {
                    bt.q("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.Y = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!dh3.f(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.Y;
        objArr.getClass();
        Object obj2 = objArr[iH];
        n(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.k0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.k0 * 3) + 2);
        sb.append("{");
        int i = 0;
        fp4 fp4Var = new fp4(this, (byte) 0);
        while (fp4Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = fp4Var.X;
            ip4 ip4Var = (ip4) fp4Var.f0;
            if (i2 >= ip4Var.h0) {
                bt.n();
                return null;
            }
            fp4Var.X = i2 + 1;
            fp4Var.Y = i2;
            Object obj = ip4Var.X[i2];
            if (obj == ip4Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ip4Var.Y;
            objArr.getClass();
            Object obj2 = objArr[fp4Var.Y];
            if (obj2 == ip4Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            fp4Var.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        kp4 kp4Var = this.m0;
        if (kp4Var != null) {
            return kp4Var;
        }
        kp4 kp4Var2 = new kp4(this, (byte) 0);
        this.m0 = kp4Var2;
        return kp4Var2;
    }

    public ip4() {
        this(8);
    }
}
