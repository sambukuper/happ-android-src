.class public final Lx39;
.super Lw39;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static t0:Lx39;

.field public static u0:Lx39;

.field public static final v0:Ljava/lang/Object;


# instance fields
.field public final i0:Landroid/content/Context;

.field public final j0:Lxy0;

.field public final k0:Landroidx/work/impl/WorkDatabase;

.field public final l0:Ly5;

.field public final m0:Ljava/util/List;

.field public final n0:Lfv5;

.field public final o0:Llr5;

.field public p0:Z

.field public q0:Landroid/content/BroadcastReceiver$PendingResult;

.field public volatile r0:Lpd6;

.field public final s0:Ly5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WorkManagerImpl"

    .line 2
    .line 3
    invoke-static {v0}, Llh4;->a1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    sput-object v0, Lx39;->t0:Lx39;

    .line 8
    .line 9
    sput-object v0, Lx39;->u0:Lx39;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lx39;->v0:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lxy0;Ly5;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Lfv5;Ly5;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    move-object/from16 v5, p6

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    iput-boolean v6, v0, Lx39;->p0:Z

    .line 18
    .line 19
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-virtual {v7}, Landroid/content/Context;->isDeviceProtectedStorage()Z

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    const/4 v9, 0x0

    .line 28
    if-nez v8, :cond_6

    .line 29
    .line 30
    new-instance v8, Llh4;

    .line 31
    .line 32
    const/4 v10, 0x4

    .line 33
    invoke-direct {v8, v10}, Llh4;-><init>(I)V

    .line 34
    .line 35
    .line 36
    sget-object v11, Llh4;->Y:Ljava/lang/Object;

    .line 37
    .line 38
    monitor-enter v11

    .line 39
    :try_start_0
    sget-object v12, Llh4;->Z:Llh4;

    .line 40
    .line 41
    if-nez v12, :cond_0

    .line 42
    .line 43
    sput-object v8, Llh4;->Z:Llh4;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_0
    :goto_0
    monitor-exit v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    iput-object v7, v0, Lx39;->i0:Landroid/content/Context;

    .line 51
    .line 52
    iput-object v2, v0, Lx39;->l0:Ly5;

    .line 53
    .line 54
    iput-object v3, v0, Lx39;->k0:Landroidx/work/impl/WorkDatabase;

    .line 55
    .line 56
    iput-object v5, v0, Lx39;->n0:Lfv5;

    .line 57
    .line 58
    move-object/from16 v8, p7

    .line 59
    .line 60
    iput-object v8, v0, Lx39;->s0:Ly5;

    .line 61
    .line 62
    iput-object v1, v0, Lx39;->j0:Lxy0;

    .line 63
    .line 64
    iput-object v4, v0, Lx39;->m0:Ljava/util/List;

    .line 65
    .line 66
    iget-object v8, v2, Ly5;->g0:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v8, Lm51;

    .line 69
    .line 70
    new-instance v11, Llr5;

    .line 71
    .line 72
    const/4 v12, 0x1

    .line 73
    invoke-direct {v11, v3, v12}, Llr5;-><init>(Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    iput-object v11, v0, Lx39;->o0:Llr5;

    .line 77
    .line 78
    iget-object v11, v2, Ly5;->Y:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v11, Lh37;

    .line 81
    .line 82
    sget v13, Lax6;->a:I

    .line 83
    .line 84
    new-instance v13, Lzw6;

    .line 85
    .line 86
    invoke-direct {v13, v11, v3, v4, v1}, Lzw6;-><init>(Ljava/util/concurrent/Executor;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Lxy0;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v13}, Lfv5;->a(Lp52;)V

    .line 90
    .line 91
    .line 92
    new-instance v4, Ljj2;

    .line 93
    .line 94
    invoke-direct {v4, v7, v0}, Ljj2;-><init>(Landroid/content/Context;Lx39;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, v2, Ly5;->Y:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lh37;

    .line 100
    .line 101
    invoke-virtual {v0, v4}, Lh37;->execute(Ljava/lang/Runnable;)V

    .line 102
    .line 103
    .line 104
    sget v0, Lfm8;->a:I

    .line 105
    .line 106
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {v7, v1}, Ldv5;->a(Landroid/content/Context;Lxy0;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v0, v0, Ln49;->a:Lql6;

    .line 120
    .line 121
    const-string v1, "workspec"

    .line 122
    .line 123
    filled-new-array {v1}, [Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    new-instance v2, Lut8;

    .line 128
    .line 129
    const/16 v3, 0x15

    .line 130
    .line 131
    invoke-direct {v2, v3}, Lut8;-><init>(B)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Lql6;->f()Lfi3;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-static {v1, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, [Ljava/lang/String;

    .line 143
    .line 144
    iget-object v3, v3, Lfi3;->b:Lxf8;

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance v4, Lo57;

    .line 150
    .line 151
    invoke-direct {v4}, Lo57;-><init>()V

    .line 152
    .line 153
    .line 154
    array-length v5, v1

    .line 155
    move v11, v6

    .line 156
    :goto_1
    if-ge v11, v5, :cond_2

    .line 157
    .line 158
    aget-object v13, v1, v11

    .line 159
    .line 160
    iget-object v14, v3, Lxf8;->c:Ljava/util/LinkedHashMap;

    .line 161
    .line 162
    sget-object v15, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 163
    .line 164
    invoke-virtual {v13, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v15

    .line 168
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v14, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v14

    .line 175
    check-cast v14, Ljava/util/Set;

    .line 176
    .line 177
    if-eqz v14, :cond_1

    .line 178
    .line 179
    check-cast v14, Ljava/util/Collection;

    .line 180
    .line 181
    invoke-virtual {v4, v14}, Lo57;->addAll(Ljava/util/Collection;)Z

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_1
    invoke-virtual {v4, v13}, Lo57;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    :goto_2
    add-int/lit8 v11, v11, 0x1

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_2
    invoke-static {v4}, Lw45;->m(Lo57;)Lo57;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    new-array v4, v6, [Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v1, v4}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, [Ljava/lang/String;

    .line 202
    .line 203
    array-length v4, v1

    .line 204
    new-array v5, v4, [I

    .line 205
    .line 206
    :goto_3
    if-ge v6, v4, :cond_4

    .line 207
    .line 208
    aget-object v11, v1, v6

    .line 209
    .line 210
    iget-object v13, v3, Lxf8;->f:Ljava/util/LinkedHashMap;

    .line 211
    .line 212
    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 213
    .line 214
    invoke-virtual {v11, v14}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v14

    .line 218
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v13, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v13

    .line 225
    check-cast v13, Ljava/lang/Integer;

    .line 226
    .line 227
    if-eqz v13, :cond_3

    .line 228
    .line 229
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    aput v11, v5, v6

    .line 234
    .line 235
    add-int/lit8 v6, v6, 0x1

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_3
    const-string v1, "There is no table with name "

    .line 239
    .line 240
    invoke-virtual {v1, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-static {v1}, Lbt;->q(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_4
    new-instance v9, Lqg5;

    .line 249
    .line 250
    invoke-direct {v9, v1, v5}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :goto_4
    iget-object v1, v9, Lqg5;->X:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v1, [Ljava/lang/String;

    .line 256
    .line 257
    iget-object v4, v9, Lqg5;->Y:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v4, [I

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    new-instance v5, Lwu1;

    .line 268
    .line 269
    const/16 v6, 0xb

    .line 270
    .line 271
    const/4 v9, 0x0

    .line 272
    move-object/from16 p3, v1

    .line 273
    .line 274
    move-object/from16 p1, v3

    .line 275
    .line 276
    move-object/from16 p2, v4

    .line 277
    .line 278
    move-object/from16 p0, v5

    .line 279
    .line 280
    move/from16 p5, v6

    .line 281
    .line 282
    move-object/from16 p4, v9

    .line 283
    .line 284
    invoke-direct/range {p0 .. p5}, Lwu1;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Lq51;B)V

    .line 285
    .line 286
    .line 287
    move-object/from16 v1, p0

    .line 288
    .line 289
    move-object/from16 v3, p4

    .line 290
    .line 291
    new-instance v4, Lj31;

    .line 292
    .line 293
    const/4 v5, 0x7

    .line 294
    invoke-direct {v4, v1, v5}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 295
    .line 296
    .line 297
    const/4 v1, -0x1

    .line 298
    invoke-static {v4, v1}, Lzc1;->o(Lxe2;I)Lxe2;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    new-instance v5, Lqg2;

    .line 303
    .line 304
    invoke-direct {v5, v4, v0, v2, v12}, Lqg2;-><init>(Lxe2;Ljava/lang/Object;Lon2;B)V

    .line 305
    .line 306
    .line 307
    new-instance v0, Lem8;

    .line 308
    .line 309
    invoke-direct {v0, v10, v3}, Luy7;-><init>(ILq51;)V

    .line 310
    .line 311
    .line 312
    new-instance v2, Llf2;

    .line 313
    .line 314
    const/4 v4, 0x3

    .line 315
    invoke-direct {v2, v5, v0, v4}, Llf2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 316
    .line 317
    .line 318
    invoke-static {v2, v1}, Lzc1;->o(Lxe2;I)Lxe2;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-static {v0}, Lw51;->t(Lxe2;)Lxe2;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    new-instance v1, Lym7;

    .line 327
    .line 328
    const/16 v2, 0xa

    .line 329
    .line 330
    invoke-direct {v1, v7, v3, v2}, Lym7;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 331
    .line 332
    .line 333
    new-instance v2, Lsf2;

    .line 334
    .line 335
    const/4 v5, 0x2

    .line 336
    invoke-direct {v2, v0, v1, v5}, Lsf2;-><init>(Lxe2;Lrn2;B)V

    .line 337
    .line 338
    .line 339
    new-instance v0, Lr5;

    .line 340
    .line 341
    const/16 v1, 0xc

    .line 342
    .line 343
    invoke-direct {v0, v2, v3, v1}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 344
    .line 345
    .line 346
    invoke-static {v8, v3, v3, v0, v4}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 347
    .line 348
    .line 349
    :cond_5
    return-void

    .line 350
    :goto_5
    :try_start_1
    monitor-exit v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 351
    throw v0

    .line 352
    :cond_6
    const-string v0, "Cannot initialize WorkManager in direct boot mode"

    .line 353
    .line 354
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw v9
.end method

.method public static v0(Landroid/content/Context;)Lx39;
    .locals 2

    .line 1
    sget-object v0, Lx39;->v0:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    sget-object v1, Lx39;->t0:Lx39;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    goto :goto_2

    .line 13
    :cond_0
    sget-object v1, Lx39;->u0:Lx39;

    .line 14
    .line 15
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    :goto_0
    if-nez v1, :cond_2

    .line 17
    .line 18
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    instance-of v1, p0, Lsu/happ/proxyutility/HappApplication;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    move-object v1, p0

    .line 27
    check-cast v1, Lsu/happ/proxyutility/HappApplication;

    .line 28
    .line 29
    invoke-virtual {v1}, Lsu/happ/proxyutility/HappApplication;->j()Lxy0;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {p0, v1}, Lx39;->w0(Landroid/content/Context;Lxy0;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Lx39;->v0(Landroid/content/Context;)Lx39;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    goto :goto_1

    .line 41
    :catchall_1
    move-exception p0

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    .line 46
    .line 47
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_2
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    return-object v1

    .line 53
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 54
    :try_start_4
    throw p0

    .line 55
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 56
    throw p0
.end method

.method public static w0(Landroid/content/Context;Lxy0;)V
    .locals 3

    .line 1
    sget-object v0, Lx39;->v0:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lx39;->t0:Lx39;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    sget-object v2, Lx39;->u0:Lx39;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string p1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    if-nez v1, :cond_3

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v1, Lx39;->u0:Lx39;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    invoke-static {p0, p1}, Lz39;->q(Landroid/content/Context;Lxy0;)Lx39;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sput-object v1, Lx39;->u0:Lx39;

    .line 38
    .line 39
    :cond_2
    sput-object v1, Lx39;->t0:Lx39;

    .line 40
    .line 41
    :cond_3
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p0
.end method


# virtual methods
.method public final x0()V
    .locals 2

    .line 1
    sget-object v0, Lx39;->v0:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lx39;->p0:Z

    .line 6
    .line 7
    iget-object v1, p0, Lx39;->q0:Landroid/content/BroadcastReceiver$PendingResult;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Lx39;->q0:Landroid/content/BroadcastReceiver$PendingResult;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
.end method

.method public final y0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx39;->j0:Lxy0;

    .line 2
    .line 3
    iget-object v0, v0, Lxy0;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v0, "ReschedulingWork"

    .line 6
    .line 7
    new-instance v1, Lim0;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, p0, v2}, Lim0;-><init>(Lx39;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lln7;->c()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lim0;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    :goto_1
    if-eqz p0, :cond_2

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 37
    .line 38
    .line 39
    :cond_2
    throw v0
.end method
