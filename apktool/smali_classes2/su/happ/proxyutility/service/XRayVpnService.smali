.class public final Lsu/happ/proxyutility/service/XRayVpnService;
.super Landroid/net/VpnService;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh69;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lsu/happ/proxyutility/service/XRayVpnService;",
        "Landroid/net/VpnService;",
        "Lh69;",
        "<init>",
        "()V",
        "q69",
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
.field public static final synthetic v0:I


# instance fields
.field public final X:Lvz7;

.field public final Y:Lvz7;

.field public final Z:Lvz7;

.field public final f0:Lvz7;

.field public final g0:Lvz7;

.field public final h0:Lvz7;

.field public final i0:Lvz7;

.field public j0:Landroid/os/ParcelFileDescriptor;

.field public volatile k0:Z

.field public volatile l0:Z

.field public m0:J

.field public n0:Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;

.field public o0:Lsu/happ/tunnel/TProxyService;

.field public p0:Z

.field public q0:Lsu/happ/proxyutility/dto/ServerConfig;

.field public final r0:Lvz7;

.field public final s0:Lvz7;

.field public final t0:Lvz7;

.field public final u0:Lvz7;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/net/VpnService;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li69;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-direct {v0, v1}, Li69;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lvz7;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->X:Lvz7;

    .line 16
    .line 17
    new-instance v0, Li69;

    .line 18
    .line 19
    const/16 v1, 0x9

    .line 20
    .line 21
    invoke-direct {v0, v1}, Li69;-><init>(B)V

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
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->Y:Lvz7;

    .line 30
    .line 31
    new-instance v0, Li69;

    .line 32
    .line 33
    const/16 v1, 0xa

    .line 34
    .line 35
    invoke-direct {v0, v1}, Li69;-><init>(B)V

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
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->Z:Lvz7;

    .line 44
    .line 45
    new-instance v0, Lp69;

    .line 46
    .line 47
    const/4 v1, 0x3

    .line 48
    invoke-direct {v0, p0, v1}, Lp69;-><init>(Lsu/happ/proxyutility/service/XRayVpnService;B)V

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
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->f0:Lvz7;

    .line 57
    .line 58
    new-instance v0, Lp69;

    .line 59
    .line 60
    const/4 v1, 0x4

    .line 61
    invoke-direct {v0, p0, v1}, Lp69;-><init>(Lsu/happ/proxyutility/service/XRayVpnService;B)V

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
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->g0:Lvz7;

    .line 70
    .line 71
    new-instance v0, Lp69;

    .line 72
    .line 73
    const/4 v1, 0x5

    .line 74
    invoke-direct {v0, p0, v1}, Lp69;-><init>(Lsu/happ/proxyutility/service/XRayVpnService;B)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Lvz7;

    .line 78
    .line 79
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 80
    .line 81
    .line 82
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->h0:Lvz7;

    .line 83
    .line 84
    new-instance v0, Li69;

    .line 85
    .line 86
    const/16 v1, 0xb

    .line 87
    .line 88
    invoke-direct {v0, v1}, Li69;-><init>(B)V

    .line 89
    .line 90
    .line 91
    new-instance v1, Lvz7;

    .line 92
    .line 93
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 94
    .line 95
    .line 96
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->i0:Lvz7;

    .line 97
    .line 98
    const-wide/16 v0, -0x1

    .line 99
    .line 100
    iput-wide v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->m0:J

    .line 101
    .line 102
    new-instance v0, Li69;

    .line 103
    .line 104
    const/16 v1, 0xc

    .line 105
    .line 106
    invoke-direct {v0, v1}, Li69;-><init>(B)V

    .line 107
    .line 108
    .line 109
    new-instance v1, Lvz7;

    .line 110
    .line 111
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 112
    .line 113
    .line 114
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->r0:Lvz7;

    .line 115
    .line 116
    new-instance v0, Lp69;

    .line 117
    .line 118
    const/4 v1, 0x6

    .line 119
    invoke-direct {v0, p0, v1}, Lp69;-><init>(Lsu/happ/proxyutility/service/XRayVpnService;B)V

    .line 120
    .line 121
    .line 122
    new-instance v1, Lvz7;

    .line 123
    .line 124
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 125
    .line 126
    .line 127
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->s0:Lvz7;

    .line 128
    .line 129
    new-instance v0, Lp69;

    .line 130
    .line 131
    const/4 v1, 0x0

    .line 132
    invoke-direct {v0, p0, v1}, Lp69;-><init>(Lsu/happ/proxyutility/service/XRayVpnService;B)V

    .line 133
    .line 134
    .line 135
    new-instance v1, Lvz7;

    .line 136
    .line 137
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 138
    .line 139
    .line 140
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->t0:Lvz7;

    .line 141
    .line 142
    new-instance v0, Li69;

    .line 143
    .line 144
    const/16 v1, 0x8

    .line 145
    .line 146
    invoke-direct {v0, v1}, Li69;-><init>(B)V

    .line 147
    .line 148
    .line 149
    new-instance v1, Lvz7;

    .line 150
    .line 151
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 152
    .line 153
    .line 154
    iput-object v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->u0:Lvz7;

    .line 155
    .line 156
    return-void
