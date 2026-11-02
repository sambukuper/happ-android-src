package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fc0 {
    public int a;
    public boolean b;
    public final Object c;

    public fc0(int i) {
        this.b = false;
        this.c = tb0.Y;
        this.a = i;
    }

    public static int a(ArrayList arrayList, int i, et6 et6Var) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        ct6 ct6Var = et6Var.b;
        if (obj != ct6Var) {
            return -1;
        }
        Iterator it = ct6Var.g().iterator();
        while (it.hasNext()) {
            if (((gt6) it.next()) == et6Var) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList c(sb0 sb0Var) {
        ArrayList arrayList = new ArrayList();
        while (!sb0Var.w()) {
            String str = (String) sb0Var.Z;
            String strSubstring = null;
            if (!sb0Var.w()) {
                int i = sb0Var.X;
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    sb0Var.X = i;
                } else {
                    int iG = sb0Var.g();
                    while (true) {
                        if ((iG < 65 || iG > 90) && (iG < 97 || iG > 122)) {
                            break;
                        }
                        iG = sb0Var.g();
                    }
                    strSubstring = str.substring(i, sb0Var.X);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(tb0.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!sb0Var.S()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean j(dc0 dc0Var, int i, ArrayList arrayList, int i2, et6 et6Var) {
        ec0 ec0Var = (ec0) dc0Var.a.get(i);
        if (!m(ec0Var, et6Var)) {
            return false;
        }
        int i3 = ec0Var.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!l(dc0Var, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return l(dc0Var, i - 1, arrayList, i2);
        }
        int iA = a(arrayList, i2, et6Var);
        if (iA <= 0) {
            return false;
        }
        return j(dc0Var, i - 1, arrayList, i2, (et6) et6Var.b.g().get(iA - 1));
    }

    public static boolean k(dc0 dc0Var, et6 et6Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = et6Var.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((gt6) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = dc0Var.a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = dc0Var.a;
        if (size2 == 1) {
            return m((ec0) arrayList3.get(0), et6Var);
        }
        return j(dc0Var, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, et6Var);
    }

    public static boolean l(dc0 dc0Var, int i, ArrayList arrayList, int i2) {
        ec0 ec0Var = (ec0) dc0Var.a.get(i);
        et6 et6Var = (et6) arrayList.get(i2);
        if (!m(ec0Var, et6Var)) {
            return false;
        }
        int i3 = ec0Var.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (l(dc0Var, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return l(dc0Var, i - 1, arrayList, i2 - 1);
        }
        int iA = a(arrayList, i2, et6Var);
        if (iA <= 0) {
            return false;
        }
        return j(dc0Var, i - 1, arrayList, i2, (et6) et6Var.b.g().get(iA - 1));
    }

    public static boolean m(ec0 ec0Var, et6 et6Var) {
        ArrayList arrayList;
        String str = ec0Var.b;
        if (str != null && !str.equals(et6Var.o().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<qb0> arrayList2 = ec0Var.c;
        if (arrayList2 != null) {
            for (qb0 qb0Var : arrayList2) {
                String str2 = qb0Var.a;
                String str3 = qb0Var.c;
                if (str2.equals("id")) {
                    if (!str3.equals(et6Var.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = et6Var.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = ec0Var.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((ub0) it.next()).a(et6Var)) {
                return false;
            }
        }
        return true;
    }

    public void b(cc0 cc0Var, sb0 sb0Var) throws pb0 {
        int iIntValue;
        char cCharAt;
        int iH0;
        String strJ0 = sb0Var.j0();
        sb0Var.T();
        if (strJ0 == null) {
            throw new pb0("Invalid '@' rule");
        }
        int i = 0;
        if (!this.b && strJ0.equals("media")) {
            ArrayList arrayListC = c(sb0Var);
            if (!sb0Var.s('{')) {
                throw new pb0("Invalid @media rule: missing rule set");
            }
            sb0Var.T();
            tb0 tb0Var = (tb0) this.c;
            Iterator it = arrayListC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    e(sb0Var);
                    break;
                }
                tb0 tb0Var2 = (tb0) it.next();
                if (tb0Var2 == tb0.X || tb0Var2 == tb0Var) {
                    this.b = true;
                    cc0Var.b(e(sb0Var));
                    this.b = false;
                    break;
                }
            }
            if (!sb0Var.w() && !sb0Var.s('}')) {
                throw new pb0("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.b || !strJ0.equals("import")) {
            while (!sb0Var.w() && ((iIntValue = sb0Var.I().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strI0 = null;
            if (!sb0Var.w()) {
                int i2 = sb0Var.X;
                if (sb0Var.u("url(")) {
                    sb0Var.T();
                    String strI1 = sb0Var.i0();
                    if (strI1 == null) {
                        String str = (String) sb0Var.Z;
                        StringBuilder sb = new StringBuilder();
                        while (!sb0Var.w() && (cCharAt = str.charAt(sb0Var.X)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !nv0.F(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            sb0Var.X++;
                            if (cCharAt == '\\') {
                                if (!sb0Var.w()) {
                                    int i3 = sb0Var.X;
                                    sb0Var.X = i3 + 1;
                                    cCharAt = str.charAt(i3);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iH1 = sb0.h0(cCharAt);
                                        if (iH1 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !sb0Var.w() && (iH0 = sb0.h0(str.charAt(sb0Var.X))) != -1; i4++) {
                                                sb0Var.X++;
                                                iH1 = (iH1 * 16) + iH0;
                                            }
                                            sb.append((char) iH1);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strI1 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strI1 == null) {
                        sb0Var.X = i2;
                    } else {
                        sb0Var.T();
                        if (sb0Var.w() || sb0Var.u(")")) {
                            strI0 = strI1;
                        } else {
                            sb0Var.X = i2;
                        }
                    }
                }
            }
            if (strI0 == null) {
                strI0 = sb0Var.i0();
            }
            if (strI0 == null) {
                throw new pb0("Invalid @import rule: expected string or url()");
            }
            sb0Var.T();
            c(sb0Var);
            if (!sb0Var.w() && !sb0Var.s(';')) {
                throw new pb0("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        sb0Var.T();
    }

    public boolean d(cc0 cc0Var, sb0 sb0Var) throws pb0 {
        ArrayList<dc0> arrayListK0 = sb0Var.k0();
        if (arrayListK0 == null || arrayListK0.isEmpty()) {
            return false;
        }
        if (!sb0Var.s('{')) {
            throw new pb0("Malformed rule block: expected '{'");
        }
        sb0Var.T();
        ys6 ys6Var = new ys6();
        do {
            String strJ0 = sb0Var.j0();
            sb0Var.T();
            if (!sb0Var.s(':')) {
                throw new pb0("Expected ':'");
            }
            sb0Var.T();
            String str = (String) sb0Var.Z;
            String strSubstring = null;
            if (!sb0Var.w()) {
                int i = sb0Var.X;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!nv0.F(iCharAt)) {
                        i2 = sb0Var.X + 1;
                    }
                    iCharAt = sb0Var.g();
                }
                if (sb0Var.X > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    sb0Var.X = i;
                }
            }
            if (strSubstring == null) {
                throw new pb0("Expected property value");
            }
            sb0Var.T();
            if (sb0Var.s('!')) {
                sb0Var.T();
                if (!sb0Var.u("important")) {
                    throw new pb0("Malformed rule set: found unexpected '!'");
                }
                sb0Var.T();
            }
            sb0Var.s(';');
            pu6.C(ys6Var, strJ0, strSubstring);
            sb0Var.T();
            if (sb0Var.w()) {
                break;
            }
        } while (!sb0Var.s('}'));
        sb0Var.T();
        for (dc0 dc0Var : arrayListK0) {
            int i3 = this.a;
            bc0 bc0Var = new bc0();
            bc0Var.a = dc0Var;
            bc0Var.b = ys6Var;
            bc0Var.c = i3;
            cc0Var.a(bc0Var);
        }
        return true;
    }

    public cc0 e(sb0 sb0Var) {
        cc0 cc0Var = new cc0((byte) 0);
        while (!sb0Var.w()) {
            try {
                if (!sb0Var.u("<!--") && !sb0Var.u("-->")) {
                    if (!sb0Var.s('@')) {
                        if (!d(cc0Var, sb0Var)) {
                            break;
                        }
                    } else {
                        b(cc0Var, sb0Var);
                    }
                }
            } catch (pb0 e) {
                e.getMessage();
                return cc0Var;
            }
        }
        return cc0Var;
    }

    public ao3 f() {
        ao3 aq3Var;
        Object obj;
        d7 d7Var = (d7) this.c;
        byte bE = d7Var.E();
        if (bE == 1) {
            return i(true);
        }
        if (bE == 0) {
            return i(false);
        }
        if (bE != 6) {
            if (bE == 8) {
                return g();
            }
            d7.s(d7Var, "Cannot read Json element because of unexpected ".concat(x97.Z(bE)), 0, null, 6);
            throw null;
        }
        int i = this.a + 1;
        this.a = i;
        if (i == 200) {
            mr3 mr3Var = new mr3(this, null);
            xd1 xd1Var = new xd1();
            xd1Var.X = mr3Var;
            xd1Var.Y = xd1Var;
            c71 c71Var = hi5.X;
            xd1Var.Z = c71Var;
            while (true) {
                obj = xd1Var.Z;
                q51 q51Var = xd1Var.Y;
                if (q51Var == null) {
                    break;
                }
                if (dh3.f(c71Var, obj)) {
                    try {
                        mr3 mr3Var2 = xd1Var.X;
                        ci8.i(3, mr3Var2);
                        mr3 mr3Var3 = new mr3(mr3Var2.g0, q51Var);
                        mr3Var3.f0 = xd1Var;
                        Object objQ = mr3Var3.q(dn8.a);
                        if (objQ != c71.X) {
                            q51Var.f(objQ);
                        }
                    } catch (Throwable th) {
                        q51Var.f(new rj6(th));
                    }
                } else {
                    xd1Var.Z = c71Var;
                    q51Var.f(obj);
                }
            }
            w39.n0(obj);
            aq3Var = (ao3) obj;
        } else {
            byte bH = d7Var.h((byte) 6);
            if (d7Var.E() == 4) {
                d7.s(d7Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (d7Var.c()) {
                String strM = this.b ? d7Var.m() : d7Var.l();
                d7Var.h((byte) 5);
                linkedHashMap.put(strM, f());
                bH = d7Var.g();
                if (bH != 4) {
                    if (bH == 7) {
                        break;
                    }
                    d7.s(d7Var, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bH == 6) {
                d7Var.h((byte) 7);
            } else if (bH == 4) {
                ys0.F(d7Var, "object");
                throw null;
            }
            aq3Var = new aq3(linkedHashMap);
        }
        this.a--;
        return aq3Var;
    }

    public dn3 g() {
        d7 d7Var = (d7) this.c;
        byte bG = d7Var.g();
        if (d7Var.E() == 4) {
            d7.s(d7Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (d7Var.c()) {
            arrayList.add(f());
            bG = d7Var.g();
            if (bG != 4) {
                boolean z = bG == 9;
                int i = d7Var.b;
                if (!z) {
                    d7.s(d7Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bG == 8) {
            d7Var.h((byte) 9);
        } else if (bG == 4) {
            ys0.F(d7Var, "array");
            throw null;
        }
        return new dn3(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object h(xd1 xd1Var, r10 r10Var) {
        nr3 nr3Var;
        LinkedHashMap linkedHashMap;
        xd1 xd1Var2;
        byte bG;
        fc0 fc0Var;
        d7 d7Var;
        d7 d7Var2 = (d7) this.c;
        if (r10Var instanceof nr3) {
            nr3Var = (nr3) r10Var;
            int i = nr3Var.m0;
            if ((i & Integer.MIN_VALUE) != 0) {
                nr3Var.m0 = i - Integer.MIN_VALUE;
            } else {
                nr3Var = new nr3(this, r10Var);
            }
        } else {
            nr3Var = new nr3(this, r10Var);
        }
        Object obj = nr3Var.k0;
        int i2 = nr3Var.m0;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = nr3Var.j0;
            String str = nr3Var.i0;
            linkedHashMap = nr3Var.h0;
            fc0Var = nr3Var.g0;
            xd1Var2 = nr3Var.f0;
            w39.n0(obj);
            linkedHashMap.put(str, (ao3) obj);
            bG = ((d7) fc0Var.c).g();
            if (bG == 4) {
                i3 = i4;
                this = fc0Var;
            } else if (bG != 7) {
                d7.s((d7) fc0Var.c, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            d7Var = (d7) fc0Var.c;
            if (bG == 6) {
                d7Var.h((byte) 7);
            } else if (bG == 4) {
                ys0.F(d7Var, "object");
                throw null;
            }
            return new aq3(linkedHashMap);
        }
        w39.n0(obj);
        byte bH = d7Var2.h((byte) 6);
        if (d7Var2.E() == 4) {
            d7.s(d7Var2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        xd1Var2 = xd1Var;
        bG = bH;
        d7 d7Var3 = (d7) this.c;
        if (!d7Var3.c()) {
            fc0Var = this;
            d7Var = (d7) fc0Var.c;
            if (bG == 6) {
                d7Var.h((byte) 7);
            } else if (bG == 4) {
                ys0.F(d7Var, "object");
                throw null;
            }
            return new aq3(linkedHashMap);
        }
        String strM = this.b ? d7Var3.m() : d7Var3.l();
        d7Var3.h((byte) 5);
        nr3Var.f0 = xd1Var2;
        nr3Var.g0 = this;
        nr3Var.h0 = linkedHashMap;
        nr3Var.i0 = strM;
        nr3Var.j0 = i3;
        nr3Var.m0 = 1;
        xd1Var2.getClass();
        xd1Var2.Y = nr3Var;
        return c71.X;
    }

    public hq3 i(boolean z) {
        d7 d7Var = (d7) this.c;
        String strM = (this.b || !z) ? d7Var.m() : d7Var.l();
        return (z || !dh3.f(strM, "null")) ? new kp3(strM, z) : wp3.INSTANCE;
    }

    public fc0(aa7 aa7Var, int i, boolean z) {
        this.c = aa7Var;
        this.a = i;
        this.b = z;
    }

    public fc0(mn3 mn3Var, d7 d7Var) {
        this.c = d7Var;
        this.b = mn3Var.b;
    }
}
