.class public final Lsu/happ/proxyutility/service/XRayTestService;
.super Landroid/app/Service;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lsu/happ/proxyutility/service/XRayTestService;",
        "Landroid/app/Service;",
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
.field public static final X:Lvz7;

.field public static final Y:Lvz7;

.field public static final Z:Lvz7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li69;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Li69;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lvz7;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lsu/happ/proxyutility/service/XRayTestService;->X:Lvz7;

    .line 13
    .line 14
    new-instance v0, Li69;

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    invoke-direct {v0, v1}, Li69;-><init>(B)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lvz7;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lsu/happ/proxyutility/service/XRayTestService;->Y:Lvz7;

    .line 26
    .line 27
    new-instance v0, Li69;

    .line 28
    .line 29
    const/4 v1, 0x6

    .line 30
    invoke-direct {v0, v1}, Li69;-><init>(B)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lvz7;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lsu/happ/proxyutility/service/XRayTestService;->Z:Lvz7;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lsu/happ/proxyutility/dto/TestPingViaProxyData;)V
    .locals 3

    .line 1
    sget-object v0, Lof7;->a:Lof7;

    .line 2
    .line 3
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/TestPingViaProxyData;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/TestPingViaProxyData;->c()Lsu/happ/proxyutility/dto/enums/EPingType;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v0, v1}, Lof7;->e(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EPingType;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    new-instance v2, Lsu/happ/proxyutility/dto/TestPingViaProxyResultData;

    .line 16
    .line 17
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/TestPingViaProxyData;->b()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {v2, v0, v1, p1}, Lsu/happ/proxyutility/dto/TestPingViaProxyResultData;-><init>(JLjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lyw2;->b:Lcom/google/gson/a;

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "su.happ.proxyutility.action.activity"

    .line 31
    .line 32
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    .line 33
    .line 34
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    const-string v0, "su.happ.proxyutility"

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    const-string v0, "key"

    .line 46
    .line 47
    const/16 v2, 0x47

    .line 48
    .line 49
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    const-string v0, "content"

    .line 53
    .line 54
    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 63
    .line 64
    if-nez p1, :cond_0

    .line 65
    .line 66
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 67
    .line 68
    if-nez p1, :cond_0

    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    throw p0
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lgo/Seq;->setContext(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 7

    .line 1
    sget-object v0, Loy1;->E0:Loy1;

    .line 2
    .line 3
    invoke-static {p0}, Lu15;->A(Landroid/app/Service;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string v2, "key"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v1

    .line 22
    :goto_0
    const/4 v3, 0x3

    .line 23
    sget-object v4, Lsu/happ/proxyutility/service/XRayTestService;->X:Lvz7;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    const/4 v6, 0x7

    .line 33
    if-ne v5, v6, :cond_3

    .line 34
    .line 35
    :try_start_0
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lb71;

    .line 40
    .line 41
    new-instance v2, Lt17;

    .line 42
    .line 43
    const/16 v4, 0x16

    .line 44
    .line 45
    invoke-direct {v2, p1, p0, v1, v4}, Lt17;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1, v1, v2, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :catchall_0
    move-exception v0

    .line 54
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 55
    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 59
    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_2
    throw v0

    .line 64
    :cond_3
    :goto_1
    if-nez v2, :cond_4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    const/16 v6, 0x48

    .line 72
    .line 73
    if-ne v5, v6, :cond_5

    .line 74
    .line 75
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lb71;

    .line 80
    .line 81
    invoke-interface {v1}, Lb71;->getCoroutineContext()Ls61;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v1, v0}, Ls61;->H0(Lr61;)Lq61;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lbm3;

    .line 90
    .line 91
    if-eqz v0, :cond_9

    .line 92
    .line 93
    invoke-static {v0}, Lu70;->y(Lbm3;)V

    .line 94
    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_5
    :goto_2
    sget-object v4, Lsu/happ/proxyutility/service/XRayTestService;->Y:Lvz7;

    .line 98
    .line 99
    if-nez v2, :cond_6

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    const/16 v6, 0x8

    .line 107
    .line 108
    if-ne v5, v6, :cond_7

    .line 109
    .line 110
    const-string v0, "content"

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-eqz v0, :cond_9

    .line 117
    .line 118
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Lb71;

    .line 123
    .line 124
    new-instance v4, Lar6;

    .line 125
    .line 126
    const/16 v5, 0xa

    .line 127
    .line 128
    invoke-direct {v4, v0, p0, v1, v5}, Lar6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 129
    .line 130
    .line 131
    invoke-static {v2, v1, v1, v4, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_7
    :goto_3
    if-nez v2, :cond_8

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    const/16 v2, 0x52

    .line 143
    .line 144
    if-ne v1, v2, :cond_9

    .line 145
    .line 146
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, Lb71;

    .line 151
    .line 152
    invoke-interface {v1}, Lb71;->getCoroutineContext()Ls61;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-interface {v1, v0}, Ls61;->H0(Lr61;)Lq61;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v0, Lbm3;

    .line 161
    .line 162
    if-eqz v0, :cond_9

    .line 163
    .line 164
    invoke-static {v0}, Lu70;->y(Lbm3;)V

    .line 165
    .line 166
    .line 167
    :cond_9
    :goto_4
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    return p0
.end method