.end method

.method public static k(Landroid/net/VpnService$Builder;)V
    .locals 4

    .line 1
    sget-object v0, Lss8;->a:Lss8;

    .line 2
    .line 3
    invoke-static {}, Lss8;->o()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move-object v3, v2

    .line 27
    check-cast v3, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v3}, Lss8;->y(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p0, v1}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    return-void
.end method


# virtual methods
.method public final a()Lri7;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->h0:Lvz7;

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
    invoke-super {p0, v0}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->s()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->m0:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->q0:Lsu/happ/proxyutility/dto/ServerConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ln69;->g:Lsu/happ/proxyutility/dto/ServerConfig;

    .line 6
    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, v0, v1}, Lsu/happ/proxyutility/service/XRayVpnService;->q(Lsu/happ/proxyutility/dto/ServerConfig;Z)Landroid/net/VpnService$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    :try_start_0
    iget-object v2, p0, Lsu/happ/proxyutility/service/XRayVpnService;->j0:Landroid/os/ParcelFileDescriptor;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v2

    .line 23
    instance-of v3, v2, Ljava/lang/InterruptedException;

    .line 24
    .line 25
    if-nez v3, :cond_3

    .line 26
    .line 27
    instance-of v3, v2, Ljava/util/concurrent/CancellationException;

    .line 28
    .line 29
    if-nez v3, :cond_3

    .line 30
    .line 31
    :cond_1
    :goto_0
    iput-boolean v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->l0:Z

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lsu/happ/proxyutility/service/XRayVpnService;->p(Landroid/net/VpnService$Builder;)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ln67;->f()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    sget-object v0, Ln69;->a:Llibxray/XRayPoint;

    .line 43
    .line 44
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->j0:Landroid/os/ParcelFileDescriptor;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-static {p0, v0, v1}, Ln69;->c(Lh69;Landroid/os/ParcelFileDescriptor;Z)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->o()V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    throw v2

    .line 56
    :cond_4
    :goto_1
    return-void
.end method

