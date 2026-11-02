.class public final Ljj2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final g0:J


# instance fields
.field public final X:Landroid/content/Context;

.field public final Y:Lx39;

.field public final Z:Llr5;

.field public f0:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "ForceStopRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Llh4;->a1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    const-wide v0, 0x496cebb800L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    sput-wide v0, Ljj2;->g0:J

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lx39;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Ljj2;->X:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Ljj2;->Y:Lx39;

    .line 11
    .line 12
    iget-object p1, p2, Lx39;->o0:Llr5;

    .line 13
    .line 14
    iput-object p1, p0, Ljj2;->Z:Llr5;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Ljj2;->f0:I

    .line 18
    .line 19
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 5

    .line 1
    const-string v0, "alarm"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/AlarmManager;

    .line 8
    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x1f

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    const/high16 v1, 0xa000000

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/high16 v1, 0x8000000

    .line 19
    .line 20
    :goto_0
    new-instance v2, Landroid/content/Intent;

    .line 21
    .line 22
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v3, Landroid/content/ComponentName;

    .line 26
    .line 27
    const-class v4, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 28
    .line 29
    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    const-string v3, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    const/4 v3, -0x1

    .line 41
    invoke-static {p0, v3, v2, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    sget-wide v3, Ljj2;->g0:J

    .line 50
    .line 51
    add-long/2addr v1, v3

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual {v0, v3, v1, v2, p0}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "last_force_stop_ms"

    .line 4
    .line 5
    iget-object v2, v0, Ljj2;->Z:Llr5;

    .line 6
    .line 7
    iget-object v3, v0, Ljj2;->Y:Lx39;

    .line 8
    .line 9
    iget-object v4, v3, Lx39;->j0:Lxy0;

    .line 10
    .line 11
    iget-object v5, v3, Lx39;->o0:Llr5;

    .line 12
    .line 13
    iget-object v6, v3, Lx39;->k0:Landroidx/work/impl/WorkDatabase;

    .line 14
    .line 15
    sget v7, Lp08;->g0:I

    .line 16
    .line 17
    iget-object v0, v0, Ljj2;->X:Landroid/content/Context;

    .line 18
    .line 19
    invoke-static {v0}, Lhm3;->a(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-static {v0, v7}, Lp08;->b(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->u()Ll08;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    iget-object v9, v9, Ll08;->a:Lql6;

    .line 32
    .line 33
    new-instance v10, Lzx6;

    .line 34
    .line 35
    const/16 v11, 0x1c

    .line 36
    .line 37
    invoke-direct {v10, v11}, Lzx6;-><init>(B)V

    .line 38
    .line 39
    .line 40
    const/4 v11, 0x1

    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-static {v9, v11, v12, v10}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    check-cast v9, Ljava/util/List;

    .line 47
    .line 48
    if-eqz v8, :cond_0

    .line 49
    .line 50
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v10, v12

    .line 56
    :goto_0
    new-instance v13, Ljava/util/HashSet;

    .line 57
    .line 58
    invoke-direct {v13, v10}, Ljava/util/HashSet;-><init>(I)V

    .line 59
    .line 60
    .line 61
    if-eqz v8, :cond_2

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-nez v10, :cond_2

    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    if-eqz v10, :cond_2

    .line 78
    .line 79
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    check-cast v10, Landroid/app/job/JobInfo;

    .line 84
    .line 85
    invoke-static {v10}, Lp08;->f(Landroid/app/job/JobInfo;)Ls39;

    .line 86
    .line 87
    .line 88
    move-result-object v14

    .line 89
    if-eqz v14, :cond_1

    .line 90
    .line 91
    iget-object v10, v14, Ls39;->a:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v13, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    invoke-virtual {v10}, Landroid/app/job/JobInfo;->getId()I

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    invoke-static {v7, v10}, Lp08;->a(Landroid/app/job/JobScheduler;I)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-eqz v8, :cond_4

    .line 114
    .line 115
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    check-cast v8, Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v13, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-nez v8, :cond_3

    .line 126
    .line 127
    invoke-static {}, Llh4;->P0()Llh4;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move v7, v11

    .line 135
    goto :goto_2

    .line 136
    :cond_4
    move v7, v12

    .line 137
    :goto_2
    const-wide/16 v13, -0x1

    .line 138
    .line 139
    if-eqz v7, :cond_6

    .line 140
    .line 141
    invoke-virtual {v6}, Lql6;->b()V

    .line 142
    .line 143
    .line 144
    :try_start_0
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    if-eqz v10, :cond_5

    .line 157
    .line 158
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    check-cast v10, Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v8, v13, v14, v10}, Ln49;->e(JLjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :catchall_0
    move-exception v0

    .line 169
    goto :goto_4

    .line 170
    :cond_5
    invoke-virtual {v6}, Lql6;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6}, Lql6;->l()V

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :goto_4
    invoke-virtual {v6}, Lql6;->l()V

    .line 178
    .line 179
    .line 180
    throw v0

    .line 181
    :cond_6
    :goto_5
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->w()Ld49;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    invoke-virtual {v6}, Lql6;->b()V

    .line 190
    .line 191
    .line 192
    :try_start_1
    iget-object v10, v8, Ln49;->a:Lql6;

    .line 193
    .line 194
    new-instance v15, Lut8;

    .line 195
    .line 196
    const/16 v13, 0x19

    .line 197
    .line 198
    invoke-direct {v15, v13}, Lut8;-><init>(B)V

    .line 199
    .line 200
    .line 201
    invoke-static {v10, v11, v12, v15}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    check-cast v10, Ljava/util/List;

    .line 206
    .line 207
    if-eqz v10, :cond_7

    .line 208
    .line 209
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v13

    .line 213
    if-nez v13, :cond_7

    .line 214
    .line 215
    move v13, v11

    .line 216
    goto :goto_6

    .line 217
    :catchall_1
    move-exception v0

    .line 218
    goto/16 :goto_d

    .line 219
    .line 220
    :cond_7
    move v13, v12

    .line 221
    :goto_6
    if-eqz v13, :cond_8

    .line 222
    .line 223
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v14

    .line 231
    if-eqz v14, :cond_8

    .line 232
    .line 233
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    check-cast v14, Ll49;

    .line 238
    .line 239
    sget-object v15, Lu39;->X:Lu39;

    .line 240
    .line 241
    iget-object v14, v14, Ll49;->a:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v8, v15, v14}, Ln49;->h(Lu39;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    const/16 v15, -0x200

    .line 247
    .line 248
    invoke-virtual {v8, v15, v14}, Ln49;->i(ILjava/lang/String;)V

    .line 249
    .line 250
    .line 251
    const-wide/16 v11, -0x1

    .line 252
    .line 253
    invoke-virtual {v8, v11, v12, v14}, Ln49;->e(JLjava/lang/String;)V

    .line 254
    .line 255
    .line 256
    const/4 v11, 0x1

    .line 257
    const/4 v12, 0x0

    .line 258
    goto :goto_7

    .line 259
    :cond_8
    iget-object v8, v9, Ld49;->a:Lql6;

    .line 260
    .line 261
    new-instance v9, Lut8;

    .line 262
    .line 263
    const/16 v10, 0x10

    .line 264
    .line 265
    invoke-direct {v9, v10}, Lut8;-><init>(B)V

    .line 266
    .line 267
    .line 268
    const/4 v10, 0x1

    .line 269
    const/4 v15, 0x0

    .line 270
    invoke-static {v8, v15, v10, v9}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v6}, Lql6;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 274
    .line 275
    .line 276
    invoke-virtual {v6}, Lql6;->l()V

    .line 277
    .line 278
    .line 279
    if-nez v13, :cond_a

    .line 280
    .line 281
    if-eqz v7, :cond_9

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_9
    const/4 v11, 0x0

    .line 285
    goto :goto_9

    .line 286
    :cond_a
    :goto_8
    move v11, v10

    .line 287
    :goto_9
    iget-object v7, v5, Llr5;->Y:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v7, Landroidx/work/impl/WorkDatabase;

    .line 290
    .line 291
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->s()Lgs5;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    const-string v8, "reschedule_needed"

    .line 296
    .line 297
    invoke-virtual {v7, v8}, Lgs5;->a(Ljava/lang/String;)Ljava/lang/Long;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    const-wide/16 v9, 0x0

    .line 302
    .line 303
    if-eqz v7, :cond_b

    .line 304
    .line 305
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 306
    .line 307
    .line 308
    move-result-wide v12

    .line 309
    const-wide/16 v16, 0x1

    .line 310
    .line 311
    cmp-long v7, v12, v16

    .line 312
    .line 313
    if-nez v7, :cond_b

    .line 314
    .line 315
    invoke-static {}, Llh4;->P0()Llh4;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3}, Lx39;->y0()V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    new-instance v0, Lfs5;

    .line 329
    .line 330
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-direct {v0, v8, v1}, Lfs5;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 335
    .line 336
    .line 337
    iget-object v1, v5, Llr5;->Y:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 340
    .line 341
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->s()Lgs5;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-virtual {v1, v0}, Lgs5;->b(Lfs5;)V

    .line 346
    .line 347
    .line 348
    return-void

    .line 349
    :cond_b
    :try_start_2
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 350
    .line 351
    const/16 v7, 0x1f

    .line 352
    .line 353
    if-lt v5, v7, :cond_c

    .line 354
    .line 355
    const/high16 v7, 0x22000000

    .line 356
    .line 357
    goto :goto_a

    .line 358
    :cond_c
    const/high16 v7, 0x20000000

    .line 359
    .line 360
    :goto_a
    new-instance v8, Landroid/content/Intent;

    .line 361
    .line 362
    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 363
    .line 364
    .line 365
    new-instance v12, Landroid/content/ComponentName;

    .line 366
    .line 367
    const-class v13, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 368
    .line 369
    invoke-direct {v12, v0, v13}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v8, v12}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 373
    .line 374
    .line 375
    const-string v12, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 376
    .line 377
    invoke-virtual {v8, v12}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 378
    .line 379
    .line 380
    const/4 v12, -0x1

    .line 381
    invoke-static {v0, v12, v8, v7}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    const/16 v8, 0x1e

    .line 386
    .line 387
    if-lt v5, v8, :cond_10

    .line 388
    .line 389
    if-eqz v7, :cond_d

    .line 390
    .line 391
    invoke-virtual {v7}, Landroid/app/PendingIntent;->cancel()V

    .line 392
    .line 393
    .line 394
    :cond_d
    const-string v5, "activity"

    .line 395
    .line 396
    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    check-cast v0, Landroid/app/ActivityManager;

    .line 401
    .line 402
    const/4 v5, 0x0

    .line 403
    const/4 v15, 0x0

    .line 404
    invoke-virtual {v0, v5, v15, v15}, Landroid/app/ActivityManager;->getHistoricalProcessExitReasons(Ljava/lang/String;II)Ljava/util/List;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    if-eqz v0, :cond_11

    .line 409
    .line 410
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    if-nez v5, :cond_11

    .line 415
    .line 416
    iget-object v5, v2, Llr5;->Y:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v5, Landroidx/work/impl/WorkDatabase;

    .line 419
    .line 420
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->s()Lgs5;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    invoke-virtual {v5, v1}, Lgs5;->a(Ljava/lang/String;)Ljava/lang/Long;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    if-eqz v5, :cond_e

    .line 429
    .line 430
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 431
    .line 432
    .line 433
    move-result-wide v9

    .line 434
    :cond_e
    move v12, v15

    .line 435
    :goto_b
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    if-ge v12, v5, :cond_11

    .line 440
    .line 441
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    invoke-static {v5}, Lu52;->a(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    invoke-virtual {v5}, Landroid/app/ApplicationExitInfo;->getReason()I

    .line 450
    .line 451
    .line 452
    move-result v7

    .line 453
    const/16 v8, 0xa

    .line 454
    .line 455
    if-ne v7, v8, :cond_f

    .line 456
    .line 457
    invoke-virtual {v5}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    .line 458
    .line 459
    .line 460
    move-result-wide v7

    .line 461
    cmp-long v5, v7, v9

    .line 462
    .line 463
    if-ltz v5, :cond_f

    .line 464
    .line 465
    goto :goto_c

    .line 466
    :cond_f
    add-int/lit8 v12, v12, 0x1

    .line 467
    .line 468
    goto :goto_b

    .line 469
    :cond_10
    if-nez v7, :cond_11

    .line 470
    .line 471
    invoke-static {v0}, Ljj2;->b(Landroid/content/Context;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 472
    .line 473
    .line 474
    goto :goto_c

    .line 475
    :cond_11
    if-eqz v11, :cond_12

    .line 476
    .line 477
    invoke-static {}, Llh4;->P0()Llh4;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    iget-object v0, v3, Lx39;->m0:Ljava/util/List;

    .line 485
    .line 486
    invoke-static {v4, v6, v0}, Lax6;->b(Lxy0;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 487
    .line 488
    .line 489
    :cond_12
    return-void

    .line 490
    :catch_0
    invoke-static {}, Llh4;->P0()Llh4;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    :goto_c
    invoke-static {}, Llh4;->P0()Llh4;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v3}, Lx39;->y0()V

    .line 505
    .line 506
    .line 507
    iget-object v0, v4, Lxy0;->g0:Ljava/lang/Object;

    .line 508
    .line 509
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 510
    .line 511
    .line 512
    move-result-wide v3

    .line 513
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    new-instance v0, Lfs5;

    .line 517
    .line 518
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    invoke-direct {v0, v1, v3}, Lfs5;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 523
    .line 524
    .line 525
    iget-object v1, v2, Llr5;->Y:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 528
    .line 529
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->s()Lgs5;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    invoke-virtual {v1, v0}, Lgs5;->b(Lfs5;)V

    .line 534
    .line 535
    .line 536
    return-void

    .line 537
    :goto_d
    invoke-virtual {v6}, Lql6;->l()V

    .line 538
    .line 539
    .line 540
    throw v0
.end method

.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Ljj2;->Y:Lx39;

    .line 2
    .line 3
    iget-object v1, v0, Lx39;->j0:Lxy0;

    .line 4
    .line 5
    :try_start_0
    iget-object v2, v1, Lxy0;->i0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object v3, p0, Ljj2;->X:Landroid/content/Context;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    :try_start_1
    invoke-static {}, Llh4;->P0()Llh4;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move v2, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v3, v1}, Ldv5;->a(Landroid/content/Context;Lxy0;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {}, Llh4;->P0()Llh4;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    :goto_0
    if-nez v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Lx39;->x0()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    :try_start_2
    invoke-static {v3}, Lus7;->g(Landroid/content/Context;)Z

    .line 45
    .line 46
    .line 47
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    :catch_0
    :goto_1
    :try_start_3
    invoke-static {v3}, Ly08;->k(Landroid/content/Context;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 51
    .line 52
    .line 53
    :try_start_4
    invoke-static {}, Llh4;->P0()Llh4;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 58
    .line 59
    .line 60
    :try_start_5
    invoke-virtual {p0}, Ljj2;->a()V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lx39;->x0()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :catch_1
    move-exception v2

    .line 71
    :try_start_6
    iget v5, p0, Ljj2;->f0:I

    .line 72
    .line 73
    add-int/2addr v5, v4

    .line 74
    iput v5, p0, Ljj2;->f0:I

    .line 75
    .line 76
    iget v5, p0, Ljj2;->f0:I

    .line 77
    .line 78
    const/4 v6, 0x3

    .line 79
    if-lt v5, v6, :cond_4

    .line 80
    .line 81
    instance-of p0, v2, Landroid/database/sqlite/SQLiteAccessPermException;

    .line 82
    .line 83
    if-nez p0, :cond_3

    .line 84
    .line 85
    instance-of p0, v2, Landroid/database/sqlite/SQLiteCantOpenDatabaseException;

    .line 86
    .line 87
    if-nez p0, :cond_3

    .line 88
    .line 89
    instance-of p0, v2, Landroid/database/sqlite/SQLiteConstraintException;

    .line 90
    .line 91
    if-nez p0, :cond_3

    .line 92
    .line 93
    instance-of p0, v2, Landroid/database/sqlite/SQLiteDatabaseCorruptException;

    .line 94
    .line 95
    if-nez p0, :cond_3

    .line 96
    .line 97
    instance-of p0, v2, Landroid/database/sqlite/SQLiteDatabaseLockedException;

    .line 98
    .line 99
    if-nez p0, :cond_3

    .line 100
    .line 101
    instance-of p0, v2, Landroid/database/sqlite/SQLiteDiskIOException;

    .line 102
    .line 103
    if-nez p0, :cond_3

    .line 104
    .line 105
    instance-of p0, v2, Landroid/database/sqlite/SQLiteFullException;

    .line 106
    .line 107
    if-nez p0, :cond_3

    .line 108
    .line 109
    instance-of p0, v2, Landroid/database/sqlite/SQLiteTableLockedException;

    .line 110
    .line 111
    if-eqz p0, :cond_2

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_2
    throw v2

    .line 115
    :cond_3
    :goto_2
    const-string p0, "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store."

    .line 116
    .line 117
    invoke-static {}, Llh4;->P0()Llh4;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    invoke-direct {v3, p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    throw v3

    .line 133
    :cond_4
    invoke-static {}, Llh4;->P0()Llh4;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget v2, p0, Ljj2;->f0:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 141
    .line 142
    int-to-long v5, v2

    .line 143
    const-wide/16 v7, 0x12c

    .line 144
    .line 145
    mul-long/2addr v5, v7

    .line 146
    :try_start_7
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :catch_2
    move-exception p0

    .line 151
    :try_start_8
    const-string v2, "Unexpected SQLite exception during migrations"

    .line 152
    .line 153
    invoke-static {}, Llh4;->P0()Llh4;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    invoke-direct {v3, v2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    throw v3

    .line 169
    :cond_5
    const-string p0, "WorkManager can\'t be accessed from direct boot, because credential encrypted storage isn\'t accessible.\nDon\'t access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot"

    .line 170
    .line 171
    invoke-static {}, Llh4;->P0()Llh4;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 179
    .line 180
    invoke-direct {v2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 187
    :goto_3
    invoke-virtual {v0}, Lx39;->x0()V

    .line 188
    .line 189
    .line 190
    throw p0
.end method
