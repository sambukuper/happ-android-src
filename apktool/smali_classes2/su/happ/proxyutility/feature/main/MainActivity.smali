.class public final Lsu/happ/proxyutility/feature/main/MainActivity;
.super Lsu/happ/proxyutility/ui/SnackbarHostActivity;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgv7;
.implements Lzl4;
.implements Luu7;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lsu/happ/proxyutility/feature/main/MainActivity;",
        "Lsu/happ/proxyutility/ui/SnackbarHostActivity;",
        "Lgv7;",
        "Lzl4;",
        "Luu7;",
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
.field public static final synthetic y1:I


# instance fields
.field public Q0:Lb6;

.field public final R0:Lm51;

.field public final S0:Lvz7;

.field public final T0:Lvz7;

.field public final U0:Lvz7;

.field public final V0:Lvz7;

.field public final W0:Lvz7;

.field public final X0:Lvz7;

.field public final Y0:Lr6;

.field public final Z0:Lx90;

.field public final a1:Lr6;

.field public final b1:Lr6;

.field public c1:Log7;

.field public final d1:Lu77;

.field public final e1:Ly5;

.field public final f1:Ly5;

.field public final g1:Ly5;

.field public final h1:Ly5;

.field public final i1:Ly5;

.field public final j1:Ly5;

.field public final k1:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final l1:Lgk7;

.field public final m1:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final n1:Ljava/util/concurrent/ConcurrentHashMap;

.field public final o1:Lq02;

.field public final p1:Lvz7;

.field public final q1:Lq15;

.field public final r1:Lvz7;

.field public final s1:Lvz7;

.field public final t1:Lvz7;

.field public final u1:Lvz7;

.field public v1:Z

.field public w1:Landroid/animation/ValueAnimator;

.field public final x1:Lr6;


