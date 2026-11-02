.class public final Lsu/happ/proxyutility/service/SubscriptionUpdater$ExpireReminderTask;
.super Landroidx/work/Worker;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "su/happ/proxyutility/service/SubscriptionUpdater$ExpireReminderTask",
        "Landroidx/work/Worker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
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


# instance fields
.field public final e:Ly65;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lec4;->a:Landroid/content/Context;

    .line 11
    .line 12
    new-instance p2, Ly65;

    .line 13
    .line 14
    invoke-direct {p2, p1}, Ly65;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lsu/happ/proxyutility/service/SubscriptionUpdater$ExpireReminderTask;->e:Ly65;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final e()Lcc4;
    .locals 9

    .line 1
    new-instance v0, Lwk0;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v1, v3, v2}, Lwk0;-><init>(ILq51;B)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lb02;->X:Lb02;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lz51;->R(Ls61;Lrn2;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    const-string v0, "android.permission.POST_NOTIFICATIONS"

    .line 15
    .line 16
    iget-object v1, p0, Lec4;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v1, v0}, Lw79;->i(Landroid/content/Context;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    sget-object v0, Lkw4;->a:Lkw4;

    .line 25
    .line 26
    invoke-static {}, Lkw4;->d()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v2, Lhu;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-direct {v2, v0, v3}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lzx6;

    .line 37
    .line 38
    const/16 v4, 0xe

    .line 39
    .line 40
    invoke-direct {v0, v4}, Lzx6;-><init>(B)V

    .line 41
    .line 42
    .line 43
    new-instance v4, Lla2;

    .line 44
    .line 45
    invoke-direct {v4, v2, v3, v0}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Lka2;

    .line 49
    .line 50
    invoke-direct {v0, v4}, Lka2;-><init>(Lla2;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {v0}, Lka2;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0}, Lka2;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Lqg5;

    .line 64
    .line 65
    iget-object v3, v2, Lqg5;->X:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 68
    .line 69
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    iget-object v2, v2, Lqg5;->Y:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 76
    .line 77
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    new-instance v4, Lr65;

    .line 82
    .line 83
    const-string v5, "subscription_expire_channel"

    .line 84
    .line 85
    invoke-direct {v4, v1, v5}, Lr65;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-wide/16 v6, 0x0

    .line 89
    .line 90
    iget-object v8, v4, Lr65;->v:Landroid/app/Notification;

    .line 91
    .line 92
    iput-wide v6, v8, Landroid/app/Notification;->when:J

    .line 93
    .line 94
    sget v6, Ly46;->worker_expire_ticker:I

    .line 95
    .line 96
    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-static {v6}, Lr65;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    iput-object v6, v8, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 105
    .line 106
    sget v6, Ly46;->worker_expire_title:I

    .line 107
    .line 108
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v1, v6, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v2}, Lr65;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iput-object v2, v4, Lr65;->e:Ljava/lang/CharSequence;

    .line 121
    .line 122
    sget v2, Lq36;->ic_stat_name:I

    .line 123
    .line 124
    iput v2, v8, Landroid/app/Notification;->icon:I

    .line 125
    .line 126
    const-string v2, "service"

    .line 127
    .line 128
    iput-object v2, v4, Lr65;->p:Ljava/lang/String;

    .line 129
    .line 130
    const/4 v2, 0x0

    .line 131
    iput v2, v4, Lr65;->j:I

    .line 132
    .line 133
    new-instance v6, Landroid/content/Intent;

    .line 134
    .line 135
    const-class v7, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 136
    .line 137
    invoke-direct {v6, v1, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 138
    .line 139
    .line 140
    const/high16 v7, 0x4000000

    .line 141
    .line 142
    invoke-static {v1, v2, v6, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    iput-object v2, v4, Lr65;->g:Landroid/app/PendingIntent;

    .line 147
    .line 148
    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    const/16 v6, 0x1a

    .line 151
    .line 152
    iget-object v7, p0, Lsu/happ/proxyutility/service/SubscriptionUpdater$ExpireReminderTask;->e:Ly65;

    .line 153
    .line 154
    if-lt v2, v6, :cond_1

    .line 155
    .line 156
    :try_start_1
    iput-object v5, v4, Lr65;->t:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {}, Ldn;->e()V

    .line 159
    .line 160
    .line 161
    sget v5, Ly46;->worker_expire_notification_channel:I

    .line 162
    .line 163
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-static {v5}, Ldn;->c(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    if-lt v2, v6, :cond_0

    .line 175
    .line 176
    iget-object v2, v7, Ly65;->b:Landroid/app/NotificationManager;

    .line 177
    .line 178
    invoke-static {v2, v5}, Lue3;->n(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    :cond_1
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    add-int/lit16 v2, v2, 0x115c

    .line 190
    .line 191
    invoke-virtual {v4}, Lr65;->b()Landroid/app/Notification;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {v7, v2, v3}, Ly65;->a(ILandroid/app/Notification;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :catchall_0
    move-exception v2

    .line 201
    instance-of v3, v2, Ljava/lang/InterruptedException;

    .line 202
    .line 203
    if-nez v3, :cond_2

    .line 204
    .line 205
    instance-of v3, v2, Ljava/util/concurrent/CancellationException;

    .line 206
    .line 207
    if-nez v3, :cond_2

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_2
    throw v2

    .line 212
    :cond_3
    invoke-static {}, Ldc4;->b()Lcc4;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    return-object p0
.end method
