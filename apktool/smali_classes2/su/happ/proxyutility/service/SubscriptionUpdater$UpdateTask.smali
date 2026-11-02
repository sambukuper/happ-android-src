.class public final Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;
.super Landroidx/work/CoroutineWorker;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "su/happ/proxyutility/service/SubscriptionUpdater$UpdateTask",
        "Landroidx/work/CoroutineWorker;",
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
.field public final g:Ly65;

.field public final h:Lr65;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lec4;->a:Landroid/content/Context;

    .line 11
    .line 12
    new-instance v0, Ly65;

    .line 13
    .line 14
    invoke-direct {v0, p2}, Ly65;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->g:Ly65;

    .line 18
    .line 19
    new-instance p2, Lr65;

    .line 20
    .line 21
    iget-object v0, p0, Lec4;->a:Landroid/content/Context;

    .line 22
    .line 23
    const-string v1, "subscription_update_channel"

    .line 24
    .line 25
    invoke-direct {p2, v0, v1}, Lr65;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p2, Lr65;->v:Landroid/app/Notification;

    .line 29
    .line 30
    const-wide/16 v1, 0x0

    .line 31
    .line 32
    iput-wide v1, v0, Landroid/app/Notification;->when:J

    .line 33
    .line 34
    sget v1, Ly46;->worker_update_ticker:I

    .line 35
    .line 36
    iget-object v2, p0, Lec4;->a:Landroid/content/Context;

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Lr65;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iput-object v1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 50
    .line 51
    sget v1, Ly46;->worker_update_title:I

    .line 52
    .line 53
    iget-object v2, p0, Lec4;->a:Landroid/content/Context;

    .line 54
    .line 55
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Lr65;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, p2, Lr65;->e:Ljava/lang/CharSequence;

    .line 67
    .line 68
    sget v1, Lq36;->ic_stat_name:I

    .line 69
    .line 70
    iput v1, v0, Landroid/app/Notification;->icon:I

    .line 71
    .line 72
    const-string v0, "service"

    .line 73
    .line 74
    iput-object v0, p2, Lr65;->p:Ljava/lang/String;

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    iput v0, p2, Lr65;->j:I

    .line 78
    .line 79
    new-instance v1, Landroid/content/Intent;

    .line 80
    .line 81
    const-class v2, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 82
    .line 83
    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 84
    .line 85
    .line 86
    const v2, 0x10008000

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 90
    .line 91
    .line 92
    const/high16 v2, 0x4000000

    .line 93
    .line 94
    invoke-static {p1, v0, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p2, Lr65;->g:Landroid/app/PendingIntent;

    .line 99
    .line 100
    iput-object p2, p0, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->h:Lr65;

    .line 101
    .line 102
    return-void
.end method


# virtual methods
.method public final e(Lq51;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Lbv7;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lbv7;

    .line 11
    .line 12
    iget v3, v2, Lbv7;->n0:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lbv7;->n0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lbv7;

    .line 25
    .line 26
    check-cast v0, Ls51;

    .line 27
    .line 28
    invoke-direct {v2, v1, v0}, Lbv7;-><init>(Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;Ls51;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v2, Lbv7;->l0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v3, v2, Lbv7;->n0:I

    .line 34
    .line 35
    iget-object v4, v1, Lec4;->b:Landroidx/work/WorkerParameters;

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x1

    .line 41
    const/4 v9, 0x0

    .line 42
    sget-object v10, Lc71;->X:Lc71;

    .line 43
    .line 44
    if-eqz v3, :cond_4

    .line 45
    .line 46
    if-eq v3, v8, :cond_3

    .line 47
    .line 48
    if-eq v3, v6, :cond_2

    .line 49
    .line 50
    if-ne v3, v5, :cond_1

    .line 51
    .line 52
    iget v2, v2, Lbv7;->k0:I

    .line 53
    .line 54
    :try_start_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_15

    .line 58
    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto/16 :goto_14

    .line 61
    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v9

    .line 68
    :cond_2
    iget v3, v2, Lbv7;->k0:I

    .line 69
    .line 70
    iget-boolean v4, v2, Lbv7;->f0:Z

    .line 71
    .line 72
    iget-object v5, v2, Lbv7;->j0:Ljava/util/Iterator;

    .line 73
    .line 74
    :try_start_1
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    .line 76
    .line 77
    goto/16 :goto_7

    .line 78
    .line 79
    :catchall_1
    move-exception v0

    .line 80
    move v2, v3

    .line 81
    goto/16 :goto_14

    .line 82
    .line 83
    :cond_3
    iget-boolean v3, v2, Lbv7;->f0:Z

    .line 84
    .line 85
    iget-object v11, v2, Lbv7;->i0:Ljava/lang/Integer;

    .line 86
    .line 87
    iget-object v12, v2, Lbv7;->h0:Lqs7;

    .line 88
    .line 89
    iget-object v13, v2, Lbv7;->g0:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_4
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, v1, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->g:Ly65;

    .line 99
    .line 100
    iget-object v0, v0, Ly65;->b:Landroid/app/NotificationManager;

    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_5

    .line 107
    .line 108
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 109
    .line 110
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-instance v1, Lzx6;

    .line 119
    .line 120
    const/16 v2, 0xf

    .line 121
    .line 122
    invoke-direct {v1, v2}, Lzx6;-><init>(B)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Lkf4;->h(Lgn2;)V

    .line 126
    .line 127
    .line 128
    invoke-static {}, Ldc4;->b()Lcc4;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    return-object v0

    .line 133
    :cond_5
    iget-object v0, v4, Landroidx/work/WorkerParameters;->b:Lu91;

    .line 134
    .line 135
    const-string v11, "subIdData"

    .line 136
    .line 137
    invoke-virtual {v0, v11}, Lu91;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    move-object v13, v0

    .line 144
    goto :goto_1

    .line 145
    :cond_6
    move-object v13, v9

    .line 146
    :goto_1
    if-eqz v13, :cond_7

    .line 147
    .line 148
    sget-object v0, Lev7;->c:Lvz7;

    .line 149
    .line 150
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Lzt7;

    .line 155
    .line 156
    invoke-virtual {v0, v13}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    move-object v12, v0

    .line 161
    goto :goto_2

    .line 162
    :cond_7
    move-object v12, v9

    .line 163
    :goto_2
    if-eqz v12, :cond_8

    .line 164
    .line 165
    iget-object v0, v12, Lqs7;->a:Lis7;

    .line 166
    .line 167
    if-eqz v0, :cond_8

    .line 168
    .line 169
    iget v0, v0, Lis7;->d:I

    .line 170
    .line 171
    new-instance v11, Ljava/lang/Integer;

    .line 172
    .line 173
    invoke-direct {v11, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_8
    move-object v11, v9

    .line 178
    :goto_3
    iput-object v13, v2, Lbv7;->g0:Ljava/lang/String;

    .line 179
    .line 180
    iput-object v12, v2, Lbv7;->h0:Lqs7;

    .line 181
    .line 182
    iput-object v11, v2, Lbv7;->i0:Ljava/lang/Integer;

    .line 183
    .line 184
    iput-boolean v3, v2, Lbv7;->f0:Z

    .line 185
    .line 186
    iput v8, v2, Lbv7;->n0:I

    .line 187
    .line 188
    invoke-virtual {v1, v2}, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->h(Ls51;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-ne v0, v10, :cond_9

    .line 193
    .line 194
    goto/16 :goto_13

    .line 195
    .line 196
    :cond_9
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_b

    .line 203
    .line 204
    if-nez v11, :cond_a

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_a
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_b

    .line 212
    .line 213
    :goto_5
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 214
    .line 215
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v1, Lzx6;

    .line 224
    .line 225
    const/16 v2, 0x10

    .line 226
    .line 227
    invoke-direct {v1, v2}, Lzx6;-><init>(B)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v1}, Lkf4;->h(Lgn2;)V

    .line 231
    .line 232
    .line 233
    invoke-static {}, Ldc4;->b()Lcc4;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    return-object v0

    .line 238
    :cond_b
    :try_start_2
    invoke-virtual {v1}, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->g()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1}, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->f()Lkj2;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-object v14, v4, Landroidx/work/WorkerParameters;->i:Llj2;

    .line 246
    .line 247
    iget-object v15, v1, Lec4;->a:Landroid/content/Context;

    .line 248
    .line 249
    iget-object v4, v4, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 250
    .line 251
    invoke-interface {v14, v15, v4, v0}, Llj2;->c(Landroid/content/Context;Ljava/util/UUID;Lkj2;)Lxb4;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    check-cast v0, Ljava/lang/Void;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :catchall_2
    move-exception v0

    .line 263
    instance-of v4, v0, Ljava/lang/InterruptedException;

    .line 264
    .line 265
    if-nez v4, :cond_20

    .line 266
    .line 267
    instance-of v4, v0, Ljava/util/concurrent/CancellationException;

    .line 268
    .line 269
    if-nez v4, :cond_20

    .line 270
    .line 271
    :goto_6
    :try_start_3
    sget-object v0, Lkw4;->a:Lkw4;

    .line 272
    .line 273
    invoke-static {}, Lkw4;->d()Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    const/16 v4, 0x11

    .line 278
    .line 279
    if-nez v13, :cond_e

    .line 280
    .line 281
    new-instance v5, Lhu;

    .line 282
    .line 283
    invoke-direct {v5, v0, v8}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 284
    .line 285
    .line 286
    new-instance v0, Lzx6;

    .line 287
    .line 288
    invoke-direct {v0, v4}, Lzx6;-><init>(B)V

    .line 289
    .line 290
    .line 291
    invoke-static {v5, v0}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    new-instance v4, Lzx6;

    .line 296
    .line 297
    const/16 v5, 0x12

    .line 298
    .line 299
    invoke-direct {v4, v5}, Lzx6;-><init>(B)V

    .line 300
    .line 301
    .line 302
    new-instance v5, Lla2;

    .line 303
    .line 304
    invoke-direct {v5, v0, v8, v4}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 305
    .line 306
    .line 307
    new-instance v0, Lka2;

    .line 308
    .line 309
    invoke-direct {v0, v5}, Lka2;-><init>(Lla2;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 310
    .line 311
    .line 312
    move-object v5, v0

    .line 313
    move v4, v3

    .line 314
    move v3, v7

    .line 315
    :cond_c
    :goto_7
    :try_start_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_1d

    .line 320
    .line 321
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    check-cast v0, Lyf8;

    .line 326
    .line 327
    iget-object v11, v0, Lyf8;->X:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v11, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 330
    .line 331
    invoke-virtual {v11}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v11

    .line 335
    iget-object v0, v0, Lyf8;->Z:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Lqs7;

    .line 338
    .line 339
    if-eqz v0, :cond_d

    .line 340
    .line 341
    iget-object v0, v0, Lqs7;->a:Lis7;

    .line 342
    .line 343
    if-eqz v0, :cond_d

    .line 344
    .line 345
    iget-boolean v0, v0, Lis7;->e:Z

    .line 346
    .line 347
    if-ne v0, v8, :cond_d

    .line 348
    .line 349
    move v0, v8

    .line 350
    goto :goto_8

    .line 351
    :cond_d
    move v0, v7

    .line 352
    :goto_8
    iput-object v9, v2, Lbv7;->g0:Ljava/lang/String;

    .line 353
    .line 354
    iput-object v9, v2, Lbv7;->h0:Lqs7;

    .line 355
    .line 356
    iput-object v9, v2, Lbv7;->i0:Ljava/lang/Integer;

    .line 357
    .line 358
    iput-object v5, v2, Lbv7;->j0:Ljava/util/Iterator;

    .line 359
    .line 360
    iput-boolean v4, v2, Lbv7;->f0:Z

    .line 361
    .line 362
    iput v3, v2, Lbv7;->k0:I

    .line 363
    .line 364
    iput v6, v2, Lbv7;->n0:I

    .line 365
    .line 366
    invoke-virtual {v1, v2, v11, v0}, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->i(Ls51;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 370
    if-ne v0, v10, :cond_c

    .line 371
    .line 372
    goto/16 :goto_13

    .line 373
    .line 374
    :goto_9
    move v2, v7

    .line 375
    goto/16 :goto_14

    .line 376
    .line 377
    :catchall_3
    move-exception v0

    .line 378
    goto :goto_9

    .line 379
    :cond_e
    :try_start_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 384
    .line 385
    .line 386
    move-result v6

    .line 387
    if-eqz v6, :cond_10

    .line 388
    .line 389
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    move-object v14, v6

    .line 394
    check-cast v14, Lqg5;

    .line 395
    .line 396
    iget-object v14, v14, Lqg5;->X:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v14, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 399
    .line 400
    invoke-virtual {v14}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v14

    .line 404
    invoke-static {v14, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v14

    .line 408
    if-eqz v14, :cond_f

    .line 409
    .line 410
    goto :goto_a

    .line 411
    :cond_10
    move-object v6, v9

    .line 412
    :goto_a
    check-cast v6, Lqg5;

    .line 413
    .line 414
    if-eqz v6, :cond_11

    .line 415
    .line 416
    iget-object v0, v6, Lqg5;->Y:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v0, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 419
    .line 420
    goto :goto_b

    .line 421
    :cond_11
    move-object v0, v9

    .line 422
    :goto_b
    if-nez v0, :cond_12

    .line 423
    .line 424
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 425
    .line 426
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    new-instance v2, Lnm7;

    .line 435
    .line 436
    invoke-direct {v2, v13, v8}, Lnm7;-><init>(Ljava/lang/String;B)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, v2}, Lkf4;->h(Lgn2;)V

    .line 440
    .line 441
    .line 442
    goto/16 :goto_15

    .line 443
    .line 444
    :cond_12
    if-eqz v12, :cond_13

    .line 445
    .line 446
    iget-object v6, v12, Lqs7;->a:Lis7;

    .line 447
    .line 448
    if-eqz v6, :cond_13

    .line 449
    .line 450
    iget-boolean v6, v6, Lis7;->e:Z

    .line 451
    .line 452
    if-ne v6, v8, :cond_13

    .line 453
    .line 454
    move v6, v8

    .line 455
    goto :goto_c

    .line 456
    :cond_13
    move v6, v7

    .line 457
    :goto_c
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->N()Ljava/lang/Long;

    .line 458
    .line 459
    .line 460
    move-result-object v14

    .line 461
    const-wide/16 v15, 0x3e8

    .line 462
    .line 463
    if-eqz v14, :cond_14

    .line 464
    .line 465
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 466
    .line 467
    .line 468
    move-result-wide v17

    .line 469
    move/from16 v19, v6

    .line 470
    .line 471
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->O()J

    .line 472
    .line 473
    .line 474
    move-result-wide v5

    .line 475
    new-instance v8, Ljava/lang/Long;

    .line 476
    .line 477
    invoke-direct {v8, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 481
    .line 482
    .line 483
    move-result-wide v5

    .line 484
    mul-long/2addr v5, v15

    .line 485
    cmp-long v5, v17, v5

    .line 486
    .line 487
    if-lez v5, :cond_15

    .line 488
    .line 489
    goto :goto_d

    .line 490
    :cond_14
    move/from16 v19, v6

    .line 491
    .line 492
    :cond_15
    move-object v14, v9

    .line 493
    :goto_d
    if-eqz v14, :cond_16

    .line 494
    .line 495
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 496
    .line 497
    .line 498
    move-result-wide v5

    .line 499
    goto :goto_e

    .line 500
    :cond_16
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->O()J

    .line 501
    .line 502
    .line 503
    move-result-wide v5

    .line 504
    new-instance v8, Ljava/lang/Long;

    .line 505
    .line 506
    invoke-direct {v8, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 510
    .line 511
    .line 512
    move-result-wide v5

    .line 513
    mul-long/2addr v5, v15

    .line 514
    :goto_e
    if-eqz v12, :cond_17

    .line 515
    .line 516
    iget-object v8, v12, Lqs7;->a:Lis7;

    .line 517
    .line 518
    if-eqz v8, :cond_17

    .line 519
    .line 520
    iget v8, v8, Lis7;->c:I

    .line 521
    .line 522
    goto :goto_f

    .line 523
    :cond_17
    const/4 v8, 0x1

    .line 524
    :goto_f
    sget-object v12, Lwe3;->a:Lmu0;

    .line 525
    .line 526
    invoke-interface {v12}, Lmu0;->a()Lte3;

    .line 527
    .line 528
    .line 529
    move-result-object v12

    .line 530
    invoke-virtual {v12}, Lte3;->a()J

    .line 531
    .line 532
    .line 533
    move-result-wide v14

    .line 534
    new-instance v12, Ljava/lang/Integer;

    .line 535
    .line 536
    invoke-direct {v12, v8}, Ljava/lang/Integer;-><init>(I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 540
    .line 541
    .line 542
    move-result-wide v16

    .line 543
    const-wide/32 v20, 0x36ee80

    .line 544
    .line 545
    .line 546
    mul-long v16, v16, v20

    .line 547
    .line 548
    add-long v16, v16, v5

    .line 549
    .line 550
    cmp-long v5, v16, v14

    .line 551
    .line 552
    if-gez v5, :cond_18

    .line 553
    .line 554
    goto :goto_11

    .line 555
    :cond_18
    if-nez v11, :cond_19

    .line 556
    .line 557
    goto :goto_10

    .line 558
    :cond_19
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 559
    .line 560
    .line 561
    move-result v5

    .line 562
    if-eqz v5, :cond_1a

    .line 563
    .line 564
    :goto_10
    sget-object v2, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 565
    .line 566
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    invoke-virtual {v2}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    new-instance v3, Luq0;

    .line 575
    .line 576
    invoke-direct {v3, v0, v4}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v3}, Lkf4;->h(Lgn2;)V

    .line 580
    .line 581
    .line 582
    goto :goto_15

    .line 583
    :cond_1a
    :goto_11
    sget-object v0, Lkw4;->a:Lkw4;

    .line 584
    .line 585
    invoke-static {v13}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 586
    .line 587
    .line 588
    move-result-object v20

    .line 589
    if-nez v20, :cond_1b

    .line 590
    .line 591
    goto :goto_12

    .line 592
    :cond_1b
    new-instance v0, Ljava/lang/Long;

    .line 593
    .line 594
    invoke-direct {v0, v14, v15}, Ljava/lang/Long;-><init>(J)V

    .line 595
    .line 596
    .line 597
    const v27, 0xbffffff

    .line 598
    .line 599
    .line 600
    const-wide/16 v21, 0x0

    .line 601
    .line 602
    const/16 v23, 0x0

    .line 603
    .line 604
    const/16 v24, 0x0

    .line 605
    .line 606
    const/16 v25, 0x0

    .line 607
    .line 608
    move-object/from16 v26, v0

    .line 609
    .line 610
    invoke-static/range {v20 .. v27}, Lsu/happ/proxyutility/dto/SubscriptionItem;->d(Lsu/happ/proxyutility/dto/SubscriptionItem;JZLsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/Long;I)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    invoke-static {v0, v13}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    :goto_12
    iput-object v9, v2, Lbv7;->g0:Ljava/lang/String;

    .line 618
    .line 619
    iput-object v9, v2, Lbv7;->h0:Lqs7;

    .line 620
    .line 621
    iput-object v9, v2, Lbv7;->i0:Ljava/lang/Integer;

    .line 622
    .line 623
    iput-boolean v3, v2, Lbv7;->f0:Z

    .line 624
    .line 625
    iput v7, v2, Lbv7;->k0:I

    .line 626
    .line 627
    const/4 v3, 0x3

    .line 628
    iput v3, v2, Lbv7;->n0:I

    .line 629
    .line 630
    move/from16 v8, v19

    .line 631
    .line 632
    invoke-virtual {v1, v2, v13, v8}, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->i(Ls51;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 636
    if-ne v0, v10, :cond_1d

    .line 637
    .line 638
    :goto_13
    return-object v10

    .line 639
    :goto_14
    if-eqz v2, :cond_1c

    .line 640
    .line 641
    invoke-static {v0}, Lgv3;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    const-string v3, "util.protection"

    .line 646
    .line 647
    invoke-static {v2, v3, v7}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    if-nez v2, :cond_1c

    .line 652
    .line 653
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 654
    .line 655
    .line 656
    :cond_1c
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 657
    .line 658
    if-nez v2, :cond_1f

    .line 659
    .line 660
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 661
    .line 662
    if-nez v2, :cond_1f

    .line 663
    .line 664
    :cond_1d
    :goto_15
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 665
    .line 666
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    const-string v2, ""

    .line 671
    .line 672
    const-string v3, "su.happ.proxyutility.action.activity"

    .line 673
    .line 674
    const/16 v4, 0x81

    .line 675
    .line 676
    invoke-static {v0, v3, v4, v2}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 677
    .line 678
    .line 679
    sget-object v0, Lkw4;->a:Lkw4;

    .line 680
    .line 681
    :try_start_6
    invoke-static {}, Lkw4;->m()Lcom/tencent/mmkv/MMKV;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-virtual {v0}, Lcom/tencent/mmkv/MMKV;->w()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 686
    .line 687
    .line 688
    goto :goto_16

    .line 689
    :catchall_4
    move-exception v0

    .line 690
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 691
    .line 692
    if-nez v2, :cond_1e

    .line 693
    .line 694
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 695
    .line 696
    if-nez v2, :cond_1e

    .line 697
    .line 698
    :goto_16
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 699
    .line 700
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    new-instance v2, Lt16;

    .line 709
    .line 710
    const/16 v3, 0x1d

    .line 711
    .line 712
    invoke-direct {v2, v1, v3}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v0, v2}, Lkf4;->h(Lgn2;)V

    .line 716
    .line 717
    .line 718
    invoke-static {}, Ldc4;->b()Lcc4;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    return-object v0

    .line 723
    :cond_1e
    throw v0

    .line 724
    :cond_1f
    throw v0

    .line 725
    :cond_20
    throw v0
.end method

.method public final f()Lkj2;
    .locals 6

    .line 1
    iget-object v0, p0, Lec4;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lx39;->v0(Landroid/content/Context;)Lx39;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lec4;->b:Landroidx/work/WorkerParameters;

    .line 14
    .line 15
    iget-object v2, v2, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v1, v1, Lx39;->i0:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    sget v3, Li08;->l0:I

    .line 27
    .line 28
    new-instance v3, Landroid/content/Intent;

    .line 29
    .line 30
    const-class v4, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 31
    .line 32
    invoke-direct {v3, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 33
    .line 34
    .line 35
    const-string v4, "ACTION_CANCEL_WORK"

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    new-instance v4, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v5, "workspec://"

    .line 43
    .line 44
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    const-string v4, "KEY_WORKSPEC_ID"

    .line 62
    .line 63
    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 67
    .line 68
    const/16 v4, 0x1f

    .line 69
    .line 70
    if-lt v2, v4, :cond_0

    .line 71
    .line 72
    const/high16 v4, 0xa000000

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    const/high16 v4, 0x8000000

    .line 76
    .line 77
    :goto_0
    const/4 v5, 0x0

    .line 78
    invoke-static {v1, v5, v3, v4}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    sget v3, Lq36;->ic_close_16dp:I

    .line 83
    .line 84
    sget v4, Ly46;->close:I

    .line 85
    .line 86
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->h:Lr65;

    .line 94
    .line 95
    invoke-virtual {p0, v3, v1, v0}, Lr65;->a(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 v0, 0x1

    .line 99
    const/4 v1, 0x2

    .line 100
    invoke-virtual {p0, v1, v0}, Lr65;->d(IZ)V

    .line 101
    .line 102
    .line 103
    const/16 v0, 0x22

    .line 104
    .line 105
    const/16 v1, 0xd05

    .line 106
    .line 107
    if-lt v2, v0, :cond_1

    .line 108
    .line 109
    new-instance v0, Lkj2;

    .line 110
    .line 111
    invoke-virtual {p0}, Lr65;->b()Landroid/app/Notification;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    const/high16 v2, 0x40000000    # 2.0f

    .line 116
    .line 117
    invoke-direct {v0, v1, p0, v2}, Lkj2;-><init>(ILandroid/app/Notification;I)V

    .line 118
    .line 119
    .line 120
    return-object v0

    .line 121
    :cond_1
    new-instance v0, Lkj2;

    .line 122
    .line 123
    invoke-virtual {p0}, Lr65;->b()Landroid/app/Notification;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-direct {v0, v1, p0, v5}, Lkj2;-><init>(ILandroid/app/Notification;I)V

    .line 128
    .line 129
    .line 130
    return-object v0
.end method

.method public final g()V
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->h:Lr65;

    .line 8
    .line 9
    const-string v3, "subscription_update_channel"

    .line 10
    .line 11
    iput-object v3, v2, Lr65;->t:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v2, Landroid/app/NotificationChannel;

    .line 14
    .line 15
    sget v4, Ly46;->worker_update_notification_channel:I

    .line 16
    .line 17
    iget-object v5, p0, Lec4;->a:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v5, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-direct {v2, v3, v4, v5}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->g:Ly65;

    .line 31
    .line 32
    if-lt v0, v1, :cond_0

    .line 33
    .line 34
    iget-object p0, p0, Ly65;->b:Landroid/app/NotificationManager;

    .line 35
    .line 36
    invoke-static {p0, v2}, Lue3;->n(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final h(Ls51;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcv7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcv7;

    .line 7
    .line 8
    iget v1, v0, Lcv7;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcv7;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcv7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcv7;-><init>(Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcv7;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lcv7;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Lgx1;->Y:Lbe;

    .line 49
    .line 50
    const-wide/16 v4, 0x157c

    .line 51
    .line 52
    sget-object p1, Llx1;->Z:Llx1;

    .line 53
    .line 54
    invoke-static {v4, v5, p1}, Lvj8;->m0(JLlx1;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    new-instance p1, Lym7;

    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    invoke-direct {p1, p0, v2, v1}, Lym7;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 62
    .line 63
    .line 64
    iput v3, v0, Lcv7;->h0:I

    .line 65
    .line 66
    invoke-static {v4, v5}, Lu70;->s0(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    invoke-static {v1, v2, p1, v0}, La28;->x(JLrn2;Ls51;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object p0, Lc71;->X:Lc71;

    .line 75
    .line 76
    if-ne p1, p0, :cond_3

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 80
    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    const/4 p0, 0x0

    .line 89
    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method

.method public final i(Ls51;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v11, p3

    .line 8
    .line 9
    instance-of v3, v1, Ldv7;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, Ldv7;

    .line 15
    .line 16
    iget v4, v3, Ldv7;->k0:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, Ldv7;->k0:I

    .line 26
    .line 27
    :goto_0
    move-object v9, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v3, Ldv7;

    .line 30
    .line 31
    invoke-direct {v3, v0, v1}, Ldv7;-><init>(Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;Ls51;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v1, v9, Ldv7;->i0:Ljava/lang/Object;

    .line 36
    .line 37
    iget v3, v9, Ldv7;->k0:I

    .line 38
    .line 39
    iget-object v12, v0, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->g:Ly65;

    .line 40
    .line 41
    const/4 v13, 0x1

    .line 42
    iget-object v14, v0, Lec4;->a:Landroid/content/Context;

    .line 43
    .line 44
    sget-object v15, Ldn8;->a:Ldn8;

    .line 45
    .line 46
    iget-object v4, v0, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->h:Lr65;

    .line 47
    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    if-ne v3, v13, :cond_1

    .line 51
    .line 52
    iget-boolean v0, v9, Ldv7;->h0:Z

    .line 53
    .line 54
    iget-object v2, v9, Ldv7;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 55
    .line 56
    iget-object v3, v9, Ldv7;->f0:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object v13, v4

    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    return-object v0

    .line 71
    :cond_2
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object v1, Lkw4;->a:Lkw4;

    .line 75
    .line 76
    invoke-static {v2}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-nez v1, :cond_3

    .line 81
    .line 82
    goto/16 :goto_3

    .line 83
    .line 84
    :cond_3
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-static {v3, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_4

    .line 95
    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :cond_4
    if-eqz v11, :cond_5

    .line 99
    .line 100
    invoke-virtual {v0}, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->g()V

    .line 101
    .line 102
    .line 103
    new-instance v0, Landroid/content/Intent;

    .line 104
    .line 105
    const-class v3, Lsu/happ/proxyutility/receiver/SubscriptionUpdaterReceiver;

    .line 106
    .line 107
    invoke-direct {v0, v14, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 108
    .line 109
    .line 110
    const-string v3, "su.happ.proxyutility.receiver.SubscriptionUpdater.CANCEL_NOTIFICATION"

    .line 111
    .line 112
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    const-string v3, "subIdData"

    .line 120
    .line 121
    invoke-static {v0, v3, v2}, Lc4;->y(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const/high16 v3, 0xc000000

    .line 126
    .line 127
    const/4 v5, 0x0

    .line 128
    invoke-static {v14, v5, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-object v3, v4, Lr65;->b:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 135
    .line 136
    .line 137
    sget v3, Lq36;->ic_close_16dp:I

    .line 138
    .line 139
    sget v5, Ly46;->close:I

    .line 140
    .line 141
    invoke-virtual {v14, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4, v3, v0, v5}, Lr65;->a(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    sget v0, Ly46;->worker_update_description:I

    .line 152
    .line 153
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-static {v3, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v14, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {v0}, Lr65;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iput-object v0, v4, Lr65;->f:Ljava/lang/CharSequence;

    .line 177
    .line 178
    const-string v0, "android.permission.POST_NOTIFICATIONS"

    .line 179
    .line 180
    invoke-static {v14, v0}, Lw79;->i(Landroid/content/Context;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_5

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    add-int/lit16 v0, v0, 0xd05

    .line 191
    .line 192
    invoke-virtual {v4}, Lr65;->b()Landroid/app/Notification;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v12, v0, v3}, Ly65;->a(ILandroid/app/Notification;)V

    .line 197
    .line 198
    .line 199
    :cond_5
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 200
    .line 201
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    new-instance v3, Luq0;

    .line 210
    .line 211
    const/16 v5, 0x12

    .line 212
    .line 213
    invoke-direct {v3, v1, v5}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v3}, Lkf4;->h(Lgn2;)V

    .line 217
    .line 218
    .line 219
    sget-object v0, Lev7;->a:Lvz7;

    .line 220
    .line 221
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, Lpr7;

    .line 226
    .line 227
    iput-object v2, v9, Ldv7;->f0:Ljava/lang/String;

    .line 228
    .line 229
    iput-object v1, v9, Ldv7;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 230
    .line 231
    iput-boolean v11, v9, Ldv7;->h0:Z

    .line 232
    .line 233
    iput v13, v9, Ldv7;->k0:I

    .line 234
    .line 235
    const/4 v2, 0x0

    .line 236
    const/4 v3, 0x0

    .line 237
    move-object v5, v4

    .line 238
    const/4 v4, 0x0

    .line 239
    move-object v6, v5

    .line 240
    const/4 v5, 0x0

    .line 241
    move-object v7, v6

    .line 242
    const/4 v6, 0x0

    .line 243
    move-object v8, v7

    .line 244
    const/4 v7, 0x0

    .line 245
    move-object v10, v8

    .line 246
    const/4 v8, 0x0

    .line 247
    move-object/from16 v16, v10

    .line 248
    .line 249
    const/16 v10, 0x17e

    .line 250
    .line 251
    move-object/from16 v13, v16

    .line 252
    .line 253
    move-object/from16 v16, v1

    .line 254
    .line 255
    move-object/from16 v1, p2

    .line 256
    .line 257
    invoke-static/range {v0 .. v10}, Lpr7;->b(Lpr7;Ljava/lang/String;ZLjava/lang/String;Lq30;Lok4;Lzs1;Lpk4;Ljava/lang/Boolean;Ls51;I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    sget-object v1, Lc71;->X:Lc71;

    .line 262
    .line 263
    if-ne v0, v1, :cond_6

    .line 264
    .line 265
    return-object v1

    .line 266
    :cond_6
    move-object/from16 v3, p2

    .line 267
    .line 268
    move v0, v11

    .line 269
    move-object/from16 v2, v16

    .line 270
    .line 271
    :goto_2
    if-eqz v0, :cond_7

    .line 272
    .line 273
    iget-object v0, v13, Lr65;->b:Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 276
    .line 277
    .line 278
    sget v0, Ly46;->worker_updated_description:I

    .line 279
    .line 280
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    const/4 v2, 0x1

    .line 289
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v14, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-static {v0}, Lr65;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    iput-object v0, v13, Lr65;->f:Ljava/lang/CharSequence;

    .line 305
    .line 306
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    add-int/lit16 v0, v0, 0xd05

    .line 311
    .line 312
    invoke-virtual {v13}, Lr65;->b()Landroid/app/Notification;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {v12, v0, v1}, Ly65;->a(ILandroid/app/Notification;)V

    .line 317
    .line 318
    .line 319
    :cond_7
    :goto_3
    return-object v15
.end method