# direct methods
.method public constructor <init>()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Lsu/happ/proxyutility/ui/BaseActivity;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lpw7;->b()Low7;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Ltp1;->a:Lnf1;

    .line 11
    .line 12
    sget-object v2, Lye1;->Z:Lye1;

    .line 13
    .line 14
    invoke-static {v1, v2}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Lgv3;->c(Ls61;)Lm51;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->R0:Lm51;

    .line 23
    .line 24
    new-instance v1, Lmj4;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v1, v0, v2}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Lvz7;

    .line 31
    .line 32
    invoke-direct {v3, v1}, Lvz7;-><init>(Ldn2;)V

    .line 33
    .line 34
    .line 35
    iput-object v3, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->S0:Lvz7;

    .line 36
    .line 37
    new-instance v1, Lmj4;

    .line 38
    .line 39
    const/16 v3, 0xc

    .line 40
    .line 41
    invoke-direct {v1, v0, v3}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 42
    .line 43
    .line 44
    new-instance v4, Lvz7;

    .line 45
    .line 46
    invoke-direct {v4, v1}, Lvz7;-><init>(Ldn2;)V

    .line 47
    .line 48
    .line 49
    iput-object v4, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->T0:Lvz7;

    .line 50
    .line 51
    new-instance v1, Lsh4;

    .line 52
    .line 53
    const/4 v4, 0x5

    .line 54
    invoke-direct {v1, v4}, Lsh4;-><init>(B)V

    .line 55
    .line 56
    .line 57
    new-instance v5, Lvz7;

    .line 58
    .line 59
    invoke-direct {v5, v1}, Lvz7;-><init>(Ldn2;)V

    .line 60
    .line 61
    .line 62
    iput-object v5, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->U0:Lvz7;

    .line 63
    .line 64
    new-instance v1, Lsh4;

    .line 65
    .line 66
    const/4 v5, 0x6

    .line 67
    invoke-direct {v1, v5}, Lsh4;-><init>(B)V

    .line 68
    .line 69
    .line 70
    new-instance v6, Lvz7;

    .line 71
    .line 72
    invoke-direct {v6, v1}, Lvz7;-><init>(Ldn2;)V

    .line 73
    .line 74
    .line 75
    iput-object v6, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->V0:Lvz7;

    .line 76
    .line 77
    new-instance v1, Lmj4;

    .line 78
    .line 79
    const/16 v6, 0xd

    .line 80
    .line 81
    invoke-direct {v1, v0, v6}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 82
    .line 83
    .line 84
    new-instance v7, Lvz7;

    .line 85
    .line 86
    invoke-direct {v7, v1}, Lvz7;-><init>(Ldn2;)V

    .line 87
    .line 88
    .line 89
    iput-object v7, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->W0:Lvz7;

    .line 90
    .line 91
    new-instance v1, Lsh4;

    .line 92
    .line 93
    const/4 v7, 0x3

    .line 94
    invoke-direct {v1, v7}, Lsh4;-><init>(B)V

    .line 95
    .line 96
    .line 97
    new-instance v8, Lvz7;

    .line 98
    .line 99
    invoke-direct {v8, v1}, Lvz7;-><init>(Ldn2;)V

    .line 100
    .line 101
    .line 102
    iput-object v8, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->X0:Lvz7;

    .line 103
    .line 104
    new-instance v1, Ln6;

    .line 105
    .line 106
    const/4 v8, 0x2

    .line 107
    invoke-direct {v1, v8}, Ln6;-><init>(B)V

    .line 108
    .line 109
    .line 110
    new-instance v9, Lnj4;

    .line 111
    .line 112
    invoke-direct {v9, v0, v2}, Lnj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v9, v1}, Landroidx/activity/ComponentActivity;->m(Lj6;Lyn0;)Lr6;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iput-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Y0:Lr6;

    .line 120
    .line 121
    const/4 v1, 0x1

    .line 122
    sget-object v9, Ll90;->Y:Ll90;

    .line 123
    .line 124
    const/4 v10, 0x0

    .line 125
    const/4 v11, 0x4

    .line 126
    invoke-static {v1, v9, v10, v11}, Lgv3;->b(ILl90;Lgn2;I)Lx90;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    iput-object v9, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Z0:Lx90;

    .line 131
    .line 132
    new-instance v9, Ln6;

    .line 133
    .line 134
    invoke-direct {v9, v8}, Ln6;-><init>(B)V

    .line 135
    .line 136
    .line 137
    new-instance v12, Lnj4;

    .line 138
    .line 139
    invoke-direct {v12, v0, v1}, Lnj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v12, v9}, Landroidx/activity/ComponentActivity;->m(Lj6;Lyn0;)Lr6;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    iput-object v9, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->a1:Lr6;

    .line 147
    .line 148
    new-instance v9, Ln6;

    .line 149
    .line 150
    invoke-direct {v9, v8}, Ln6;-><init>(B)V

    .line 151
    .line 152
    .line 153
    new-instance v12, Lnj4;

    .line 154
    .line 155
    invoke-direct {v12, v0, v8}, Lnj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v12, v9}, Landroidx/activity/ComponentActivity;->m(Lj6;Lyn0;)Lr6;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    iput-object v9, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->b1:Lr6;

    .line 163
    .line 164
    const/4 v9, 0x7

    .line 165
    invoke-static {v2, v9, v10}, Lv77;->b(IILl90;)Lu77;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    iput-object v10, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->d1:Lu77;

    .line 170
    .line 171
    new-instance v10, Luj4;

    .line 172
    .line 173
    const/16 v12, 0xa

    .line 174
    .line 175
    invoke-direct {v10, v0, v12}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 176
    .line 177
    .line 178
    new-instance v12, Ly5;

    .line 179
    .line 180
    sget-object v13, Lyb6;->a:Lzb6;

    .line 181
    .line 182
    const-class v14, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 183
    .line 184
    invoke-virtual {v13, v14}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    new-instance v15, Luj4;

    .line 189
    .line 190
    const/16 v2, 0xb

    .line 191
    .line 192
    invoke-direct {v15, v0, v2}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 193
    .line 194
    .line 195
    new-instance v2, Luj4;

    .line 196
    .line 197
    invoke-direct {v2, v0, v3}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 198
    .line 199
    .line 200
    invoke-direct {v12, v14, v15, v10, v2}, Ly5;-><init>(Lzu3;Ldn2;Ldn2;Ldn2;)V

    .line 201
    .line 202
    .line 203
    iput-object v12, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->e1:Ly5;

    .line 204
    .line 205
    new-instance v2, Luj4;

    .line 206
    .line 207
    invoke-direct {v2, v0, v6}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 208
    .line 209
    .line 210
    new-instance v3, Ly5;

    .line 211
    .line 212
    const-class v6, Lsq6;

    .line 213
    .line 214
    invoke-virtual {v13, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    new-instance v10, Luj4;

    .line 219
    .line 220
    const/16 v12, 0xe

    .line 221
    .line 222
    invoke-direct {v10, v0, v12}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 223
    .line 224
    .line 225
    new-instance v12, Luj4;

    .line 226
    .line 227
    const/16 v14, 0xf

    .line 228
    .line 229
    invoke-direct {v12, v0, v14}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v3, v6, v10, v2, v12}, Ly5;-><init>(Lzu3;Ldn2;Ldn2;Ldn2;)V

    .line 233
    .line 234
    .line 235
    iput-object v3, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->f1:Ly5;

    .line 236
    .line 237
    new-instance v2, Luj4;

    .line 238
    .line 239
    const/16 v3, 0x10

    .line 240
    .line 241
    invoke-direct {v2, v0, v3}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 242
    .line 243
    .line 244
    new-instance v3, Ly5;

    .line 245
    .line 246
    const-class v6, Lgw5;

    .line 247
    .line 248
    invoke-virtual {v13, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    new-instance v10, Luj4;

    .line 253
    .line 254
    const/16 v12, 0x11

    .line 255
    .line 256
    invoke-direct {v10, v0, v12}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 257
    .line 258
    .line 259
    new-instance v12, Luj4;

    .line 260
    .line 261
    const/16 v14, 0x12

    .line 262
    .line 263
    invoke-direct {v12, v0, v14}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 264
    .line 265
    .line 266
    invoke-direct {v3, v6, v10, v2, v12}, Ly5;-><init>(Lzu3;Ldn2;Ldn2;Ldn2;)V

    .line 267
    .line 268
    .line 269
    iput-object v3, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->g1:Ly5;

    .line 270
    .line 271
    new-instance v2, Luj4;

    .line 272
    .line 273
    invoke-direct {v2, v0, v1}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 274
    .line 275
    .line 276
    new-instance v3, Ly5;

    .line 277
    .line 278
    const-class v6, Ldr2;

    .line 279
    .line 280
    invoke-virtual {v13, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    new-instance v10, Luj4;

    .line 285
    .line 286
    invoke-direct {v10, v0, v8}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 287
    .line 288
    .line 289
    new-instance v12, Luj4;

    .line 290
    .line 291
    invoke-direct {v12, v0, v7}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 292
    .line 293
    .line 294
    invoke-direct {v3, v6, v10, v2, v12}, Ly5;-><init>(Lzu3;Ldn2;Ldn2;Ldn2;)V

    .line 295
    .line 296
    .line 297
    iput-object v3, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->h1:Ly5;

    .line 298
    .line 299
    new-instance v2, Luj4;

    .line 300
    .line 301
    invoke-direct {v2, v0, v11}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 302
    .line 303
    .line 304
    new-instance v3, Ly5;

    .line 305
    .line 306
    const-class v6, Lza3;

    .line 307
    .line 308
    invoke-virtual {v13, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    new-instance v10, Luj4;

    .line 313
    .line 314
    invoke-direct {v10, v0, v4}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 315
    .line 316
    .line 317
    new-instance v4, Luj4;

    .line 318
    .line 319
    invoke-direct {v4, v0, v5}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 320
    .line 321
    .line 322
    invoke-direct {v3, v6, v10, v2, v4}, Ly5;-><init>(Lzu3;Ldn2;Ldn2;Ldn2;)V

    .line 323
    .line 324
    .line 325
    iput-object v3, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->i1:Ly5;

    .line 326
    .line 327
    new-instance v2, Luj4;

    .line 328
    .line 329
    invoke-direct {v2, v0, v9}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 330
    .line 331
    .line 332
    new-instance v3, Ly5;

    .line 333
    .line 334
    const-class v4, Lkr7;

    .line 335
    .line 336
    invoke-virtual {v13, v4}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    new-instance v6, Luj4;

    .line 341
    .line 342
    const/16 v9, 0x8

    .line 343
    .line 344
    invoke-direct {v6, v0, v9}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 345
    .line 346
    .line 347
    new-instance v9, Luj4;

    .line 348
    .line 349
    const/16 v10, 0x9

    .line 350
    .line 351
    invoke-direct {v9, v0, v10}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 352
    .line 353
    .line 354
    invoke-direct {v3, v4, v6, v2, v9}, Ly5;-><init>(Lzu3;Ldn2;Ldn2;Ldn2;)V

    .line 355
    .line 356
    .line 357
    iput-object v3, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->j1:Ly5;

    .line 358
    .line 359
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 360
    .line 361
    const/4 v3, 0x0

    .line 362
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 363
    .line 364
    .line 365
    iput-object v2, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->k1:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 366
    .line 367
    sget-object v2, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 368
    .line 369
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-virtual {v2}, Lsu/happ/proxyutility/HappApplication;->g()Lgk7;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    iput-object v2, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->l1:Lgk7;

    .line 378
    .line 379
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 380
    .line 381
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 382
    .line 383
    .line 384
    iput-object v2, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->m1:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 385
    .line 386
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 387
    .line 388
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 389
    .line 390
    .line 391
    iput-object v2, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->n1:Ljava/util/concurrent/ConcurrentHashMap;

    .line 392
    .line 393
    new-instance v2, Lq02;

    .line 394
    .line 395
    invoke-direct {v2, v0, v14}, Lq02;-><init>(Ljava/lang/Object;B)V

    .line 396
    .line 397
    .line 398
    iput-object v2, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->o1:Lq02;

    .line 399
    .line 400
    new-instance v2, Lmj4;

    .line 401
    .line 402
    invoke-direct {v2, v0, v1}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 403
    .line 404
    .line 405
    new-instance v1, Lvz7;

    .line 406
    .line 407
    invoke-direct {v1, v2}, Lvz7;-><init>(Ldn2;)V

    .line 408
    .line 409
    .line 410
    iput-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->p1:Lvz7;

    .line 411
    .line 412
    invoke-static {}, Lr15;->a()Lq15;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    iput-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->q1:Lq15;

    .line 417
    .line 418
    new-instance v1, Lmj4;

    .line 419
    .line 420
    invoke-direct {v1, v0, v8}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 421
    .line 422
    .line 423
    new-instance v2, Lvz7;

    .line 424
    .line 425
    invoke-direct {v2, v1}, Lvz7;-><init>(Ldn2;)V

    .line 426
    .line 427
    .line 428
    iput-object v2, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->r1:Lvz7;

    .line 429
    .line 430
    new-instance v1, Lsh4;

    .line 431
    .line 432
    invoke-direct {v1, v11}, Lsh4;-><init>(B)V

    .line 433
    .line 434
    .line 435
    new-instance v2, Lvz7;

    .line 436
    .line 437
    invoke-direct {v2, v1}, Lvz7;-><init>(Ldn2;)V

    .line 438
    .line 439
    .line 440
    iput-object v2, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->s1:Lvz7;

    .line 441
    .line 442
    new-instance v1, Lmj4;

    .line 443
    .line 444
    invoke-direct {v1, v0, v5}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 445
    .line 446
    .line 447
    new-instance v2, Lvz7;

    .line 448
    .line 449
    invoke-direct {v2, v1}, Lvz7;-><init>(Ldn2;)V

    .line 450
    .line 451
    .line 452
    iput-object v2, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->t1:Lvz7;

    .line 453
    .line 454
    new-instance v1, Lmj4;

    .line 455
    .line 456
    invoke-direct {v1, v0, v10}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 457
    .line 458
    .line 459
    new-instance v2, Lvz7;

    .line 460
    .line 461
    invoke-direct {v2, v1}, Lvz7;-><init>(Ldn2;)V

    .line 462
    .line 463
    .line 464
    iput-object v2, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->u1:Lvz7;

    .line 465
    .line 466
    new-array v1, v8, [F

    .line 467
    .line 468
    fill-array-data v1, :array_0

    .line 469
    .line 470
    .line 471
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    iput-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->w1:Landroid/animation/ValueAnimator;

    .line 476
    .line 477
    new-instance v1, Ln6;

    .line 478
    .line 479
    invoke-direct {v1, v8}, Ln6;-><init>(B)V

    .line 480
    .line 481
    .line 482
    new-instance v2, Lnj4;

    .line 483
    .line 484
    invoke-direct {v2, v0, v7}, Lnj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0, v2, v1}, Landroidx/activity/ComponentActivity;->m(Lj6;Lyn0;)Lr6;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    iput-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->x1:Lr6;

    .line 492
    .line 493
    return-void

    .line 494
    nop

    .line 495
    :array_0
    .array-data 4
        0x0
        0x43b40000    # 360.0f
    .end array-data
.end method

.method public static L(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ls51;I)Ljava/lang/Object;
    .locals 11

    .line 1
    move/from16 v0, p7

    .line 2
    .line 3
    sget-object v1, Lsu/happ/proxyutility/domain/sub/SubId;->Companion:Lcn7;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/SubId;->c()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v5

    .line 12
    and-int/lit8 v1, v0, 0x10

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move-object v6, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v6, p3

    .line 20
    :goto_0
    and-int/lit8 p3, v0, 0x20

    .line 21
    .line 22
    if-eqz p3, :cond_1

    .line 23
    .line 24
    move-object v7, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-object v7, p4

    .line 27
    :goto_1
    and-int/lit8 p3, v0, 0x40

    .line 28
    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    move-object v8, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object/from16 v8, p5

    .line 34
    .line 35
    :goto_2
    and-int/lit16 p3, v0, 0x80

    .line 36
    .line 37
    if-eqz p3, :cond_3

    .line 38
    .line 39
    const/4 p3, 0x1

    .line 40
    :goto_3
    move-object v2, p0

    .line 41
    move-object v3, p1

    .line 42
    move v4, p2

    .line 43
    move v9, p3

    .line 44
    move-object/from16 v10, p6

    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_3
    const/4 p3, 0x0

    .line 48
    goto :goto_3

    .line 49
    :goto_4
    invoke-virtual/range {v2 .. v10}, Lsu/happ/proxyutility/feature/main/MainActivity;->K(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLs51;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public static final M(Ljava/lang/String;Lsu/happ/proxyutility/feature/main/MainActivity;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ls51;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p8

    instance-of v5, v4, Lik4;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Lik4;

    iget v6, v5, Lik4;->t0:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lik4;->t0:I

    goto :goto_0

    :cond_0
    new-instance v5, Lik4;

    .line 1
    invoke-direct {v5, v4}, Ls51;-><init>(Lq51;)V

    .line 2
    :goto_0
    iget-object v4, v5, Lik4;->s0:Ljava/lang/Object;

    .line 3
    iget v6, v5, Lik4;->t0:I

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    sget-object v13, Lc71;->X:Lc71;

    if-eqz v6, :cond_5

    if-eq v6, v11, :cond_4

    if-eq v6, v10, :cond_3

    if-eq v6, v9, :cond_2

    if-ne v6, v8, :cond_1

    invoke-static {v4}, Lw39;->n0(Ljava/lang/Object;)V

    return-object v4

    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    return-object v12

    :cond_2
    iget-boolean v0, v5, Lik4;->r0:Z

    iget-boolean v1, v5, Lik4;->q0:Z

    iget-boolean v2, v5, Lik4;->p0:Z

    iget-boolean v3, v5, Lik4;->o0:Z

    iget-boolean v6, v5, Lik4;->n0:Z

    iget-object v7, v5, Lik4;->m0:Ljava/lang/String;

    iget-object v9, v5, Lik4;->l0:Ljava/util/List;

    iget-object v14, v5, Lik4;->k0:Ljava/lang/Boolean;

    iget-object v15, v5, Lik4;->j0:Ljava/lang/Boolean;

    iget-object v8, v5, Lik4;->i0:Ljava/lang/String;

    iget-object v10, v5, Lik4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    iget-object v12, v5, Lik4;->f0:Ljava/lang/String;

    invoke-static {v4}, Lw39;->n0(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_3
    iget-boolean v0, v5, Lik4;->r0:Z

    iget-boolean v1, v5, Lik4;->q0:Z

    iget-boolean v2, v5, Lik4;->p0:Z

    iget-boolean v3, v5, Lik4;->o0:Z

    iget-boolean v6, v5, Lik4;->n0:Z

    iget-object v8, v5, Lik4;->m0:Ljava/lang/String;

    iget-object v10, v5, Lik4;->l0:Ljava/util/List;

    iget-object v12, v5, Lik4;->k0:Ljava/lang/Boolean;

    iget-object v14, v5, Lik4;->j0:Ljava/lang/Boolean;

    iget-object v15, v5, Lik4;->i0:Ljava/lang/String;

    iget-object v9, v5, Lik4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    iget-object v7, v5, Lik4;->f0:Ljava/lang/String;

    invoke-static {v4}, Lw39;->n0(Ljava/lang/Object;)V

    move-object/from16 v24, v12

    move-object v12, v7

    move-object v7, v8

    move-object v8, v15

    move-object v15, v14

    move-object/from16 v14, v24

    move-object/from16 v24, v10

    move-object v10, v9

    move-object/from16 v9, v24

    goto/16 :goto_6

    :cond_4
    iget-boolean v0, v5, Lik4;->p0:Z

    iget-boolean v1, v5, Lik4;->o0:Z

    iget-boolean v2, v5, Lik4;->n0:Z

    iget-object v3, v5, Lik4;->k0:Ljava/lang/Boolean;

    iget-object v6, v5, Lik4;->j0:Ljava/lang/Boolean;

    iget-object v7, v5, Lik4;->i0:Ljava/lang/String;

    iget-object v8, v5, Lik4;->h0:Ljava/lang/String;

    iget-object v9, v5, Lik4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    iget-object v10, v5, Lik4;->f0:Ljava/lang/String;

    invoke-static {v4}, Lw39;->n0(Ljava/lang/Object;)V

    move-object v12, v3

    goto/16 :goto_2

    :cond_5
    invoke-static {v4}, Lw39;->n0(Ljava/lang/Object;)V

    if-eqz v0, :cond_1f

    .line 4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_13

    .line 5
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    invoke-static {v0}, Lae1;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/enums/EDeeplinkType;

    move-result-object v4

    sget-object v6, Lsu/happ/proxyutility/dto/enums/EDeeplinkType;->ROUTING:Lsu/happ/proxyutility/dto/enums/EDeeplinkType;

    if-ne v4, v6, :cond_8

    .line 7
    iget-object v2, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->f1:Ly5;

    invoke-virtual {v2}, Ly5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsq6;

    .line 8
    sget-object v3, Loq6;->a:Loq6;

    invoke-virtual {v2, v3}, Lsq6;->f(Lqq6;)V

    .line 9
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    move-result-object v1

    .line 10
    iget-object v4, v1, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 11
    :cond_7
    invoke-virtual {v4}, Loh7;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 12
    move-object v5, v1

    check-cast v5, Lxm4;

    .line 13
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    new-instance v2, Lvm4;

    invoke-direct {v2, v0}, Lvm4;-><init>(Ljava/lang/String;)V

    const/16 v22, 0x0

    const v23, 0xfbff

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, v2

    .line 15
    invoke-static/range {v5 .. v23}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    move-result-object v2

    .line 16
    invoke-virtual {v4, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 17
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    .line 18
    :cond_8
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->H()Lcom/tencent/mmkv/MMKV;

    move-result-object v4

    .line 19
    const-string v6, "pref_reject_duplicates_subscription"

    .line 20
    invoke-virtual {v4, v6, v11}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    move-result v4

    .line 21
    sget-object v6, Ltp1;->a:Lnf1;

    .line 22
    sget-object v6, Lye1;->Z:Lye1;

    .line 23
    new-instance v7, Lvh;

    const/4 v8, 0x2

    const/4 v9, 0x0

    .line 24
    invoke-direct {v7, v8, v9, v11}, Lvh;-><init>(ILq51;B)V

    .line 25
    iput-object v0, v5, Lik4;->f0:Ljava/lang/String;

    iput-object v1, v5, Lik4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    move-object/from16 v8, p4

    iput-object v8, v5, Lik4;->h0:Ljava/lang/String;

    move-object/from16 v9, p5

    iput-object v9, v5, Lik4;->i0:Ljava/lang/String;

    move-object/from16 v10, p6

    iput-object v10, v5, Lik4;->j0:Ljava/lang/Boolean;

    move-object/from16 v12, p7

    iput-object v12, v5, Lik4;->k0:Ljava/lang/Boolean;

    iput-boolean v2, v5, Lik4;->n0:Z

    iput-boolean v3, v5, Lik4;->o0:Z

    iput-boolean v4, v5, Lik4;->p0:Z

    iput v11, v5, Lik4;->t0:I

    .line 26
    invoke-static {v6, v7, v5}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v13, :cond_9

    :goto_1
    move-object v0, v13

    goto/16 :goto_12

    :cond_9
    move-object v7, v10

    move-object v10, v0

    move v0, v4

    move-object v4, v6

    move-object v6, v7

    move-object v7, v9

    move-object v9, v1

    move v1, v3

    .line 27
    :goto_2
    check-cast v4, Ljava/util/List;

    .line 28
    const-string v3, "happ://add/"

    invoke-static {v3, v10}, Lfm7;->x0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_d

    .line 29
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_b

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object v11, v15

    check-cast v11, Lqg5;

    .line 30
    iget-object v11, v11, Lqg5;->Y:Ljava/lang/Object;

    .line 31
    check-cast v11, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 32
    invoke-virtual {v11, v3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->Y(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_a

    goto :goto_4

    :cond_a
    const/4 v11, 0x1

    goto :goto_3

    :cond_b
    const/4 v15, 0x0

    .line 33
    :goto_4
    check-cast v15, Lqg5;

    if-nez v15, :cond_c

    .line 34
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    new-instance v11, Lsu/happ/proxyutility/domain/sub/SubId;

    invoke-direct {v11, v8}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 36
    new-instance v8, Lqg5;

    invoke-direct {v8, v3, v11}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    .line 37
    :cond_c
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 38
    iget-object v8, v15, Lqg5;->X:Ljava/lang/Object;

    .line 39
    new-instance v11, Lqg5;

    invoke-direct {v11, v3, v8}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v8, v11

    goto :goto_5

    .line 40
    :cond_d
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 41
    new-instance v11, Lsu/happ/proxyutility/domain/sub/SubId;

    invoke-direct {v11, v8}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 42
    new-instance v8, Lqg5;

    invoke-direct {v8, v3, v11}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    :goto_5
    iget-object v3, v8, Lqg5;->X:Ljava/lang/Object;

    .line 44
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 45
    iget-object v8, v8, Lqg5;->Y:Ljava/lang/Object;

    .line 46
    check-cast v8, Lsu/happ/proxyutility/domain/sub/SubId;

    invoke-virtual {v8}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    move-result-object v8

    .line 47
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    move-result v11

    .line 48
    sget-object v14, Lkw2;->a:Lkw2;

    iput-object v10, v5, Lik4;->f0:Ljava/lang/String;

    iput-object v9, v5, Lik4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    const/4 v15, 0x0

    iput-object v15, v5, Lik4;->h0:Ljava/lang/String;

    iput-object v7, v5, Lik4;->i0:Ljava/lang/String;

    iput-object v6, v5, Lik4;->j0:Ljava/lang/Boolean;

    iput-object v12, v5, Lik4;->k0:Ljava/lang/Boolean;

    iput-object v4, v5, Lik4;->l0:Ljava/util/List;

    iput-object v8, v5, Lik4;->m0:Ljava/lang/String;

    iput-boolean v2, v5, Lik4;->n0:Z

    iput-boolean v1, v5, Lik4;->o0:Z

    iput-boolean v0, v5, Lik4;->p0:Z

    iput-boolean v3, v5, Lik4;->q0:Z

    iput-boolean v11, v5, Lik4;->r0:Z

    const/4 v15, 0x2

    iput v15, v5, Lik4;->t0:I

    invoke-virtual {v14, v10, v8, v11, v5}, Lkw2;->d(Ljava/lang/String;Ljava/lang/String;ZLs51;)Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v13, :cond_e

    goto/16 :goto_1

    :cond_e
    move v15, v3

    move v3, v1

    move v1, v15

    move-object v15, v9

    move-object v9, v4

    move-object v4, v14

    move-object v14, v12

    move-object v12, v10

    move-object v10, v15

    move-object v15, v8

    move-object v8, v7

    move-object v7, v15

    move-object v15, v6

    move v6, v2

    move v2, v0

    move v0, v11

    .line 49
    :goto_6
    move-object v11, v4

    check-cast v11, Lsu/happ/proxyutility/dto/ImportResult;

    .line 50
    sget-object v21, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v21

    move-object/from16 p0, v4

    invoke-virtual/range {v21 .. v21}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    move-result-object v4

    move-object/from16 v21, v13

    new-instance v13, Lqj4;

    move/from16 v22, v0

    const/4 v0, 0x0

    invoke-direct {v13, v11, v0}, Lqj4;-><init>(Lsu/happ/proxyutility/dto/ImportResult;B)V

    invoke-virtual {v4, v13}, Lkf4;->h(Lgn2;)V

    .line 51
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/ImportResult;->c()Lx83;

    move-result-object v0

    instance-of v0, v0, Lr83;

    if-nez v0, :cond_10

    .line 52
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/ImportResult;->b()Lt83;

    move-result-object v0

    instance-of v0, v0, Lr83;

    if-nez v0, :cond_10

    .line 53
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/ImportResult;->b()Lt83;

    move-result-object v0

    instance-of v0, v0, Lm83;

    if-nez v0, :cond_10

    .line 54
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/ImportResult;->b()Lt83;

    move-result-object v0

    instance-of v0, v0, Lp83;

    if-nez v0, :cond_10

    .line 55
    invoke-virtual {v10, v11, v6, v3}, Lsu/happ/proxyutility/feature/main/MainActivity;->W(Lsu/happ/proxyutility/dto/ImportResult;ZZ)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_7

    :cond_f
    const/4 v0, 0x0

    goto :goto_8

    :cond_10
    :goto_7
    move-object/from16 v0, p0

    .line 56
    :goto_8
    check-cast v0, Lsu/happ/proxyutility/dto/ImportResult;

    if-nez v0, :cond_11

    .line 57
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    .line 58
    :cond_11
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ImportResult;->a()I

    move-result v4

    if-gtz v4, :cond_19

    .line 59
    sget-object v0, Lss8;->a:Lss8;

    if-eqz v12, :cond_18

    invoke-static {v12}, Lss8;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_12

    goto :goto_9

    :cond_12
    const/4 v0, 0x0

    :goto_9
    if-eqz v0, :cond_17

    .line 60
    sget-object v4, Lkw2;->a:Lkw2;

    iput-object v12, v5, Lik4;->f0:Ljava/lang/String;

    iput-object v10, v5, Lik4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    const/4 v11, 0x0

    iput-object v11, v5, Lik4;->h0:Ljava/lang/String;

    iput-object v8, v5, Lik4;->i0:Ljava/lang/String;

    iput-object v15, v5, Lik4;->j0:Ljava/lang/Boolean;

    iput-object v14, v5, Lik4;->k0:Ljava/lang/Boolean;

    iput-object v9, v5, Lik4;->l0:Ljava/util/List;

    iput-object v7, v5, Lik4;->m0:Ljava/lang/String;

    iput-boolean v6, v5, Lik4;->n0:Z

    iput-boolean v3, v5, Lik4;->o0:Z

    iput-boolean v2, v5, Lik4;->p0:Z

    iput-boolean v1, v5, Lik4;->q0:Z

    move/from16 v11, v22

    iput-boolean v11, v5, Lik4;->r0:Z

    const/4 v13, 0x3

    iput v13, v5, Lik4;->t0:I

    invoke-virtual {v4, v0, v7, v11, v5}, Lkw2;->d(Ljava/lang/String;Ljava/lang/String;ZLs51;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v13, v21

    if-ne v4, v13, :cond_13

    goto/16 :goto_1

    :cond_13
    move v0, v11

    .line 61
    :goto_a
    move-object v11, v4

    check-cast v11, Lsu/happ/proxyutility/dto/ImportResult;

    .line 62
    sget-object v18, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v18

    move/from16 p0, v0

    invoke-virtual/range {v18 .. v18}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    move-result-object v0

    move/from16 p1, v1

    new-instance v1, Lqj4;

    move/from16 p2, v2

    const/4 v2, 0x1

    invoke-direct {v1, v11, v2}, Lqj4;-><init>(Lsu/happ/proxyutility/dto/ImportResult;B)V

    invoke-virtual {v0, v1}, Lkf4;->h(Lgn2;)V

    .line 63
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/ImportResult;->c()Lx83;

    move-result-object v0

    instance-of v0, v0, Lr83;

    if-nez v0, :cond_15

    .line 64
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/ImportResult;->b()Lt83;

    move-result-object v0

    instance-of v0, v0, Lr83;

    if-nez v0, :cond_15

    .line 65
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/ImportResult;->b()Lt83;

    move-result-object v0

    instance-of v0, v0, Lm83;

    if-nez v0, :cond_15

    .line 66
    invoke-virtual {v10, v11, v6, v3}, Lsu/happ/proxyutility/feature/main/MainActivity;->W(Lsu/happ/proxyutility/dto/ImportResult;ZZ)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_b

    :cond_14
    const/4 v4, 0x0

    .line 67
    :cond_15
    :goto_b
    check-cast v4, Lsu/happ/proxyutility/dto/ImportResult;

    if-nez v4, :cond_16

    .line 68
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_16
    move/from16 v11, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v19, v3

    move-object v0, v4

    const/4 v3, 0x0

    goto :goto_c

    :cond_17
    move-object/from16 v13, v21

    move/from16 v11, v22

    .line 69
    new-instance v0, Lsu/happ/proxyutility/dto/ImportResult;

    sget-object v4, Lr83;->a:Lr83;

    move/from16 v20, v1

    move/from16 v18, v2

    move/from16 v19, v3

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v4, v2}, Lsu/happ/proxyutility/dto/ImportResult;-><init>(ILx83;Lt83;I)V

    move/from16 v2, v18

    move/from16 v1, v20

    :goto_c
    move-object/from16 v21, v13

    move-object v4, v12

    move-object v13, v15

    move/from16 v3, v19

    :goto_d
    move v15, v6

    move-object v12, v8

    move-object v6, v10

    move-object v8, v7

    goto :goto_e

    :cond_18
    const/4 v3, 0x0

    .line 70
    const-string v0, "Required value was null."

    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    return-object v3

    :cond_19
    move/from16 v20, v1

    move/from16 v18, v2

    move/from16 v19, v3

    move/from16 v11, v22

    move-object v4, v12

    move-object v13, v15

    goto :goto_d

    .line 71
    :goto_e
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ImportResult;->a()I

    move-result v7

    if-gtz v7, :cond_1c

    .line 72
    sget-object v0, Lkw2;->a:Lkw2;

    .line 73
    invoke-static {v4, v11, v8}, Lkw2;->a(Ljava/lang/String;ZLjava/lang/String;)Lsu/happ/proxyutility/dto/ImportResult;

    move-result-object v0

    .line 74
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v4

    invoke-virtual {v4}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    move-result-object v4

    new-instance v7, Lqj4;

    const/4 v10, 0x2

    invoke-direct {v7, v0, v10}, Lqj4;-><init>(Lsu/happ/proxyutility/dto/ImportResult;B)V

    invoke-virtual {v4, v7}, Lkf4;->h(Lgn2;)V

    .line 75
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ImportResult;->c()Lx83;

    move-result-object v4

    instance-of v4, v4, Lr83;

    if-nez v4, :cond_1b

    .line 76
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ImportResult;->b()Lt83;

    move-result-object v4

    instance-of v4, v4, Lr83;

    if-nez v4, :cond_1b

    .line 77
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ImportResult;->b()Lt83;

    move-result-object v4

    instance-of v4, v4, Lm83;

    if-nez v4, :cond_1b

    .line 78
    invoke-virtual {v6, v0, v15, v3}, Lsu/happ/proxyutility/feature/main/MainActivity;->W(Lsu/happ/proxyutility/dto/ImportResult;ZZ)Z

    move-result v4

    if-nez v4, :cond_1a

    goto :goto_f

    :cond_1a
    const/4 v0, 0x0

    :cond_1b
    :goto_f
    if-nez v0, :cond_1c

    .line 79
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_1c
    move-object v7, v0

    .line 80
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1d

    .line 81
    sget-object v0, Lkw4;->a:Lkw4;

    invoke-static {v8}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    move-result-object v0

    move-object/from16 v17, v0

    :goto_10
    const/4 v0, 0x0

    goto :goto_11

    :cond_1d
    const/16 v17, 0x0

    goto :goto_10

    .line 82
    :goto_11
    iput-object v0, v5, Lik4;->f0:Ljava/lang/String;

    iput-object v0, v5, Lik4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    iput-object v0, v5, Lik4;->h0:Ljava/lang/String;

    iput-object v0, v5, Lik4;->i0:Ljava/lang/String;

    iput-object v0, v5, Lik4;->j0:Ljava/lang/Boolean;

    iput-object v0, v5, Lik4;->k0:Ljava/lang/Boolean;

    iput-object v0, v5, Lik4;->l0:Ljava/util/List;

    iput-object v0, v5, Lik4;->m0:Ljava/lang/String;

    iput-boolean v15, v5, Lik4;->n0:Z

    iput-boolean v3, v5, Lik4;->o0:Z

    iput-boolean v2, v5, Lik4;->p0:Z

    iput-boolean v1, v5, Lik4;->q0:Z

    iput-boolean v11, v5, Lik4;->r0:Z

    const/4 v0, 0x4

    iput v0, v5, Lik4;->t0:I

    const/4 v10, 0x0

    move-object/from16 v0, v17

    move-object/from16 v17, v9

    move-object v9, v0

    move v11, v1

    move/from16 v16, v3

    move-object/from16 v18, v5

    move-object/from16 v0, v21

    invoke-virtual/range {v6 .. v18}, Lsu/happ/proxyutility/feature/main/MainActivity;->S(Lsu/happ/proxyutility/dto/ImportResult;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZLjava/util/List;Ls51;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1e

    :goto_12
    return-object v0

    :cond_1e
    return-object v1

    .line 83
    :cond_1f
    :goto_13
    new-instance v0, Lsu/happ/proxyutility/dto/ImportResult;

    sget-object v4, Lm83;->a:Lm83;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-direct {v0, v6, v4, v9, v5}, Lsu/happ/proxyutility/dto/ImportResult;-><init>(ILx83;Lt83;I)V

    .line 84
    invoke-virtual {v1, v0, v2, v3}, Lsu/happ/proxyutility/feature/main/MainActivity;->W(Lsu/happ/proxyutility/dto/ImportResult;ZZ)Z

    .line 85
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public static synthetic P(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZZLjava/lang/String;ZZLjava/lang/Boolean;Lg83;Ls51;I)Ljava/lang/Object;
    .locals 3

    .line 1
    and-int/lit8 v0, p12, 0x10

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p5, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p12, 0x20

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move-object p6, v2

    .line 13
    :cond_1
    and-int/lit8 v0, p12, 0x40

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    move p7, v1

    .line 18
    :cond_2
    and-int/lit16 v0, p12, 0x80

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    const/4 p8, 0x1

    .line 23
    :cond_3
    and-int/lit16 v0, p12, 0x100

    .line 24
    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    move-object p9, v2

    .line 28
    :cond_4
    and-int/lit16 p12, p12, 0x200

    .line 29
    .line 30
    if-eqz p12, :cond_5

    .line 31
    .line 32
    move-object p10, v2

    .line 33
    :cond_5
    invoke-virtual/range {p0 .. p11}, Lsu/happ/proxyutility/feature/main/MainActivity;->O(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZZLjava/lang/String;ZZLjava/lang/Boolean;Lg83;Ls51;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static final T(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lsu/happ/proxyutility/feature/main/MainActivity;ZLjava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;Ls51;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    instance-of v9, v8, Luk4;

    if-eqz v9, :cond_0

    move-object v9, v8

    check-cast v9, Luk4;

    iget v10, v9, Luk4;->o0:I

    const/high16 v11, -0x80000000

    and-int v12, v10, v11

    if-eqz v12, :cond_0

    sub-int/2addr v10, v11

    iput v10, v9, Luk4;->o0:I

    goto :goto_0

    :cond_0
    new-instance v9, Luk4;

    .line 1
    invoke-direct {v9, v8}, Ls51;-><init>(Lq51;)V

    .line 2
    :goto_0
    iget-object v8, v9, Luk4;->n0:Ljava/lang/Object;

    .line 3
    iget v10, v9, Luk4;->o0:I

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x1

    const/4 v14, 0x0

    sget-object v15, Lc71;->X:Lc71;

    if-eqz v10, :cond_3

    if-eq v10, v13, :cond_2

    if-eq v10, v12, :cond_2

    if-ne v10, v11, :cond_1

    invoke-static {v8}, Lw39;->n0(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    return-object v14

    :cond_2
    iget-boolean v0, v9, Luk4;->m0:Z

    iget-boolean v1, v9, Luk4;->l0:Z

    iget-object v2, v9, Luk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iget-object v3, v9, Luk4;->j0:Ljava/lang/String;

    iget-object v4, v9, Luk4;->i0:Lsu/happ/proxyutility/feature/main/MainActivity;

    iget-object v5, v9, Luk4;->h0:Ljava/lang/Boolean;

    iget-object v6, v9, Luk4;->g0:Ljava/lang/Boolean;

    iget-object v7, v9, Luk4;->f0:Ljava/lang/String;

    invoke-static {v8}, Lw39;->n0(Ljava/lang/Object;)V

    move-object/from16 v27, v5

    move-object v5, v2

    move-object v2, v6

    move-object v6, v3

    move-object/from16 v3, v27

    goto :goto_2

    :cond_3
    invoke-static {v8}, Lw39;->n0(Ljava/lang/Object;)V

    if-eqz v0, :cond_4

    .line 4
    invoke-virtual {v7, v0, v13}, Lsu/happ/proxyutility/dto/SubscriptionItem;->v0(Ljava/lang/String;Z)V

    :cond_4
    if-eqz v1, :cond_6

    .line 5
    sget-object v8, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v8

    invoke-virtual {v8}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    move-result-object v8

    new-instance v10, Luq0;

    const/4 v12, 0x6

    invoke-direct {v10, v7, v12}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    invoke-virtual {v8, v10}, Lkf4;->h(Lgn2;)V

    .line 6
    sget-object v8, Ltp1;->a:Lnf1;

    .line 7
    sget-object v8, Ldm4;->a:Lhv2;

    .line 8
    new-instance v10, Ltk4;

    invoke-direct {v10, v4, v7, v14, v13}, Ltk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lsu/happ/proxyutility/dto/SubscriptionItem;Lq51;B)V

    iput-object v0, v9, Luk4;->f0:Ljava/lang/String;

    iput-object v2, v9, Luk4;->g0:Ljava/lang/Boolean;

    iput-object v3, v9, Luk4;->h0:Ljava/lang/Boolean;

    iput-object v4, v9, Luk4;->i0:Lsu/happ/proxyutility/feature/main/MainActivity;

    iput-object v6, v9, Luk4;->j0:Ljava/lang/String;

    iput-object v7, v9, Luk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-boolean v1, v9, Luk4;->l0:Z

    iput-boolean v5, v9, Luk4;->m0:Z

    iput v13, v9, Luk4;->o0:I

    .line 9
    invoke-static {v8, v10, v9}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v15, :cond_5

    :goto_1
    move-object v1, v15

    goto/16 :goto_5

    :cond_5
    move-object/from16 v27, v7

    move-object v7, v0

    move v0, v5

    move-object/from16 v5, v27

    :goto_2
    move-object/from16 v17, v3

    move-object v10, v4

    move-object v12, v5

    goto :goto_3

    .line 10
    :cond_6
    sget-object v8, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v8

    invoke-virtual {v8}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    move-result-object v8

    new-instance v10, Luq0;

    const/4 v13, 0x7

    invoke-direct {v10, v7, v13}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    invoke-virtual {v8, v10}, Lkf4;->h(Lgn2;)V

    .line 11
    sget-object v8, Ltp1;->a:Lnf1;

    .line 12
    sget-object v8, Ldm4;->a:Lhv2;

    .line 13
    new-instance v10, Ltk4;

    invoke-direct {v10, v4, v7, v14, v12}, Ltk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lsu/happ/proxyutility/dto/SubscriptionItem;Lq51;B)V

    iput-object v0, v9, Luk4;->f0:Ljava/lang/String;

    iput-object v2, v9, Luk4;->g0:Ljava/lang/Boolean;

    iput-object v3, v9, Luk4;->h0:Ljava/lang/Boolean;

    iput-object v4, v9, Luk4;->i0:Lsu/happ/proxyutility/feature/main/MainActivity;

    iput-object v6, v9, Luk4;->j0:Ljava/lang/String;

    iput-object v7, v9, Luk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-boolean v1, v9, Luk4;->l0:Z

    iput-boolean v5, v9, Luk4;->m0:Z

    iput v12, v9, Luk4;->o0:I

    .line 14
    invoke-static {v8, v10, v9}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v15, :cond_5

    goto :goto_1

    :goto_3
    if-eqz v2, :cond_7

    .line 15
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v12, v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->n0(Z)V

    :cond_7
    if-eqz v17, :cond_9

    .line 16
    invoke-virtual {v12}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    move-result-object v16

    if-eqz v16, :cond_8

    const/16 v25, -0x1

    const v26, 0xfffffff

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, -0x81

    invoke-static/range {v16 .. v26}, Lsu/happ/proxyutility/dto/MetaParams;->c(Lsu/happ/proxyutility/dto/MetaParams;Ljava/lang/Boolean;Lsu/happ/proxyutility/dto/enums/SubInfoColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;III)Lsu/happ/proxyutility/dto/MetaParams;

    move-result-object v2

    goto :goto_4

    :cond_8
    move-object/from16 v3, v17

    .line 17
    new-instance v2, Lsu/happ/proxyutility/dto/MetaParams;

    const/16 v4, -0x81

    invoke-direct {v2, v3, v4}, Lsu/happ/proxyutility/dto/MetaParams;-><init>(Ljava/lang/Boolean;I)V

    .line 18
    :goto_4
    invoke-virtual {v12, v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->r0(Lsu/happ/proxyutility/dto/MetaParams;)V

    .line 19
    :cond_9
    sget-object v2, Lkw4;->a:Lkw4;

    invoke-static {v12, v6}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 20
    sget-object v2, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v2

    invoke-virtual {v2}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    move-result-object v2

    new-instance v3, Luq0;

    const/16 v4, 0x8

    invoke-direct {v3, v12, v4}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    invoke-virtual {v2, v3}, Lkf4;->h(Lgn2;)V

    .line 21
    iput-object v14, v9, Luk4;->f0:Ljava/lang/String;

    iput-object v14, v9, Luk4;->g0:Ljava/lang/Boolean;

    iput-object v14, v9, Luk4;->h0:Ljava/lang/Boolean;

    iput-object v14, v9, Luk4;->i0:Lsu/happ/proxyutility/feature/main/MainActivity;

    iput-object v14, v9, Luk4;->j0:Ljava/lang/String;

    iput-object v14, v9, Luk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-boolean v1, v9, Luk4;->l0:Z

    iput-boolean v0, v9, Luk4;->m0:Z

    iput v11, v9, Luk4;->o0:I

    const/4 v13, 0x0

    move-object v1, v15

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x3d0

    move v14, v0

    move-object v11, v6

    move-object/from16 v16, v7

    move-object/from16 v21, v9

    invoke-static/range {v10 .. v22}, Lsu/happ/proxyutility/feature/main/MainActivity;->P(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZZLjava/lang/String;ZZLjava/lang/Boolean;Lg83;Ls51;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_a

    :goto_5
    return-object v1

    .line 22
    :cond_a
    :goto_6
    sget-object v0, Ldn8;->a:Ldn8;

    return-object v0
.end method

.method public static final U(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x3f8ccccd    # 1.1f

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-wide/16 v0, 0x96

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static final V(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-wide/16 v0, 0x96

    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final A()Lsu/happ/proxyutility/ui/foundation/component/HappSnackbarHost;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lb6;->B0:Lsu/happ/proxyutility/ui/foundation/component/HappSnackbarHost;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "binding"

    .line 9
    .line 10
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public final B(Lsu/happ/proxyutility/dto/ServerCache;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->u()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerCache;->d()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->H(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 25
    .line 26
    invoke-static {p1}, Lys0;->z(Lg94;)Lu84;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Lwj4;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v0, p0, v2, v1}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x3

    .line 38
    invoke-static {p1, v2, v0, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public final C()V
    .locals 4

    .line 1
    iget-object v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "binding"

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, Lb6;->l0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 9
    .line 10
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v3}, Lsu/happ/proxyutility/feature/main/MainViewModel;->u()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-static {v0, v3}, Lrp7;->e(Landroid/view/View;Z)V

    .line 19
    .line 20
    .line 21
    sget v3, Ly46;->btn_disconnect:I

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object v0, v0, Lb6;->k0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 35
    .line 36
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->u()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-static {v0, v1}, Lrp7;->e(Landroid/view/View;Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->u()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p0, v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->b0(Z)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-static {v2}, Ldh3;->T(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_1
    invoke-static {v2}, Ldh3;->T(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v1
.end method

.method public final D(Landroid/content/Intent;Ls51;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lzj4;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lzj4;

    .line 11
    .line 12
    iget v3, v2, Lzj4;->j0:I

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
    iput v3, v2, Lzj4;->j0:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lzj4;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lzj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ls51;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v6, Lzj4;->h0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v2, v6, Lzj4;->j0:I

    .line 34
    .line 35
    sget-object v8, Ldn8;->a:Ldn8;

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x2

    .line 39
    const/4 v11, 0x1

    .line 40
    const/4 v12, 0x0

    .line 41
    sget-object v13, Lc71;->X:Lc71;

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    if-eq v2, v11, :cond_2

    .line 46
    .line 47
    if-ne v2, v10, :cond_1

    .line 48
    .line 49
    iget-object v2, v6, Lzj4;->g0:Ljava/util/Iterator;

    .line 50
    .line 51
    iget-object v3, v6, Lzj4;->f0:Ljava/io/Closeable;

    .line 52
    .line 53
    :try_start_0
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    move-object v14, v2

    .line 57
    move-object v15, v3

    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :catchall_0
    move-exception v0

    .line 61
    move-object v1, v0

    .line 62
    goto/16 :goto_7

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
    return-object v12

    .line 70
    :cond_2
    iget-object v3, v6, Lzj4;->f0:Ljava/io/Closeable;

    .line 71
    .line 72
    :try_start_1
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_3
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-nez v1, :cond_4

    .line 85
    .line 86
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_4
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v2, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    if-eqz v14, :cond_b

    .line 98
    .line 99
    :try_start_2
    sget-object v2, Liq0;->a:Ljava/nio/charset/Charset;

    .line 100
    .line 101
    new-instance v3, Ljava/io/InputStreamReader;

    .line 102
    .line 103
    invoke-direct {v3, v14, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 104
    .line 105
    .line 106
    new-instance v2, Ljava/io/BufferedReader;

    .line 107
    .line 108
    const/16 v4, 0x2000

    .line 109
    .line 110
    invoke-direct {v2, v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 111
    .line 112
    .line 113
    invoke-static {v2}, Ldt7;->d(Ljava/io/BufferedReader;)Ljava/util/ArrayList;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-eqz v1, :cond_5

    .line 122
    .line 123
    const-string v2, ".json"

    .line 124
    .line 125
    invoke-static {v1, v9, v2}, Lmm7;->R(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-ne v1, v11, :cond_5

    .line 130
    .line 131
    const-string v16, ""

    .line 132
    .line 133
    const/16 v19, 0x0

    .line 134
    .line 135
    const/16 v20, 0x3e

    .line 136
    .line 137
    const/16 v17, 0x0

    .line 138
    .line 139
    const/16 v18, 0x0

    .line 140
    .line 141
    invoke-static/range {v15 .. v20}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v0, v1, v9}, Lsu/happ/proxyutility/feature/main/MainActivity;->Q(Ljava/lang/String;Z)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_6

    .line 149
    .line 150
    :catchall_1
    move-exception v0

    .line 151
    move-object v1, v0

    .line 152
    move-object v3, v14

    .line 153
    goto/16 :goto_7

    .line 154
    .line 155
    :cond_5
    invoke-static {v15}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Ljava/lang/String;

    .line 160
    .line 161
    if-eqz v1, :cond_6

    .line 162
    .line 163
    const/16 v2, 0x5b

    .line 164
    .line 165
    invoke-static {v2, v1}, Lfm7;->G0(CLjava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-ne v1, v11, :cond_6

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_6
    invoke-static {v15}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, Ljava/lang/String;

    .line 177
    .line 178
    if-eqz v1, :cond_8

    .line 179
    .line 180
    const/16 v2, 0x7b

    .line 181
    .line 182
    invoke-static {v2, v1}, Lfm7;->G0(CLjava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-ne v1, v11, :cond_8

    .line 187
    .line 188
    :goto_2
    const-string v16, ""

    .line 189
    .line 190
    const/16 v19, 0x0

    .line 191
    .line 192
    const/16 v20, 0x3e

    .line 193
    .line 194
    const/16 v17, 0x0

    .line 195
    .line 196
    const/16 v18, 0x0

    .line 197
    .line 198
    invoke-static/range {v15 .. v20}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iput-object v14, v6, Lzj4;->f0:Ljava/io/Closeable;

    .line 203
    .line 204
    iput v11, v6, Lzj4;->j0:I

    .line 205
    .line 206
    const/4 v2, 0x0

    .line 207
    const/4 v3, 0x0

    .line 208
    const/4 v4, 0x0

    .line 209
    const/4 v5, 0x0

    .line 210
    const/16 v7, 0x78

    .line 211
    .line 212
    invoke-static/range {v0 .. v7}, Lsu/happ/proxyutility/feature/main/MainActivity;->L(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ls51;I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 216
    if-ne v1, v13, :cond_7

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_7
    move-object v3, v14

    .line 220
    :goto_3
    :try_start_3
    check-cast v1, Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    xor-int/2addr v0, v11

    .line 227
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 228
    .line 229
    .line 230
    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 231
    move-object v14, v3

    .line 232
    goto :goto_6

    .line 233
    :cond_8
    :try_start_4
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 237
    move-object v15, v14

    .line 238
    move-object v14, v0

    .line 239
    :cond_9
    :goto_4
    :try_start_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_a

    .line 244
    .line 245
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    move-object v1, v0

    .line 250
    check-cast v1, Ljava/lang/String;

    .line 251
    .line 252
    iput-object v15, v6, Lzj4;->f0:Ljava/io/Closeable;

    .line 253
    .line 254
    iput-object v14, v6, Lzj4;->g0:Ljava/util/Iterator;

    .line 255
    .line 256
    iput v10, v6, Lzj4;->j0:I

    .line 257
    .line 258
    const/4 v2, 0x0

    .line 259
    const/4 v3, 0x0

    .line 260
    const/4 v4, 0x0

    .line 261
    const/4 v5, 0x0

    .line 262
    const/16 v7, 0xf8

    .line 263
    .line 264
    move-object/from16 v0, p0

    .line 265
    .line 266
    invoke-static/range {v0 .. v7}, Lsu/happ/proxyutility/feature/main/MainActivity;->L(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ls51;I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 270
    if-ne v1, v13, :cond_9

    .line 271
    .line 272
    :goto_5
    return-object v13

    .line 273
    :catchall_2
    move-exception v0

    .line 274
    move-object v1, v0

    .line 275
    move-object v3, v15

    .line 276
    goto :goto_7

    .line 277
    :cond_a
    move-object v14, v15

    .line 278
    :goto_6
    invoke-static {v14, v12}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 279
    .line 280
    .line 281
    move-object v12, v8

    .line 282
    goto :goto_8

    .line 283
    :goto_7
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 284
    :catchall_3
    move-exception v0

    .line 285
    invoke-static {v3, v1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 286
    .line 287
    .line 288
    throw v0

    .line 289
    :cond_b
    :goto_8
    if-eqz v12, :cond_c

    .line 290
    .line 291
    move v9, v11

    .line 292
    :cond_c
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    return-object v0
.end method

.method public final E(Ls51;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Ldk4;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Ldk4;

    .line 11
    .line 12
    iget v3, v2, Ldk4;->k0:I

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
    iput v3, v2, Ldk4;->k0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Ldk4;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Ldk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ls51;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Ldk4;->i0:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Ldk4;->k0:I

    .line 32
    .line 33
    const/4 v4, 0x6

    .line 34
    sget-object v5, Lc71;->X:Lc71;

    .line 35
    .line 36
    sget-object v6, Ldn8;->a:Ldn8;

    .line 37
    .line 38
    const/4 v7, 0x3

    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v10, 0x1

    .line 41
    const/4 v11, 0x0

    .line 42
    if-eqz v3, :cond_4

    .line 43
    .line 44
    if-eq v3, v10, :cond_3

    .line 45
    .line 46
    if-eq v3, v8, :cond_2

    .line 47
    .line 48
    if-ne v3, v7, :cond_1

    .line 49
    .line 50
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object v6

    .line 54
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v11

    .line 60
    :cond_2
    iget v10, v2, Ldk4;->h0:I

    .line 61
    .line 62
    iget v3, v2, Ldk4;->g0:I

    .line 63
    .line 64
    iget-object v4, v2, Ldk4;->f0:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_8

    .line 70
    .line 71
    :cond_3
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iput v10, v2, Ldk4;->k0:I

    .line 83
    .line 84
    iget-object v1, v1, Lsu/happ/proxyutility/feature/main/MainViewModel;->H:Lh76;

    .line 85
    .line 86
    new-instance v3, Lo;

    .line 87
    .line 88
    const/16 v12, 0xe

    .line 89
    .line 90
    invoke-direct {v3, v1, v12}, Lo;-><init>(Lxe2;B)V

    .line 91
    .line 92
    .line 93
    new-instance v1, Lj31;

    .line 94
    .line 95
    invoke-direct {v1, v3, v4}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v2}, Lgv3;->q(Lxe2;Ls51;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-ne v1, v5, :cond_5

    .line 103
    .line 104
    goto/16 :goto_c

    .line 105
    .line 106
    :cond_5
    :goto_1
    check-cast v1, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 107
    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    sget-object v12, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 115
    .line 116
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    invoke-virtual {v12}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    invoke-virtual {v12, v3}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    goto :goto_2

    .line 129
    :cond_6
    move-object v3, v11

    .line 130
    :goto_2
    if-eqz v3, :cond_7

    .line 131
    .line 132
    iget-object v12, v3, Lqs7;->d:Lfs7;

    .line 133
    .line 134
    if-eqz v12, :cond_7

    .line 135
    .line 136
    iget-boolean v12, v12, Lfs7;->a:Z

    .line 137
    .line 138
    if-ne v12, v10, :cond_7

    .line 139
    .line 140
    move v12, v10

    .line 141
    goto :goto_3

    .line 142
    :cond_7
    const/4 v12, 0x0

    .line 143
    :goto_3
    if-eqz v3, :cond_8

    .line 144
    .line 145
    iget-object v3, v3, Lqs7;->d:Lfs7;

    .line 146
    .line 147
    if-eqz v3, :cond_8

    .line 148
    .line 149
    iget-object v3, v3, Lfs7;->b:Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 150
    .line 151
    if-nez v3, :cond_9

    .line 152
    .line 153
    :cond_8
    sget-object v3, Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;->LAST_USED:Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 154
    .line 155
    :cond_9
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 156
    .line 157
    .line 158
    move-result-object v13

    .line 159
    iget-object v13, v13, Lsu/happ/proxyutility/feature/main/MainViewModel;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 160
    .line 161
    new-instance v14, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v13}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v13

    .line 170
    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v15

    .line 174
    if-eqz v15, :cond_c

    .line 175
    .line 176
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v15

    .line 180
    check-cast v15, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 181
    .line 182
    sget-object v16, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 183
    .line 184
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 185
    .line 186
    .line 187
    move-result-object v16

    .line 188
    invoke-virtual/range {v16 .. v16}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-virtual {v15}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    invoke-virtual {v7, v11}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    if-eqz v7, :cond_a

    .line 201
    .line 202
    new-instance v11, Lqg5;

    .line 203
    .line 204
    invoke-direct {v11, v7, v15}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_a
    const/4 v11, 0x0

    .line 209
    :goto_5
    if-eqz v11, :cond_b

    .line 210
    .line 211
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    :cond_b
    const/4 v7, 0x3

    .line 215
    const/4 v11, 0x0

    .line 216
    goto :goto_4

    .line 217
    :cond_c
    if-eqz v12, :cond_10

    .line 218
    .line 219
    sget-object v7, Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;->LAST_USED:Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 220
    .line 221
    if-eq v3, v7, :cond_10

    .line 222
    .line 223
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    iget-object v7, v7, Lsu/happ/proxyutility/feature/main/MainViewModel;->r:Ljava/util/ArrayList;

    .line 228
    .line 229
    new-instance v11, Lhu;

    .line 230
    .line 231
    invoke-direct {v11, v14, v10}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 232
    .line 233
    .line 234
    new-instance v13, Luh3;

    .line 235
    .line 236
    const/16 v15, 0x15

    .line 237
    .line 238
    invoke-direct {v13, v15}, Luh3;-><init>(B)V

    .line 239
    .line 240
    .line 241
    new-instance v15, Lla2;

    .line 242
    .line 243
    invoke-direct {v15, v11, v10, v13}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 244
    .line 245
    .line 246
    new-instance v11, Luh3;

    .line 247
    .line 248
    const/16 v13, 0x16

    .line 249
    .line 250
    invoke-direct {v11, v13}, Luh3;-><init>(B)V

    .line 251
    .line 252
    .line 253
    new-instance v13, Lsd2;

    .line 254
    .line 255
    sget-object v9, Lz27;->X:Lz27;

    .line 256
    .line 257
    invoke-direct {v13, v15, v11, v9}, Lsd2;-><init>(Lu27;Lgn2;Lgn2;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v13}, Lsd2;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    :goto_6
    move-object v11, v9

    .line 271
    check-cast v11, Lrd2;

    .line 272
    .line 273
    invoke-virtual {v11}, Lrd2;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v13

    .line 277
    if-eqz v13, :cond_d

    .line 278
    .line 279
    invoke-virtual {v11}, Lrd2;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_d
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    new-instance v9, La23;

    .line 292
    .line 293
    invoke-direct {v9, v0, v3, v4}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 294
    .line 295
    .line 296
    iput-object v9, v7, Lsu/happ/proxyutility/feature/main/MainViewModel;->s:La23;

    .line 297
    .line 298
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    iput-object v14, v2, Ldk4;->f0:Ljava/util/ArrayList;

    .line 303
    .line 304
    iput v12, v2, Ldk4;->g0:I

    .line 305
    .line 306
    iput v10, v2, Ldk4;->h0:I

    .line 307
    .line 308
    iput v8, v2, Ldk4;->k0:I

    .line 309
    .line 310
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    const/4 v4, 0x0

    .line 315
    invoke-virtual {v3, v2, v1, v4}, Lsu/happ/proxyutility/feature/main/MainViewModel;->R(Ls51;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    if-ne v1, v5, :cond_e

    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_e
    move-object v1, v6

    .line 323
    :goto_7
    if-ne v1, v5, :cond_f

    .line 324
    .line 325
    goto/16 :goto_c

    .line 326
    .line 327
    :cond_f
    move v3, v12

    .line 328
    move-object v4, v14

    .line 329
    :goto_8
    move v12, v3

    .line 330
    move-object v14, v4

    .line 331
    move v4, v10

    .line 332
    goto :goto_a

    .line 333
    :cond_10
    if-eqz v12, :cond_13

    .line 334
    .line 335
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    :cond_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    if-eqz v3, :cond_12

    .line 348
    .line 349
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    move-object v4, v3

    .line 354
    check-cast v4, Lsu/happ/proxyutility/dto/ServerCache;

    .line 355
    .line 356
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerCache;->e()Z

    .line 357
    .line 358
    .line 359
    move-result v4

    .line 360
    if-eqz v4, :cond_11

    .line 361
    .line 362
    goto :goto_9

    .line 363
    :cond_12
    const/4 v3, 0x0

    .line 364
    :goto_9
    check-cast v3, Lsu/happ/proxyutility/dto/ServerCache;

    .line 365
    .line 366
    invoke-virtual {v0, v3}, Lsu/happ/proxyutility/feature/main/MainActivity;->B(Lsu/happ/proxyutility/dto/ServerCache;)V

    .line 367
    .line 368
    .line 369
    :cond_13
    const/4 v4, 0x0

    .line 370
    :goto_a
    if-nez v4, :cond_17

    .line 371
    .line 372
    if-eqz v14, :cond_14

    .line 373
    .line 374
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-eqz v1, :cond_14

    .line 379
    .line 380
    goto :goto_d

    .line 381
    :cond_14
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    :cond_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    if-eqz v3, :cond_17

    .line 390
    .line 391
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    check-cast v3, Lqg5;

    .line 396
    .line 397
    iget-object v3, v3, Lqg5;->X:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v3, Lqs7;

    .line 400
    .line 401
    iget-boolean v3, v3, Lqs7;->c:Z

    .line 402
    .line 403
    if-eqz v3, :cond_15

    .line 404
    .line 405
    const/4 v3, 0x0

    .line 406
    iput-object v3, v2, Ldk4;->f0:Ljava/util/ArrayList;

    .line 407
    .line 408
    iput v12, v2, Ldk4;->g0:I

    .line 409
    .line 410
    iput v4, v2, Ldk4;->h0:I

    .line 411
    .line 412
    const/4 v7, 0x3

    .line 413
    iput v7, v2, Ldk4;->k0:I

    .line 414
    .line 415
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    const/4 v8, 0x0

    .line 420
    invoke-virtual {v0, v2, v3, v8}, Lsu/happ/proxyutility/feature/main/MainViewModel;->R(Ls51;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    if-ne v0, v5, :cond_16

    .line 425
    .line 426
    goto :goto_b

    .line 427
    :cond_16
    move-object v0, v6

    .line 428
    :goto_b
    if-ne v0, v5, :cond_17

    .line 429
    .line 430
    :goto_c
    return-object v5

    .line 431
    :cond_17
    :goto_d
    return-object v6
.end method

.method public final F()Ldw7;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->S0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldw7;

    .line 8
    .line 9
    return-object p0
.end method

.method public final G()Lsu/happ/proxyutility/feature/main/MainViewModel;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->e1:Ly5;

    .line 2
    .line 3
    invoke-virtual {p0}, Ly5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H()Lcom/tencent/mmkv/MMKV;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->V0:Lvz7;

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

.method public final I(Landroid/content/Intent;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const v2, -0x45ed2f16

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    iget-object v4, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eq v1, v2, :cond_3

    .line 19
    .line 20
    const v2, -0x2c80b48c

    .line 21
    .line 22
    .line 23
    if-eq v1, v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v1, "reset_sub_import"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string v0, "reset_sub_url"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {v4}, Lys0;->z(Lg94;)Lu84;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Lfk4;

    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    invoke-direct {v1, p0, p1, v5, v2}, Lfk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lq51;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v5, v1, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    const-string v1, "android.intent.action.VIEW"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    invoke-static {v4}, Lys0;->z(Lg94;)Lu84;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, Lpi;

    .line 72
    .line 73
    const/16 v2, 0xc

    .line 74
    .line 75
    invoke-direct {v1, p1, p0, v5, v2}, Lpi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v5, v1, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 79
    .line 80
    .line 81
    :cond_5
    :goto_0
    return-void
.end method

.method public final J(Lt83;Z)V
    .locals 1

    .line 1
    instance-of v0, p1, Lm83;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget p1, Ly46;->dialog_subscription_update_msg_parsing_error_empty_clipboard:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-virtual {p0, p1, p2}, Lsu/happ/proxyutility/feature/main/MainActivity;->e0(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    instance-of v0, p1, Lo83;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    sget p1, Ly46;->dialog_subscription_update_msg_parsing_error_invalid_deeplink:I

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1, p2}, Lsu/happ/proxyutility/feature/main/MainActivity;->e0(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    instance-of v0, p1, Ls83;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    sget p1, Ly46;->dialog_subscription_update_msg_parsing_error_unknown_deeplink:I

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1, p2}, Lsu/happ/proxyutility/feature/main/MainActivity;->e0(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    instance-of v0, p1, Lp83;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    sget p1, Ly46;->dialog_subscription_update_msg_parsing_error_invalid_routing:I

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1, p2}, Lsu/happ/proxyutility/feature/main/MainActivity;->e0(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    instance-of v0, p1, Lq83;

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    sget v0, Ly46;->dialog_subscription_update_msg_parsing_error_invalid_server:I

    .line 75
    .line 76
    check-cast p1, Lq83;

    .line 77
    .line 78
    iget-object p1, p1, Lq83;->a:Ljava/lang/String;

    .line 79
    .line 80
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1, p2}, Lsu/happ/proxyutility/feature/main/MainActivity;->e0(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_4
    instance-of v0, p1, Ln83;

    .line 96
    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    sget p1, Ly46;->dialog_subscription_update_msg_parsing_error_invalid_array_json_server:I

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p1, p2}, Lsu/happ/proxyutility/feature/main/MainActivity;->e0(Ljava/lang/String;Z)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_5
    instance-of p1, p1, Lr83;

    .line 113
    .line 114
    if-eqz p1, :cond_6

    .line 115
    .line 116
    sget p1, Ly46;->dialog_subscription_update_msg_parsing_error_invalid_unknown_content_type:I

    .line 117
    .line 118
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1, p2}, Lsu/happ/proxyutility/feature/main/MainActivity;->e0(Ljava/lang/String;Z)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_6
    invoke-static {}, Lb61;->c()V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final K(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLs51;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    instance-of v2, v1, Lhk4;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lhk4;

    .line 11
    .line 12
    iget v3, v2, Lhk4;->p0:I

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
    iput v3, v2, Lhk4;->p0:I

    .line 22
    .line 23
    :goto_0
    move-object v11, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lhk4;

    .line 26
    .line 27
    invoke-direct {v2, p0, v1}, Lhk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ls51;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v11, Lhk4;->n0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v2, v11, Lhk4;->p0:I

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    const/4 v4, 0x1

    .line 37
    const/4 v12, 0x0

    .line 38
    sget-object v13, Lc71;->X:Lc71;

    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    iget-object p0, v11, Lhk4;->k0:Lo15;

    .line 47
    .line 48
    :try_start_0
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object p1, v0

    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v12

    .line 63
    :cond_2
    iget-boolean p1, v11, Lhk4;->m0:Z

    .line 64
    .line 65
    iget-boolean v0, v11, Lhk4;->l0:Z

    .line 66
    .line 67
    iget-object v2, v11, Lhk4;->k0:Lo15;

    .line 68
    .line 69
    iget-object v4, v11, Lhk4;->j0:Ljava/lang/Boolean;

    .line 70
    .line 71
    iget-object v5, v11, Lhk4;->i0:Ljava/lang/Boolean;

    .line 72
    .line 73
    iget-object v6, v11, Lhk4;->h0:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v7, v11, Lhk4;->g0:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v8, v11, Lhk4;->f0:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object v9, v6

    .line 83
    move v6, p1

    .line 84
    move-object p1, v8

    .line 85
    move-object v8, v9

    .line 86
    move-object v10, v4

    .line 87
    move-object v9, v5

    .line 88
    move v5, v0

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    new-instance v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 94
    .line 95
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object v2, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->n1:Ljava/util/concurrent/ConcurrentHashMap;

    .line 99
    .line 100
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    if-nez v5, :cond_5

    .line 105
    .line 106
    invoke-static {}, Lr15;->a()Lq15;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {v2, v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-nez v1, :cond_4

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move-object v5, v1

    .line 118
    :cond_5
    :goto_2
    check-cast v5, Lo15;

    .line 119
    .line 120
    iput-object p1, v11, Lhk4;->f0:Ljava/lang/String;

    .line 121
    .line 122
    iput-object v0, v11, Lhk4;->g0:Ljava/lang/String;

    .line 123
    .line 124
    move-object/from16 v1, p4

    .line 125
    .line 126
    iput-object v1, v11, Lhk4;->h0:Ljava/lang/String;

    .line 127
    .line 128
    move-object/from16 v2, p5

    .line 129
    .line 130
    iput-object v2, v11, Lhk4;->i0:Ljava/lang/Boolean;

    .line 131
    .line 132
    move-object/from16 v6, p6

    .line 133
    .line 134
    iput-object v6, v11, Lhk4;->j0:Ljava/lang/Boolean;

    .line 135
    .line 136
    iput-object v5, v11, Lhk4;->k0:Lo15;

    .line 137
    .line 138
    move/from16 v7, p2

    .line 139
    .line 140
    iput-boolean v7, v11, Lhk4;->l0:Z

    .line 141
    .line 142
    move/from16 v8, p7

    .line 143
    .line 144
    iput-boolean v8, v11, Lhk4;->m0:Z

    .line 145
    .line 146
    iput v4, v11, Lhk4;->p0:I

    .line 147
    .line 148
    invoke-interface {v5, v11}, Lo15;->g(Lq51;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-ne v4, v13, :cond_6

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_6
    move-object v9, v2

    .line 156
    move-object v2, v5

    .line 157
    move-object v10, v6

    .line 158
    move v5, v7

    .line 159
    move v6, v8

    .line 160
    move-object v7, v0

    .line 161
    move-object v8, v1

    .line 162
    :goto_3
    :try_start_1
    iput-object v12, v11, Lhk4;->f0:Ljava/lang/String;

    .line 163
    .line 164
    iput-object v12, v11, Lhk4;->g0:Ljava/lang/String;

    .line 165
    .line 166
    iput-object v12, v11, Lhk4;->h0:Ljava/lang/String;

    .line 167
    .line 168
    iput-object v12, v11, Lhk4;->i0:Ljava/lang/Boolean;

    .line 169
    .line 170
    iput-object v12, v11, Lhk4;->j0:Ljava/lang/Boolean;

    .line 171
    .line 172
    iput-object v2, v11, Lhk4;->k0:Lo15;

    .line 173
    .line 174
    iput-boolean v5, v11, Lhk4;->l0:Z

    .line 175
    .line 176
    iput-boolean v6, v11, Lhk4;->m0:Z

    .line 177
    .line 178
    iput v3, v11, Lhk4;->p0:I

    .line 179
    .line 180
    move-object v4, p0

    .line 181
    move-object v3, p1

    .line 182
    invoke-static/range {v3 .. v11}, Lsu/happ/proxyutility/feature/main/MainActivity;->M(Ljava/lang/String;Lsu/happ/proxyutility/feature/main/MainActivity;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ls51;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 186
    if-ne v1, v13, :cond_7

    .line 187
    .line 188
    :goto_4
    return-object v13

    .line 189
    :cond_7
    move-object p0, v2

    .line 190
    :goto_5
    :try_start_2
    check-cast v1, Ljava/lang/Boolean;

    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    .line 194
    .line 195
    invoke-interface {p0, v12}, Lo15;->m(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    return-object v1

    .line 199
    :catchall_1
    move-exception v0

    .line 200
    move-object p1, v0

    .line 201
    move-object p0, v2

    .line 202
    :goto_6
    invoke-interface {p0, v12}, Lo15;->m(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    throw p1
.end method

.method public final N()V
    .locals 6

    .line 1
    :try_start_0
    sget-object v0, Lss8;->a:Lss8;

    .line 2
    .line 3
    invoke-static {p0}, Lss8;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 8
    .line 9
    invoke-static {v1}, Lys0;->z(Lg94;)Lu84;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Ltp1;->a:Lnf1;

    .line 14
    .line 15
    sget-object v2, Lye1;->Z:Lye1;

    .line 16
    .line 17
    new-instance v3, Lfk4;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x3

    .line 21
    invoke-direct {v3, p0, v0, v4, v5}, Lfk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lq51;B)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x2

    .line 25
    invoke-static {v1, v2, v3, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    throw p0
.end method

.method public final O(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZZLjava/lang/String;ZZLjava/lang/Boolean;Lg83;Ls51;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p7

    move/from16 v7, p8

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    instance-of v10, v9, Ljk4;

    if-eqz v10, :cond_0

    move-object v10, v9

    check-cast v10, Ljk4;

    iget v11, v10, Ljk4;->r0:I

    const/high16 v12, -0x80000000

    and-int v13, v11, v12

    if-eqz v13, :cond_0

    sub-int/2addr v11, v12

    iput v11, v10, Ljk4;->r0:I

    goto :goto_0

    :cond_0
    new-instance v10, Ljk4;

    invoke-direct {v10, v1, v9}, Ljk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ls51;)V

    :goto_0
    iget-object v9, v10, Ljk4;->p0:Ljava/lang/Object;

    .line 1
    iget v11, v10, Ljk4;->r0:I

    sget-object v14, Ljo1;->g0:Ljo1;

    sget-object v16, Ldn8;->a:Ldn8;

    const/4 v13, 0x0

    sget-object v12, Lc71;->X:Lc71;

    packed-switch v11, :pswitch_data_0

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    return-object v13

    :pswitch_0
    iget-object v0, v10, Ljk4;->f0:Ljava/lang/String;

    invoke-static {v9}, Lw39;->n0(Ljava/lang/Object;)V

    move-object v7, v1

    goto/16 :goto_12

    :pswitch_1
    iget-boolean v0, v10, Ljk4;->o0:Z

    iget-boolean v2, v10, Ljk4;->n0:Z

    iget-boolean v3, v10, Ljk4;->m0:Z

    iget-boolean v4, v10, Ljk4;->l0:Z

    iget-boolean v5, v10, Ljk4;->k0:Z

    iget-object v6, v10, Ljk4;->f0:Ljava/lang/String;

    invoke-static {v9}, Lw39;->n0(Ljava/lang/Object;)V

    move-object v7, v1

    :cond_1
    move v1, v0

    move-object v0, v6

    goto/16 :goto_f

    :pswitch_2
    iget-boolean v0, v10, Ljk4;->o0:Z

    iget-boolean v2, v10, Ljk4;->n0:Z

    iget-boolean v3, v10, Ljk4;->m0:Z

    iget-boolean v4, v10, Ljk4;->l0:Z

    iget-boolean v5, v10, Ljk4;->k0:Z

    iget-object v6, v10, Ljk4;->f0:Ljava/lang/String;

    invoke-static {v9}, Lw39;->n0(Ljava/lang/Object;)V

    move-object v7, v1

    goto/16 :goto_e

    :pswitch_3
    invoke-static {v9}, Lw39;->n0(Ljava/lang/Object;)V

    return-object v16

    :pswitch_4
    iget-boolean v0, v10, Ljk4;->o0:Z

    iget-boolean v1, v10, Ljk4;->n0:Z

    iget-boolean v2, v10, Ljk4;->m0:Z

    iget-boolean v3, v10, Ljk4;->l0:Z

    iget-boolean v4, v10, Ljk4;->k0:Z

    iget-object v5, v10, Ljk4;->j0:Lg83;

    invoke-static {v9}, Lw39;->n0(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_5
    iget-boolean v0, v10, Ljk4;->o0:Z

    iget-boolean v2, v10, Ljk4;->n0:Z

    iget-boolean v3, v10, Ljk4;->m0:Z

    iget-boolean v4, v10, Ljk4;->l0:Z

    iget-boolean v5, v10, Ljk4;->k0:Z

    iget-object v6, v10, Ljk4;->j0:Lg83;

    iget-object v7, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iget-object v8, v10, Ljk4;->f0:Ljava/lang/String;

    invoke-static {v9}, Lw39;->n0(Ljava/lang/Object;)V

    move-object v11, v7

    move-object v7, v6

    move-object v6, v8

    goto/16 :goto_9

    :pswitch_6
    invoke-static {v9}, Lw39;->n0(Ljava/lang/Object;)V

    goto/16 :goto_13

    :pswitch_7
    iget-boolean v0, v10, Ljk4;->o0:Z

    iget-boolean v2, v10, Ljk4;->n0:Z

    iget-boolean v3, v10, Ljk4;->m0:Z

    iget-boolean v4, v10, Ljk4;->l0:Z

    iget-boolean v5, v10, Ljk4;->k0:Z

    iget-object v6, v10, Ljk4;->j0:Lg83;

    iget-object v7, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iget-object v8, v10, Ljk4;->h0:Ljava/lang/String;

    iget-object v11, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iget-object v15, v10, Ljk4;->f0:Ljava/lang/String;

    invoke-static {v9}, Lw39;->n0(Ljava/lang/Object;)V

    move-object/from16 v20, v7

    move v7, v0

    move-object/from16 v0, v20

    move-object/from16 v20, v6

    move v6, v2

    move-object/from16 v2, v20

    goto/16 :goto_3

    :pswitch_8
    iget-boolean v0, v10, Ljk4;->o0:Z

    iget-boolean v2, v10, Ljk4;->n0:Z

    iget-boolean v3, v10, Ljk4;->m0:Z

    iget-boolean v4, v10, Ljk4;->l0:Z

    iget-boolean v5, v10, Ljk4;->k0:Z

    iget-object v6, v10, Ljk4;->j0:Lg83;

    iget-object v7, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iget-object v8, v10, Ljk4;->h0:Ljava/lang/String;

    iget-object v11, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iget-object v15, v10, Ljk4;->f0:Ljava/lang/String;

    invoke-static {v9}, Lw39;->n0(Ljava/lang/Object;)V

    move-object/from16 v20, v7

    move v7, v0

    move-object/from16 v0, v20

    move-object/from16 v20, v6

    move v6, v2

    move-object/from16 v2, v20

    goto/16 :goto_2

    :pswitch_9
    invoke-static {v9}, Lw39;->n0(Ljava/lang/Object;)V

    return-object v16

    :pswitch_a
    invoke-static {v9}, Lw39;->n0(Ljava/lang/Object;)V

    return-object v16

    :pswitch_b
    invoke-static {v9}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    move-result-object v9

    .line 3
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    invoke-static {v9, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    if-eqz v8, :cond_1c

    .line 5
    iput-object v13, v10, Ljk4;->f0:Ljava/lang/String;

    iput-object v13, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v13, v10, Ljk4;->h0:Ljava/lang/String;

    iput-object v13, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iput-object v13, v10, Ljk4;->j0:Lg83;

    iput-boolean v3, v10, Ljk4;->k0:Z

    iput-boolean v4, v10, Ljk4;->l0:Z

    iput-boolean v5, v10, Ljk4;->m0:Z

    iput-boolean v6, v10, Ljk4;->n0:Z

    iput-boolean v7, v10, Ljk4;->o0:Z

    const/4 v1, 0x1

    iput v1, v10, Ljk4;->r0:I

    const/4 v1, 0x0

    invoke-interface {v8, v1, v10}, Lg83;->t(ZLs51;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_1c

    goto/16 :goto_11

    .line 6
    :cond_2
    sget-object v9, Lss8;->a:Lss8;

    invoke-static {}, Lss8;->x()Z

    move-result v9

    if-nez v9, :cond_4

    if-eqz v7, :cond_4

    if-nez v6, :cond_3

    .line 7
    sget-object v0, Lko1;->B1:Lm51;

    .line 8
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    move-result-object v0

    .line 9
    invoke-static {v0, v14, v13}, Lkm4;->l0(Lml2;Ljo1;Ljava/lang/String;)V

    :cond_3
    if-eqz v8, :cond_1c

    .line 10
    iput-object v13, v10, Ljk4;->f0:Ljava/lang/String;

    iput-object v13, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v13, v10, Ljk4;->h0:Ljava/lang/String;

    iput-object v13, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iput-object v13, v10, Ljk4;->j0:Lg83;

    iput-boolean v3, v10, Ljk4;->k0:Z

    iput-boolean v4, v10, Ljk4;->l0:Z

    iput-boolean v5, v10, Ljk4;->m0:Z

    iput-boolean v6, v10, Ljk4;->n0:Z

    iput-boolean v7, v10, Ljk4;->o0:Z

    const/4 v1, 0x2

    iput v1, v10, Ljk4;->r0:I

    const/4 v1, 0x0

    invoke-interface {v8, v1, v10}, Lg83;->t(ZLs51;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_1c

    goto/16 :goto_11

    :cond_4
    if-nez v6, :cond_6

    .line 11
    sget-object v9, Lko1;->B1:Lm51;

    .line 12
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    move-result-object v9

    if-eqz v5, :cond_5

    .line 13
    sget-object v11, Ljo1;->Y:Ljo1;

    goto :goto_1

    .line 14
    :cond_5
    sget-object v11, Ljo1;->X:Ljo1;

    .line 15
    :goto_1
    invoke-static {v9, v11, v13}, Lkm4;->l0(Lml2;Ljo1;Ljava/lang/String;)V

    :cond_6
    if-eqz v5, :cond_9

    .line 16
    sget-object v9, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v9

    .line 17
    iget-object v9, v9, Lsu/happ/proxyutility/HappApplication;->j0:Lvz7;

    invoke-virtual {v9}, Lvz7;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lqq0;

    .line 18
    iput-object v0, v10, Ljk4;->f0:Ljava/lang/String;

    iput-object v2, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    move-object/from16 v11, p6

    iput-object v11, v10, Ljk4;->h0:Ljava/lang/String;

    move-object/from16 v15, p9

    iput-object v15, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iput-object v8, v10, Ljk4;->j0:Lg83;

    iput-boolean v3, v10, Ljk4;->k0:Z

    iput-boolean v4, v10, Ljk4;->l0:Z

    iput-boolean v5, v10, Ljk4;->m0:Z

    iput-boolean v6, v10, Ljk4;->n0:Z

    iput-boolean v7, v10, Ljk4;->o0:Z

    const/4 v13, 0x3

    iput v13, v10, Ljk4;->r0:I

    const/16 v13, 0x5c

    invoke-static {v9, v2, v0, v10, v13}, Lqq0;->d(Lqq0;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Ls51;I)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v12, :cond_7

    goto/16 :goto_11

    :cond_7
    move-object/from16 v20, v15

    move-object v15, v0

    move-object/from16 v0, v20

    move-object/from16 v20, v11

    move-object v11, v2

    move-object v2, v8

    move-object/from16 v8, v20

    move/from16 v20, v5

    move v5, v3

    move/from16 v3, v20

    .line 19
    :goto_2
    sget-object v9, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v9

    .line 20
    iget-object v9, v9, Lsu/happ/proxyutility/HappApplication;->m0:Lvz7;

    invoke-virtual {v9}, Lvz7;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lus;

    .line 21
    iput-object v15, v10, Ljk4;->f0:Ljava/lang/String;

    iput-object v11, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v8, v10, Ljk4;->h0:Ljava/lang/String;

    iput-object v0, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iput-object v2, v10, Ljk4;->j0:Lg83;

    iput-boolean v5, v10, Ljk4;->k0:Z

    iput-boolean v4, v10, Ljk4;->l0:Z

    iput-boolean v3, v10, Ljk4;->m0:Z

    iput-boolean v6, v10, Ljk4;->n0:Z

    iput-boolean v7, v10, Ljk4;->o0:Z

    const/4 v13, 0x4

    iput v13, v10, Ljk4;->r0:I

    .line 22
    invoke-virtual {v9, v15, v10}, Lus;->a(Ljava/lang/String;Ls51;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v12, :cond_8

    goto/16 :goto_11

    :cond_8
    :goto_3
    move-object v9, v2

    move-object v2, v0

    goto :goto_4

    :cond_9
    move-object/from16 v11, p6

    move-object/from16 v15, p9

    move v9, v5

    move v5, v3

    move v3, v9

    move-object v9, v8

    move-object v8, v11

    move-object v11, v2

    move-object v2, v15

    move-object v15, v0

    .line 23
    :goto_4
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/SubscriptionItem;->u()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/SubscriptionItem;->X()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_8

    .line 24
    :cond_a
    :try_start_0
    sget-object v0, Lss8;->a:Lss8;

    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/SubscriptionItem;->X()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lss8;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v13, v0

    goto :goto_5

    :catchall_0
    move-exception v0

    .line 25
    instance-of v13, v0, Ljava/lang/InterruptedException;

    if-nez v13, :cond_1d

    instance-of v13, v0, Ljava/util/concurrent/CancellationException;

    if-nez v13, :cond_1d

    .line 26
    new-instance v13, Lrj6;

    invoke-direct {v13, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 27
    :goto_5
    instance-of v0, v13, Lrj6;

    if-eqz v0, :cond_b

    const/4 v13, 0x0

    .line 28
    :cond_b
    move-object v0, v13

    check-cast v0, Ljava/lang/String;

    .line 29
    sget-object v13, Lo83;->a:Lo83;

    if-nez v0, :cond_d

    if-nez v6, :cond_c

    .line 30
    sget-object v0, Lko1;->B1:Lm51;

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    move-result-object v0

    invoke-static {v0}, Lkm4;->x(Lml2;)V

    .line 31
    new-instance v0, Lsu/happ/proxyutility/dto/ImportResult;

    const/4 v2, 0x5

    const/4 v8, 0x0

    const/4 v11, 0x0

    invoke-direct {v0, v8, v13, v11, v2}, Lsu/happ/proxyutility/dto/ImportResult;-><init>(ILx83;Lt83;I)V

    const/4 v2, 0x1

    .line 32
    invoke-virtual {v1, v0, v4, v2}, Lsu/happ/proxyutility/feature/main/MainActivity;->W(Lsu/happ/proxyutility/dto/ImportResult;ZZ)Z

    goto :goto_6

    :cond_c
    const/4 v11, 0x0

    :goto_6
    if-eqz v9, :cond_1c

    .line 33
    iput-object v11, v10, Ljk4;->f0:Ljava/lang/String;

    iput-object v11, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v11, v10, Ljk4;->h0:Ljava/lang/String;

    iput-object v11, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iput-object v11, v10, Ljk4;->j0:Lg83;

    iput-boolean v5, v10, Ljk4;->k0:Z

    iput-boolean v4, v10, Ljk4;->l0:Z

    iput-boolean v3, v10, Ljk4;->m0:Z

    iput-boolean v6, v10, Ljk4;->n0:Z

    iput-boolean v7, v10, Ljk4;->o0:Z

    const/4 v2, 0x5

    iput v2, v10, Ljk4;->r0:I

    const/4 v1, 0x0

    invoke-interface {v9, v1, v10}, Lg83;->t(ZLs51;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_1c

    goto/16 :goto_11

    .line 34
    :cond_d
    sget-object v18, Lss8;->a:Lss8;

    invoke-static {v0}, Lss8;->z(Ljava/lang/String;)Z

    move-result v18

    if-nez v18, :cond_f

    if-nez v6, :cond_e

    .line 35
    sget-object v0, Lko1;->B1:Lm51;

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    move-result-object v0

    invoke-static {v0}, Lkm4;->x(Lml2;)V

    .line 36
    new-instance v0, Lsu/happ/proxyutility/dto/ImportResult;

    const/4 v2, 0x5

    const/4 v8, 0x0

    const/4 v11, 0x0

    invoke-direct {v0, v8, v13, v11, v2}, Lsu/happ/proxyutility/dto/ImportResult;-><init>(ILx83;Lt83;I)V

    const/4 v2, 0x1

    .line 37
    invoke-virtual {v1, v0, v4, v2}, Lsu/happ/proxyutility/feature/main/MainActivity;->W(Lsu/happ/proxyutility/dto/ImportResult;ZZ)Z

    goto :goto_7

    :cond_e
    const/4 v11, 0x0

    :goto_7
    if-eqz v9, :cond_1c

    .line 38
    iput-object v11, v10, Ljk4;->f0:Ljava/lang/String;

    iput-object v11, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v11, v10, Ljk4;->h0:Ljava/lang/String;

    iput-object v11, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iput-object v11, v10, Ljk4;->j0:Lg83;

    iput-boolean v5, v10, Ljk4;->k0:Z

    iput-boolean v4, v10, Ljk4;->l0:Z

    iput-boolean v3, v10, Ljk4;->m0:Z

    iput-boolean v6, v10, Ljk4;->n0:Z

    iput-boolean v7, v10, Ljk4;->o0:Z

    const/4 v0, 0x6

    iput v0, v10, Ljk4;->r0:I

    const/4 v1, 0x0

    invoke-interface {v9, v1, v10}, Lg83;->t(ZLs51;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_1c

    goto/16 :goto_11

    .line 39
    :cond_f
    :goto_8
    iget-object v13, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->X0:Lvz7;

    invoke-virtual {v13}, Lvz7;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lpr7;

    move-object/from16 v18, v0

    .line 40
    new-instance v0, Lq30;

    move-object/from16 p5, v2

    const/4 v2, 0x2

    invoke-direct {v0, v6, v1, v2}, Lq30;-><init>(ZLjava/lang/Object;B)V

    .line 41
    new-instance v2, Lok4;

    move-object/from16 p3, v1

    move-object/from16 p1, v2

    move/from16 p6, v4

    move/from16 p8, v5

    move/from16 p2, v6

    move/from16 p10, v7

    move-object/from16 p9, v8

    move-object/from16 p11, v9

    move-object/from16 p4, v11

    move-object/from16 p7, v15

    invoke-direct/range {p1 .. p11}, Lok4;-><init>(ZLsu/happ/proxyutility/feature/main/MainActivity;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/Boolean;ZLjava/lang/String;ZLjava/lang/String;ZLg83;)V

    move-object/from16 v19, p1

    move/from16 v2, p2

    move-object/from16 v7, p5

    move/from16 v9, p10

    move-object/from16 v6, p11

    move-object/from16 p9, v0

    .line 42
    new-instance v0, Lzs1;

    const/4 v5, 0x4

    invoke-direct {v0, v1, v4, v5}, Lzs1;-><init>(Ljava/lang/Object;ZB)V

    new-instance v5, Lpk4;

    const/16 v17, 0x0

    move/from16 p5, p8

    move-object/from16 p2, v1

    move/from16 p7, v4

    move-object/from16 p1, v5

    move-object/from16 p6, v8

    move-object/from16 p3, v15

    move-object/from16 p8, v17

    invoke-direct/range {p1 .. p8}, Lpk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZLjava/lang/String;ZLq51;)V

    move-object/from16 v8, p1

    move/from16 v5, p5

    iput-object v15, v10, Ljk4;->f0:Ljava/lang/String;

    iput-object v11, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    move-object/from16 p5, v7

    const/4 v7, 0x0

    iput-object v7, v10, Ljk4;->h0:Ljava/lang/String;

    iput-object v7, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iput-object v6, v10, Ljk4;->j0:Lg83;

    iput-boolean v5, v10, Ljk4;->k0:Z

    iput-boolean v4, v10, Ljk4;->l0:Z

    iput-boolean v3, v10, Ljk4;->m0:Z

    iput-boolean v2, v10, Ljk4;->n0:Z

    iput-boolean v9, v10, Ljk4;->o0:Z

    const/4 v7, 0x7

    iput v7, v10, Ljk4;->r0:I

    const/16 v7, 0x80

    move-object/from16 p1, p9

    move-object/from16 p9, p5

    move-object/from16 p5, p1

    move-object/from16 p7, v0

    move/from16 p3, v5

    move/from16 p11, v7

    move-object/from16 p8, v8

    move-object/from16 p10, v10

    move-object/from16 p1, v13

    move-object/from16 p2, v15

    move-object/from16 p4, v18

    move-object/from16 p6, v19

    invoke-static/range {p1 .. p11}, Lpr7;->b(Lpr7;Ljava/lang/String;ZLjava/lang/String;Lq30;Lok4;Lzs1;Lpk4;Ljava/lang/Boolean;Ls51;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_10

    goto/16 :goto_11

    :cond_10
    move v7, v9

    move-object v9, v0

    move v0, v7

    move-object v7, v6

    move-object v6, v15

    .line 43
    :goto_9
    check-cast v9, Lav7;

    .line 44
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    move-result-object v8

    invoke-virtual {v8, v6}, Lsu/happ/proxyutility/feature/main/MainViewModel;->W(Ljava/lang/String;)V

    .line 45
    instance-of v8, v9, Lxu7;

    if-eqz v8, :cond_17

    .line 46
    check-cast v9, Lxu7;

    .line 47
    iget-object v6, v9, Lxu7;->a:Ljava/lang/Throwable;

    .line 48
    instance-of v8, v6, Lym;

    if-eqz v8, :cond_12

    if-nez v2, :cond_11

    .line 49
    sget-object v6, Lko1;->B1:Lm51;

    .line 50
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    move-result-object v1

    const/4 v11, 0x0

    .line 51
    invoke-static {v1, v14, v11}, Lkm4;->l0(Lml2;Ljo1;Ljava/lang/String;)V

    .line 52
    :cond_11
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v1

    invoke-virtual {v1}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    move-result-object v1

    new-instance v6, Luh3;

    const/16 v8, 0x17

    invoke-direct {v6, v8}, Luh3;-><init>(B)V

    invoke-virtual {v1, v6}, Lkf4;->h(Lgn2;)V

    :goto_a
    move-object v1, v7

    goto/16 :goto_c

    .line 53
    :cond_12
    instance-of v8, v6, Lxz1;

    if-eqz v8, :cond_13

    .line 54
    new-instance v6, Lsu/happ/proxyutility/dto/ImportResult;

    sget-object v8, Lm83;->a:Lm83;

    const/4 v9, 0x5

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-direct {v6, v11, v8, v13, v9}, Lsu/happ/proxyutility/dto/ImportResult;-><init>(ILx83;Lt83;I)V

    const/4 v8, 0x1

    .line 55
    invoke-virtual {v1, v6, v4, v8}, Lsu/happ/proxyutility/feature/main/MainActivity;->W(Lsu/happ/proxyutility/dto/ImportResult;ZZ)Z

    goto :goto_a

    :cond_13
    const/4 v13, 0x0

    .line 56
    instance-of v8, v6, Lj02;

    if-eqz v8, :cond_15

    iput-object v13, v10, Ljk4;->f0:Ljava/lang/String;

    iput-object v13, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v13, v10, Ljk4;->h0:Ljava/lang/String;

    iput-object v13, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iput-object v7, v10, Ljk4;->j0:Lg83;

    iput-boolean v5, v10, Ljk4;->k0:Z

    iput-boolean v4, v10, Ljk4;->l0:Z

    iput-boolean v3, v10, Ljk4;->m0:Z

    iput-boolean v2, v10, Ljk4;->n0:Z

    iput-boolean v0, v10, Ljk4;->o0:Z

    const/16 v6, 0x8

    iput v6, v10, Ljk4;->r0:I

    .line 57
    sget-object v6, Ltp1;->a:Lnf1;

    .line 58
    sget-object v6, Ldm4;->a:Lhv2;

    .line 59
    new-instance v8, Lzh4;

    const/4 v9, 0x0

    move-object/from16 p3, v1

    move/from16 p2, v2

    move-object/from16 p5, v7

    move-object/from16 p1, v8

    move-object/from16 p6, v9

    move-object/from16 p4, v11

    invoke-direct/range {p1 .. p6}, Lzh4;-><init>(ZLsu/happ/proxyutility/feature/main/MainActivity;Lsu/happ/proxyutility/dto/SubscriptionItem;Lg83;Lq51;)V

    move-object/from16 v7, p1

    move-object/from16 v1, p5

    .line 60
    invoke-static {v6, v7, v10}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v12, :cond_14

    goto/16 :goto_11

    :cond_14
    move/from16 v20, v5

    move-object v5, v1

    move v1, v2

    move v2, v3

    move v3, v4

    move/from16 v4, v20

    :goto_b
    move-object v7, v5

    move v5, v4

    move v4, v3

    move v3, v2

    move v2, v1

    goto :goto_d

    :cond_15
    move-object/from16 v20, v7

    move-object v7, v1

    move-object/from16 v1, v20

    .line 61
    instance-of v6, v6, Lau7;

    if-eqz v6, :cond_16

    if-nez v2, :cond_16

    .line 62
    sget-object v6, Lko1;->B1:Lm51;

    invoke-virtual {v7}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    move-result-object v6

    invoke-static {v6}, Lkm4;->x(Lml2;)V

    :cond_16
    :goto_c
    move-object v7, v1

    :goto_d
    if-eqz v7, :cond_1c

    const/4 v11, 0x0

    .line 63
    iput-object v11, v10, Ljk4;->f0:Ljava/lang/String;

    iput-object v11, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v11, v10, Ljk4;->h0:Ljava/lang/String;

    iput-object v11, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iput-object v11, v10, Ljk4;->j0:Lg83;

    iput-boolean v5, v10, Ljk4;->k0:Z

    iput-boolean v4, v10, Ljk4;->l0:Z

    iput-boolean v3, v10, Ljk4;->m0:Z

    iput-boolean v2, v10, Ljk4;->n0:Z

    iput-boolean v0, v10, Ljk4;->o0:Z

    const/16 v0, 0x9

    iput v0, v10, Ljk4;->r0:I

    const/4 v1, 0x0

    invoke-interface {v7, v1, v10}, Lg83;->t(ZLs51;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_1c

    goto/16 :goto_11

    :cond_17
    move-object/from16 v20, v7

    move-object v7, v1

    move-object/from16 v1, v20

    if-nez v2, :cond_18

    .line 64
    sget-object v8, Lko1;->B1:Lm51;

    invoke-virtual {v7}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    move-result-object v8

    invoke-static {v8}, Lkm4;->x(Lml2;)V

    :cond_18
    if-eqz v1, :cond_19

    .line 65
    iput-object v6, v10, Ljk4;->f0:Ljava/lang/String;

    const/4 v11, 0x0

    iput-object v11, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v11, v10, Ljk4;->h0:Ljava/lang/String;

    iput-object v11, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iput-object v11, v10, Ljk4;->j0:Lg83;

    iput-boolean v5, v10, Ljk4;->k0:Z

    iput-boolean v4, v10, Ljk4;->l0:Z

    iput-boolean v3, v10, Ljk4;->m0:Z

    iput-boolean v2, v10, Ljk4;->n0:Z

    iput-boolean v0, v10, Ljk4;->o0:Z

    const/16 v8, 0xa

    iput v8, v10, Ljk4;->r0:I

    const/4 v8, 0x1

    invoke-interface {v1, v8, v10}, Lg83;->t(ZLs51;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_19

    goto :goto_11

    .line 66
    :cond_19
    :goto_e
    invoke-virtual {v7}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    move-result-object v1

    iput-object v6, v10, Ljk4;->f0:Ljava/lang/String;

    const/4 v11, 0x0

    iput-object v11, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v11, v10, Ljk4;->h0:Ljava/lang/String;

    iput-object v11, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iput-object v11, v10, Ljk4;->j0:Lg83;

    iput-boolean v5, v10, Ljk4;->k0:Z

    iput-boolean v4, v10, Ljk4;->l0:Z

    iput-boolean v3, v10, Ljk4;->m0:Z

    iput-boolean v2, v10, Ljk4;->n0:Z

    iput-boolean v0, v10, Ljk4;->o0:Z

    const/16 v8, 0xb

    iput v8, v10, Ljk4;->r0:I

    const/4 v8, 0x0

    .line 67
    invoke-virtual {v1, v10, v11, v8}, Lsu/happ/proxyutility/feature/main/MainViewModel;->D(Ls51;Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_1

    goto :goto_11

    .line 68
    :goto_f
    sget-object v6, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v6

    invoke-virtual {v6}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    move-result-object v6

    .line 69
    invoke-virtual {v6, v0}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    move-result-object v6

    if-eqz v6, :cond_1a

    .line 70
    iget-object v11, v6, Lqs7;->j:Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;

    goto :goto_10

    :cond_1a
    const/4 v11, 0x0

    .line 71
    :goto_10
    sget-object v6, Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;->PING:Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;

    if-ne v11, v6, :cond_1c

    .line 72
    sget-object v6, Lgx1;->Y:Lbe;

    const/16 v6, 0x1f4

    sget-object v8, Llx1;->Z:Llx1;

    invoke-static {v6, v8}, Lvj8;->l0(ILlx1;)J

    move-result-wide v8

    iput-object v0, v10, Ljk4;->f0:Ljava/lang/String;

    const/4 v11, 0x0

    iput-object v11, v10, Ljk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v11, v10, Ljk4;->h0:Ljava/lang/String;

    iput-object v11, v10, Ljk4;->i0:Ljava/lang/Boolean;

    iput-object v11, v10, Ljk4;->j0:Lg83;

    iput-boolean v5, v10, Ljk4;->k0:Z

    iput-boolean v4, v10, Ljk4;->l0:Z

    iput-boolean v3, v10, Ljk4;->m0:Z

    iput-boolean v2, v10, Ljk4;->n0:Z

    iput-boolean v1, v10, Ljk4;->o0:Z

    const/16 v1, 0xc

    iput v1, v10, Ljk4;->r0:I

    invoke-static {v8, v9, v10}, Lu70;->G(JLq51;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_1b

    :goto_11
    return-object v12

    .line 73
    :cond_1b
    :goto_12
    invoke-virtual {v7, v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->X(Ljava/lang/String;)V

    :cond_1c
    :goto_13
    return-object v16

    .line 74
    :cond_1d
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final Q(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    const-string v0, "json"

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object p1, Lm83;->a:Lm83;

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lsu/happ/proxyutility/feature/main/MainActivity;->J(Lt83;Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 18
    .line 19
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v1, v1, Lsu/happ/proxyutility/HappApplication;->H0:Lvz7;

    .line 24
    .line 25
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Li83;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Li83;->a(Ljava/lang/String;)Ll81;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-boolean v1, p1, Ll81;->a:Z

    .line 36
    .line 37
    iget-boolean p1, p1, Ll81;->b:Z

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v2, 0x3

    .line 47
    invoke-static {p1, v1, v2}, Lsu/happ/proxyutility/feature/main/MainViewModel;->C(Lsu/happ/proxyutility/feature/main/MainViewModel;ZI)V

    .line 48
    .line 49
    .line 50
    sget p1, Ly46;->toast_success:I

    .line 51
    .line 52
    invoke-static {p0, p1}, Lpu;->Q(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    if-eqz v1, :cond_2

    .line 57
    .line 58
    sget-object p1, Ln83;->a:Ln83;

    .line 59
    .line 60
    invoke-virtual {p0, p1, p2}, Lsu/happ/proxyutility/feature/main/MainActivity;->J(Lt83;Z)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    new-instance p1, Lq83;

    .line 65
    .line 66
    invoke-direct {p1, v0}, Lq83;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1, p2}, Lsu/happ/proxyutility/feature/main/MainActivity;->J(Lt83;Z)V

    .line 70
    .line 71
    .line 72
    :goto_0
    sget-object p1, Ldn8;->a:Ldn8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :goto_1
    instance-of v1, p1, Ljava/lang/InterruptedException;

    .line 76
    .line 77
    if-nez v1, :cond_4

    .line 78
    .line 79
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 80
    .line 81
    if-nez v1, :cond_4

    .line 82
    .line 83
    new-instance v1, Lrj6;

    .line 84
    .line 85
    invoke-direct {v1, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object p1, v1

    .line 89
    :goto_2
    invoke-static {p1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    new-instance p1, Lq83;

    .line 96
    .line 97
    invoke-direct {p1, v0}, Lq83;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1, p2}, Lsu/happ/proxyutility/feature/main/MainActivity;->J(Lt83;Z)V

    .line 101
    .line 102
    .line 103
    :cond_3
    return-void

    .line 104
    :cond_4
    throw p1
.end method

.method public final R()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "android.hardware.camera"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ly45;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Ly45;-><init>(Lsu/happ/proxyutility/ui/BaseActivity;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "android.permission.CAMERA"

    .line 19
    .line 20
    filled-new-array {v1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ly45;->L([Ljava/lang/String;)Lq85;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Loj4;

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    invoke-direct {v1, p0, v2}, Loj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 32
    .line 33
    .line 34
    new-instance p0, Lo61;

    .line 35
    .line 36
    const/16 v2, 0xf

    .line 37
    .line 38
    invoke-direct {p0, v1, v2}, Lo61;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0}, Lq85;->a(Lw4;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-static {}, Lpz7;->a()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    sget v0, Ly46;->warning_text:I

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    sget v0, Ly46;->switch_tv_ui_dialog:I

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    sget v0, Ly46;->yes:I

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    sget v0, Ly46;->no:I

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    new-instance v8, Lmj4;

    .line 77
    .line 78
    const/16 v0, 0x8

    .line 79
    .line 80
    invoke-direct {v8, p0, v0}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 81
    .line 82
    .line 83
    const/4 v9, 0x0

    .line 84
    const/16 v10, 0x492

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    const/4 v7, 0x0

    .line 88
    move-object v1, p0

    .line 89
    invoke-static/range {v1 .. v10}, Lbe;->m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final S(Lsu/happ/proxyutility/dto/ImportResult;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZLjava/util/List;Ls51;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v4, p0

    move-object/from16 v6, p2

    move-object/from16 v9, p3

    move/from16 v10, p4

    move/from16 v1, p5

    move/from16 v5, p9

    move/from16 v11, p10

    move-object/from16 v0, p12

    instance-of v2, v0, Lsk4;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lsk4;

    iget v3, v2, Lsk4;->s0:I

    const/high16 v7, -0x80000000

    and-int v8, v3, v7

    if-eqz v8, :cond_0

    sub-int/2addr v3, v7

    iput v3, v2, Lsk4;->s0:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lsk4;

    invoke-direct {v2, v4, v0}, Lsk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ls51;)V

    goto :goto_0

    :goto_1
    iget-object v0, v8, Lsk4;->q0:Ljava/lang/Object;

    .line 1
    iget v2, v8, Lsk4;->s0:I

    iget-object v13, v4, Lsu/happ/proxyutility/feature/main/MainActivity;->l1:Lgk7;

    const/4 v14, 0x1

    const/4 v15, 0x0

    sget-object v7, Lc71;->X:Lc71;

    packed-switch v2, :pswitch_data_0

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    return-object v15

    :pswitch_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    goto/16 :goto_13

    :pswitch_1
    iget-object v1, v8, Lsk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iget-object v2, v8, Lsk4;->f0:Ljava/lang/String;

    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_2
    iget-boolean v1, v8, Lsk4;->p0:Z

    iget-boolean v2, v8, Lsk4;->o0:Z

    iget-boolean v3, v8, Lsk4;->n0:Z

    iget-boolean v5, v8, Lsk4;->m0:Z

    iget-object v6, v8, Lsk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iget-object v9, v8, Lsk4;->f0:Ljava/lang/String;

    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    move-object v12, v7

    goto/16 :goto_e

    :pswitch_3
    iget-boolean v1, v8, Lsk4;->p0:Z

    iget-boolean v2, v8, Lsk4;->o0:Z

    iget-boolean v3, v8, Lsk4;->n0:Z

    iget-boolean v5, v8, Lsk4;->m0:Z

    iget-object v6, v8, Lsk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    check-cast v6, Ljava/util/List;

    iget-object v6, v8, Lsk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iget-object v9, v8, Lsk4;->f0:Ljava/lang/String;

    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    move-object v11, v9

    move-object v9, v6

    move-object v6, v11

    move v11, v1

    goto/16 :goto_c

    :pswitch_4
    iget-boolean v1, v8, Lsk4;->p0:Z

    iget-boolean v2, v8, Lsk4;->o0:Z

    iget-boolean v3, v8, Lsk4;->n0:Z

    iget-boolean v5, v8, Lsk4;->m0:Z

    iget-object v6, v8, Lsk4;->l0:Ljava/util/Iterator;

    iget-object v9, v8, Lsk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    check-cast v9, Ljava/util/List;

    iget-object v9, v8, Lsk4;->j0:Ljava/lang/Boolean;

    iget-object v10, v8, Lsk4;->i0:Ljava/lang/Boolean;

    iget-object v11, v8, Lsk4;->h0:Ljava/lang/String;

    iget-object v12, v8, Lsk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iget-object v15, v8, Lsk4;->f0:Ljava/lang/String;

    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    move v0, v5

    move v5, v2

    move-object v2, v10

    move v10, v0

    move-object v0, v11

    move v11, v1

    move v1, v3

    move-object v3, v9

    move-object v9, v12

    move-object v12, v8

    move-object v8, v6

    move-object v6, v15

    goto/16 :goto_b

    :pswitch_5
    iget-object v1, v8, Lsk4;->f0:Ljava/lang/String;

    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_6
    iget-boolean v1, v8, Lsk4;->p0:Z

    iget-boolean v2, v8, Lsk4;->o0:Z

    iget-boolean v5, v8, Lsk4;->n0:Z

    iget-boolean v6, v8, Lsk4;->m0:Z

    iget-object v9, v8, Lsk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iget-object v10, v8, Lsk4;->f0:Ljava/lang/String;

    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    move-object v11, v10

    move v10, v6

    move-object v6, v11

    move v11, v1

    goto/16 :goto_6

    :pswitch_7
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ImportResult;->a()I

    move-result v0

    if-lez v0, :cond_1a

    if-eqz v9, :cond_8

    if-nez v1, :cond_8

    .line 3
    sget-object v2, Lkw4;->a:Lkw4;

    .line 4
    invoke-static {v6}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    move-result-object v16

    if-nez v16, :cond_1

    const/4 v2, 0x0

    goto :goto_2

    .line 5
    :cond_1
    invoke-static {}, Ly08;->c()J

    move-result-wide v17

    const/16 v22, 0x0

    const v23, 0xffffdff

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v23}, Lsu/happ/proxyutility/dto/SubscriptionItem;->d(Lsu/happ/proxyutility/dto/SubscriptionItem;JZLsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/Long;I)Lsu/happ/proxyutility/dto/SubscriptionItem;

    move-result-object v2

    .line 6
    invoke-static {v2, v6}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    :goto_2
    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    move-object v9, v2

    .line 7
    :goto_3
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 8
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/MetaParams;->F()Ljava/util/Map;

    move-result-object v12

    if-eqz v12, :cond_3

    .line 9
    new-instance v15, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;

    invoke-direct {v15, v12}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;-><init>(Ljava/util/Map;)V

    goto :goto_4

    :cond_3
    const/4 v15, 0x0

    .line 10
    :goto_4
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/MetaParams;->A0()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/MetaParams;->P()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/MetaParams;->U()Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v15, v12, v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 11
    invoke-static {v0}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v14

    if-ne v0, v14, :cond_4

    .line 13
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v0

    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    move-result-object v0

    new-instance v3, Lza2;

    invoke-direct {v3, v2, v9, v14}, Lza2;-><init>(Lsu/happ/proxyutility/dto/MetaParams;Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    invoke-virtual {v0, v3}, Lkf4;->h(Lgn2;)V

    .line 14
    :cond_4
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v0

    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    move-result-object v0

    new-instance v2, Luq0;

    const/4 v3, 0x4

    invoke-direct {v2, v9, v3}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    invoke-virtual {v0, v2}, Lkf4;->h(Lgn2;)V

    .line 15
    sget-object v0, Ltp1;->a:Lnf1;

    .line 16
    sget-object v0, Ldm4;->a:Lhv2;

    .line 17
    new-instance v2, Ltk4;

    const/4 v3, 0x0

    const/4 v12, 0x0

    invoke-direct {v2, v4, v9, v12, v3}, Ltk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lsu/happ/proxyutility/dto/SubscriptionItem;Lq51;B)V

    iput-object v6, v8, Lsk4;->f0:Ljava/lang/String;

    iput-object v12, v8, Lsk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v12, v8, Lsk4;->h0:Ljava/lang/String;

    iput-object v12, v8, Lsk4;->i0:Ljava/lang/Boolean;

    iput-object v12, v8, Lsk4;->j0:Ljava/lang/Boolean;

    iput-object v9, v8, Lsk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-boolean v10, v8, Lsk4;->m0:Z

    iput-boolean v1, v8, Lsk4;->n0:Z

    iput-boolean v5, v8, Lsk4;->o0:Z

    iput-boolean v11, v8, Lsk4;->p0:Z

    iput v14, v8, Lsk4;->s0:I

    .line 18
    invoke-static {v0, v2, v8}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_5

    :goto_5
    move-object v12, v7

    goto/16 :goto_12

    :cond_5
    move v2, v5

    move v5, v1

    .line 19
    :goto_6
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 20
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/SubscriptionItem;->b0()Z

    move-result v1

    .line 21
    iput-object v6, v8, Lsk4;->f0:Ljava/lang/String;

    const/4 v12, 0x0

    iput-object v12, v8, Lsk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v12, v8, Lsk4;->h0:Ljava/lang/String;

    iput-object v12, v8, Lsk4;->i0:Ljava/lang/Boolean;

    iput-object v12, v8, Lsk4;->j0:Ljava/lang/Boolean;

    iput-object v12, v8, Lsk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-boolean v10, v8, Lsk4;->m0:Z

    iput-boolean v5, v8, Lsk4;->n0:Z

    iput-boolean v2, v8, Lsk4;->o0:Z

    iput-boolean v11, v8, Lsk4;->p0:Z

    const/4 v2, 0x2

    iput v2, v8, Lsk4;->s0:I

    invoke-virtual {v13, v0, v1, v6, v8}, Lgk7;->a(Lsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/String;Ls51;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_6

    goto :goto_5

    :cond_6
    move-object v1, v6

    :goto_7
    move-object v6, v1

    .line 22
    :cond_7
    invoke-virtual {v4}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    move-result-object v0

    invoke-virtual {v0, v6}, Lsu/happ/proxyutility/feature/main/MainViewModel;->W(Ljava/lang/String;)V

    .line 23
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    .line 24
    :cond_8
    sget-object v0, Lkw4;->a:Lkw4;

    invoke-static {}, Lkw4;->d()Ljava/util/List;

    move-result-object v0

    .line 25
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v15, v12

    check-cast v15, Lqg5;

    .line 27
    iget-object v15, v15, Lqg5;->X:Ljava/lang/Object;

    .line 28
    check-cast v15, Lsu/happ/proxyutility/domain/sub/SubId;

    invoke-virtual {v15}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    move-result-object v15

    if-eqz p11, :cond_9

    .line 29
    invoke-interface/range {p11 .. p11}, Ljava/util/Collection;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_9

    goto :goto_9

    .line 30
    :cond_9
    invoke-interface/range {p11 .. p11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :cond_a
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_b

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v2, v17

    check-cast v2, Lqg5;

    .line 31
    iget-object v2, v2, Lqg5;->X:Ljava/lang/Object;

    .line 32
    check-cast v2, Lsu/happ/proxyutility/domain/sub/SubId;

    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    move-result-object v2

    .line 33
    invoke-static {v15, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_8

    .line 34
    :cond_b
    :goto_9
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 35
    :cond_c
    sget-object v0, Lkw4;->a:Lkw4;

    invoke-static {v6}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    move-result-object v0

    if-nez v0, :cond_d

    move-object v0, v9

    .line 36
    :cond_d
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_10

    .line 37
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v2, p7

    move-object/from16 v3, p8

    move-object v12, v8

    move-object v8, v0

    move-object/from16 v0, p6

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_f

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lqg5;

    .line 38
    iget-object v14, v15, Lqg5;->X:Ljava/lang/Object;

    .line 39
    check-cast v14, Lsu/happ/proxyutility/domain/sub/SubId;

    invoke-virtual {v14}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    move-result-object v14

    .line 40
    iget-object v15, v15, Lqg5;->Y:Ljava/lang/Object;

    .line 41
    check-cast v15, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 42
    iput-object v6, v12, Lsk4;->f0:Ljava/lang/String;

    iput-object v9, v12, Lsk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v0, v12, Lsk4;->h0:Ljava/lang/String;

    iput-object v2, v12, Lsk4;->i0:Ljava/lang/Boolean;

    iput-object v3, v12, Lsk4;->j0:Ljava/lang/Boolean;

    move-object/from16 p1, v0

    const/4 v0, 0x0

    iput-object v0, v12, Lsk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v8, v12, Lsk4;->l0:Ljava/util/Iterator;

    iput-boolean v10, v12, Lsk4;->m0:Z

    iput-boolean v1, v12, Lsk4;->n0:Z

    iput-boolean v5, v12, Lsk4;->o0:Z

    iput-boolean v11, v12, Lsk4;->p0:Z

    const/4 v0, 0x3

    iput v0, v12, Lsk4;->s0:I

    move/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move/from16 p6, v5

    move-object/from16 p9, v12

    move-object/from16 p7, v14

    move-object/from16 p8, v15

    invoke-static/range {p1 .. p9}, Lsu/happ/proxyutility/feature/main/MainActivity;->T(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lsu/happ/proxyutility/feature/main/MainActivity;ZLjava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;Ls51;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v12, p6

    move-object/from16 v1, p9

    if-ne v0, v7, :cond_e

    goto/16 :goto_5

    :cond_e
    move v0, v12

    move-object v12, v1

    move v1, v3

    move-object v3, v5

    move v5, v0

    move-object v0, v2

    move-object v2, v4

    :goto_b
    move-object/from16 v4, p0

    const/4 v14, 0x1

    goto :goto_a

    :cond_f
    move v3, v1

    move-object v1, v12

    move v12, v5

    move-object/from16 v4, p0

    move-object v8, v1

    move v5, v10

    move v2, v12

    :goto_c
    move-object v12, v7

    goto/16 :goto_d

    :cond_10
    if-eqz v1, :cond_13

    if-eqz v0, :cond_11

    .line 43
    iput-object v6, v8, Lsk4;->f0:Ljava/lang/String;

    iput-object v9, v8, Lsk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    const/4 v12, 0x0

    iput-object v12, v8, Lsk4;->h0:Ljava/lang/String;

    iput-object v12, v8, Lsk4;->i0:Ljava/lang/Boolean;

    iput-object v12, v8, Lsk4;->j0:Ljava/lang/Boolean;

    iput-object v12, v8, Lsk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-boolean v10, v8, Lsk4;->m0:Z

    iput-boolean v1, v8, Lsk4;->n0:Z

    iput-boolean v5, v8, Lsk4;->o0:Z

    iput-boolean v11, v8, Lsk4;->p0:Z

    const/4 v3, 0x4

    iput v3, v8, Lsk4;->s0:I

    move-object/from16 v4, p0

    move-object/from16 v2, p7

    move-object/from16 v3, p8

    move-object v12, v7

    move-object v7, v0

    move-object/from16 v0, p6

    invoke-static/range {v0 .. v8}, Lsu/happ/proxyutility/feature/main/MainActivity;->T(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lsu/happ/proxyutility/feature/main/MainActivity;ZLjava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;Ls51;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_12

    goto/16 :goto_12

    :cond_11
    move-object/from16 v4, p0

    move-object v12, v7

    :cond_12
    move v3, v1

    move v2, v5

    move v5, v10

    goto :goto_d

    :cond_13
    move-object/from16 v4, p0

    move-object v12, v7

    .line 44
    sget-object v0, Ltp1;->a:Lnf1;

    .line 45
    sget-object v0, Ldm4;->a:Lhv2;

    .line 46
    new-instance v2, Lnk4;

    const/4 v3, 0x1

    const/4 v7, 0x0

    invoke-direct {v2, v4, v7, v3}, Lnk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    iput-object v6, v8, Lsk4;->f0:Ljava/lang/String;

    iput-object v9, v8, Lsk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v7, v8, Lsk4;->h0:Ljava/lang/String;

    iput-object v7, v8, Lsk4;->i0:Ljava/lang/Boolean;

    iput-object v7, v8, Lsk4;->j0:Ljava/lang/Boolean;

    iput-object v7, v8, Lsk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-boolean v10, v8, Lsk4;->m0:Z

    iput-boolean v1, v8, Lsk4;->n0:Z

    iput-boolean v5, v8, Lsk4;->o0:Z

    iput-boolean v11, v8, Lsk4;->p0:Z

    const/4 v3, 0x5

    iput v3, v8, Lsk4;->s0:I

    .line 47
    invoke-static {v0, v2, v8}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_12

    goto/16 :goto_12

    .line 48
    :goto_d
    sget-object v0, Lkw4;->a:Lkw4;

    .line 49
    invoke-static {v6}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    move-result-object v0

    if-eqz v0, :cond_15

    .line 50
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    move-result-object v1

    if-eqz v1, :cond_15

    .line 51
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->b0()Z

    move-result v0

    .line 52
    iput-object v6, v8, Lsk4;->f0:Ljava/lang/String;

    iput-object v9, v8, Lsk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    const/4 v7, 0x0

    iput-object v7, v8, Lsk4;->h0:Ljava/lang/String;

    iput-object v7, v8, Lsk4;->i0:Ljava/lang/Boolean;

    iput-object v7, v8, Lsk4;->j0:Ljava/lang/Boolean;

    iput-object v7, v8, Lsk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v7, v8, Lsk4;->l0:Ljava/util/Iterator;

    iput-boolean v5, v8, Lsk4;->m0:Z

    iput-boolean v3, v8, Lsk4;->n0:Z

    iput-boolean v2, v8, Lsk4;->o0:Z

    iput-boolean v11, v8, Lsk4;->p0:Z

    const/4 v7, 0x6

    iput v7, v8, Lsk4;->s0:I

    invoke-virtual {v13, v1, v0, v6, v8}, Lgk7;->a(Lsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/String;Ls51;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_14

    goto/16 :goto_12

    :cond_14
    move-object v1, v9

    move-object v9, v6

    move-object v6, v1

    move v1, v11

    :goto_e
    move-object v11, v9

    move-object v9, v6

    move-object v6, v11

    move v11, v1

    :cond_15
    move v0, v2

    move-object v2, v6

    move-object v1, v9

    .line 53
    sget-object v6, Ltp1;->a:Lnf1;

    .line 54
    sget-object v6, Lye1;->Z:Lye1;

    .line 55
    new-instance v7, Lwj4;

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-direct {v7, v4, v5, v10, v9}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;ZLq51;B)V

    iput-object v2, v8, Lsk4;->f0:Ljava/lang/String;

    iput-object v1, v8, Lsk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v10, v8, Lsk4;->h0:Ljava/lang/String;

    iput-object v10, v8, Lsk4;->i0:Ljava/lang/Boolean;

    iput-object v10, v8, Lsk4;->j0:Ljava/lang/Boolean;

    iput-object v10, v8, Lsk4;->k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v10, v8, Lsk4;->l0:Ljava/util/Iterator;

    iput-boolean v5, v8, Lsk4;->m0:Z

    iput-boolean v3, v8, Lsk4;->n0:Z

    iput-boolean v0, v8, Lsk4;->o0:Z

    iput-boolean v11, v8, Lsk4;->p0:Z

    const/4 v0, 0x7

    iput v0, v8, Lsk4;->s0:I

    .line 56
    invoke-static {v6, v7, v8}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_16

    goto/16 :goto_12

    .line 57
    :cond_16
    :goto_f
    invoke-virtual {v4}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    move-result-object v0

    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->q()Lzt7;

    move-result-object v0

    invoke-virtual {v0, v2}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    move-result-object v0

    if-eqz v0, :cond_17

    .line 60
    iget-object v0, v0, Lqs7;->a:Lis7;

    if-eqz v0, :cond_17

    .line 61
    iget-boolean v0, v0, Lis7;->a:Z

    const/4 v3, 0x1

    if-ne v0, v3, :cond_17

    goto :goto_11

    .line 62
    :cond_17
    sget-object v0, Lkw4;->a:Lkw4;

    invoke-static {v2}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 63
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 64
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/MetaParams;->t0()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 65
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-lez v3, :cond_18

    move-object v15, v0

    goto :goto_10

    :cond_18
    const/4 v15, 0x0

    :goto_10
    if-eqz v15, :cond_19

    .line 66
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0, v2}, Lev7;->b(ILjava/lang/String;)V

    .line 67
    :cond_19
    :goto_11
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v0

    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    move-result-object v0

    new-instance v3, Lzw2;

    const/16 v4, 0xd

    invoke-direct {v3, v2, v1, v4}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-virtual {v0, v3}, Lkf4;->h(Lgn2;)V

    .line 68
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_1a
    move-object v12, v7

    .line 69
    invoke-virtual {v4}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v0, v10, v2}, Lsu/happ/proxyutility/feature/main/MainViewModel;->C(Lsu/happ/proxyutility/feature/main/MainViewModel;ZI)V

    .line 70
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v0

    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    move-result-object v0

    new-instance v2, Luq0;

    const/4 v3, 0x5

    invoke-direct {v2, v9, v3}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    invoke-virtual {v0, v2}, Lkf4;->h(Lgn2;)V

    .line 71
    sget-object v0, Ltp1;->a:Lnf1;

    .line 72
    sget-object v0, Ldm4;->a:Lhv2;

    .line 73
    new-instance v2, Lrk4;

    const/4 v7, 0x0

    invoke-direct {v2, v4, v5, v11, v7}, Lrk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;ZZLq51;)V

    iput-object v7, v8, Lsk4;->f0:Ljava/lang/String;

    iput-object v7, v8, Lsk4;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    iput-object v7, v8, Lsk4;->h0:Ljava/lang/String;

    iput-object v7, v8, Lsk4;->i0:Ljava/lang/Boolean;

    iput-object v7, v8, Lsk4;->j0:Ljava/lang/Boolean;

    iput-boolean v10, v8, Lsk4;->m0:Z

    iput-boolean v1, v8, Lsk4;->n0:Z

    iput-boolean v5, v8, Lsk4;->o0:Z

    iput-boolean v11, v8, Lsk4;->p0:Z

    const/16 v1, 0x8

    iput v1, v8, Lsk4;->s0:I

    .line 74
    invoke-static {v0, v2, v8}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_1b

    :goto_12
    return-object v12

    .line 75
    :cond_1b
    :goto_13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final W(Lsu/happ/proxyutility/dto/ImportResult;ZZ)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ImportResult;->c()Lx83;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v2, v0, Lv83;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v8, 0x1

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x3

    .line 17
    invoke-static {v0, v3, v1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->C(Lsu/happ/proxyutility/feature/main/MainViewModel;ZI)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    instance-of v2, v0, Lk83;

    .line 22
    .line 23
    const/4 v9, 0x2

    .line 24
    iget-object v4, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-static {v4}, Lys0;->z(Lg94;)Lu84;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget-object v3, Ltp1;->a:Lnf1;

    .line 33
    .line 34
    sget-object v3, Ldm4;->a:Lhv2;

    .line 35
    .line 36
    new-instance v4, Ljy2;

    .line 37
    .line 38
    check-cast v0, Lk83;

    .line 39
    .line 40
    const/16 v5, 0xa

    .line 41
    .line 42
    invoke-direct {v4, p0, v0, v7, v5}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3, v4, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    instance-of v2, v0, Lt83;

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-static {v4}, Lys0;->z(Lg94;)Lu84;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    sget-object v2, Ltp1;->a:Lnf1;

    .line 58
    .line 59
    sget-object v11, Ldm4;->a:Lhv2;

    .line 60
    .line 61
    move-object v2, v0

    .line 62
    new-instance v0, Lz81;

    .line 63
    .line 64
    move-object v3, v2

    .line 65
    check-cast v3, Lt83;

    .line 66
    .line 67
    const/4 v6, 0x3

    .line 68
    const/4 v5, 0x0

    .line 69
    move-object v1, p0

    .line 70
    move v4, p2

    .line 71
    move v2, p3

    .line 72
    invoke-direct/range {v0 .. v6}, Lz81;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;ZLjava/lang/Object;ZLq51;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v10, v11, v0, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ImportResult;->b()Lt83;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_3

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-static {v4}, Lys0;->z(Lg94;)Lu84;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    sget-object v0, Ltp1;->a:Lnf1;

    .line 91
    .line 92
    sget-object v10, Ldm4;->a:Lhv2;

    .line 93
    .line 94
    new-instance v0, Lz81;

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    const/4 v6, 0x4

    .line 98
    move-object v1, p0

    .line 99
    move-object v3, p1

    .line 100
    move v4, p2

    .line 101
    move v2, p3

    .line 102
    invoke-direct/range {v0 .. v6}, Lz81;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;ZLjava/lang/Object;ZLq51;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {v7, v10, v0, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 106
    .line 107
    .line 108
    move v3, v8

    .line 109
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    :goto_1
    if-eqz v7, :cond_4

    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    return v0

    .line 120
    :cond_4
    return v8
.end method

.method public final X(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 5
    .line 6
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Ltp1;->a:Lnf1;

    .line 11
    .line 12
    sget-object v1, Lye1;->Z:Lye1;

    .line 13
    .line 14
    new-instance v2, Lqk4;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, p0, p1, v3}, Lqk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lq51;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x2

    .line 21
    invoke-static {v0, v1, v2, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final Y(Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lbl4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lbl4;

    .line 7
    .line 8
    iget v1, v0, Lbl4;->h0:I

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
    iput v1, v0, Lbl4;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lbl4;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lbl4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lbl4;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lbl4;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p1, p1, Lsu/happ/proxyutility/feature/main/MainViewModel;->A:Lvz7;

    .line 53
    .line 54
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lqc4;

    .line 59
    .line 60
    invoke-virtual {p1}, Lqc4;->d()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-static {p1, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    sget-object p1, Lss8;->a:Lss8;

    .line 73
    .line 74
    const-string p1, ""

    .line 75
    .line 76
    const-string v1, "su.happ.proxyutility.action.service"

    .line 77
    .line 78
    const/16 v3, 0x2a

    .line 79
    .line 80
    invoke-static {p0, v1, v3, p1}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->u()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    sget-object p1, Lss8;->a:Lss8;

    .line 94
    .line 95
    invoke-static {p0}, Lss8;->I(Landroid/content/Context;)V

    .line 96
    .line 97
    .line 98
    :cond_4
    sget-object p1, Lgx1;->Y:Lbe;

    .line 99
    .line 100
    const-wide/16 v3, 0x3e8

    .line 101
    .line 102
    sget-object p1, Llx1;->Z:Llx1;

    .line 103
    .line 104
    invoke-static {v3, v4, p1}, Lvj8;->m0(JLlx1;)J

    .line 105
    .line 106
    .line 107
    move-result-wide v3

    .line 108
    iput v2, v0, Lbl4;->h0:I

    .line 109
    .line 110
    invoke-static {v3, v4, v0}, Lu70;->G(JLq51;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    sget-object v0, Lc71;->X:Lc71;

    .line 115
    .line 116
    if-ne p1, v0, :cond_5

    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->i0()V

    .line 120
    .line 121
    .line 122
    sget-object p0, Ldn8;->a:Ldn8;

    .line 123
    .line 124
    return-object p0
.end method

.method public final Z()V
    .locals 4

    .line 1
    sget-object v0, Lwu7;->y1:Lcom/google/gson/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget v0, Le46;->fragment_container_view:I

    .line 8
    .line 9
    new-instance v1, Lwu7;

    .line 10
    .line 11
    invoke-direct {v1}, Lwu7;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lsn1;->V()V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lr00;

    .line 18
    .line 19
    invoke-direct {v2, p0}, Lr00;-><init>(Lml2;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    iput-boolean p0, v2, Lr00;->o:Z

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x2

    .line 28
    const-string v3, "DialogSubscriptionSync"

    .line 29
    .line 30
    invoke-virtual {v2, v0, v1, v3, p0}, Lr00;->g(ILqk2;Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Lr00;->e()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const-string p0, "Must use non-zero containerViewId"

    .line 38
    .line 39
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final a0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lb6;->z0:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lsu/happ/proxyutility/ui/BaseActivity;->setBarsParams(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "binding"

    .line 12
    .line 13
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public final b0(Z)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->x:Lh76;

    .line 6
    .line 7
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 8
    .line 9
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lxm4;

    .line 14
    .line 15
    iget-boolean v0, v0, Lxm4;->q:Z

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move p1, v1

    .line 27
    :goto_1
    iget-object v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    const-string v4, "binding"

    .line 31
    .line 32
    if-eqz v0, :cond_7

    .line 33
    .line 34
    iget-object v0, v0, Lb6;->i0:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedImageButton;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v5, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 41
    .line 42
    if-eqz v5, :cond_6

    .line 43
    .line 44
    iget-object v5, v5, Lb6;->i0:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedImageButton;

    .line 45
    .line 46
    invoke-virtual {v5}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-nez v5, :cond_2

    .line 51
    .line 52
    new-instance v5, Landroid/graphics/drawable/ColorDrawable;

    .line 53
    .line 54
    invoke-direct {v5, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 55
    .line 56
    .line 57
    :cond_2
    if-eqz p1, :cond_3

    .line 58
    .line 59
    sget p1, Lv26;->icBtnPowerOn:I

    .line 60
    .line 61
    new-instance v2, Landroid/util/TypedValue;

    .line 62
    .line 63
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v6, p1, v2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 71
    .line 72
    .line 73
    iget p1, v2, Landroid/util/TypedValue;->resourceId:I

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    sget p1, Lv26;->icBtnPowerOff:I

    .line 77
    .line 78
    new-instance v2, Landroid/util/TypedValue;

    .line 79
    .line 80
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v6, p1, v2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 88
    .line 89
    .line 90
    iget p1, v2, Landroid/util/TypedValue;->resourceId:I

    .line 91
    .line 92
    :goto_2
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    new-instance v0, Landroid/graphics/drawable/TransitionDrawable;

    .line 99
    .line 100
    filled-new-array {v5, p1}, [Landroid/graphics/drawable/Drawable;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {v0, p1}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 105
    .line 106
    .line 107
    iget-object p0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 108
    .line 109
    if-eqz p0, :cond_4

    .line 110
    .line 111
    iget-object p0, p0, Lb6;->i0:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedImageButton;

    .line 112
    .line 113
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    .line 117
    .line 118
    .line 119
    const/16 p0, 0xc8

    .line 120
    .line 121
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_4
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v3

    .line 129
    :cond_5
    const-string p0, "Required value was null."

    .line 130
    .line 131
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_6
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v3

    .line 139
    :cond_7
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v3
.end method

.method public final c0(Z)V
    .locals 4

    .line 1
    const v0, 0x10a0001

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/high16 v1, 0x10a0000

    .line 9
    .line 10
    invoke-static {p0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-wide/16 v2, 0x64

    .line 15
    .line 16
    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lcl4;

    .line 23
    .line 24
    invoke-direct {v2, p0, p1, v1}, Lcl4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;ZLandroid/view/animation/Animation;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    iget-object p0, p0, Lb6;->i0:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedImageButton;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const-string p0, "binding"

    .line 41
    .line 42
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0
.end method

.method public final d0(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, v0, Lb6;->L0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, v0, Lb6;->o0:Landroidx/appcompat/widget/AppCompatButton;

    .line 11
    .line 12
    :goto_0
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->C()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_2
    const-string p0, "binding"

    .line 22
    .line 23
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    throw p0
.end method

.method public final e0(Ljava/lang/String;Z)V
    .locals 9

    .line 1
    sget v0, Lzx2;->B:I

    .line 2
    .line 3
    iget-object v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, Lb6;->B0:Lsu/happ/proxyutility/ui/foundation/component/HappSnackbarHost;

    .line 9
    .line 10
    invoke-virtual {v0}, Lsu/happ/proxyutility/ui/foundation/component/HappSnackbarHost;->getHost()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {p0, v0}, Lpu;->i(Lsu/happ/proxyutility/ui/BaseActivity;F)I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    new-instance v0, Lay2;

    .line 20
    .line 21
    sget v2, Ly46;->main_checkout_faq:I

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget v4, Lq36;->ic_faq:I

    .line 31
    .line 32
    invoke-static {p0, v4}, Lu70;->O(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    new-instance v5, Lmj4;

    .line 37
    .line 38
    const/4 v6, 0x3

    .line 39
    invoke-direct {v5, p0, v6}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v2, v4, v5}, Lay2;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ldn2;)V

    .line 43
    .line 44
    .line 45
    if-eqz p2, :cond_0

    .line 46
    .line 47
    new-instance v1, Lay2;

    .line 48
    .line 49
    sget p2, Ly46;->main_show_clipboard:I

    .line 50
    .line 51
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget v2, Lq36;->ic_clipboard:I

    .line 59
    .line 60
    invoke-static {p0, v2}, Lu70;->O(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    new-instance v4, Lmj4;

    .line 65
    .line 66
    const/4 v5, 0x4

    .line 67
    invoke-direct {v4, p0, v5}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, p2, v2, v4}, Lay2;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ldn2;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    filled-new-array {v0, v1}, [Lay2;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {p2}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    const/16 v8, 0x40

    .line 82
    .line 83
    sget-object v5, Lmy2;->Y:Lmy2;

    .line 84
    .line 85
    move-object v2, p0

    .line 86
    move-object v4, p1

    .line 87
    invoke-static/range {v2 .. v8}, Lk42;->g(Lsu/happ/proxyutility/ui/BaseActivity;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Ljava/lang/String;Lmy2;Ljava/lang/Iterable;II)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_1
    const-string p0, "binding"

    .line 92
    .line 93
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v1
.end method

.method public final f0(Ljava/util/List;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget v0, Le46;->fragment_container_view:I

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v1, Lok7;

    .line 11
    .line 12
    invoke-direct {v1}, Lok7;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lsn1;->V()V

    .line 16
    .line 17
    .line 18
    new-instance v2, Landroid/os/Bundle;

    .line 19
    .line 20
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    new-array v3, v3, [Lld6;

    .line 25
    .line 26
    invoke-interface {p1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, [Landroid/os/Parcelable;

    .line 31
    .line 32
    const-string v3, "stories"

    .line 33
    .line 34
    invoke-virtual {v2, v3, p1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 35
    .line 36
    .line 37
    const-string p1, "is_force"

    .line 38
    .line 39
    invoke-virtual {v2, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lqk2;->Q(Landroid/os/Bundle;)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lr00;

    .line 46
    .line 47
    invoke-direct {p1, p0}, Lr00;-><init>(Lml2;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    iput-boolean p0, p1, Lr00;->o:Z

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    const/4 p0, 0x2

    .line 56
    const-string p2, "StoriesDialogFragment"

    .line 57
    .line 58
    invoke-virtual {p1, v0, v1, p2, p0}, Lr00;->g(ILqk2;Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lr00;->e()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_0
    const-string p0, "Must use non-zero containerViewId"

    .line 66
    .line 67
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final g0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "binding"

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    iget-object v3, v0, Lb6;->L0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v3, v0, Lb6;->o0:Landroidx/appcompat/widget/AppCompatButton;

    .line 14
    .line 15
    :goto_0
    if-eqz v3, :cond_1

    .line 16
    .line 17
    sget v0, Ly46;->connection_test_testing:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-object v0, v0, Lb6;->l0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-static {v0, v3}, Lrp7;->e(Landroid/view/View;Z)V

    .line 34
    .line 35
    .line 36
    sget v4, Ly46;->connection_test_testing:I

    .line 37
    .line 38
    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v0, v0, Lb6;->k0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-static {v0, v1}, Lrp7;->e(Landroid/view/View;Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v3}, Lsu/happ/proxyutility/feature/main/MainActivity;->b0(Z)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-static {v2}, Ldh3;->T(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_3
    invoke-static {v2}, Ldh3;->T(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v1

    .line 67
    :cond_4
    invoke-static {v2}, Ldh3;->T(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v1
.end method

.method public final h0(Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lwl4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lwl4;

    .line 7
    .line 8
    iget v1, v0, Lwl4;->i0:I

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
    iput v1, v0, Lwl4;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwl4;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lwl4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lwl4;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lwl4;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lwl4;->f0:Lq15;

    .line 36
    .line 37
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->q1:Lq15;

    .line 51
    .line 52
    iput-object p1, v0, Lwl4;->f0:Lq15;

    .line 53
    .line 54
    iput v2, v0, Lwl4;->i0:I

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lq15;->g(Lq51;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sget-object v1, Lc71;->X:Lc71;

    .line 61
    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->G()Lsu/happ/proxyutility/dto/ServerConfig;

    .line 71
    .line 72
    .line 73
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    sget-object v1, Ldn8;->a:Ldn8;

    .line 75
    .line 76
    if-nez p1, :cond_4

    .line 77
    .line 78
    invoke-interface {v0, v3}, Lo15;->m(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    :cond_4
    :try_start_1
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->H()Lcom/tencent/mmkv/MMKV;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const-string v2, "pref_mode"

    .line 87
    .line 88
    invoke-virtual {p1, v2}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    const-string v2, "VPN"

    .line 93
    .line 94
    if-nez p1, :cond_5

    .line 95
    .line 96
    move-object p1, v2

    .line 97
    :cond_5
    :try_start_2
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_7

    .line 102
    .line 103
    invoke-static {p0}, Landroid/net/VpnService;->prepare(Landroid/content/Context;)Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-nez p1, :cond_6

    .line 108
    .line 109
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->i0()V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    goto :goto_3

    .line 115
    :cond_6
    iget-object p0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->Y0:Lr6;

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Lr6;->h0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->i0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    .line 123
    .line 124
    :goto_2
    invoke-interface {v0, v3}, Lo15;->m(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    return-object v1

    .line 128
    :goto_3
    invoke-interface {v0, v3}, Lo15;->m(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    throw p0
.end method

.method public final i0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->A:Lvz7;

    .line 6
    .line 7
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lqc4;

    .line 12
    .line 13
    invoke-virtual {v0}, Lqc4;->d()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Lss8;->a:Lss8;

    .line 26
    .line 27
    const-string v0, ""

    .line 28
    .line 29
    const-string v1, "su.happ.proxyutility.action.service"

    .line 30
    .line 31
    const/16 v2, 0x2a

    .line 32
    .line 33
    invoke-static {p0, v1, v2, v0}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->U0:Lvz7;

    .line 37
    .line 38
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lcom/tencent/mmkv/MMKV;

    .line 43
    .line 44
    const-string v2, "SELECTED_SERVER"

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_8

    .line 51
    .line 52
    new-instance v3, Lsu/happ/proxyutility/domain/sub/GuId;

    .line 53
    .line 54
    invoke-direct {v3, v1}, Lsu/happ/proxyutility/domain/sub/GuId;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/sub/GuId;->b()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const/4 v4, 0x0

    .line 66
    if-nez v1, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move-object v3, v4

    .line 70
    :goto_0
    if-eqz v3, :cond_2

    .line 71
    .line 72
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/sub/GuId;->b()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    move-object v1, v4

    .line 78
    :goto_1
    if-eqz v1, :cond_8

    .line 79
    .line 80
    sget-object v3, Lkw4;->a:Lkw4;

    .line 81
    .line 82
    invoke-static {v1}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const/4 v3, 0x0

    .line 87
    if-eqz v1, :cond_6

    .line 88
    .line 89
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerConfig;->i()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    new-instance v5, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 94
    .line 95
    invoke-direct {v5, v1}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_3

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    move-object v5, v4

    .line 110
    :goto_2
    if-eqz v5, :cond_4

    .line 111
    .line 112
    invoke-virtual {v5}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    goto :goto_3

    .line 117
    :cond_4
    move-object v1, v4

    .line 118
    :goto_3
    if-eqz v1, :cond_6

    .line 119
    .line 120
    invoke-static {v1}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    goto :goto_4

    .line 131
    :cond_5
    move-object v1, v4

    .line 132
    :goto_4
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-static {v1, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    goto :goto_5

    .line 139
    :cond_6
    move v1, v3

    .line 140
    :goto_5
    if-eqz v1, :cond_7

    .line 141
    .line 142
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 147
    .line 148
    invoke-virtual {p0, v2}, Lcom/tencent/mmkv/MMKV;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_7
    const/4 v0, 0x1

    .line 153
    iput-boolean v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->v1:Z

    .line 154
    .line 155
    iget-object v0, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 156
    .line 157
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget-object v1, Ltp1;->a:Lnf1;

    .line 162
    .line 163
    sget-object v1, Ldm4;->a:Lhv2;

    .line 164
    .line 165
    new-instance v2, Lpl4;

    .line 166
    .line 167
    const/4 v5, 0x5

    .line 168
    invoke-direct {v2, p0, v4, v5}, Lpl4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 169
    .line 170
    .line 171
    const/4 v4, 0x2

    .line 172
    invoke-static {v0, v1, v2, v4}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 173
    .line 174
    .line 175
    sget-object v0, Ln69;->a:Llibxray/XRayPoint;

    .line 176
    .line 177
    invoke-static {p0, v3}, Ln69;->b(Landroid/content/Context;Z)V

    .line 178
    .line 179
    .line 180
    :cond_8
    return-void
.end method

.method public final j0()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->v1:Z

    .line 3
    .line 4
    iget-object v1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->w1:Landroid/animation/ValueAnimator;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v1, Ljava/lang/Float;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->w1:Landroid/animation/ValueAnimator;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->getCurrentPlayTime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    iget-object v4, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->w1:Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->cancel()V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    new-array v4, v4, [F

    .line 32
    .line 33
    aput v1, v4, v0

    .line 34
    .line 35
    const/high16 v1, 0x43b40000    # 360.0f

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    aput v1, v4, v5

    .line 39
    .line 40
    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->w1:Landroid/animation/ValueAnimator;

    .line 45
    .line 46
    const-wide/16 v4, 0x3e8

    .line 47
    .line 48
    sub-long/2addr v4, v2

    .line 49
    const-wide/16 v2, 0x0

    .line 50
    .line 51
    cmp-long v2, v4, v2

    .line 52
    .line 53
    if-lez v2, :cond_0

    .line 54
    .line 55
    invoke-virtual {v1, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->w1:Landroid/animation/ValueAnimator;

    .line 59
    .line 60
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    .line 61
    .line 62
    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->w1:Landroid/animation/ValueAnimator;

    .line 69
    .line 70
    new-instance v2, Lsj4;

    .line 71
    .line 72
    invoke-direct {v2, p0, v0}, Lsj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 76
    .line 77
    .line 78
    iget-object p0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->w1:Landroid/animation/ValueAnimator;

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 81
    .line 82
    .line 83
    :cond_0
    return-void
.end method

.method public final k0(Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lxl4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lxl4;

    .line 7
    .line 8
    iget v1, v0, Lxl4;->i0:I

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
    iput v1, v0, Lxl4;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxl4;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lxl4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lxl4;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lxl4;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lxl4;->f0:Lq15;

    .line 36
    .line 37
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->q1:Lq15;

    .line 51
    .line 52
    iput-object p1, v0, Lxl4;->f0:Lq15;

    .line 53
    .line 54
    iput v2, v0, Lxl4;->i0:I

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lq15;->g(Lq51;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sget-object v1, Lc71;->X:Lc71;

    .line 61
    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    sget-object p1, Lss8;->a:Lss8;

    .line 67
    .line 68
    invoke-static {p0}, Lss8;->I(Landroid/content/Context;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object p1, p1, Lsu/happ/proxyutility/feature/main/MainViewModel;->H:Lh76;

    .line 76
    .line 77
    iget-object p1, p1, Lh76;->X:Loh7;

    .line 78
    .line 79
    invoke-virtual {p1}, Loh7;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Ljava/util/List;

    .line 84
    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-ne p1, v2, :cond_4

    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->b0(Z)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    goto :goto_3

    .line 100
    :cond_4
    :goto_2
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    invoke-interface {v0, v3}, Lo15;->m(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-object p0

    .line 106
    :goto_3
    invoke-interface {v0, v3}, Lo15;->m(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    throw p0
.end method

.method public final l0(Luy7;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->K()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->u()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget-object v1, Lc71;->X:Lc71;

    .line 17
    .line 18
    sget-object v2, Ldn8;->a:Ldn8;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->k0(Ls51;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-ne p0, v1, :cond_2

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    sget-object v0, Lkw4;->a:Lkw4;

    .line 30
    .line 31
    invoke-static {}, Lkw4;->n()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    sget p1, Lt46;->dialog_alert_warning:I

    .line 38
    .line 39
    sget v0, Ly46;->main_error_no_subscriptions_title:I

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    sget v0, Ly46;->main_error_no_subscriptions_description:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const v0, 0x104000a

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    new-instance v9, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-direct {v9, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 61
    .line 62
    .line 63
    const/4 v11, 0x0

    .line 64
    const/16 v12, 0x752

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v10, 0x0

    .line 69
    move-object v3, p0

    .line 70
    invoke-static/range {v3 .. v12}, Lbe;->m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V

    .line 71
    .line 72
    .line 73
    return-object v2

    .line 74
    :cond_1
    move-object v3, p0

    .line 75
    invoke-virtual {v3, p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->h0(Ls51;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-ne p0, v1, :cond_2

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_2
    return-object v2
.end method

.method public final m0(Ljava/util/ArrayList;IILs51;)Ljava/lang/Object;
    .locals 15

    .line 1
    invoke-virtual/range {p1 .. p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lqg5;

    .line 6
    .line 7
    iget-object v1, v0, Lqg5;->X:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 10
    .line 11
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, v0

    .line 18
    check-cast v4, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    sget-object v0, Lko1;->B1:Lm51;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Ljo1;->X:Ljo1;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-static {v0, v1, v2}, Lkm4;->l0(Lml2;Ljo1;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 35
    .line 36
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Luq0;

    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    invoke-direct {v1, v4, v2}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lkf4;->h(Lgn2;)V

    .line 51
    .line 52
    .line 53
    new-instance v12, Lnv0;

    .line 54
    .line 55
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    move/from16 v0, p2

    .line 59
    .line 60
    iput v0, v12, Lnv0;->X:I

    .line 61
    .line 62
    move/from16 v0, p3

    .line 63
    .line 64
    iput v0, v12, Lnv0;->Y:I

    .line 65
    .line 66
    iput-object p0, v12, Lnv0;->Z:Ljava/lang/Object;

    .line 67
    .line 68
    move-object/from16 v0, p1

    .line 69
    .line 70
    iput-object v0, v12, Lnv0;->f0:Ljava/lang/Object;

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    const/16 v14, 0x130

    .line 74
    .line 75
    const/4 v5, 0x1

    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v7, 0x0

    .line 78
    const/4 v8, 0x0

    .line 79
    const/4 v9, 0x1

    .line 80
    const/4 v10, 0x0

    .line 81
    move-object v2, p0

    .line 82
    move-object/from16 v13, p4

    .line 83
    .line 84
    invoke-static/range {v2 .. v14}, Lsu/happ/proxyutility/feature/main/MainActivity;->P(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZZLjava/lang/String;ZZLjava/lang/Boolean;Lg83;Ls51;I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    sget-object v0, Lc71;->X:Lc71;

    .line 89
    .line 90
    if-ne p0, v0, :cond_0

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 94
    .line 95
    return-object p0
.end method

.method public final n0()V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->r1:Lvz7;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    check-cast v3, Landroid/net/ConnectivityManager;

    .line 11
    .line 12
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v3, 0x1

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-ne v4, v3, :cond_0

    .line 34
    .line 35
    sget-object v0, La45;->X:La45;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    if-eqz v0, :cond_1

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-virtual {v0, v4}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-ne v0, v3, :cond_1

    .line 48
    .line 49
    sget-object v0, La45;->Y:La45;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move-object v0, v2

    .line 53
    goto :goto_1

    .line 54
    :goto_0
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 55
    .line 56
    if-nez v3, :cond_5

    .line 57
    .line 58
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 59
    .line 60
    if-nez v3, :cond_5

    .line 61
    .line 62
    new-instance v3, Lrj6;

    .line 63
    .line 64
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    move-object v0, v3

    .line 68
    :goto_1
    nop

    .line 69
    instance-of v3, v0, Lrj6;

    .line 70
    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move-object v2, v0

    .line 75
    :goto_2
    move-object v12, v2

    .line 76
    check-cast v12, La45;

    .line 77
    .line 78
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainViewModel;->x:Lh76;

    .line 83
    .line 84
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 85
    .line 86
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lxm4;

    .line 91
    .line 92
    iget-object v0, v0, Lxm4;->h:La45;

    .line 93
    .line 94
    if-ne v0, v12, :cond_3

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    iget-object v2, v1, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 98
    .line 99
    :cond_4
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    move-object v3, v0

    .line 104
    check-cast v3, Lxm4;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    const/16 v20, 0x0

    .line 110
    .line 111
    const v21, 0xff7f

    .line 112
    .line 113
    .line 114
    const/4 v4, 0x0

    .line 115
    const-wide/16 v5, 0x0

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v9, 0x0

    .line 120
    const/4 v10, 0x0

    .line 121
    const/4 v11, 0x0

    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    const/16 v18, 0x0

    .line 130
    .line 131
    const/16 v19, 0x0

    .line 132
    .line 133
    invoke-static/range {v3 .. v21}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v2, v0, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_4

    .line 142
    .line 143
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->s()V

    .line 144
    .line 145
    .line 146
    :goto_3
    return-void

    .line 147
    :cond_5
    throw v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 44

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Lsu/happ/proxyutility/ui/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    sput-boolean v2, Lsu/happ/proxyutility/HappApplication;->P0:Z

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget v3, Lt46;->activity_main:I

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-virtual {v0, v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget v3, Le46;->bg_jobs:I

    .line 22
    .line 23
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    check-cast v6, Lcom/tistory/zladnrms/roundablelayout/RoundableLayout;

    .line 28
    .line 29
    if-eqz v6, :cond_2a

    .line 30
    .line 31
    sget v3, Le46;->btn_ai_helper:I

    .line 32
    .line 33
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    move-object v9, v6

    .line 38
    check-cast v9, Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedTextButton;

    .line 39
    .line 40
    if-eqz v9, :cond_2a

    .line 41
    .line 42
    sget v3, Le46;->btn_clipboard:I

    .line 43
    .line 44
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    move-object v10, v3

    .line 49
    check-cast v10, Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedTextButton;

    .line 50
    .line 51
    sget v3, Le46;->btn_invalid_time:I

    .line 52
    .line 53
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    move-object v11, v6

    .line 58
    check-cast v11, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 59
    .line 60
    if-eqz v11, :cond_2a

    .line 61
    .line 62
    sget v3, Le46;->btn_jobs:I

    .line 63
    .line 64
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    move-object v12, v6

    .line 69
    check-cast v12, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 70
    .line 71
    if-eqz v12, :cond_2a

    .line 72
    .line 73
    sget v3, Le46;->btn_notification_disabled:I

    .line 74
    .line 75
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    move-object v13, v6

    .line 80
    check-cast v13, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 81
    .line 82
    if-eqz v13, :cond_2a

    .line 83
    .line 84
    sget v3, Le46;->btn_power:I

    .line 85
    .line 86
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    move-object v14, v6

    .line 91
    check-cast v14, Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedImageButton;

    .line 92
    .line 93
    if-eqz v14, :cond_2a

    .line 94
    .line 95
    sget v3, Le46;->btn_power_circle:I

    .line 96
    .line 97
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    move-object v15, v6

    .line 102
    check-cast v15, Landroidx/appcompat/widget/AppCompatImageView;

    .line 103
    .line 104
    if-eqz v15, :cond_2a

    .line 105
    .line 106
    sget v3, Le46;->btn_power_connected_time:I

    .line 107
    .line 108
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    move-object/from16 v16, v6

    .line 113
    .line 114
    check-cast v16, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 115
    .line 116
    if-eqz v16, :cond_2a

    .line 117
    .line 118
    sget v3, Le46;->btn_power_disconnect:I

    .line 119
    .line 120
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    move-object/from16 v17, v6

    .line 125
    .line 126
    check-cast v17, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 127
    .line 128
    if-eqz v17, :cond_2a

    .line 129
    .line 130
    sget v3, Le46;->btn_qr_code:I

    .line 131
    .line 132
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    move-object/from16 v18, v3

    .line 137
    .line 138
    check-cast v18, Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedTextButton;

    .line 139
    .line 140
    sget v3, Le46;->btn_stories:I

    .line 141
    .line 142
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    move-object/from16 v19, v6

    .line 147
    .line 148
    check-cast v19, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 149
    .line 150
    if-eqz v19, :cond_2a

    .line 151
    .line 152
    sget v3, Le46;->btn_test_ping:I

    .line 153
    .line 154
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    move-object/from16 v20, v3

    .line 159
    .line 160
    check-cast v20, Landroidx/appcompat/widget/AppCompatButton;

    .line 161
    .line 162
    sget v3, Le46;->composeView:I

    .line 163
    .line 164
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    move-object/from16 v21, v6

    .line 169
    .line 170
    check-cast v21, Landroidx/compose/ui/platform/ComposeView;

    .line 171
    .line 172
    if-eqz v21, :cond_2a

    .line 173
    .line 174
    sget v3, Le46;->fl_geo_progress:I

    .line 175
    .line 176
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    check-cast v6, Landroid/widget/FrameLayout;

    .line 181
    .line 182
    if-eqz v6, :cond_2a

    .line 183
    .line 184
    sget v3, Le46;->fragment_container_view:I

    .line 185
    .line 186
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    check-cast v6, Landroidx/fragment/app/FragmentContainerView;

    .line 191
    .line 192
    if-eqz v6, :cond_2a

    .line 193
    .line 194
    sget v3, Le46;->geo_progress:I

    .line 195
    .line 196
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    move-object/from16 v22, v6

    .line 201
    .line 202
    check-cast v22, Landroidx/cardview/widget/CardView;

    .line 203
    .line 204
    if-eqz v22, :cond_2a

    .line 205
    .line 206
    sget v3, Le46;->guideline_power_height_max:I

    .line 207
    .line 208
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    check-cast v3, Landroidx/constraintlayout/widget/Guideline;

    .line 213
    .line 214
    sget v3, Le46;->guideline_test_hide_buttons_divisor:I

    .line 215
    .line 216
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    check-cast v3, Landroidx/constraintlayout/widget/Guideline;

    .line 221
    .line 222
    sget v3, Le46;->iv_current_server_flag:I

    .line 223
    .line 224
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    move-object/from16 v23, v3

    .line 229
    .line 230
    check-cast v23, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 231
    .line 232
    sget v3, Le46;->iv_geo_file_progress:I

    .line 233
    .line 234
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    move-object/from16 v24, v6

    .line 239
    .line 240
    check-cast v24, Landroidx/appcompat/widget/AppCompatImageView;

    .line 241
    .line 242
    if-eqz v24, :cond_2a

    .line 243
    .line 244
    sget v3, Le46;->layout_hide_all:I

    .line 245
    .line 246
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    move-object/from16 v25, v3

    .line 251
    .line 252
    check-cast v25, Landroid/widget/RelativeLayout;

    .line 253
    .line 254
    sget v3, Le46;->layout_main:I

    .line 255
    .line 256
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    move-object/from16 v26, v6

    .line 261
    .line 262
    check-cast v26, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 263
    .line 264
    if-eqz v26, :cond_2a

    .line 265
    .line 266
    sget v3, Le46;->layout_no_configs:I

    .line 267
    .line 268
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    move-object/from16 v27, v3

    .line 273
    .line 274
    check-cast v27, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 275
    .line 276
    sget v3, Le46;->layout_test_current_config:I

    .line 277
    .line 278
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    move-object/from16 v28, v3

    .line 283
    .line 284
    check-cast v28, Landroid/widget/RelativeLayout;

    .line 285
    .line 286
    sget v3, Le46;->ll_current_server:I

    .line 287
    .line 288
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    move-object/from16 v29, v3

    .line 293
    .line 294
    check-cast v29, Landroid/widget/LinearLayout;

    .line 295
    .line 296
    sget v3, Le46;->ll_hwid:I

    .line 297
    .line 298
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    move-object/from16 v30, v6

    .line 303
    .line 304
    check-cast v30, Landroid/widget/LinearLayout;

    .line 305
    .line 306
    if-eqz v30, :cond_2a

    .line 307
    .line 308
    sget v3, Le46;->ll_jobs:I

    .line 309
    .line 310
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    check-cast v6, Landroid/widget/LinearLayout;

    .line 315
    .line 316
    if-eqz v6, :cond_2a

    .line 317
    .line 318
    sget v3, Le46;->rl_config_groups:I

    .line 319
    .line 320
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    check-cast v3, Landroid/widget/RelativeLayout;

    .line 325
    .line 326
    sget v3, Le46;->root_layout:I

    .line 327
    .line 328
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    move-object/from16 v31, v6

    .line 333
    .line 334
    check-cast v31, Landroid/widget/LinearLayout;

    .line 335
    .line 336
    if-eqz v31, :cond_2a

    .line 337
    .line 338
    sget v3, Le46;->rv_config_groups:I

    .line 339
    .line 340
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 341
    .line 342
    .line 343
    move-result-object v32

    .line 344
    if-eqz v32, :cond_2a

    .line 345
    .line 346
    sget v3, Le46;->snackbar_host_root:I

    .line 347
    .line 348
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    move-object/from16 v33, v6

    .line 353
    .line 354
    check-cast v33, Lsu/happ/proxyutility/ui/foundation/component/HappSnackbarHost;

    .line 355
    .line 356
    if-eqz v33, :cond_2a

    .line 357
    .line 358
    sget v3, Le46;->toolbar:I

    .line 359
    .line 360
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 365
    .line 366
    if-eqz v6, :cond_2a

    .line 367
    .line 368
    sget v3, Le46;->toolbar_left_side:I

    .line 369
    .line 370
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 375
    .line 376
    if-eqz v6, :cond_2a

    .line 377
    .line 378
    sget v3, Le46;->toolbar_main_add:I

    .line 379
    .line 380
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    move-object/from16 v34, v6

    .line 385
    .line 386
    check-cast v34, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 387
    .line 388
    if-eqz v34, :cond_2a

    .line 389
    .line 390
    sget v3, Le46;->toolbar_main_dev_mode:I

    .line 391
    .line 392
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    move-object/from16 v35, v6

    .line 397
    .line 398
    check-cast v35, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 399
    .line 400
    if-eqz v35, :cond_2a

    .line 401
    .line 402
    sget v3, Le46;->toolbar_main_settings:I

    .line 403
    .line 404
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    move-object/from16 v36, v6

    .line 409
    .line 410
    check-cast v36, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 411
    .line 412
    if-eqz v36, :cond_2a

    .line 413
    .line 414
    sget v3, Le46;->tv_current_server_title:I

    .line 415
    .line 416
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    move-object/from16 v37, v3

    .line 421
    .line 422
    check-cast v37, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 423
    .line 424
    sget v3, Le46;->tv_geo_progress_description:I

    .line 425
    .line 426
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 427
    .line 428
    .line 429
    move-result-object v6

    .line 430
    move-object/from16 v38, v6

    .line 431
    .line 432
    check-cast v38, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 433
    .line 434
    if-eqz v38, :cond_2a

    .line 435
    .line 436
    sget v3, Le46;->tv_geo_progress_title:I

    .line 437
    .line 438
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    move-object/from16 v39, v6

    .line 443
    .line 444
    check-cast v39, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 445
    .line 446
    if-eqz v39, :cond_2a

    .line 447
    .line 448
    sget v3, Le46;->tv_hide_all:I

    .line 449
    .line 450
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    move-object/from16 v40, v3

    .line 455
    .line 456
    check-cast v40, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 457
    .line 458
    sget v3, Le46;->tv_hint:I

    .line 459
    .line 460
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    move-object/from16 v41, v6

    .line 465
    .line 466
    check-cast v41, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 467
    .line 468
    if-eqz v41, :cond_2a

    .line 469
    .line 470
    sget v3, Le46;->tv_hwid:I

    .line 471
    .line 472
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 473
    .line 474
    .line 475
    move-result-object v6

    .line 476
    move-object/from16 v42, v6

    .line 477
    .line 478
    check-cast v42, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 479
    .line 480
    if-eqz v42, :cond_2a

    .line 481
    .line 482
    sget v3, Le46;->tv_jobs:I

    .line 483
    .line 484
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 485
    .line 486
    .line 487
    move-result-object v6

    .line 488
    check-cast v6, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 489
    .line 490
    if-eqz v6, :cond_2a

    .line 491
    .line 492
    sget v3, Le46;->tv_test_current_config:I

    .line 493
    .line 494
    invoke-static {v0, v3}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    move-object/from16 v43, v3

    .line 499
    .line 500
    check-cast v43, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 501
    .line 502
    new-instance v7, Lb6;

    .line 503
    .line 504
    move-object v8, v0

    .line 505
    check-cast v8, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 506
    .line 507
    invoke-direct/range {v7 .. v43}, Lb6;-><init>(Landroidx/drawerlayout/widget/DrawerLayout;Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedTextButton;Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedTextButton;Landroidx/appcompat/widget/AppCompatImageButton;Landroidx/appcompat/widget/AppCompatImageButton;Landroidx/appcompat/widget/AppCompatImageButton;Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedImageButton;Landroidx/appcompat/widget/AppCompatImageView;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedTextButton;Landroidx/appcompat/widget/AppCompatImageButton;Landroidx/appcompat/widget/AppCompatButton;Landroidx/compose/ui/platform/ComposeView;Landroidx/cardview/widget/CardView;Lcom/google/android/material/imageview/ShapeableImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/RelativeLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lsu/happ/proxyutility/ui/foundation/component/HappSnackbarHost;Landroidx/appcompat/widget/AppCompatImageButton;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;Landroidx/appcompat/widget/AppCompatImageButton;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;)V

    .line 508
    .line 509
    .line 510
    iput-object v7, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 511
    .line 512
    invoke-virtual {v1, v8}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 513
    .line 514
    .line 515
    iget-object v6, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->p1:Lvz7;

    .line 516
    .line 517
    invoke-virtual {v6}, Lvz7;->getValue()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    check-cast v0, Lck4;

    .line 522
    .line 523
    invoke-static {v0}, Lmb6;->g(Lg91;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->a0()V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v1, v5}, Lsu/happ/proxyutility/feature/main/MainActivity;->b0(Z)V

    .line 530
    .line 531
    .line 532
    invoke-static {}, Lcom/tencent/mmkv/MMKV;->u()V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    iget-object v3, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->d:Lvz7;

    .line 540
    .line 541
    invoke-virtual {v3}, Lvz7;->getValue()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    check-cast v3, Lcom/tencent/mmkv/MMKV;

    .line 546
    .line 547
    const-string v7, "pref_job_open"

    .line 548
    .line 549
    invoke-virtual {v3, v5, v7}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 550
    .line 551
    .line 552
    move-result v16

    .line 553
    iget-object v7, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 554
    .line 555
    :cond_0
    invoke-virtual {v7}, Loh7;->getValue()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    move-object v8, v0

    .line 560
    check-cast v8, Lxm4;

    .line 561
    .line 562
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    const/16 v25, 0x0

    .line 566
    .line 567
    const v26, 0xffbf

    .line 568
    .line 569
    .line 570
    const/4 v9, 0x0

    .line 571
    const-wide/16 v10, 0x0

    .line 572
    .line 573
    const/4 v12, 0x0

    .line 574
    const/4 v13, 0x0

    .line 575
    const/4 v14, 0x0

    .line 576
    const/4 v15, 0x0

    .line 577
    const/16 v17, 0x0

    .line 578
    .line 579
    const/16 v18, 0x0

    .line 580
    .line 581
    const/16 v19, 0x0

    .line 582
    .line 583
    const/16 v20, 0x0

    .line 584
    .line 585
    const/16 v21, 0x0

    .line 586
    .line 587
    const/16 v22, 0x0

    .line 588
    .line 589
    const/16 v23, 0x0

    .line 590
    .line 591
    const/16 v24, 0x0

    .line 592
    .line 593
    invoke-static/range {v8 .. v26}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    invoke-virtual {v7, v0, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    if-eqz v0, :cond_0

    .line 602
    .line 603
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->n()Lcom/tencent/mmkv/MMKV;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    const-string v7, "SELECTED_SERVER"

    .line 612
    .line 613
    invoke-virtual {v3, v7}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    if-eqz v3, :cond_3

    .line 618
    .line 619
    sget-object v7, Lkw4;->a:Lkw4;

    .line 620
    .line 621
    invoke-static {v3}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 622
    .line 623
    .line 624
    move-result-object v12

    .line 625
    if-nez v12, :cond_1

    .line 626
    .line 627
    goto :goto_0

    .line 628
    :cond_1
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 629
    .line 630
    :cond_2
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v3

    .line 634
    move-object v8, v3

    .line 635
    check-cast v8, Lxm4;

    .line 636
    .line 637
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    const/16 v25, 0x0

    .line 641
    .line 642
    const v26, 0xfffb

    .line 643
    .line 644
    .line 645
    const/4 v9, 0x0

    .line 646
    const-wide/16 v10, 0x0

    .line 647
    .line 648
    const/4 v13, 0x0

    .line 649
    const/4 v14, 0x0

    .line 650
    const/4 v15, 0x0

    .line 651
    const/16 v16, 0x0

    .line 652
    .line 653
    const/16 v17, 0x0

    .line 654
    .line 655
    const/16 v18, 0x0

    .line 656
    .line 657
    const/16 v19, 0x0

    .line 658
    .line 659
    const/16 v20, 0x0

    .line 660
    .line 661
    const/16 v21, 0x0

    .line 662
    .line 663
    const/16 v22, 0x0

    .line 664
    .line 665
    const/16 v23, 0x0

    .line 666
    .line 667
    const/16 v24, 0x0

    .line 668
    .line 669
    invoke-static/range {v8 .. v26}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 670
    .line 671
    .line 672
    move-result-object v7

    .line 673
    invoke-virtual {v0, v3, v7}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v3

    .line 677
    if-eqz v3, :cond_2

    .line 678
    .line 679
    :cond_3
    :goto_0
    iget-object v3, v1, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 680
    .line 681
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    sget-object v7, Ltp1;->a:Lnf1;

    .line 686
    .line 687
    sget-object v7, Ldm4;->a:Lhv2;

    .line 688
    .line 689
    new-instance v8, Lwj4;

    .line 690
    .line 691
    const/16 v9, 0x16

    .line 692
    .line 693
    invoke-direct {v8, v1, v4, v9}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 694
    .line 695
    .line 696
    const/4 v9, 0x2

    .line 697
    invoke-static {v0, v7, v8, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->J:Lvz7;

    .line 705
    .line 706
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    check-cast v0, Lyz4;

    .line 711
    .line 712
    new-instance v8, Loj4;

    .line 713
    .line 714
    invoke-direct {v8, v1, v2}, Loj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 715
    .line 716
    .line 717
    new-instance v10, Lbm4;

    .line 718
    .line 719
    invoke-direct {v10, v8, v5}, Lbm4;-><init>(Lgn2;B)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v0, v1, v10}, Lqc4;->e(Lsu/happ/proxyutility/ui/BaseActivity;Lv85;)V

    .line 723
    .line 724
    .line 725
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    new-instance v8, Lwj4;

    .line 730
    .line 731
    const/16 v10, 0x18

    .line 732
    .line 733
    invoke-direct {v8, v1, v4, v10}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 734
    .line 735
    .line 736
    const/4 v10, 0x3

    .line 737
    invoke-static {v0, v4, v8, v10}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 738
    .line 739
    .line 740
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    new-instance v8, Lwj4;

    .line 745
    .line 746
    const/16 v11, 0x1a

    .line 747
    .line 748
    invoke-direct {v8, v1, v4, v11}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 749
    .line 750
    .line 751
    invoke-static {v0, v7, v8, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 752
    .line 753
    .line 754
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    new-instance v8, Lwj4;

    .line 759
    .line 760
    const/16 v11, 0x1c

    .line 761
    .line 762
    invoke-direct {v8, v1, v4, v11}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 763
    .line 764
    .line 765
    invoke-static {v0, v7, v8, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->m()Lyz4;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    new-instance v8, Loj4;

    .line 777
    .line 778
    invoke-direct {v8, v1, v9}, Loj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 779
    .line 780
    .line 781
    new-instance v11, Lbm4;

    .line 782
    .line 783
    invoke-direct {v11, v8, v5}, Lbm4;-><init>(Lgn2;B)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v0, v1, v11}, Lqc4;->e(Lsu/happ/proxyutility/ui/BaseActivity;Lv85;)V

    .line 787
    .line 788
    .line 789
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    new-instance v8, Lpl4;

    .line 794
    .line 795
    invoke-direct {v8, v1, v4, v5}, Lpl4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 796
    .line 797
    .line 798
    invoke-static {v0, v7, v8, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 799
    .line 800
    .line 801
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    new-instance v8, Lpl4;

    .line 806
    .line 807
    invoke-direct {v8, v1, v4, v9}, Lpl4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 808
    .line 809
    .line 810
    invoke-static {v0, v7, v8, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 811
    .line 812
    .line 813
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    new-instance v8, Lpl4;

    .line 818
    .line 819
    const/4 v11, 0x4

    .line 820
    invoke-direct {v8, v1, v4, v11}, Lpl4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 821
    .line 822
    .line 823
    invoke-static {v0, v7, v8, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 824
    .line 825
    .line 826
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    new-instance v8, Lwj4;

    .line 831
    .line 832
    const/16 v12, 0x10

    .line 833
    .line 834
    invoke-direct {v8, v1, v4, v12}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 835
    .line 836
    .line 837
    invoke-static {v0, v7, v8, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 838
    .line 839
    .line 840
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    new-instance v8, Lwj4;

    .line 845
    .line 846
    const/16 v12, 0x12

    .line 847
    .line 848
    invoke-direct {v8, v1, v4, v12}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 849
    .line 850
    .line 851
    invoke-static {v0, v7, v8, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 852
    .line 853
    .line 854
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    new-instance v8, Lwj4;

    .line 859
    .line 860
    const/16 v12, 0x15

    .line 861
    .line 862
    invoke-direct {v8, v1, v4, v12}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 863
    .line 864
    .line 865
    invoke-static {v0, v7, v8, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    sget-object v8, Lrg8;->f0:Lrg8;

    .line 873
    .line 874
    invoke-virtual {v0, v8}, Lsu/happ/proxyutility/feature/main/MainViewModel;->X(Lrg8;)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->m()Lyz4;

    .line 878
    .line 879
    .line 880
    move-result-object v8

    .line 881
    sget-object v12, Lom4;->f0:Lom4;

    .line 882
    .line 883
    invoke-virtual {v8, v12}, Lqc4;->j(Ljava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    iget-object v8, v0, Lfi;->b:Landroid/app/Application;

    .line 887
    .line 888
    iget-object v12, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->M:Lsu/happ/proxyutility/feature/main/MainViewModel$mMsgReceiver$1;

    .line 889
    .line 890
    new-instance v13, Landroid/content/IntentFilter;

    .line 891
    .line 892
    const-string v14, "su.happ.proxyutility.action.activity"

    .line 893
    .line 894
    invoke-direct {v13, v14}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 898
    .line 899
    .line 900
    move-result-object v14

    .line 901
    invoke-static {v8, v12, v13, v14}, Lue3;->I(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/Integer;)Landroid/content/Intent;

    .line 902
    .line 903
    .line 904
    const-string v12, "su.happ.proxyutility.action.service"

    .line 905
    .line 906
    const-string v13, ""

    .line 907
    .line 908
    invoke-static {v8, v12, v2, v13}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 909
    .line 910
    .line 911
    const/16 v14, 0xd

    .line 912
    .line 913
    invoke-static {v8, v12, v14, v13}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 914
    .line 915
    .line 916
    sget-object v8, Lsu/happ/proxyutility/HappApplication;->O0:Ljava/lang/String;

    .line 917
    .line 918
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    invoke-virtual {v0, v8}, Lsu/happ/proxyutility/feature/main/MainViewModel;->p(Ljava/lang/String;)Lqg5;

    .line 922
    .line 923
    .line 924
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 929
    .line 930
    .line 931
    move-result-object v8

    .line 932
    new-instance v12, Loo4;

    .line 933
    .line 934
    invoke-direct {v12, v0, v4}, Loo4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;)V

    .line 935
    .line 936
    .line 937
    invoke-static {v8, v7, v12, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 938
    .line 939
    .line 940
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    new-instance v7, Lnk4;

    .line 945
    .line 946
    invoke-direct {v7, v1, v4, v10}, Lnk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 947
    .line 948
    .line 949
    invoke-static {v0, v4, v7, v10}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    iget-object v7, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->o1:Lq02;

    .line 957
    .line 958
    iput-object v7, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->v:Lq02;

    .line 959
    .line 960
    :try_start_0
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->r1:Lvz7;

    .line 961
    .line 962
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 967
    .line 968
    iget-object v7, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->s1:Lvz7;

    .line 969
    .line 970
    invoke-virtual {v7}, Lvz7;->getValue()Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v7

    .line 974
    check-cast v7, Landroid/net/NetworkRequest;

    .line 975
    .line 976
    iget-object v8, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->t1:Lvz7;

    .line 977
    .line 978
    invoke-virtual {v8}, Lvz7;->getValue()Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v8

    .line 982
    check-cast v8, Lyj4;

    .line 983
    .line 984
    invoke-virtual {v0, v7, v8}, Landroid/net/ConnectivityManager;->requestNetwork(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 985
    .line 986
    .line 987
    goto :goto_1

    .line 988
    :catchall_0
    move-exception v0

    .line 989
    instance-of v7, v0, Ljava/lang/InterruptedException;

    .line 990
    .line 991
    if-nez v7, :cond_29

    .line 992
    .line 993
    instance-of v7, v0, Ljava/util/concurrent/CancellationException;

    .line 994
    .line 995
    if-nez v7, :cond_29

    .line 996
    .line 997
    :goto_1
    sget-object v0, Lss8;->a:Lss8;

    .line 998
    .line 999
    invoke-static {v1}, Lss8;->L(Landroid/content/Context;)Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v7

    .line 1007
    sget-object v8, Ltp1;->a:Lnf1;

    .line 1008
    .line 1009
    sget-object v8, Lye1;->Z:Lye1;

    .line 1010
    .line 1011
    new-instance v12, Lbk4;

    .line 1012
    .line 1013
    invoke-direct {v12, v1, v0, v4, v5}, Lbk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lq51;B)V

    .line 1014
    .line 1015
    .line 1016
    invoke-static {v7, v8, v12, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 1017
    .line 1018
    .line 1019
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1020
    .line 1021
    const/16 v7, 0x21

    .line 1022
    .line 1023
    const/16 v8, 0xe

    .line 1024
    .line 1025
    if-lt v0, v7, :cond_4

    .line 1026
    .line 1027
    new-instance v0, Ly45;

    .line 1028
    .line 1029
    invoke-direct {v0, v1}, Ly45;-><init>(Lsu/happ/proxyutility/ui/BaseActivity;)V

    .line 1030
    .line 1031
    .line 1032
    const-string v7, "android.permission.POST_NOTIFICATIONS"

    .line 1033
    .line 1034
    filled-new-array {v7}, [Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v7

    .line 1038
    invoke-virtual {v0, v7}, Ly45;->L([Ljava/lang/String;)Lq85;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    new-instance v7, Loj4;

    .line 1043
    .line 1044
    invoke-direct {v7, v1, v5}, Loj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1045
    .line 1046
    .line 1047
    new-instance v12, Lo61;

    .line 1048
    .line 1049
    invoke-direct {v12, v7, v8}, Lo61;-><init>(Ljava/lang/Object;B)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v0, v12}, Lq85;->a(Lw4;)V

    .line 1053
    .line 1054
    .line 1055
    :cond_4
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1056
    .line 1057
    const-string v7, "binding"

    .line 1058
    .line 1059
    if-eqz v0, :cond_28

    .line 1060
    .line 1061
    iget-object v0, v0, Lb6;->p0:Landroidx/compose/ui/platform/ComposeView;

    .line 1062
    .line 1063
    new-instance v12, Lrj4;

    .line 1064
    .line 1065
    invoke-direct {v12, v1, v5}, Lrj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1066
    .line 1067
    .line 1068
    new-instance v13, Lzy0;

    .line 1069
    .line 1070
    const v15, -0x5ccf970a

    .line 1071
    .line 1072
    .line 1073
    invoke-direct {v13, v15, v2, v12}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v0, v13}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lrn2;)V

    .line 1077
    .line 1078
    .line 1079
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1080
    .line 1081
    if-eqz v0, :cond_27

    .line 1082
    .line 1083
    iget-object v0, v0, Lb6;->v0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1084
    .line 1085
    if-eqz v0, :cond_5

    .line 1086
    .line 1087
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1092
    .line 1093
    .line 1094
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1095
    .line 1096
    iget v12, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1097
    .line 1098
    invoke-virtual {v1}, Lsu/happ/proxyutility/ui/BaseActivity;->u()I

    .line 1099
    .line 1100
    .line 1101
    move-result v13

    .line 1102
    add-int/2addr v13, v12

    .line 1103
    iput v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1104
    .line 1105
    :cond_5
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1106
    .line 1107
    if-eqz v0, :cond_26

    .line 1108
    .line 1109
    iget-object v0, v0, Lb6;->E0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1110
    .line 1111
    new-instance v12, Lpj4;

    .line 1112
    .line 1113
    const/16 v13, 0x9

    .line 1114
    .line 1115
    invoke-direct {v12, v1, v13}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1119
    .line 1120
    .line 1121
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1122
    .line 1123
    if-eqz v0, :cond_25

    .line 1124
    .line 1125
    iget-object v0, v0, Lb6;->C0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1126
    .line 1127
    new-instance v12, Lpj4;

    .line 1128
    .line 1129
    const/16 v15, 0xa

    .line 1130
    .line 1131
    invoke-direct {v12, v1, v15}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1135
    .line 1136
    .line 1137
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1138
    .line 1139
    if-eqz v0, :cond_24

    .line 1140
    .line 1141
    iget-object v0, v0, Lb6;->n0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1142
    .line 1143
    new-instance v12, Lpj4;

    .line 1144
    .line 1145
    const/16 v15, 0xb

    .line 1146
    .line 1147
    invoke-direct {v12, v1, v15}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1151
    .line 1152
    .line 1153
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1154
    .line 1155
    if-eqz v0, :cond_23

    .line 1156
    .line 1157
    iget-object v0, v0, Lb6;->f0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1158
    .line 1159
    new-instance v12, Lpj4;

    .line 1160
    .line 1161
    const/16 v15, 0xc

    .line 1162
    .line 1163
    invoke-direct {v12, v1, v15}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1167
    .line 1168
    .line 1169
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1170
    .line 1171
    if-eqz v0, :cond_22

    .line 1172
    .line 1173
    iget-object v0, v0, Lb6;->h0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1174
    .line 1175
    new-instance v12, Lpj4;

    .line 1176
    .line 1177
    invoke-direct {v12, v1, v14}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1181
    .line 1182
    .line 1183
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1184
    .line 1185
    if-eqz v0, :cond_21

    .line 1186
    .line 1187
    iget-object v0, v0, Lb6;->g0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1188
    .line 1189
    new-instance v12, Lpj4;

    .line 1190
    .line 1191
    invoke-direct {v12, v1, v8}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1195
    .line 1196
    .line 1197
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1198
    .line 1199
    if-eqz v0, :cond_20

    .line 1200
    .line 1201
    iget-object v0, v0, Lb6;->i0:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedImageButton;

    .line 1202
    .line 1203
    new-instance v8, Lpj4;

    .line 1204
    .line 1205
    const/16 v12, 0xf

    .line 1206
    .line 1207
    invoke-direct {v8, v1, v12}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v0, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1211
    .line 1212
    .line 1213
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1214
    .line 1215
    if-eqz v0, :cond_1f

    .line 1216
    .line 1217
    iget-object v0, v0, Lb6;->i0:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedImageButton;

    .line 1218
    .line 1219
    new-instance v8, Lvw1;

    .line 1220
    .line 1221
    invoke-direct {v8, v1, v2}, Lvw1;-><init>(Ljava/lang/Object;B)V

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v0, v8}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1225
    .line 1226
    .line 1227
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1228
    .line 1229
    if-eqz v0, :cond_1e

    .line 1230
    .line 1231
    iget-object v0, v0, Lb6;->w0:Landroid/widget/RelativeLayout;

    .line 1232
    .line 1233
    if-eqz v0, :cond_6

    .line 1234
    .line 1235
    new-instance v8, Lpj4;

    .line 1236
    .line 1237
    invoke-direct {v8, v1, v5}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v0, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1241
    .line 1242
    .line 1243
    :cond_6
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1244
    .line 1245
    if-eqz v0, :cond_1d

    .line 1246
    .line 1247
    iget-object v8, v0, Lb6;->L0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 1248
    .line 1249
    if-eqz v8, :cond_7

    .line 1250
    .line 1251
    goto :goto_2

    .line 1252
    :cond_7
    iget-object v8, v0, Lb6;->o0:Landroidx/appcompat/widget/AppCompatButton;

    .line 1253
    .line 1254
    :goto_2
    if-eqz v8, :cond_8

    .line 1255
    .line 1256
    new-instance v0, Lpj4;

    .line 1257
    .line 1258
    invoke-direct {v0, v1, v2}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1262
    .line 1263
    .line 1264
    :cond_8
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1265
    .line 1266
    if-eqz v0, :cond_1c

    .line 1267
    .line 1268
    iget-object v0, v0, Lb6;->q0:Landroidx/cardview/widget/CardView;

    .line 1269
    .line 1270
    new-instance v8, Lpj4;

    .line 1271
    .line 1272
    invoke-direct {v8, v1, v9}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v0, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1276
    .line 1277
    .line 1278
    invoke-static {v1}, Lue3;->y(Landroid/content/Context;)Z

    .line 1279
    .line 1280
    .line 1281
    move-result v0

    .line 1282
    if-nez v0, :cond_a

    .line 1283
    .line 1284
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1285
    .line 1286
    if-eqz v0, :cond_9

    .line 1287
    .line 1288
    iget-object v0, v0, Lb6;->A0:Landroid/view/View;

    .line 1289
    .line 1290
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 1291
    .line 1292
    new-instance v8, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1293
    .line 1294
    invoke-direct {v8, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/j;)V

    .line 1298
    .line 1299
    .line 1300
    goto :goto_3

    .line 1301
    :cond_9
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    throw v4

    .line 1305
    :cond_a
    :goto_3
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1306
    .line 1307
    if-eqz v0, :cond_1b

    .line 1308
    .line 1309
    iget-object v0, v0, Lb6;->A0:Landroid/view/View;

    .line 1310
    .line 1311
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 1312
    .line 1313
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->F()Ldw7;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v2

    .line 1317
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/f;)V

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->F()Ldw7;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v0

    .line 1324
    iget-object v2, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->T0:Lvz7;

    .line 1325
    .line 1326
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v2

    .line 1330
    check-cast v2, Lvj4;

    .line 1331
    .line 1332
    iput-object v2, v0, Ldw7;->l:Lvj4;

    .line 1333
    .line 1334
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->F()Ldw7;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v0

    .line 1338
    iput-object v1, v0, Ldw7;->m:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 1339
    .line 1340
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->F()Ldw7;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v0

    .line 1344
    invoke-virtual {v6}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v2

    .line 1348
    check-cast v2, Lck4;

    .line 1349
    .line 1350
    iput-object v2, v0, Ldw7;->n:Lck4;

    .line 1351
    .line 1352
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1353
    .line 1354
    if-eqz v0, :cond_1a

    .line 1355
    .line 1356
    iget-object v0, v0, Lb6;->Z:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedTextButton;

    .line 1357
    .line 1358
    if-eqz v0, :cond_b

    .line 1359
    .line 1360
    new-instance v2, Lpj4;

    .line 1361
    .line 1362
    invoke-direct {v2, v1, v10}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1366
    .line 1367
    .line 1368
    :cond_b
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1369
    .line 1370
    if-eqz v0, :cond_19

    .line 1371
    .line 1372
    iget-object v0, v0, Lb6;->m0:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedTextButton;

    .line 1373
    .line 1374
    if-eqz v0, :cond_c

    .line 1375
    .line 1376
    new-instance v2, Lpj4;

    .line 1377
    .line 1378
    invoke-direct {v2, v1, v11}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1382
    .line 1383
    .line 1384
    :cond_c
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1385
    .line 1386
    if-eqz v0, :cond_18

    .line 1387
    .line 1388
    iget-object v0, v0, Lb6;->Y:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedTextButton;

    .line 1389
    .line 1390
    new-instance v2, Lpj4;

    .line 1391
    .line 1392
    const/4 v6, 0x5

    .line 1393
    invoke-direct {v2, v1, v6}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1397
    .line 1398
    .line 1399
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1400
    .line 1401
    if-eqz v0, :cond_17

    .line 1402
    .line 1403
    iget-object v0, v0, Lb6;->t0:Landroid/widget/RelativeLayout;

    .line 1404
    .line 1405
    const/4 v2, 0x6

    .line 1406
    if-eqz v0, :cond_d

    .line 1407
    .line 1408
    new-instance v8, Lpj4;

    .line 1409
    .line 1410
    invoke-direct {v8, v1, v2}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v0, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1414
    .line 1415
    .line 1416
    :cond_d
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1417
    .line 1418
    if-eqz v0, :cond_16

    .line 1419
    .line 1420
    iget-object v0, v0, Lb6;->I0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 1421
    .line 1422
    const/4 v8, 0x7

    .line 1423
    if-eqz v0, :cond_e

    .line 1424
    .line 1425
    new-instance v11, Lpj4;

    .line 1426
    .line 1427
    invoke-direct {v11, v1, v8}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v0, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1431
    .line 1432
    .line 1433
    :cond_e
    invoke-static {}, Lss8;->t()Z

    .line 1434
    .line 1435
    .line 1436
    move-result v0

    .line 1437
    if-eqz v0, :cond_10

    .line 1438
    .line 1439
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1440
    .line 1441
    if-eqz v0, :cond_f

    .line 1442
    .line 1443
    iget-object v0, v0, Lb6;->D0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 1444
    .line 1445
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1446
    .line 1447
    .line 1448
    goto :goto_4

    .line 1449
    :cond_f
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1450
    .line 1451
    .line 1452
    throw v4

    .line 1453
    :cond_10
    :goto_4
    new-instance v0, Ly42;

    .line 1454
    .line 1455
    iget-object v5, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1456
    .line 1457
    if-eqz v5, :cond_15

    .line 1458
    .line 1459
    iget-object v5, v5, Lb6;->A0:Landroid/view/View;

    .line 1460
    .line 1461
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 1462
    .line 1463
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->F()Ldw7;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v11

    .line 1467
    invoke-direct {v0, v5, v11}, Ly42;-><init>(Landroidx/recyclerview/widget/RecyclerView;Ldw7;)V

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v0

    .line 1474
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1475
    .line 1476
    .line 1477
    invoke-virtual {v1, v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->I(Landroid/content/Intent;)V

    .line 1478
    .line 1479
    .line 1480
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1481
    .line 1482
    if-eqz v0, :cond_14

    .line 1483
    .line 1484
    iget-object v0, v0, Lb6;->K0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 1485
    .line 1486
    sget v5, Ly46;->your_hwid:I

    .line 1487
    .line 1488
    invoke-static {v1}, Lss8;->j(Landroid/content/Context;)Ljava/lang/String;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v11

    .line 1492
    new-instance v12, Lsu/happ/proxyutility/dto/HWID;

    .line 1493
    .line 1494
    invoke-direct {v12, v11}, Lsu/happ/proxyutility/dto/HWID;-><init>(Ljava/lang/String;)V

    .line 1495
    .line 1496
    .line 1497
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v11

    .line 1501
    invoke-virtual {v1, v5, v11}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v5

    .line 1505
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1506
    .line 1507
    .line 1508
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1509
    .line 1510
    if-eqz v0, :cond_13

    .line 1511
    .line 1512
    iget-object v0, v0, Lb6;->y0:Landroid/widget/LinearLayout;

    .line 1513
    .line 1514
    new-instance v5, Lpj4;

    .line 1515
    .line 1516
    const/16 v11, 0x8

    .line 1517
    .line 1518
    invoke-direct {v5, v1, v11}, Lpj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 1519
    .line 1520
    .line 1521
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1522
    .line 1523
    .line 1524
    iget-object v0, v1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 1525
    .line 1526
    if-eqz v0, :cond_12

    .line 1527
    .line 1528
    iget-object v0, v0, Lb6;->A0:Landroid/view/View;

    .line 1529
    .line 1530
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 1531
    .line 1532
    new-instance v5, Lwk4;

    .line 1533
    .line 1534
    invoke-direct {v5, v1}, Lwk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;)V

    .line 1535
    .line 1536
    .line 1537
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->setEdgeEffectFactory(Lc96;)V

    .line 1538
    .line 1539
    .line 1540
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v0

    .line 1544
    new-instance v5, Lwj4;

    .line 1545
    .line 1546
    invoke-direct {v5, v1, v4, v6}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 1547
    .line 1548
    .line 1549
    invoke-static {v0, v4, v5, v10}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 1550
    .line 1551
    .line 1552
    :try_start_1
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v0

    .line 1556
    new-instance v5, Lwj4;

    .line 1557
    .line 1558
    invoke-direct {v5, v1, v4, v2}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 1559
    .line 1560
    .line 1561
    invoke-static {v0, v4, v5, v10}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1562
    .line 1563
    .line 1564
    goto :goto_5

    .line 1565
    :catchall_1
    move-exception v0

    .line 1566
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 1567
    .line 1568
    if-nez v2, :cond_11

    .line 1569
    .line 1570
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 1571
    .line 1572
    if-nez v2, :cond_11

    .line 1573
    .line 1574
    :goto_5
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v0

    .line 1578
    new-instance v2, Lwj4;

    .line 1579
    .line 1580
    invoke-direct {v2, v1, v4, v8}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 1581
    .line 1582
    .line 1583
    invoke-static {v0, v4, v2, v10}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 1584
    .line 1585
    .line 1586
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v0

    .line 1590
    new-instance v2, Lwj4;

    .line 1591
    .line 1592
    invoke-direct {v2, v1, v4, v13}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 1593
    .line 1594
    .line 1595
    invoke-static {v0, v4, v2, v10}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 1596
    .line 1597
    .line 1598
    invoke-static {v3}, Lys0;->z(Lg94;)Lu84;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v0

    .line 1602
    sget-object v2, Lye1;->Z:Lye1;

    .line 1603
    .line 1604
    new-instance v3, Lwj4;

    .line 1605
    .line 1606
    const/16 v5, 0xa

    .line 1607
    .line 1608
    invoke-direct {v3, v1, v4, v5}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 1609
    .line 1610
    .line 1611
    invoke-static {v0, v2, v3, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 1612
    .line 1613
    .line 1614
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 1615
    .line 1616
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v0

    .line 1620
    iget-object v0, v0, Lsu/happ/proxyutility/HappApplication;->x0:Lvz7;

    .line 1621
    .line 1622
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v0

    .line 1626
    check-cast v0, Lvr1;

    .line 1627
    .line 1628
    iget-object v0, v0, Lvr1;->f:Lp91;

    .line 1629
    .line 1630
    invoke-virtual {v0}, Lp91;->i()Ljava/util/List;

    .line 1631
    .line 1632
    .line 1633
    return-void

    .line 1634
    :cond_11
    throw v0

    .line 1635
    :cond_12
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1636
    .line 1637
    .line 1638
    throw v4

    .line 1639
    :cond_13
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1640
    .line 1641
    .line 1642
    throw v4

    .line 1643
    :cond_14
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1644
    .line 1645
    .line 1646
    throw v4

    .line 1647
    :cond_15
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1648
    .line 1649
    .line 1650
    throw v4

    .line 1651
    :cond_16
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1652
    .line 1653
    .line 1654
    throw v4

    .line 1655
    :cond_17
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1656
    .line 1657
    .line 1658
    throw v4

    .line 1659
    :cond_18
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1660
    .line 1661
    .line 1662
    throw v4

    .line 1663
    :cond_19
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1664
    .line 1665
    .line 1666
    throw v4

    .line 1667
    :cond_1a
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1668
    .line 1669
    .line 1670
    throw v4

    .line 1671
    :cond_1b
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1672
    .line 1673
    .line 1674
    throw v4

    .line 1675
    :cond_1c
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1676
    .line 1677
    .line 1678
    throw v4

    .line 1679
    :cond_1d
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1680
    .line 1681
    .line 1682
    throw v4

    .line 1683
    :cond_1e
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1684
    .line 1685
    .line 1686
    throw v4

    .line 1687
    :cond_1f
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1688
    .line 1689
    .line 1690
    throw v4

    .line 1691
    :cond_20
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1692
    .line 1693
    .line 1694
    throw v4

    .line 1695
    :cond_21
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1696
    .line 1697
    .line 1698
    throw v4

    .line 1699
    :cond_22
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1700
    .line 1701
    .line 1702
    throw v4

    .line 1703
    :cond_23
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1704
    .line 1705
    .line 1706
    throw v4

    .line 1707
    :cond_24
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1708
    .line 1709
    .line 1710
    throw v4

    .line 1711
    :cond_25
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1712
    .line 1713
    .line 1714
    throw v4

    .line 1715
    :cond_26
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1716
    .line 1717
    .line 1718
    throw v4

    .line 1719
    :cond_27
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1720
    .line 1721
    .line 1722
    throw v4

    .line 1723
    :cond_28
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 1724
    .line 1725
    .line 1726
    throw v4

    .line 1727
    :cond_29
    throw v0

    .line 1728
    :cond_2a
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v0

    .line 1732
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v0

    .line 1736
    const-string v1, "Missing required view with ID: "

    .line 1737
    .line 1738
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v0

    .line 1742
    invoke-static {v0}, Lb61;->i(Ljava/lang/String;)V

    .line 1743
    .line 1744
    .line 1745
    return-void
.end method

.method public final onDestroy()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->r1:Lvz7;

    .line 5
    .line 6
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 11
    .line 12
    iget-object v1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->t1:Lvz7;

    .line 13
    .line 14
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lyj4;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    :goto_0
    sget-object v0, Lwu7;->y1:Lcom/google/gson/a;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object v0, Lwu7;->z1:Lm51;

    .line 40
    .line 41
    new-instance v1, Ll40;

    .line 42
    .line 43
    const/16 v2, 0xf

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-direct {v1, p0, v3, v2}, Ll40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x3

    .line 50
    invoke-static {v0, v3, v1, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    throw v0
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->I(Landroid/content/Intent;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onResume()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super {v0}, Lsu/happ/proxyutility/ui/BaseActivity;->onResume()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->A()V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x3

    .line 15
    invoke-static {v1, v2, v3}, Lsu/happ/proxyutility/feature/main/MainViewModel;->C(Lsu/happ/proxyutility/feature/main/MainViewModel;ZI)V

    .line 16
    .line 17
    .line 18
    new-instance v4, Ly65;

    .line 19
    .line 20
    invoke-direct {v4, v0}, Ly65;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iget-object v4, v4, Ly65;->b:Landroid/app/NotificationManager;

    .line 24
    .line 25
    invoke-virtual {v4}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 26
    .line 27
    .line 28
    move-result v16

    .line 29
    iget-object v1, v1, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    move-object v5, v4

    .line 36
    check-cast v5, Lxm4;

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/16 v22, 0x0

    .line 42
    .line 43
    const v23, 0xfdff

    .line 44
    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    const-wide/16 v7, 0x0

    .line 48
    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    const/4 v11, 0x0

    .line 52
    const/4 v12, 0x0

    .line 53
    const/4 v13, 0x0

    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    const/16 v17, 0x0

    .line 57
    .line 58
    const/16 v18, 0x0

    .line 59
    .line 60
    const/16 v19, 0x0

    .line 61
    .line 62
    const/16 v20, 0x0

    .line 63
    .line 64
    const/16 v21, 0x0

    .line 65
    .line 66
    invoke-static/range {v5 .. v23}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v1, v4, v5}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_0

    .line 75
    .line 76
    const-string v1, ""

    .line 77
    .line 78
    const-string v4, "su.happ.proxyutility.action.service"

    .line 79
    .line 80
    const/16 v5, 0x9

    .line 81
    .line 82
    invoke-static {v0, v4, v5, v1}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1}, Lzw8;->a(Lxw8;)Ltu0;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    new-instance v5, Lxn4;

    .line 94
    .line 95
    const/4 v6, 0x0

    .line 96
    invoke-direct {v5, v1, v6, v2}, Lxn4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {v4, v6, v5, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 100
    .line 101
    .line 102
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->k1:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_1

    .line 109
    .line 110
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-static {v1, v2, v3}, Lsu/happ/proxyutility/feature/main/MainViewModel;->C(Lsu/happ/proxyutility/feature/main/MainViewModel;ZI)V

    .line 115
    .line 116
    .line 117
    :cond_1
    iget-object v1, v0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 118
    .line 119
    invoke-static {v1}, Lys0;->z(Lg94;)Lu84;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    sget-object v2, Ltp1;->a:Lnf1;

    .line 124
    .line 125
    sget-object v2, Lye1;->Z:Lye1;

    .line 126
    .line 127
    new-instance v3, Lak4;

    .line 128
    .line 129
    invoke-direct {v3, v0, v6}, Lak4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;)V

    .line 130
    .line 131
    .line 132
    const/4 v0, 0x2

    .line 133
    invoke-static {v1, v2, v3, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public final onStart()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lho4;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, v3, v2}, Lho4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x3

    .line 20
    invoke-static {v0, v3, v1, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final z()Ljava/util/Set;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-nez p0, :cond_1

    .line 18
    .line 19
    sget-object p0, Lm02;->X:Lm02;

    .line 20
    .line 21
    :cond_1
    return-object p0
.end method
