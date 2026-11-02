package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.leanback.widget.GridLayoutManager;
import defpackage.l99;
import java.util.ArrayList;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.ProviderId;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l99 implements Parcelable.Creator {
    public static final l99 b = new l99(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ l99(byte b2) {
        this.a = b2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        ProviderId providerIdCreateFromParcel;
        Uri mediaUri;
        Bundle bundle;
        boolean zT0 = false;
        zx0 zx0Var = null;
        strD = null;
        String strD = null;
        switch (this.a) {
            case 0:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return so.f0;
                }
                int iA0 = hi5.A0(parcel);
                while (parcel.dataPosition() < iA0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        zx0Var = (zx0) hi5.T(parcel, i, zx0.CREATOR);
                    } else if (c != 2) {
                        hi5.y0(parcel, i);
                    } else {
                        zT0 = hi5.t0(parcel, i);
                    }
                }
                hi5.Y(parcel, iA0);
                return new so(zx0Var, zT0);
            case 1:
                parcel.getClass();
                if (parcel.readInt() != 0 && (providerIdCreateFromParcel = ProviderId.CREATOR.createFromParcel(parcel)) != null) {
                    strD = providerIdCreateFromParcel.getValue();
                }
                return new w(strD);
            case 2:
                parcel.getClass();
                return new i6(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 3:
                mq mqVar = new mq(parcel);
                mqVar.X = parcel.readByte() != 0;
                return mqVar;
            case 4:
                return new s00(parcel);
            case 5:
                return new t00(parcel);
            case 6:
                m20 m20Var = new m20(parcel);
                m20Var.X = parcel.readFloat();
                m20Var.Y = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                m20Var.Z = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                m20Var.f0 = parcel.readFloat();
                m20Var.g0 = parcel.createBooleanArray()[0];
                return m20Var;
            case 7:
                return new bd0((ay4) parcel.readParcelable(ay4.class.getClassLoader()), (ay4) parcel.readParcelable(ay4.class.getClassLoader()), (qc1) parcel.readParcelable(qc1.class.getClassLoader()), (ay4) parcel.readParcelable(ay4.class.getClassLoader()), parcel.readInt());
            case 8:
                parcel.getClass();
                Parcelable.Creator<ga1> creator = ga1.CREATOR;
                return new da1(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
            case 9:
                parcel.getClass();
                return new ga1(parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                return new qc1(parcel.readLong());
            case 11:
                return new gf1(parcel.readInt());
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                parcel.getClass();
                return b12.valueOf(parcel.readString());
            case 13:
                zd2 zd2Var = new zd2();
                zd2Var.X = parcel.readInt();
                zd2Var.Y = parcel.readInt();
                return zd2Var;
            case 14:
                il2 il2Var = new il2();
                il2Var.X = parcel.readString();
                il2Var.Y = parcel.readInt();
                return il2Var;
            case 15:
                nl2 nl2Var = new nl2();
                nl2Var.g0 = null;
                nl2Var.h0 = new ArrayList();
                nl2Var.i0 = new ArrayList();
                nl2Var.X = parcel.createStringArrayList();
                nl2Var.Y = parcel.createStringArrayList();
                nl2Var.Z = (s00[]) parcel.createTypedArray(s00.CREATOR);
                nl2Var.f0 = parcel.readInt();
                nl2Var.g0 = parcel.readString();
                nl2Var.h0 = parcel.createStringArrayList();
                nl2Var.i0 = parcel.createTypedArrayList(t00.CREATOR);
                nl2Var.j0 = parcel.createTypedArrayList(il2.CREATOR);
                return nl2Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new tl2(parcel);
            case 17:
                nu2 nu2Var = new nu2();
                nu2Var.Y = Bundle.EMPTY;
                nu2Var.X = parcel.readInt();
                nu2Var.Y = parcel.readBundle(GridLayoutManager.class.getClassLoader());
                return nu2Var;
            case 18:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new uf3((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 19:
                parcel.getClass();
                return new p24(parcel.readString());
            case 20:
                ja4 ja4Var = new ja4();
                ja4Var.X = parcel.readInt();
                ja4Var.Y = parcel.readInt();
                ja4Var.Z = parcel.readInt() == 1;
                return ja4Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                ar4 ar4Var = new ar4(parcel);
                ar4Var.X = ((Integer) parcel.readValue(ar4.class.getClassLoader())).intValue();
                return ar4Var;
            case 22:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new l99(22);
                    public final int X;
                    public final MediaDescriptionCompat Y;

                    {
                        this.X = parcel.readInt();
                        this.Y = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.X + ", mDescription=" + this.Y + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i2) {
                        parcel2.writeInt(this.X);
                        this.Y.writeToParcel(parcel2, i2);
                    }
                };
            case 23:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    os4.p(extras);
                    mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    mediaUri = null;
                }
                if (mediaUri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                mediaDescriptionCompat.k0 = objCreateFromParcel;
                return mediaDescriptionCompat;
            case 24:
                return new MediaMetadataCompat(parcel);
            case 25:
                return new MediaSessionCompat$QueueItem(parcel);
            case 26:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.X = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 27:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return ay4.c(parcel.readInt(), parcel.readInt());
            default:
                b35 b35Var = new b35(parcel);
                b35Var.X = parcel.readInt();
                return b35Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new so[i];
            case 1:
                return new w[i];
            case 2:
                return new i6[i];
            case 3:
                return new mq[i];
            case 4:
                return new s00[i];
            case 5:
                return new t00[i];
            case 6:
                return new m20[i];
            case 7:
                return new bd0[i];
            case 8:
                return new da1[i];
            case 9:
                return new ga1[i];
            case 10:
                return new qc1[i];
            case 11:
                return new gf1[i];
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new b12[i];
            case 13:
                return new zd2[i];
            case 14:
                return new il2[i];
            case 15:
                return new nl2[i];
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new tl2[i];
            case 17:
                return new nu2[i];
            case 18:
                return new uf3[i];
            case 19:
                return new p24[i];
            case 20:
                return new ja4[i];
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new ar4[i];
            case 22:
                return new MediaBrowserCompat$MediaItem[i];
            case 23:
                return new MediaDescriptionCompat[i];
            case 24:
                return new MediaMetadataCompat[i];
            case 25:
                return new MediaSessionCompat$QueueItem[i];
            case 26:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 27:
                return new MediaSessionCompat$Token[i];
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return new ay4[i];
            default:
                return new b35[i];
        }
    }
}