.method public final e()Ljz8;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->f0:Lvz7;

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
    .locals 5

    .line 1
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->q0:Lsu/happ/proxyutility/dto/ServerConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ln69;->g:Lsu/happ/proxyutility/dto/ServerConfig;

    .line 6
    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :try_start_0
    invoke-static {p0}, Landroid/net/VpnService;->prepare(Landroid/content/Context;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    move-object v2, v1

    .line 15
    goto :goto_5

    .line 16
    :cond_1
    new-instance v2, Landroid/net/VpnService$Builder;

    .line 17
    .line 18
    invoke-direct {v2, p0}, Landroid/net/VpnService$Builder;-><init>(Landroid/net/VpnService;)V

    .line 19
    .line 20
    .line 21
    const/16 v3, 0x5dc

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Landroid/net/VpnService$Builder;->setMtu(I)Landroid/net/VpnService$Builder;

    .line 24
    .line 25
    .line 26
    const-string v3, "26.26.26.1"

    .line 27
    .line 28
    const/16 v4, 0x1e

    .line 29
    .line 30
    invoke-virtual {v2, v3, v4}, Landroid/net/VpnService$Builder;->addAddress(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    .line 31
    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_4

    .line 44
    :cond_2
    :goto_0
    sget-object v0, Ln69;->g:Lsu/happ/proxyutility/dto/ServerConfig;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move-object v0, v1

    .line 54
    :goto_1
    if-nez v0, :cond_4

    .line 55
    .line 56
    const-string v0, ""

    .line 57
    .line 58
    :cond_4
    invoke-virtual {v2, v0}, Landroid/net/VpnService$Builder;->setSession(Ljava/lang/String;)Landroid/net/VpnService$Builder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    :try_start_1
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->j0:Landroid/os/ParcelFileDescriptor;

    .line 62
    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catchall_1
    move-exception v0

    .line 70
    :try_start_2
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 71
    .line 72
    if-nez v3, :cond_6

    .line 73
    .line 74
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 75
    .line 76
    if-nez v3, :cond_6

    .line 77
    .line 78
    :cond_5
    :goto_2
    :try_start_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 79
    .line 80
    const/16 v3, 0x1d

    .line 81
    .line 82
    if-lt v0, v3, :cond_7

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-virtual {v2, v0}, Landroid/net/VpnService$Builder;->setMetered(Z)Landroid/net/VpnService$Builder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 86
    .line 87
    .line 88
    goto :goto_5

    .line 89
    :catchall_2
    move-exception v0

    .line 90
    goto :goto_3

    .line 91
    :cond_6
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 92
    :goto_3
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 93
    :goto_4
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 94
    .line 95
    if-nez v2, :cond_d

    .line 96
    .line 97
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 98
    .line 99
    if-nez v2, :cond_d

    .line 100
    .line 101
    new-instance v2, Lrj6;

    .line 102
    .line 103
    invoke-direct {v2, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    :cond_7
    :goto_5
    instance-of v0, v2, Lrj6;

    .line 107
    .line 108
    if-eqz v0, :cond_8

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_8
    move-object v1, v2

    .line 112
    :goto_6
    check-cast v1, Landroid/net/VpnService$Builder;

    .line 113
    .line 114
    if-eqz v1, :cond_c

    .line 115
    .line 116
    const/4 v0, 0x1

    .line 117
    iput-boolean v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->l0:Z

    .line 118
    .line 119
    invoke-static {}, Ln67;->f()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_9

    .line 124
    .line 125
    sget-object v0, Ln69;->a:Llibxray/XRayPoint;

    .line 126
    .line 127
    const/4 v0, 0x4

    .line 128
    invoke-static {p0, v0}, Ln69;->e(Lh69;I)V

    .line 129
    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_9
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->t()V

    .line 133
    .line 134
    .line 135
    :goto_7
    :try_start_6
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->j0:Landroid/os/ParcelFileDescriptor;

    .line 136
    .line 137
    if-eqz v0, :cond_a

    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 140
    .line 141
    .line 142
    goto :goto_8

    .line 143
    :catchall_3
    move-exception v0

    .line 144
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 145
    .line 146
    if-nez v2, :cond_b

    .line 147
    .line 148
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 149
    .line 150
    if-nez v2, :cond_b

    .line 151
    .line 152
    :cond_a
    :goto_8
    invoke-virtual {p0, v1}, Lsu/happ/proxyutility/service/XRayVpnService;->p(Landroid/net/VpnService$Builder;)V

    .line 153
    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_b
    throw v0

    .line 157
    :cond_c
    :goto_9
    return-void

    .line 158
    :cond_d
    throw v0
.end method

.method public final g()Landroid/app/Service;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final h()Lj61;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->g0:Lvz7;

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
    iget-boolean p0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->l0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final j(Lsu/happ/proxyutility/dto/ServerConfig;)V
    .locals 1

    .line 1
    sget-object p1, Ln69;->a:Llibxray/XRayPoint;

    .line 2
    .line 3
    iget-object p1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->j0:Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    iget-boolean v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->p0:Z

    .line 6
    .line 7
    invoke-static {p0, p1, v0}, Ln69;->c(Lh69;Landroid/os/ParcelFileDescriptor;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final l()Lcom/tencent/mmkv/MMKV;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->X:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 8
    .line 9
    return-object p0
.end method

.method public final m(Lsu/happ/proxyutility/dto/ServerConfig;)V
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
    if-nez v0, :cond_1

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
    if-eqz v0, :cond_5

    .line 17
    .line 18
    :cond_1
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->r()V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ln67;->a()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v2, "--no-domain"

    .line 30
    .line 31
    const-string v3, "--ip"

    .line 32
    .line 33
    const-string v4, "127.0.0.1"

    .line 34
    .line 35
    const-string v5, "--port"

    .line 36
    .line 37
    filled-new-array {v2, v3, v4, v5, v0}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :try_start_0
    invoke-static {}, Ln67;->e()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->l()Lcom/tencent/mmkv/MMKV;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v1, "pref_antifilter_params"

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    if-eqz p1, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->b()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-lez v2, :cond_3

    .line 75
    .line 76
    move-object v1, p1

    .line 77
    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    .line 78
    .line 79
    const/4 p1, 0x1

    .line 80
    new-array p1, p1, [C

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    const/16 v3, 0x20

    .line 84
    .line 85
    aput-char v3, p1, v2

    .line 86
    .line 87
    invoke-static {v1, p1}, Lfm7;->E0(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 92
    .line 93
    .line 94
    :cond_4
    new-instance p1, Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;

    .line 95
    .line 96
    new-instance v1, Lq69;

    .line 97
    .line 98
    invoke-direct {v1, p0}, Lq69;-><init>(Lsu/happ/proxyutility/service/XRayVpnService;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {p1, v1}, Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;-><init>(Lsu/happ/proxyutility/service/AntiFilterVpnSupportsSet;)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->n0:Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;->a(Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :catchall_0
    move-exception p0

    .line 111
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 112
    .line 113
    if-nez p1, :cond_6

    .line 114
    .line 115
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 116
    .line 117
    if-nez p1, :cond_6

    .line 118
    .line 119
    :cond_5
    return-void

    .line 120
    :cond_6
    throw p0
.end method

.method public final n()V
    .locals 6

    .line 1
    new-instance v0, Lsu/happ/tunnel/TProxyService;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lsu/happ/proxyutility/service/XRayVpnService;->j0:Landroid/os/ParcelFileDescriptor;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v3, Lp69;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v3, p0, v4}, Lp69;-><init>(Lsu/happ/proxyutility/service/XRayVpnService;B)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lp69;

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    invoke-direct {v4, p0, v5}, Lp69;-><init>(Lsu/happ/proxyutility/service/XRayVpnService;B)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1, v2, v3, v4}, Lsu/happ/tunnel/TProxyService;-><init>(Landroid/content/Context;Landroid/os/ParcelFileDescriptor;Lp69;Lp69;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->o0:Lsu/happ/tunnel/TProxyService;

    .line 31
    .line 32
    invoke-virtual {v0}, Lsu/happ/tunnel/TProxyService;->a()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final o()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Ln67;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->n()V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    :goto_0
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->q0:Lsu/happ/proxyutility/dto/ServerConfig;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lsu/happ/proxyutility/service/XRayVpnService;->m(Lsu/happ/proxyutility/dto/ServerConfig;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :goto_1
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    new-instance v1, Lrj6;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object v0, v1

    .line 35
    :goto_2
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->s()V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void

    .line 45
    :cond_2
    throw v0
.end method

.method public final onCreate()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Ln69;->a:Llibxray/XRayPoint;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/ref/SoftReference;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ln69;->a(Ljava/lang/ref/SoftReference;)V

    .line 28
    .line 29
    .line 30
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v1, 0x1a

    .line 33
    .line 34
    if-lt v0, v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->e()Ljz8;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljz8;->a()V

    .line 41
    .line 42
    .line 43
    :cond_0
    :try_start_0
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->i0:Lvz7;

    .line 44
    .line 45
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lsu/happ/proxyutility/service/XRayServiceManager$VpnMessageReceiver;

    .line 50
    .line 51
    new-instance v1, Landroid/content/IntentFilter;

    .line 52
    .line 53
    const-string v2, "su.happ.proxyutility.action.service"

    .line 54
    .line 55
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v2, "android.intent.action.SCREEN_ON"

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v2, "android.intent.action.SCREEN_OFF"

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v2, "android.intent.action.USER_PRESENT"

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 v2, 0x2

    .line 74
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {p0, v0, v1, v2}, Lue3;->I(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/Integer;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 84
    .line 85
    if-nez v0, :cond_1

    .line 86
    .line 87
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 88
    .line 89
    if-nez v0, :cond_1

    .line 90
    .line 91
    return-void

    .line 92
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
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->u0:Lvz7;

    .line 5
    .line 6
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lc16;

    .line 11
    .line 12
    invoke-virtual {v0}, Lc16;->i()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->t()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->r()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->e()Ljz8;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(I)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Ln69;->a:Llibxray/XRayPoint;

    .line 33
    .line 34
    const/4 v0, 0x6

    .line 35
    invoke-static {p0, v0}, Ln69;->e(Lh69;I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->i0:Lvz7;

    .line 39
    .line 40
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lsu/happ/proxyutility/service/XRayServiceManager$VpnMessageReceiver;

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final onRevoke()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->s()V

    .line 2
    .line 3
    .line 4
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
    iput-wide p2, p0, Lsu/happ/proxyutility/service/XRayVpnService;->m0:J

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
    iput-boolean p2, p0, Lsu/happ/proxyutility/service/XRayVpnService;->p0:Z

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const-string p2, "guid"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p2, p0, Lsu/happ/proxyutility/service/XRayVpnService;->u0:Lvz7;

    .line 29
    .line 30
    invoke-virtual {p2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Lc16;

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Lc16;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sget-object p2, Lkw4;->a:Lkw4;

    .line 40
    .line 41
    invoke-static {p1}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    :goto_0
    iput-object p1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->q0:Lsu/happ/proxyutility/dto/ServerConfig;

    .line 48
    .line 49
    invoke-static {p0}, Lu15;->A(Landroid/app/Service;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->q0:Lsu/happ/proxyutility/dto/ServerConfig;

    .line 53
    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    sget-object p1, Ln69;->g:Lsu/happ/proxyutility/dto/ServerConfig;

    .line 57
    .line 58
    :cond_2
    const/4 p2, 0x1

    .line 59
    invoke-virtual {p0, p1, p2}, Lsu/happ/proxyutility/service/XRayVpnService;->q(Lsu/happ/proxyutility/dto/ServerConfig;Z)Landroid/net/VpnService$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_4

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/service/XRayVpnService;->p(Landroid/net/VpnService$Builder;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->o()V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->q0:Lsu/happ/proxyutility/dto/ServerConfig;

    .line 72
    .line 73
    if-nez p1, :cond_3

    .line 74
    .line 75
    sget-object p1, Ln69;->g:Lsu/happ/proxyutility/dto/ServerConfig;

    .line 76
    .line 77
    :cond_3
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/service/XRayVpnService;->j(Lsu/happ/proxyutility/dto/ServerConfig;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    return p2
.end method

.method public final p(Landroid/net/VpnService$Builder;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/net/VpnService$Builder;->establish()Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->j0:Landroid/os/ParcelFileDescriptor;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->k0:Z

    .line 11
    .line 12
    sget-object p1, Ldn8;->a:Ldn8;

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, "Required value was null."

    .line 18
    .line 19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :goto_0
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    new-instance v0, Lrj6;

    .line 34
    .line 35
    invoke-direct {v0, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object p1, v0

    .line 39
    :goto_1
    invoke-static {p1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->s()V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void

    .line 49
    :cond_2
    throw p1
.end method

.method public final q(Lsu/happ/proxyutility/dto/ServerConfig;Z)Landroid/net/VpnService$Builder;
    .locals 9

    .line 1
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->Y:Lvz7;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {p0}, Landroid/net/VpnService;->prepare(Landroid/content/Context;)Landroid/content/Intent;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move-object v2, v1

    .line 11
    goto/16 :goto_17

    .line 12
    .line 13
    :cond_0
    new-instance v2, Landroid/net/VpnService$Builder;

    .line 14
    .line 15
    invoke-direct {v2, p0}, Landroid/net/VpnService$Builder;-><init>(Landroid/net/VpnService;)V

    .line 16
    .line 17
    .line 18
    const/16 v3, 0x5dc

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Landroid/net/VpnService$Builder;->setMtu(I)Landroid/net/VpnService$Builder;

    .line 21
    .line 22
    .line 23
    const-string v3, "26.26.26.1"

    .line 24
    .line 25
    const/16 v4, 0x1e

    .line 26
    .line 27
    invoke-virtual {v2, v3, v4}, Landroid/net/VpnService$Builder;->addAddress(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    .line 28
    .line 29
    .line 30
    const-string v3, "0.0.0.0"

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-virtual {v2, v3, v4}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ln67;->g()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const-string v3, "da26:2626::1"

    .line 43
    .line 44
    const/16 v5, 0x7e

    .line 45
    .line 46
    invoke-virtual {v2, v3, v5}, Landroid/net/VpnService$Builder;->addAddress(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    .line 47
    .line 48
    .line 49
    const-string v3, "::"

    .line 50
    .line 51
    invoke-virtual {v2, v3, v4}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto/16 :goto_16

    .line 57
    .line 58
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->l()Lcom/tencent/mmkv/MMKV;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const-string v5, "pref_local_dns_enabled"

    .line 63
    .line 64
    invoke-virtual {v3, v5}, Lcom/tencent/mmkv/MMKV;->b(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    const-string v5, "su.happ.proxyutility"

    .line 69
    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    :try_start_1
    const-string v3, "26.26.26.2"

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    goto/16 :goto_5

    .line 82
    .line 83
    :cond_2
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->l()Lcom/tencent/mmkv/MMKV;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const-string v6, "pref_enable_rules"

    .line 88
    .line 89
    invoke-virtual {v3, v6, v4}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_c

    .line 94
    .line 95
    if-eqz p1, :cond_3

    .line 96
    .line 97
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->c()Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    goto :goto_1

    .line 102
    :cond_3
    move-object v3, v1

    .line 103
    :goto_1
    sget-object v6, Lsu/happ/proxyutility/dto/enums/EConfigType;->CUSTOM:Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 104
    .line 105
    if-ne v3, v6, :cond_c

    .line 106
    .line 107
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->l()Lcom/tencent/mmkv/MMKV;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    const-string v6, "pref_dns_from_json"

    .line 112
    .line 113
    invoke-virtual {v3, v6}, Lcom/tencent/mmkv/MMKV;->b(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_c

    .line 118
    .line 119
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->d()Lsu/happ/proxyutility/dto/XRayConfig;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    if-eqz v3, :cond_5

    .line 124
    .line 125
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig;->e()Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    if-eqz v3, :cond_5

    .line 130
    .line 131
    invoke-static {v3}, Ly59;->a(Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;)Lgg8;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    const-string v6, "su.happ.proxyutility.action.activity"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    .line 137
    :try_start_2
    new-instance v7, Landroid/content/Intent;

    .line 138
    .line 139
    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v7, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v7, v5}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 146
    .line 147
    .line 148
    const-string v6, "key"

    .line 149
    .line 150
    const/16 v8, 0x82

    .line 151
    .line 152
    invoke-virtual {v7, v6, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 153
    .line 154
    .line 155
    const-string v6, "content"

    .line 156
    .line 157
    invoke-virtual {v7, v6, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, v7}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :catchall_1
    move-exception v6

    .line 165
    :try_start_3
    instance-of v7, v6, Ljava/lang/InterruptedException;

    .line 166
    .line 167
    if-nez v7, :cond_4

    .line 168
    .line 169
    instance-of v7, v6, Ljava/util/concurrent/CancellationException;

    .line 170
    .line 171
    if-nez v7, :cond_4

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_4
    throw v6

    .line 175
    :cond_5
    move-object v3, v1

    .line 176
    :goto_2
    if-eqz v3, :cond_a

    .line 177
    .line 178
    instance-of v6, v3, Lcg8;

    .line 179
    .line 180
    if-eqz v6, :cond_6

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_6
    instance-of v6, v3, Ldg8;

    .line 184
    .line 185
    if-eqz v6, :cond_7

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_7
    instance-of v6, v3, Leg8;

    .line 189
    .line 190
    if-eqz v6, :cond_8

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_8
    instance-of v6, v3, Lfg8;

    .line 194
    .line 195
    if-eqz v6, :cond_9

    .line 196
    .line 197
    check-cast v3, Lfg8;

    .line 198
    .line 199
    iget-object v3, v3, Lfg8;->X:Ljava/lang/String;

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_9
    new-instance p0, Lb55;

    .line 203
    .line 204
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 205
    .line 206
    .line 207
    throw p0

    .line 208
    :cond_a
    :goto_3
    move-object v3, v1

    .line 209
    :goto_4
    sget-object v6, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 210
    .line 211
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-virtual {v6}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    new-instance v7, Lnm7;

    .line 220
    .line 221
    const/16 v8, 0x14

    .line 222
    .line 223
    invoke-direct {v7, v3, v8}, Lnm7;-><init>(Ljava/lang/String;B)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v6, v7}, Lkf4;->h(Lgn2;)V

    .line 227
    .line 228
    .line 229
    if-nez v3, :cond_b

    .line 230
    .line 231
    invoke-static {v2}, Lsu/happ/proxyutility/service/XRayVpnService;->k(Landroid/net/VpnService$Builder;)V

    .line 232
    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_b
    invoke-virtual {v2, v3}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_c
    invoke-static {v2}, Lsu/happ/proxyutility/service/XRayVpnService;->k(Landroid/net/VpnService$Builder;)V

    .line 244
    .line 245
    .line 246
    :goto_5
    if-eqz p1, :cond_d

    .line 247
    .line 248
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    if-nez p1, :cond_f

    .line 253
    .line 254
    :cond_d
    sget-object p1, Ln69;->g:Lsu/happ/proxyutility/dto/ServerConfig;

    .line 255
    .line 256
    if-eqz p1, :cond_e

    .line 257
    .line 258
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    goto :goto_6

    .line 263
    :cond_e
    move-object p1, v1

    .line 264
    :goto_6
    if-nez p1, :cond_f

    .line 265
    .line 266
    const-string p1, ""

    .line 267
    .line 268
    :cond_f
    invoke-virtual {v2, p1}, Landroid/net/VpnService$Builder;->setSession(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->l()Lcom/tencent/mmkv/MMKV;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    const-string v3, "pref_per_app_proxy_set"

    .line 276
    .line 277
    invoke-virtual {p1, v3, v1}, Lcom/tencent/mmkv/MMKV;->k(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    sget-object v3, Ljk5;->X:Lwe5;

    .line 282
    .line 283
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->l()Lcom/tencent/mmkv/MMKV;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    invoke-virtual {v6}, Lcom/tencent/mmkv/MMKV;->d()I

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    sget-object v3, Ljk5;->h0:Ln22;

    .line 295
    .line 296
    invoke-static {v6, v3}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    check-cast v3, Ljk5;

    .line 301
    .line 302
    if-nez v3, :cond_10

    .line 303
    .line 304
    sget-object v3, Ljk5;->Y:Ljk5;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 305
    .line 306
    :cond_10
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-eqz v3, :cond_16

    .line 311
    .line 312
    const/4 v6, 0x1

    .line 313
    if-eq v3, v6, :cond_13

    .line 314
    .line 315
    const/4 v6, 0x2

    .line 316
    if-ne v3, v6, :cond_12

    .line 317
    .line 318
    if-eqz p1, :cond_11

    .line 319
    .line 320
    invoke-interface {p1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    goto :goto_7

    .line 324
    :catchall_2
    move-exception p1

    .line 325
    goto :goto_b

    .line 326
    :cond_11
    :goto_7
    if-eqz p1, :cond_17

    .line 327
    .line 328
    check-cast p1, Ljava/lang/Iterable;

    .line 329
    .line 330
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    if-eqz v3, :cond_17

    .line 339
    .line 340
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    check-cast v3, Ljava/lang/String;

    .line 345
    .line 346
    invoke-virtual {v2, v3}, Landroid/net/VpnService$Builder;->addDisallowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    .line 347
    .line 348
    .line 349
    goto :goto_8

    .line 350
    :cond_12
    new-instance p1, Lb55;

    .line 351
    .line 352
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 353
    .line 354
    .line 355
    throw p1

    .line 356
    :cond_13
    move-object v3, p1

    .line 357
    check-cast v3, Ljava/util/Collection;

    .line 358
    .line 359
    if-eqz v3, :cond_15

    .line 360
    .line 361
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    if-eqz v3, :cond_14

    .line 366
    .line 367
    goto :goto_a

    .line 368
    :cond_14
    invoke-interface {p1, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    check-cast p1, Ljava/lang/Iterable;

    .line 372
    .line 373
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    if-eqz v3, :cond_17

    .line 382
    .line 383
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    check-cast v3, Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {v2, v3}, Landroid/net/VpnService$Builder;->addAllowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    .line 390
    .line 391
    .line 392
    goto :goto_9

    .line 393
    :cond_15
    :goto_a
    invoke-virtual {v2, v5}, Landroid/net/VpnService$Builder;->addDisallowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    goto :goto_c

    .line 401
    :cond_16
    invoke-virtual {v2, v5}, Landroid/net/VpnService$Builder;->addDisallowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 402
    .line 403
    .line 404
    goto :goto_c

    .line 405
    :goto_b
    :try_start_5
    instance-of v3, p1, Ljava/lang/InterruptedException;

    .line 406
    .line 407
    if-nez v3, :cond_23

    .line 408
    .line 409
    instance-of v3, p1, Ljava/util/concurrent/CancellationException;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_a

    .line 410
    .line 411
    if-nez v3, :cond_23

    .line 412
    .line 413
    :cond_17
    :goto_c
    :try_start_6
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 414
    .line 415
    const/16 v3, 0x21

    .line 416
    .line 417
    if-lt p1, v3, :cond_1e

    .line 418
    .line 419
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    check-cast p1, Lu42;

    .line 424
    .line 425
    invoke-virtual {p1}, Lu42;->b()V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    check-cast p1, Lu42;

    .line 433
    .line 434
    iget-object p1, p1, Lu42;->c:Lh76;

    .line 435
    .line 436
    iget-object p1, p1, Lh76;->X:Loh7;

    .line 437
    .line 438
    invoke-virtual {p1}, Loh7;->getValue()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    check-cast p1, Ljava/lang/Iterable;

    .line 443
    .line 444
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    :catchall_3
    :cond_18
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-eqz v0, :cond_19

    .line 453
    .line 454
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    check-cast v0, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 459
    .line 460
    :try_start_7
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;->a()Landroid/net/IpPrefix;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    if-eqz v0, :cond_18

    .line 465
    .line 466
    invoke-virtual {v2, v0}, Landroid/net/VpnService$Builder;->excludeRoute(Landroid/net/IpPrefix;)Landroid/net/VpnService$Builder;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 467
    .line 468
    .line 469
    goto :goto_d

    .line 470
    :cond_19
    :try_start_8
    iget-object p1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->Z:Lvz7;

    .line 471
    .line 472
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object p1

    .line 476
    check-cast p1, Lmn6;

    .line 477
    .line 478
    invoke-static {p1}, Lmn6;->k(Lmn6;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    if-eqz p1, :cond_1e

    .line 483
    .line 484
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    if-eqz p1, :cond_1e

    .line 489
    .line 490
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 491
    .line 492
    .line 493
    move-result-object p1

    .line 494
    if-eqz p1, :cond_1e

    .line 495
    .line 496
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/RouteSettings;->j()Ljava/util/List;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    if-eqz p1, :cond_1e

    .line 501
    .line 502
    sget-object v0, Lss8;->a:Lss8;

    .line 503
    .line 504
    new-instance v0, Ljava/util/ArrayList;

    .line 505
    .line 506
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 507
    .line 508
    .line 509
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 510
    .line 511
    .line 512
    move-result-object p1

    .line 513
    :cond_1a
    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    if-eqz v3, :cond_1b

    .line 518
    .line 519
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    move-object v5, v3

    .line 524
    check-cast v5, Ljava/lang/String;

    .line 525
    .line 526
    invoke-static {v5}, Lss8;->y(Ljava/lang/String;)Z

    .line 527
    .line 528
    .line 529
    move-result v5

    .line 530
    if-eqz v5, :cond_1a

    .line 531
    .line 532
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    goto :goto_e

    .line 536
    :cond_1b
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 537
    .line 538
    .line 539
    move-result-object p1

    .line 540
    :cond_1c
    :goto_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    if-eqz v0, :cond_1e

    .line 545
    .line 546
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    check-cast v0, Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 551
    .line 552
    :try_start_9
    invoke-static {v0}, Ljm4;->E(Ljava/lang/String;)Landroid/net/IpPrefix;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    if-eqz v0, :cond_1c

    .line 557
    .line 558
    invoke-virtual {v2, v0}, Landroid/net/VpnService$Builder;->excludeRoute(Landroid/net/IpPrefix;)Landroid/net/VpnService$Builder;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 559
    .line 560
    .line 561
    goto :goto_f

    .line 562
    :catchall_4
    move-exception v0

    .line 563
    :try_start_a
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 564
    .line 565
    if-nez v3, :cond_1d

    .line 566
    .line 567
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 568
    .line 569
    if-nez v3, :cond_1d

    .line 570
    .line 571
    goto :goto_f

    .line 572
    :catchall_5
    move-exception p0

    .line 573
    goto :goto_10

    .line 574
    :cond_1d
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 575
    :goto_10
    :try_start_b
    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 576
    :cond_1e
    :try_start_c
    iget-object p1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->j0:Landroid/os/ParcelFileDescriptor;

    .line 577
    .line 578
    if-eqz p1, :cond_1f

    .line 579
    .line 580
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 581
    .line 582
    .line 583
    goto :goto_11

    .line 584
    :catchall_6
    move-exception p1

    .line 585
    :try_start_d
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 586
    .line 587
    if-nez v0, :cond_22

    .line 588
    .line 589
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 590
    .line 591
    if-nez v0, :cond_22

    .line 592
    .line 593
    :cond_1f
    :goto_11
    if-eqz p2, :cond_21

    .line 594
    .line 595
    :try_start_e
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 596
    .line 597
    const/16 p2, 0x1c

    .line 598
    .line 599
    if-lt p1, p2, :cond_21

    .line 600
    .line 601
    :try_start_f
    iget-object p1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->s0:Lvz7;

    .line 602
    .line 603
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 608
    .line 609
    iget-object p2, p0, Lsu/happ/proxyutility/service/XRayVpnService;->r0:Lvz7;

    .line 610
    .line 611
    invoke-virtual {p2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object p2

    .line 615
    check-cast p2, Landroid/net/NetworkRequest;

    .line 616
    .line 617
    iget-object p0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->t0:Lvz7;

    .line 618
    .line 619
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object p0

    .line 623
    check-cast p0, Lr69;

    .line 624
    .line 625
    invoke-virtual {p1, p2, p0}, Landroid/net/ConnectivityManager;->requestNetwork(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 626
    .line 627
    .line 628
    goto :goto_13

    .line 629
    :catchall_7
    move-exception p0

    .line 630
    :try_start_10
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 631
    .line 632
    if-nez p1, :cond_20

    .line 633
    .line 634
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 635
    .line 636
    if-nez p1, :cond_20

    .line 637
    .line 638
    goto :goto_13

    .line 639
    :catchall_8
    move-exception p0

    .line 640
    goto :goto_12

    .line 641
    :cond_20
    throw p0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 642
    :goto_12
    :try_start_11
    throw p0

    .line 643
    :cond_21
    :goto_13
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 644
    .line 645
    const/16 p1, 0x1d

    .line 646
    .line 647
    if-lt p0, p1, :cond_24

    .line 648
    .line 649
    invoke-virtual {v2, v4}, Landroid/net/VpnService$Builder;->setMetered(Z)Landroid/net/VpnService$Builder;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 650
    .line 651
    .line 652
    goto :goto_17

    .line 653
    :catchall_9
    move-exception p0

    .line 654
    goto :goto_14

    .line 655
    :cond_22
    :try_start_12
    throw p1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 656
    :goto_14
    :try_start_13
    throw p0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 657
    :catchall_a
    move-exception p0

    .line 658
    goto :goto_15

    .line 659
    :cond_23
    :try_start_14
    throw p1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .line 660
    :goto_15
    :try_start_15
    throw p0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    .line 661
    :goto_16
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 662
    .line 663
    if-nez p1, :cond_26

    .line 664
    .line 665
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 666
    .line 667
    if-nez p1, :cond_26

    .line 668
    .line 669
    new-instance v2, Lrj6;

    .line 670
    .line 671
    invoke-direct {v2, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 672
    .line 673
    .line 674
    :cond_24
    :goto_17
    instance-of p0, v2, Lrj6;

    .line 675
    .line 676
    if-eqz p0, :cond_25

    .line 677
    .line 678
    goto :goto_18

    .line 679
    :cond_25
    move-object v1, v2

    .line 680
    :goto_18
    check-cast v1, Landroid/net/VpnService$Builder;

    .line 681
    .line 682
    return-object v1

    .line 683
    :cond_26
    throw p0
.end method

.method public final r()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->n0:Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;

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
    iput-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->n0:Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    throw p0
.end method

.method public final s()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->k0:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->l0:Z

    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1c

    .line 9
    .line 10
    if-lt v0, v1, :cond_1

    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->s0:Lvz7;

    .line 13
    .line 14
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 19
    .line 20
    iget-object v1, p0, Lsu/happ/proxyutility/service/XRayVpnService;->t0:Lvz7;

    .line 21
    .line 22
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lr69;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    throw v0

    .line 43
    :cond_1
    :goto_0
    sget-object v0, Ln69;->a:Llibxray/XRayPoint;

    .line 44
    .line 45
    const/4 v0, 0x6

    .line 46
    invoke-static {p0, v0}, Ln69;->e(Lh69;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->t()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lsu/happ/proxyutility/service/XRayVpnService;->r()V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->j0:Landroid/os/ParcelFileDescriptor;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_1
    move-exception v0

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->j0:Landroid/os/ParcelFileDescriptor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :goto_2
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 70
    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 74
    .line 75
    if-nez v1, :cond_3

    .line 76
    .line 77
    :goto_3
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    throw v0
.end method

.method public final t()V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->o0:Lsu/happ/tunnel/TProxyService;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lsu/happ/tunnel/TProxyService;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lsu/happ/proxyutility/service/XRayVpnService;->o0:Lsu/happ/tunnel/TProxyService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    throw p0
.end method
