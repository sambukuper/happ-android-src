package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ya4 extends AbstractMap implements Serializable {
    public static final l71 k0 = new l71(25);
    public final boolean Y;
    public xa4 Z;
    public final xa4 h0;
    public wa4 i0;
    public wa4 j0;
    public int f0 = 0;
    public int g0 = 0;
    public final Comparator X = k0;

    public ya4(boolean z) {
        this.Y = z;
        this.h0 = new xa4(z);
    }

    public final xa4 a(Object obj, boolean z) {
        int iCompareTo;
        xa4 xa4Var;
        xa4 xa4Var2 = this.Z;
        l71 l71Var = k0;
        Comparator comparator = this.X;
        if (xa4Var2 != null) {
            Comparable comparable = comparator == l71Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = xa4Var2.h0;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return xa4Var2;
                }
                xa4 xa4Var3 = iCompareTo < 0 ? xa4Var2.Y : xa4Var2.Z;
                if (xa4Var3 == null) {
                    break;
                }
                xa4Var2 = xa4Var3;
            }
        } else {
            iCompareTo = 0;
        }
        xa4 xa4Var4 = xa4Var2;
        if (!z) {
            return null;
        }
        xa4 xa4Var5 = this.h0;
        if (xa4Var4 != null) {
            xa4Var = new xa4(this.Y, xa4Var4, obj, xa4Var5, xa4Var5.g0);
            if (iCompareTo < 0) {
                xa4Var4.Y = xa4Var;
            } else {
                xa4Var4.Z = xa4Var;
            }
            b(xa4Var4, true);
        } else {
            if (comparator == l71Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            xa4Var = new xa4(this.Y, xa4Var4, obj, xa4Var5, xa4Var5.g0);
            this.Z = xa4Var;
        }
        this.f0++;
        this.g0++;
        return xa4Var;
    }

    public final void b(xa4 xa4Var, boolean z) {
        while (xa4Var != null) {
            xa4 xa4Var2 = xa4Var.Y;
            xa4 xa4Var3 = xa4Var.Z;
            int i = xa4Var2 != null ? xa4Var2.k0 : 0;
            int i2 = xa4Var3 != null ? xa4Var3.k0 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                xa4 xa4Var4 = xa4Var3.Y;
                xa4 xa4Var5 = xa4Var3.Z;
                int i4 = (xa4Var4 != null ? xa4Var4.k0 : 0) - (xa4Var5 != null ? xa4Var5.k0 : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    f(xa4Var);
                } else {
                    g(xa4Var3);
                    f(xa4Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                xa4 xa4Var6 = xa4Var2.Y;
                xa4 xa4Var7 = xa4Var2.Z;
                int i5 = (xa4Var6 != null ? xa4Var6.k0 : 0) - (xa4Var7 != null ? xa4Var7.k0 : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    g(xa4Var);
                } else {
                    f(xa4Var2);
                    g(xa4Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                xa4Var.k0 = i + 1;
                if (z) {
                    return;
                }
            } else {
                xa4Var.k0 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            xa4Var = xa4Var.X;
        }
    }

    public final void c(xa4 xa4Var, boolean z) {
        xa4 xa4Var2;
        xa4 xa4Var3;
        int i;
        if (z) {
            xa4 xa4Var4 = xa4Var.g0;
            xa4Var4.f0 = xa4Var.f0;
            xa4Var.f0.g0 = xa4Var4;
        }
        xa4 xa4Var5 = xa4Var.Y;
        xa4 xa4Var6 = xa4Var.Z;
        xa4 xa4Var7 = xa4Var.X;
        int i2 = 0;
        if (xa4Var5 == null || xa4Var6 == null) {
            if (xa4Var5 != null) {
                e(xa4Var, xa4Var5);
                xa4Var.Y = null;
            } else if (xa4Var6 != null) {
                e(xa4Var, xa4Var6);
                xa4Var.Z = null;
            } else {
                e(xa4Var, null);
            }
            b(xa4Var7, false);
            this.f0--;
            this.g0++;
            return;
        }
        if (xa4Var5.k0 > xa4Var6.k0) {
            xa4 xa4Var8 = xa4Var5.Z;
            while (true) {
                xa4 xa4Var9 = xa4Var8;
                xa4Var3 = xa4Var5;
                xa4Var5 = xa4Var9;
                if (xa4Var5 == null) {
                    break;
                } else {
                    xa4Var8 = xa4Var5.Z;
                }
            }
        } else {
            xa4 xa4Var10 = xa4Var6.Y;
            while (true) {
                xa4Var2 = xa4Var6;
                xa4Var6 = xa4Var10;
                if (xa4Var6 == null) {
                    break;
                } else {
                    xa4Var10 = xa4Var6.Y;
                }
            }
            xa4Var3 = xa4Var2;
        }
        c(xa4Var3, false);
        xa4 xa4Var11 = xa4Var.Y;
        if (xa4Var11 != null) {
            i = xa4Var11.k0;
            xa4Var3.Y = xa4Var11;
            xa4Var11.X = xa4Var3;
            xa4Var.Y = null;
        } else {
            i = 0;
        }
        xa4 xa4Var12 = xa4Var.Z;
        if (xa4Var12 != null) {
            i2 = xa4Var12.k0;
            xa4Var3.Z = xa4Var12;
            xa4Var12.X = xa4Var3;
            xa4Var.Z = null;
        }
        xa4Var3.k0 = Math.max(i, i2) + 1;
        e(xa4Var, xa4Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.Z = null;
        this.f0 = 0;
        this.g0++;
        xa4 xa4Var = this.h0;
        xa4Var.g0 = xa4Var;
        xa4Var.f0 = xa4Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        xa4 xa4VarA = null;
        if (obj != null) {
            try {
                xa4VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return xa4VarA != null;
    }

    public final void e(xa4 xa4Var, xa4 xa4Var2) {
        xa4 xa4Var3 = xa4Var.X;
        xa4Var.X = null;
        if (xa4Var2 != null) {
            xa4Var2.X = xa4Var3;
        }
        if (xa4Var3 == null) {
            this.Z = xa4Var2;
        } else if (xa4Var3.Y == xa4Var) {
            xa4Var3.Y = xa4Var2;
        } else {
            xa4Var3.Z = xa4Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        wa4 wa4Var = this.i0;
        if (wa4Var != null) {
            return wa4Var;
        }
        wa4 wa4Var2 = new wa4(this, (byte) 0);
        this.i0 = wa4Var2;
        return wa4Var2;
    }

    public final void f(xa4 xa4Var) {
        xa4 xa4Var2 = xa4Var.Y;
        xa4 xa4Var3 = xa4Var.Z;
        xa4 xa4Var4 = xa4Var3.Y;
        xa4 xa4Var5 = xa4Var3.Z;
        xa4Var.Z = xa4Var4;
        if (xa4Var4 != null) {
            xa4Var4.X = xa4Var;
        }
        e(xa4Var, xa4Var3);
        xa4Var3.Y = xa4Var;
        xa4Var.X = xa4Var3;
        int iMax = Math.max(xa4Var2 != null ? xa4Var2.k0 : 0, xa4Var4 != null ? xa4Var4.k0 : 0) + 1;
        xa4Var.k0 = iMax;
        xa4Var3.k0 = Math.max(iMax, xa4Var5 != null ? xa4Var5.k0 : 0) + 1;
    }

    public final void g(xa4 xa4Var) {
        xa4 xa4Var2 = xa4Var.Y;
        xa4 xa4Var3 = xa4Var.Z;
        xa4 xa4Var4 = xa4Var2.Y;
        xa4 xa4Var5 = xa4Var2.Z;
        xa4Var.Y = xa4Var5;
        if (xa4Var5 != null) {
            xa4Var5.X = xa4Var;
        }
        e(xa4Var, xa4Var2);
        xa4Var2.Z = xa4Var;
        xa4Var.X = xa4Var2;
        int iMax = Math.max(xa4Var3 != null ? xa4Var3.k0 : 0, xa4Var5 != null ? xa4Var5.k0 : 0) + 1;
        xa4Var.k0 = iMax;
        xa4Var2.k0 = Math.max(iMax, xa4Var4 != null ? xa4Var4.k0 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        xa4 xa4VarA;
        if (obj != null) {
            try {
                xa4VarA = a(obj, false);
            } catch (ClassCastException unused) {
                xa4VarA = null;
            }
        } else {
            xa4VarA = null;
        }
        if (xa4VarA != null) {
            return xa4VarA.j0;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        wa4 wa4Var = this.j0;
        if (wa4Var != null) {
            return wa4Var;
        }
        wa4 wa4Var2 = new wa4(this, (byte) 1);
        this.j0 = wa4Var2;
        return wa4Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            b61.i("key == null");
            return null;
        }
        if (obj2 == null && !this.Y) {
            b61.i("value == null");
            return null;
        }
        xa4 xa4VarA = a(obj, true);
        Object obj3 = xa4VarA.j0;
        xa4VarA.j0 = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        xa4 xa4VarA;
        if (obj != null) {
            try {
                xa4VarA = a(obj, false);
            } catch (ClassCastException unused) {
                xa4VarA = null;
            }
        } else {
            xa4VarA = null;
        }
        if (xa4VarA != null) {
            c(xa4VarA, true);
        }
        if (xa4VarA != null) {
            return xa4VarA.j0;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f0;
    }
}
