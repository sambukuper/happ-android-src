.class public final Lsu/happ/proxyutility/service/XRayProxyOnlyService;
.super Landroid/app/Service;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh69;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lsu/happ/proxyutility/service/XRayProxyOnlyService;",
        "Landroid/app/Service;",
        "Lh69;",
        "<init>",
        "()V",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic k0:I


# instance fields
.field public final X:Lvz7;

.field public final Y:Lvz7;

.field public final Z:Lvz7;

.field public final f0:Lvz7;

.field public final g0:Lvz7;

.field public final h0:Lvz7;

.field public i0:J

.field public j0:Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lng8;

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->X:Lvz7;

    .line 17
    .line 18
    new-instance v0, Lf69;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, p0, v1}, Lf69;-><init>(Lsu/happ/proxyutility/service/XRayProxyOnlyService;B)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lvz7;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->Y:Lvz7;

    .line 30
    .line 31
    new-instance v0, Lng8;

    .line 32
    .line 33
    const/16 v1, 0x1b

    .line 34
    .line 35
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lvz7;

    .line 39
    .line 40
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->Z:Lvz7;

    .line 44
    .line 45
    new-instance v0, Lf69;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-direct {v0, p0, v1}, Lf69;-><init>(Lsu/happ/proxyutility/service/XRayProxyOnlyService;B)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Lvz7;

    .line 52
    .line 53
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->f0:Lvz7;

    .line 57
    .line 58
    new-instance v0, Lf69;

    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    invoke-direct {v0, p0, v1}, Lf69;-><init>(Lsu/happ/proxyutility/service/XRayProxyOnlyService;B)V

    .line 62
    .line 63
    .line 64
    new-instance v1, Lvz7;

    .line 65
    .line 66
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->g0:Lvz7;

    .line 70
    .line 71
    new-instance v0, Lng8;

    .line 72
    .line 73
    const/16 v1, 0x1c

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Lvz7;

    .line 79
    .line 80
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->h0:Lvz7;

    .line 84
    .line 85
    const-wide/16 v0, -0x1

    .line 86
    .line 87
    iput-wide v0, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->i0:J

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final a()Lri7;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->g0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lri7;

    .line 8
    .line 9
    return-object p0
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    sget-object v0, Lss8;->a:Lss8;

    .line 4
    .line 5
    invoke-static {}, Lss8;->n()Ljava/util/Locale;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, v0}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Landroid/os/LocaleList;

    .line 21
    .line 22
    filled-new-array {v0}, [Ljava/util/Locale;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {v2, v0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Landroid/os/LocaleList;->setDefault(Landroid/os/LocaleList;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lpz7;->a()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    iget v0, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 45
    .line 46
    and-int/lit8 v0, v0, -0x10

    .line 47
    .line 48
    or-int/lit8 v0, v0, 0x4

    .line 49
    .line 50
    iput v0, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 51
    .line 52
    :cond_0
    new-instance v0, Landroid/content/ContextWrapper;

    .line 53
    .line 54
    invoke-direct {v0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v0, 0x0

    .line 59
    :goto_0
    invoke-super {p0, v0}, Landroid/app/Service;->attachBaseContext(Landroid/content/Context;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->j0:Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->j0:Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->i0:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()V
    .locals 0

    .line 1
    return-void
.end method

.method public final e()Ljz8;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->Y:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljz8;

    .line 8
    .line 9
    return-object p0
.end method

.method public final f()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g()Landroid/app/Service;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final h()Lj61;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->f0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lj61;

    .line 8
    .line 9
    return-object p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j(Lsu/happ/proxyutility/dto/ServerConfig;)V
    .locals 6

    .line 1
    invoke-static {}, Ln67;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->b()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    return-void

    .line 20
    :cond_2
    :goto_1
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->j0:Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {v0}, Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;->b()V

    .line 25
    .line 26
    .line 27
    :cond_3
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->j0:Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;

    .line 28
    .line 29
    invoke-static {}, Ln67;->a()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v2, "--no-domain"

    .line 38
    .line 39
    const-string v3, "--ip"

    .line 40
    .line 41
    const-string v4, "127.0.0.1"

    .line 42
    .line 43
    const-string v5, "--port"

    .line 44
    .line 45
    filled-new-array {v2, v3, v4, v5, v0}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {}, Ln67;->e()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    iget-object p1, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->X:Lvz7;

    .line 60
    .line 61
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lcom/tencent/mmkv/MMKV;

    .line 66
    .line 67
    const-string v1, "pref_antifilter_params"

    .line 68
    .line 69
    invoke-virtual {p1, v1}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    if-eqz p1, :cond_5

    .line 75
    .line 76
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->b()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-lez v2, :cond_5

    .line 87
    .line 88
    move-object v1, p1

    .line 89
    :cond_5
    :goto_2
    if-eqz v1, :cond_6

    .line 90
    .line 91
    const/4 p1, 0x1

    .line 92
    new-array p1, p1, [C

    .line 93
    .line 94
    const/16 v2, 0x20

    .line 95
    .line 96
    const/4 v3, 0x0

    .line 97
    aput-char v2, p1, v3

    .line 98
    .line 99
    invoke-static {v1, p1}, Lfm7;->E0(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 104
    .line 105
    .line 106
    :cond_6
    new-instance p1, Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;

    .line 107
    .line 108
    new-instance v1, Lg69;

    .line 109
    .line 110
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-direct {p1, v1}, Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;-><init>(Lsu/happ/proxyutility/service/AntiFilterVpnSupportsSet;)V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->j0:Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;->a(Ljava/util/ArrayList;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final onCreate()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ln69;->a:Llibxray/XRayPoint;

    .line 5
    .line 6
    new-instance v0, Ljava/lang/ref/SoftReference;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ln69;->a(Ljava/lang/ref/SoftReference;)V

    .line 12
    .line 13
    .line 14
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v1, 0x1a

    .line 17
    .line 18
    if-lt v0, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->e()Ljz8;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljz8;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    :try_start_0
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->h0:Lvz7;

    .line 28
    .line 29
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lsu/happ/proxyutility/service/XRayServiceManager$VpnMessageReceiver;

    .line 34
    .line 35
    new-instance v1, Landroid/content/IntentFilter;

    .line 36
    .line 37
    const-string v2, "su.happ.proxyutility.action.service"

    .line 38
    .line 39
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "android.intent.action.SCREEN_ON"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v2, "android.intent.action.SCREEN_OFF"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v2, "android.intent.action.USER_PRESENT"

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x2

    .line 58
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {p0, v0, v1, v2}, Lue3;->I(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/Integer;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 68
    .line 69
    if-nez v0, :cond_1

    .line 70
    .line 71
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 72
    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    return-void

    .line 76
    :cond_1
    throw p0
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->j0:Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->j0:Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;

    .line 13
    .line 14
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->e()Ljz8;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(I)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Ln69;->a:Llibxray/XRayPoint;

    .line 26
    .line 27
    const/4 v0, 0x6

    .line 28
    invoke-static {p0, v0}, Ln69;->e(Lh69;I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->h0:Lvz7;

    .line 32
    .line 33
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lsu/happ/proxyutility/service/XRayServiceManager$VpnMessageReceiver;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide p2

    .line 5
    iput-wide p2, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->i0:J

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string p3, "silent"

    .line 11
    .line 12
    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    :cond_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const-string p3, "guid"

    .line 19
    .line 20
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p3, p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->Z:Lvz7;

    .line 27
    .line 28
    invoke-virtual {p3}, Lvz7;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Lc16;

    .line 33
    .line 34
    invoke-virtual {p3, p1}, Lc16;->b(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sget-object p3, Lkw4;->a:Lkw4;

    .line 38
    .line 39
    invoke-static {p1}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-static {p0}, Lu15;->A(Landroid/app/Service;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Ln69;->a:Llibxray/XRayPoint;

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-static {p0, p1, p2}, Ln69;->c(Lh69;Landroid/os/ParcelFileDescriptor;Z)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x1

    .line 52
    return p0
.end method
