package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r41 implements q41, s41 {
    public final /* synthetic */ byte a;
    public Object b;
    public byte c;
    public int d;
    public Comparable e;
    public Object f;

    public r41(r41 r41Var) {
        this.a = (byte) 1;
        ClipData clipData = (ClipData) r41Var.b;
        clipData.getClass();
        this.b = clipData;
        byte b = r41Var.c;
        mb6.p("source", b, 0, 5);
        this.c = b;
        int i = r41Var.d;
        if ((i & 1) != i) {
            em7.i("Requested flags 0x", Integer.toHexString(i), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.d = i;
        this.e = (Uri) r41Var.e;
        this.f = (Bundle) r41Var.f;
    }

    public static String g(xa2 xa2Var) {
        xa2Var.a();
        uc2 uc2Var = xa2Var.c;
        String str = uc2Var.e;
        if (str != null) {
            return str;
        }
        xa2Var.a();
        String str2 = uc2Var.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    @Override // defpackage.s41
    public ClipData a() {
        return (ClipData) this.b;
    }

    @Override // defpackage.q41
    public void b(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.q41
    public t41 build() {
        return new t41(new r41(this));
    }

    @Override // defpackage.q41
    public void c(int i) {
        this.d = i;
    }

    @Override // defpackage.s41
    public int d() {
        return this.d;
    }

    @Override // defpackage.s41
    public ContentInfo e() {
        return null;
    }

    public synchronized String f() {
        try {
            if (((String) this.e) == null) {
                j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.e;
    }

    @Override // defpackage.s41
    public int getSource() {
        return this.c;
    }

    public synchronized int h() {
        PackageInfo packageInfo;
        try {
            if (this.d == 0) {
                try {
                    packageInfo = ((Context) this.b).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e) {
                    e.toString();
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    this.d = packageInfo.versionCode;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0045 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x0020, B:15:0x0026, B:17:0x0038, B:19:0x003e, B:24:0x0045, B:26:0x0058, B:28:0x005e, B:31:0x0063, B:33:0x0069, B:34:0x006d), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x0020, B:15:0x0026, B:17:0x0038, B:19:0x003e, B:24:0x0045, B:26:0x0058, B:28:0x005e, B:31:0x0063, B:33:0x0069, B:34:0x006d), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x0020, B:15:0x0026, B:17:0x0038, B:19:0x003e, B:24:0x0045, B:26:0x0058, B:28:0x005e, B:31:0x0063, B:33:0x0069, B:34:0x006d), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x0020, B:15:0x0026, B:17:0x0038, B:19:0x003e, B:24:0x0045, B:26:0x0058, B:28:0x005e, B:31:0x0063, B:33:0x0069, B:34:0x006d), top: B:42:0x0001 }] */
    public boolean i() {
        byte b;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            b = this.c;
            if (b == 0) {
                PackageManager packageManager = ((Context) this.b).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    b = 0;
                } else if (zc1.T()) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null) {
                        if (zc1.T()) {
                            this.c = (byte) 2;
                            b = 2;
                        } else {
                            this.c = (byte) 1;
                            b = 1;
                        }
                    } else if (zc1.T()) {
                        this.c = (byte) 2;
                        b = 2;
                    } else {
                        this.c = (byte) 1;
                        b = 1;
                    }
                } else {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent3.setPackage("com.google.android.gms");
                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                        if (listQueryBroadcastReceivers == null && listQueryBroadcastReceivers.size() > 0) {
                            this.c = (byte) 2;
                            b = 2;
                        } else if (zc1.T()) {
                            this.c = (byte) 2;
                            b = 2;
                        } else {
                            this.c = (byte) 1;
                            b = 1;
                        }
                    } else {
                        this.c = (byte) 1;
                        b = 1;
                    }
                }
            }
        }
        return b != 0;
    }

    public synchronized void j() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.b).getPackageManager().getPackageInfo(((Context) this.b).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.e = Integer.toString(packageInfo.versionCode);
            this.f = packageInfo.versionName;
        }
    }

    @Override // defpackage.q41
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.a) {
            case 1:
                Uri uri = (Uri) this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.b).getDescription());
                sb.append(", source=");
                byte b = this.c;
                if (b == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (b == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (b == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (b == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (b != 4) {
                    strValueOf = b != 5 ? String.valueOf((int) b) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i = this.d;
                sb.append((i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i));
                String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
                if (uri == null) {
                    str = _UrlKt.FRAGMENT_ENCODE_SET;
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                if (((Bundle) this.f) != null) {
                    str2 = ", hasExtras";
                }
                return oi0.p(sb, str2, "}");
            default:
                return super.toString();
        }
    }

    public r41(Context context) {
        this.a = (byte) 2;
        this.c = (byte) 0;
        this.b = context;
    }

    public /* synthetic */ r41() {
        this.a = (byte) 0;
    }
}
