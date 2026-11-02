package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ux3 {
    public static final Object[][] a;
    public static final HashMap b;

    /* JADX WARN: Code duplicated, block: B:154:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4  */
    static {
        boolean z;
        al8 al8VarC;
        al8 al8VarC2;
        boolean z2;
        al8 al8VarC3;
        HashMap map;
        Set hashSet;
        al8 al8VarC4;
        HashMap map2;
        Set hashSet2;
        al8 al8VarC5;
        EnumSet enumSetNoneOf;
        boolean z3;
        Set set;
        Set set2;
        int i;
        cb0 cb0VarH;
        String strI;
        String strM;
        int iB;
        Set set3 = Collections.EMPTY_SET;
        Map map3 = Collections.EMPTY_MAP;
        boolean z4 = false;
        a = new Object[0][];
        b = new HashMap();
        r33 r33VarC = r33.C("com/ibm/icu/impl/data/icudata", "keyTypeData", r33.f, 4);
        al8 al8VarC6 = r33VarC.c("keyInfo");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cb0 cb0VarH2 = al8VarC6.h();
        while (true) {
            z = true;
            if (!cb0VarH2.r()) {
                break;
            }
            al8 al8VarS = cb0VarH2.s();
            String strI2 = al8VarS.i();
            if (strI2 != null) {
                if (strI2.equals("deprecated")) {
                    i = 1;
                } else if (strI2.equals("valueType")) {
                    i = 2;
                } else {
                    bt.q("No enum constant com.ibm.icu.impl.locale.KeyTypeData.KeyInfoType.".concat(strI2));
                }
                cb0VarH = al8VarS.h();
                while (cb0VarH.r()) {
                    al8 al8VarS2 = cb0VarH.s();
                    strI = al8VarS2.i();
                    strM = al8VarS2.m();
                    iB = p61.B(i);
                    if (iB != 0) {
                        linkedHashSet.add(strI);
                    } else if (iB != 1) {
                        linkedHashMap.put(strI, tx3.valueOf(strM));
                    }
                }
            } else {
                b61.i("Name is null");
            }
            i = 0;
            cb0VarH = al8VarS.h();
            while (cb0VarH.r()) {
                al8 al8VarS3 = cb0VarH.s();
                strI = al8VarS3.i();
                strM = al8VarS3.m();
                iB = p61.B(i);
                if (iB != 0) {
                    linkedHashSet.add(strI);
                } else if (iB != 1) {
                    linkedHashMap.put(strI, tx3.valueOf(strM));
                }
            }
        }
        Collections.unmodifiableSet(linkedHashSet);
        Collections.unmodifiableMap(linkedHashMap);
        al8 al8VarC7 = r33VarC.c("typeInfo");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        cb0 cb0VarH3 = al8VarC7.h();
        while (cb0VarH3.r()) {
            al8 al8VarS4 = cb0VarH3.s();
            String strI3 = al8VarS4.i();
            if (strI3 == null) {
                b61.i("Name is null");
            } else if (!strI3.equals("deprecated")) {
                bt.q("No enum constant com.ibm.icu.impl.locale.KeyTypeData.TypeInfoType.".concat(strI3));
            }
            cb0 cb0VarH4 = al8VarS4.h();
            while (cb0VarH4.r()) {
                al8 al8VarS5 = cb0VarH4.s();
                String strI4 = al8VarS5.i();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                cb0 cb0VarH5 = al8VarS5.h();
                while (cb0VarH5.r()) {
                    String strI5 = cb0VarH5.s().i();
                    if (p61.B(1) == 0) {
                        linkedHashSet2.add(strI5);
                    }
                }
                linkedHashMap2.put(strI4, Collections.unmodifiableSet(linkedHashSet2));
            }
        }
        Collections.unmodifiableMap(linkedHashMap2);
        al8 al8VarC8 = r33VarC.c("keyMap");
        al8 al8VarC9 = r33VarC.c("typeMap");
        try {
            al8VarC = r33VarC.c("typeAlias");
        } catch (MissingResourceException unused) {
            al8VarC = null;
        }
        try {
            al8VarC2 = r33VarC.c("bcpTypeAlias");
        } catch (MissingResourceException unused2) {
            al8VarC2 = null;
        }
        cb0 cb0VarH6 = al8VarC8.h();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        while (cb0VarH6.r()) {
            al8 al8VarS6 = cb0VarH6.s();
            String strI6 = al8VarS6.i();
            String strM2 = al8VarS6.m();
            if (strM2.length() == 0) {
                z2 = z;
                strM2 = strI6;
            } else {
                z2 = z4;
            }
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            linkedHashMap3.put(strM2, Collections.unmodifiableSet(linkedHashSet3));
            boolean zEquals = strI6.equals("timezone");
            char c = '/';
            if (al8VarC != null) {
                try {
                    al8VarC3 = al8VarC.c(strI6);
                } catch (MissingResourceException unused3) {
                    al8VarC3 = null;
                }
                if (al8VarC3 != null) {
                    map = new HashMap();
                    cb0 cb0VarH7 = al8VarC3.h();
                    while (cb0VarH7.r()) {
                        al8 al8VarS7 = cb0VarH7.s();
                        String strI7 = al8VarS7.i();
                        String strM3 = al8VarS7.m();
                        if (zEquals) {
                            strI7 = strI7.replace(':', c);
                        }
                        Set set4 = (Set) map.get(strM3);
                        if (set4 == null) {
                            hashSet = new HashSet();
                            map.put(strM3, hashSet);
                        } else {
                            hashSet = set4;
                        }
                        hashSet.add(strI7);
                        c = '/';
                    }
                } else {
                    map = null;
                }
            } else {
                map = null;
            }
            if (al8VarC2 != null) {
                try {
                    al8VarC4 = al8VarC2.c(strM2);
                } catch (MissingResourceException unused4) {
                    al8VarC4 = null;
                }
                if (al8VarC4 != null) {
                    map2 = new HashMap();
                    cb0 cb0VarH8 = al8VarC4.h();
                    while (cb0VarH8.r()) {
                        al8 al8VarS8 = cb0VarH8.s();
                        String strI8 = al8VarS8.i();
                        String strM4 = al8VarS8.m();
                        Set set5 = (Set) map2.get(strM4);
                        if (set5 == null) {
                            hashSet2 = new HashSet();
                            map2.put(strM4, hashSet2);
                        } else {
                            hashSet2 = set5;
                        }
                        hashSet2.add(strI8);
                    }
                } else {
                    map2 = null;
                }
            } else {
                map2 = null;
            }
            HashMap map4 = new HashMap();
            try {
                al8VarC5 = al8VarC9.c(strI6);
            } catch (MissingResourceException unused5) {
                al8VarC5 = null;
            }
            if (al8VarC5 != null) {
                cb0 cb0VarH9 = al8VarC5.h();
                enumSetNoneOf = null;
                while (cb0VarH9.r()) {
                    al8 al8VarS9 = cb0VarH9.s();
                    al8 al8Var = al8VarC2;
                    String strI9 = al8VarS9.i();
                    String strM5 = al8VarS9.m();
                    cb0 cb0Var = cb0VarH6;
                    al8 al8Var2 = al8VarC9;
                    char cCharAt = strI9.charAt(0);
                    if ('9' >= cCharAt || cCharAt >= 'a' || strM5.length() != 0) {
                        if (zEquals) {
                            strI9 = strI9.replace(':', '/');
                        }
                        if (strM5.length() == 0) {
                            strM5 = strI9;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        linkedHashSet3.add(strM5);
                        sx3 sx3Var = new sx3();
                        sx3Var.a = strI9;
                        sx3Var.b = strM5;
                        map4.put(gv3.Z(strI9), sx3Var);
                        if (!z3) {
                            map4.put(gv3.Z(strM5), sx3Var);
                        }
                        if (map != null && (set2 = (Set) map.get(strI9)) != null) {
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                map4.put(gv3.Z((String) it.next()), sx3Var);
                            }
                        }
                        if (map2 != null && (set = (Set) map2.get(strM5)) != null) {
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                map4.put(gv3.Z((String) it2.next()), sx3Var);
                            }
                        }
                    } else {
                        if (enumSetNoneOf == null) {
                            enumSetNoneOf = EnumSet.noneOf(qx3.class);
                        }
                        enumSetNoneOf.add(qx3.valueOf(strI9));
                        linkedHashSet3.add(strI9);
                    }
                    al8VarC2 = al8Var;
                    al8VarC9 = al8Var2;
                    cb0VarH6 = cb0Var;
                }
            } else {
                enumSetNoneOf = null;
            }
            al8 al8Var3 = al8VarC2;
            cb0 cb0Var2 = cb0VarH6;
            al8 al8Var4 = al8VarC9;
            lx3 lx3Var = new lx3();
            lx3Var.a = strI6;
            lx3Var.b = strM2;
            lx3Var.c = map4;
            lx3Var.d = enumSetNoneOf;
            HashMap map5 = b;
            map5.put(gv3.Z(strI6), lx3Var);
            if (!z2) {
                map5.put(gv3.Z(strM2), lx3Var);
            }
            al8VarC2 = al8Var3;
            al8VarC9 = al8Var4;
            cb0VarH6 = cb0Var2;
            z4 = false;
            z = true;
        }
        Collections.unmodifiableMap(linkedHashMap3);
    }
}
