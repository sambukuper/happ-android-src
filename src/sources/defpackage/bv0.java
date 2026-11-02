package defpackage;

import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bv0 implements Iterator {
    public final /* synthetic */ byte X;
    public final Object Y;
    public Iterable Z;

    public bv0(jb0 jb0Var) {
        this.X = (byte) 1;
        this.Y = new Stack();
        while (jb0Var instanceof zl6) {
            zl6 zl6Var = (zl6) jb0Var;
            ((Stack) this.Y).push(zl6Var);
            jb0Var = zl6Var.Z;
        }
        this.Z = (mc4) jb0Var;
    }

    public mc4 a() {
        Stack stack = (Stack) this.Y;
        mc4 mc4Var = (mc4) this.Z;
        mc4 mc4Var2 = null;
        if (mc4Var == null) {
            bt.n();
            return null;
        }
        while (!stack.isEmpty()) {
            jb0 jb0Var = ((zl6) stack.pop()).f0;
            while (jb0Var instanceof zl6) {
                zl6 zl6Var = (zl6) jb0Var;
                stack.push(zl6Var);
                jb0Var = zl6Var.Z;
            }
            mc4 mc4Var3 = (mc4) jb0Var;
            if (mc4Var3.Y.length != 0) {
                mc4Var2 = mc4Var3;
                break;
            }
        }
        this.Z = mc4Var2;
        return mc4Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.X) {
            case 0:
                int i = ((r75) this.Y).Y;
                return -1 <= i && i < 1114111;
            default:
                return ((mc4) this.Z) != null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0178  */
    /* JADX WARN: Code duplicated, block: B:85:0x017b  */
    /* JADX WARN: Code duplicated, block: B:86:0x017e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0184 A[LOOP:0: B:18:0x004b->B:88:0x0184, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x016f A[SYNTHETIC] */
    @Override // java.util.Iterator
    public final Object next() {
        char c;
        char c2;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int iV;
        int i5;
        int i6;
        switch (this.X) {
            case 0:
                ev0 ev0Var = (ev0) this.Z;
                r75 r75Var = (r75) this.Y;
                boolean z2 = true;
                int i7 = r75Var.Y + 1;
                int i8 = ev0Var.i0;
                char[] cArr = ev0Var.Y;
                int i9 = ev0Var.f0;
                int i10 = ev0Var.g0;
                pu puVar = ev0Var.Z;
                int i11 = ev0Var.j0;
                if (i7 < 0 || 1114111 < i7) {
                    bt.n();
                    return null;
                }
                if (i7 >= i10) {
                    puVar.v(i9 - 2);
                    r75Var.Y = 1114111;
                    return r75Var;
                }
                switch (ev0Var.k0) {
                    case 0:
                        c = 1;
                        break;
                    default:
                        c = 2;
                        break;
                }
                int i12 = i7;
                byte b = -1;
                int i13 = 0;
                boolean z3 = false;
                int i14 = -1;
                int i15 = 0;
                while (true) {
                    if (i12 > 65535 || (c != z2 && i12 > 4095)) {
                        int i16 = i12 >> 14;
                        c2 = cArr[cArr[c == z2 ? i16 + 1020 : i16 + 64] + ((i12 >> 9) & 31)];
                        z = z2;
                        if (c2 == b && i12 - i7 >= 512) {
                            i12 += 512;
                            i2 = i14;
                        } else if (c2 == ev0Var.h0) {
                            if (!z3) {
                                i13 = i11;
                                i15 = i13;
                                z3 = z;
                            } else if (i11 != i13) {
                                r75Var.Y = i12 - 1;
                                return r75Var;
                            }
                            i12 = (i12 + 512) & (-512);
                            i2 = i8;
                            b = c2;
                        } else {
                            i = 16;
                            i2 = i14;
                            i3 = (i12 >> 4) & 31;
                            i4 = 32;
                            b = c2;
                        }
                        i15 = i15;
                        i7 = i7;
                        if (i12 >= i10) {
                            iV = puVar.v(i9 - 2);
                            if (iV != i11) {
                                i11 = iV;
                            }
                            if (i11 != i13) {
                                i5 = i12 - 1;
                            } else {
                                i5 = 1114111;
                            }
                            r75Var.Y = i5;
                            return r75Var;
                        }
                        i7 = i7;
                        z2 = z;
                        cArr = cArr;
                        i9 = i9;
                        i15 = i15;
                        ev0Var = ev0Var;
                        i14 = i2;
                    } else {
                        i3 = i12 >> 6;
                        i2 = i14;
                        c2 = 0;
                        i = 64;
                        z = z2;
                        i4 = c == z2 ? 1024 : 64;
                    }
                    while (true) {
                        if ((c2 & 32768) == 0) {
                            cArr = cArr;
                            i6 = cArr[c2 + i3];
                        } else {
                            cArr = cArr;
                            int i17 = (c2 & 32767) + (i3 & (-8)) + (i3 >> 3);
                            int i18 = i3 & 7;
                            i6 = ((cArr[i17] << ((i18 * 2) + 2)) & 196608) | cArr[i17 + 1 + i18];
                        }
                        i9 = i9;
                        if (i6 != i2 || i12 - i7 < i) {
                            int i19 = i - 1;
                            if (i6 == i8) {
                                if (!z3) {
                                    i15 = i11;
                                    i13 = i15;
                                    z3 = z;
                                } else if (i11 != i13) {
                                    r75Var.Y = i12 - 1;
                                    return r75Var;
                                }
                                i2 = i6;
                                i12 = (~i19) & (i12 + i);
                            } else {
                                int i20 = (i12 & i19) + i6;
                                int iV2 = puVar.v(i20);
                                if (!z3) {
                                    i13 = iV2 == i11 ? i11 : iV2;
                                    i15 = iV2;
                                    z3 = z;
                                } else if (iV2 != i15) {
                                    r75Var.Y = i12 - 1;
                                    return r75Var;
                                }
                                while (true) {
                                    int i21 = i12 + 1;
                                    if ((i21 & i19) != 0) {
                                        i20++;
                                        if (puVar.v(i20) != i15) {
                                            r75Var.Y = i12;
                                            return r75Var;
                                        }
                                        i12 = i21;
                                    } else {
                                        i2 = i6;
                                        i12 = i21;
                                    }
                                }
                            }
                        } else {
                            i12 += i;
                        }
                        int i22 = i3 + 1;
                        if (i22 < i4) {
                            i3 = i22;
                            cArr = cArr;
                            i9 = i9;
                            i = i;
                        }
                    }
                    if (i12 >= i10) {
                        iV = puVar.v(i9 - 2);
                        if (iV != i11) {
                            i11 = iV;
                        }
                        if (i11 != i13) {
                            i5 = i12 - 1;
                        } else {
                            i5 = 1114111;
                        }
                        r75Var.Y = i5;
                        return r75Var;
                    }
                    i7 = i7;
                    z2 = z;
                    cArr = cArr;
                    i9 = i9;
                    i15 = i15;
                    ev0Var = ev0Var;
                    i14 = i2;
                }
                break;
            default:
                return a();
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

    public bv0(ev0 ev0Var) {
        this.X = (byte) 0;
        this.Z = ev0Var;
        r75 r75Var = new r75((byte) 4);
        r75Var.Y = -1;
        this.Y = r75Var;
    }
}
