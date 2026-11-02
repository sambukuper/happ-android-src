package defpackage;

import java.util.Map;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u78 {
    public static final ox1 a = new ox1(new mq7((byte) 24), (byte) 0);

    public static final void a(o88 o88Var, zy0 zy0Var, lp2 lp2Var, int i) {
        lp2Var.X(15327438);
        int i2 = (lp2Var.f(o88Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        byte b = 1;
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            ox1 ox1Var = a;
            mb6.a(ox1Var.a(((o88) lp2Var.j(ox1Var)).d(o88Var)), zy0Var, lp2Var, (i2 & 112) | 8);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new wy2(b, i, o88Var, zy0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0131  */
    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x016c  */
    /* JADX WARN: Code duplicated, block: B:115:0x016f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0176  */
    /* JADX WARN: Code duplicated, block: B:121:0x017c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:125:0x0184  */
    /* JADX WARN: Code duplicated, block: B:127:0x0189  */
    /* JADX WARN: Code duplicated, block: B:128:0x018c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0191  */
    /* JADX WARN: Code duplicated, block: B:134:0x0197  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01db  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:151:0x0275  */
    /* JADX WARN: Code duplicated, block: B:154:0x0293  */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x0125  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    public static final void b(final String str, kx4 kx4Var, long j, mx mxVar, long j2, long j3, o28 o28Var, long j4, int i, boolean z, int i2, int i3, gn2 gn2Var, o88 o88Var, lp2 lp2Var, final int i4, final int i5, final int i6) {
        String str2;
        int i7;
        kx4 kx4Var2;
        int i8;
        int i9;
        mx mxVar2;
        int i10;
        int i11;
        int i12;
        o28 o28Var2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z2;
        boolean z3;
        final long j5;
        final long j6;
        final boolean z4;
        final int i26;
        final gn2 gn2Var2;
        final o88 o88Var2;
        final int i27;
        final kx4 kx4Var3;
        final o28 o28Var3;
        final long j7;
        final int i28;
        final mx mxVar3;
        final long j8;
        j86 j86VarR;
        kx4 kx4Var4;
        long j9;
        long j10;
        int i29;
        gn2 gn2Var3;
        o88 o88Var3;
        int i30;
        long j11;
        int i31;
        long j12;
        long jB;
        boolean z5;
        ?? r3;
        int i32;
        lp2Var.X(1809465675);
        if ((i4 & 6) == 0) {
            str2 = str;
            i7 = (lp2Var.f(str2) ? 4 : 2) | i4;
        } else {
            str2 = str;
            i7 = i4;
        }
        int i33 = i6 & 2;
        if (i33 == 0) {
            if ((i4 & 48) == 0) {
                kx4Var2 = kx4Var;
                i7 |= lp2Var.f(kx4Var2) ? 32 : 16;
            }
            i8 = i7 | 384;
            i9 = i6 & 8;
            if (i9 != 0) {
                if ((i4 & 3072) == 0) {
                    mxVar2 = mxVar;
                    if (lp2Var.h(mxVar2)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i8 |= i10;
                }
                i11 = i8 | 920346624;
                i12 = i6 & 1024;
                if (i12 != 0) {
                    i13 = i5 | 6;
                    o28Var2 = o28Var;
                } else if ((i5 & 6) == 0) {
                    o28Var2 = o28Var;
                    i13 = (lp2Var.f(o28Var2) ? 4 : 2) | i5;
                } else {
                    o28Var2 = o28Var;
                    i13 = i5;
                }
                i14 = i13 | 48;
                i15 = i6 & 4096;
                if (i15 != 0) {
                    if ((i5 & 384) == 0) {
                        i16 = i;
                        if (lp2Var.d(i16)) {
                            i17 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        } else {
                            i17 = 128;
                        }
                        i14 |= i17;
                    }
                    i18 = i14 | 3072;
                    i19 = i6 & Http2.INITIAL_MAX_FRAME_SIZE;
                    if (i19 != 0) {
                        if ((i5 & 24576) == 0) {
                            i20 = i2;
                            if (lp2Var.d(i20)) {
                                i21 = Http2.INITIAL_MAX_FRAME_SIZE;
                            } else {
                                i21 = 8192;
                            }
                            i18 |= i21;
                        }
                        i22 = i6 & 32768;
                        if (i22 != 0) {
                            if ((i5 & 196608) == 0) {
                                if (lp2Var.d(i3)) {
                                    i23 = 131072;
                                } else {
                                    i23 = 65536;
                                }
                                i18 |= i23;
                            }
                            i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                            if (i24 != 0) {
                                i18 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                if (lp2Var.h(gn2Var)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i18 |= i25;
                            }
                            if ((i5 & 12582912) != 0) {
                                if ((i6 & 131072) == 0 || !lp2Var.f(o88Var)) {
                                    i32 = 4194304;
                                } else {
                                    i32 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                                }
                                i18 |= i32;
                            }
                            z2 = true;
                            if ((i11 & 306783379) == 306783378 || (4793491 & i18) != 4793490) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (lp2Var.N(i11 & 1, z3)) {
                                lp2Var.S();
                                if ((i4 & 1) != 0 || lp2Var.x()) {
                                    if (i33 != 0) {
                                        kx4Var4 = hx4.X;
                                    } else {
                                        kx4Var4 = kx4Var2;
                                    }
                                    j9 = dw0.g;
                                    if (i9 != 0) {
                                        mxVar2 = null;
                                    }
                                    j10 = v88.c;
                                    if (i12 != 0) {
                                        o28Var2 = null;
                                    }
                                    if (i15 != 0) {
                                        i16 = 1;
                                    }
                                    if (i19 != 0) {
                                        i20 = Integer.MAX_VALUE;
                                    }
                                    if (i22 != 0) {
                                        i29 = 1;
                                    } else {
                                        i29 = i3;
                                    }
                                    gn2Var3 = i24 == 0 ? gn2Var : null;
                                    if ((i6 & 131072) != 0) {
                                        i18 &= -29360129;
                                        o88Var3 = (o88) lp2Var.j(a);
                                    } else {
                                        o88Var3 = o88Var;
                                    }
                                    i30 = i18;
                                    j11 = j10;
                                    i31 = i29;
                                    j12 = j11;
                                } else {
                                    lp2Var.Q();
                                    if ((i6 & 131072) != 0) {
                                        i18 &= -29360129;
                                    }
                                    j10 = j2;
                                    j12 = j4;
                                    z2 = z;
                                    gn2Var3 = gn2Var;
                                    o88Var3 = o88Var;
                                    i16 = i16;
                                    i20 = i20;
                                    kx4Var4 = kx4Var2;
                                    i30 = i18;
                                    j9 = j;
                                    j11 = j3;
                                    i31 = i3;
                                }
                                lp2Var.q();
                                lp2Var.W(-565217106);
                                if (j9 != 16) {
                                    kx4Var4 = kx4Var4;
                                    i16 = i16;
                                    jB = j9;
                                    z5 = false;
                                } else {
                                    lp2Var.W(-565216333);
                                    jB = o88Var3.b();
                                    if (jB != 16) {
                                        jB = ((dw0) lp2Var.j(j41.a)).a;
                                    }
                                    z5 = false;
                                    lp2Var.p(false);
                                }
                                lp2Var.p(z5);
                                if (o28Var2 != null) {
                                    r3 = o28Var2.a;
                                } else {
                                    r3 = z5;
                                }
                                long j13 = j11;
                                long j14 = j12;
                                o88 o88Var4 = o88Var3;
                                int i34 = i30 << 6;
                                kx4 kx4Var5 = kx4Var4;
                                int i35 = i16;
                                int i36 = i20;
                                int i37 = i31;
                                wl7.b(str2, kx4Var5, o88.e(o88Var4, jB, j10, j13, r3 == true ? 1 : 0, j14, 16609104), gn2Var3, i35, z2, i36, i37, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i34 & 57344) | (i34 & 458752) | (i34 & 3670016) | (i34 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                                i27 = i36;
                                i26 = i37;
                                o88Var2 = o88Var4;
                                o28Var3 = o28Var2;
                                z4 = z2;
                                gn2Var2 = gn2Var3;
                                i28 = i35;
                                j6 = j14;
                                mxVar3 = mxVar2;
                                j8 = j10;
                                kx4Var3 = kx4Var5;
                                j5 = j9;
                                j7 = j13;
                            } else {
                                lp2Var.Q();
                                j5 = j;
                                j6 = j4;
                                z4 = z;
                                i26 = i3;
                                gn2Var2 = gn2Var;
                                o88Var2 = o88Var;
                                i27 = i20;
                                kx4Var3 = kx4Var2;
                                o28Var3 = o28Var2;
                                j7 = j3;
                                i28 = i16;
                                mxVar3 = mxVar2;
                                j8 = j2;
                            }
                            j86VarR = lp2Var.r();
                            if (j86VarR != null) {
                                j86VarR.d = new rn2() { // from class: t78
                                    @Override // defpackage.rn2
                                    public final Object K(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int iP = w79.P(i4 | 1);
                                        int iP2 = w79.P(i5);
                                        u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                        return dn8.a;
                                    }
                                };
                            }
                        }
                        i18 |= 196608;
                        i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                        if (i24 != 0) {
                            i18 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            if (lp2Var.h(gn2Var)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i18 |= i25;
                        }
                        if ((i5 & 12582912) != 0) {
                            if ((i6 & 131072) == 0) {
                                i32 = 4194304;
                            } else {
                                i32 = 4194304;
                            }
                            i18 |= i32;
                        }
                        z2 = true;
                        if ((i11 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (lp2Var.N(i11 & 1, z3)) {
                            lp2Var.S();
                            if ((i4 & 1) != 0) {
                                if (i33 != 0) {
                                    kx4Var4 = hx4.X;
                                } else {
                                    kx4Var4 = kx4Var2;
                                }
                                j9 = dw0.g;
                                if (i9 != 0) {
                                    mxVar2 = null;
                                }
                                j10 = v88.c;
                                if (i12 != 0) {
                                    o28Var2 = null;
                                }
                                if (i15 != 0) {
                                    i16 = 1;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                }
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i3;
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 131072) != 0) {
                                    i18 &= -29360129;
                                    o88Var3 = (o88) lp2Var.j(a);
                                } else {
                                    o88Var3 = o88Var;
                                }
                                i30 = i18;
                                j11 = j10;
                                i31 = i29;
                                j12 = j11;
                            } else {
                                if (i33 != 0) {
                                    kx4Var4 = hx4.X;
                                } else {
                                    kx4Var4 = kx4Var2;
                                }
                                j9 = dw0.g;
                                if (i9 != 0) {
                                    mxVar2 = null;
                                }
                                j10 = v88.c;
                                if (i12 != 0) {
                                    o28Var2 = null;
                                }
                                if (i15 != 0) {
                                    i16 = 1;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                }
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i3;
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 131072) != 0) {
                                    i18 &= -29360129;
                                    o88Var3 = (o88) lp2Var.j(a);
                                } else {
                                    o88Var3 = o88Var;
                                }
                                i30 = i18;
                                j11 = j10;
                                i31 = i29;
                                j12 = j11;
                            }
                            lp2Var.q();
                            lp2Var.W(-565217106);
                            if (j9 != 16) {
                                kx4Var4 = kx4Var4;
                                i16 = i16;
                                jB = j9;
                                z5 = false;
                            } else {
                                lp2Var.W(-565216333);
                                jB = o88Var3.b();
                                if (jB != 16) {
                                    jB = ((dw0) lp2Var.j(j41.a)).a;
                                }
                                z5 = false;
                                lp2Var.p(false);
                            }
                            lp2Var.p(z5);
                            if (o28Var2 != null) {
                                r3 = o28Var2.a;
                            } else {
                                r3 = z5;
                            }
                            long j15 = j11;
                            long j16 = j12;
                            o88 o88Var5 = o88Var3;
                            int i38 = i30 << 6;
                            kx4 kx4Var6 = kx4Var4;
                            int i39 = i16;
                            int i310 = i20;
                            int i311 = i31;
                            wl7.b(str2, kx4Var6, o88.e(o88Var5, jB, j10, j15, r3 == true ? 1 : 0, j16, 16609104), gn2Var3, i39, z2, i310, i311, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i38 & 57344) | (i38 & 458752) | (i38 & 3670016) | (i38 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                            i27 = i310;
                            i26 = i311;
                            o88Var2 = o88Var5;
                            o28Var3 = o28Var2;
                            z4 = z2;
                            gn2Var2 = gn2Var3;
                            i28 = i39;
                            j6 = j16;
                            mxVar3 = mxVar2;
                            j8 = j10;
                            kx4Var3 = kx4Var6;
                            j5 = j9;
                            j7 = j15;
                        } else {
                            lp2Var.Q();
                            j5 = j;
                            j6 = j4;
                            z4 = z;
                            i26 = i3;
                            gn2Var2 = gn2Var;
                            o88Var2 = o88Var;
                            i27 = i20;
                            kx4Var3 = kx4Var2;
                            o28Var3 = o28Var2;
                            j7 = j3;
                            i28 = i16;
                            mxVar3 = mxVar2;
                            j8 = j2;
                        }
                        j86VarR = lp2Var.r();
                        if (j86VarR != null) {
                            j86VarR.d = new rn2() { // from class: t78
                                @Override // defpackage.rn2
                                public final Object K(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = w79.P(i4 | 1);
                                    int iP2 = w79.P(i5);
                                    u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                    return dn8.a;
                                }
                            };
                        }
                    }
                    i18 = i14 | 27648;
                    i20 = i2;
                    i22 = i6 & 32768;
                    if (i22 != 0) {
                        if ((i5 & 196608) == 0) {
                            if (lp2Var.d(i3)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i18 |= i23;
                        }
                        i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                        if (i24 != 0) {
                            i18 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            if (lp2Var.h(gn2Var)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i18 |= i25;
                        }
                        if ((i5 & 12582912) != 0) {
                            if ((i6 & 131072) == 0) {
                                i32 = 4194304;
                            } else {
                                i32 = 4194304;
                            }
                            i18 |= i32;
                        }
                        z2 = true;
                        if ((i11 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (lp2Var.N(i11 & 1, z3)) {
                            lp2Var.S();
                            if ((i4 & 1) != 0) {
                                if (i33 != 0) {
                                    kx4Var4 = hx4.X;
                                } else {
                                    kx4Var4 = kx4Var2;
                                }
                                j9 = dw0.g;
                                if (i9 != 0) {
                                    mxVar2 = null;
                                }
                                j10 = v88.c;
                                if (i12 != 0) {
                                    o28Var2 = null;
                                }
                                if (i15 != 0) {
                                    i16 = 1;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                }
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i3;
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 131072) != 0) {
                                    i18 &= -29360129;
                                    o88Var3 = (o88) lp2Var.j(a);
                                } else {
                                    o88Var3 = o88Var;
                                }
                                i30 = i18;
                                j11 = j10;
                                i31 = i29;
                                j12 = j11;
                            } else {
                                if (i33 != 0) {
                                    kx4Var4 = hx4.X;
                                } else {
                                    kx4Var4 = kx4Var2;
                                }
                                j9 = dw0.g;
                                if (i9 != 0) {
                                    mxVar2 = null;
                                }
                                j10 = v88.c;
                                if (i12 != 0) {
                                    o28Var2 = null;
                                }
                                if (i15 != 0) {
                                    i16 = 1;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                }
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i3;
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 131072) != 0) {
                                    i18 &= -29360129;
                                    o88Var3 = (o88) lp2Var.j(a);
                                } else {
                                    o88Var3 = o88Var;
                                }
                                i30 = i18;
                                j11 = j10;
                                i31 = i29;
                                j12 = j11;
                            }
                            lp2Var.q();
                            lp2Var.W(-565217106);
                            if (j9 != 16) {
                                kx4Var4 = kx4Var4;
                                i16 = i16;
                                jB = j9;
                                z5 = false;
                            } else {
                                lp2Var.W(-565216333);
                                jB = o88Var3.b();
                                if (jB != 16) {
                                    jB = ((dw0) lp2Var.j(j41.a)).a;
                                }
                                z5 = false;
                                lp2Var.p(false);
                            }
                            lp2Var.p(z5);
                            if (o28Var2 != null) {
                                r3 = o28Var2.a;
                            } else {
                                r3 = z5;
                            }
                            long j17 = j11;
                            long j18 = j12;
                            o88 o88Var6 = o88Var3;
                            int i312 = i30 << 6;
                            kx4 kx4Var7 = kx4Var4;
                            int i313 = i16;
                            int i314 = i20;
                            int i315 = i31;
                            wl7.b(str2, kx4Var7, o88.e(o88Var6, jB, j10, j17, r3 == true ? 1 : 0, j18, 16609104), gn2Var3, i313, z2, i314, i315, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i312 & 57344) | (i312 & 458752) | (i312 & 3670016) | (i312 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                            i27 = i314;
                            i26 = i315;
                            o88Var2 = o88Var6;
                            o28Var3 = o28Var2;
                            z4 = z2;
                            gn2Var2 = gn2Var3;
                            i28 = i313;
                            j6 = j18;
                            mxVar3 = mxVar2;
                            j8 = j10;
                            kx4Var3 = kx4Var7;
                            j5 = j9;
                            j7 = j17;
                        } else {
                            lp2Var.Q();
                            j5 = j;
                            j6 = j4;
                            z4 = z;
                            i26 = i3;
                            gn2Var2 = gn2Var;
                            o88Var2 = o88Var;
                            i27 = i20;
                            kx4Var3 = kx4Var2;
                            o28Var3 = o28Var2;
                            j7 = j3;
                            i28 = i16;
                            mxVar3 = mxVar2;
                            j8 = j2;
                        }
                        j86VarR = lp2Var.r();
                        if (j86VarR != null) {
                            j86VarR.d = new rn2() { // from class: t78
                                @Override // defpackage.rn2
                                public final Object K(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = w79.P(i4 | 1);
                                    int iP2 = w79.P(i5);
                                    u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                    return dn8.a;
                                }
                            };
                        }
                    }
                    i18 |= 196608;
                    i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                    if (i24 != 0) {
                        i18 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i18 |= i25;
                    }
                    if ((i5 & 12582912) != 0) {
                        if ((i6 & 131072) == 0) {
                            i32 = 4194304;
                        } else {
                            i32 = 4194304;
                        }
                        i18 |= i32;
                    }
                    z2 = true;
                    if ((i11 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i11 & 1, z3)) {
                        lp2Var.S();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        } else {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        }
                        lp2Var.q();
                        lp2Var.W(-565217106);
                        if (j9 != 16) {
                            kx4Var4 = kx4Var4;
                            i16 = i16;
                            jB = j9;
                            z5 = false;
                        } else {
                            lp2Var.W(-565216333);
                            jB = o88Var3.b();
                            if (jB != 16) {
                                jB = ((dw0) lp2Var.j(j41.a)).a;
                            }
                            z5 = false;
                            lp2Var.p(false);
                        }
                        lp2Var.p(z5);
                        if (o28Var2 != null) {
                            r3 = o28Var2.a;
                        } else {
                            r3 = z5;
                        }
                        long j19 = j11;
                        long j110 = j12;
                        o88 o88Var7 = o88Var3;
                        int i316 = i30 << 6;
                        kx4 kx4Var8 = kx4Var4;
                        int i317 = i16;
                        int i318 = i20;
                        int i319 = i31;
                        wl7.b(str2, kx4Var8, o88.e(o88Var7, jB, j10, j19, r3 == true ? 1 : 0, j110, 16609104), gn2Var3, i317, z2, i318, i319, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i316 & 57344) | (i316 & 458752) | (i316 & 3670016) | (i316 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        i27 = i318;
                        i26 = i319;
                        o88Var2 = o88Var7;
                        o28Var3 = o28Var2;
                        z4 = z2;
                        gn2Var2 = gn2Var3;
                        i28 = i317;
                        j6 = j110;
                        mxVar3 = mxVar2;
                        j8 = j10;
                        kx4Var3 = kx4Var8;
                        j5 = j9;
                        j7 = j19;
                    } else {
                        lp2Var.Q();
                        j5 = j;
                        j6 = j4;
                        z4 = z;
                        i26 = i3;
                        gn2Var2 = gn2Var;
                        o88Var2 = o88Var;
                        i27 = i20;
                        kx4Var3 = kx4Var2;
                        o28Var3 = o28Var2;
                        j7 = j3;
                        i28 = i16;
                        mxVar3 = mxVar2;
                        j8 = j2;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: t78
                            @Override // defpackage.rn2
                            public final Object K(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = w79.P(i4 | 1);
                                int iP2 = w79.P(i5);
                                u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i14 = i13 | 432;
                i16 = i;
                i18 = i14 | 3072;
                i19 = i6 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i19 != 0) {
                    if ((i5 & 24576) == 0) {
                        i20 = i2;
                        if (lp2Var.d(i20)) {
                            i21 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i21 = 8192;
                        }
                        i18 |= i21;
                    }
                    i22 = i6 & 32768;
                    if (i22 != 0) {
                        if ((i5 & 196608) == 0) {
                            if (lp2Var.d(i3)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i18 |= i23;
                        }
                        i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                        if (i24 != 0) {
                            i18 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            if (lp2Var.h(gn2Var)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i18 |= i25;
                        }
                        if ((i5 & 12582912) != 0) {
                            if ((i6 & 131072) == 0) {
                                i32 = 4194304;
                            } else {
                                i32 = 4194304;
                            }
                            i18 |= i32;
                        }
                        z2 = true;
                        if ((i11 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (lp2Var.N(i11 & 1, z3)) {
                            lp2Var.S();
                            if ((i4 & 1) != 0) {
                                if (i33 != 0) {
                                    kx4Var4 = hx4.X;
                                } else {
                                    kx4Var4 = kx4Var2;
                                }
                                j9 = dw0.g;
                                if (i9 != 0) {
                                    mxVar2 = null;
                                }
                                j10 = v88.c;
                                if (i12 != 0) {
                                    o28Var2 = null;
                                }
                                if (i15 != 0) {
                                    i16 = 1;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                }
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i3;
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 131072) != 0) {
                                    i18 &= -29360129;
                                    o88Var3 = (o88) lp2Var.j(a);
                                } else {
                                    o88Var3 = o88Var;
                                }
                                i30 = i18;
                                j11 = j10;
                                i31 = i29;
                                j12 = j11;
                            } else {
                                if (i33 != 0) {
                                    kx4Var4 = hx4.X;
                                } else {
                                    kx4Var4 = kx4Var2;
                                }
                                j9 = dw0.g;
                                if (i9 != 0) {
                                    mxVar2 = null;
                                }
                                j10 = v88.c;
                                if (i12 != 0) {
                                    o28Var2 = null;
                                }
                                if (i15 != 0) {
                                    i16 = 1;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                }
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i3;
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 131072) != 0) {
                                    i18 &= -29360129;
                                    o88Var3 = (o88) lp2Var.j(a);
                                } else {
                                    o88Var3 = o88Var;
                                }
                                i30 = i18;
                                j11 = j10;
                                i31 = i29;
                                j12 = j11;
                            }
                            lp2Var.q();
                            lp2Var.W(-565217106);
                            if (j9 != 16) {
                                kx4Var4 = kx4Var4;
                                i16 = i16;
                                jB = j9;
                                z5 = false;
                            } else {
                                lp2Var.W(-565216333);
                                jB = o88Var3.b();
                                if (jB != 16) {
                                    jB = ((dw0) lp2Var.j(j41.a)).a;
                                }
                                z5 = false;
                                lp2Var.p(false);
                            }
                            lp2Var.p(z5);
                            if (o28Var2 != null) {
                                r3 = o28Var2.a;
                            } else {
                                r3 = z5;
                            }
                            long j111 = j11;
                            long j112 = j12;
                            o88 o88Var8 = o88Var3;
                            int i3110 = i30 << 6;
                            kx4 kx4Var9 = kx4Var4;
                            int i3111 = i16;
                            int i3112 = i20;
                            int i3113 = i31;
                            wl7.b(str2, kx4Var9, o88.e(o88Var8, jB, j10, j111, r3 == true ? 1 : 0, j112, 16609104), gn2Var3, i3111, z2, i3112, i3113, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i3110 & 57344) | (i3110 & 458752) | (i3110 & 3670016) | (i3110 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                            i27 = i3112;
                            i26 = i3113;
                            o88Var2 = o88Var8;
                            o28Var3 = o28Var2;
                            z4 = z2;
                            gn2Var2 = gn2Var3;
                            i28 = i3111;
                            j6 = j112;
                            mxVar3 = mxVar2;
                            j8 = j10;
                            kx4Var3 = kx4Var9;
                            j5 = j9;
                            j7 = j111;
                        } else {
                            lp2Var.Q();
                            j5 = j;
                            j6 = j4;
                            z4 = z;
                            i26 = i3;
                            gn2Var2 = gn2Var;
                            o88Var2 = o88Var;
                            i27 = i20;
                            kx4Var3 = kx4Var2;
                            o28Var3 = o28Var2;
                            j7 = j3;
                            i28 = i16;
                            mxVar3 = mxVar2;
                            j8 = j2;
                        }
                        j86VarR = lp2Var.r();
                        if (j86VarR != null) {
                            j86VarR.d = new rn2() { // from class: t78
                                @Override // defpackage.rn2
                                public final Object K(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = w79.P(i4 | 1);
                                    int iP2 = w79.P(i5);
                                    u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                    return dn8.a;
                                }
                            };
                        }
                    }
                    i18 |= 196608;
                    i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                    if (i24 != 0) {
                        i18 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i18 |= i25;
                    }
                    if ((i5 & 12582912) != 0) {
                        if ((i6 & 131072) == 0) {
                            i32 = 4194304;
                        } else {
                            i32 = 4194304;
                        }
                        i18 |= i32;
                    }
                    z2 = true;
                    if ((i11 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i11 & 1, z3)) {
                        lp2Var.S();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        } else {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        }
                        lp2Var.q();
                        lp2Var.W(-565217106);
                        if (j9 != 16) {
                            kx4Var4 = kx4Var4;
                            i16 = i16;
                            jB = j9;
                            z5 = false;
                        } else {
                            lp2Var.W(-565216333);
                            jB = o88Var3.b();
                            if (jB != 16) {
                                jB = ((dw0) lp2Var.j(j41.a)).a;
                            }
                            z5 = false;
                            lp2Var.p(false);
                        }
                        lp2Var.p(z5);
                        if (o28Var2 != null) {
                            r3 = o28Var2.a;
                        } else {
                            r3 = z5;
                        }
                        long j113 = j11;
                        long j114 = j12;
                        o88 o88Var9 = o88Var3;
                        int i3114 = i30 << 6;
                        kx4 kx4Var10 = kx4Var4;
                        int i3115 = i16;
                        int i3116 = i20;
                        int i3117 = i31;
                        wl7.b(str2, kx4Var10, o88.e(o88Var9, jB, j10, j113, r3 == true ? 1 : 0, j114, 16609104), gn2Var3, i3115, z2, i3116, i3117, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i3114 & 57344) | (i3114 & 458752) | (i3114 & 3670016) | (i3114 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        i27 = i3116;
                        i26 = i3117;
                        o88Var2 = o88Var9;
                        o28Var3 = o28Var2;
                        z4 = z2;
                        gn2Var2 = gn2Var3;
                        i28 = i3115;
                        j6 = j114;
                        mxVar3 = mxVar2;
                        j8 = j10;
                        kx4Var3 = kx4Var10;
                        j5 = j9;
                        j7 = j113;
                    } else {
                        lp2Var.Q();
                        j5 = j;
                        j6 = j4;
                        z4 = z;
                        i26 = i3;
                        gn2Var2 = gn2Var;
                        o88Var2 = o88Var;
                        i27 = i20;
                        kx4Var3 = kx4Var2;
                        o28Var3 = o28Var2;
                        j7 = j3;
                        i28 = i16;
                        mxVar3 = mxVar2;
                        j8 = j2;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: t78
                            @Override // defpackage.rn2
                            public final Object K(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = w79.P(i4 | 1);
                                int iP2 = w79.P(i5);
                                u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i18 = i14 | 27648;
                i20 = i2;
                i22 = i6 & 32768;
                if (i22 != 0) {
                    if ((i5 & 196608) == 0) {
                        if (lp2Var.d(i3)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i18 |= i23;
                    }
                    i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                    if (i24 != 0) {
                        i18 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i18 |= i25;
                    }
                    if ((i5 & 12582912) != 0) {
                        if ((i6 & 131072) == 0) {
                            i32 = 4194304;
                        } else {
                            i32 = 4194304;
                        }
                        i18 |= i32;
                    }
                    z2 = true;
                    if ((i11 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i11 & 1, z3)) {
                        lp2Var.S();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        } else {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        }
                        lp2Var.q();
                        lp2Var.W(-565217106);
                        if (j9 != 16) {
                            kx4Var4 = kx4Var4;
                            i16 = i16;
                            jB = j9;
                            z5 = false;
                        } else {
                            lp2Var.W(-565216333);
                            jB = o88Var3.b();
                            if (jB != 16) {
                                jB = ((dw0) lp2Var.j(j41.a)).a;
                            }
                            z5 = false;
                            lp2Var.p(false);
                        }
                        lp2Var.p(z5);
                        if (o28Var2 != null) {
                            r3 = o28Var2.a;
                        } else {
                            r3 = z5;
                        }
                        long j115 = j11;
                        long j116 = j12;
                        o88 o88Var10 = o88Var3;
                        int i3118 = i30 << 6;
                        kx4 kx4Var11 = kx4Var4;
                        int i3119 = i16;
                        int i31110 = i20;
                        int i31111 = i31;
                        wl7.b(str2, kx4Var11, o88.e(o88Var10, jB, j10, j115, r3 == true ? 1 : 0, j116, 16609104), gn2Var3, i3119, z2, i31110, i31111, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i3118 & 57344) | (i3118 & 458752) | (i3118 & 3670016) | (i3118 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        i27 = i31110;
                        i26 = i31111;
                        o88Var2 = o88Var10;
                        o28Var3 = o28Var2;
                        z4 = z2;
                        gn2Var2 = gn2Var3;
                        i28 = i3119;
                        j6 = j116;
                        mxVar3 = mxVar2;
                        j8 = j10;
                        kx4Var3 = kx4Var11;
                        j5 = j9;
                        j7 = j115;
                    } else {
                        lp2Var.Q();
                        j5 = j;
                        j6 = j4;
                        z4 = z;
                        i26 = i3;
                        gn2Var2 = gn2Var;
                        o88Var2 = o88Var;
                        i27 = i20;
                        kx4Var3 = kx4Var2;
                        o28Var3 = o28Var2;
                        j7 = j3;
                        i28 = i16;
                        mxVar3 = mxVar2;
                        j8 = j2;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: t78
                            @Override // defpackage.rn2
                            public final Object K(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = w79.P(i4 | 1);
                                int iP2 = w79.P(i5);
                                u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i18 |= 196608;
                i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i24 != 0) {
                    i18 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i18 |= i25;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i32 = 4194304;
                    } else {
                        i32 = 4194304;
                    }
                    i18 |= i32;
                }
                z2 = true;
                if ((i11 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i11 & 1, z3)) {
                    lp2Var.S();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    } else {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    }
                    lp2Var.q();
                    lp2Var.W(-565217106);
                    if (j9 != 16) {
                        kx4Var4 = kx4Var4;
                        i16 = i16;
                        jB = j9;
                        z5 = false;
                    } else {
                        lp2Var.W(-565216333);
                        jB = o88Var3.b();
                        if (jB != 16) {
                            jB = ((dw0) lp2Var.j(j41.a)).a;
                        }
                        z5 = false;
                        lp2Var.p(false);
                    }
                    lp2Var.p(z5);
                    if (o28Var2 != null) {
                        r3 = o28Var2.a;
                    } else {
                        r3 = z5;
                    }
                    long j117 = j11;
                    long j118 = j12;
                    o88 o88Var11 = o88Var3;
                    int i31112 = i30 << 6;
                    kx4 kx4Var12 = kx4Var4;
                    int i31113 = i16;
                    int i31114 = i20;
                    int i31115 = i31;
                    wl7.b(str2, kx4Var12, o88.e(o88Var11, jB, j10, j117, r3 == true ? 1 : 0, j118, 16609104), gn2Var3, i31113, z2, i31114, i31115, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i31112 & 57344) | (i31112 & 458752) | (i31112 & 3670016) | (i31112 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    i27 = i31114;
                    i26 = i31115;
                    o88Var2 = o88Var11;
                    o28Var3 = o28Var2;
                    z4 = z2;
                    gn2Var2 = gn2Var3;
                    i28 = i31113;
                    j6 = j118;
                    mxVar3 = mxVar2;
                    j8 = j10;
                    kx4Var3 = kx4Var12;
                    j5 = j9;
                    j7 = j117;
                } else {
                    lp2Var.Q();
                    j5 = j;
                    j6 = j4;
                    z4 = z;
                    i26 = i3;
                    gn2Var2 = gn2Var;
                    o88Var2 = o88Var;
                    i27 = i20;
                    kx4Var3 = kx4Var2;
                    o28Var3 = o28Var2;
                    j7 = j3;
                    i28 = i16;
                    mxVar3 = mxVar2;
                    j8 = j2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t78
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = w79.P(i4 | 1);
                            int iP2 = w79.P(i5);
                            u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i8 = i7 | 3456;
            mxVar2 = mxVar;
            i11 = i8 | 920346624;
            i12 = i6 & 1024;
            if (i12 != 0) {
                i13 = i5 | 6;
                o28Var2 = o28Var;
            } else if ((i5 & 6) == 0) {
                o28Var2 = o28Var;
                i13 = (lp2Var.f(o28Var2) ? 4 : 2) | i5;
            } else {
                o28Var2 = o28Var;
                i13 = i5;
            }
            i14 = i13 | 48;
            i15 = i6 & 4096;
            if (i15 != 0) {
                if ((i5 & 384) == 0) {
                    i16 = i;
                    if (lp2Var.d(i16)) {
                        i17 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i17 = 128;
                    }
                    i14 |= i17;
                }
                i18 = i14 | 3072;
                i19 = i6 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i19 != 0) {
                    if ((i5 & 24576) == 0) {
                        i20 = i2;
                        if (lp2Var.d(i20)) {
                            i21 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i21 = 8192;
                        }
                        i18 |= i21;
                    }
                    i22 = i6 & 32768;
                    if (i22 != 0) {
                        if ((i5 & 196608) == 0) {
                            if (lp2Var.d(i3)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i18 |= i23;
                        }
                        i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                        if (i24 != 0) {
                            i18 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            if (lp2Var.h(gn2Var)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i18 |= i25;
                        }
                        if ((i5 & 12582912) != 0) {
                            if ((i6 & 131072) == 0) {
                                i32 = 4194304;
                            } else {
                                i32 = 4194304;
                            }
                            i18 |= i32;
                        }
                        z2 = true;
                        if ((i11 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (lp2Var.N(i11 & 1, z3)) {
                            lp2Var.S();
                            if ((i4 & 1) != 0) {
                                if (i33 != 0) {
                                    kx4Var4 = hx4.X;
                                } else {
                                    kx4Var4 = kx4Var2;
                                }
                                j9 = dw0.g;
                                if (i9 != 0) {
                                    mxVar2 = null;
                                }
                                j10 = v88.c;
                                if (i12 != 0) {
                                    o28Var2 = null;
                                }
                                if (i15 != 0) {
                                    i16 = 1;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                }
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i3;
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 131072) != 0) {
                                    i18 &= -29360129;
                                    o88Var3 = (o88) lp2Var.j(a);
                                } else {
                                    o88Var3 = o88Var;
                                }
                                i30 = i18;
                                j11 = j10;
                                i31 = i29;
                                j12 = j11;
                            } else {
                                if (i33 != 0) {
                                    kx4Var4 = hx4.X;
                                } else {
                                    kx4Var4 = kx4Var2;
                                }
                                j9 = dw0.g;
                                if (i9 != 0) {
                                    mxVar2 = null;
                                }
                                j10 = v88.c;
                                if (i12 != 0) {
                                    o28Var2 = null;
                                }
                                if (i15 != 0) {
                                    i16 = 1;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                }
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i3;
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 131072) != 0) {
                                    i18 &= -29360129;
                                    o88Var3 = (o88) lp2Var.j(a);
                                } else {
                                    o88Var3 = o88Var;
                                }
                                i30 = i18;
                                j11 = j10;
                                i31 = i29;
                                j12 = j11;
                            }
                            lp2Var.q();
                            lp2Var.W(-565217106);
                            if (j9 != 16) {
                                kx4Var4 = kx4Var4;
                                i16 = i16;
                                jB = j9;
                                z5 = false;
                            } else {
                                lp2Var.W(-565216333);
                                jB = o88Var3.b();
                                if (jB != 16) {
                                    jB = ((dw0) lp2Var.j(j41.a)).a;
                                }
                                z5 = false;
                                lp2Var.p(false);
                            }
                            lp2Var.p(z5);
                            if (o28Var2 != null) {
                                r3 = o28Var2.a;
                            } else {
                                r3 = z5;
                            }
                            long j119 = j11;
                            long j1110 = j12;
                            o88 o88Var12 = o88Var3;
                            int i31116 = i30 << 6;
                            kx4 kx4Var13 = kx4Var4;
                            int i31117 = i16;
                            int i31118 = i20;
                            int i31119 = i31;
                            wl7.b(str2, kx4Var13, o88.e(o88Var12, jB, j10, j119, r3 == true ? 1 : 0, j1110, 16609104), gn2Var3, i31117, z2, i31118, i31119, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i31116 & 57344) | (i31116 & 458752) | (i31116 & 3670016) | (i31116 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                            i27 = i31118;
                            i26 = i31119;
                            o88Var2 = o88Var12;
                            o28Var3 = o28Var2;
                            z4 = z2;
                            gn2Var2 = gn2Var3;
                            i28 = i31117;
                            j6 = j1110;
                            mxVar3 = mxVar2;
                            j8 = j10;
                            kx4Var3 = kx4Var13;
                            j5 = j9;
                            j7 = j119;
                        } else {
                            lp2Var.Q();
                            j5 = j;
                            j6 = j4;
                            z4 = z;
                            i26 = i3;
                            gn2Var2 = gn2Var;
                            o88Var2 = o88Var;
                            i27 = i20;
                            kx4Var3 = kx4Var2;
                            o28Var3 = o28Var2;
                            j7 = j3;
                            i28 = i16;
                            mxVar3 = mxVar2;
                            j8 = j2;
                        }
                        j86VarR = lp2Var.r();
                        if (j86VarR != null) {
                            j86VarR.d = new rn2() { // from class: t78
                                @Override // defpackage.rn2
                                public final Object K(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = w79.P(i4 | 1);
                                    int iP2 = w79.P(i5);
                                    u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                    return dn8.a;
                                }
                            };
                        }
                    }
                    i18 |= 196608;
                    i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                    if (i24 != 0) {
                        i18 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i18 |= i25;
                    }
                    if ((i5 & 12582912) != 0) {
                        if ((i6 & 131072) == 0) {
                            i32 = 4194304;
                        } else {
                            i32 = 4194304;
                        }
                        i18 |= i32;
                    }
                    z2 = true;
                    if ((i11 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i11 & 1, z3)) {
                        lp2Var.S();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        } else {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        }
                        lp2Var.q();
                        lp2Var.W(-565217106);
                        if (j9 != 16) {
                            kx4Var4 = kx4Var4;
                            i16 = i16;
                            jB = j9;
                            z5 = false;
                        } else {
                            lp2Var.W(-565216333);
                            jB = o88Var3.b();
                            if (jB != 16) {
                                jB = ((dw0) lp2Var.j(j41.a)).a;
                            }
                            z5 = false;
                            lp2Var.p(false);
                        }
                        lp2Var.p(z5);
                        if (o28Var2 != null) {
                            r3 = o28Var2.a;
                        } else {
                            r3 = z5;
                        }
                        long j1111 = j11;
                        long j1112 = j12;
                        o88 o88Var13 = o88Var3;
                        int i311110 = i30 << 6;
                        kx4 kx4Var14 = kx4Var4;
                        int i311111 = i16;
                        int i311112 = i20;
                        int i311113 = i31;
                        wl7.b(str2, kx4Var14, o88.e(o88Var13, jB, j10, j1111, r3 == true ? 1 : 0, j1112, 16609104), gn2Var3, i311111, z2, i311112, i311113, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i311110 & 57344) | (i311110 & 458752) | (i311110 & 3670016) | (i311110 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        i27 = i311112;
                        i26 = i311113;
                        o88Var2 = o88Var13;
                        o28Var3 = o28Var2;
                        z4 = z2;
                        gn2Var2 = gn2Var3;
                        i28 = i311111;
                        j6 = j1112;
                        mxVar3 = mxVar2;
                        j8 = j10;
                        kx4Var3 = kx4Var14;
                        j5 = j9;
                        j7 = j1111;
                    } else {
                        lp2Var.Q();
                        j5 = j;
                        j6 = j4;
                        z4 = z;
                        i26 = i3;
                        gn2Var2 = gn2Var;
                        o88Var2 = o88Var;
                        i27 = i20;
                        kx4Var3 = kx4Var2;
                        o28Var3 = o28Var2;
                        j7 = j3;
                        i28 = i16;
                        mxVar3 = mxVar2;
                        j8 = j2;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: t78
                            @Override // defpackage.rn2
                            public final Object K(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = w79.P(i4 | 1);
                                int iP2 = w79.P(i5);
                                u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i18 = i14 | 27648;
                i20 = i2;
                i22 = i6 & 32768;
                if (i22 != 0) {
                    if ((i5 & 196608) == 0) {
                        if (lp2Var.d(i3)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i18 |= i23;
                    }
                    i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                    if (i24 != 0) {
                        i18 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i18 |= i25;
                    }
                    if ((i5 & 12582912) != 0) {
                        if ((i6 & 131072) == 0) {
                            i32 = 4194304;
                        } else {
                            i32 = 4194304;
                        }
                        i18 |= i32;
                    }
                    z2 = true;
                    if ((i11 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i11 & 1, z3)) {
                        lp2Var.S();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        } else {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        }
                        lp2Var.q();
                        lp2Var.W(-565217106);
                        if (j9 != 16) {
                            kx4Var4 = kx4Var4;
                            i16 = i16;
                            jB = j9;
                            z5 = false;
                        } else {
                            lp2Var.W(-565216333);
                            jB = o88Var3.b();
                            if (jB != 16) {
                                jB = ((dw0) lp2Var.j(j41.a)).a;
                            }
                            z5 = false;
                            lp2Var.p(false);
                        }
                        lp2Var.p(z5);
                        if (o28Var2 != null) {
                            r3 = o28Var2.a;
                        } else {
                            r3 = z5;
                        }
                        long j1113 = j11;
                        long j1114 = j12;
                        o88 o88Var14 = o88Var3;
                        int i311114 = i30 << 6;
                        kx4 kx4Var15 = kx4Var4;
                        int i311115 = i16;
                        int i311116 = i20;
                        int i311117 = i31;
                        wl7.b(str2, kx4Var15, o88.e(o88Var14, jB, j10, j1113, r3 == true ? 1 : 0, j1114, 16609104), gn2Var3, i311115, z2, i311116, i311117, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i311114 & 57344) | (i311114 & 458752) | (i311114 & 3670016) | (i311114 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        i27 = i311116;
                        i26 = i311117;
                        o88Var2 = o88Var14;
                        o28Var3 = o28Var2;
                        z4 = z2;
                        gn2Var2 = gn2Var3;
                        i28 = i311115;
                        j6 = j1114;
                        mxVar3 = mxVar2;
                        j8 = j10;
                        kx4Var3 = kx4Var15;
                        j5 = j9;
                        j7 = j1113;
                    } else {
                        lp2Var.Q();
                        j5 = j;
                        j6 = j4;
                        z4 = z;
                        i26 = i3;
                        gn2Var2 = gn2Var;
                        o88Var2 = o88Var;
                        i27 = i20;
                        kx4Var3 = kx4Var2;
                        o28Var3 = o28Var2;
                        j7 = j3;
                        i28 = i16;
                        mxVar3 = mxVar2;
                        j8 = j2;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: t78
                            @Override // defpackage.rn2
                            public final Object K(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = w79.P(i4 | 1);
                                int iP2 = w79.P(i5);
                                u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i18 |= 196608;
                i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i24 != 0) {
                    i18 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i18 |= i25;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i32 = 4194304;
                    } else {
                        i32 = 4194304;
                    }
                    i18 |= i32;
                }
                z2 = true;
                if ((i11 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i11 & 1, z3)) {
                    lp2Var.S();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    } else {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    }
                    lp2Var.q();
                    lp2Var.W(-565217106);
                    if (j9 != 16) {
                        kx4Var4 = kx4Var4;
                        i16 = i16;
                        jB = j9;
                        z5 = false;
                    } else {
                        lp2Var.W(-565216333);
                        jB = o88Var3.b();
                        if (jB != 16) {
                            jB = ((dw0) lp2Var.j(j41.a)).a;
                        }
                        z5 = false;
                        lp2Var.p(false);
                    }
                    lp2Var.p(z5);
                    if (o28Var2 != null) {
                        r3 = o28Var2.a;
                    } else {
                        r3 = z5;
                    }
                    long j1115 = j11;
                    long j1116 = j12;
                    o88 o88Var15 = o88Var3;
                    int i311118 = i30 << 6;
                    kx4 kx4Var16 = kx4Var4;
                    int i311119 = i16;
                    int i3111110 = i20;
                    int i3111111 = i31;
                    wl7.b(str2, kx4Var16, o88.e(o88Var15, jB, j10, j1115, r3 == true ? 1 : 0, j1116, 16609104), gn2Var3, i311119, z2, i3111110, i3111111, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i311118 & 57344) | (i311118 & 458752) | (i311118 & 3670016) | (i311118 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    i27 = i3111110;
                    i26 = i3111111;
                    o88Var2 = o88Var15;
                    o28Var3 = o28Var2;
                    z4 = z2;
                    gn2Var2 = gn2Var3;
                    i28 = i311119;
                    j6 = j1116;
                    mxVar3 = mxVar2;
                    j8 = j10;
                    kx4Var3 = kx4Var16;
                    j5 = j9;
                    j7 = j1115;
                } else {
                    lp2Var.Q();
                    j5 = j;
                    j6 = j4;
                    z4 = z;
                    i26 = i3;
                    gn2Var2 = gn2Var;
                    o88Var2 = o88Var;
                    i27 = i20;
                    kx4Var3 = kx4Var2;
                    o28Var3 = o28Var2;
                    j7 = j3;
                    i28 = i16;
                    mxVar3 = mxVar2;
                    j8 = j2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t78
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = w79.P(i4 | 1);
                            int iP2 = w79.P(i5);
                            u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i14 = i13 | 432;
            i16 = i;
            i18 = i14 | 3072;
            i19 = i6 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i19 != 0) {
                if ((i5 & 24576) == 0) {
                    i20 = i2;
                    if (lp2Var.d(i20)) {
                        i21 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i21 = 8192;
                    }
                    i18 |= i21;
                }
                i22 = i6 & 32768;
                if (i22 != 0) {
                    if ((i5 & 196608) == 0) {
                        if (lp2Var.d(i3)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i18 |= i23;
                    }
                    i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                    if (i24 != 0) {
                        i18 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i18 |= i25;
                    }
                    if ((i5 & 12582912) != 0) {
                        if ((i6 & 131072) == 0) {
                            i32 = 4194304;
                        } else {
                            i32 = 4194304;
                        }
                        i18 |= i32;
                    }
                    z2 = true;
                    if ((i11 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i11 & 1, z3)) {
                        lp2Var.S();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        } else {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        }
                        lp2Var.q();
                        lp2Var.W(-565217106);
                        if (j9 != 16) {
                            kx4Var4 = kx4Var4;
                            i16 = i16;
                            jB = j9;
                            z5 = false;
                        } else {
                            lp2Var.W(-565216333);
                            jB = o88Var3.b();
                            if (jB != 16) {
                                jB = ((dw0) lp2Var.j(j41.a)).a;
                            }
                            z5 = false;
                            lp2Var.p(false);
                        }
                        lp2Var.p(z5);
                        if (o28Var2 != null) {
                            r3 = o28Var2.a;
                        } else {
                            r3 = z5;
                        }
                        long j1117 = j11;
                        long j1118 = j12;
                        o88 o88Var16 = o88Var3;
                        int i3111112 = i30 << 6;
                        kx4 kx4Var17 = kx4Var4;
                        int i3111113 = i16;
                        int i3111114 = i20;
                        int i3111115 = i31;
                        wl7.b(str2, kx4Var17, o88.e(o88Var16, jB, j10, j1117, r3 == true ? 1 : 0, j1118, 16609104), gn2Var3, i3111113, z2, i3111114, i3111115, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i3111112 & 57344) | (i3111112 & 458752) | (i3111112 & 3670016) | (i3111112 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        i27 = i3111114;
                        i26 = i3111115;
                        o88Var2 = o88Var16;
                        o28Var3 = o28Var2;
                        z4 = z2;
                        gn2Var2 = gn2Var3;
                        i28 = i3111113;
                        j6 = j1118;
                        mxVar3 = mxVar2;
                        j8 = j10;
                        kx4Var3 = kx4Var17;
                        j5 = j9;
                        j7 = j1117;
                    } else {
                        lp2Var.Q();
                        j5 = j;
                        j6 = j4;
                        z4 = z;
                        i26 = i3;
                        gn2Var2 = gn2Var;
                        o88Var2 = o88Var;
                        i27 = i20;
                        kx4Var3 = kx4Var2;
                        o28Var3 = o28Var2;
                        j7 = j3;
                        i28 = i16;
                        mxVar3 = mxVar2;
                        j8 = j2;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: t78
                            @Override // defpackage.rn2
                            public final Object K(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = w79.P(i4 | 1);
                                int iP2 = w79.P(i5);
                                u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i18 |= 196608;
                i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i24 != 0) {
                    i18 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i18 |= i25;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i32 = 4194304;
                    } else {
                        i32 = 4194304;
                    }
                    i18 |= i32;
                }
                z2 = true;
                if ((i11 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i11 & 1, z3)) {
                    lp2Var.S();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    } else {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    }
                    lp2Var.q();
                    lp2Var.W(-565217106);
                    if (j9 != 16) {
                        kx4Var4 = kx4Var4;
                        i16 = i16;
                        jB = j9;
                        z5 = false;
                    } else {
                        lp2Var.W(-565216333);
                        jB = o88Var3.b();
                        if (jB != 16) {
                            jB = ((dw0) lp2Var.j(j41.a)).a;
                        }
                        z5 = false;
                        lp2Var.p(false);
                    }
                    lp2Var.p(z5);
                    if (o28Var2 != null) {
                        r3 = o28Var2.a;
                    } else {
                        r3 = z5;
                    }
                    long j1119 = j11;
                    long j11110 = j12;
                    o88 o88Var17 = o88Var3;
                    int i3111116 = i30 << 6;
                    kx4 kx4Var18 = kx4Var4;
                    int i3111117 = i16;
                    int i3111118 = i20;
                    int i3111119 = i31;
                    wl7.b(str2, kx4Var18, o88.e(o88Var17, jB, j10, j1119, r3 == true ? 1 : 0, j11110, 16609104), gn2Var3, i3111117, z2, i3111118, i3111119, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i3111116 & 57344) | (i3111116 & 458752) | (i3111116 & 3670016) | (i3111116 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    i27 = i3111118;
                    i26 = i3111119;
                    o88Var2 = o88Var17;
                    o28Var3 = o28Var2;
                    z4 = z2;
                    gn2Var2 = gn2Var3;
                    i28 = i3111117;
                    j6 = j11110;
                    mxVar3 = mxVar2;
                    j8 = j10;
                    kx4Var3 = kx4Var18;
                    j5 = j9;
                    j7 = j1119;
                } else {
                    lp2Var.Q();
                    j5 = j;
                    j6 = j4;
                    z4 = z;
                    i26 = i3;
                    gn2Var2 = gn2Var;
                    o88Var2 = o88Var;
                    i27 = i20;
                    kx4Var3 = kx4Var2;
                    o28Var3 = o28Var2;
                    j7 = j3;
                    i28 = i16;
                    mxVar3 = mxVar2;
                    j8 = j2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t78
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = w79.P(i4 | 1);
                            int iP2 = w79.P(i5);
                            u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i18 = i14 | 27648;
            i20 = i2;
            i22 = i6 & 32768;
            if (i22 != 0) {
                if ((i5 & 196608) == 0) {
                    if (lp2Var.d(i3)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i18 |= i23;
                }
                i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i24 != 0) {
                    i18 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i18 |= i25;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i32 = 4194304;
                    } else {
                        i32 = 4194304;
                    }
                    i18 |= i32;
                }
                z2 = true;
                if ((i11 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i11 & 1, z3)) {
                    lp2Var.S();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    } else {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    }
                    lp2Var.q();
                    lp2Var.W(-565217106);
                    if (j9 != 16) {
                        kx4Var4 = kx4Var4;
                        i16 = i16;
                        jB = j9;
                        z5 = false;
                    } else {
                        lp2Var.W(-565216333);
                        jB = o88Var3.b();
                        if (jB != 16) {
                            jB = ((dw0) lp2Var.j(j41.a)).a;
                        }
                        z5 = false;
                        lp2Var.p(false);
                    }
                    lp2Var.p(z5);
                    if (o28Var2 != null) {
                        r3 = o28Var2.a;
                    } else {
                        r3 = z5;
                    }
                    long j11111 = j11;
                    long j11112 = j12;
                    o88 o88Var18 = o88Var3;
                    int i31111110 = i30 << 6;
                    kx4 kx4Var19 = kx4Var4;
                    int i31111111 = i16;
                    int i31111112 = i20;
                    int i31111113 = i31;
                    wl7.b(str2, kx4Var19, o88.e(o88Var18, jB, j10, j11111, r3 == true ? 1 : 0, j11112, 16609104), gn2Var3, i31111111, z2, i31111112, i31111113, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i31111110 & 57344) | (i31111110 & 458752) | (i31111110 & 3670016) | (i31111110 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    i27 = i31111112;
                    i26 = i31111113;
                    o88Var2 = o88Var18;
                    o28Var3 = o28Var2;
                    z4 = z2;
                    gn2Var2 = gn2Var3;
                    i28 = i31111111;
                    j6 = j11112;
                    mxVar3 = mxVar2;
                    j8 = j10;
                    kx4Var3 = kx4Var19;
                    j5 = j9;
                    j7 = j11111;
                } else {
                    lp2Var.Q();
                    j5 = j;
                    j6 = j4;
                    z4 = z;
                    i26 = i3;
                    gn2Var2 = gn2Var;
                    o88Var2 = o88Var;
                    i27 = i20;
                    kx4Var3 = kx4Var2;
                    o28Var3 = o28Var2;
                    j7 = j3;
                    i28 = i16;
                    mxVar3 = mxVar2;
                    j8 = j2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t78
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = w79.P(i4 | 1);
                            int iP2 = w79.P(i5);
                            u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i18 |= 196608;
            i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
            if (i24 != 0) {
                i18 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                if (lp2Var.h(gn2Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i18 |= i25;
            }
            if ((i5 & 12582912) != 0) {
                if ((i6 & 131072) == 0) {
                    i32 = 4194304;
                } else {
                    i32 = 4194304;
                }
                i18 |= i32;
            }
            z2 = true;
            if ((i11 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (lp2Var.N(i11 & 1, z3)) {
                lp2Var.S();
                if ((i4 & 1) != 0) {
                    if (i33 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    j9 = dw0.g;
                    if (i9 != 0) {
                        mxVar2 = null;
                    }
                    j10 = v88.c;
                    if (i12 != 0) {
                        o28Var2 = null;
                    }
                    if (i15 != 0) {
                        i16 = 1;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i3;
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i18 &= -29360129;
                        o88Var3 = (o88) lp2Var.j(a);
                    } else {
                        o88Var3 = o88Var;
                    }
                    i30 = i18;
                    j11 = j10;
                    i31 = i29;
                    j12 = j11;
                } else {
                    if (i33 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    j9 = dw0.g;
                    if (i9 != 0) {
                        mxVar2 = null;
                    }
                    j10 = v88.c;
                    if (i12 != 0) {
                        o28Var2 = null;
                    }
                    if (i15 != 0) {
                        i16 = 1;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i3;
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i18 &= -29360129;
                        o88Var3 = (o88) lp2Var.j(a);
                    } else {
                        o88Var3 = o88Var;
                    }
                    i30 = i18;
                    j11 = j10;
                    i31 = i29;
                    j12 = j11;
                }
                lp2Var.q();
                lp2Var.W(-565217106);
                if (j9 != 16) {
                    kx4Var4 = kx4Var4;
                    i16 = i16;
                    jB = j9;
                    z5 = false;
                } else {
                    lp2Var.W(-565216333);
                    jB = o88Var3.b();
                    if (jB != 16) {
                        jB = ((dw0) lp2Var.j(j41.a)).a;
                    }
                    z5 = false;
                    lp2Var.p(false);
                }
                lp2Var.p(z5);
                if (o28Var2 != null) {
                    r3 = o28Var2.a;
                } else {
                    r3 = z5;
                }
                long j11113 = j11;
                long j11114 = j12;
                o88 o88Var19 = o88Var3;
                int i31111114 = i30 << 6;
                kx4 kx4Var110 = kx4Var4;
                int i31111115 = i16;
                int i31111116 = i20;
                int i31111117 = i31;
                wl7.b(str2, kx4Var110, o88.e(o88Var19, jB, j10, j11113, r3 == true ? 1 : 0, j11114, 16609104), gn2Var3, i31111115, z2, i31111116, i31111117, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i31111114 & 57344) | (i31111114 & 458752) | (i31111114 & 3670016) | (i31111114 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                i27 = i31111116;
                i26 = i31111117;
                o88Var2 = o88Var19;
                o28Var3 = o28Var2;
                z4 = z2;
                gn2Var2 = gn2Var3;
                i28 = i31111115;
                j6 = j11114;
                mxVar3 = mxVar2;
                j8 = j10;
                kx4Var3 = kx4Var110;
                j5 = j9;
                j7 = j11113;
            } else {
                lp2Var.Q();
                j5 = j;
                j6 = j4;
                z4 = z;
                i26 = i3;
                gn2Var2 = gn2Var;
                o88Var2 = o88Var;
                i27 = i20;
                kx4Var3 = kx4Var2;
                o28Var3 = o28Var2;
                j7 = j3;
                i28 = i16;
                mxVar3 = mxVar2;
                j8 = j2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: t78
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = w79.P(i4 | 1);
                        int iP2 = w79.P(i5);
                        u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                        return dn8.a;
                    }
                };
            }
        }
        i7 |= 48;
        kx4Var2 = kx4Var;
        i8 = i7 | 384;
        i9 = i6 & 8;
        if (i9 != 0) {
            if ((i4 & 3072) == 0) {
                mxVar2 = mxVar;
                if (lp2Var.h(mxVar2)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i8 |= i10;
            }
            i11 = i8 | 920346624;
            i12 = i6 & 1024;
            if (i12 != 0) {
                i13 = i5 | 6;
                o28Var2 = o28Var;
            } else if ((i5 & 6) == 0) {
                o28Var2 = o28Var;
                i13 = (lp2Var.f(o28Var2) ? 4 : 2) | i5;
            } else {
                o28Var2 = o28Var;
                i13 = i5;
            }
            i14 = i13 | 48;
            i15 = i6 & 4096;
            if (i15 != 0) {
                if ((i5 & 384) == 0) {
                    i16 = i;
                    if (lp2Var.d(i16)) {
                        i17 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i17 = 128;
                    }
                    i14 |= i17;
                }
                i18 = i14 | 3072;
                i19 = i6 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i19 != 0) {
                    if ((i5 & 24576) == 0) {
                        i20 = i2;
                        if (lp2Var.d(i20)) {
                            i21 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i21 = 8192;
                        }
                        i18 |= i21;
                    }
                    i22 = i6 & 32768;
                    if (i22 != 0) {
                        if ((i5 & 196608) == 0) {
                            if (lp2Var.d(i3)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i18 |= i23;
                        }
                        i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                        if (i24 != 0) {
                            i18 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            if (lp2Var.h(gn2Var)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i18 |= i25;
                        }
                        if ((i5 & 12582912) != 0) {
                            if ((i6 & 131072) == 0) {
                                i32 = 4194304;
                            } else {
                                i32 = 4194304;
                            }
                            i18 |= i32;
                        }
                        z2 = true;
                        if ((i11 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (lp2Var.N(i11 & 1, z3)) {
                            lp2Var.S();
                            if ((i4 & 1) != 0) {
                                if (i33 != 0) {
                                    kx4Var4 = hx4.X;
                                } else {
                                    kx4Var4 = kx4Var2;
                                }
                                j9 = dw0.g;
                                if (i9 != 0) {
                                    mxVar2 = null;
                                }
                                j10 = v88.c;
                                if (i12 != 0) {
                                    o28Var2 = null;
                                }
                                if (i15 != 0) {
                                    i16 = 1;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                }
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i3;
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 131072) != 0) {
                                    i18 &= -29360129;
                                    o88Var3 = (o88) lp2Var.j(a);
                                } else {
                                    o88Var3 = o88Var;
                                }
                                i30 = i18;
                                j11 = j10;
                                i31 = i29;
                                j12 = j11;
                            } else {
                                if (i33 != 0) {
                                    kx4Var4 = hx4.X;
                                } else {
                                    kx4Var4 = kx4Var2;
                                }
                                j9 = dw0.g;
                                if (i9 != 0) {
                                    mxVar2 = null;
                                }
                                j10 = v88.c;
                                if (i12 != 0) {
                                    o28Var2 = null;
                                }
                                if (i15 != 0) {
                                    i16 = 1;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                }
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i3;
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 131072) != 0) {
                                    i18 &= -29360129;
                                    o88Var3 = (o88) lp2Var.j(a);
                                } else {
                                    o88Var3 = o88Var;
                                }
                                i30 = i18;
                                j11 = j10;
                                i31 = i29;
                                j12 = j11;
                            }
                            lp2Var.q();
                            lp2Var.W(-565217106);
                            if (j9 != 16) {
                                kx4Var4 = kx4Var4;
                                i16 = i16;
                                jB = j9;
                                z5 = false;
                            } else {
                                lp2Var.W(-565216333);
                                jB = o88Var3.b();
                                if (jB != 16) {
                                    jB = ((dw0) lp2Var.j(j41.a)).a;
                                }
                                z5 = false;
                                lp2Var.p(false);
                            }
                            lp2Var.p(z5);
                            if (o28Var2 != null) {
                                r3 = o28Var2.a;
                            } else {
                                r3 = z5;
                            }
                            long j11115 = j11;
                            long j11116 = j12;
                            o88 o88Var110 = o88Var3;
                            int i31111118 = i30 << 6;
                            kx4 kx4Var111 = kx4Var4;
                            int i31111119 = i16;
                            int i311111110 = i20;
                            int i311111111 = i31;
                            wl7.b(str2, kx4Var111, o88.e(o88Var110, jB, j10, j11115, r3 == true ? 1 : 0, j11116, 16609104), gn2Var3, i31111119, z2, i311111110, i311111111, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i31111118 & 57344) | (i31111118 & 458752) | (i31111118 & 3670016) | (i31111118 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                            i27 = i311111110;
                            i26 = i311111111;
                            o88Var2 = o88Var110;
                            o28Var3 = o28Var2;
                            z4 = z2;
                            gn2Var2 = gn2Var3;
                            i28 = i31111119;
                            j6 = j11116;
                            mxVar3 = mxVar2;
                            j8 = j10;
                            kx4Var3 = kx4Var111;
                            j5 = j9;
                            j7 = j11115;
                        } else {
                            lp2Var.Q();
                            j5 = j;
                            j6 = j4;
                            z4 = z;
                            i26 = i3;
                            gn2Var2 = gn2Var;
                            o88Var2 = o88Var;
                            i27 = i20;
                            kx4Var3 = kx4Var2;
                            o28Var3 = o28Var2;
                            j7 = j3;
                            i28 = i16;
                            mxVar3 = mxVar2;
                            j8 = j2;
                        }
                        j86VarR = lp2Var.r();
                        if (j86VarR != null) {
                            j86VarR.d = new rn2() { // from class: t78
                                @Override // defpackage.rn2
                                public final Object K(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = w79.P(i4 | 1);
                                    int iP2 = w79.P(i5);
                                    u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                    return dn8.a;
                                }
                            };
                        }
                    }
                    i18 |= 196608;
                    i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                    if (i24 != 0) {
                        i18 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i18 |= i25;
                    }
                    if ((i5 & 12582912) != 0) {
                        if ((i6 & 131072) == 0) {
                            i32 = 4194304;
                        } else {
                            i32 = 4194304;
                        }
                        i18 |= i32;
                    }
                    z2 = true;
                    if ((i11 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i11 & 1, z3)) {
                        lp2Var.S();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        } else {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        }
                        lp2Var.q();
                        lp2Var.W(-565217106);
                        if (j9 != 16) {
                            kx4Var4 = kx4Var4;
                            i16 = i16;
                            jB = j9;
                            z5 = false;
                        } else {
                            lp2Var.W(-565216333);
                            jB = o88Var3.b();
                            if (jB != 16) {
                                jB = ((dw0) lp2Var.j(j41.a)).a;
                            }
                            z5 = false;
                            lp2Var.p(false);
                        }
                        lp2Var.p(z5);
                        if (o28Var2 != null) {
                            r3 = o28Var2.a;
                        } else {
                            r3 = z5;
                        }
                        long j11117 = j11;
                        long j11118 = j12;
                        o88 o88Var111 = o88Var3;
                        int i311111112 = i30 << 6;
                        kx4 kx4Var112 = kx4Var4;
                        int i311111113 = i16;
                        int i311111114 = i20;
                        int i311111115 = i31;
                        wl7.b(str2, kx4Var112, o88.e(o88Var111, jB, j10, j11117, r3 == true ? 1 : 0, j11118, 16609104), gn2Var3, i311111113, z2, i311111114, i311111115, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i311111112 & 57344) | (i311111112 & 458752) | (i311111112 & 3670016) | (i311111112 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        i27 = i311111114;
                        i26 = i311111115;
                        o88Var2 = o88Var111;
                        o28Var3 = o28Var2;
                        z4 = z2;
                        gn2Var2 = gn2Var3;
                        i28 = i311111113;
                        j6 = j11118;
                        mxVar3 = mxVar2;
                        j8 = j10;
                        kx4Var3 = kx4Var112;
                        j5 = j9;
                        j7 = j11117;
                    } else {
                        lp2Var.Q();
                        j5 = j;
                        j6 = j4;
                        z4 = z;
                        i26 = i3;
                        gn2Var2 = gn2Var;
                        o88Var2 = o88Var;
                        i27 = i20;
                        kx4Var3 = kx4Var2;
                        o28Var3 = o28Var2;
                        j7 = j3;
                        i28 = i16;
                        mxVar3 = mxVar2;
                        j8 = j2;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: t78
                            @Override // defpackage.rn2
                            public final Object K(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = w79.P(i4 | 1);
                                int iP2 = w79.P(i5);
                                u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i18 = i14 | 27648;
                i20 = i2;
                i22 = i6 & 32768;
                if (i22 != 0) {
                    if ((i5 & 196608) == 0) {
                        if (lp2Var.d(i3)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i18 |= i23;
                    }
                    i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                    if (i24 != 0) {
                        i18 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i18 |= i25;
                    }
                    if ((i5 & 12582912) != 0) {
                        if ((i6 & 131072) == 0) {
                            i32 = 4194304;
                        } else {
                            i32 = 4194304;
                        }
                        i18 |= i32;
                    }
                    z2 = true;
                    if ((i11 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i11 & 1, z3)) {
                        lp2Var.S();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        } else {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        }
                        lp2Var.q();
                        lp2Var.W(-565217106);
                        if (j9 != 16) {
                            kx4Var4 = kx4Var4;
                            i16 = i16;
                            jB = j9;
                            z5 = false;
                        } else {
                            lp2Var.W(-565216333);
                            jB = o88Var3.b();
                            if (jB != 16) {
                                jB = ((dw0) lp2Var.j(j41.a)).a;
                            }
                            z5 = false;
                            lp2Var.p(false);
                        }
                        lp2Var.p(z5);
                        if (o28Var2 != null) {
                            r3 = o28Var2.a;
                        } else {
                            r3 = z5;
                        }
                        long j11119 = j11;
                        long j111110 = j12;
                        o88 o88Var112 = o88Var3;
                        int i311111116 = i30 << 6;
                        kx4 kx4Var113 = kx4Var4;
                        int i311111117 = i16;
                        int i311111118 = i20;
                        int i311111119 = i31;
                        wl7.b(str2, kx4Var113, o88.e(o88Var112, jB, j10, j11119, r3 == true ? 1 : 0, j111110, 16609104), gn2Var3, i311111117, z2, i311111118, i311111119, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i311111116 & 57344) | (i311111116 & 458752) | (i311111116 & 3670016) | (i311111116 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        i27 = i311111118;
                        i26 = i311111119;
                        o88Var2 = o88Var112;
                        o28Var3 = o28Var2;
                        z4 = z2;
                        gn2Var2 = gn2Var3;
                        i28 = i311111117;
                        j6 = j111110;
                        mxVar3 = mxVar2;
                        j8 = j10;
                        kx4Var3 = kx4Var113;
                        j5 = j9;
                        j7 = j11119;
                    } else {
                        lp2Var.Q();
                        j5 = j;
                        j6 = j4;
                        z4 = z;
                        i26 = i3;
                        gn2Var2 = gn2Var;
                        o88Var2 = o88Var;
                        i27 = i20;
                        kx4Var3 = kx4Var2;
                        o28Var3 = o28Var2;
                        j7 = j3;
                        i28 = i16;
                        mxVar3 = mxVar2;
                        j8 = j2;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: t78
                            @Override // defpackage.rn2
                            public final Object K(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = w79.P(i4 | 1);
                                int iP2 = w79.P(i5);
                                u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i18 |= 196608;
                i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i24 != 0) {
                    i18 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i18 |= i25;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i32 = 4194304;
                    } else {
                        i32 = 4194304;
                    }
                    i18 |= i32;
                }
                z2 = true;
                if ((i11 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i11 & 1, z3)) {
                    lp2Var.S();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    } else {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    }
                    lp2Var.q();
                    lp2Var.W(-565217106);
                    if (j9 != 16) {
                        kx4Var4 = kx4Var4;
                        i16 = i16;
                        jB = j9;
                        z5 = false;
                    } else {
                        lp2Var.W(-565216333);
                        jB = o88Var3.b();
                        if (jB != 16) {
                            jB = ((dw0) lp2Var.j(j41.a)).a;
                        }
                        z5 = false;
                        lp2Var.p(false);
                    }
                    lp2Var.p(z5);
                    if (o28Var2 != null) {
                        r3 = o28Var2.a;
                    } else {
                        r3 = z5;
                    }
                    long j111111 = j11;
                    long j111112 = j12;
                    o88 o88Var113 = o88Var3;
                    int i3111111110 = i30 << 6;
                    kx4 kx4Var114 = kx4Var4;
                    int i3111111111 = i16;
                    int i3111111112 = i20;
                    int i3111111113 = i31;
                    wl7.b(str2, kx4Var114, o88.e(o88Var113, jB, j10, j111111, r3 == true ? 1 : 0, j111112, 16609104), gn2Var3, i3111111111, z2, i3111111112, i3111111113, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i3111111110 & 57344) | (i3111111110 & 458752) | (i3111111110 & 3670016) | (i3111111110 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    i27 = i3111111112;
                    i26 = i3111111113;
                    o88Var2 = o88Var113;
                    o28Var3 = o28Var2;
                    z4 = z2;
                    gn2Var2 = gn2Var3;
                    i28 = i3111111111;
                    j6 = j111112;
                    mxVar3 = mxVar2;
                    j8 = j10;
                    kx4Var3 = kx4Var114;
                    j5 = j9;
                    j7 = j111111;
                } else {
                    lp2Var.Q();
                    j5 = j;
                    j6 = j4;
                    z4 = z;
                    i26 = i3;
                    gn2Var2 = gn2Var;
                    o88Var2 = o88Var;
                    i27 = i20;
                    kx4Var3 = kx4Var2;
                    o28Var3 = o28Var2;
                    j7 = j3;
                    i28 = i16;
                    mxVar3 = mxVar2;
                    j8 = j2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t78
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = w79.P(i4 | 1);
                            int iP2 = w79.P(i5);
                            u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i14 = i13 | 432;
            i16 = i;
            i18 = i14 | 3072;
            i19 = i6 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i19 != 0) {
                if ((i5 & 24576) == 0) {
                    i20 = i2;
                    if (lp2Var.d(i20)) {
                        i21 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i21 = 8192;
                    }
                    i18 |= i21;
                }
                i22 = i6 & 32768;
                if (i22 != 0) {
                    if ((i5 & 196608) == 0) {
                        if (lp2Var.d(i3)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i18 |= i23;
                    }
                    i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                    if (i24 != 0) {
                        i18 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i18 |= i25;
                    }
                    if ((i5 & 12582912) != 0) {
                        if ((i6 & 131072) == 0) {
                            i32 = 4194304;
                        } else {
                            i32 = 4194304;
                        }
                        i18 |= i32;
                    }
                    z2 = true;
                    if ((i11 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i11 & 1, z3)) {
                        lp2Var.S();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        } else {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        }
                        lp2Var.q();
                        lp2Var.W(-565217106);
                        if (j9 != 16) {
                            kx4Var4 = kx4Var4;
                            i16 = i16;
                            jB = j9;
                            z5 = false;
                        } else {
                            lp2Var.W(-565216333);
                            jB = o88Var3.b();
                            if (jB != 16) {
                                jB = ((dw0) lp2Var.j(j41.a)).a;
                            }
                            z5 = false;
                            lp2Var.p(false);
                        }
                        lp2Var.p(z5);
                        if (o28Var2 != null) {
                            r3 = o28Var2.a;
                        } else {
                            r3 = z5;
                        }
                        long j111113 = j11;
                        long j111114 = j12;
                        o88 o88Var114 = o88Var3;
                        int i3111111114 = i30 << 6;
                        kx4 kx4Var115 = kx4Var4;
                        int i3111111115 = i16;
                        int i3111111116 = i20;
                        int i3111111117 = i31;
                        wl7.b(str2, kx4Var115, o88.e(o88Var114, jB, j10, j111113, r3 == true ? 1 : 0, j111114, 16609104), gn2Var3, i3111111115, z2, i3111111116, i3111111117, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i3111111114 & 57344) | (i3111111114 & 458752) | (i3111111114 & 3670016) | (i3111111114 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        i27 = i3111111116;
                        i26 = i3111111117;
                        o88Var2 = o88Var114;
                        o28Var3 = o28Var2;
                        z4 = z2;
                        gn2Var2 = gn2Var3;
                        i28 = i3111111115;
                        j6 = j111114;
                        mxVar3 = mxVar2;
                        j8 = j10;
                        kx4Var3 = kx4Var115;
                        j5 = j9;
                        j7 = j111113;
                    } else {
                        lp2Var.Q();
                        j5 = j;
                        j6 = j4;
                        z4 = z;
                        i26 = i3;
                        gn2Var2 = gn2Var;
                        o88Var2 = o88Var;
                        i27 = i20;
                        kx4Var3 = kx4Var2;
                        o28Var3 = o28Var2;
                        j7 = j3;
                        i28 = i16;
                        mxVar3 = mxVar2;
                        j8 = j2;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: t78
                            @Override // defpackage.rn2
                            public final Object K(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = w79.P(i4 | 1);
                                int iP2 = w79.P(i5);
                                u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i18 |= 196608;
                i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i24 != 0) {
                    i18 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i18 |= i25;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i32 = 4194304;
                    } else {
                        i32 = 4194304;
                    }
                    i18 |= i32;
                }
                z2 = true;
                if ((i11 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i11 & 1, z3)) {
                    lp2Var.S();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    } else {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    }
                    lp2Var.q();
                    lp2Var.W(-565217106);
                    if (j9 != 16) {
                        kx4Var4 = kx4Var4;
                        i16 = i16;
                        jB = j9;
                        z5 = false;
                    } else {
                        lp2Var.W(-565216333);
                        jB = o88Var3.b();
                        if (jB != 16) {
                            jB = ((dw0) lp2Var.j(j41.a)).a;
                        }
                        z5 = false;
                        lp2Var.p(false);
                    }
                    lp2Var.p(z5);
                    if (o28Var2 != null) {
                        r3 = o28Var2.a;
                    } else {
                        r3 = z5;
                    }
                    long j111115 = j11;
                    long j111116 = j12;
                    o88 o88Var115 = o88Var3;
                    int i3111111118 = i30 << 6;
                    kx4 kx4Var116 = kx4Var4;
                    int i3111111119 = i16;
                    int i31111111110 = i20;
                    int i31111111111 = i31;
                    wl7.b(str2, kx4Var116, o88.e(o88Var115, jB, j10, j111115, r3 == true ? 1 : 0, j111116, 16609104), gn2Var3, i3111111119, z2, i31111111110, i31111111111, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i3111111118 & 57344) | (i3111111118 & 458752) | (i3111111118 & 3670016) | (i3111111118 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    i27 = i31111111110;
                    i26 = i31111111111;
                    o88Var2 = o88Var115;
                    o28Var3 = o28Var2;
                    z4 = z2;
                    gn2Var2 = gn2Var3;
                    i28 = i3111111119;
                    j6 = j111116;
                    mxVar3 = mxVar2;
                    j8 = j10;
                    kx4Var3 = kx4Var116;
                    j5 = j9;
                    j7 = j111115;
                } else {
                    lp2Var.Q();
                    j5 = j;
                    j6 = j4;
                    z4 = z;
                    i26 = i3;
                    gn2Var2 = gn2Var;
                    o88Var2 = o88Var;
                    i27 = i20;
                    kx4Var3 = kx4Var2;
                    o28Var3 = o28Var2;
                    j7 = j3;
                    i28 = i16;
                    mxVar3 = mxVar2;
                    j8 = j2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t78
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = w79.P(i4 | 1);
                            int iP2 = w79.P(i5);
                            u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i18 = i14 | 27648;
            i20 = i2;
            i22 = i6 & 32768;
            if (i22 != 0) {
                if ((i5 & 196608) == 0) {
                    if (lp2Var.d(i3)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i18 |= i23;
                }
                i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i24 != 0) {
                    i18 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i18 |= i25;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i32 = 4194304;
                    } else {
                        i32 = 4194304;
                    }
                    i18 |= i32;
                }
                z2 = true;
                if ((i11 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i11 & 1, z3)) {
                    lp2Var.S();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    } else {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    }
                    lp2Var.q();
                    lp2Var.W(-565217106);
                    if (j9 != 16) {
                        kx4Var4 = kx4Var4;
                        i16 = i16;
                        jB = j9;
                        z5 = false;
                    } else {
                        lp2Var.W(-565216333);
                        jB = o88Var3.b();
                        if (jB != 16) {
                            jB = ((dw0) lp2Var.j(j41.a)).a;
                        }
                        z5 = false;
                        lp2Var.p(false);
                    }
                    lp2Var.p(z5);
                    if (o28Var2 != null) {
                        r3 = o28Var2.a;
                    } else {
                        r3 = z5;
                    }
                    long j111117 = j11;
                    long j111118 = j12;
                    o88 o88Var116 = o88Var3;
                    int i31111111112 = i30 << 6;
                    kx4 kx4Var117 = kx4Var4;
                    int i31111111113 = i16;
                    int i31111111114 = i20;
                    int i31111111115 = i31;
                    wl7.b(str2, kx4Var117, o88.e(o88Var116, jB, j10, j111117, r3 == true ? 1 : 0, j111118, 16609104), gn2Var3, i31111111113, z2, i31111111114, i31111111115, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i31111111112 & 57344) | (i31111111112 & 458752) | (i31111111112 & 3670016) | (i31111111112 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    i27 = i31111111114;
                    i26 = i31111111115;
                    o88Var2 = o88Var116;
                    o28Var3 = o28Var2;
                    z4 = z2;
                    gn2Var2 = gn2Var3;
                    i28 = i31111111113;
                    j6 = j111118;
                    mxVar3 = mxVar2;
                    j8 = j10;
                    kx4Var3 = kx4Var117;
                    j5 = j9;
                    j7 = j111117;
                } else {
                    lp2Var.Q();
                    j5 = j;
                    j6 = j4;
                    z4 = z;
                    i26 = i3;
                    gn2Var2 = gn2Var;
                    o88Var2 = o88Var;
                    i27 = i20;
                    kx4Var3 = kx4Var2;
                    o28Var3 = o28Var2;
                    j7 = j3;
                    i28 = i16;
                    mxVar3 = mxVar2;
                    j8 = j2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t78
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = w79.P(i4 | 1);
                            int iP2 = w79.P(i5);
                            u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i18 |= 196608;
            i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
            if (i24 != 0) {
                i18 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                if (lp2Var.h(gn2Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i18 |= i25;
            }
            if ((i5 & 12582912) != 0) {
                if ((i6 & 131072) == 0) {
                    i32 = 4194304;
                } else {
                    i32 = 4194304;
                }
                i18 |= i32;
            }
            z2 = true;
            if ((i11 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (lp2Var.N(i11 & 1, z3)) {
                lp2Var.S();
                if ((i4 & 1) != 0) {
                    if (i33 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    j9 = dw0.g;
                    if (i9 != 0) {
                        mxVar2 = null;
                    }
                    j10 = v88.c;
                    if (i12 != 0) {
                        o28Var2 = null;
                    }
                    if (i15 != 0) {
                        i16 = 1;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i3;
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i18 &= -29360129;
                        o88Var3 = (o88) lp2Var.j(a);
                    } else {
                        o88Var3 = o88Var;
                    }
                    i30 = i18;
                    j11 = j10;
                    i31 = i29;
                    j12 = j11;
                } else {
                    if (i33 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    j9 = dw0.g;
                    if (i9 != 0) {
                        mxVar2 = null;
                    }
                    j10 = v88.c;
                    if (i12 != 0) {
                        o28Var2 = null;
                    }
                    if (i15 != 0) {
                        i16 = 1;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i3;
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i18 &= -29360129;
                        o88Var3 = (o88) lp2Var.j(a);
                    } else {
                        o88Var3 = o88Var;
                    }
                    i30 = i18;
                    j11 = j10;
                    i31 = i29;
                    j12 = j11;
                }
                lp2Var.q();
                lp2Var.W(-565217106);
                if (j9 != 16) {
                    kx4Var4 = kx4Var4;
                    i16 = i16;
                    jB = j9;
                    z5 = false;
                } else {
                    lp2Var.W(-565216333);
                    jB = o88Var3.b();
                    if (jB != 16) {
                        jB = ((dw0) lp2Var.j(j41.a)).a;
                    }
                    z5 = false;
                    lp2Var.p(false);
                }
                lp2Var.p(z5);
                if (o28Var2 != null) {
                    r3 = o28Var2.a;
                } else {
                    r3 = z5;
                }
                long j111119 = j11;
                long j1111110 = j12;
                o88 o88Var117 = o88Var3;
                int i31111111116 = i30 << 6;
                kx4 kx4Var118 = kx4Var4;
                int i31111111117 = i16;
                int i31111111118 = i20;
                int i31111111119 = i31;
                wl7.b(str2, kx4Var118, o88.e(o88Var117, jB, j10, j111119, r3 == true ? 1 : 0, j1111110, 16609104), gn2Var3, i31111111117, z2, i31111111118, i31111111119, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i31111111116 & 57344) | (i31111111116 & 458752) | (i31111111116 & 3670016) | (i31111111116 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                i27 = i31111111118;
                i26 = i31111111119;
                o88Var2 = o88Var117;
                o28Var3 = o28Var2;
                z4 = z2;
                gn2Var2 = gn2Var3;
                i28 = i31111111117;
                j6 = j1111110;
                mxVar3 = mxVar2;
                j8 = j10;
                kx4Var3 = kx4Var118;
                j5 = j9;
                j7 = j111119;
            } else {
                lp2Var.Q();
                j5 = j;
                j6 = j4;
                z4 = z;
                i26 = i3;
                gn2Var2 = gn2Var;
                o88Var2 = o88Var;
                i27 = i20;
                kx4Var3 = kx4Var2;
                o28Var3 = o28Var2;
                j7 = j3;
                i28 = i16;
                mxVar3 = mxVar2;
                j8 = j2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: t78
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = w79.P(i4 | 1);
                        int iP2 = w79.P(i5);
                        u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                        return dn8.a;
                    }
                };
            }
        }
        i8 = i7 | 3456;
        mxVar2 = mxVar;
        i11 = i8 | 920346624;
        i12 = i6 & 1024;
        if (i12 != 0) {
            i13 = i5 | 6;
            o28Var2 = o28Var;
        } else if ((i5 & 6) == 0) {
            o28Var2 = o28Var;
            i13 = (lp2Var.f(o28Var2) ? 4 : 2) | i5;
        } else {
            o28Var2 = o28Var;
            i13 = i5;
        }
        i14 = i13 | 48;
        i15 = i6 & 4096;
        if (i15 != 0) {
            if ((i5 & 384) == 0) {
                i16 = i;
                if (lp2Var.d(i16)) {
                    i17 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i17 = 128;
                }
                i14 |= i17;
            }
            i18 = i14 | 3072;
            i19 = i6 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i19 != 0) {
                if ((i5 & 24576) == 0) {
                    i20 = i2;
                    if (lp2Var.d(i20)) {
                        i21 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i21 = 8192;
                    }
                    i18 |= i21;
                }
                i22 = i6 & 32768;
                if (i22 != 0) {
                    if ((i5 & 196608) == 0) {
                        if (lp2Var.d(i3)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i18 |= i23;
                    }
                    i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                    if (i24 != 0) {
                        i18 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i18 |= i25;
                    }
                    if ((i5 & 12582912) != 0) {
                        if ((i6 & 131072) == 0) {
                            i32 = 4194304;
                        } else {
                            i32 = 4194304;
                        }
                        i18 |= i32;
                    }
                    z2 = true;
                    if ((i11 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i11 & 1, z3)) {
                        lp2Var.S();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        } else {
                            if (i33 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            j9 = dw0.g;
                            if (i9 != 0) {
                                mxVar2 = null;
                            }
                            j10 = v88.c;
                            if (i12 != 0) {
                                o28Var2 = null;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i3;
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 131072) != 0) {
                                i18 &= -29360129;
                                o88Var3 = (o88) lp2Var.j(a);
                            } else {
                                o88Var3 = o88Var;
                            }
                            i30 = i18;
                            j11 = j10;
                            i31 = i29;
                            j12 = j11;
                        }
                        lp2Var.q();
                        lp2Var.W(-565217106);
                        if (j9 != 16) {
                            kx4Var4 = kx4Var4;
                            i16 = i16;
                            jB = j9;
                            z5 = false;
                        } else {
                            lp2Var.W(-565216333);
                            jB = o88Var3.b();
                            if (jB != 16) {
                                jB = ((dw0) lp2Var.j(j41.a)).a;
                            }
                            z5 = false;
                            lp2Var.p(false);
                        }
                        lp2Var.p(z5);
                        if (o28Var2 != null) {
                            r3 = o28Var2.a;
                        } else {
                            r3 = z5;
                        }
                        long j1111111 = j11;
                        long j1111112 = j12;
                        o88 o88Var118 = o88Var3;
                        int i311111111110 = i30 << 6;
                        kx4 kx4Var119 = kx4Var4;
                        int i311111111111 = i16;
                        int i311111111112 = i20;
                        int i311111111113 = i31;
                        wl7.b(str2, kx4Var119, o88.e(o88Var118, jB, j10, j1111111, r3 == true ? 1 : 0, j1111112, 16609104), gn2Var3, i311111111111, z2, i311111111112, i311111111113, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i311111111110 & 57344) | (i311111111110 & 458752) | (i311111111110 & 3670016) | (i311111111110 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        i27 = i311111111112;
                        i26 = i311111111113;
                        o88Var2 = o88Var118;
                        o28Var3 = o28Var2;
                        z4 = z2;
                        gn2Var2 = gn2Var3;
                        i28 = i311111111111;
                        j6 = j1111112;
                        mxVar3 = mxVar2;
                        j8 = j10;
                        kx4Var3 = kx4Var119;
                        j5 = j9;
                        j7 = j1111111;
                    } else {
                        lp2Var.Q();
                        j5 = j;
                        j6 = j4;
                        z4 = z;
                        i26 = i3;
                        gn2Var2 = gn2Var;
                        o88Var2 = o88Var;
                        i27 = i20;
                        kx4Var3 = kx4Var2;
                        o28Var3 = o28Var2;
                        j7 = j3;
                        i28 = i16;
                        mxVar3 = mxVar2;
                        j8 = j2;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: t78
                            @Override // defpackage.rn2
                            public final Object K(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = w79.P(i4 | 1);
                                int iP2 = w79.P(i5);
                                u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i18 |= 196608;
                i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i24 != 0) {
                    i18 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i18 |= i25;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i32 = 4194304;
                    } else {
                        i32 = 4194304;
                    }
                    i18 |= i32;
                }
                z2 = true;
                if ((i11 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i11 & 1, z3)) {
                    lp2Var.S();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    } else {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    }
                    lp2Var.q();
                    lp2Var.W(-565217106);
                    if (j9 != 16) {
                        kx4Var4 = kx4Var4;
                        i16 = i16;
                        jB = j9;
                        z5 = false;
                    } else {
                        lp2Var.W(-565216333);
                        jB = o88Var3.b();
                        if (jB != 16) {
                            jB = ((dw0) lp2Var.j(j41.a)).a;
                        }
                        z5 = false;
                        lp2Var.p(false);
                    }
                    lp2Var.p(z5);
                    if (o28Var2 != null) {
                        r3 = o28Var2.a;
                    } else {
                        r3 = z5;
                    }
                    long j1111113 = j11;
                    long j1111114 = j12;
                    o88 o88Var119 = o88Var3;
                    int i311111111114 = i30 << 6;
                    kx4 kx4Var1110 = kx4Var4;
                    int i311111111115 = i16;
                    int i311111111116 = i20;
                    int i311111111117 = i31;
                    wl7.b(str2, kx4Var1110, o88.e(o88Var119, jB, j10, j1111113, r3 == true ? 1 : 0, j1111114, 16609104), gn2Var3, i311111111115, z2, i311111111116, i311111111117, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i311111111114 & 57344) | (i311111111114 & 458752) | (i311111111114 & 3670016) | (i311111111114 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    i27 = i311111111116;
                    i26 = i311111111117;
                    o88Var2 = o88Var119;
                    o28Var3 = o28Var2;
                    z4 = z2;
                    gn2Var2 = gn2Var3;
                    i28 = i311111111115;
                    j6 = j1111114;
                    mxVar3 = mxVar2;
                    j8 = j10;
                    kx4Var3 = kx4Var1110;
                    j5 = j9;
                    j7 = j1111113;
                } else {
                    lp2Var.Q();
                    j5 = j;
                    j6 = j4;
                    z4 = z;
                    i26 = i3;
                    gn2Var2 = gn2Var;
                    o88Var2 = o88Var;
                    i27 = i20;
                    kx4Var3 = kx4Var2;
                    o28Var3 = o28Var2;
                    j7 = j3;
                    i28 = i16;
                    mxVar3 = mxVar2;
                    j8 = j2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t78
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = w79.P(i4 | 1);
                            int iP2 = w79.P(i5);
                            u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i18 = i14 | 27648;
            i20 = i2;
            i22 = i6 & 32768;
            if (i22 != 0) {
                if ((i5 & 196608) == 0) {
                    if (lp2Var.d(i3)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i18 |= i23;
                }
                i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i24 != 0) {
                    i18 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i18 |= i25;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i32 = 4194304;
                    } else {
                        i32 = 4194304;
                    }
                    i18 |= i32;
                }
                z2 = true;
                if ((i11 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i11 & 1, z3)) {
                    lp2Var.S();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    } else {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    }
                    lp2Var.q();
                    lp2Var.W(-565217106);
                    if (j9 != 16) {
                        kx4Var4 = kx4Var4;
                        i16 = i16;
                        jB = j9;
                        z5 = false;
                    } else {
                        lp2Var.W(-565216333);
                        jB = o88Var3.b();
                        if (jB != 16) {
                            jB = ((dw0) lp2Var.j(j41.a)).a;
                        }
                        z5 = false;
                        lp2Var.p(false);
                    }
                    lp2Var.p(z5);
                    if (o28Var2 != null) {
                        r3 = o28Var2.a;
                    } else {
                        r3 = z5;
                    }
                    long j1111115 = j11;
                    long j1111116 = j12;
                    o88 o88Var1110 = o88Var3;
                    int i311111111118 = i30 << 6;
                    kx4 kx4Var1111 = kx4Var4;
                    int i311111111119 = i16;
                    int i3111111111110 = i20;
                    int i3111111111111 = i31;
                    wl7.b(str2, kx4Var1111, o88.e(o88Var1110, jB, j10, j1111115, r3 == true ? 1 : 0, j1111116, 16609104), gn2Var3, i311111111119, z2, i3111111111110, i3111111111111, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i311111111118 & 57344) | (i311111111118 & 458752) | (i311111111118 & 3670016) | (i311111111118 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    i27 = i3111111111110;
                    i26 = i3111111111111;
                    o88Var2 = o88Var1110;
                    o28Var3 = o28Var2;
                    z4 = z2;
                    gn2Var2 = gn2Var3;
                    i28 = i311111111119;
                    j6 = j1111116;
                    mxVar3 = mxVar2;
                    j8 = j10;
                    kx4Var3 = kx4Var1111;
                    j5 = j9;
                    j7 = j1111115;
                } else {
                    lp2Var.Q();
                    j5 = j;
                    j6 = j4;
                    z4 = z;
                    i26 = i3;
                    gn2Var2 = gn2Var;
                    o88Var2 = o88Var;
                    i27 = i20;
                    kx4Var3 = kx4Var2;
                    o28Var3 = o28Var2;
                    j7 = j3;
                    i28 = i16;
                    mxVar3 = mxVar2;
                    j8 = j2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t78
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = w79.P(i4 | 1);
                            int iP2 = w79.P(i5);
                            u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i18 |= 196608;
            i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
            if (i24 != 0) {
                i18 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                if (lp2Var.h(gn2Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i18 |= i25;
            }
            if ((i5 & 12582912) != 0) {
                if ((i6 & 131072) == 0) {
                    i32 = 4194304;
                } else {
                    i32 = 4194304;
                }
                i18 |= i32;
            }
            z2 = true;
            if ((i11 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (lp2Var.N(i11 & 1, z3)) {
                lp2Var.S();
                if ((i4 & 1) != 0) {
                    if (i33 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    j9 = dw0.g;
                    if (i9 != 0) {
                        mxVar2 = null;
                    }
                    j10 = v88.c;
                    if (i12 != 0) {
                        o28Var2 = null;
                    }
                    if (i15 != 0) {
                        i16 = 1;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i3;
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i18 &= -29360129;
                        o88Var3 = (o88) lp2Var.j(a);
                    } else {
                        o88Var3 = o88Var;
                    }
                    i30 = i18;
                    j11 = j10;
                    i31 = i29;
                    j12 = j11;
                } else {
                    if (i33 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    j9 = dw0.g;
                    if (i9 != 0) {
                        mxVar2 = null;
                    }
                    j10 = v88.c;
                    if (i12 != 0) {
                        o28Var2 = null;
                    }
                    if (i15 != 0) {
                        i16 = 1;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i3;
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i18 &= -29360129;
                        o88Var3 = (o88) lp2Var.j(a);
                    } else {
                        o88Var3 = o88Var;
                    }
                    i30 = i18;
                    j11 = j10;
                    i31 = i29;
                    j12 = j11;
                }
                lp2Var.q();
                lp2Var.W(-565217106);
                if (j9 != 16) {
                    kx4Var4 = kx4Var4;
                    i16 = i16;
                    jB = j9;
                    z5 = false;
                } else {
                    lp2Var.W(-565216333);
                    jB = o88Var3.b();
                    if (jB != 16) {
                        jB = ((dw0) lp2Var.j(j41.a)).a;
                    }
                    z5 = false;
                    lp2Var.p(false);
                }
                lp2Var.p(z5);
                if (o28Var2 != null) {
                    r3 = o28Var2.a;
                } else {
                    r3 = z5;
                }
                long j1111117 = j11;
                long j1111118 = j12;
                o88 o88Var1111 = o88Var3;
                int i3111111111112 = i30 << 6;
                kx4 kx4Var1112 = kx4Var4;
                int i3111111111113 = i16;
                int i3111111111114 = i20;
                int i3111111111115 = i31;
                wl7.b(str2, kx4Var1112, o88.e(o88Var1111, jB, j10, j1111117, r3 == true ? 1 : 0, j1111118, 16609104), gn2Var3, i3111111111113, z2, i3111111111114, i3111111111115, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i3111111111112 & 57344) | (i3111111111112 & 458752) | (i3111111111112 & 3670016) | (i3111111111112 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                i27 = i3111111111114;
                i26 = i3111111111115;
                o88Var2 = o88Var1111;
                o28Var3 = o28Var2;
                z4 = z2;
                gn2Var2 = gn2Var3;
                i28 = i3111111111113;
                j6 = j1111118;
                mxVar3 = mxVar2;
                j8 = j10;
                kx4Var3 = kx4Var1112;
                j5 = j9;
                j7 = j1111117;
            } else {
                lp2Var.Q();
                j5 = j;
                j6 = j4;
                z4 = z;
                i26 = i3;
                gn2Var2 = gn2Var;
                o88Var2 = o88Var;
                i27 = i20;
                kx4Var3 = kx4Var2;
                o28Var3 = o28Var2;
                j7 = j3;
                i28 = i16;
                mxVar3 = mxVar2;
                j8 = j2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: t78
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = w79.P(i4 | 1);
                        int iP2 = w79.P(i5);
                        u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                        return dn8.a;
                    }
                };
            }
        }
        i14 = i13 | 432;
        i16 = i;
        i18 = i14 | 3072;
        i19 = i6 & Http2.INITIAL_MAX_FRAME_SIZE;
        if (i19 != 0) {
            if ((i5 & 24576) == 0) {
                i20 = i2;
                if (lp2Var.d(i20)) {
                    i21 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i21 = 8192;
                }
                i18 |= i21;
            }
            i22 = i6 & 32768;
            if (i22 != 0) {
                if ((i5 & 196608) == 0) {
                    if (lp2Var.d(i3)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i18 |= i23;
                }
                i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i24 != 0) {
                    i18 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i18 |= i25;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i32 = 4194304;
                    } else {
                        i32 = 4194304;
                    }
                    i18 |= i32;
                }
                z2 = true;
                if ((i11 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i11 & 1, z3)) {
                    lp2Var.S();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    } else {
                        if (i33 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        j9 = dw0.g;
                        if (i9 != 0) {
                            mxVar2 = null;
                        }
                        j10 = v88.c;
                        if (i12 != 0) {
                            o28Var2 = null;
                        }
                        if (i15 != 0) {
                            i16 = 1;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i3;
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                            o88Var3 = (o88) lp2Var.j(a);
                        } else {
                            o88Var3 = o88Var;
                        }
                        i30 = i18;
                        j11 = j10;
                        i31 = i29;
                        j12 = j11;
                    }
                    lp2Var.q();
                    lp2Var.W(-565217106);
                    if (j9 != 16) {
                        kx4Var4 = kx4Var4;
                        i16 = i16;
                        jB = j9;
                        z5 = false;
                    } else {
                        lp2Var.W(-565216333);
                        jB = o88Var3.b();
                        if (jB != 16) {
                            jB = ((dw0) lp2Var.j(j41.a)).a;
                        }
                        z5 = false;
                        lp2Var.p(false);
                    }
                    lp2Var.p(z5);
                    if (o28Var2 != null) {
                        r3 = o28Var2.a;
                    } else {
                        r3 = z5;
                    }
                    long j1111119 = j11;
                    long j11111110 = j12;
                    o88 o88Var1112 = o88Var3;
                    int i3111111111116 = i30 << 6;
                    kx4 kx4Var1113 = kx4Var4;
                    int i3111111111117 = i16;
                    int i3111111111118 = i20;
                    int i3111111111119 = i31;
                    wl7.b(str2, kx4Var1113, o88.e(o88Var1112, jB, j10, j1111119, r3 == true ? 1 : 0, j11111110, 16609104), gn2Var3, i3111111111117, z2, i3111111111118, i3111111111119, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i3111111111116 & 57344) | (i3111111111116 & 458752) | (i3111111111116 & 3670016) | (i3111111111116 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    i27 = i3111111111118;
                    i26 = i3111111111119;
                    o88Var2 = o88Var1112;
                    o28Var3 = o28Var2;
                    z4 = z2;
                    gn2Var2 = gn2Var3;
                    i28 = i3111111111117;
                    j6 = j11111110;
                    mxVar3 = mxVar2;
                    j8 = j10;
                    kx4Var3 = kx4Var1113;
                    j5 = j9;
                    j7 = j1111119;
                } else {
                    lp2Var.Q();
                    j5 = j;
                    j6 = j4;
                    z4 = z;
                    i26 = i3;
                    gn2Var2 = gn2Var;
                    o88Var2 = o88Var;
                    i27 = i20;
                    kx4Var3 = kx4Var2;
                    o28Var3 = o28Var2;
                    j7 = j3;
                    i28 = i16;
                    mxVar3 = mxVar2;
                    j8 = j2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t78
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = w79.P(i4 | 1);
                            int iP2 = w79.P(i5);
                            u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i18 |= 196608;
            i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
            if (i24 != 0) {
                i18 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                if (lp2Var.h(gn2Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i18 |= i25;
            }
            if ((i5 & 12582912) != 0) {
                if ((i6 & 131072) == 0) {
                    i32 = 4194304;
                } else {
                    i32 = 4194304;
                }
                i18 |= i32;
            }
            z2 = true;
            if ((i11 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (lp2Var.N(i11 & 1, z3)) {
                lp2Var.S();
                if ((i4 & 1) != 0) {
                    if (i33 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    j9 = dw0.g;
                    if (i9 != 0) {
                        mxVar2 = null;
                    }
                    j10 = v88.c;
                    if (i12 != 0) {
                        o28Var2 = null;
                    }
                    if (i15 != 0) {
                        i16 = 1;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i3;
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i18 &= -29360129;
                        o88Var3 = (o88) lp2Var.j(a);
                    } else {
                        o88Var3 = o88Var;
                    }
                    i30 = i18;
                    j11 = j10;
                    i31 = i29;
                    j12 = j11;
                } else {
                    if (i33 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    j9 = dw0.g;
                    if (i9 != 0) {
                        mxVar2 = null;
                    }
                    j10 = v88.c;
                    if (i12 != 0) {
                        o28Var2 = null;
                    }
                    if (i15 != 0) {
                        i16 = 1;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i3;
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i18 &= -29360129;
                        o88Var3 = (o88) lp2Var.j(a);
                    } else {
                        o88Var3 = o88Var;
                    }
                    i30 = i18;
                    j11 = j10;
                    i31 = i29;
                    j12 = j11;
                }
                lp2Var.q();
                lp2Var.W(-565217106);
                if (j9 != 16) {
                    kx4Var4 = kx4Var4;
                    i16 = i16;
                    jB = j9;
                    z5 = false;
                } else {
                    lp2Var.W(-565216333);
                    jB = o88Var3.b();
                    if (jB != 16) {
                        jB = ((dw0) lp2Var.j(j41.a)).a;
                    }
                    z5 = false;
                    lp2Var.p(false);
                }
                lp2Var.p(z5);
                if (o28Var2 != null) {
                    r3 = o28Var2.a;
                } else {
                    r3 = z5;
                }
                long j11111111 = j11;
                long j11111112 = j12;
                o88 o88Var1113 = o88Var3;
                int i31111111111110 = i30 << 6;
                kx4 kx4Var1114 = kx4Var4;
                int i31111111111111 = i16;
                int i31111111111112 = i20;
                int i31111111111113 = i31;
                wl7.b(str2, kx4Var1114, o88.e(o88Var1113, jB, j10, j11111111, r3 == true ? 1 : 0, j11111112, 16609104), gn2Var3, i31111111111111, z2, i31111111111112, i31111111111113, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i31111111111110 & 57344) | (i31111111111110 & 458752) | (i31111111111110 & 3670016) | (i31111111111110 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                i27 = i31111111111112;
                i26 = i31111111111113;
                o88Var2 = o88Var1113;
                o28Var3 = o28Var2;
                z4 = z2;
                gn2Var2 = gn2Var3;
                i28 = i31111111111111;
                j6 = j11111112;
                mxVar3 = mxVar2;
                j8 = j10;
                kx4Var3 = kx4Var1114;
                j5 = j9;
                j7 = j11111111;
            } else {
                lp2Var.Q();
                j5 = j;
                j6 = j4;
                z4 = z;
                i26 = i3;
                gn2Var2 = gn2Var;
                o88Var2 = o88Var;
                i27 = i20;
                kx4Var3 = kx4Var2;
                o28Var3 = o28Var2;
                j7 = j3;
                i28 = i16;
                mxVar3 = mxVar2;
                j8 = j2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: t78
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = w79.P(i4 | 1);
                        int iP2 = w79.P(i5);
                        u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                        return dn8.a;
                    }
                };
            }
        }
        i18 = i14 | 27648;
        i20 = i2;
        i22 = i6 & 32768;
        if (i22 != 0) {
            if ((i5 & 196608) == 0) {
                if (lp2Var.d(i3)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i18 |= i23;
            }
            i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
            if (i24 != 0) {
                i18 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                if (lp2Var.h(gn2Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i18 |= i25;
            }
            if ((i5 & 12582912) != 0) {
                if ((i6 & 131072) == 0) {
                    i32 = 4194304;
                } else {
                    i32 = 4194304;
                }
                i18 |= i32;
            }
            z2 = true;
            if ((i11 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (lp2Var.N(i11 & 1, z3)) {
                lp2Var.S();
                if ((i4 & 1) != 0) {
                    if (i33 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    j9 = dw0.g;
                    if (i9 != 0) {
                        mxVar2 = null;
                    }
                    j10 = v88.c;
                    if (i12 != 0) {
                        o28Var2 = null;
                    }
                    if (i15 != 0) {
                        i16 = 1;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i3;
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i18 &= -29360129;
                        o88Var3 = (o88) lp2Var.j(a);
                    } else {
                        o88Var3 = o88Var;
                    }
                    i30 = i18;
                    j11 = j10;
                    i31 = i29;
                    j12 = j11;
                } else {
                    if (i33 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    j9 = dw0.g;
                    if (i9 != 0) {
                        mxVar2 = null;
                    }
                    j10 = v88.c;
                    if (i12 != 0) {
                        o28Var2 = null;
                    }
                    if (i15 != 0) {
                        i16 = 1;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i3;
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i18 &= -29360129;
                        o88Var3 = (o88) lp2Var.j(a);
                    } else {
                        o88Var3 = o88Var;
                    }
                    i30 = i18;
                    j11 = j10;
                    i31 = i29;
                    j12 = j11;
                }
                lp2Var.q();
                lp2Var.W(-565217106);
                if (j9 != 16) {
                    kx4Var4 = kx4Var4;
                    i16 = i16;
                    jB = j9;
                    z5 = false;
                } else {
                    lp2Var.W(-565216333);
                    jB = o88Var3.b();
                    if (jB != 16) {
                        jB = ((dw0) lp2Var.j(j41.a)).a;
                    }
                    z5 = false;
                    lp2Var.p(false);
                }
                lp2Var.p(z5);
                if (o28Var2 != null) {
                    r3 = o28Var2.a;
                } else {
                    r3 = z5;
                }
                long j11111113 = j11;
                long j11111114 = j12;
                o88 o88Var1114 = o88Var3;
                int i31111111111114 = i30 << 6;
                kx4 kx4Var1115 = kx4Var4;
                int i31111111111115 = i16;
                int i31111111111116 = i20;
                int i31111111111117 = i31;
                wl7.b(str2, kx4Var1115, o88.e(o88Var1114, jB, j10, j11111113, r3 == true ? 1 : 0, j11111114, 16609104), gn2Var3, i31111111111115, z2, i31111111111116, i31111111111117, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i31111111111114 & 57344) | (i31111111111114 & 458752) | (i31111111111114 & 3670016) | (i31111111111114 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                i27 = i31111111111116;
                i26 = i31111111111117;
                o88Var2 = o88Var1114;
                o28Var3 = o28Var2;
                z4 = z2;
                gn2Var2 = gn2Var3;
                i28 = i31111111111115;
                j6 = j11111114;
                mxVar3 = mxVar2;
                j8 = j10;
                kx4Var3 = kx4Var1115;
                j5 = j9;
                j7 = j11111113;
            } else {
                lp2Var.Q();
                j5 = j;
                j6 = j4;
                z4 = z;
                i26 = i3;
                gn2Var2 = gn2Var;
                o88Var2 = o88Var;
                i27 = i20;
                kx4Var3 = kx4Var2;
                o28Var3 = o28Var2;
                j7 = j3;
                i28 = i16;
                mxVar3 = mxVar2;
                j8 = j2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: t78
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = w79.P(i4 | 1);
                        int iP2 = w79.P(i5);
                        u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                        return dn8.a;
                    }
                };
            }
        }
        i18 |= 196608;
        i24 = i6 & DnsOverHttps.MAX_RESPONSE_SIZE;
        if (i24 != 0) {
            i18 |= 1572864;
        } else if ((i5 & 1572864) == 0) {
            if (lp2Var.h(gn2Var)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i18 |= i25;
        }
        if ((i5 & 12582912) != 0) {
            if ((i6 & 131072) == 0) {
                i32 = 4194304;
            } else {
                i32 = 4194304;
            }
            i18 |= i32;
        }
        z2 = true;
        if ((i11 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (lp2Var.N(i11 & 1, z3)) {
            lp2Var.S();
            if ((i4 & 1) != 0) {
                if (i33 != 0) {
                    kx4Var4 = hx4.X;
                } else {
                    kx4Var4 = kx4Var2;
                }
                j9 = dw0.g;
                if (i9 != 0) {
                    mxVar2 = null;
                }
                j10 = v88.c;
                if (i12 != 0) {
                    o28Var2 = null;
                }
                if (i15 != 0) {
                    i16 = 1;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                }
                if (i22 != 0) {
                    i29 = 1;
                } else {
                    i29 = i3;
                }
                if (i24 == 0) {
                }
                if ((i6 & 131072) != 0) {
                    i18 &= -29360129;
                    o88Var3 = (o88) lp2Var.j(a);
                } else {
                    o88Var3 = o88Var;
                }
                i30 = i18;
                j11 = j10;
                i31 = i29;
                j12 = j11;
            } else {
                if (i33 != 0) {
                    kx4Var4 = hx4.X;
                } else {
                    kx4Var4 = kx4Var2;
                }
                j9 = dw0.g;
                if (i9 != 0) {
                    mxVar2 = null;
                }
                j10 = v88.c;
                if (i12 != 0) {
                    o28Var2 = null;
                }
                if (i15 != 0) {
                    i16 = 1;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                }
                if (i22 != 0) {
                    i29 = 1;
                } else {
                    i29 = i3;
                }
                if (i24 == 0) {
                }
                if ((i6 & 131072) != 0) {
                    i18 &= -29360129;
                    o88Var3 = (o88) lp2Var.j(a);
                } else {
                    o88Var3 = o88Var;
                }
                i30 = i18;
                j11 = j10;
                i31 = i29;
                j12 = j11;
            }
            lp2Var.q();
            lp2Var.W(-565217106);
            if (j9 != 16) {
                kx4Var4 = kx4Var4;
                i16 = i16;
                jB = j9;
                z5 = false;
            } else {
                lp2Var.W(-565216333);
                jB = o88Var3.b();
                if (jB != 16) {
                    jB = ((dw0) lp2Var.j(j41.a)).a;
                }
                z5 = false;
                lp2Var.p(false);
            }
            lp2Var.p(z5);
            if (o28Var2 != null) {
                r3 = o28Var2.a;
            } else {
                r3 = z5;
            }
            long j11111115 = j11;
            long j11111116 = j12;
            o88 o88Var1115 = o88Var3;
            int i31111111111118 = i30 << 6;
            kx4 kx4Var1116 = kx4Var4;
            int i31111111111119 = i16;
            int i311111111111110 = i20;
            int i311111111111111 = i31;
            wl7.b(str2, kx4Var1116, o88.e(o88Var1115, jB, j10, j11111115, r3 == true ? 1 : 0, j11111116, 16609104), gn2Var3, i31111111111119, z2, i311111111111110, i311111111111111, mxVar2, lp2Var, ((i30 >> 9) & 7168) | (i11 & WebSocketProtocol.PAYLOAD_SHORT) | (i31111111111118 & 57344) | (i31111111111118 & 458752) | (i31111111111118 & 3670016) | (i31111111111118 & 29360128) | ((i11 << 18) & 1879048192), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            i27 = i311111111111110;
            i26 = i311111111111111;
            o88Var2 = o88Var1115;
            o28Var3 = o28Var2;
            z4 = z2;
            gn2Var2 = gn2Var3;
            i28 = i31111111111119;
            j6 = j11111116;
            mxVar3 = mxVar2;
            j8 = j10;
            kx4Var3 = kx4Var1116;
            j5 = j9;
            j7 = j11111115;
        } else {
            lp2Var.Q();
            j5 = j;
            j6 = j4;
            z4 = z;
            i26 = i3;
            gn2Var2 = gn2Var;
            o88Var2 = o88Var;
            i27 = i20;
            kx4Var3 = kx4Var2;
            o28Var3 = o28Var2;
            j7 = j3;
            i28 = i16;
            mxVar3 = mxVar2;
            j8 = j2;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: t78
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(i4 | 1);
                    int iP2 = w79.P(i5);
                    u78.b(str, kx4Var3, j5, mxVar3, j8, j7, o28Var3, j6, i28, z4, i27, i26, gn2Var2, o88Var2, (lp2) obj, iP, iP2, i6);
                    return dn8.a;
                }
            };
        }
    }

    public static final void c(final ql qlVar, final kx4 kx4Var, long j, final mx mxVar, long j2, long j3, final o28 o28Var, long j4, final int i, boolean z, final int i2, final int i3, Map map, gn2 gn2Var, final o88 o88Var, lp2 lp2Var, final int i4, final int i5) {
        int i6;
        mx mxVar2;
        int i7;
        int i8;
        o88 o88Var2;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final boolean z2;
        final Map map2;
        final gn2 gn2Var2;
        long j9;
        gn2 gn2Var3;
        Map map3;
        boolean z3;
        long j10;
        long j11;
        long j12;
        long jB;
        boolean z4;
        lp2Var.X(292247417);
        if ((i4 & 6) == 0) {
            i6 = (lp2Var.f(qlVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        int i9 = i6 | 384;
        if ((i4 & 3072) == 0) {
            mxVar2 = mxVar;
            i9 |= lp2Var.h(mxVar2) ? 2048 : 1024;
        } else {
            mxVar2 = mxVar;
        }
        int i10 = i9 | 920346624;
        if ((i5 & 6) == 0) {
            i7 = (lp2Var.f(o28Var) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i11 = i7 | 48;
        if ((i5 & 384) == 0) {
            i11 |= lp2Var.d(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i12 = i11 | 3072;
        if ((i5 & 24576) == 0) {
            i12 |= lp2Var.d(i2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i5) == 0) {
            i8 = i3;
            i12 |= lp2Var.d(i8) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        } else {
            i8 = i3;
        }
        int i13 = i12 | 14155776;
        if ((100663296 & i5) == 0) {
            o88Var2 = o88Var;
            i13 |= lp2Var.f(o88Var2) ? 67108864 : 33554432;
        } else {
            o88Var2 = o88Var;
        }
        if (lp2Var.N(i10 & 1, ((306783379 & i10) == 306783378 && (38347923 & i13) == 38347922) ? false : true)) {
            lp2Var.S();
            int i14 = i4 & 1;
            be beVar = zz0.a;
            if (i14 == 0 || lp2Var.x()) {
                long j13 = dw0.g;
                j9 = v88.c;
                Object objK = lp2Var.K();
                if (objK == beVar) {
                    objK = new b58((byte) 2);
                    lp2Var.g0(objK);
                }
                gn2Var3 = (gn2) objK;
                map3 = e02.X;
                z3 = true;
                j10 = j13;
                j11 = j9;
                j12 = j11;
            } else {
                lp2Var.Q();
                j10 = j;
                j11 = j2;
                j9 = j3;
                j12 = j4;
                z3 = z;
                map3 = map;
                gn2Var3 = gn2Var;
            }
            lp2Var.q();
            lp2Var.W(1676919644);
            if (j10 != 16) {
                jB = j10;
                z4 = false;
            } else {
                lp2Var.W(1676920417);
                jB = o88Var2.b();
                if (jB == 16) {
                    jB = ((dw0) lp2Var.j(j41.a)).a;
                }
                z4 = false;
                lp2Var.p(false);
            }
            lp2Var.p(z4);
            long j14 = ((iw0) lp2Var.j(kw0.a)).a;
            boolean zE = lp2Var.e(j14);
            Object objK2 = lp2Var.K();
            if (zE || objK2 == beVar) {
                objK2 = new c88(new qe7(j14, 0L, (dj2) null, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, x38.c, (t67) null, 61438), null, null, null);
                lp2Var.g0(objK2);
            }
            c88 c88Var = (c88) objK2;
            boolean zF = ((i10 & 14) == 4) | lp2Var.f(c88Var);
            Object objK3 = lp2Var.K();
            if (zF || objK3 == beVar) {
                objK3 = qlVar.b(new py7((Object) c88Var, (byte) 7));
                lp2Var.g0(objK3);
            }
            ql qlVar2 = (ql) objK3;
            o88 o88VarE = o88.e(o88Var2, jB, j11, j9, o28Var != null ? o28Var.a : 0, j12, 16609104);
            long j15 = j12;
            long j16 = j11;
            int i15 = (i10 & 112) | ((i13 >> 12) & 7168);
            int i16 = i13 << 6;
            boolean z5 = z3;
            Map map4 = map3;
            gn2 gn2Var4 = gn2Var3;
            wl7.a(qlVar2, kx4Var, o88VarE, gn2Var4, i, z5, i2, i8, map4, mxVar2, lp2Var, i15 | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024), (i10 >> 9) & 14);
            j5 = j10;
            gn2Var2 = gn2Var4;
            z2 = z5;
            map2 = map4;
            j6 = j16;
            j7 = j9;
            j8 = j15;
        } else {
            lp2Var.Q();
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            z2 = z;
            map2 = map;
            gn2Var2 = gn2Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: s78
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(i4 | 1);
                    int iP2 = w79.P(i5);
                    ql qlVar3 = qlVar;
                    kx4 kx4Var2 = kx4Var;
                    long j17 = j5;
                    mx mxVar3 = mxVar;
                    long j18 = j6;
                    long j19 = j7;
                    o28 o28Var2 = o28Var;
                    long j20 = j8;
                    byte b = i;
                    boolean z6 = z2;
                    int i17 = i2;
                    boolean z7 = i3;
                    Map map5 = map2;
                    gn2 gn2Var5 = gn2Var2;
                    o88 o88Var3 = o88Var;
                    u78.c(qlVar3, kx4Var2, j17, mxVar3, j18, j19, o28Var2, j20, b, z6, i17, z7 ? 1 : 0, map5, gn2Var5, o88Var3, (lp2) obj, iP, iP2);
                    return dn8.a;
                }
            };
        }
    }
}
