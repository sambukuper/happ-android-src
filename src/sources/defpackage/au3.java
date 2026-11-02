package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class au3 {
    public final /* synthetic */ byte a;

    static {
        r62 r62Var = r62.b;
    }

    public /* synthetic */ au3(byte b) {
        this.a = b;
    }

    public final d2 a(ByteArrayInputStream byteArrayInputStream, r62 r62Var) throws rh3 {
        d2 d2Var;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                d2Var = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 < 32) {
                            int i3 = byteArrayInputStream.read();
                            if (i3 == -1) {
                                throw rh3.a();
                            }
                            i |= (i3 & 127) << i2;
                            if ((i3 & 128) == 0) {
                                break;
                            }
                            i2 += 7;
                        } else {
                            while (true) {
                                if (i2 >= 64) {
                                    throw new rh3("CodedInputStream encountered a malformed varint.");
                                }
                                int i4 = byteArrayInputStream.read();
                                if (i4 == -1) {
                                    throw rh3.a();
                                }
                                if ((i4 & 128) == 0) {
                                    break;
                                }
                                i2 += 7;
                            }
                        }
                    }
                }
                iv0 iv0Var = new iv0(new c2(byteArrayInputStream, i));
                d2Var = (d2) b(iv0Var, r62Var);
                try {
                    iv0Var.a(0);
                } catch (rh3 e) {
                    e.X = d2Var;
                    throw e;
                }
            }
            if (d2Var == null || d2Var.d()) {
                return d2Var;
            }
            rh3 rh3Var = new rh3(new xm8().getMessage());
            rh3Var.X = d2Var;
            throw rh3Var;
        } catch (IOException e2) {
            throw new rh3(e2.getMessage());
        }
    }

    public final Object b(iv0 iv0Var, r62 r62Var) {
        switch (this.a) {
            case 0:
                return new cu3(iv0Var);
            case 1:
                return new du3(iv0Var);
            case 2:
                return new fu3(iv0Var, r62Var);
            case 3:
                return new ku3(iv0Var, r62Var);
            case 4:
                return new ju3(iv0Var);
            case 5:
                return new cy5(iv0Var, r62Var);
            case 6:
                return new ay5(iv0Var, r62Var);
            case 7:
                return new zx5(iv0Var, r62Var);
            case 8:
                return new fy5(iv0Var, r62Var);
            case 9:
                return new gy5(iv0Var);
            case 10:
                return new iy5(iv0Var, r62Var);
            case 11:
                return new ky5(iv0Var, r62Var);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new oy5(iv0Var, r62Var);
            case 13:
                return new qy5(iv0Var, r62Var);
            case 14:
                return new ty5(iv0Var, r62Var);
            case 15:
                return new vy5(iv0Var, r62Var);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new zy5(iv0Var, r62Var);
            case 17:
                return new az5(iv0Var, r62Var);
            case 18:
                return new cz5(iv0Var, r62Var);
            case 19:
                return new gz5(iv0Var, r62Var);
            case 20:
                return new fz5(iv0Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new iz5(iv0Var);
            case 22:
                return new nz5(iv0Var, r62Var);
            case 23:
                return new lz5(iv0Var, r62Var);
            case 24:
                return new pz5(iv0Var, r62Var);
            case 25:
                return new sz5(iv0Var, r62Var);
            case 26:
                return new tz5(iv0Var, r62Var);
            case 27:
                return new vz5(iv0Var, r62Var);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return new zz5(iv0Var);
            default:
                return new a06(iv0Var, r62Var);
        }
    }
}
