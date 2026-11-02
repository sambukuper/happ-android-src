package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x11 extends v2 {
    public final int X;
    public final int Y;
    public final PendingIntent Z;
    public final String f0;
    public final Integer g0;
    public static final x11 h0 = new x11(0, null, null);
    public static final Parcelable.Creator<x11> CREATOR = new lg7((byte) 18);

    public x11(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.X = i;
        this.Y = i2;
        this.Z = pendingIntent;
        this.f0 = str;
        this.g0 = num;
    }

    public static String c(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x11)) {
            return false;
        }
        x11 x11Var = (x11) obj;
        return this.Y == x11Var.Y && zc1.F(this.Z, x11Var.Z) && zc1.F(this.f0, x11Var.f0) && zc1.F(this.g0, x11Var.g0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.Y), this.Z, this.f0, this.g0});
    }

    public final String toString() {
        e93 e93Var = new e93(this);
        e93Var.a(c(this.Y), "statusCode");
        e93Var.a(this.Z, "resolution");
        e93Var.a(this.f0, "message");
        e93Var.a(this.g0, "clientMethodKey");
        return e93Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.r0(parcel, 1, 4);
        parcel.writeInt(this.X);
        mb6.r0(parcel, 2, 4);
        parcel.writeInt(this.Y);
        mb6.m0(parcel, 3, this.Z, i);
        mb6.n0(parcel, 4, this.f0);
        Integer num = this.g0;
        if (num != null) {
            mb6.r0(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        mb6.t0(parcel, iS0);
    }

    public x11(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
