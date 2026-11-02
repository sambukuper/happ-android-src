package defpackage;

import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.RouteProfileId;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.ERoutingSettingsType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dh5 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ dh5(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        kd6 kd6Var;
        boolean z;
        m43 m43Var = null;
        Bundle bundleS = null;
        ArrayList arrayList2 = null;
        switch (this.a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                return new eh5(parcel);
            case 2:
                parcel.getClass();
                return new fh5(parcel);
            case 3:
                parcel.getClass();
                return new gh5(parcel);
            case 4:
                return new hh5(parcel);
            case 5:
                parcel.getClass();
                String string = parcel.readString();
                string.getClass();
                return new ih5(string, parcel.readInt());
            case 6:
                String string2 = parcel.readString();
                Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) creator.createFromParcel(parcel);
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) creator.createFromParcel(parcel);
                String string3 = parcel.readString();
                if (parcelFileDescriptor == null || parcelFileDescriptor2 == null) {
                    return null;
                }
                return new jh5(string2, parcelFileDescriptor.detachFd(), parcelFileDescriptor2.detachFd(), string3);
            case 7:
                return new kh5(parcel);
            case 8:
                return new lh5(parcel);
            case 9:
                mh5 mh5Var = new mh5();
                ClassLoader classLoader = mh5.class.getClassLoader();
                Network network = parcel.readInt() == 1 ? (Network) parcel.readParcelable(classLoader) : null;
                if (parcel.readInt() == 1) {
                    Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
                    arrayList = new ArrayList(parcelableArray.length);
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((Uri) parcelable);
                    }
                } else {
                    arrayList = null;
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.readInt() == 1 ? parcel.createStringArrayList() : null;
                zv7 zv7Var = new zv7((byte) 12);
                mh5Var.X = zv7Var;
                if (Build.VERSION.SDK_INT >= 28) {
                    zv7Var.Z = network;
                }
                if (arrayList != null) {
                    zv7Var.Y = arrayList;
                }
                if (arrayListCreateStringArrayList != null) {
                    zv7Var.X = arrayListCreateStringArrayList;
                }
                return mh5Var;
            case 10:
                return new nh5(parcel.readFloat());
            case 11:
                return new oh5(parcel.readInt());
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new ph5(parcel.readLong());
            case 13:
                return new sh5(parcel);
            case 14:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.X = parcel.readInt();
                parcelableVolumeInfo.Z = parcel.readInt();
                parcelableVolumeInfo.f0 = parcel.readInt();
                parcelableVolumeInfo.g0 = parcel.readInt();
                parcelableVolumeInfo.Y = parcel.readInt();
                return parcelableVolumeInfo;
            case 15:
                uh5 uh5Var = new uh5();
                String string4 = parcel.readInt() == 1 ? parcel.readString() : null;
                g62 g62Var = uh5.Y[parcel.readInt()];
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                ClassLoader classLoader2 = uh5.class.getClassLoader();
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList3.add((h49) ((yh5) parcel.readParcelable(classLoader2)).X);
                }
                if (parcel.readInt() == 1) {
                    int i3 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i3);
                    for (int i4 = 0; i4 < i3; i4++) {
                        arrayList4.add(((uh5) parcel.readParcelable(classLoader2)).X);
                    }
                    arrayList2 = arrayList4;
                }
                uh5Var.X = new th5(string4, g62Var, arrayList3, arrayList2);
                return uh5Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new vh5(parcel);
            case 17:
                return new wh5(parcel);
            case 18:
                return new xh5(parcel);
            case 19:
                return new yh5(parcel);
            case 20:
                return new zh5(parcel);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new ai5(parcel);
            case 22:
                return new PlaybackStateCompat(parcel);
            case 23:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 24:
                int iA0 = hi5.A0(parcel);
                while (parcel.dataPosition() < iA0) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        hi5.y0(parcel, i5);
                    } else {
                        bundleS = hi5.S(parcel, i5);
                    }
                }
                hi5.Y(parcel, iA0);
                return new hd6(bundleS);
            case 25:
                parcel.getClass();
                String str = od6.CREATOR.createFromParcel(parcel).X;
                da1 da1VarCreateFromParcel = da1.CREATOR.createFromParcel(parcel);
                long j = parcel.readLong();
                String string5 = parcel.readString();
                kd6 kd6VarValueOf = kd6.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z = true;
                    kd6Var = kd6VarValueOf;
                } else {
                    kd6Var = kd6VarValueOf;
                    z = false;
                }
                return new ld6(str, da1VarCreateFromParcel, j, string5, kd6Var, z);
            case 26:
                parcel.getClass();
                String string6 = parcel.readString();
                string6.getClass();
                return new od6(string6);
            case 27:
                zj6 zj6Var = new zj6();
                IBinder strongBinder = parcel.readStrongBinder();
                int i6 = yj6.h;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(m43.d);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m43)) {
                        l43 l43Var = new l43();
                        l43Var.g = strongBinder;
                        m43Var = l43Var;
                    } else {
                        m43Var = (m43) iInterfaceQueryLocalInterface;
                    }
                }
                zj6Var.X = m43Var;
                return zj6Var;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                parcel.getClass();
                return new fq6(RouteProfileId.CREATOR.createFromParcel(parcel).getValue(), parcel.readString(), ERoutingSettingsType.valueOf(parcel.readString()));
            default:
                kg7 kg7Var = new kg7();
                kg7Var.X = parcel.readInt();
                kg7Var.Y = parcel.readInt();
                kg7Var.f0 = parcel.readInt() == 1;
                int i7 = parcel.readInt();
                if (i7 > 0) {
                    int[] iArr = new int[i7];
                    kg7Var.Z = iArr;
                    parcel.readIntArray(iArr);
                }
                return kg7Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ParcelImpl[i];
            case 1:
                return new eh5[i];
            case 2:
                return new fh5[i];
            case 3:
                return new gh5[i];
            case 4:
                return new hh5[i];
            case 5:
                return new ih5[i];
            case 6:
                return new jh5[i];
            case 7:
                return new kh5[i];
            case 8:
                return new lh5[i];
            case 9:
                return new mh5[i];
            case 10:
                return new nh5[i];
            case 11:
                return new oh5[i];
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new ph5[i];
            case 13:
                return new sh5[i];
            case 14:
                return new ParcelableVolumeInfo[i];
            case 15:
                return new uh5[i];
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new vh5[i];
            case 17:
                return new wh5[i];
            case 18:
                return new xh5[i];
            case 19:
                return new yh5[i];
            case 20:
                return new zh5[i];
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new ai5[i];
            case 22:
                return new PlaybackStateCompat[i];
            case 23:
                return new RatingCompat[i];
            case 24:
                return new hd6[i];
            case 25:
                return new ld6[i];
            case 26:
                return new od6[i];
            case 27:
                return new zj6[i];
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return new fq6[i];
            default:
                return new kg7[i];
        }
    }
}
