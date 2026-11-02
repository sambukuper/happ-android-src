package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.api.Status;
import io.sentry.c2;
import java.lang.ref.WeakReference;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ms4 extends Binder implements IInterface {
    public final /* synthetic */ byte g = 0;
    public final Object h;

    public ms4() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.h = new WeakReference(null);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.g;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.g) {
            case 0:
                if (i == 1598968902) {
                    parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                    return true;
                }
                switch (i) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                        }
                        if (((WeakReference) this.h).get() == null) {
                            return true;
                        }
                        c2.m();
                        break;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        throw new AssertionError();
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        if (((WeakReference) this.h).get() == null) {
                            return true;
                        }
                        c2.m();
                        break;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        throw new AssertionError();
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                        throw new AssertionError();
                    case 6:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                        }
                        throw new AssertionError();
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                        }
                        throw new AssertionError();
                    case 8:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        throw new AssertionError();
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        if (((WeakReference) this.h).get() == null) {
                            return true;
                        }
                        c2.m();
                        break;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        if (((WeakReference) this.h).get() == null) {
                            return true;
                        }
                        c2.m();
                        break;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        if (((WeakReference) this.h).get() == null) {
                            return true;
                        }
                        c2.m();
                        break;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (((WeakReference) this.h).get() == null) {
                            return true;
                        }
                        c2.m();
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
                return false;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i3 = aa9.a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                String string = parcel.readString();
                so soVarCreateFromParcel = parcel.readInt() != 0 ? so.CREATOR.createFromParcel(parcel) : null;
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
                    sb.append("Parcel data not fully consumed, unread size: ");
                    sb.append(iDataAvail);
                    throw new BadParcelableException(sb.toString());
                }
                z18 z18Var = (z18) this.h;
                if (statusCreateFromParcel.X <= 0) {
                    z18Var.a(string);
                    return true;
                }
                z18Var.a.k(statusCreateFromParcel.Z != null ? new hf6(statusCreateFromParcel) : new pn(statusCreateFromParcel));
                return true;
        }
    }

    public ms4(h99 h99Var, z18 z18Var) {
        this.h = z18Var;
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }
}
