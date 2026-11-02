package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sb0 extends nv0 {
    public sb0(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", _UrlKt.FRAGMENT_ENCODE_SET));
    }

    public static int h0(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public final String i0() {
        int iH0;
        if (w()) {
            return null;
        }
        char cCharAt = ((String) this.Z).charAt(this.X);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.X++;
        int iIntValue = I().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = I().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = I().intValue();
                    } else {
                        int iH1 = h0(iIntValue);
                        if (iH1 != -1) {
                            for (int i = 1; i <= 5 && (iH0 = h0((iIntValue = I().intValue()))) != -1; i++) {
                                iH1 = (iH1 * 16) + iH0;
                            }
                            sb.append((char) iH1);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = I().intValue();
        }
        return sb.toString();
    }

    public final String j0() {
        int i;
        String str = (String) this.Z;
        boolean zW = w();
        int i2 = this.X;
        if (zW) {
            i = i2;
        } else {
            int iCharAt = str.charAt(i2);
            if (iCharAt == 45) {
                iCharAt = g();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i2;
            } else {
                int iG = g();
                while (true) {
                    if ((iG < 65 || iG > 90) && ((iG < 97 || iG > 122) && !((iG >= 48 && iG <= 57) || iG == 45 || iG == 95))) {
                        break;
                    }
                    iG = g();
                }
                i = this.X;
            }
            this.X = i2;
        }
        if (i == i2) {
            return null;
        }
        String strSubstring = str.substring(i2, i);
        this.X = i;
        return strSubstring;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:190:0x030f  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:252:0x0419  */
    /* JADX WARN: Code duplicated, block: B:258:0x0436  */
    /* JADX WARN: Code duplicated, block: B:260:0x043a  */
    /* JADX WARN: Code duplicated, block: B:264:0x044e  */
    /* JADX WARN: Code duplicated, block: B:268:0x045d  */
    /* JADX WARN: Code duplicated, block: B:284:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x044a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r11v10, types: [ec0] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [ec0] */
    /* JADX WARN: Type inference failed for: r11v13, types: [ec0] */
    /* JADX WARN: Type inference failed for: r11v14, types: [ec0] */
    /* JADX WARN: Type inference failed for: r11v15, types: [ec0] */
    /* JADX WARN: Type inference failed for: r11v16, types: [ec0] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [ec0] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v12, types: [rb0] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final ArrayList k0() {
        ArrayList arrayList;
        int i;
        ?? ec0Var;
        boolean z;
        ArrayList arrayList2;
        int i2;
        String strL;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        xe3 xe3VarB;
        ?? r8;
        rb0 rb0Var;
        Object obj;
        Object obj2;
        ArrayList arrayListK0;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object obj3;
        ArrayList arrayList5;
        zb0 zb0Var;
        String str = null;
        if (w()) {
            return null;
        }
        ?? r3 = 1;
        ArrayList arrayList6 = new ArrayList(1);
        dc0 dc0Var = new dc0();
        while (!w() && !w()) {
            int i5 = this.X;
            ArrayList arrayList7 = dc0Var.a;
            int i6 = 2;
            boolean z4 = false;
            if (arrayList7 == null || arrayList7.isEmpty()) {
                i = 0;
            } else if (s('>')) {
                T();
                i = 2;
            } else if (s('+')) {
                T();
                i = 3;
            } else {
                i = 0;
            }
            if (s('*')) {
                ec0Var = new ec0(i, str);
            } else {
                String strJ0 = j0();
                if (strJ0 != null) {
                    ec0 ec0Var2 = new ec0(i, strJ0);
                    dc0Var.b += r3;
                    ec0Var = ec0Var2;
                } else {
                    ec0Var = str;
                }
            }
            while (!w()) {
                if (s('.')) {
                    if (ec0Var == 0) {
                        ec0Var = new ec0(i, str);
                    }
                    String strJ1 = j0();
                    if (strJ1 == null) {
                        throw new pb0("Invalid \".class\" simpleSelectors");
                    }
                    ec0Var.a("class", i6, strJ1);
                    dc0Var.a();
                } else if (s('#')) {
                    if (ec0Var == 0) {
                        ec0Var = new ec0(i, str);
                    }
                    String strJ2 = j0();
                    if (strJ2 == null) {
                        throw new pb0("Invalid \"#id\" simpleSelectors");
                    }
                    ec0Var.a("id", i6, strJ2);
                    dc0Var.b += 1000000;
                } else if (s('[')) {
                    if (ec0Var == 0) {
                        ec0Var = new ec0(i, str);
                    }
                    T();
                    String strJ3 = j0();
                    if (strJ3 == null) {
                        throw new pb0("Invalid attribute simpleSelectors");
                    }
                    T();
                    if (s('=')) {
                        i2 = i6;
                    } else if (u("~=")) {
                        i2 = 3;
                    } else {
                        i2 = u("|=") ? 4 : z4 ? 1 : 0;
                    }
                    if (i2 != 0) {
                        T();
                        if (w()) {
                            strL = str;
                        } else {
                            strL = L();
                            if (strL == null) {
                                strL = j0();
                            }
                        }
                        if (strL == null) {
                            throw new pb0("Invalid attribute simpleSelectors");
                        }
                        T();
                    } else {
                        strL = str;
                    }
                    if (!s(']')) {
                        throw new pb0("Invalid attribute simpleSelectors");
                    }
                    if (i2 == 0) {
                        i2 = r3 == true ? 1 : 0;
                    }
                    ec0Var.a(strJ3, i2, strL);
                    dc0Var.a();
                } else {
                    ec0Var = ec0Var;
                    if (s(':')) {
                        if (ec0Var == 0) {
                            ec0Var = new ec0(i, str);
                        }
                        String strJ4 = j0();
                        if (strJ4 == null) {
                            throw new pb0("Invalid pseudo class");
                        }
                        xb0 xb0Var = (xb0) xb0.g0.get(strJ4);
                        if (xb0Var == null) {
                            xb0Var = xb0.f0;
                        }
                        switch (xb0Var.ordinal()) {
                            case 0:
                                z2 = r3 == true ? 1 : 0;
                                i3 = 2;
                                wb0 wb0Var = new wb0((byte) 2);
                                dc0Var.a();
                                obj3 = wb0Var;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 1:
                                z3 = true;
                                wb0 wb0Var2 = new wb0((byte) 1);
                                dc0Var.a();
                                obj = wb0Var2;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                boolean z5 = (xb0Var == xb0.X || xb0Var == xb0.Y) ? r3 == true ? 1 : 0 : z4 ? 1 : 0;
                                boolean z6 = (xb0Var == xb0.Y || xb0Var == xb0.Z) ? r3 == true ? 1 : 0 : z4 ? 1 : 0;
                                int i7 = this.Y;
                                String str2 = (String) this.Z;
                                if (w()) {
                                    r8 = str;
                                } else {
                                    int i8 = this.X;
                                    if (s('(')) {
                                        T();
                                        if (u("odd")) {
                                            rb0Var = new rb0(2, r3 == true ? 1 : 0);
                                        } else if (u("even")) {
                                            rb0Var = new rb0(2, z4 ? 1 : 0);
                                        } else {
                                            int i9 = (!s('+') && s('-')) ? -1 : r3 == true ? 1 : 0;
                                            xe3 xe3VarB2 = xe3.b(this.X, i7, str2);
                                            if (xe3VarB2 != null) {
                                                this.X = xe3VarB2.X;
                                            }
                                            if (s('n') || s('N')) {
                                                if (xe3VarB2 == null) {
                                                    xe3VarB2 = new xe3(1L, this.X);
                                                }
                                                T();
                                                boolean zS = s('+');
                                                i4 = (zS || !(zS = s('-'))) ? 1 : -1;
                                                if (zS) {
                                                    T();
                                                    xe3VarB = xe3.b(this.X, i7, str2);
                                                    if (xe3VarB != null) {
                                                        this.X = xe3VarB.X;
                                                    } else {
                                                        this.X = i8;
                                                    }
                                                    r8 = 0;
                                                } else {
                                                    xe3VarB = null;
                                                }
                                            } else {
                                                xe3VarB = xe3VarB2;
                                                i4 = i9 == true ? 1 : 0;
                                                xe3VarB2 = null;
                                                i9 = 1;
                                            }
                                            rb0Var = new rb0(xe3VarB2 == null ? 0 : i9 * ((int) xe3VarB2.Y), xe3VarB == 0 ? 0 : i4 * ((int) xe3VarB.Y));
                                        }
                                        T();
                                        r8 = rb0Var;
                                        if (!s(')')) {
                                            this.X = i8;
                                            r8 = 0;
                                        }
                                    } else {
                                        r8 = str;
                                    }
                                }
                                if (r8 == 0) {
                                    throw new pb0("Invalid or missing parameter section for pseudo class: ".concat(strJ4));
                                }
                                vb0 vb0Var = new vb0(ec0Var.b, r8.a, r8.b, z5, z6);
                                dc0Var.a();
                                obj = vb0Var;
                                z3 = true;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                                break;
                            case 6:
                                vb0 vb0Var2 = new vb0(null, 0, 1, true, false);
                                dc0Var.a();
                                z3 = r3 == true ? 1 : 0;
                                obj = vb0Var2;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 7:
                                vb0 vb0Var3 = new vb0(null, 0, 1, false, false);
                                dc0Var.a();
                                z3 = r3 == true ? 1 : 0;
                                obj = vb0Var3;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 8:
                                vb0 vb0Var4 = new vb0(ec0Var.b, 0, 1, true, true);
                                dc0Var.a();
                                z3 = r3 == true ? 1 : 0;
                                obj = vb0Var4;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 9:
                                vb0 vb0Var5 = new vb0(ec0Var.b, 0, 1, false, true);
                                dc0Var.a();
                                z3 = r3 == true ? 1 : 0;
                                obj = vb0Var5;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 10:
                                ac0 ac0Var = new ac0(z4, str);
                                dc0Var.a();
                                obj2 = ac0Var;
                                z3 = r3 == true ? 1 : 0;
                                obj = obj2;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 11:
                                ac0 ac0Var2 = new ac0(r3, ec0Var.b);
                                dc0Var.a();
                                obj2 = ac0Var2;
                                z3 = r3 == true ? 1 : 0;
                                obj = obj2;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case FileClientSessionCache.MAX_SIZE /* 12 */:
                                wb0 wb0Var3 = new wb0(z4 ? (byte) 1 : (byte) 0);
                                dc0Var.a();
                                obj2 = wb0Var3;
                                z3 = r3 == true ? 1 : 0;
                                obj = obj2;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 13:
                                if (w()) {
                                    arrayListK0 = str;
                                } else {
                                    int i10 = this.X;
                                    if (s('(')) {
                                        T();
                                        arrayListK0 = k0();
                                        if (arrayListK0 != null && s(')')) {
                                            Iterator it = arrayListK0.iterator();
                                            while (it.hasNext() && (arrayList3 = ((dc0) it.next()).a) != null) {
                                                Iterator it2 = arrayList3.iterator();
                                                while (true) {
                                                    if (it2.hasNext() && (arrayList4 = ((ec0) it2.next()).d) != null) {
                                                        Iterator it3 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                if (((ub0) it3.next()) instanceof yb0) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.X = i10;
                                        }
                                        arrayListK0 = str;
                                    } else {
                                        arrayListK0 = str;
                                    }
                                }
                                if (arrayListK0 == null) {
                                    throw new pb0("Invalid or missing parameter section for pseudo class: ".concat(strJ4));
                                }
                                yb0 yb0Var = new yb0();
                                yb0Var.a = arrayListK0;
                                Iterator it4 = arrayListK0.iterator();
                                int i11 = Integer.MIN_VALUE;
                                while (it4.hasNext()) {
                                    int i12 = ((dc0) it4.next()).b;
                                    if (i12 > i11) {
                                        i11 = i12;
                                    }
                                }
                                dc0Var.b = i11;
                                z3 = r3 == true ? 1 : 0;
                                obj = yb0Var;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                                break;
                            case 14:
                                if (!w()) {
                                    int i13 = this.X;
                                    if (s('(')) {
                                        T();
                                        ?? arrayList8 = str;
                                        while (true) {
                                            String strJ5 = j0();
                                            arrayList8 = arrayList8;
                                            if (strJ5 == null) {
                                                this.X = i13;
                                            } else {
                                                if (arrayList8 == 0) {
                                                    arrayList8 = new ArrayList();
                                                }
                                                arrayList8.add(strJ5);
                                                T();
                                                if (!S()) {
                                                    if (!s(')')) {
                                                        this.X = i13;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                zb0 zb0Var2 = new zb0(strJ4);
                                dc0Var.a();
                                zb0Var = zb0Var2;
                                z2 = r3 == true ? 1 : 0;
                                i3 = i6;
                                obj3 = zb0Var;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 15:
                            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                            case 22:
                            case 23:
                                zb0 zb0Var3 = new zb0(strJ4);
                                dc0Var.a();
                                zb0Var = zb0Var3;
                                z2 = r3 == true ? 1 : 0;
                                i3 = i6;
                                obj3 = zb0Var;
                                arrayList5 = ec0Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    ec0Var.d = arrayList5;
                                }
                                arrayList5.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            default:
                                throw new pb0("Unsupported pseudo class: ".concat(strJ4));
                        }
                    } else {
                        z = r3 == true ? 1 : 0;
                        if (ec0Var != 0) {
                            this.X = i5;
                            arrayList = dc0Var.a;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList6.add(dc0Var);
                            }
                            return arrayList6;
                        }
                        arrayList2 = dc0Var.a;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            dc0Var.a = arrayList2;
                        }
                        arrayList2.add(ec0Var);
                        if (!S()) {
                            arrayList6.add(dc0Var);
                            dc0Var = new dc0();
                        }
                        r3 = z ? 1 : 0;
                        str = null;
                    }
                }
            }
            z = r3 == true ? 1 : 0;
            if (ec0Var != 0) {
                this.X = i5;
                arrayList = dc0Var.a;
                if (arrayList != null) {
                    arrayList6.add(dc0Var);
                }
                return arrayList6;
            }
            arrayList2 = dc0Var.a;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                dc0Var.a = arrayList2;
            }
            arrayList2.add(ec0Var);
            if (!S()) {
                arrayList6.add(dc0Var);
                dc0Var = new dc0();
            }
            r3 = z ? 1 : 0;
            str = null;
        }
        arrayList = dc0Var.a;
        if (arrayList != null) {
            arrayList6.add(dc0Var);
        }
        return arrayList6;
    }
}
