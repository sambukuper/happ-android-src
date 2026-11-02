package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r94 {
    public static final r94 i;
    public final Map a;
    public final Map b;
    public final nb0 c;
    public final long d;
    public final long e;
    public final int f;
    public final long[] g = new long[26];
    public final d24[] h;

    /* JADX WARN: Code duplicated, block: B:108:0x0265 A[LOOP:6: B:75:0x01cd->B:108:0x0265, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0144  */
    /* JADX WARN: Code duplicated, block: B:49:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x014d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0155  */
    /* JADX WARN: Code duplicated, block: B:53:0x0165  */
    /* JADX WARN: Code duplicated, block: B:56:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0181 A[LOOP:3: B:52:0x0163->B:58:0x0181, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0195  */
    /* JADX WARN: Code duplicated, block: B:64:0x019d A[EDGE_INSN: B:64:0x019d->B:83:0x01e3 BREAK  A[LOOP:5: B:67:0x01aa->B:73:0x01c4]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01aa A[DONT_INVERT, LOOP:5: B:67:0x01aa->B:73:0x01c4, LOOP_START, PHI: r1 r4
  0x01aa: PHI (r1v19 int) = (r1v14 int), (r1v23 int) binds: [B:66:0x01a8, B:73:0x01c4] A[DONT_GENERATE, DONT_INLINE]
  0x01aa: PHI (r4v18 int) = (r4v13 int), (r4v19 int) binds: [B:66:0x01a8, B:73:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01c4 A[LOOP:5: B:67:0x01aa->B:73:0x01c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x01de  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f8 A[LOOP:4: B:87:0x01f0->B:89:0x01f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x020b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.HashMap] */
    static {
        ?? map;
        ?? map2;
        ByteBuffer byteBufferOrder;
        int i2;
        int i3;
        String string;
        int i4;
        yk8 yk8Var;
        int i5;
        int i6;
        int[] iArr;
        String[] strArr;
        int i7;
        int[] iArr2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr3;
        int i13;
        int i14;
        int i15;
        int[] iArr4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String strSubstring;
        int i21;
        int i22;
        int i23;
        int i24;
        String string2;
        int i25;
        int i26;
        r33 r33VarC = r33.C("com/ibm/icu/impl/data/icudata", "langInfo", r33.f, 4);
        r33 r33VarA = r33.A("likely", r33VarC);
        if (r33VarA == null) {
            throw new MissingResourceException("Can't find resource for bundle " + r33VarC.getClass().getName() + ", key " + r33VarC.p(), "likely", r33VarC.d);
        }
        int i27 = 3;
        b8 b8Var = new b8((byte) 3);
        z33 z33Var = (z33) r33VarA.b.h0;
        b8Var.c = z33Var;
        int i28 = r33VarA.e;
        b8Var.b = i28;
        y33 y33VarI = z33Var.i(i28);
        if (y33VarI == null) {
            throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        if (y33VarI.m("languageAliases", b8Var)) {
            String[] strArrG = b8Var.g();
            map = new HashMap(strArrG.length / 2);
            for (int i29 = 0; i29 < strArrG.length; i29 += 2) {
                map.put(strArrG[i29], strArrG[i29 + 1]);
            }
        } else {
            map = Collections.EMPTY_MAP;
        }
        if (y33VarI.m("regionAliases", b8Var)) {
            String[] strArrG2 = b8Var.g();
            map2 = new HashMap(strArrG2.length / 2);
            for (int i30 = 0; i30 < strArrG2.length; i30 += 2) {
                map2.put(strArrG2[i30], strArrG2[i30 + 1]);
            }
        } else {
            map2 = Collections.EMPTY_MAP;
        }
        q94.a(y33VarI, "trie", b8Var);
        z33 z33Var2 = (z33) b8Var.c;
        int i31 = b8Var.b;
        z33Var2.getClass();
        ByteBuffer byteBuffer = z33.s;
        int i32 = 268435455 & i31;
        int i33 = 1;
        if ((i31 >>> 28) != 1) {
            byteBufferOrder = null;
        } else if (i32 == 0 || (i26 = z33Var2.a.getInt((i25 = i32 << 2))) == 0) {
            byteBufferOrder = byteBuffer.duplicate();
        } else {
            int i34 = i25 + 4;
            ByteBuffer byteBufferDuplicate = z33Var2.a.duplicate();
            byteBufferDuplicate.position(i34).limit(i34 + i26);
            ArrayList arrayList = b33.a;
            byteBufferOrder = byteBufferDuplicate.slice().order(byteBufferDuplicate.order());
            if (!byteBufferOrder.isReadOnly()) {
                byteBufferOrder = byteBufferOrder.asReadOnlyBuffer();
            }
        }
        if (byteBufferOrder == null) {
            throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        byte[] bArr = new byte[byteBufferOrder.remaining()];
        byteBufferOrder.get(bArr);
        q94.a(y33VarI, "m49", b8Var);
        String[] strArrG3 = b8Var.g();
        q94.a(y33VarI, "lsrnum", b8Var);
        int[] iArrD = ((z33) b8Var.c).d(b8Var.b);
        if (iArrD == null) {
            throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        d24[] d24VarArr = new d24[iArrD.length];
        int i35 = 0;
        while (i35 < iArrD.length) {
            int i36 = iArrD[i35];
            if (i36 == 0) {
                string = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                if (i36 == i33) {
                    string = "skip";
                } else {
                    i2 = 16777215;
                    int i37 = (i36 & 16777215) % 19683;
                    i3 = 0;
                    StringBuilder sb = new StringBuilder(i27);
                    sb.append((char) ((i37 % 27) + 96));
                    sb.append((char) (((i37 / 27) % 27) + 96));
                    int i38 = i37 / 729;
                    if (i38 != 0) {
                        sb.append((char) (i38 + 96));
                    }
                    string = sb.toString();
                }
                if (i36 == 0) {
                    iArr = iArrD;
                    strArr = strArrG3;
                    strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
                } else if (i36 == i33) {
                    strSubstring = "script";
                    iArr = iArrD;
                    strArr = strArrG3;
                } else {
                    i4 = (i36 >> 24) & 255;
                    int i39 = cl8.a;
                    yk8Var = yk8.d;
                    i5 = yk8Var.a[i3];
                    i6 = i33;
                    while (true) {
                        if (i5 > 0) {
                            int[] iArr5 = yk8Var.a;
                            iArr = iArrD;
                            i21 = iArr5[i6];
                            i22 = iArr5[i6 + 1];
                            i23 = i6 + 2;
                            strArr = strArrG3;
                            if (4106 < i21) {
                                if (4106 < i22) {
                                    i7 = ((4106 - i21) * 2) + i23;
                                    break;
                                }
                                i6 = ((i22 - i21) * 2) + i23;
                                i5--;
                                iArrD = iArr;
                                strArrG3 = strArr;
                            }
                        } else {
                            iArr = iArrD;
                            strArr = strArrG3;
                        }
                        i7 = i3;
                        break;
                    }
                    if (i7 != 0) {
                        u52.m("Invalid property enum 4106 (0x", Integer.toHexString(4106), ")");
                        return;
                    }
                    iArr2 = yk8Var.a;
                    i8 = iArr2[i7 + 1];
                    if (i8 == 0) {
                        i15 = i3;
                        break;
                    }
                    int i40 = i8 + 1;
                    i9 = i8 + 2;
                    i10 = iArr2[i40];
                    if (i10 < 16) {
                        i11 = (i10 + i9) - 16;
                        i12 = i9;
                        while (true) {
                            iArr3 = yk8Var.a;
                            i13 = i9;
                            i14 = iArr3[i12];
                            if (i4 >= i14) {
                                if (i4 == i14) {
                                    i15 = iArr3[(i11 + i12) - i13];
                                    break;
                                } else {
                                    i12++;
                                    if (i12 >= i11) {
                                        i9 = i13;
                                    }
                                }
                            }
                            i15 = i3;
                            break;
                        }
                    }
                    while (true) {
                        if (i10 > 0) {
                            iArr4 = yk8Var.a;
                            i16 = iArr4[i9];
                            int i41 = i9;
                            i17 = iArr4[i9 + 1];
                            i18 = i41 + 2;
                            if (i4 < i16) {
                                if (i4 < i17) {
                                    i15 = iArr4[(i18 + i4) - i16];
                                    break;
                                } else {
                                    i9 = (i17 - i16) + i18;
                                    i10--;
                                }
                            }
                        }
                        i15 = i3;
                        break;
                    }
                    if (i15 != 0) {
                        u52.m("Property 4106 (0x", Integer.toHexString(4106), ") does not have named values");
                        return;
                    }
                    i19 = i15 + 1;
                    if (yk8Var.b.charAt(i15) > 0) {
                        throw new b53("Invalid property (value) name choice");
                    }
                    i20 = i19;
                    while (yk8Var.b.charAt(i20) != 0) {
                        i20++;
                    }
                    if (i19 == i20) {
                        strSubstring = null;
                    } else {
                        strSubstring = yk8Var.b.substring(i19, i20);
                    }
                }
                if (i36 != 0 || i36 == 1) {
                    i24 = 3;
                    string2 = _UrlKt.FRAGMENT_ENCODE_SET;
                } else {
                    int i42 = ((i36 & i2) / 19683) % 729;
                    if (i42 < 27) {
                        string2 = strArr[i42];
                        i24 = 3;
                    } else {
                        i24 = 3;
                        StringBuilder sb2 = new StringBuilder(3);
                        sb2.append((char) ((i42 % 27) + 64));
                        sb2.append((char) (((i42 / 27) % 27) + 64));
                        string2 = sb2.toString();
                    }
                    d24VarArr[i35] = new d24(i3, string, strSubstring, string2);
                    i35++;
                    i33 = 1;
                    i27 = i24;
                    iArrD = iArr;
                    strArrG3 = strArr;
                }
                d24VarArr[i35] = new d24(i3, string, strSubstring, string2);
                i35++;
                i33 = 1;
                i27 = i24;
                iArrD = iArr;
                strArrG3 = strArr;
            }
            i2 = 16777215;
            i3 = 0;
            if (i36 == 0) {
                iArr = iArrD;
                strArr = strArrG3;
                strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
            } else if (i36 == i33) {
                strSubstring = "script";
                iArr = iArrD;
                strArr = strArrG3;
            } else {
                i4 = (i36 >> 24) & 255;
                int i310 = cl8.a;
                yk8Var = yk8.d;
                i5 = yk8Var.a[i3];
                i6 = i33;
                while (true) {
                    if (i5 > 0) {
                        int[] iArr6 = yk8Var.a;
                        iArr = iArrD;
                        i21 = iArr6[i6];
                        i22 = iArr6[i6 + 1];
                        i23 = i6 + 2;
                        strArr = strArrG3;
                        if (4106 < i21) {
                            if (4106 < i22) {
                                i7 = ((4106 - i21) * 2) + i23;
                                break;
                            }
                            i6 = ((i22 - i21) * 2) + i23;
                            i5--;
                            iArrD = iArr;
                            strArrG3 = strArr;
                        }
                    } else {
                        iArr = iArrD;
                        strArr = strArrG3;
                    }
                    i7 = i3;
                    break;
                }
                if (i7 != 0) {
                    u52.m("Invalid property enum 4106 (0x", Integer.toHexString(4106), ")");
                    return;
                }
                iArr2 = yk8Var.a;
                i8 = iArr2[i7 + 1];
                if (i8 == 0) {
                    i15 = i3;
                    break;
                }
                int i43 = i8 + 1;
                i9 = i8 + 2;
                i10 = iArr2[i43];
                if (i10 < 16) {
                    i11 = (i10 + i9) - 16;
                    i12 = i9;
                    while (true) {
                        iArr3 = yk8Var.a;
                        i13 = i9;
                        i14 = iArr3[i12];
                        if (i4 >= i14) {
                            if (i4 == i14) {
                                i15 = iArr3[(i11 + i12) - i13];
                                break;
                            } else {
                                i12++;
                                if (i12 >= i11) {
                                    i9 = i13;
                                }
                            }
                        }
                        i15 = i3;
                        break;
                    }
                }
                while (true) {
                    if (i10 > 0) {
                        iArr4 = yk8Var.a;
                        i16 = iArr4[i9];
                        int i44 = i9;
                        i17 = iArr4[i9 + 1];
                        i18 = i44 + 2;
                        if (i4 < i16) {
                            if (i4 < i17) {
                                i15 = iArr4[(i18 + i4) - i16];
                                break;
                            } else {
                                i9 = (i17 - i16) + i18;
                                i10--;
                            }
                        }
                    }
                    i15 = i3;
                    break;
                }
                if (i15 != 0) {
                    u52.m("Property 4106 (0x", Integer.toHexString(4106), ") does not have named values");
                    return;
                }
                i19 = i15 + 1;
                if (yk8Var.b.charAt(i15) > 0) {
                    throw new b53("Invalid property (value) name choice");
                }
                i20 = i19;
                while (yk8Var.b.charAt(i20) != 0) {
                    i20++;
                }
                if (i19 == i20) {
                    strSubstring = null;
                } else {
                    strSubstring = yk8Var.b.substring(i19, i20);
                }
            }
            if (i36 != 0) {
                i24 = 3;
                string2 = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                i24 = 3;
                string2 = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            d24VarArr[i35] = new d24(i3, string, strSubstring, string2);
            i35++;
            i33 = 1;
            i27 = i24;
            iArrD = iArr;
            strArrG3 = strArr;
        }
        i = new r94(new q94(map, map2, bArr, d24VarArr));
    }

    public r94(q94 q94Var) {
        this.a = q94Var.a;
        this.b = q94Var.b;
        byte[] bArr = q94Var.c;
        nb0 nb0Var = new nb0();
        nb0Var.X = bArr;
        nb0Var.Y = 0;
        nb0Var.Z = -1;
        this.c = nb0Var;
        this.h = q94Var.d;
        nb0Var.d(42);
        this.d = nb0Var.a();
        nb0Var.d(42);
        this.e = nb0Var.a();
        nb0Var.d(42);
        int i2 = nb0Var.Y;
        this.f = nb0.e(i2 + 1, (bArr[i2] & 255) >> 1, bArr);
        nb0Var.Y = 0;
        nb0Var.Z = -1;
        for (char c = 'a'; c <= 'z'; c = (char) (c + 1)) {
            if (this.c.d(c) == 2) {
                this.g[c - 'a'] = this.c.a();
            }
            nb0 nb0Var2 = this.c;
            nb0Var2.Y = 0;
            nb0Var2.Z = -1;
        }
    }

    public static final int b(nb0 nb0Var, String str, int i2) {
        int iD;
        if (!str.isEmpty()) {
            int length = str.length() - 1;
            while (true) {
                char cCharAt = str.charAt(i2);
                if (i2 >= length) {
                    iD = nb0Var.d(cCharAt | 128);
                    break;
                }
                if ((p61.B(nb0Var.d(cCharAt)) & 1) == 0) {
                    return -1;
                }
                i2++;
            }
        } else {
            iD = nb0Var.d(42);
        }
        int iB = p61.B(iD);
        if (iB == 1) {
            return 0;
        }
        if (iB != 2) {
            return iB != 3 ? -1 : 1;
        }
        int i3 = nb0Var.Y;
        byte[] bArr = nb0Var.X;
        return nb0.e(i3 + 1, (bArr[i3] & 255) >> 1, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02e0 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02e8 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02f3 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0307 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0337 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0345 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0353  */
    /* JADX WARN: Code duplicated, block: B:124:0x0366 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0372 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x038a A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:133:0x03b4 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x03cb A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x03e3 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0403 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0427 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x043c A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x046d A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0490 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x04a8 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x04ce A[Catch: all -> 0x0255, LOOP:12: B:183:0x04c5->B:185:0x04ce, LOOP_END, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x04e7 A[Catch: all -> 0x0255, LOOP:13: B:187:0x04e1->B:189:0x04e7, LOOP_END, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0519  */
    /* JADX WARN: Code duplicated, block: B:196:0x0523  */
    /* JADX WARN: Code duplicated, block: B:198:0x0528  */
    /* JADX WARN: Code duplicated, block: B:200:0x0531  */
    /* JADX WARN: Code duplicated, block: B:201:0x053c  */
    /* JADX WARN: Code duplicated, block: B:209:0x054c  */
    /* JADX WARN: Code duplicated, block: B:213:0x0559  */
    /* JADX WARN: Code duplicated, block: B:216:0x0564  */
    /* JADX WARN: Code duplicated, block: B:218:0x0570  */
    /* JADX WARN: Code duplicated, block: B:219:0x0574  */
    /* JADX WARN: Code duplicated, block: B:227:0x059c  */
    /* JADX WARN: Code duplicated, block: B:229:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:230:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:232:0x05a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:235:0x05ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:238:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:239:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:241:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:244:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:246:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:256:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x0134  */
    /* JADX WARN: Code duplicated, block: B:66:0x0145  */
    /* JADX WARN: Code duplicated, block: B:68:0x014b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0151  */
    /* JADX WARN: Code duplicated, block: B:74:0x0158 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:76:0x0163 A[Catch: all -> 0x0255, TRY_ENTER, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x021d A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x022b A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0245 A[Catch: all -> 0x0255, LOOP:1: B:82:0x0243->B:83:0x0245, LOOP_END, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0258 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0275 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0292 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02af A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:72:0x0154, B:76:0x0163, B:77:0x0217, B:79:0x021d, B:81:0x022b, B:83:0x0245, B:86:0x0258, B:88:0x0260, B:89:0x026f, B:91:0x0275, B:93:0x0292, B:94:0x02a1, B:96:0x02a9, B:98:0x02af, B:100:0x02c9, B:102:0x02d1, B:120:0x0358, B:104:0x02e0, B:106:0x02e8, B:112:0x031a, B:113:0x0331, B:115:0x0337, B:117:0x0345, B:108:0x02f3, B:110:0x0307, B:111:0x0313, B:122:0x0360, B:124:0x0366, B:126:0x0372, B:128:0x038a, B:130:0x03a5, B:131:0x03a8, B:133:0x03b4, B:134:0x03c1, B:136:0x03cb, B:137:0x03d9, B:138:0x03dd, B:140:0x03e3, B:142:0x03f1, B:143:0x03fd, B:145:0x0403, B:147:0x0411, B:148:0x041d, B:150:0x0427, B:152:0x0436, B:154:0x043c, B:156:0x044c, B:158:0x0454, B:161:0x045d, B:162:0x0467, B:164:0x046d, B:167:0x047d, B:168:0x0482, B:169:0x0485, B:171:0x048a, B:173:0x0490, B:174:0x04a2, B:176:0x04a8, B:179:0x04b8, B:180:0x04bd, B:181:0x04c0, B:183:0x04c5, B:185:0x04ce, B:186:0x04db, B:187:0x04e1, B:189:0x04e7, B:190:0x050a), top: B:256:0x0154 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v66, types: [int] */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r8v43, types: [int] */
    public final d24 a(sk8 sk8Var) {
        int iB;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        boolean z6;
        int i5;
        al8 al8VarC;
        al8 al8VarC2;
        al8 al8VarC3;
        al8 al8VarC4;
        Enumeration keys;
        ArrayList<String> arrayList;
        Iterator it;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        al8 al8VarB;
        mc6 mc6Var;
        int i11;
        al8 al8VarB2;
        String strI;
        mc6 mc6Var2;
        int i12;
        String str;
        al8 al8VarB3;
        String str2;
        Integer numValueOf;
        String str3;
        String strI2;
        String strM;
        mc6 mc6Var3;
        mc6 mc6Var4;
        mc6 mc6Var5;
        String str4;
        int iIndexOf;
        StringBuilder sb;
        char cCharAt;
        int i13;
        char cCharAt2;
        mc6 mc6Var6;
        boolean z7;
        int i14;
        ?? IsEmpty;
        d24 d24Var;
        String str5;
        String str6;
        int iCharAt;
        int i15 = 7;
        if (sk8Var.Y.startsWith("@x=")) {
            return new d24(7, sk8Var.k(), _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET);
        }
        String str7 = sk8Var.b().a;
        String str8 = sk8Var.b().b;
        String str9 = sk8Var.b().c;
        String str10 = sk8Var.b().d;
        String str11 = (String) this.a.get(str7);
        if (str11 != null) {
            str7 = str11;
        }
        String str12 = (String) this.b.get(str9);
        if (str12 != null) {
            str9 = str12;
        }
        if (str7.equals("und")) {
            str7 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (str8.equals("Zzzz")) {
            str8 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (str9.equals("ZZ")) {
            str9 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (str8.isEmpty() || str9.isEmpty() || str7.isEmpty()) {
            nb0 nb0Var = this.c;
            nb0 nb0Var2 = new nb0();
            nb0Var2.X = nb0Var.X;
            nb0Var2.Y = nb0Var.Y;
            nb0Var2.Z = nb0Var.Z;
            long jA = 0;
            if (str7.length() < 2 || (iCharAt = str7.charAt(0) - 'a') < 0 || iCharAt > 25) {
                iB = b(nb0Var2, str7, 0);
            } else {
                long j = this.g[iCharAt];
                if (j != 0) {
                    nb0Var2.f(j);
                    iB = b(nb0Var2, str7, 1);
                } else {
                    iB = b(nb0Var2, str7, 0);
                }
            }
            boolean z8 = iB >= 0;
            if (iB >= 0) {
                z = !str7.isEmpty();
                jA = nb0Var2.a();
            } else {
                nb0Var2.f(this.d);
                z = true;
            }
            boolean z9 = iB >= 0 && !str8.isEmpty();
            if (iB > 0) {
                if (iB == 1) {
                    iB = 0;
                }
                z3 = !str8.isEmpty();
            } else {
                iB = b(nb0Var2, str8, 0);
                if (iB >= 0) {
                    z3 = !str8.isEmpty();
                    jA = nb0Var2.a();
                } else {
                    if (jA == jA) {
                        nb0Var2.f(this.e);
                    } else {
                        nb0Var2.f(jA);
                        iB = b(nb0Var2, _UrlKt.FRAGMENT_ENCODE_SET, 0);
                        jA = nb0Var2.a();
                    }
                    z2 = true;
                }
                if (iB > 0) {
                    str7 = str7;
                    z2 = z2;
                    i2 = 2;
                    IsEmpty = true ^ str9.isEmpty();
                    i4 = 0;
                    z5 = false;
                    i3 = 4;
                } else {
                    iB = b(nb0Var2, str9, 0);
                    if (iB >= 0) {
                        if (str9.isEmpty()) {
                            str7 = str7;
                            z2 = z2;
                            i2 = 2;
                            i3 = 4;
                        } else {
                            synchronized (mc6.class) {
                                try {
                                    if (mc6.g0) {
                                        i2 = 2;
                                        i5 = 0;
                                    } else {
                                        mc6.j0 = new HashMap();
                                        mc6.h0 = new HashMap();
                                        mc6.i0 = new HashMap();
                                        i5 = 0;
                                        mc6.l0 = new ArrayList(p61.G(i15).length);
                                        ClassLoader classLoader = r33.f;
                                        al8VarC = al8.v("com/ibm/icu/impl/data/icudata", "metadata", classLoader).c("alias").c("territory");
                                        al8 al8VarV = al8.v("com/ibm/icu/impl/data/icudata", "supplementalData", classLoader);
                                        al8VarC2 = al8VarV.c("codeMappings");
                                        al8 al8VarC5 = al8VarV.c("idValidity").c("region");
                                        al8 al8VarC6 = al8VarC5.c("regular");
                                        al8 al8VarC7 = al8VarC5.c("macroregion");
                                        al8 al8VarC8 = al8VarC5.c("unknown");
                                        al8VarC3 = al8VarV.c("territoryContainment");
                                        al8 al8VarC9 = al8VarC3.c("001");
                                        al8VarC4 = al8VarC3.c("grouping");
                                        List<String> listAsList = Arrays.asList(al8VarC9.o());
                                        keys = al8VarC4.getKeys();
                                        arrayList = new ArrayList();
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.addAll(Arrays.asList(al8VarC6.o()));
                                        arrayList2.addAll(Arrays.asList(al8VarC7.o()));
                                        arrayList2.add(al8VarC8.m());
                                        for (it = arrayList2.iterator(); it.hasNext(); it = it) {
                                            str4 = (String) it.next();
                                            iIndexOf = str4.indexOf("~");
                                            if (iIndexOf > 0) {
                                                sb = new StringBuilder(str4);
                                                cCharAt = sb.charAt(iIndexOf + 1);
                                                sb.setLength(iIndexOf);
                                                i13 = iIndexOf - 1;
                                                cCharAt2 = sb.charAt(i13);
                                                while (cCharAt2 <= cCharAt) {
                                                    arrayList.add(sb.toString());
                                                    cCharAt2 = (char) (cCharAt2 + 1);
                                                    sb.setCharAt(i13, cCharAt2);
                                                }
                                            } else {
                                                arrayList.add(str4);
                                            }
                                        }
                                        mc6.k0 = new ArrayList(arrayList.size());
                                        for (String str13 : arrayList) {
                                            mc6Var5 = new mc6();
                                            mc6Var5.X = str13;
                                            mc6Var5.Y = 2;
                                            mc6.h0.put(str13, mc6Var5);
                                            if (str13.matches("[0-9]{3}")) {
                                                Integer numValueOf2 = Integer.valueOf(str13);
                                                numValueOf2.getClass();
                                                mc6.i0.put(numValueOf2, mc6Var5);
                                                mc6Var5.Y = 5;
                                            }
                                            mc6.k0.add(mc6Var5);
                                        }
                                        i6 = 0;
                                        while (i6 < al8VarC.l()) {
                                            al8 al8VarB4 = al8VarC.b(i6);
                                            strI2 = al8VarB4.i();
                                            strM = al8VarB4.c("replacement").m();
                                            if (mc6.h0.containsKey(strM) || mc6.h0.containsKey(strI2)) {
                                                if (mc6.h0.containsKey(strI2)) {
                                                    mc6Var4 = (mc6) mc6.h0.get(strI2);
                                                } else {
                                                    mc6Var3 = new mc6();
                                                    mc6Var3.X = strI2;
                                                    mc6.h0.put(strI2, mc6Var3);
                                                    if (strI2.matches("[0-9]{3}")) {
                                                        Integer numValueOf3 = Integer.valueOf(strI2);
                                                        numValueOf3.getClass();
                                                        mc6.i0.put(numValueOf3, mc6Var3);
                                                    }
                                                    mc6.k0.add(mc6Var3);
                                                    mc6Var4 = mc6Var3;
                                                }
                                                mc6Var4.Y = i15;
                                                List<String> listAsList2 = Arrays.asList(strM.split(" "));
                                                mc6Var4.f0 = new ArrayList();
                                                for (String str14 : listAsList2) {
                                                    if (mc6.h0.containsKey(str14)) {
                                                        mc6Var4.f0.add(mc6.h0.get(str14));
                                                    }
                                                    i6 = i6;
                                                }
                                            } else {
                                                mc6.j0.put(strI2, mc6.h0.get(strM));
                                            }
                                            i6++;
                                            i15 = 7;
                                        }
                                        for (i7 = 0; i7 < al8VarC2.l(); i7++) {
                                            al8VarB3 = al8VarC2.b(i7);
                                            if (al8VarB3.p() == 8) {
                                                String[] strArrO = al8VarB3.o();
                                                str2 = strArrO[0];
                                                numValueOf = Integer.valueOf(strArrO[1]);
                                                str3 = strArrO[2];
                                                if (mc6.h0.containsKey(str2)) {
                                                    mc6 mc6Var7 = (mc6) mc6.h0.get(str2);
                                                    numValueOf.getClass();
                                                    mc6Var7.getClass();
                                                    mc6.i0.put(numValueOf, mc6Var7);
                                                    mc6.j0.put(str3, mc6Var7);
                                                }
                                            }
                                        }
                                        i2 = 2;
                                        if (mc6.h0.containsKey("001")) {
                                            ((mc6) mc6.h0.get("001")).Y = 3;
                                        }
                                        if (mc6.h0.containsKey("ZZ")) {
                                            ((mc6) mc6.h0.get("ZZ")).Y = 1;
                                        }
                                        for (String str15 : listAsList) {
                                            if (mc6.h0.containsKey(str15)) {
                                                ((mc6) mc6.h0.get(str15)).Y = 4;
                                            }
                                        }
                                        while (keys.hasMoreElements()) {
                                            str = (String) keys.nextElement();
                                            if (mc6.h0.containsKey(str)) {
                                                ((mc6) mc6.h0.get(str)).Y = 6;
                                            }
                                        }
                                        if (mc6.h0.containsKey("QO")) {
                                            ((mc6) mc6.h0.get("QO")).Y = 5;
                                        }
                                        for (i8 = 0; i8 < al8VarC3.l(); i8++) {
                                            al8VarB2 = al8VarC3.b(i8);
                                            strI = al8VarB2.i();
                                            if (!strI.equals("containedGroupings") && !strI.equals("deprecated") && !strI.equals("grouping")) {
                                                mc6Var2 = (mc6) mc6.h0.get(strI);
                                                for (i12 = 0; i12 < al8VarB2.l(); i12++) {
                                                    mc6 mc6Var8 = (mc6) mc6.h0.get(al8VarB2.n(i12));
                                                    if (mc6Var2 == null && mc6Var8 != null) {
                                                        mc6Var2.Z.add(mc6Var8);
                                                    }
                                                }
                                            }
                                        }
                                        for (i9 = 0; i9 < al8VarC4.l(); i9++) {
                                            al8VarB = al8VarC4.b(i9);
                                            mc6Var = (mc6) mc6.h0.get(al8VarB.i());
                                            for (i11 = 0; i11 < al8VarB.l(); i11++) {
                                                mc6 mc6Var9 = (mc6) mc6.h0.get(al8VarB.n(i11));
                                                if (mc6Var == null && mc6Var9 != null) {
                                                    mc6Var.Z.add(mc6Var9);
                                                }
                                            }
                                        }
                                        for (i10 = 0; i10 < p61.G(7).length; i10++) {
                                            mc6.l0.add(new TreeSet());
                                        }
                                        for (mc6 mc6Var10 : mc6.k0) {
                                            Set set = (Set) mc6.l0.get(p61.B(mc6Var10.Y));
                                            set.add(mc6Var10);
                                            mc6.l0.set(p61.B(mc6Var10.Y), set);
                                        }
                                        mc6.g0 = true;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            mc6Var6 = (mc6) mc6.h0.get(str9);
                            if (mc6Var6 == null) {
                                mc6Var6 = (mc6) mc6.j0.get(str9);
                            }
                            if (mc6Var6 != null) {
                                bt.q("Unknown region id: ".concat(str9));
                                return null;
                            }
                            if (mc6Var6.Y == 7) {
                                z7 = true;
                                z7 = true;
                                if (mc6Var6.f0.size() == 1) {
                                    mc6Var6 = (mc6) mc6Var6.f0.get(i5);
                                }
                            } else {
                                z7 = true;
                            }
                            i14 = mc6Var6.Y;
                            i3 = 4;
                            if (i14 == 3 && i14 != 4 && i14 != 5) {
                                z5 = z7 ? 1 : 0;
                                i4 = 0;
                                IsEmpty = z7;
                            }
                        }
                        i4 = 0;
                        z6 = false;
                        z5 = false;
                        IsEmpty = z6;
                    } else {
                        str7 = str7;
                        z2 = z2;
                        i2 = 2;
                        z4 = true;
                        i3 = 4;
                        if (jA == 0) {
                            iB = this.f;
                            i4 = 0;
                            z6 = z4;
                            z5 = false;
                            IsEmpty = z6;
                        } else {
                            nb0Var2.f(jA);
                            i4 = 0;
                            iB = b(nb0Var2, _UrlKt.FRAGMENT_ENCODE_SET, 0);
                            z5 = false;
                            IsEmpty = z4;
                        }
                    }
                }
                d24Var = this.h[iB];
                if (!z8 || z9 || (z5 && str7.isEmpty())) {
                    if (str7.isEmpty()) {
                        str5 = "und";
                    } else {
                        str5 = str7;
                    }
                    if (z || z2 || IsEmpty != 0) {
                        if (!z) {
                            str5 = d24Var.a;
                        }
                        if (z2) {
                            str6 = str8;
                        } else {
                            str6 = d24Var.b;
                        }
                        if (IsEmpty == 0) {
                            str9 = d24Var.c;
                        }
                        if (!z) {
                            i3 = i4;
                        }
                        if (z2) {
                            i4 = i2;
                        }
                        d24Var = new d24(i3 + i4 + IsEmpty, str5, str6, str9);
                    }
                } else {
                    d24Var = new d24(7, _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET);
                }
            }
            boolean z10 = z3;
            i15 = 7;
            z2 = z10;
            str8 = str8;
            if (iB > 0) {
                str7 = str7;
                z2 = z2;
                i2 = 2;
                IsEmpty = true ^ str9.isEmpty();
                i4 = 0;
                z5 = false;
                i3 = 4;
            } else {
                iB = b(nb0Var2, str9, 0);
                if (iB >= 0) {
                    if (str9.isEmpty()) {
                        synchronized (mc6.class) {
                            if (mc6.g0) {
                                i2 = 2;
                                i5 = 0;
                            } else {
                                mc6.j0 = new HashMap();
                                mc6.h0 = new HashMap();
                                mc6.i0 = new HashMap();
                                i5 = 0;
                                mc6.l0 = new ArrayList(p61.G(i15).length);
                                ClassLoader classLoader2 = r33.f;
                                al8VarC = al8.v("com/ibm/icu/impl/data/icudata", "metadata", classLoader2).c("alias").c("territory");
                                al8 al8VarV2 = al8.v("com/ibm/icu/impl/data/icudata", "supplementalData", classLoader2);
                                al8VarC2 = al8VarV2.c("codeMappings");
                                al8 al8VarC10 = al8VarV2.c("idValidity").c("region");
                                al8 al8VarC11 = al8VarC10.c("regular");
                                al8 al8VarC12 = al8VarC10.c("macroregion");
                                al8 al8VarC13 = al8VarC10.c("unknown");
                                al8VarC3 = al8VarV2.c("territoryContainment");
                                al8 al8VarC14 = al8VarC3.c("001");
                                al8VarC4 = al8VarC3.c("grouping");
                                List<String> listAsList3 = Arrays.asList(al8VarC14.o());
                                keys = al8VarC4.getKeys();
                                arrayList = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.addAll(Arrays.asList(al8VarC11.o()));
                                arrayList3.addAll(Arrays.asList(al8VarC12.o()));
                                arrayList3.add(al8VarC13.m());
                                while (it.hasNext()) {
                                    str4 = (String) it.next();
                                    iIndexOf = str4.indexOf("~");
                                    if (iIndexOf > 0) {
                                        sb = new StringBuilder(str4);
                                        cCharAt = sb.charAt(iIndexOf + 1);
                                        sb.setLength(iIndexOf);
                                        i13 = iIndexOf - 1;
                                        cCharAt2 = sb.charAt(i13);
                                        while (cCharAt2 <= cCharAt) {
                                            arrayList.add(sb.toString());
                                            cCharAt2 = (char) (cCharAt2 + 1);
                                            sb.setCharAt(i13, cCharAt2);
                                        }
                                    } else {
                                        arrayList.add(str4);
                                    }
                                }
                                mc6.k0 = new ArrayList(arrayList.size());
                                while (r2.hasNext()) {
                                    mc6Var5 = new mc6();
                                    mc6Var5.X = str13;
                                    mc6Var5.Y = 2;
                                    mc6.h0.put(str13, mc6Var5);
                                    if (str13.matches("[0-9]{3}")) {
                                        Integer numValueOf4 = Integer.valueOf(str13);
                                        numValueOf4.getClass();
                                        mc6.i0.put(numValueOf4, mc6Var5);
                                        mc6Var5.Y = 5;
                                    }
                                    mc6.k0.add(mc6Var5);
                                }
                                i6 = 0;
                                while (i6 < al8VarC.l()) {
                                    al8 al8VarB5 = al8VarC.b(i6);
                                    strI2 = al8VarB5.i();
                                    strM = al8VarB5.c("replacement").m();
                                    if (mc6.h0.containsKey(strM)) {
                                        if (mc6.h0.containsKey(strI2)) {
                                            mc6Var4 = (mc6) mc6.h0.get(strI2);
                                        } else {
                                            mc6Var3 = new mc6();
                                            mc6Var3.X = strI2;
                                            mc6.h0.put(strI2, mc6Var3);
                                            if (strI2.matches("[0-9]{3}")) {
                                                Integer numValueOf5 = Integer.valueOf(strI2);
                                                numValueOf5.getClass();
                                                mc6.i0.put(numValueOf5, mc6Var3);
                                            }
                                            mc6.k0.add(mc6Var3);
                                            mc6Var4 = mc6Var3;
                                        }
                                        mc6Var4.Y = i15;
                                        List<String> listAsList4 = Arrays.asList(strM.split(" "));
                                        mc6Var4.f0 = new ArrayList();
                                        while (r3.hasNext()) {
                                            if (mc6.h0.containsKey(str14)) {
                                                mc6Var4.f0.add(mc6.h0.get(str14));
                                            }
                                            i6 = i6;
                                        }
                                    } else {
                                        if (mc6.h0.containsKey(strI2)) {
                                            mc6Var4 = (mc6) mc6.h0.get(strI2);
                                        } else {
                                            mc6Var3 = new mc6();
                                            mc6Var3.X = strI2;
                                            mc6.h0.put(strI2, mc6Var3);
                                            if (strI2.matches("[0-9]{3}")) {
                                                Integer numValueOf6 = Integer.valueOf(strI2);
                                                numValueOf6.getClass();
                                                mc6.i0.put(numValueOf6, mc6Var3);
                                            }
                                            mc6.k0.add(mc6Var3);
                                            mc6Var4 = mc6Var3;
                                        }
                                        mc6Var4.Y = i15;
                                        List<String> listAsList5 = Arrays.asList(strM.split(" "));
                                        mc6Var4.f0 = new ArrayList();
                                        while (r3.hasNext()) {
                                            if (mc6.h0.containsKey(str14)) {
                                                mc6Var4.f0.add(mc6.h0.get(str14));
                                            }
                                            i6 = i6;
                                        }
                                    }
                                    i6++;
                                    i15 = 7;
                                }
                                while (i7 < al8VarC2.l()) {
                                    al8VarB3 = al8VarC2.b(i7);
                                    if (al8VarB3.p() == 8) {
                                        String[] strArrO2 = al8VarB3.o();
                                        str2 = strArrO2[0];
                                        numValueOf = Integer.valueOf(strArrO2[1]);
                                        str3 = strArrO2[2];
                                        if (mc6.h0.containsKey(str2)) {
                                            mc6 mc6Var11 = (mc6) mc6.h0.get(str2);
                                            numValueOf.getClass();
                                            mc6Var11.getClass();
                                            mc6.i0.put(numValueOf, mc6Var11);
                                            mc6.j0.put(str3, mc6Var11);
                                        }
                                    }
                                }
                                i2 = 2;
                                if (mc6.h0.containsKey("001")) {
                                    ((mc6) mc6.h0.get("001")).Y = 3;
                                }
                                if (mc6.h0.containsKey("ZZ")) {
                                    ((mc6) mc6.h0.get("ZZ")).Y = 1;
                                }
                                while (r2.hasNext()) {
                                    if (mc6.h0.containsKey(str15)) {
                                        ((mc6) mc6.h0.get(str15)).Y = 4;
                                    }
                                }
                                while (keys.hasMoreElements()) {
                                    str = (String) keys.nextElement();
                                    if (mc6.h0.containsKey(str)) {
                                        ((mc6) mc6.h0.get(str)).Y = 6;
                                    }
                                }
                                if (mc6.h0.containsKey("QO")) {
                                    ((mc6) mc6.h0.get("QO")).Y = 5;
                                }
                                while (i8 < al8VarC3.l()) {
                                    al8VarB2 = al8VarC3.b(i8);
                                    strI = al8VarB2.i();
                                    if (!strI.equals("containedGroupings")) {
                                        mc6Var2 = (mc6) mc6.h0.get(strI);
                                        while (i12 < al8VarB2.l()) {
                                            mc6 mc6Var12 = (mc6) mc6.h0.get(al8VarB2.n(i12));
                                            if (mc6Var2 == null) {
                                            }
                                        }
                                    }
                                }
                                while (i9 < al8VarC4.l()) {
                                    al8VarB = al8VarC4.b(i9);
                                    mc6Var = (mc6) mc6.h0.get(al8VarB.i());
                                    while (i11 < al8VarB.l()) {
                                        mc6 mc6Var13 = (mc6) mc6.h0.get(al8VarB.n(i11));
                                        if (mc6Var == null) {
                                        }
                                    }
                                }
                                while (i10 < p61.G(7).length) {
                                    mc6.l0.add(new TreeSet());
                                }
                                while (r1.hasNext()) {
                                    Set set2 = (Set) mc6.l0.get(p61.B(mc6Var10.Y));
                                    set2.add(mc6Var10);
                                    mc6.l0.set(p61.B(mc6Var10.Y), set2);
                                }
                                mc6.g0 = true;
                            }
                            mc6Var6 = (mc6) mc6.h0.get(str9);
                            if (mc6Var6 == null) {
                                mc6Var6 = (mc6) mc6.j0.get(str9);
                            }
                            if (mc6Var6 != null) {
                                bt.q("Unknown region id: ".concat(str9));
                                return null;
                            }
                            if (mc6Var6.Y == 7) {
                                z7 = true;
                                z7 = true;
                                if (mc6Var6.f0.size() == 1) {
                                    mc6Var6 = (mc6) mc6Var6.f0.get(i5);
                                }
                            } else {
                                z7 = true;
                            }
                            i14 = mc6Var6.Y;
                            i3 = 4;
                            if (i14 == 3) {
                            }
                        }
                    } else {
                        str7 = str7;
                        z2 = z2;
                        i2 = 2;
                        i3 = 4;
                    }
                    i4 = 0;
                    z6 = false;
                    z5 = false;
                    IsEmpty = z6;
                } else {
                    str7 = str7;
                    z2 = z2;
                    i2 = 2;
                    z4 = true;
                    i3 = 4;
                    if (jA == 0) {
                        iB = this.f;
                        i4 = 0;
                        z6 = z4;
                        z5 = false;
                        IsEmpty = z6;
                    } else {
                        nb0Var2.f(jA);
                        i4 = 0;
                        iB = b(nb0Var2, _UrlKt.FRAGMENT_ENCODE_SET, 0);
                        z5 = false;
                        IsEmpty = z4;
                    }
                }
            }
            d24Var = this.h[iB];
            if (z8) {
                if (str7.isEmpty()) {
                    str5 = "und";
                } else {
                    str5 = str7;
                }
                if (z) {
                    if (!z) {
                        str5 = d24Var.a;
                    }
                    if (z2) {
                        str6 = d24Var.b;
                    } else {
                        str6 = str8;
                    }
                    if (IsEmpty == 0) {
                        str9 = d24Var.c;
                    }
                    if (!z) {
                        i3 = i4;
                    }
                    if (z2) {
                        i4 = i2;
                    }
                    d24Var = new d24(i3 + i4 + IsEmpty, str5, str6, str9);
                } else {
                    if (!z) {
                        str5 = d24Var.a;
                    }
                    if (z2) {
                        str6 = d24Var.b;
                    } else {
                        str6 = str8;
                    }
                    if (IsEmpty == 0) {
                        str9 = d24Var.c;
                    }
                    if (!z) {
                        i3 = i4;
                    }
                    if (z2) {
                        i4 = i2;
                    }
                    d24Var = new d24(i3 + i4 + IsEmpty, str5, str6, str9);
                }
            } else {
                if (str7.isEmpty()) {
                    str5 = "und";
                } else {
                    str5 = str7;
                }
                if (z) {
                    if (!z) {
                        str5 = d24Var.a;
                    }
                    if (z2) {
                        str6 = d24Var.b;
                    } else {
                        str6 = str8;
                    }
                    if (IsEmpty == 0) {
                        str9 = d24Var.c;
                    }
                    if (!z) {
                        i3 = i4;
                    }
                    if (z2) {
                        i4 = i2;
                    }
                    d24Var = new d24(i3 + i4 + IsEmpty, str5, str6, str9);
                } else {
                    if (!z) {
                        str5 = d24Var.a;
                    }
                    if (z2) {
                        str6 = d24Var.b;
                    } else {
                        str6 = str8;
                    }
                    if (IsEmpty == 0) {
                        str9 = d24Var.c;
                    }
                    if (!z) {
                        i3 = i4;
                    }
                    if (z2) {
                        i4 = i2;
                    }
                    d24Var = new d24(i3 + i4 + IsEmpty, str5, str6, str9);
                }
            }
        } else {
            d24Var = new d24(7, str7, str8, str9);
        }
        return (d24Var.a.isEmpty() && d24Var.b.isEmpty() && d24Var.c.isEmpty()) ? new d24(7, sk8Var.b().a, sk8Var.b().b, sk8Var.b().c) : d24Var;
    }

    public final String toString() {
        TreeMap treeMap = new TreeMap();
        StringBuilder sb = new StringBuilder();
        mb0 it = this.c.iterator();
        while (it.hasNext()) {
            x50 x50Var = (x50) it.next();
            int i2 = 0;
            sb.setLength(0);
            int i3 = x50Var.c;
            while (i2 < i3) {
                int i4 = i2 + 1;
                byte b = x50Var.b[i2];
                if (b == 42) {
                    sb.append("*-");
                } else if (b >= 0) {
                    sb.append((char) b);
                } else {
                    sb.append((char) (b & 127));
                    sb.append('-');
                }
                i2 = i4;
            }
            sb.setLength(sb.length() - 1);
            treeMap.put(sb.toString(), this.h[x50Var.a]);
        }
        return treeMap.toString();
    }
}
