package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lg7 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ lg7(byte b) {
        this.a = b;
    }

    public static void a(sr2 sr2Var, Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        int i2 = sr2Var.X;
        mb6.r0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = sr2Var.Y;
        mb6.r0(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = sr2Var.Z;
        mb6.r0(parcel, 3, 4);
        parcel.writeInt(i4);
        mb6.n0(parcel, 4, sr2Var.f0);
        IBinder iBinder = sr2Var.g0;
        if (iBinder != null) {
            int iS1 = mb6.s0(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            mb6.t0(parcel, iS1);
        }
        mb6.o0(parcel, 6, sr2Var.h0, i);
        mb6.l0(parcel, 7, sr2Var.i0);
        mb6.m0(parcel, 8, sr2Var.j0, i);
        mb6.o0(parcel, 10, sr2Var.k0, i);
        mb6.o0(parcel, 11, sr2Var.l0, i);
        boolean z = sr2Var.m0;
        mb6.r0(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = sr2Var.n0;
        mb6.r0(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = sr2Var.o0;
        mb6.r0(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        mb6.n0(parcel, 15, sr2Var.p0);
        mb6.t0(parcel, iS0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        SubId subIdCreateFromParcel;
        boolean z;
        boolean z2 = true;
        int iU0 = 0;
        String strD = null;
        Bundle bundleS = null;
        String strU = null;
        String strU2 = null;
        Intent intent = null;
        Account account = null;
        x11 x11Var = null;
        Intent intent2 = null;
        strD = null;
        switch (this.a) {
            case 0:
                mg7 mg7Var = new mg7();
                mg7Var.X = parcel.readInt();
                mg7Var.Y = parcel.readInt();
                int i = parcel.readInt();
                mg7Var.Z = i;
                if (i > 0) {
                    int[] iArr = new int[i];
                    mg7Var.f0 = iArr;
                    parcel.readIntArray(iArr);
                }
                int i2 = parcel.readInt();
                mg7Var.g0 = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    mg7Var.h0 = iArr2;
                    parcel.readIntArray(iArr2);
                }
                mg7Var.j0 = parcel.readInt() == 1;
                mg7Var.k0 = parcel.readInt() == 1;
                mg7Var.l0 = parcel.readInt() == 1;
                mg7Var.i0 = parcel.readArrayList(kg7.class.getClassLoader());
                return mg7Var;
            case 1:
                parcel.getClass();
                String string = parcel.readString();
                string.getClass();
                return new SubId(string);
            case 2:
                parcel.getClass();
                if (parcel.readInt() != 0 && (subIdCreateFromParcel = SubId.CREATOR.createFromParcel(parcel)) != null) {
                    strD = subIdCreateFromParcel.getValue();
                }
                String str = strD;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                } else {
                    z2 = false;
                    z = false;
                }
                String string2 = parcel.readString();
                boolean z9 = true;
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() == 0) {
                    z9 = z;
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new sq7(str, z3, z4, z5, z6, z7, z8, z2, string2, string3, z, z9, z);
            case 3:
                parcel.getClass();
                parcel.readInt();
                return cg8.X;
            case 4:
                parcel.getClass();
                String string4 = parcel.readString();
                string4.getClass();
                return new dg8(string4);
            case 5:
                parcel.getClass();
                parcel.readInt();
                return eg8.X;
            case 6:
                parcel.getClass();
                String string5 = parcel.readString();
                string5.getClass();
                return new fg8(string5);
            case 7:
                parcel.getClass();
                return new zo8(parcel.readInt(), yp8.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                parcel.getClass();
                return new yp8(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                int iA0 = hi5.A0(parcel);
                while (true) {
                    ArrayList arrayListCreateTypedArrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iA0) {
                            hi5.Y(parcel, iA0);
                            return new i28(iU0, arrayListCreateTypedArrayList);
                        }
                        int i3 = parcel.readInt();
                        char c = (char) i3;
                        if (c == 1) {
                            iU0 = hi5.u0(parcel, i3);
                        } else if (c != 2) {
                            hi5.y0(parcel, i3);
                        } else {
                            Parcelable.Creator<ov4> creator = ov4.CREATOR;
                            int iV0 = hi5.v0(parcel, i3);
                            int iDataPosition = parcel.dataPosition();
                            if (iV0 == 0) {
                            }
                            arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(iDataPosition + iV0);
                        }
                        break;
                    }
                }
                break;
            case 10:
                int iA1 = hi5.A0(parcel);
                int iU1 = 0;
                while (parcel.dataPosition() < iA1) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        iU0 = hi5.u0(parcel, i4);
                    } else if (c2 == 2) {
                        iU1 = hi5.u0(parcel, i4);
                    } else if (c2 != 3) {
                        hi5.y0(parcel, i4);
                    } else {
                        intent2 = (Intent) hi5.T(parcel, i4, Intent.CREATOR);
                    }
                }
                hi5.Y(parcel, iA1);
                return new a89(iU0, iU1, intent2);
            case 11:
                int iA2 = hi5.A0(parcel);
                long j = 0;
                String strU3 = null;
                String strU4 = null;
                String strU5 = null;
                String strU6 = null;
                Uri uri = null;
                String strU7 = null;
                String strU8 = null;
                ArrayList arrayList = null;
                String strU9 = null;
                String strU10 = null;
                while (parcel.dataPosition() < iA2) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 2:
                            strU3 = hi5.U(parcel, i5);
                            break;
                        case 3:
                            strU4 = hi5.U(parcel, i5);
                            break;
                        case 4:
                            strU5 = hi5.U(parcel, i5);
                            break;
                        case 5:
                            strU6 = hi5.U(parcel, i5);
                            break;
                        case 6:
                            uri = (Uri) hi5.T(parcel, i5, Uri.CREATOR);
                            break;
                        case 7:
                            strU7 = hi5.U(parcel, i5);
                            break;
                        case '\b':
                            hi5.D0(parcel, i5, 8);
                            j = parcel.readLong();
                            break;
                        case '\t':
                            strU8 = hi5.U(parcel, i5);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int iV1 = hi5.v0(parcel, i5);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iV1 != 0) {
                                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(iDataPosition2 + iV1);
                                arrayList = arrayListCreateTypedArrayList2;
                            } else {
                                arrayList = null;
                            }
                            break;
                        case 11:
                            strU9 = hi5.U(parcel, i5);
                            break;
                        case FileClientSessionCache.MAX_SIZE /* 12 */:
                            strU10 = hi5.U(parcel, i5);
                            break;
                        default:
                            hi5.y0(parcel, i5);
                            break;
                    }
                }
                hi5.Y(parcel, iA2);
                return new GoogleSignInAccount(strU3, strU4, strU5, strU6, uri, strU7, j, strU8, arrayList, strU9, strU10);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                int iA3 = hi5.A0(parcel);
                long j2 = 0;
                int iU2 = 0;
                int iU3 = 0;
                boolean zT0 = false;
                String strU11 = null;
                while (parcel.dataPosition() < iA3) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        iU2 = hi5.u0(parcel, i6);
                    } else if (c3 == 2) {
                        strU11 = hi5.U(parcel, i6);
                    } else if (c3 == 3) {
                        hi5.D0(parcel, i6, 8);
                        j2 = parcel.readLong();
                    } else if (c3 == 4) {
                        iU3 = hi5.u0(parcel, i6);
                    } else if (c3 != 5) {
                        hi5.y0(parcel, i6);
                    } else {
                        zT0 = hi5.t0(parcel, i6);
                    }
                }
                hi5.Y(parcel, iA3);
                return new e89(iU2, strU11, j2, iU3, zT0);
            case 13:
                int iA4 = hi5.A0(parcel);
                ArrayList<String> arrayList2 = null;
                String strU12 = null;
                while (parcel.dataPosition() < iA4) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        int iV2 = hi5.v0(parcel, i7);
                        int iDataPosition3 = parcel.dataPosition();
                        if (iV2 == 0) {
                            arrayList2 = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition3 + iV2);
                            arrayList2 = arrayListCreateStringArrayList;
                        }
                    } else if (c4 != 2) {
                        hi5.y0(parcel, i7);
                    } else {
                        strU12 = hi5.U(parcel, i7);
                    }
                }
                hi5.Y(parcel, iA4);
                return new w89(strU12, arrayList2);
            case 14:
                int iA5 = hi5.A0(parcel);
                k99 k99Var = null;
                while (parcel.dataPosition() < iA5) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        iU0 = hi5.u0(parcel, i8);
                    } else if (c5 == 2) {
                        x11Var = (x11) hi5.T(parcel, i8, x11.CREATOR);
                    } else if (c5 != 3) {
                        hi5.y0(parcel, i8);
                    } else {
                        k99Var = (k99) hi5.T(parcel, i8, k99.CREATOR);
                    }
                }
                hi5.Y(parcel, iA5);
                return new e99(iU0, x11Var, k99Var);
            case 15:
                int iA6 = hi5.A0(parcel);
                long j3 = 0;
                long j4 = 0;
                int iU4 = -1;
                int iU5 = 0;
                int iU6 = 0;
                int iU7 = 0;
                int iU8 = 0;
                String strU13 = null;
                String strU14 = null;
                while (parcel.dataPosition() < iA6) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iU5 = hi5.u0(parcel, i9);
                            break;
                        case 2:
                            iU6 = hi5.u0(parcel, i9);
                            break;
                        case 3:
                            iU7 = hi5.u0(parcel, i9);
                            break;
                        case 4:
                            hi5.D0(parcel, i9, 8);
                            j3 = parcel.readLong();
                            break;
                        case 5:
                            hi5.D0(parcel, i9, 8);
                            j4 = parcel.readLong();
                            break;
                        case 6:
                            strU13 = hi5.U(parcel, i9);
                            break;
                        case 7:
                            strU14 = hi5.U(parcel, i9);
                            break;
                        case '\b':
                            iU8 = hi5.u0(parcel, i9);
                            break;
                        case '\t':
                            iU4 = hi5.u0(parcel, i9);
                            break;
                        default:
                            hi5.y0(parcel, i9);
                            break;
                    }
                }
                hi5.Y(parcel, iA6);
                return new ov4(iU5, iU6, iU7, j3, j4, strU13, strU14, iU8, iU4);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                int iA7 = hi5.A0(parcel);
                int iU9 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iA7) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        iU0 = hi5.u0(parcel, i10);
                    } else if (c6 == 2) {
                        account = (Account) hi5.T(parcel, i10, Account.CREATOR);
                    } else if (c6 == 3) {
                        iU9 = hi5.u0(parcel, i10);
                    } else if (c6 != 4) {
                        hi5.y0(parcel, i10);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) hi5.T(parcel, i10, GoogleSignInAccount.CREATOR);
                    }
                }
                hi5.Y(parcel, iA7);
                return new j99(iU0, account, iU9, googleSignInAccount);
            case 17:
                int iA8 = hi5.A0(parcel);
                int iU10 = 0;
                boolean zT1 = false;
                boolean zT2 = false;
                IBinder iBinder = null;
                x11 x11Var2 = null;
                while (parcel.dataPosition() < iA8) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        iU10 = hi5.u0(parcel, i11);
                    } else if (c7 == 2) {
                        int iV3 = hi5.v0(parcel, i11);
                        int iDataPosition4 = parcel.dataPosition();
                        if (iV3 == 0) {
                            iBinder = null;
                        } else {
                            IBinder strongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(iDataPosition4 + iV3);
                            iBinder = strongBinder;
                        }
                    } else if (c7 == 3) {
                        x11Var2 = (x11) hi5.T(parcel, i11, x11.CREATOR);
                    } else if (c7 == 4) {
                        zT1 = hi5.t0(parcel, i11);
                    } else if (c7 != 5) {
                        hi5.y0(parcel, i11);
                    } else {
                        zT2 = hi5.t0(parcel, i11);
                    }
                }
                hi5.Y(parcel, iA8);
                return new k99(iU10, iBinder, x11Var2, zT1, zT2);
            case 18:
                int iA9 = hi5.A0(parcel);
                int iU11 = 0;
                int iU12 = 0;
                PendingIntent pendingIntent = null;
                String strU15 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iA9) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        iU11 = hi5.u0(parcel, i12);
                    } else if (c8 == 2) {
                        iU12 = hi5.u0(parcel, i12);
                    } else if (c8 == 3) {
                        pendingIntent = (PendingIntent) hi5.T(parcel, i12, PendingIntent.CREATOR);
                    } else if (c8 == 4) {
                        strU15 = hi5.U(parcel, i12);
                    } else if (c8 != 5) {
                        hi5.y0(parcel, i12);
                    } else {
                        int iV4 = hi5.v0(parcel, i12);
                        if (iV4 == 0) {
                            numValueOf = null;
                        } else {
                            if (iV4 != 4) {
                                String hexString = Integer.toHexString(iV4);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(iV4).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(iV4);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new av6(sb.toString(), parcel);
                            }
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                hi5.Y(parcel, iA9);
                return new x11(iU11, iU12, pendingIntent, strU15, numValueOf);
            case 19:
                int iA10 = hi5.A0(parcel);
                while (parcel.dataPosition() < iA10) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        hi5.y0(parcel, i13);
                    } else {
                        intent = (Intent) hi5.T(parcel, i13, Intent.CREATOR);
                    }
                }
                hi5.Y(parcel, iA10);
                return new av0(intent);
            case 20:
                int iA11 = hi5.A0(parcel);
                int iU13 = 0;
                boolean zT3 = false;
                boolean zT4 = false;
                int iU14 = 0;
                int iU15 = 0;
                while (parcel.dataPosition() < iA11) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        iU13 = hi5.u0(parcel, i14);
                    } else if (c9 == 2) {
                        zT3 = hi5.t0(parcel, i14);
                    } else if (c9 == 3) {
                        zT4 = hi5.t0(parcel, i14);
                    } else if (c9 == 4) {
                        iU14 = hi5.u0(parcel, i14);
                    } else if (c9 != 5) {
                        hi5.y0(parcel, i14);
                    } else {
                        iU15 = hi5.u0(parcel, i14);
                    }
                }
                hi5.Y(parcel, iA11);
                return new xl6(iU13, zT3, zT4, iU14, iU15);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                int iA12 = hi5.A0(parcel);
                long j5 = -1;
                boolean zT5 = false;
                int iU16 = 0;
                String strU16 = null;
                while (parcel.dataPosition() < iA12) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        strU16 = hi5.U(parcel, i15);
                    } else if (c10 == 2) {
                        iU16 = hi5.u0(parcel, i15);
                    } else if (c10 == 3) {
                        hi5.D0(parcel, i15, 8);
                        j5 = parcel.readLong();
                    } else if (c10 != 4) {
                        hi5.y0(parcel, i15);
                    } else {
                        zT5 = hi5.t0(parcel, i15);
                    }
                }
                hi5.Y(parcel, iA12);
                return new k82(j5, strU16, zT5, iU16);
            case 22:
                return new ha9(parcel.readStrongBinder());
            case 23:
                int iA13 = hi5.A0(parcel);
                boolean zT6 = true;
                int iU17 = 0;
                int iU18 = 0;
                while (parcel.dataPosition() < iA13) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        iU0 = hi5.u0(parcel, i16);
                    } else if (c11 == 2) {
                        iU17 = hi5.u0(parcel, i16);
                    } else if (c11 == 3) {
                        iU18 = hi5.u0(parcel, i16);
                    } else if (c11 != 4) {
                        hi5.y0(parcel, i16);
                    } else {
                        zT6 = hi5.t0(parcel, i16);
                    }
                }
                hi5.Y(parcel, iA13);
                return new zx0(iU0, iU17, iU18, zT6);
            case 24:
                int iA14 = hi5.A0(parcel);
                while (parcel.dataPosition() < iA14) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        iU0 = hi5.u0(parcel, i17);
                    } else if (c12 != 2) {
                        hi5.y0(parcel, i17);
                    } else {
                        strU2 = hi5.U(parcel, i17);
                    }
                }
                hi5.Y(parcel, iA14);
                return new Scope(iU0, strU2);
            case 25:
                int iA15 = hi5.A0(parcel);
                PendingIntent pendingIntent2 = null;
                x11 x11Var3 = null;
                while (parcel.dataPosition() < iA15) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        iU0 = hi5.u0(parcel, i18);
                    } else if (c13 == 2) {
                        strU = hi5.U(parcel, i18);
                    } else if (c13 == 3) {
                        pendingIntent2 = (PendingIntent) hi5.T(parcel, i18, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        hi5.y0(parcel, i18);
                    } else {
                        x11Var3 = (x11) hi5.T(parcel, i18, x11.CREATOR);
                    }
                }
                hi5.Y(parcel, iA15);
                return new Status(iU0, strU, pendingIntent2, x11Var3);
            case 26:
                int iA16 = hi5.A0(parcel);
                k82[] k82VarArr = null;
                c21 c21Var = null;
                while (parcel.dataPosition() < iA16) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 1) {
                        bundleS = hi5.S(parcel, i19);
                    } else if (c14 == 2) {
                        k82VarArr = (k82[]) hi5.V(parcel, i19, k82.CREATOR);
                    } else if (c14 == 3) {
                        iU0 = hi5.u0(parcel, i19);
                    } else if (c14 != 4) {
                        hi5.y0(parcel, i19);
                    } else {
                        c21Var = (c21) hi5.T(parcel, i19, c21.CREATOR);
                    }
                }
                hi5.Y(parcel, iA16);
                qa9 qa9Var = new qa9();
                qa9Var.X = bundleS;
                qa9Var.Y = k82VarArr;
                qa9Var.Z = iU0;
                qa9Var.f0 = c21Var;
                return qa9Var;
            case 27:
                int iA17 = hi5.A0(parcel);
                boolean zT7 = false;
                boolean zT8 = false;
                int iU19 = 0;
                xl6 xl6Var = null;
                int[] iArr3 = null;
                int[] iArr4 = null;
                while (parcel.dataPosition() < iA17) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            xl6Var = (xl6) hi5.T(parcel, i20, xl6.CREATOR);
                            break;
                        case 2:
                            zT7 = hi5.t0(parcel, i20);
                            break;
                        case 3:
                            zT8 = hi5.t0(parcel, i20);
                            break;
                        case 4:
                            int iV5 = hi5.v0(parcel, i20);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iV5 != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition5 + iV5);
                                iArr3 = iArrCreateIntArray;
                            } else {
                                iArr3 = null;
                            }
                            break;
                        case 5:
                            iU19 = hi5.u0(parcel, i20);
                            break;
                        case 6:
                            int iV6 = hi5.v0(parcel, i20);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iV6 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition6 + iV6);
                                iArr4 = iArrCreateIntArray2;
                            } else {
                                iArr4 = null;
                            }
                            break;
                        default:
                            hi5.y0(parcel, i20);
                            break;
                    }
                }
                hi5.Y(parcel, iA17);
                return new c21(xl6Var, zT7, zT8, iArr3, iU19, iArr4);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                int iA18 = hi5.A0(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = sr2.q0;
                k82[] k82VarArr2 = sr2.r0;
                k82[] k82VarArr3 = k82VarArr2;
                int iU20 = 0;
                int iU21 = 0;
                int iU22 = 0;
                boolean zT9 = false;
                int iU23 = 0;
                boolean zT10 = false;
                String strU17 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String strU18 = null;
                while (parcel.dataPosition() < iA18) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            iU20 = hi5.u0(parcel, i21);
                            break;
                        case 2:
                            iU21 = hi5.u0(parcel, i21);
                            break;
                        case 3:
                            iU22 = hi5.u0(parcel, i21);
                            break;
                        case 4:
                            strU17 = hi5.U(parcel, i21);
                            break;
                        case 5:
                            int iV7 = hi5.v0(parcel, i21);
                            int iDataPosition7 = parcel.dataPosition();
                            if (iV7 != 0) {
                                IBinder strongBinder2 = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition7 + iV7);
                                iBinder2 = strongBinder2;
                            } else {
                                iBinder2 = null;
                            }
                            break;
                        case 6:
                            scopeArr = (Scope[]) hi5.V(parcel, i21, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = hi5.S(parcel, i21);
                            break;
                        case '\b':
                            account2 = (Account) hi5.T(parcel, i21, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            hi5.y0(parcel, i21);
                            break;
                        case '\n':
                            k82VarArr2 = (k82[]) hi5.V(parcel, i21, k82.CREATOR);
                            break;
                        case 11:
                            k82VarArr3 = (k82[]) hi5.V(parcel, i21, k82.CREATOR);
                            break;
                        case FileClientSessionCache.MAX_SIZE /* 12 */:
                            zT9 = hi5.t0(parcel, i21);
                            break;
                        case '\r':
                            iU23 = hi5.u0(parcel, i21);
                            break;
                        case 14:
                            zT10 = hi5.t0(parcel, i21);
                            break;
                        case 15:
                            strU18 = hi5.U(parcel, i21);
                            break;
                    }
                }
                hi5.Y(parcel, iA18);
                return new sr2(iU20, iU21, iU22, strU17, iBinder2, scopeArr, bundle, account2, k82VarArr2, k82VarArr3, zT9, iU23, zT10, strU18);
            default:
                int iA19 = hi5.A0(parcel);
                int iU24 = 0;
                String strU19 = null;
                String strU20 = null;
                String strU21 = null;
                String strU22 = null;
                String strU23 = null;
                String strU24 = null;
                while (parcel.dataPosition() < iA19) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            strU19 = hi5.U(parcel, i22);
                            break;
                        case 2:
                            strU20 = hi5.U(parcel, i22);
                            break;
                        case 3:
                            strU21 = hi5.U(parcel, i22);
                            break;
                        case 4:
                            strU22 = hi5.U(parcel, i22);
                            break;
                        case 5:
                            strU23 = hi5.U(parcel, i22);
                            break;
                        case 6:
                            iU24 = hi5.u0(parcel, i22);
                            break;
                        case 7:
                            strU24 = hi5.U(parcel, i22);
                            break;
                        default:
                            hi5.y0(parcel, i22);
                            break;
                    }
                }
                hi5.Y(parcel, iA19);
                return new oc6(strU19, strU20, strU21, strU22, strU23, iU24, strU24);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mg7[i];
            case 1:
                return new SubId[i];
            case 2:
                return new sq7[i];
            case 3:
                return new cg8[i];
            case 4:
                return new dg8[i];
            case 5:
                return new eg8[i];
            case 6:
                return new fg8[i];
            case 7:
                return new zo8[i];
            case 8:
                return new yp8[i];
            case 9:
                return new i28[i];
            case 10:
                return new a89[i];
            case 11:
                return new GoogleSignInAccount[i];
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new e89[i];
            case 13:
                return new w89[i];
            case 14:
                return new e99[i];
            case 15:
                return new ov4[i];
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new j99[i];
            case 17:
                return new k99[i];
            case 18:
                return new x11[i];
            case 19:
                return new av0[i];
            case 20:
                return new xl6[i];
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new k82[i];
            case 22:
                return new ha9[i];
            case 23:
                return new zx0[i];
            case 24:
                return new Scope[i];
            case 25:
                return new Status[i];
            case 26:
                return new qa9[i];
            case 27:
                return new c21[i];
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return new sr2[i];
            default:
                return new oc6[i];
        }
    }
}
