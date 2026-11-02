package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class d7 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public d7(j7 j7Var, jf6 jf6Var, m76 m76Var) {
        List listJ;
        this.a = (byte) 2;
        this.c = j7Var;
        this.e = jf6Var;
        d02 d02Var = d02.X;
        this.f = d02Var;
        this.g = d02Var;
        this.d = new ArrayList();
        u23 u23Var = j7Var.h;
        Proxy proxy = j7Var.f;
        if (proxy != null) {
            listJ = i21.K(proxy);
        } else {
            URI uriF = u23Var.f();
            if (uriF.getHost() == null) {
                listJ = ks8.j(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = j7Var.g.select(uriF);
                listJ = (listSelect == null || listSelect.isEmpty()) ? ks8.j(Proxy.NO_PROXY) : ks8.u(listSelect);
            }
        }
        this.f = listJ;
        this.b = 0;
    }

    public static /* synthetic */ void s(d7 d7Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = d7Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        d7Var.r(str, i, str2);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c7 A(Object obj, int i, int i2, int i3) {
        c7 c7Var = (c7) ((er5) this.c).a();
        if (c7Var != null) {
            c7Var.a = i;
            c7Var.b = i2;
            c7Var.d = i3;
            c7Var.c = obj;
            return c7Var;
        }
        c7 c7Var2 = new c7();
        c7Var2.a = i;
        c7Var2.b = i2;
        c7Var2.d = i3;
        c7Var2.c = obj;
        return c7Var2;
    }

    public void B() {
        this.b = -1;
        L(null);
        b();
    }

    public void C(int i) {
        ColorStateList colorStateListF;
        this.b = i;
        aq aqVar = (aq) this.d;
        if (aqVar != null) {
            Context context = ((View) this.c).getContext();
            synchronized (aqVar) {
                colorStateListF = aqVar.a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        L(colorStateListF);
        b();
    }

    public String D(String str, boolean z) {
        str.getClass();
        int i = this.b;
        try {
            if (g() == 6 && dh3.f(F(z), str)) {
                this.e = null;
                if (g() == 5) {
                    return F(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.e = null;
        }
    }

    public byte E() {
        String str = (String) this.g;
        int i = this.b;
        while (true) {
            int I = I(i);
            if (I == -1) {
                this.b = I;
                return (byte) 10;
            }
            char cCharAt = str.charAt(I);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = I;
                return x97.g(cCharAt);
            }
            i = I + 1;
        }
    }

    public String F(boolean z) {
        String strL;
        byte bE = E();
        if (z) {
            if (bE != 1 && bE != 0) {
                return null;
            }
            strL = m();
        } else {
            if (bE != 1) {
                return null;
            }
            strL = l();
        }
        this.e = strL;
        return strL;
    }

    public void G(c7 c7Var) {
        x86 x86Var = (x86) this.f;
        ((ArrayList) this.e).add(c7Var);
        byte b = c7Var.a;
        if (b == 1) {
            x86Var.d(c7Var.b, c7Var.d);
            return;
        }
        if (b == 2) {
            int i = c7Var.b;
            int i2 = c7Var.d;
            RecyclerView recyclerView = x86Var.X;
            recyclerView.U(i, i2, false);
            recyclerView.n1 = true;
            return;
        }
        if (b == 4) {
            x86Var.c(c7Var.b, c7Var.d, c7Var.c);
        } else if (b == 8) {
            x86Var.e(c7Var.b, c7Var.d);
        } else {
            u52.j(c7Var, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0198  */
    /* JADX WARN: Code duplicated, block: B:104:0x019c  */
    /* JADX WARN: Code duplicated, block: B:188:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x013a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0145  */
    /* JADX WARN: Code duplicated, block: B:84:0x0150  */
    /* JADX WARN: Code duplicated, block: B:87:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:89:0x0163  */
    /* JADX WARN: Code duplicated, block: B:91:0x0169  */
    /* JADX WARN: Code duplicated, block: B:94:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x017f  */
    public void H() {
        boolean z;
        byte b;
        c7 c7VarA;
        int i;
        int i2;
        int i3;
        c7 c7VarA2;
        boolean z2;
        boolean z3;
        Object obj;
        c7 c7Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        er5 er5Var = (er5) this.c;
        x86 x86Var = (x86) this.f;
        q02 q02Var = (q02) this.g;
        ArrayList arrayList = (ArrayList) this.d;
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((c7) arrayList.get(size)).a == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            d7 d7Var = (d7) q02Var.Y;
            er5 er5Var2 = (er5) d7Var.c;
            c7 c7Var2 = (c7) arrayList.get(size);
            c7 c7Var3 = (c7) arrayList.get(i12);
            byte b2 = c7Var3.a;
            if (b2 == 1) {
                int i13 = c7Var2.d;
                int i14 = c7Var3.b;
                int i15 = i13 < i14 ? -1 : 0;
                int i16 = c7Var2.b;
                if (i16 < i14) {
                    i15++;
                }
                if (i14 <= i16) {
                    c7Var2.b = i16 + c7Var3.d;
                }
                int i17 = c7Var3.b;
                if (i17 <= i13) {
                    c7Var2.d = i13 + c7Var3.d;
                }
                c7Var3.b = i17 + i15;
                arrayList.set(size, c7Var3);
                arrayList.set(i12, c7Var2);
            } else if (b2 == 2) {
                int i18 = c7Var2.b;
                int i19 = c7Var2.d;
                int i20 = c7Var3.b;
                if (i18 < i19) {
                    if (i20 == i18 && c7Var3.d == i19 - i18) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i20 == i19 + 1 && c7Var3.d == i18 - i19) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i19 < i20) {
                    i20--;
                    c7Var3.b = i20;
                } else {
                    int i21 = c7Var3.d;
                    if (i19 < i20 + i21) {
                        c7Var3.d = i21 - 1;
                        c7Var2.a = (byte) 2;
                        c7Var2.d = 1;
                        if (c7Var3.d == 0) {
                            arrayList.remove(i12);
                            c7Var3.c = null;
                            er5Var2.d(c7Var3);
                        }
                    }
                }
                int i22 = c7Var2.b;
                if (i22 <= i20) {
                    c7Var3.b = i20 + 1;
                } else {
                    int i23 = i20 + c7Var3.d;
                    if (i22 < i23) {
                        obj = null;
                        c7 c7VarA3 = d7Var.A(null, 2, i22 + 1, i23 - i22);
                        c7Var3.d = c7Var2.b - c7Var3.b;
                        c7Var = c7VarA3;
                    }
                    if (z3) {
                        arrayList.set(size, c7Var3);
                        arrayList.remove(i12);
                        c7Var2.c = obj;
                        er5Var2.d(c7Var2);
                    } else {
                        if (z2) {
                            if (c7Var != null) {
                                i10 = c7Var2.b;
                                if (i10 > c7Var.b) {
                                    c7Var2.b = i10 - c7Var.d;
                                }
                                i11 = c7Var2.d;
                                if (i11 > c7Var.b) {
                                    c7Var2.d = i11 - c7Var.d;
                                }
                            }
                            i8 = c7Var2.b;
                            if (i8 > c7Var3.b) {
                                c7Var2.b = i8 - c7Var3.d;
                            }
                            i9 = c7Var2.d;
                            if (i9 > c7Var3.b) {
                                c7Var2.d = i9 - c7Var3.d;
                            }
                        } else {
                            if (c7Var != null) {
                                i6 = c7Var2.b;
                                if (i6 >= c7Var.b) {
                                    c7Var2.b = i6 - c7Var.d;
                                }
                                i7 = c7Var2.d;
                                if (i7 >= c7Var.b) {
                                    c7Var2.d = i7 - c7Var.d;
                                }
                            }
                            i4 = c7Var2.b;
                            if (i4 >= c7Var3.b) {
                                c7Var2.b = i4 - c7Var3.d;
                            }
                            i5 = c7Var2.d;
                            if (i5 >= c7Var3.b) {
                                c7Var2.d = i5 - c7Var3.d;
                            }
                        }
                        arrayList.set(size, c7Var3);
                        if (c7Var2.b != c7Var2.d) {
                            arrayList.set(i12, c7Var2);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (c7Var != null) {
                            arrayList.add(size, c7Var);
                        }
                    }
                }
                obj = null;
                c7Var = null;
                if (z3) {
                    arrayList.set(size, c7Var3);
                    arrayList.remove(i12);
                    c7Var2.c = obj;
                    er5Var2.d(c7Var2);
                } else {
                    if (z2) {
                        if (c7Var != null) {
                            i10 = c7Var2.b;
                            if (i10 > c7Var.b) {
                                c7Var2.b = i10 - c7Var.d;
                            }
                            i11 = c7Var2.d;
                            if (i11 > c7Var.b) {
                                c7Var2.d = i11 - c7Var.d;
                            }
                        }
                        i8 = c7Var2.b;
                        if (i8 > c7Var3.b) {
                            c7Var2.b = i8 - c7Var3.d;
                        }
                        i9 = c7Var2.d;
                        if (i9 > c7Var3.b) {
                            c7Var2.d = i9 - c7Var3.d;
                        }
                    } else {
                        if (c7Var != null) {
                            i6 = c7Var2.b;
                            if (i6 >= c7Var.b) {
                                c7Var2.b = i6 - c7Var.d;
                            }
                            i7 = c7Var2.d;
                            if (i7 >= c7Var.b) {
                                c7Var2.d = i7 - c7Var.d;
                            }
                        }
                        i4 = c7Var2.b;
                        if (i4 >= c7Var3.b) {
                            c7Var2.b = i4 - c7Var3.d;
                        }
                        i5 = c7Var2.d;
                        if (i5 >= c7Var3.b) {
                            c7Var2.d = i5 - c7Var3.d;
                        }
                    }
                    arrayList.set(size, c7Var3);
                    if (c7Var2.b != c7Var2.d) {
                        arrayList.set(i12, c7Var2);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (c7Var != null) {
                        arrayList.add(size, c7Var);
                    }
                }
            } else if (b2 == 4) {
                int i24 = c7Var2.d;
                int i25 = c7Var3.b;
                if (i24 < i25) {
                    c7Var3.b = i25 - 1;
                } else {
                    int i26 = c7Var3.d;
                    if (i24 < i25 + i26) {
                        c7Var3.d = i26 - 1;
                        c7VarA = d7Var.A(c7Var3.c, 4, c7Var2.b, 1);
                    }
                    i = c7Var2.b;
                    i2 = c7Var3.b;
                    if (i <= i2) {
                        c7Var3.b = i2 + 1;
                    } else {
                        i3 = i2 + c7Var3.d;
                        if (i < i3) {
                            int i27 = i3 - i;
                            c7VarA2 = d7Var.A(c7Var3.c, 4, i + 1, i27);
                            c7Var3.d -= i27;
                        }
                        arrayList.set(i12, c7Var2);
                        if (c7Var3.d > 0) {
                            arrayList.set(size, c7Var3);
                        } else {
                            arrayList.remove(size);
                            c7Var3.c = null;
                            er5Var2.d(c7Var3);
                        }
                        if (c7VarA != null) {
                            arrayList.add(size, c7VarA);
                        }
                        if (c7VarA2 != null) {
                            arrayList.add(size, c7VarA2);
                        }
                    }
                    c7VarA2 = null;
                    arrayList.set(i12, c7Var2);
                    if (c7Var3.d > 0) {
                        arrayList.set(size, c7Var3);
                    } else {
                        arrayList.remove(size);
                        c7Var3.c = null;
                        er5Var2.d(c7Var3);
                    }
                    if (c7VarA != null) {
                        arrayList.add(size, c7VarA);
                    }
                    if (c7VarA2 != null) {
                        arrayList.add(size, c7VarA2);
                    }
                }
                c7VarA = null;
                i = c7Var2.b;
                i2 = c7Var3.b;
                if (i <= i2) {
                    c7Var3.b = i2 + 1;
                } else {
                    i3 = i2 + c7Var3.d;
                    if (i < i3) {
                        int i28 = i3 - i;
                        c7VarA2 = d7Var.A(c7Var3.c, 4, i + 1, i28);
                        c7Var3.d -= i28;
                    }
                    arrayList.set(i12, c7Var2);
                    if (c7Var3.d > 0) {
                        arrayList.set(size, c7Var3);
                    } else {
                        arrayList.remove(size);
                        c7Var3.c = null;
                        er5Var2.d(c7Var3);
                    }
                    if (c7VarA != null) {
                        arrayList.add(size, c7VarA);
                    }
                    if (c7VarA2 != null) {
                        arrayList.add(size, c7VarA2);
                    }
                }
                c7VarA2 = null;
                arrayList.set(i12, c7Var2);
                if (c7Var3.d > 0) {
                    arrayList.set(size, c7Var3);
                } else {
                    arrayList.remove(size);
                    c7Var3.c = null;
                    er5Var2.d(c7Var3);
                }
                if (c7VarA != null) {
                    arrayList.add(size, c7VarA);
                }
                if (c7VarA2 != null) {
                    arrayList.add(size, c7VarA2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i29 = 0; i29 < size2; i29++) {
            c7 c7VarA4 = (c7) arrayList.get(i29);
            byte b3 = c7VarA4.a;
            if (b3 == 1) {
                G(c7VarA4);
            } else if (b3 == 2) {
                int i30 = c7VarA4.b;
                int i31 = c7VarA4.d + i30;
                int i32 = i30;
                int i33 = 0;
                byte b4 = -1;
                while (i32 < i31) {
                    if (x86Var.b(i32) != null || d(i32)) {
                        if (b4 == 0) {
                            p(A(null, 2, i30, i33));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b4 == 1) {
                            G(A(null, 2, i30, i33));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i32 -= i33;
                        i31 -= i33;
                        i33 = 1;
                    } else {
                        i33++;
                    }
                    i32++;
                    b4 = b;
                }
                if (i33 != c7VarA4.d) {
                    c7VarA4.c = null;
                    er5Var.d(c7VarA4);
                    c7VarA4 = A(null, 2, i30, i33);
                }
                if (b4 == 0) {
                    p(c7VarA4);
                } else {
                    G(c7VarA4);
                }
            } else if (b3 == 4) {
                int i34 = c7VarA4.b;
                int i35 = c7VarA4.d + i34;
                int i36 = i34;
                int i37 = 0;
                byte b5 = -1;
                while (i34 < i35) {
                    if (x86Var.b(i34) != null || d(i34)) {
                        if (b5 == 0) {
                            p(A(c7VarA4.c, 4, i36, i37));
                            i36 = i34;
                            i37 = 0;
                        }
                        b5 = 1;
                    } else {
                        if (b5 == 1) {
                            G(A(c7VarA4.c, 4, i36, i37));
                            i36 = i34;
                            i37 = 0;
                        }
                        b5 = 0;
                    }
                    i37++;
                    i34++;
                }
                if (i37 != c7VarA4.d) {
                    Object obj2 = c7VarA4.c;
                    c7VarA4.c = null;
                    er5Var.d(c7VarA4);
                    c7VarA4 = A(obj2, 4, i36, i37);
                }
                if (b5 == 0) {
                    p(c7VarA4);
                } else {
                    G(c7VarA4);
                }
            } else if (b3 == 8) {
                G(c7VarA4);
            }
        }
        arrayList.clear();
    }

    public int I(int i) {
        if (i < ((String) this.g).length()) {
            return i;
        }
        return -1;
    }

    public void J(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c7 c7Var = (c7) arrayList.get(i);
            c7Var.c = null;
            ((er5) this.c).d(c7Var);
        }
        arrayList.clear();
    }

    public void K(w03 w03Var) {
        int iV0 = eu.v0(w03Var, (w03[]) this.c);
        if (iV0 >= 0) {
            w03[] w03VarArr = (w03[]) this.c;
            int i = iV0 + 1;
            eu.g0(w03VarArr, w03VarArr, iV0, i, this.b);
            w03[] w03VarArr2 = (w03[]) this.c;
            int i2 = this.b;
            w03VarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.d;
            System.arraycopy(fArr, i, fArr, iV0, i2 - i);
            byte[] bArr = (byte[]) this.e;
            eu.d0(iV0, i, this.b, bArr, bArr);
            this.b--;
        }
    }

    public void L(ColorStateList colorStateList) {
        if (colorStateList != null) {
            z11 z11Var = (z11) this.e;
            if (z11Var == null) {
                z11Var = new z11();
                this.e = z11Var;
            }
            z11Var.c = colorStateList;
            z11Var.b = true;
        } else {
            this.e = null;
        }
        b();
    }

    public void M(ColorStateList colorStateList) {
        z11 z11Var = (z11) this.f;
        if (z11Var == null) {
            z11Var = new z11();
            this.f = z11Var;
        }
        z11Var.c = colorStateList;
        z11Var.b = true;
        b();
    }

    public void N(PorterDuff.Mode mode) {
        z11 z11Var = (z11) this.f;
        if (z11Var == null) {
            z11Var = new z11();
            this.f = z11Var;
        }
        z11Var.d = mode;
        z11Var.a = true;
        b();
    }

    public int O() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.g;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    public boolean P() {
        int iO = O();
        String str = (String) this.g;
        if (iO >= str.length() || iO == -1 || str.charAt(iO) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public void Q(char c) {
        String str = (String) this.g;
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strM = m();
                this.b = i;
                if (dh3.f(strM, "null")) {
                    r("Expected string literal but 'null' literal was found", this.b - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strZ = x97.Z(x97.g(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        s(this, pc6.q("Expected ", strZ, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public int R(int i, int i2) {
        int i3;
        int i4;
        er5 er5Var = (er5) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c7 c7Var = (c7) arrayList.get(size);
            byte b = c7Var.a;
            int i5 = c7Var.b;
            if (b == 8) {
                int i6 = c7Var.d;
                if (i5 < i6) {
                    i4 = i6;
                    i3 = i5;
                } else {
                    i3 = i6;
                    i4 = i5;
                }
                if (i < i3 || i > i4) {
                    if (i < i5) {
                        if (i2 == 1) {
                            c7Var.b = i5 + 1;
                            c7Var.d = i6 + 1;
                        } else if (i2 == 2) {
                            c7Var.b = i5 - 1;
                            c7Var.d = i6 - 1;
                        }
                    }
                } else if (i3 == i5) {
                    if (i2 == 1) {
                        c7Var.d = i6 + 1;
                    } else if (i2 == 2) {
                        c7Var.d = i6 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c7Var.b = i5 + 1;
                    } else if (i2 == 2) {
                        c7Var.b = i5 - 1;
                    }
                    i--;
                }
            } else if (i5 <= i) {
                if (b == 1) {
                    i -= c7Var.d;
                } else if (b == 2) {
                    i += c7Var.d;
                }
            } else if (i2 == 1) {
                c7Var.b = i5 + 1;
            } else if (i2 == 2) {
                c7Var.b = i5 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c7 c7Var2 = (c7) arrayList.get(size2);
            byte b2 = c7Var2.a;
            int i7 = c7Var2.d;
            if (b2 == 8) {
                if (i7 == c7Var2.b || i7 < 0) {
                    arrayList.remove(size2);
                    c7Var2.c = null;
                    er5Var.d(c7Var2);
                }
            } else if (i7 <= 0) {
                arrayList.remove(size2);
                c7Var2.c = null;
                er5Var.d(c7Var2);
            }
        }
        return i;
    }

    public int a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f).append((char) (u(charSequence, i + 3) + (u(charSequence, i) << 12) + (u(charSequence, i + 1) << 8) + (u(charSequence, i + 2) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return a(charSequence, this.b);
        }
        s(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b() {
        View view = (View) this.c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((z11) this.e) != null) {
                z11 z11Var = (z11) this.g;
                if (z11Var == null) {
                    z11Var = new z11();
                    this.g = z11Var;
                }
                z11Var.c = null;
                z11Var.b = false;
                z11Var.d = null;
                z11Var.a = false;
                WeakHashMap weakHashMap = cw8.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    z11Var.b = true;
                    z11Var.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    z11Var.a = true;
                    z11Var.d = backgroundTintMode;
                }
                if (z11Var.b || z11Var.a) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = aq.b;
                    rf6.h(background, z11Var, drawableState);
                    return;
                }
            }
            z11 z11Var2 = (z11) this.f;
            if (z11Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = aq.b;
                rf6.h(background, z11Var2, drawableState2);
            } else {
                z11 z11Var3 = (z11) this.e;
                if (z11Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = aq.b;
                    rf6.h(background, z11Var3, drawableState3);
                }
            }
        }
    }

    public boolean c() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    public boolean d(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c7 c7Var = (c7) arrayList.get(i2);
            byte b = c7Var.a;
            if (b != 8) {
                if (b == 1) {
                    int i3 = c7Var.b;
                    int i4 = c7Var.d + i3;
                    while (i3 < i4) {
                        if (t(i3, i2 + 1) == i) {
                            return true;
                        }
                        i3++;
                    }
                } else {
                    continue;
                }
            } else {
                if (t(c7Var.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void e(int i, String str) {
        String str2 = (String) this.g;
        if (str2.length() - i < str.length()) {
            s(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                s(this, "Expected valid boolean literal prefix, but had '" + m() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public String f() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        i('\"');
        int i = this.b;
        int iL0 = fm7.l0(str, '\"', i, 4);
        if (iL0 == -1) {
            m();
            int i2 = this.b;
            s(this, pc6.p("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iL0) {
            if (str.charAt(i3) == '\\') {
                int I = this.b;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, I, i3);
                        int I2 = I(i3 + 1);
                        if (I2 == -1) {
                            s(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = I2 + 1;
                        char cCharAt2 = str.charAt(I2);
                        if (cCharAt2 == 'u') {
                            iA = a(str, iA);
                        } else {
                            char c = cCharAt2 < 'u' ? zp0.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                s(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        I = I(iA);
                        if (I == -1) {
                            s(this, "Unexpected EOF", I, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, I, i3);
                            I = I(i3);
                            if (I == -1) {
                                s(this, "Unexpected EOF", I, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = I;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, I, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(I, i3).toString();
                }
                this.b = i3 + 1;
                return string;
            }
            i3++;
        }
        this.b = iL0 + 1;
        return str.substring(i, iL0);
    }

    public byte g() {
        String str = (String) this.g;
        int i = this.b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                return x97.g(cCharAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    public byte h(byte b) {
        String str = (String) this.g;
        byte bG = g();
        if (bG == b) {
            return bG;
        }
        String strZ = x97.Z(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        s(this, pc6.q("Expected ", strZ, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public void i(char c) {
        int i = this.b;
        if (i == -1) {
            Q(c);
            throw null;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                Q(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        Q(c);
        throw null;
    }

    public long j() {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        double dPow;
        int I = I(O());
        String str = (String) this.g;
        if (I >= str.length() || I == -1) {
            s(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(I) == '\"') {
            I++;
            if (I == str.length()) {
                s(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = I;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            if (i == str.length()) {
                z2 = z;
                z3 = z5;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                z2 = z;
                if (cCharAt == '-' && z5) {
                    if (i == I) {
                        s(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = false;
                } else if (cCharAt != '+' || !z5) {
                    z3 = z5;
                    if (cCharAt != '-') {
                        if (x97.g(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            s(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                            throw null;
                        }
                        if (z3) {
                            j2 = (j2 * 10) + ((long) i3);
                        } else {
                            j3 = (j3 * 10) - ((long) i3);
                            if (j3 > 0) {
                                s(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z = z2;
                        z5 = z3;
                    } else {
                        if (i != I) {
                            s(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z5 = z3;
                        z6 = true;
                    }
                } else {
                    if (i == I) {
                        s(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = true;
                }
            } else {
                if (i == I) {
                    s(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                    throw null;
                }
                i++;
                z4 = true;
                z5 = true;
            }
        }
        boolean z7 = i != I;
        if (I == i || (z6 && I == i - 1)) {
            s(this, "Expected numeric literal", i, null, 4);
            throw null;
        }
        if (z2) {
            if (!z7) {
                s(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                s(this, "Expected closing quotation mark", i, null, 4);
                throw null;
            }
            i++;
        }
        this.b = i;
        long j4 = j3;
        if (z3) {
            double d = j4;
            if (!z4) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z4) {
                    b61.c();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                s(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                s(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j4;
        }
        if (z6) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        s(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public void k() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((x86) this.f).a((c7) arrayList.get(i));
        }
        J(arrayList);
        this.b = 0;
    }

    public String l() {
        String str = (String) this.e;
        if (str == null) {
            return f();
        }
        str.getClass();
        this.e = null;
        return str;
    }

    public String m() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        String str2 = (String) this.e;
        if (str2 != null) {
            str2.getClass();
            this.e = null;
            return str2;
        }
        int iO = O();
        if (iO >= str.length() || iO == -1) {
            s(this, "EOF", iO, null, 4);
            throw null;
        }
        byte bG = x97.g(str.charAt(iO));
        if (bG == 1) {
            return l();
        }
        if (bG != 0) {
            s(this, "Expected beginning of the string, but got " + str.charAt(iO), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (x97.g(str.charAt(iO)) == 0) {
            iO++;
            if (iO >= str.length()) {
                sb.append((CharSequence) str, this.b, iO);
                int I = I(iO);
                if (I == -1) {
                    this.b = iO;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iO = I;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            sb.append((CharSequence) str, i, iO);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iO).toString();
        }
        this.b = iO;
        return string;
    }

    public String n() {
        String strM = m();
        if (!dh3.f(strM, "null") || ((String) this.g).charAt(this.b - 1) == '\"') {
            return strM;
        }
        s(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void o() {
        x86 x86Var = (x86) this.f;
        k();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c7 c7Var = (c7) arrayList.get(i);
            byte b = c7Var.a;
            if (b == 1) {
                x86Var.a(c7Var);
                x86Var.d(c7Var.b, c7Var.d);
            } else if (b == 2) {
                x86Var.a(c7Var);
                int i2 = c7Var.b;
                int i3 = c7Var.d;
                RecyclerView recyclerView = x86Var.X;
                recyclerView.U(i2, i3, true);
                recyclerView.n1 = true;
                recyclerView.k1.c += i3;
            } else if (b == 4) {
                x86Var.a(c7Var);
                x86Var.c(c7Var.b, c7Var.d, c7Var.c);
            } else if (b == 8) {
                x86Var.a(c7Var);
                x86Var.e(c7Var.b, c7Var.d);
            }
        }
        J(arrayList);
        this.b = 0;
    }

    public void p(c7 c7Var) {
        int i;
        er5 er5Var = (er5) this.c;
        byte b = c7Var.a;
        if (b == 1 || b == 8) {
            bt.q("should not dispatch add or move for pre layout");
            return;
        }
        int iR = R(c7Var.b, b);
        int i2 = c7Var.b;
        byte b2 = c7Var.a;
        if (b2 == 2) {
            i = 0;
        } else {
            if (b2 != 4) {
                u52.j(c7Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i3 = 1;
        for (int i4 = 1; i4 < c7Var.d; i4++) {
            int iR2 = R((i * i4) + c7Var.b, c7Var.a);
            byte b3 = c7Var.a;
            if (b3 == 2 ? iR2 != iR : !(b3 == 4 && iR2 == iR + 1)) {
                c7 c7VarA = A(c7Var.c, b3, iR, i3);
                q(c7VarA, i2);
                c7VarA.c = null;
                er5Var.d(c7VarA);
                if (c7Var.a == 4) {
                    i2 += i3;
                }
                i3 = 1;
                iR = iR2;
            } else {
                i3++;
            }
        }
        Object obj = c7Var.c;
        c7Var.c = null;
        er5Var.d(c7Var);
        if (i3 > 0) {
            c7 c7VarA2 = A(obj, c7Var.a, iR, i3);
            q(c7VarA2, i2);
            c7VarA2.c = null;
            er5Var.d(c7VarA2);
        }
    }

    public void q(c7 c7Var, int i) {
        x86 x86Var = (x86) this.f;
        x86Var.a(c7Var);
        byte b = c7Var.a;
        if (b != 2) {
            if (b == 4) {
                x86Var.c(i, c7Var.d, c7Var.c);
                return;
            } else {
                bt.q("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i2 = c7Var.d;
        RecyclerView recyclerView = x86Var.X;
        recyclerView.U(i, i2, true);
        recyclerView.n1 = true;
        recyclerView.k1.c += i2;
    }

    public void r(String str, int i, String str2) {
        String strL = ((eb9) this.d).l();
        String str3 = (String) this.g;
        str3.getClass();
        throw new vn3(ys0.t(i, str, strL, str2, ((mn3) this.c).h ? ys0.J(str3, i).toString() : null));
    }

    public int t(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i2 < size) {
            c7 c7Var = (c7) arrayList.get(i2);
            byte b = c7Var.a;
            int i3 = c7Var.b;
            if (b == 8) {
                if (i3 == i) {
                    i = c7Var.d;
                } else {
                    if (i3 < i) {
                        i--;
                    }
                    if (c7Var.d <= i) {
                        i++;
                    }
                }
            } else if (i3 > i) {
                continue;
            } else if (b == 2) {
                int i4 = c7Var.d;
                if (i < i3 + i4) {
                    return -1;
                }
                i -= i4;
            } else if (b == 1) {
                i += c7Var.d;
            }
            i2++;
        }
        return i;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.g);
                sb.append("', currentPosition=");
                return pc6.r(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public int u(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        s(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public ColorStateList v() {
        z11 z11Var = (z11) this.f;
        if (z11Var != null) {
            return (ColorStateList) z11Var.c;
        }
        return null;
    }

    public PorterDuff.Mode w() {
        z11 z11Var = (z11) this.f;
        if (z11Var != null) {
            return (PorterDuff.Mode) z11Var.d;
        }
        return null;
    }

    public boolean x() {
        return this.b < ((List) this.f).size() || !((ArrayList) this.d).isEmpty();
    }

    public boolean y() {
        return ((ArrayList) this.d).size() > 0;
    }

    public void z(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = (View) this.c;
        zv7 zv7VarR = zv7.r(i, 0, view.getContext(), attributeSet, h66.ViewBackgroundHelper);
        TypedArray typedArray = (TypedArray) zv7VarR.Y;
        View view2 = (View) this.c;
        cw8.m(view2, view2.getContext(), h66.ViewBackgroundHelper, attributeSet, (TypedArray) zv7VarR.Y, i);
        try {
            if (typedArray.hasValue(h66.ViewBackgroundHelper_android_background)) {
                this.b = typedArray.getResourceId(h66.ViewBackgroundHelper_android_background, -1);
                aq aqVar = (aq) this.d;
                Context context = view.getContext();
                int i2 = this.b;
                synchronized (aqVar) {
                    colorStateListF = aqVar.a.f(context, i2);
                }
                if (colorStateListF != null) {
                    L(colorStateListF);
                }
            }
            if (typedArray.hasValue(h66.ViewBackgroundHelper_backgroundTint)) {
                view.setBackgroundTintList(zv7VarR.c(h66.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArray.hasValue(h66.ViewBackgroundHelper_backgroundTintMode)) {
                view.setBackgroundTintMode(dw1.c(typedArray.getInt(h66.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            zv7VarR.v();
        } catch (Throwable th) {
            zv7VarR.v();
            throw th;
        }
    }

    public d7(View view) {
        this.a = (byte) 1;
        this.b = -1;
        this.c = view;
        this.d = aq.a();
    }

    public d7(x86 x86Var) {
        this.a = (byte) 0;
        this.c = new er5(30);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        this.f = x86Var;
        this.g = new q02((Object) this, (byte) 27);
    }

    public d7(String str, mn3 mn3Var) {
        this.a = (byte) 4;
        str.getClass();
        this.c = mn3Var;
        this.d = new eb9(mn3Var);
        this.f = new StringBuilder();
        this.g = str;
    }

    public d7() {
        this.a = (byte) 3;
        this.c = new w03[32];
        this.d = new float[32];
        this.e = new byte[32];
        t05 t05Var = vw6.a;
        this.f = new t05();
        this.g = new t05();
    }
}
