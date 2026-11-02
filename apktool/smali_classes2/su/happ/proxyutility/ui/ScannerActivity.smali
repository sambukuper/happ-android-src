.class public final Lsu/happ/proxyutility/ui/ScannerActivity;
.super Lsu/happ/proxyutility/ui/BaseActivity;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lsu/happ/proxyutility/ui/ScannerActivity;",
        "Lsu/happ/proxyutility/ui/BaseActivity;",
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
.field public static final synthetic T0:I


# instance fields
.field public Q0:Llr;

.field public R0:Lzo0;

.field public final S0:Lr6;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lsu/happ/proxyutility/ui/BaseActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ln6;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ln6;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lo61;

    .line 11
    .line 12
    const/16 v2, 0x18

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, Lo61;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1, v0}, Landroidx/activity/ComponentActivity;->m(Lj6;Lyn0;)Lr6;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->S0:Lr6;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final A(Lxu5;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->Q0:Llr;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_c

    .line 5
    .line 6
    iget-object v0, v0, Llr;->f0:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/camera/view/PreviewView;

    .line 9
    .line 10
    sget-object v2, Lst5;->Y:Lst5;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroidx/camera/view/PreviewView;->setImplementationMode(Lst5;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lh53;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-direct {v0, v2}, Lh53;-><init>(B)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lmt5;

    .line 22
    .line 23
    iget-object v0, v0, Lh53;->Y:Lk05;

    .line 24
    .line 25
    invoke-static {v0}, Lqd5;->c(Ll11;)Lqd5;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {v3, v0}, Lmt5;-><init>(Lqd5;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v3}, Li63;->G(Li63;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Llt5;

    .line 36
    .line 37
    invoke-direct {v0, v3}, Lhq8;-><init>(Ler8;)V

    .line 38
    .line 39
    .line 40
    sget-object v3, Llt5;->y:Ljava/util/concurrent/ScheduledExecutorService;

    .line 41
    .line 42
    iput-object v3, v0, Llt5;->r:Ljava/util/concurrent/Executor;

    .line 43
    .line 44
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v4, Li84;

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    invoke-direct {v4, v5}, Li84;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    new-instance v4, Llk0;

    .line 59
    .line 60
    invoke-direct {v4, v3}, Llk0;-><init>(Ljava/util/LinkedHashSet;)V

    .line 61
    .line 62
    .line 63
    iget-object v3, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->Q0:Llr;

    .line 64
    .line 65
    if-eqz v3, :cond_b

    .line 66
    .line 67
    iget-object v3, v3, Llr;->f0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Landroidx/camera/view/PreviewView;

    .line 70
    .line 71
    invoke-virtual {v3}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()Lkt5;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v0, v3}, Llt5;->J(Lkt5;)V

    .line 76
    .line 77
    .line 78
    new-instance v3, Lh53;

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    invoke-direct {v3, v6}, Lh53;-><init>(B)V

    .line 82
    .line 83
    .line 84
    sget-object v7, Lpz2;->t0:Lpz2;

    .line 85
    .line 86
    new-instance v8, Lff6;

    .line 87
    .line 88
    new-instance v9, Landroid/util/Size;

    .line 89
    .line 90
    const/16 v10, 0x500

    .line 91
    .line 92
    const/16 v11, 0x2d0

    .line 93
    .line 94
    invoke-direct {v9, v10, v11}, Landroid/util/Size;-><init>(II)V

    .line 95
    .line 96
    .line 97
    invoke-direct {v8, v9}, Lff6;-><init>(Landroid/util/Size;)V

    .line 98
    .line 99
    .line 100
    new-instance v9, Lef6;

    .line 101
    .line 102
    invoke-direct {v9, v7, v8}, Lef6;-><init>(Lpz2;Lff6;)V

    .line 103
    .line 104
    .line 105
    iget-object v7, v3, Lh53;->Y:Lk05;

    .line 106
    .line 107
    sget-object v8, Li63;->A:Lzx;

    .line 108
    .line 109
    invoke-virtual {v7, v8, v9}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v7, v3, Lh53;->Y:Lk05;

    .line 113
    .line 114
    sget-object v8, Lo53;->Y:Lzx;

    .line 115
    .line 116
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    invoke-virtual {v7, v8, v9}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    new-instance v7, Lo53;

    .line 124
    .line 125
    iget-object v3, v3, Lh53;->Y:Lk05;

    .line 126
    .line 127
    invoke-static {v3}, Lqd5;->c(Ll11;)Lqd5;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-direct {v7, v3}, Lo53;-><init>(Lqd5;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v7}, Li63;->G(Li63;)V

    .line 135
    .line 136
    .line 137
    new-instance v3, Lk53;

    .line 138
    .line 139
    invoke-direct {v3, v7}, Lk53;-><init>(Lo53;)V

    .line 140
    .line 141
    .line 142
    invoke-static {p0}, Lw79;->y(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    new-instance v8, Lzz2;

    .line 147
    .line 148
    new-instance v9, Llr5;

    .line 149
    .line 150
    const/16 v10, 0xa

    .line 151
    .line 152
    invoke-direct {v9, p0, v10}, Llr5;-><init>(Ljava/lang/Object;B)V

    .line 153
    .line 154
    .line 155
    invoke-direct {v8, v9}, Lzz2;-><init>(Llr5;)V

    .line 156
    .line 157
    .line 158
    iget-object v9, v3, Lk53;->q:Ljava/lang/Object;

    .line 159
    .line 160
    monitor-enter v9

    .line 161
    :try_start_0
    iget-object v11, v3, Lk53;->r:Lm53;

    .line 162
    .line 163
    if-eqz v11, :cond_0

    .line 164
    .line 165
    new-instance v12, Lo61;

    .line 166
    .line 167
    invoke-direct {v12, v8, v10}, Lo61;-><init>(Ljava/lang/Object;B)V

    .line 168
    .line 169
    .line 170
    iget-object v13, v11, Lm53;->v0:Ljava/lang/Object;

    .line 171
    .line 172
    monitor-enter v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 173
    :try_start_1
    iput-object v12, v11, Lm53;->X:Lf53;

    .line 174
    .line 175
    iput-object v7, v11, Lm53;->i0:Ljava/util/concurrent/Executor;

    .line 176
    .line 177
    monitor-exit v13

    .line 178
    goto :goto_0

    .line 179
    :catchall_0
    move-exception p0

    .line 180
    monitor-exit v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    :try_start_2
    throw p0

    .line 182
    :catchall_1
    move-exception p0

    .line 183
    goto/16 :goto_5

    .line 184
    .line 185
    :cond_0
    :goto_0
    iget-object v11, v3, Lk53;->t:Lzz2;

    .line 186
    .line 187
    if-nez v11, :cond_1

    .line 188
    .line 189
    invoke-virtual {v3}, Lhq8;->q()V

    .line 190
    .line 191
    .line 192
    :cond_1
    iput-object v7, v3, Lk53;->s:Ljava/util/concurrent/Executor;

    .line 193
    .line 194
    iput-object v8, v3, Lk53;->t:Lzz2;

    .line 195
    .line 196
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 197
    :try_start_3
    new-array v7, v2, [Lhq8;

    .line 198
    .line 199
    aput-object v0, v7, v6

    .line 200
    .line 201
    aput-object v3, v7, v5

    .line 202
    .line 203
    invoke-virtual {p1, p0, v4, v7}, Lxu5;->a(Lsu/happ/proxyutility/ui/ScannerActivity;Llk0;[Lhq8;)Lp84;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    iget-object v0, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->Q0:Llr;

    .line 208
    .line 209
    if-eqz v0, :cond_7

    .line 210
    .line 211
    iget-object v0, v0, Llr;->Z:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, Lsu/happ/proxyutility/ui/widget/QROverlayView;

    .line 214
    .line 215
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 216
    .line 217
    .line 218
    iget-object v0, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->Q0:Llr;

    .line 219
    .line 220
    if-eqz v0, :cond_6

    .line 221
    .line 222
    iget-object v0, v0, Llr;->Z:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Lsu/happ/proxyutility/ui/widget/QROverlayView;

    .line 225
    .line 226
    new-instance v3, Ltw6;

    .line 227
    .line 228
    invoke-direct {v3, p0, v6}, Ltw6;-><init>(Lsu/happ/proxyutility/ui/ScannerActivity;B)V

    .line 229
    .line 230
    .line 231
    iget-object v0, v0, Lsu/happ/proxyutility/ui/widget/QROverlayView;->f0:Lyr6;

    .line 232
    .line 233
    iget-object v4, v0, Lyr6;->Z:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v4, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 236
    .line 237
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 238
    .line 239
    .line 240
    iget-object v0, v0, Lyr6;->Z:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 243
    .line 244
    new-instance v4, Lst0;

    .line 245
    .line 246
    const/16 v7, 0xd

    .line 247
    .line 248
    invoke-direct {v4, v3, v7}, Lst0;-><init>(Ljava/lang/Object;B)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1}, Lp84;->c()Lxi0;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, La7;

    .line 259
    .line 260
    iget-object v0, v0, La7;->Y:Laj0;

    .line 261
    .line 262
    invoke-interface {v0}, Lxi0;->q()Z

    .line 263
    .line 264
    .line 265
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 266
    iget-object v3, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->Q0:Llr;

    .line 267
    .line 268
    const/16 v4, 0xe

    .line 269
    .line 270
    if-eqz v0, :cond_3

    .line 271
    .line 272
    if-eqz v3, :cond_2

    .line 273
    .line 274
    :try_start_4
    iget-object v0, v3, Llr;->Z:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, Lsu/happ/proxyutility/ui/widget/QROverlayView;

    .line 277
    .line 278
    new-instance v3, Lt16;

    .line 279
    .line 280
    invoke-direct {v3, p1, v10}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 281
    .line 282
    .line 283
    iget-object v0, v0, Lsu/happ/proxyutility/ui/widget/QROverlayView;->f0:Lyr6;

    .line 284
    .line 285
    iget-object v7, v0, Lyr6;->g0:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v7, Lcom/google/android/material/button/MaterialButton;

    .line 288
    .line 289
    invoke-virtual {v7, v6}, Landroid/view/View;->setVisibility(I)V

    .line 290
    .line 291
    .line 292
    iget-object v0, v0, Lyr6;->g0:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 295
    .line 296
    new-instance v7, Lst0;

    .line 297
    .line 298
    invoke-direct {v7, v3, v4}, Lst0;-><init>(Ljava/lang/Object;B)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1}, Lp84;->c()Lxi0;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    check-cast p1, La7;

    .line 309
    .line 310
    iget-object p1, p1, La7;->Y:Laj0;

    .line 311
    .line 312
    invoke-interface {p1}, Lxi0;->f()Lqc4;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    new-instance v0, Lt16;

    .line 317
    .line 318
    const/16 v3, 0xb

    .line 319
    .line 320
    invoke-direct {v0, p0, v3}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 321
    .line 322
    .line 323
    new-instance v3, Lbm4;

    .line 324
    .line 325
    invoke-direct {v3, v0, v2}, Lbm4;-><init>(Lgn2;B)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1, p0, v3}, Lqc4;->e(Lsu/happ/proxyutility/ui/BaseActivity;Lv85;)V

    .line 329
    .line 330
    .line 331
    goto :goto_1

    .line 332
    :catchall_2
    move-exception p1

    .line 333
    goto :goto_2

    .line 334
    :cond_2
    const-string p1, "binding"

    .line 335
    .line 336
    invoke-static {p1}, Ldh3;->T(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    throw v1

    .line 340
    :cond_3
    if-eqz v3, :cond_5

    .line 341
    .line 342
    iget-object p1, v3, Llr;->Z:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast p1, Lsu/happ/proxyutility/ui/widget/QROverlayView;

    .line 345
    .line 346
    new-instance v0, Lzw5;

    .line 347
    .line 348
    const/4 v2, 0x7

    .line 349
    invoke-direct {v0, v2}, Lzw5;-><init>(B)V

    .line 350
    .line 351
    .line 352
    iget-object p1, p1, Lsu/happ/proxyutility/ui/widget/QROverlayView;->f0:Lyr6;

    .line 353
    .line 354
    iget-object v2, p1, Lyr6;->g0:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v2, Lcom/google/android/material/button/MaterialButton;

    .line 357
    .line 358
    const/16 v3, 0x8

    .line 359
    .line 360
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 361
    .line 362
    .line 363
    iget-object p1, p1, Lyr6;->g0:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 366
    .line 367
    new-instance v2, Lst0;

    .line 368
    .line 369
    invoke-direct {v2, v0, v4}, Lst0;-><init>(Ljava/lang/Object;B)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 373
    .line 374
    .line 375
    :goto_1
    iget-object p1, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->Q0:Llr;

    .line 376
    .line 377
    if-eqz p1, :cond_4

    .line 378
    .line 379
    iget-object p1, p1, Llr;->Z:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast p1, Lsu/happ/proxyutility/ui/widget/QROverlayView;

    .line 382
    .line 383
    new-instance v0, Ltw6;

    .line 384
    .line 385
    invoke-direct {v0, p0, v5}, Ltw6;-><init>(Lsu/happ/proxyutility/ui/ScannerActivity;B)V

    .line 386
    .line 387
    .line 388
    iget-object p1, p1, Lsu/happ/proxyutility/ui/widget/QROverlayView;->f0:Lyr6;

    .line 389
    .line 390
    iget-object v2, p1, Lyr6;->f0:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v2, Lcom/google/android/material/button/MaterialButton;

    .line 393
    .line 394
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 395
    .line 396
    .line 397
    iget-object p1, p1, Lyr6;->f0:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 400
    .line 401
    new-instance v2, Lst0;

    .line 402
    .line 403
    const/16 v3, 0xf

    .line 404
    .line 405
    invoke-direct {v2, v0, v3}, Lst0;-><init>(Ljava/lang/Object;B)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 409
    .line 410
    .line 411
    sget-object p1, Ldn8;->a:Ldn8;

    .line 412
    .line 413
    goto :goto_3

    .line 414
    :cond_4
    const-string p1, "binding"

    .line 415
    .line 416
    invoke-static {p1}, Ldh3;->T(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    throw v1

    .line 420
    :cond_5
    const-string p1, "binding"

    .line 421
    .line 422
    invoke-static {p1}, Ldh3;->T(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    throw v1

    .line 426
    :cond_6
    const-string p1, "binding"

    .line 427
    .line 428
    invoke-static {p1}, Ldh3;->T(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    throw v1

    .line 432
    :cond_7
    const-string p1, "binding"

    .line 433
    .line 434
    invoke-static {p1}, Ldh3;->T(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 438
    :goto_2
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 439
    .line 440
    if-nez v0, :cond_a

    .line 441
    .line 442
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 443
    .line 444
    if-nez v0, :cond_a

    .line 445
    .line 446
    new-instance v0, Lrj6;

    .line 447
    .line 448
    invoke-direct {v0, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 449
    .line 450
    .line 451
    move-object p1, v0

    .line 452
    :goto_3
    invoke-static {p1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    if-eqz p1, :cond_9

    .line 457
    .line 458
    iget-object p1, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->Q0:Llr;

    .line 459
    .line 460
    if-eqz p1, :cond_8

    .line 461
    .line 462
    iget-object p1, p1, Llr;->Z:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast p1, Lsu/happ/proxyutility/ui/widget/QROverlayView;

    .line 465
    .line 466
    const/4 v0, 0x4

    .line 467
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 468
    .line 469
    .line 470
    sget p1, Ly46;->toast_camera_failure:I

    .line 471
    .line 472
    invoke-static {p0, p1}, Lx79;->h(Landroid/content/Context;I)V

    .line 473
    .line 474
    .line 475
    goto :goto_4

    .line 476
    :cond_8
    const-string p0, "binding"

    .line 477
    .line 478
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    throw v1

    .line 482
    :cond_9
    :goto_4
    return-void

    .line 483
    :cond_a
    throw p1

    .line 484
    :goto_5
    :try_start_5
    monitor-exit v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 485
    throw p0

    .line 486
    :cond_b
    const-string p0, "binding"

    .line 487
    .line 488
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    throw v1

    .line 492
    :cond_c
    const-string p0, "binding"

    .line 493
    .line 494
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    throw v1
.end method

.method public final B(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "SCAN_RESULT"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, -0x1

    .line 13
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Lsu/happ/proxyutility/ui/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget v0, Lt46;->activity_scanner:I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget v0, Le46;->overlay_view:I

    .line 17
    .line 18
    invoke-static {p1, v0}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lsu/happ/proxyutility/ui/widget/QROverlayView;

    .line 23
    .line 24
    if-eqz v3, :cond_5

    .line 25
    .line 26
    sget v0, Le46;->preview_view:I

    .line 27
    .line 28
    invoke-static {p1, v0}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Landroidx/camera/view/PreviewView;

    .line 33
    .line 34
    if-eqz v4, :cond_5

    .line 35
    .line 36
    new-instance v0, Llr;

    .line 37
    .line 38
    check-cast p1, Landroid/widget/FrameLayout;

    .line 39
    .line 40
    const/4 v5, 0x5

    .line 41
    invoke-direct {v0, p1, v3, v4, v5}, Llr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->Q0:Llr;

    .line 45
    .line 46
    invoke-virtual {p0, v3}, Lsu/happ/proxyutility/ui/BaseActivity;->setBarsParams(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->Q0:Llr;

    .line 50
    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    iget-object p1, p1, Llr;->Y:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Landroid/widget/FrameLayout;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->Q0:Llr;

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    iget-object p1, p1, Llr;->Z:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lsu/happ/proxyutility/ui/widget/QROverlayView;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 76
    .line 77
    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 78
    .line 79
    invoke-virtual {p0}, Lsu/happ/proxyutility/ui/BaseActivity;->u()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    add-int/2addr v3, v0

    .line 84
    iput v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 85
    .line 86
    sget-object p1, Lxu5;->b:Lxu5;

    .line 87
    .line 88
    iget-object p1, p1, Lxu5;->a:Ld6;

    .line 89
    .line 90
    iget-object v0, p1, Ld6;->Y:Ljava/lang/Object;

    .line 91
    .line 92
    monitor-enter v0

    .line 93
    :try_start_0
    sget-object v3, Lo51;->a:Ljava/lang/Object;

    .line 94
    .line 95
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 96
    .line 97
    const/16 v4, 0x22

    .line 98
    .line 99
    if-lt v3, v4, :cond_0

    .line 100
    .line 101
    invoke-static {p0}, Lu3;->k(Landroid/content/Context;)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    move v3, v2

    .line 107
    :goto_0
    sget-object v4, Lr84;->a:Ljava/util/LinkedHashMap;

    .line 108
    .line 109
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 110
    :try_start_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    if-nez v5, :cond_1

    .line 119
    .line 120
    new-instance v5, Lt84;

    .line 121
    .line 122
    invoke-direct {v5}, Lt84;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :catchall_0
    move-exception p0

    .line 130
    goto/16 :goto_4

    .line 131
    .line 132
    :cond_1
    :goto_1
    check-cast v5, Lt84;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    .line 134
    :try_start_2
    monitor-exit v4

    .line 135
    iput-object v5, p1, Ld6;->j0:Ljava/lang/Object;

    .line 136
    .line 137
    iget-object v3, p1, Ld6;->g0:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, Lyo2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    .line 141
    const/16 v4, 0xd

    .line 142
    .line 143
    if-eqz v3, :cond_2

    .line 144
    .line 145
    :goto_2
    monitor-exit v0

    .line 146
    goto :goto_3

    .line 147
    :cond_2
    :try_start_3
    new-instance v3, Lzl0;

    .line 148
    .line 149
    invoke-direct {v3, p0, v1}, Lzl0;-><init>(Lsu/happ/proxyutility/ui/ScannerActivity;Lq84;)V

    .line 150
    .line 151
    .line 152
    iget-object v1, p1, Ld6;->h0:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v1, Lxb4;

    .line 155
    .line 156
    invoke-static {v1}, Lyo2;->b(Lxb4;)Lyo2;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    new-instance v5, Lvj2;

    .line 161
    .line 162
    const/16 v6, 0xf

    .line 163
    .line 164
    invoke-direct {v5, v3, v6}, Lvj2;-><init>(Ljava/lang/Object;B)V

    .line 165
    .line 166
    .line 167
    new-instance v6, Lo61;

    .line 168
    .line 169
    const/16 v7, 0xc

    .line 170
    .line 171
    invoke-direct {v6, v5, v7}, Lo61;-><init>(Ljava/lang/Object;B)V

    .line 172
    .line 173
    .line 174
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-static {v1, v6, v5}, Lvr3;->g0(Lxb4;Lvu;Ljava/util/concurrent/Executor;)Lzo0;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    new-instance v5, Lsn;

    .line 183
    .line 184
    invoke-direct {v5, p1, v3, p0, v7}, Lsn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 185
    .line 186
    .line 187
    new-instance v3, Lo61;

    .line 188
    .line 189
    invoke-direct {v3, v5, v4}, Lo61;-><init>(Ljava/lang/Object;B)V

    .line 190
    .line 191
    .line 192
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    new-instance v6, Lvk1;

    .line 197
    .line 198
    invoke-direct {v6, v3, v4}, Lvk1;-><init>(Ljava/lang/Object;B)V

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v6, v5}, Lvr3;->g0(Lxb4;Lvu;Ljava/util/concurrent/Executor;)Lzo0;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    iput-object v1, p1, Ld6;->g0:Ljava/lang/Object;

    .line 206
    .line 207
    new-instance v3, Lq02;

    .line 208
    .line 209
    const/16 v5, 0x10

    .line 210
    .line 211
    invoke-direct {v3, p1, v5}, Lq02;-><init>(Ljava/lang/Object;B)V

    .line 212
    .line 213
    .line 214
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    new-instance v5, Lzo2;

    .line 219
    .line 220
    invoke-direct {v5, v1, v3, v2}, Lzo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v5, p1}, Lyo2;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v1}, Lvr3;->P(Lxb4;)Lxb4;

    .line 227
    .line 228
    .line 229
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 230
    goto :goto_2

    .line 231
    :goto_3
    new-instance p1, Ldx4;

    .line 232
    .line 233
    const/16 v0, 0x1b

    .line 234
    .line 235
    invoke-direct {p1, v0}, Ldx4;-><init>(B)V

    .line 236
    .line 237
    .line 238
    new-instance v0, Lkp5;

    .line 239
    .line 240
    invoke-direct {v0, p1}, Lkp5;-><init>(Ldx4;)V

    .line 241
    .line 242
    .line 243
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    new-instance v1, Lvk1;

    .line 248
    .line 249
    invoke-direct {v1, v0, v4}, Lvk1;-><init>(Ljava/lang/Object;B)V

    .line 250
    .line 251
    .line 252
    invoke-static {v3, v1, p1}, Lvr3;->g0(Lxb4;Lvu;Ljava/util/concurrent/Executor;)Lzo0;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    iput-object p1, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->R0:Lzo0;

    .line 257
    .line 258
    new-instance v0, Lfl6;

    .line 259
    .line 260
    const/4 v1, 0x2

    .line 261
    invoke-direct {v0, p0, v1}, Lfl6;-><init>(Ljava/lang/Object;B)V

    .line 262
    .line 263
    .line 264
    invoke-static {p0}, Lw79;->y(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    invoke-virtual {p1, v0, p0}, Lyo2;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :catchall_1
    move-exception p0

    .line 273
    goto :goto_5

    .line 274
    :goto_4
    :try_start_4
    monitor-exit v4

    .line 275
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 276
    :goto_5
    monitor-exit v0

    .line 277
    throw p0

    .line 278
    :cond_3
    const-string p0, "binding"

    .line 279
    .line 280
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v1

    .line 284
    :cond_4
    const-string p0, "binding"

    .line 285
    .line 286
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw v1

    .line 290
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    const-string p1, "Missing required view with ID: "

    .line 299
    .line 300
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    invoke-static {p0}, Lb61;->i(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    return-void
.end method
