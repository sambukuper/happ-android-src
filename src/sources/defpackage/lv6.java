package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lv6 implements kv6 {
    public final gn2 X;
    public final s05 Y;
    public s05 Z;

    public lv6(Map map, gn2 gn2Var) {
        s05 s05Var;
        this.X = gn2Var;
        if (map == null || map.isEmpty()) {
            s05Var = null;
        } else {
            s05Var = new s05(map.size());
            for (Map.Entry entry : map.entrySet()) {
                s05Var.l(entry.getKey(), entry.getValue());
            }
        }
        this.Y = s05Var;
    }

    @Override // defpackage.kv6
    public final f63 a(String str, dn2 dn2Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!km4.a0(str.charAt(i))) {
                s05 s05Var = this.Z;
                if (s05Var == null) {
                    long[] jArr = uw6.a;
                    s05Var = new s05();
                    this.Z = s05Var;
                }
                Object objG = s05Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    s05Var.l(str, objG);
                }
                ((List) objG).add(dn2Var);
                return new f63(s05Var, str, dn2Var, (byte) 23);
            }
        }
        bt.q("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.kv6
    public final boolean c(Object obj) {
        return ((Boolean) this.X.B(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // defpackage.kv6
    public final Map d() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        s05 s05Var = this.Y;
        if (s05Var == null && this.Z == null) {
            return e02.X;
        }
        int i3 = 0;
        int i4 = s05Var != null ? s05Var.e : 0;
        s05 s05Var2 = this.Z;
        HashMap map = new HashMap(i4 + (s05Var2 != null ? s05Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (s05Var != null) {
            Object[] objArr = s05Var.b;
            Object[] objArr2 = s05Var.c;
            long[] jArr3 = s05Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        s05 s05Var3 = this.Z;
        if (s05Var3 != null) {
            Object[] objArr3 = s05Var3.b;
            Object[] objArr4 = s05Var3.c;
            long[] jArr4 = s05Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((dn2) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!c(objInvoke)) {
                                            kp5.h(jm4.z(objInvoke));
                                            return null;
                                        }
                                        map.put(str, i21.f(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((dn2) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !c(objInvoke2)) {
                                            kp5.h(jm4.z(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.kv6
    public final Object e(String str) {
        s05 s05Var = this.Y;
        List list = s05Var != null ? (List) s05Var.j(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && s05Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = s05Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = s05Var.c;
            Object obj = objArr[iF];
            s05Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
