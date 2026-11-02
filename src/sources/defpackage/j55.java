package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j55 {
    public static final f05 a;

    static {
        f05 f05Var = g85.a;
        a = new f05();
    }

    public static final void a(jx4 jx4Var, int i, int i2) {
        if (!(jx4Var instanceof oh1)) {
            b(jx4Var, i & jx4Var.Z, i2);
            return;
        }
        oh1 oh1Var = (oh1) jx4Var;
        int i3 = oh1Var.q0;
        b(jx4Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (jx4 jx4Var2 = oh1Var.r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
            a(jx4Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(jx4 jx4Var, int i, int i2) {
        if (i2 != 0 || jx4Var.N0()) {
            if ((i & 2) != 0 && (jx4Var instanceof g34)) {
                nr4.E((g34) jx4Var);
                if (i2 == 2) {
                    yn0.X(jx4Var, 2).i1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                yn0.Z(jx4Var).H();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                yn0.Z(jx4Var).X(false);
            }
            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && (jx4Var instanceof as2)) {
                if (i2 == 1) {
                    LayoutNode layoutNodeZ = yn0.Z(jx4Var);
                    layoutNodeZ.d0(layoutNodeZ.P0 + 1);
                } else if (i2 == 2) {
                    LayoutNode layoutNodeZ2 = yn0.Z(jx4Var);
                    layoutNodeZ2.d0(layoutNodeZ2.P0 - 1);
                }
                if (i2 != 2) {
                    LayoutNode layoutNodeZ3 = yn0.Z(jx4Var);
                    if (layoutNodeZ3.P0 != 0 && !layoutNodeZ3.p() && !layoutNodeZ3.q() && !layoutNodeZ3.O0) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) q34.a(layoutNodeZ3);
                        zz2 zz2Var = (zz2) androidComposeView.U0.e;
                        if (layoutNodeZ3.P0 > 0) {
                            ((c15) zz2Var.Y).b(layoutNodeZ3);
                            layoutNodeZ3.O0 = true;
                        }
                        androidComposeView.D(null);
                    }
                }
            }
            if ((i & 4) != 0 && (jx4Var instanceof rv1)) {
                z68.W((rv1) jx4Var);
            }
            if ((i & 8) != 0 && (jx4Var instanceof w07)) {
                yn0.Z(jx4Var).t0 = true;
            }
            if ((i & 64) != 0 && (jx4Var instanceof ci5)) {
                r34 r34Var = yn0.Z((ci5) jx4Var).I0;
                r34Var.p.t0 = true;
                bj4 bj4Var = r34Var.q;
                if (bj4Var != null) {
                    bj4Var.z0 = true;
                }
            }
            if ((i & 2048) != 0 && (jx4Var instanceof lh2)) {
                ((lh2) jx4Var).E(cm0.a);
            }
            if ((i & 4096) != 0 && (jx4Var instanceof vg2)) {
                vg2 vg2Var = (vg2) jx4Var;
                bh2 bh2Var = ((gh2) yn0.a0(vg2Var).getFocusOwner()).d;
                if (bh2Var.d.a(vg2Var)) {
                    bh2Var.a();
                }
            }
            if ((i & 2097152) != 0 && (jx4Var instanceof ic3) && i2 == 2) {
                ((ic3) jx4Var).l0();
            }
        }
    }

    public static final void c(jx4 jx4Var) {
        if (!jx4Var.p0) {
            wc3.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(jx4Var, -1, 0);
    }

    public static final int d(ix4 ix4Var) {
        int i = ix4Var instanceof u31 ? 3 : 1;
        if (ix4Var instanceof qv1) {
            i |= 4;
        }
        if (ix4Var instanceof qs) {
            i |= 8;
        }
        if (ix4Var instanceof ox4) {
            i |= 32;
        }
        if (ix4Var instanceof y58) {
            i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (ix4Var instanceof bi5) {
            i |= 64;
        }
        return ix4Var instanceof n80 ? 524288 | i : i;
    }

    public static final int e(jx4 jx4Var) {
        int i = jx4Var.Z;
        if (i != 0) {
            return i;
        }
        Class<?> cls = jx4Var.getClass();
        f05 f05Var = a;
        int iD = f05Var.d(cls);
        if (iD >= 0) {
            return f05Var.c[iD];
        }
        int i2 = jx4Var instanceof g34 ? 3 : 1;
        if (jx4Var instanceof rv1) {
            i2 |= 4;
        }
        if (jx4Var instanceof w07) {
            i2 |= 8;
        }
        if (jx4Var instanceof kq5) {
            i2 |= 16;
        }
        if (jx4Var instanceof nx4) {
            i2 |= 32;
        }
        if (jx4Var instanceof ci5) {
            i2 |= 64;
        }
        if (jx4Var instanceof w24) {
            i2 |= 4194432;
        } else if (jx4Var instanceof as4) {
            i2 |= 128;
        }
        if (jx4Var instanceof as2) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (jx4Var instanceof ai2) {
            i2 |= 1024;
        }
        if (jx4Var instanceof lh2) {
            i2 |= 2048;
        }
        if (jx4Var instanceof vg2) {
            i2 |= 4096;
        }
        if (jx4Var instanceof gx3) {
            i2 |= 8192;
        }
        if (jx4Var instanceof tb) {
            i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
        }
        if (jx4Var instanceof s01) {
            i2 |= 32768;
        }
        if (jx4Var instanceof ye8) {
            i2 |= 262144;
        }
        if (jx4Var instanceof n80) {
            i2 |= 524288;
        }
        if (jx4Var instanceof ai2) {
            i2 |= 1048576;
        }
        if (jx4Var instanceof ic3) {
            i2 |= 2097152;
        }
        if (jx4Var instanceof v54) {
            i2 |= XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
        }
        f05Var.g(i2, cls);
        return i2;
    }

    public static final int f(jx4 jx4Var) {
        if (!(jx4Var instanceof oh1)) {
            return e(jx4Var);
        }
        oh1 oh1Var = (oh1) jx4Var;
        int iF = oh1Var.q0;
        for (jx4 jx4Var2 = oh1Var.r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
            iF |= f(jx4Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
