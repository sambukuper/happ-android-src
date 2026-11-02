package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yc0 extends cw0 {
    public final /* synthetic */ byte f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc0(byte b) {
        super((byte) 5);
        this.f0 = b;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0351 A[Catch: Exception -> 0x0379, TRY_LEAVE, TryCatch #13 {Exception -> 0x0379, blocks: (B:146:0x032c, B:148:0x0351, B:160:0x0378, B:166:0x0382, B:168:0x0388, B:170:0x0390, B:172:0x0396, B:174:0x03a0, B:177:0x03ad), top: B:372:0x032c }] */
    /* JADX WARN: Code duplicated, block: B:182:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:190:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:191:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:193:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:262:0x050e  */
    /* JADX WARN: Code duplicated, block: B:299:0x05fc A[PHI: r6
  0x05fc: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v10 java.lang.String), (r6v12 java.lang.String) binds: [B:303:0x0608, B:301:0x0602, B:297:0x05f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:304:0x060a  */
    /* JADX WARN: Code duplicated, block: B:372:0x032c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x0362 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:193:0x03d5, please report this as an issue */
    @Override // defpackage.cw0
    public final Object q0(Object obj, Object obj2) throws Throwable {
        al8 al8VarC;
        r33 r33VarG;
        String str;
        int iLastIndexOf;
        String strSubstring;
        String str2;
        String str3;
        String str4;
        ByteBuffer byteBufferC;
        boolean z;
        nf6 nf6VarB;
        nf6 nf6Var;
        nf6 nf6Var2;
        nf6 nf6VarB2;
        boolean z2;
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;
        nf6 nf6Var3;
        TreeMap treeMap;
        TreeSet<String> treeSet;
        al8 al8VarB;
        byte b = this.f0;
        String str5 = _UrlKt.FRAGMENT_ENCODE_SET;
        switch (b) {
            case 0:
                String str6 = (String) obj;
                String str7 = str6 == null ? "001" : str6;
                al8 al8VarC2 = al8.v("com/ibm/icu/impl/data/icudata", "supplementalData", r33.f).c("weekData");
                try {
                    al8VarC = al8VarC2.c(str7);
                    break;
                } catch (MissingResourceException e) {
                    if (str7.equals("001")) {
                        throw e;
                    }
                    al8VarC = al8VarC2.c("001");
                }
                int[] iArrG = al8VarC.g();
                return new xc0(iArrG[0], iArrG[1], iArrG[2], iArrG[3], iArrG[4], iArrG[5]);
            case 1:
                j33 j33Var = (j33) obj2;
                String str8 = j33Var.f;
                ClassLoader classLoader = j33Var.d;
                String str9 = j33Var.c;
                String str10 = j33Var.b;
                int i = j33Var.e;
                boolean z3 = r33.h;
                if (z3) {
                    System.out.println("Creating " + j33Var.a);
                }
                if (str10.indexOf(46) == -1) {
                    str5 = "root";
                }
                boolean zIsEmpty = str9.isEmpty();
                String str11 = str9;
                if (zIsEmpty) {
                    str11 = str5;
                }
                r33 r33VarY = r33.y(str10, str11, classLoader);
                if (z3) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder("The bundle created is: ");
                    sb.append(r33VarY);
                    sb.append(" and openType=");
                    if (i == 1) {
                        str4 = "LOCALE_DEFAULT_ROOT";
                    } else if (i == 2) {
                        str4 = "LOCALE_ROOT";
                    } else if (i != 3) {
                        str4 = i != 4 ? "null" : "DIRECT";
                    } else {
                        str4 = "LOCALE_ONLY";
                    }
                    sb.append(str4);
                    sb.append(" and bundle.getNoFallback=");
                    sb.append(r33VarY != null && ((z33) r33VarY.b.h0).i);
                    printStream.println(sb.toString());
                }
                if (i == 4) {
                    return r33VarY;
                }
                if (r33VarY != null && ((z33) r33VarY.b.h0).i) {
                    return r33VarY;
                }
                if (r33VarY != null) {
                    String str12 = (String) r33VarY.b.Z;
                    int iLastIndexOf2 = str12.lastIndexOf(95);
                    q33 q33Var = (q33) r33VarY;
                    z33 z33Var = (z33) q33Var.b.h0;
                    int iL = ((y33) q33Var.i).l(z33Var, "%%Parent");
                    String strG = iL < 0 ? null : z33Var.g(q33Var.i.h(z33Var, iL));
                    if (strG != null) {
                        r33VarG = r33.G(str10, strG, null, j33Var.f, j33Var.d, j33Var.e);
                    } else if (iLastIndexOf2 != -1) {
                        r33VarG = r33.G(str10, str12.substring(0, iLastIndexOf2), null, j33Var.f, j33Var.d, j33Var.e);
                    } else {
                        r33VarG = !str12.equals(str5) ? r33.G(str10, str5, null, j33Var.f, j33Var.d, j33Var.e) : null;
                    }
                    if (r33VarY.equals(r33VarG)) {
                        return r33VarY;
                    }
                    r33VarY.setParent(r33VarG);
                    return r33VarY;
                }
                int i2 = (i == 1 && str11.equals(str8)) ? 2 : i;
                String str13 = j33Var.g;
                String str14 = str13;
                if (str13 == null) {
                    str14 = str11;
                }
                if (str11.endsWith("_")) {
                    str = null;
                    iLastIndexOf = str11.lastIndexOf(95);
                    if (iLastIndexOf >= 0) {
                        strSubstring = str11.substring(0, iLastIndexOf);
                        str2 = strSubstring;
                    } else {
                        str2 = str;
                    }
                } else {
                    yc0 yc0Var = sk8.g0;
                    if (new fe4(str11).d().isEmpty()) {
                        sk8 sk8Var = new sk8(str11);
                        String str15 = sk8Var.b().a;
                        String str16 = sk8Var.b().b;
                        String str17 = sk8Var.b().c;
                        if (i != 1 || (str3 = (String) ee4.b.get(str11)) == null) {
                            if (str16.isEmpty() || str17.isEmpty()) {
                                if (str17.isEmpty()) {
                                    if (str16.isEmpty()) {
                                        str = null;
                                    } else {
                                        if (i == 1) {
                                            str = null;
                                            if (r33.D(str15, null).equals(str16)) {
                                            }
                                        }
                                        str2 = str15;
                                    }
                                    str2 = str;
                                } else {
                                    fe4 fe4Var = new fe4(str14);
                                    fe4Var.m();
                                    if (fe4Var.e()) {
                                        fe4Var.b = 2;
                                    }
                                    while (!fe4.f(fe4Var.g())) {
                                    }
                                    fe4Var.b--;
                                    String strSubstring2 = fe4Var.c.substring(fe4Var.k());
                                    strSubstring = strSubstring2.isEmpty() ? str15 + "_" + r33.D(str15, str17) : str15 + "_" + strSubstring2;
                                }
                            } else if (r33.D(str15, str17).equals(str16)) {
                                strSubstring = str15 + "_" + str17;
                            } else {
                                strSubstring = str15 + "_" + str16;
                            }
                            str2 = strSubstring;
                        } else {
                            str2 = str3.equals("root") ? null : str3;
                        }
                    } else {
                        str = null;
                        iLastIndexOf = str11.lastIndexOf(95);
                        if (iLastIndexOf >= 0) {
                            strSubstring = str11.substring(0, iLastIndexOf);
                            str2 = strSubstring;
                        } else {
                            str2 = str;
                        }
                    }
                }
                if (str2 != null) {
                    return r33.G(str10, str2, str14, j33Var.f, j33Var.d, i2);
                }
                int i3 = i2;
                if (i3 != 1 || (str8.startsWith(str11) && (str8.length() == str11.length() || str8.charAt(str11.length()) == '_'))) {
                    return (i3 == 3 || str5.isEmpty()) ? r33VarY : r33.y(str10, str5, classLoader);
                }
                String str18 = j33Var.f;
                return r33.G(str10, str18, null, str18, j33Var.d, i3);
            case 2:
                u33 u33Var = (u33) obj;
                ClassLoader classLoader2 = (ClassLoader) obj2;
                String str19 = u33Var.a;
                String strB = z33.b(str19, u33Var.b);
                try {
                    if (str19.startsWith("com/ibm/icu/impl/data/icudata")) {
                        byteBufferC = b33.e(classLoader2, strB, strB.substring(30), false);
                        if (byteBufferC == null) {
                            return z33.q;
                        }
                    } else {
                        InputStream inputStreamA = g33.A(classLoader2, strB, false);
                        if (inputStreamA == null) {
                            return z33.q;
                        }
                        byteBufferC = b33.c(inputStreamA);
                    }
                    return new z33(byteBufferC, str19, classLoader2);
                } catch (IOException e2) {
                    StringBuilder sbP = p61.p("Data file ", strB, " is corrupt - ");
                    sbP.append(e2.getMessage());
                    throw new a43(sbP.toString(), e2);
                }
            case 3:
                mf6 mf6Var = (mf6) obj2;
                String str20 = mf6Var.f;
                ClassLoader classLoader3 = mf6Var.d;
                String str21 = mf6Var.c;
                boolean z4 = mf6Var.e;
                String str22 = mf6Var.b;
                String str23 = mf6Var.a;
                int iLastIndexOf3 = str23.lastIndexOf(95);
                if (iLastIndexOf3 != -1) {
                    nf6VarB = nf6.B(str22, str23.substring(0, iLastIndexOf3), str21, classLoader3, z4);
                    z = false;
                } else if (str23.isEmpty()) {
                    z = false;
                    nf6VarB = null;
                } else {
                    nf6VarB = nf6.B(str22, _UrlKt.FRAGMENT_ENCODE_SET, str21, classLoader3, z4);
                    z = true;
                }
                try {
                    nf6VarB2 = new nf6((ResourceBundle) classLoader3.loadClass(str20).asSubclass(ResourceBundle.class).newInstance());
                    if (nf6VarB != null) {
                        try {
                            nf6VarB2.setParent(nf6VarB);
                        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                            nf6Var2 = nf6VarB2;
                            nf6VarB2 = nf6Var2;
                            z2 = true;
                            if (z2) {
                                try {
                                    inputStream = (InputStream) AccessController.doPrivileged(new f33((byte) 1, mf6Var, str20.replace('.', '/') + ".properties"));
                                    if (inputStream != null) {
                                        bufferedInputStream = new BufferedInputStream(inputStream);
                                        try {
                                            nf6Var3 = new nf6(new PropertyResourceBundle(bufferedInputStream));
                                            if (nf6VarB != null) {
                                                try {
                                                    nf6Var3.setParent(nf6VarB);
                                                } catch (Exception unused2) {
                                                    nf6VarB2 = nf6Var3;
                                                    try {
                                                        bufferedInputStream.close();
                                                        break;
                                                    } catch (Exception unused3) {
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    try {
                                                        bufferedInputStream.close();
                                                        break;
                                                    } catch (Exception unused4) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            nf6Var3.d = str22;
                                            nf6Var3.c = str23;
                                            try {
                                                bufferedInputStream.close();
                                                break;
                                            } catch (Exception unused5) {
                                            }
                                            nf6VarB2 = nf6Var3;
                                        } catch (Exception unused6) {
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                    if (nf6VarB2 == null) {
                                        nf6VarB2 = nf6.B(str22, str21, str21, classLoader3, z4);
                                    }
                                    if (nf6VarB2 == null) {
                                        nf6VarB = nf6VarB2;
                                    } else {
                                        nf6VarB = nf6VarB2;
                                    }
                                    nf6VarB2 = nf6VarB;
                                } catch (Exception e3) {
                                    boolean z5 = nf6.g;
                                    if (z5) {
                                        System.out.println("failure");
                                    }
                                    if (z5) {
                                        System.out.println(e3);
                                    }
                                }
                            }
                            if (nf6VarB2 != null) {
                                nf6VarB2.A();
                            } else if (nf6.g) {
                                System.out.println("Returning null for " + str22 + "_" + str23);
                            }
                            return nf6VarB2;
                        } catch (Exception e4) {
                            e = e4;
                            nf6Var = nf6VarB2;
                            boolean z6 = nf6.g;
                            if (z6) {
                                System.out.println("failure");
                            }
                            if (z6) {
                                System.out.println(e);
                            }
                            nf6VarB2 = nf6Var;
                        }
                    }
                    nf6VarB2.d = str22;
                    nf6VarB2.c = str23;
                    break;
                } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
                    nf6Var2 = null;
                } catch (Exception e5) {
                    e = e5;
                    nf6Var = null;
                }
                z2 = false;
                if (z2) {
                    inputStream = (InputStream) AccessController.doPrivileged(new f33((byte) 1, mf6Var, str20.replace('.', '/') + ".properties"));
                    if (inputStream != null) {
                        bufferedInputStream = new BufferedInputStream(inputStream);
                        nf6Var3 = new nf6(new PropertyResourceBundle(bufferedInputStream));
                        if (nf6VarB != null) {
                            nf6Var3.setParent(nf6VarB);
                        }
                        nf6Var3.d = str22;
                        nf6Var3.c = str23;
                        bufferedInputStream.close();
                        nf6VarB2 = nf6Var3;
                    }
                    if (nf6VarB2 == null && !z4 && !str23.isEmpty() && str23.indexOf(95) < 0 && (!str21.startsWith(str23) || (str21.length() != str23.length() && str21.charAt(str23.length()) != '_'))) {
                        nf6VarB2 = nf6.B(str22, str21, str21, classLoader3, z4);
                    }
                    if (nf6VarB2 == null || (z && z4)) {
                        nf6VarB = nf6VarB2;
                    }
                    nf6VarB2 = nf6VarB;
                }
                if (nf6VarB2 != null) {
                    nf6VarB2.A();
                } else if (nf6.g) {
                    System.out.println("Returning null for " + str22 + "_" + str23);
                }
                return nf6VarB2;
            case 4:
                fe4 fe4Var2 = new fe4((String) obj);
                fe4Var2.h();
                fe4Var2.c.length();
                Map mapC = fe4Var2.c();
                if (!mapC.isEmpty()) {
                    boolean z7 = true;
                    for (Map.Entry entry : mapC.entrySet()) {
                        fe4Var2.a(z7 ? '@' : ';');
                        fe4Var2.c.append((String) entry.getKey());
                        fe4Var2.a('=');
                        fe4Var2.c.append((String) entry.getValue());
                        z7 = false;
                    }
                }
                return fe4Var2.c.substring(0);
            case 5:
                Locale locale = (Locale) obj;
                boolean z8 = qk8.a;
                String language = locale.getLanguage();
                String country = locale.getCountry();
                String variant = locale.getVariant();
                String script = locale.getScript();
                Set<Character> extensionKeys = locale.getExtensionKeys();
                if (extensionKeys.isEmpty()) {
                    treeMap = null;
                    treeSet = null;
                } else {
                    TreeSet treeSet2 = null;
                    TreeMap treeMap2 = null;
                    for (Character ch : extensionKeys) {
                        if (ch.charValue() == 'u') {
                            Set<String> unicodeLocaleAttributes = locale.getUnicodeLocaleAttributes();
                            if (!unicodeLocaleAttributes.isEmpty()) {
                                treeSet2 = new TreeSet();
                                Iterator<String> it = unicodeLocaleAttributes.iterator();
                                while (it.hasNext()) {
                                    treeSet2.add(it.next());
                                }
                            }
                            for (String str24 : locale.getUnicodeLocaleKeys()) {
                                String unicodeLocaleType = locale.getUnicodeLocaleType(str24);
                                if (unicodeLocaleType != null) {
                                    if (str24.equals("va")) {
                                        if (variant.length() != 0) {
                                            unicodeLocaleType = pc6.p(unicodeLocaleType, "_", variant);
                                        }
                                        variant = unicodeLocaleType;
                                    } else {
                                        if (treeMap2 == null) {
                                            treeMap2 = new TreeMap();
                                        }
                                        treeMap2.put(str24, unicodeLocaleType);
                                    }
                                }
                            }
                        } else {
                            String extension = locale.getExtension(ch.charValue());
                            if (extension != null) {
                                if (treeMap2 == null) {
                                    treeMap2 = new TreeMap();
                                }
                                treeMap2.put(String.valueOf(ch), extension);
                            }
                        }
                    }
                    treeMap = treeMap2;
                    treeSet = treeSet2;
                }
                if (language.equals("no") && country.equals("NO") && variant.equals("NY")) {
                    language = "nn";
                } else {
                    str5 = variant;
                }
                StringBuilder sb2 = new StringBuilder(language);
                if (script.length() > 0) {
                    sb2.append('_');
                    sb2.append(script);
                }
                if (country.length() > 0) {
                    sb2.append('_');
                    sb2.append(country);
                }
                if (str5.length() > 0) {
                    if (country.length() == 0) {
                        sb2.append('_');
                    }
                    sb2.append('_');
                    sb2.append(str5);
                }
                if (treeSet != null) {
                    StringBuilder sb3 = new StringBuilder();
                    for (String str25 : treeSet) {
                        if (sb3.length() != 0) {
                            sb3.append('-');
                        }
                        sb3.append(str25);
                    }
                    if (treeMap == null) {
                        treeMap = new TreeMap();
                    }
                    treeMap.put("attribute", sb3.toString());
                }
                if (treeMap != null) {
                    sb2.append('@');
                    boolean z9 = false;
                    for (Map.Entry entry2 : treeMap.entrySet()) {
                        String strL = (String) entry2.getKey();
                        String strM = (String) entry2.getValue();
                        if (strL.length() != 1) {
                            strL = sk8.l(strL);
                            if (strM.length() == 0) {
                                strM = "yes";
                            }
                            strM = sk8.m(strL, strM);
                        }
                        if (z9) {
                            sb2.append(';');
                        } else {
                            z9 = true;
                        }
                        sb2.append(strL);
                        sb2.append('=');
                        sb2.append(strM);
                    }
                }
                return new sk8(sk8.g(sb2.toString()), locale);
            case 6:
                int[] iArr = (int[]) obj2;
                String strB2 = o79.b(iArr[1], iArr[2], iArr[3], iArr[0] < 0);
                int i4 = ((((iArr[1] * 60) + iArr[2]) * 60) + iArr[3]) * iArr[0] * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
                z97 z97Var = new z97(strB2);
                z97Var.i0 = 3600000;
                z97Var.x0 = false;
                z97Var.i(i4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3600000);
                z97Var.x0 = true;
                return z97Var;
            default:
                String str26 = (String) obj2;
                try {
                    al8 al8VarV = al8.v("com/ibm/icu/impl/data/icudata", "zoneinfo64", r33.f);
                    int iD = o79.d(str26);
                    if (iD >= 0) {
                        try {
                            al8 al8VarC3 = al8VarV.c("Zones");
                            al8VarB = al8VarC3.b(iD);
                            if (al8VarB.p() == 7) {
                                al8VarB = al8VarC3.b(al8VarB.f());
                            }
                        } catch (MissingResourceException unused8) {
                            al8VarB = null;
                        }
                    } else {
                        al8VarB = null;
                    }
                    if (al8VarB != null) {
                        o95 o95Var = new o95(al8VarV, al8VarB, str26);
                        try {
                            o95Var.p0 = true;
                            break;
                        } catch (MissingResourceException unused9) {
                        }
                        return o95Var;
                    }
                    break;
                } catch (MissingResourceException unused10) {
                }
                return null;
        }
    }
}
