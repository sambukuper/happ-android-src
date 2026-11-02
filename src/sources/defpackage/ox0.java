package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ox0 {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Code duplicated, block: B:124:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:222:0x029f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77, types: [int] */
    public static mj0 a(FirebaseMessagingService firebaseMessagingService, q02 q02Var) {
        Bundle bundle;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        byte b;
        PendingIntent activity;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        int i;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
        }
        Bundle bundle2 = bundle;
        String strM = q02Var.M("gcm.n.android_channel_id");
        int i2 = 0;
        if (Build.VERSION.SDK_INT < 26) {
            strM = null;
        } else {
            try {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion < 26) {
                    strM = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strM) || notificationManager.getNotificationChannel(strM) == null) {
                        strM = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (TextUtils.isEmpty(strM) || notificationManager.getNotificationChannel(strM) == null) {
                            strM = "fcm_fallback_notification_channel";
                            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                                int identifier2 = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", identifier2 == 0 ? "Misc" : firebaseMessagingService.getString(identifier2), 3));
                            }
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String packageName = firebaseMessagingService.getPackageName();
        Resources resources = firebaseMessagingService.getResources();
        PackageManager packageManager = firebaseMessagingService.getPackageManager();
        r65 r65Var = new r65(firebaseMessagingService, strM);
        String strK = q02Var.K(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strK)) {
            r65Var.e = r65.c(strK);
        }
        String strK2 = q02Var.K(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strK2)) {
            r65Var.f = r65.c(strK2);
            q65 q65Var = new q65();
            q65Var.e = r65.c(strK2);
            r65Var.f(q65Var);
        }
        String strM2 = q02Var.M("gcm.n.icon");
        if (TextUtils.isEmpty(strM2) || (((identifier = resources.getIdentifier(strM2, "drawable", packageName)) == 0 || !b(resources, identifier)) && ((identifier = resources.getIdentifier(strM2, "mipmap", packageName)) == 0 || !b(resources, identifier)))) {
            identifier = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier == 0 || !b(resources, identifier)) {
                try {
                    identifier = packageManager.getApplicationInfo(packageName, 0).icon;
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.toString();
                }
            }
            if (identifier == 0 || !b(resources, identifier)) {
                identifier = 17301651;
            }
        }
        Notification notification = r65Var.v;
        notification.icon = identifier;
        String strM3 = q02Var.M("gcm.n.sound2");
        if (TextUtils.isEmpty(strM3)) {
            strM3 = q02Var.M("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strM3)) {
            defaultUri = null;
        } else if ("default".equals(strM3) || resources.getIdentifier(strM3, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strM3);
        }
        byte b2 = 4;
        if (defaultUri != null) {
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        String strM4 = q02Var.M("gcm.n.click_action");
        if (TextUtils.isEmpty(strM4)) {
            String strM5 = q02Var.M("gcm.n.link_android");
            if (TextUtils.isEmpty(strM5)) {
                strM5 = q02Var.M("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strM5) ? Uri.parse(strM5) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
            }
        } else {
            launchIntentForPackage = new Intent(strM4);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger = a;
        if (launchIntentForPackage == null) {
            b = 4;
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) q02Var.Y;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                byte b3 = b2;
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
                b2 = b3;
            }
            b = b2;
            launchIntentForPackage.putExtras(bundle4);
            if (q02Var.F("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", q02Var.O());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        r65Var.g = activity;
        PendingIntent broadcast = !q02Var.F("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(q02Var.O())), 1140850688);
        if (broadcast != null) {
            notification.deleteIntent = broadcast;
        }
        String strM6 = q02Var.M("gcm.n.color");
        if (TextUtils.isEmpty(strM6)) {
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strM6));
            } catch (IllegalArgumentException unused2) {
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i != 0) {
                    try {
                        numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i));
                    } catch (Resources.NotFoundException unused3) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            r65Var.r = numValueOf.intValue();
        }
        r65Var.d(16, !q02Var.F("gcm.n.sticky"));
        r65Var.o = q02Var.F("gcm.n.local_only");
        String strM7 = q02Var.M("gcm.n.ticker");
        if (strM7 != null) {
            notification.tickerText = r65.c(strM7);
        }
        Integer numI = q02Var.I("gcm.n.notification_priority");
        if (numI == null || numI.intValue() < -2 || numI.intValue() > 2) {
            numI = null;
        }
        if (numI != null) {
            r65Var.j = numI.intValue();
        }
        Integer numI2 = q02Var.I("gcm.n.visibility");
        if (numI2 == null || numI2.intValue() < -1 || numI2.intValue() > 1) {
            numI2 = null;
        }
        if (numI2 != null) {
            r65Var.s = numI2.intValue();
        }
        Integer numI3 = q02Var.I("gcm.n.notification_count");
        if (numI3 == null || numI3.intValue() < 0) {
            numI3 = null;
        }
        if (numI3 != null) {
            r65Var.i = numI3.intValue();
        }
        String strM8 = q02Var.M("gcm.n.event_time");
        if (TextUtils.isEmpty(strM8)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strM8));
            } catch (NumberFormatException unused4) {
                q02.T("gcm.n.event_time");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            r65Var.k = true;
            notification.when = lValueOf.longValue();
        }
        JSONArray jSONArrayJ = q02Var.J("gcm.n.vibrate_timings");
        if (jSONArrayJ == null) {
            jArr = null;
        } else {
            try {
                if (jSONArrayJ.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArrayJ.length();
                jArr = new long[length];
                for (int i3 = 0; i3 < length; i3++) {
                    jArr[i3] = jSONArrayJ.optLong(i3);
                }
            } catch (NumberFormatException | JSONException unused5) {
                jSONArrayJ.toString();
                jArr = null;
            }
        }
        if (jArr != null) {
            notification.vibrate = jArr;
        }
        JSONArray jSONArrayJ2 = q02Var.J("gcm.n.light_settings");
        if (jSONArrayJ2 == null) {
            iArr = null;
        } else {
            int[] iArr2 = new int[3];
            try {
                if (jSONArrayJ2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArrayJ2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr2[0] = color;
                iArr2[1] = jSONArrayJ2.optInt(1);
                iArr2[2] = jSONArrayJ2.optInt(2);
                iArr = iArr2;
            } catch (IllegalArgumentException e3) {
                jSONArrayJ2.toString();
                e3.getMessage();
                iArr = null;
            } catch (JSONException unused6) {
                jSONArrayJ2.toString();
                iArr = null;
            }
        }
        if (iArr != null) {
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            notification.ledARGB = i4;
            notification.ledOnMS = i5;
            notification.ledOffMS = i6;
            if (i5 != 0 && i6 != 0) {
                i2 = 1;
            }
            notification.flags = (notification.flags & (-2)) | i2;
        }
        boolean zF = q02Var.F("gcm.n.default_sound");
        ?? r0 = zF;
        if (q02Var.F("gcm.n.default_vibrate_timings")) {
            r0 = (zF ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (q02Var.F("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        notification.defaults = r1;
        if ((r1 & 4) != 0) {
            notification.flags |= 1;
        }
        String strM9 = q02Var.M("gcm.n.tag");
        if (TextUtils.isEmpty(strM9)) {
            strM9 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return new mj0(r65Var, strM9, b);
    }

    public static boolean b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable);
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
