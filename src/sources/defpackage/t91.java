package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t91 {
    public final LinkedHashMap a;

    public t91(q35 q35Var) {
        Map map = q35Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), wv0.Z0((Collection) entry.getValue()));
        }
        this.a = linkedHashMap;
    }

    public void a(pv4 pv4Var) {
        pv4Var.getClass();
        byte b = pv4Var.a;
        byte b2 = pv4Var.b;
        Integer numValueOf = Integer.valueOf(b);
        LinkedHashMap linkedHashMap = this.a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(b2))) {
            Objects.toString(treeMap2.get(Integer.valueOf(b2)));
            pv4Var.toString();
        }
        treeMap2.put(Integer.valueOf(b2), pv4Var);
    }

    public void b(HashMap map) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                Class<?> cls = value.getClass();
                zb6 zb6Var = yb6.a;
                zu3 zu3VarB = zb6Var.b(cls);
                if (!zu3VarB.equals(zb6Var.b(Boolean.TYPE)) && !zu3VarB.equals(zb6Var.b(Byte.TYPE)) && !zu3VarB.equals(zb6Var.b(Integer.TYPE)) && !zu3VarB.equals(zb6Var.b(Long.TYPE)) && !zu3VarB.equals(zb6Var.b(Float.TYPE)) && !zu3VarB.equals(zb6Var.b(Double.TYPE)) && !zu3VarB.equals(zb6Var.b(String.class)) && !zu3VarB.equals(zb6Var.b(Boolean[].class)) && !zu3VarB.equals(zb6Var.b(Byte[].class)) && !zu3VarB.equals(zb6Var.b(Integer[].class)) && !zu3VarB.equals(zb6Var.b(Long[].class)) && !zu3VarB.equals(zb6Var.b(Float[].class)) && !zu3VarB.equals(zb6Var.b(Double[].class)) && !zu3VarB.equals(zb6Var.b(String[].class))) {
                    int i = 0;
                    if (zu3VarB.equals(zb6Var.b(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int i2 = kb1.a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (zu3VarB.equals(zb6Var.b(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        int i3 = kb1.a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (zu3VarB.equals(zb6Var.b(int[].class))) {
                        int[] iArr = (int[]) value;
                        int i4 = kb1.a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (zu3VarB.equals(zb6Var.b(long[].class))) {
                        long[] jArr = (long[]) value;
                        int i5 = kb1.a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (zu3VarB.equals(zb6Var.b(float[].class))) {
                        float[] fArr = (float[]) value;
                        int i6 = kb1.a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!zu3VarB.equals(zb6Var.b(double[].class))) {
                            b61.l("Key ", str, " has invalid type ", zu3VarB);
                            return;
                        }
                        double[] dArr = (double[]) value;
                        int i7 = kb1.a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            this.a.put(str, value);
        }
    }

    public void c(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.a.put(lowerCase, i21.N(str));
    }

    public t91(byte b) {
        switch (b) {
            case 2:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }
}
