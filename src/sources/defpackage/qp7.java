package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.material3.c;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class qp7 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(final yr7 yr7Var, final gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        boolean z;
        lp2 lp2Var2 = lp2Var;
        gn2Var.getClass();
        lp2Var2.X(1041329981);
        int i2 = i | (lp2Var2.f(yr7Var) ? 4 : 2) | (lp2Var2.h(gn2Var) ? 32 : 16) | (lp2Var2.f(kx4Var) ? 256 : 128);
        final byte b = 0;
        if (lp2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            o50 o50Var = pz2.o0;
            ft ftVar = new ft(12.0f, new bt());
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object objK = lp2Var2.K();
            be beVar = zz0.a;
            if (z2 || objK == beVar) {
                objK = new dn2() { // from class: pp7
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object invoke() {
                        byte b2 = b;
                        dn8 dn8Var = dn8.a;
                        yr7 yr7Var2 = yr7Var;
                        gn2 gn2Var2 = gn2Var;
                        switch (b2) {
                            case 0:
                                String str = yr7Var2.a;
                                str.getClass();
                                gn2Var2.B(new pq6(str));
                                break;
                            default:
                                String str2 = yr7Var2.a;
                                str2.getClass();
                                gn2Var2.B(new pq6(str2));
                                break;
                        }
                        return dn8Var;
                    }
                };
                lp2Var2.g0(objK);
            }
            kx4 kx4VarX = vj8.x(kx4Var, false, (xz4) null, (c) null, (dn2) null, (dn2) objK, lp2Var2, 31);
            wq6 wq6VarA = vq6.a(ftVar, o50Var, lp2Var2, 54);
            int iHashCode = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, kx4VarX);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(pz2.B0, lp2Var2, wq6VarA);
            pn7.m(pz2.A0, lp2Var2, kl5VarL);
            pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode));
            pn7.l(lp2Var2);
            pn7.m(pz2.z0, lp2Var2, kx4VarQ);
            boolean z3 = yr7Var.c;
            boolean z4 = (i4 == 4) | (i3 == 32);
            Object objK2 = lp2Var2.K();
            if (z4 || objK2 == beVar) {
                final byte b2 = 1;
                objK2 = new dn2() { // from class: pp7
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object invoke() {
                        byte b3 = b2;
                        dn8 dn8Var = dn8.a;
                        yr7 yr7Var2 = yr7Var;
                        gn2 gn2Var2 = gn2Var;
                        switch (b3) {
                            case 0:
                                String str = yr7Var2.a;
                                str.getClass();
                                gn2Var2.B(new pq6(str));
                                break;
                            default:
                                String str2 = yr7Var2.a;
                                str2.getClass();
                                gn2Var2.B(new pq6(str2));
                                break;
                        }
                        return dn8Var;
                    }
                };
                lp2Var2.g0(objK2);
            }
            wl7.c(z3, false, (dn2) objK2, lp2Var2, 0, 6);
            lp2Var2 = lp2Var2;
            String remarks = yr7Var.b.getRemarks();
            if (fm7.o0(remarks)) {
                remarks = null;
            }
            if (remarks == null) {
                lp2Var2.W(-290976253);
                remarks = vj8.j0(y46.title_server_list, lp2Var2);
                z = false;
            } else {
                z = false;
                lp2Var2.W(-290978733);
            }
            lp2Var2.p(z);
            zc1.g(remarks, new d44(1.0f, true), o88.a(((ds) lp2Var2.j(es.a)).b, ((dp) lp2Var2.j(ep.z)).c.a, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214), 0, 0, 0, 0, false, (gn2) null, lp2Var2, 0, 504);
            lp2Var2.p(true);
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new fh(yr7Var, gn2Var, kx4Var, i, (byte) 19);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(StringBuilder sb, CharsetDecoder charsetDecoder, ByteBuffer byteBuffer) {
        if (byteBuffer.position() == 0) {
            return;
        }
        byteBuffer.flip();
        try {
            try {
                sb.append((CharSequence) charsetDecoder.decode(byteBuffer));
            } catch (CharacterCodingException unused) {
                sb.append((char) 65533);
            }
        } finally {
            byteBuffer.flip();
            byteBuffer.limit(byteBuffer.capacity());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean g(KeyEvent keyEvent) {
        InputDevice device = keyEvent.getDevice();
        return (device == null || device.isVirtual() || device.getKeyboardType() != 2 || (keyEvent.getFlags() & 2) == 2) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean h(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long i(long j, qf3 qf3Var, r07 r07Var) {
        long jC;
        int i = f88.c;
        long jA = qf3Var.a((int) (j >> 32), true);
        long jA2 = f88.b(j) ? jA : qf3Var.a((int) (j & 4294967295L), true);
        f09 f09Var = null;
        f09 f09Var2 = r07Var != null ? r07Var.a : null;
        if (f88.b(j)) {
            f09Var = f09Var2;
        } else if (r07Var != null) {
            f09Var = r07Var.b;
        }
        if (f09Var2 != null && !f88.b(jA)) {
            int iOrdinal = f09Var2.ordinal();
            if (iOrdinal == 0) {
                int i2 = (int) (jA >> 32);
                jA = ct7.c(i2, i2);
            } else {
                if (iOrdinal != 1) {
                    b61.c();
                    return 0L;
                }
                int i3 = (int) (jA & 4294967295L);
                jA = ct7.c(i3, i3);
            }
        }
        if (f09Var != null && !f88.b(jA2)) {
            int iOrdinal2 = f09Var.ordinal();
            if (iOrdinal2 == 0) {
                int i4 = (int) (jA2 >> 32);
                jC = ct7.c(i4, i4);
            } else {
                if (iOrdinal2 != 1) {
                    b61.c();
                    return 0L;
                }
                int i5 = (int) (jA2 & 4294967295L);
                jC = ct7.c(i5, i5);
            }
            jA2 = jC;
        }
        int iMin = Math.min(f88.d(jA), f88.d(jA2));
        int iMax = Math.max(f88.c(jA), f88.c(jA2));
        return f88.e(j) ? ct7.c(iMax, iMin) : ct7.c(iMin, iMax);
    }

    public abstract int b(View view, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int c(View view, int i) {
        return view.getTop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int e(View view) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int f() {
        return 0;
    }

    public abstract void m(int i);

    public abstract void n(View view, int i, int i2);

    public abstract void o(View view, float f, float f2);

    public abstract boolean p(View view, int i);

    public void k() {
    }

    public void j(int i, int i2) {
    }

    public void l(View view, int i) {
    }
}
